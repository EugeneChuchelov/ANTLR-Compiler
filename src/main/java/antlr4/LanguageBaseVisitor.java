package antlr4;// Generated from Language.g4 by ANTLR 4.9.3

import exceptions.SemanticException;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link LanguageVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class LanguageBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LanguageVisitor<T> {
    public static final String RELATE = "relate";
    public static final String FLOAT = "!";
    public static final String INT = "%";
    public static final String BOOL = "$";
    public static final String ADD = "add";
    public static final String MULT = "mult";
    public static final String UNARY = "unary";
    private final Map<String, String> identifiersTypes = new HashMap<>();

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitMultiplier(LanguageParser.MultiplierContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTerm(LanguageParser.TermContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitOperand(LanguageParser.OperandContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitExpression(LanguageParser.ExpressionContext ctx) {
        getExpressionType(ctx);
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitDescription(LanguageParser.DescriptionContext ctx) {
        ctx.Identificator().forEach(id -> {
            if (identifiersTypes.containsKey(id.getText())) {
                throw new SemanticException("Already defined '" + id.getText() + "' at line " + ctx.start.getLine());
            }
            identifiersTypes.put(id.getText(), ctx.Type().getText());
        });
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitOperator(LanguageParser.OperatorContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitComplex(LanguageParser.ComplexContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitAssignment(LanguageParser.AssignmentContext ctx) {
        String idType = identifiersTypes.get(ctx.Identificator().getText());
        String expType = getExpressionType(ctx.expression());
        if (!(idType.equals(expType) || (idType.equals(FLOAT) && expType.equals(INT)))) {
            throw new SemanticException("Types mismatch at line " + ctx.start.getLine());
        }
        return visitChildren(ctx);
    }

    private String getExpressionType(LanguageParser.ExpressionContext ctx) {
        Stack<String> typesStack = new Stack<>();
        getTypes(ctx, typesStack);
        while (typesStack.size() > 1) {
            String first = typesStack.pop();
            if (first.equals(UNARY)) {
                String second = typesStack.pop();
                if (!second.equals(BOOL)) {
                    throw new SemanticException("Types mismatch at line " + ctx.start.getLine());
                }
            } else {
                String op = typesStack.pop();
                String second = typesStack.pop();
                if (!isCompatible(first, op, second)) {
                    throw new SemanticException("Types mismatch at line " + ctx.start.getLine());
                } else {
                    typesStack.push(getResultType(first, op, second));
                }
            }
        }
        return typesStack.pop();
    }

    private boolean isCompatible(String first, String op, String second) {
        if (op.equals(RELATE)) {
            return !first.equals(BOOL) && !second.equals(BOOL);
        } else {
            return (first.equals(BOOL) && second.equals(BOOL)) || (!first.equals(BOOL) && !second.equals(BOOL));
        }
    }

    private String getResultType(String first, String op, String second) {
        if (op.equals(RELATE)) {
            return BOOL;
        } else {
            if (first.equals(INT) && second.equals(INT)) {
                return INT;
            } else {
                return FLOAT;
            }
        }
    }

    private void getTypes(ParseTree tree, Stack<String> types) {
        if (tree.getChildCount() == 0) {
            switch (((TerminalNode) tree).getSymbol().getType()) {
                case LanguageParser.Identificator:
                    String type = identifiersTypes.get(tree.getText());
                    if (type == null) {
                        throw new SemanticException("Using not defined '" + tree.getText() + "' at line " + ((TerminalNode) tree).getSymbol().getLine());
                    }
                    types.push(identifiersTypes.get(tree.getText()));
                    break;
                case LanguageParser.Number:
                    String number = tree.getText();
                    if (isReal(number)) {
                        types.push(FLOAT);
                    } else {
                        types.push(INT);
                    }
                    break;
                case LanguageParser.LogicalConstant:
                    types.push(BOOL);
                    break;
                case LanguageParser.AdditionOperator:
                    types.push(ADD);
                    break;
                case LanguageParser.MultiplicationOperator:
                    types.push(MULT);
                    break;
                case LanguageParser.RelationOperator:
                    types.push(RELATE);
                    break;
                case LanguageParser.UnaryOperator:
                    types.push(UNARY);
                    break;
            }
        } else {
            for (int i = 0; i < tree.getChildCount(); i++) {
                getTypes(tree.getChild(i), types);
            }
        }
    }


    private boolean isReal(String s) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.'
                    || ((s.charAt(i) == 'e' || s.charAt(i) == 'E')
                    && (s.charAt(s.length() - 1) != 'h' && s.charAt(s.length() - 1) != 'H'))) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCondition(LanguageParser.ConditionContext ctx) {
        String expType = getExpressionType(ctx.expression());
        if (!expType.equals(BOOL)) {
            throw new SemanticException(ctx.getText());
        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFixedCycle(LanguageParser.FixedCycleContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConditionCycle(LanguageParser.ConditionCycleContext ctx) {
        String expType = getExpressionType(ctx.expression());
        if (!expType.equals(BOOL)) {
            throw new SemanticException(ctx.getText());
        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitInput(LanguageParser.InputContext ctx) {
        ctx.Identificator().forEach(id -> {
            String type = identifiersTypes.get(id.getText());
            if (type == null) {
                throw new SemanticException("Using not defined '" + id.getText() + "' at line " + id.getSymbol().getLine());
            }
        });
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitOutput(LanguageParser.OutputContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProgram(LanguageParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }
}