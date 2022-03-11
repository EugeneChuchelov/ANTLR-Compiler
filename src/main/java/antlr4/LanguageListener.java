package antlr4;// Generated from Language.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void enterMultiplier(LanguageParser.MultiplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void exitMultiplier(LanguageParser.MultiplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LanguageParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LanguageParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(LanguageParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(LanguageParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(LanguageParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(LanguageParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LanguageParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LanguageParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(LanguageParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(LanguageParser.ComplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#fixedCycle}.
	 * @param ctx the parse tree
	 */
	void enterFixedCycle(LanguageParser.FixedCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#fixedCycle}.
	 * @param ctx the parse tree
	 */
	void exitFixedCycle(LanguageParser.FixedCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#conditionCycle}.
	 * @param ctx the parse tree
	 */
	void enterConditionCycle(LanguageParser.ConditionCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#conditionCycle}.
	 * @param ctx the parse tree
	 */
	void exitConditionCycle(LanguageParser.ConditionCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(LanguageParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(LanguageParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LanguageParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LanguageParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LanguageParser.ProgramContext ctx);
}