package antlr4;// Generated from Language.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, Comment=21, RelationOperator=22, AdditionOperator=23, 
		MultiplicationOperator=24, UnaryOperator=25, Type=26, LogicalConstant=27, 
		Identificator=28, Number=29, Integer=30, Binary=31, Octal=32, Decimal=33, 
		Heximal=34, Real=35, DigitLine=36, Exponent=37;
	public static final int
		RULE_multiplier = 0, RULE_term = 1, RULE_operand = 2, RULE_expression = 3, 
		RULE_description = 4, RULE_operator = 5, RULE_complex = 6, RULE_assignment = 7, 
		RULE_condition = 8, RULE_fixedCycle = 9, RULE_conditionCycle = 10, RULE_input = 11, 
		RULE_output = 12, RULE_program = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiplier", "term", "operand", "expression", "description", "operator", 
			"complex", "assignment", "condition", "fixedCycle", "conditionCycle", 
			"input", "output", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "':'", "';'", "'{'", "'}'", "'let'", "'='", 
			"'if'", "'then'", "'else'", "'end_else'", "'for'", "'do'", "'while'", 
			"'loop'", "'input'", "'output'", null, null, null, null, null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "Comment", "RelationOperator", 
			"AdditionOperator", "MultiplicationOperator", "UnaryOperator", "Type", 
			"LogicalConstant", "Identificator", "Number", "Integer", "Binary", "Octal", 
			"Decimal", "Heximal", "Real", "DigitLine", "Exponent"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MultiplierContext extends ParserRuleContext {
		public TerminalNode Identificator() { return getToken(LanguageParser.Identificator, 0); }
		public TerminalNode Number() { return getToken(LanguageParser.Number, 0); }
		public TerminalNode LogicalConstant() { return getToken(LanguageParser.LogicalConstant, 0); }
		public TerminalNode UnaryOperator() { return getToken(LanguageParser.UnaryOperator, 0); }
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterMultiplier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitMultiplier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificator:
				{
				setState(28);
				match(Identificator);
				}
				break;
			case Number:
				{
				setState(29);
				match(Number);
				}
				break;
			case LogicalConstant:
				{
				setState(30);
				match(LogicalConstant);
				}
				break;
			case UnaryOperator:
				{
				setState(31);
				match(UnaryOperator);
				setState(32);
				multiplier();
				}
				break;
			case T__0:
				{
				setState(33);
				match(T__0);
				setState(34);
				expression();
				setState(35);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<MultiplierContext> multiplier() {
			return getRuleContexts(MultiplierContext.class);
		}
		public MultiplierContext multiplier(int i) {
			return getRuleContext(MultiplierContext.class,i);
		}
		public List<TerminalNode> MultiplicationOperator() { return getTokens(LanguageParser.MultiplicationOperator); }
		public TerminalNode MultiplicationOperator(int i) {
			return getToken(LanguageParser.MultiplicationOperator, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			multiplier();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultiplicationOperator) {
				{
				{
				setState(40);
				match(MultiplicationOperator);
				setState(41);
				multiplier();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AdditionOperator() { return getTokens(LanguageParser.AdditionOperator); }
		public TerminalNode AdditionOperator(int i) {
			return getToken(LanguageParser.AdditionOperator, i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			term();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AdditionOperator) {
				{
				{
				setState(48);
				match(AdditionOperator);
				setState(49);
				term();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> RelationOperator() { return getTokens(LanguageParser.RelationOperator); }
		public TerminalNode RelationOperator(int i) {
			return getToken(LanguageParser.RelationOperator, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			operand();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOperator) {
				{
				{
				setState(56);
				match(RelationOperator);
				setState(57);
				operand();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> Identificator() { return getTokens(LanguageParser.Identificator); }
		public TerminalNode Identificator(int i) {
			return getToken(LanguageParser.Identificator, i);
		}
		public TerminalNode Type() { return getToken(LanguageParser.Type, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_description);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Identificator);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(64);
					match(T__2);
					setState(65);
					match(Identificator);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(71);
			match(T__3);
			setState(72);
			match(Type);
			setState(73);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public FixedCycleContext fixedCycle() {
			return getRuleContext(FixedCycleContext.class,0);
		}
		public ConditionCycleContext conditionCycle() {
			return getRuleContext(ConditionCycleContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(75);
				complex();
				}
				break;
			case T__7:
			case Identificator:
				{
				setState(76);
				assignment();
				}
				break;
			case T__9:
				{
				setState(77);
				condition();
				}
				break;
			case T__13:
				{
				setState(78);
				fixedCycle();
				}
				break;
			case T__14:
				{
				setState(79);
				conditionCycle();
				}
				break;
			case T__17:
				{
				setState(80);
				input();
				}
				break;
			case T__18:
				{
				setState(81);
				output();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitComplex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexContext complex() throws RecognitionException {
		ComplexContext _localctx = new ComplexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			operator();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(86);
				match(T__4);
				setState(87);
				operator();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identificator() { return getToken(LanguageParser.Identificator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(95);
				match(T__7);
				}
			}

			setState(98);
			match(Identificator);
			setState(99);
			match(T__8);
			setState(100);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			expression();
			setState(104);
			match(T__10);
			setState(105);
			operator();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(106);
				match(T__11);
				setState(107);
				operator();
				}
			}

			setState(110);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedCycleContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FixedCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterFixedCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitFixedCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitFixedCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedCycleContext fixedCycle() throws RecognitionException {
		FixedCycleContext _localctx = new FixedCycleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fixedCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__13);
			setState(113);
			match(T__0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << UnaryOperator) | (1L << LogicalConstant) | (1L << Identificator) | (1L << Number))) != 0)) {
				{
				setState(114);
				expression();
				}
			}

			setState(117);
			match(T__4);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << UnaryOperator) | (1L << LogicalConstant) | (1L << Identificator) | (1L << Number))) != 0)) {
				{
				setState(118);
				expression();
				}
			}

			setState(121);
			match(T__4);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << UnaryOperator) | (1L << LogicalConstant) | (1L << Identificator) | (1L << Number))) != 0)) {
				{
				setState(122);
				expression();
				}
			}

			setState(125);
			match(T__1);
			setState(126);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionCycleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ConditionCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterConditionCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitConditionCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitConditionCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionCycleContext conditionCycle() throws RecognitionException {
		ConditionCycleContext _localctx = new ConditionCycleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__14);
			setState(129);
			match(T__15);
			setState(130);
			expression();
			setState(131);
			operator();
			setState(132);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> Identificator() { return getTokens(LanguageParser.Identificator); }
		public TerminalNode Identificator(int i) {
			return getToken(LanguageParser.Identificator, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__17);
			setState(135);
			match(T__0);
			setState(136);
			match(Identificator);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identificator) {
				{
				{
				setState(137);
				match(Identificator);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__18);
			setState(146);
			match(T__0);
			setState(147);
			expression();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << UnaryOperator) | (1L << LogicalConstant) | (1L << Identificator) | (1L << Number))) != 0)) {
				{
				{
				setState(148);
				expression();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener) ((LanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor) return ((LanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__5);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(157);
					description();
					}
					break;
				case 2:
					{
					setState(158);
					operator();
					}
					break;
				}
				setState(161);
				match(T__4);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << Identificator))) != 0) );
			setState(167);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2(\n\2\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4\3\4\7\4"+
		"\65\n\4\f\4\16\48\13\4\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3\6"+
		"\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7U\n\7\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\t\5\tc\n\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13v\n\13\3\13\3\13\5\13z\n\13\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u008d\n\r\f\r\16\r\u0090\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u00a2\n\17\3\17\3\17\6\17\u00a6\n\17\r"+
		"\17\16\17\u00a7\3\17\3\17\3\17\3F\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\2\2\u00b5\2\'\3\2\2\2\4)\3\2\2\2\6\61\3\2\2\2\b9\3\2\2\2\nA\3\2"+
		"\2\2\fT\3\2\2\2\16V\3\2\2\2\20b\3\2\2\2\22h\3\2\2\2\24r\3\2\2\2\26\u0082"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u0093\3\2\2\2\34\u009e\3\2\2\2\36(\7\36\2"+
		"\2\37(\7\37\2\2 (\7\35\2\2!\"\7\33\2\2\"(\5\2\2\2#$\7\3\2\2$%\5\b\5\2"+
		"%&\7\4\2\2&(\3\2\2\2\'\36\3\2\2\2\'\37\3\2\2\2\' \3\2\2\2\'!\3\2\2\2\'"+
		"#\3\2\2\2(\3\3\2\2\2).\5\2\2\2*+\7\32\2\2+-\5\2\2\2,*\3\2\2\2-\60\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3\2\2\2\61\66\5\4\3\2\62\63\7"+
		"\31\2\2\63\65\5\4\3\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\7\3\2\2\28\66\3\2\2\29>\5\6\4\2:;\7\30\2\2;=\5\6\4\2<:\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@>\3\2\2\2AF\7\36\2\2BC\7\5"+
		"\2\2CE\7\36\2\2DB\3\2\2\2EH\3\2\2\2FG\3\2\2\2FD\3\2\2\2GI\3\2\2\2HF\3"+
		"\2\2\2IJ\7\6\2\2JK\7\34\2\2KL\7\7\2\2L\13\3\2\2\2MU\5\16\b\2NU\5\20\t"+
		"\2OU\5\22\n\2PU\5\24\13\2QU\5\26\f\2RU\5\30\r\2SU\5\32\16\2TM\3\2\2\2"+
		"TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\r\3\2\2"+
		"\2VW\7\b\2\2W\\\5\f\7\2XY\7\7\2\2Y[\5\f\7\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\t\2\2`\17\3\2\2\2ac\7\n\2\2b"+
		"a\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\36\2\2ef\7\13\2\2fg\5\b\5\2g\21\3\2"+
		"\2\2hi\7\f\2\2ij\5\b\5\2jk\7\r\2\2kn\5\f\7\2lm\7\16\2\2mo\5\f\7\2nl\3"+
		"\2\2\2no\3\2\2\2op\3\2\2\2pq\7\17\2\2q\23\3\2\2\2rs\7\20\2\2su\7\3\2\2"+
		"tv\5\b\5\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\7\2\2xz\5\b\5\2yx\3\2\2\2"+
		"yz\3\2\2\2z{\3\2\2\2{}\7\7\2\2|~\5\b\5\2}|\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\7\4\2\2\u0080\u0081\5\f\7\2\u0081\25\3\2\2\2\u0082\u0083"+
		"\7\21\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5\b\5\2\u0085\u0086\5\f\7\2"+
		"\u0086\u0087\7\23\2\2\u0087\27\3\2\2\2\u0088\u0089\7\24\2\2\u0089\u008a"+
		"\7\3\2\2\u008a\u008e\7\36\2\2\u008b\u008d\7\36\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\4\2\2\u0092\31\3\2\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u0095\7\3\2\2\u0095\u0099\5\b\5\2\u0096\u0098\5"+
		"\b\5\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\4"+
		"\2\2\u009d\33\3\2\2\2\u009e\u00a5\7\b\2\2\u009f\u00a2\5\n\6\2\u00a0\u00a2"+
		"\5\f\7\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\7\7\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\7\t\2\2\u00aa\35\3\2\2\2\22\'.\66>FT\\bnuy}\u008e\u0099\u00a1\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}