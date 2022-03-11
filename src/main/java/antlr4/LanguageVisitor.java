package antlr4;// Generated from Language.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#multiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(LanguageParser.MultiplierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LanguageParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(LanguageParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(LanguageParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LanguageParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(LanguageParser.ComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#fixedCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedCycle(LanguageParser.FixedCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#conditionCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionCycle(LanguageParser.ConditionCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(LanguageParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(LanguageParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LanguageParser.ProgramContext ctx);
}