// Generated from language/src/main/java/com/oracle/truffle/sl/parser/SimpleLanguage.g4 by ANTLR 4.13.2
package com.oracle.truffle.sl.parser;

// DO NOT MODIFY - generated from SimpleLanguage.g4 using "mx create-sl-parser"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WS=39, COMMENT=40, LINE_COMMENT=41, OP_SEQ=42, OP_OR=43, OP_AND=44, OP_COMPARE=45, 
		OP_ADD=46, OP_MUL=47, IDENTIFIER=48, UIDENTIFIER=49, STRING_LITERAL=50, 
		CHAR_LITERAL=51, NUMERIC_LITERAL=52;
	public static final int
		RULE_simplelanguage = 0, RULE_function = 1, RULE_varSingleDef = 2, RULE_varSingleLineDef = 3, 
		RULE_def = 4, RULE_block = 5, RULE_while_expression = 6, RULE_for_expression = 7, 
		RULE_do_while_expression = 8, RULE_elifSequence = 9, RULE_if_expression = 10, 
		RULE_expression = 11, RULE_ref = 12, RULE_assign_term = 13, RULE_or_term = 14, 
		RULE_logic_term = 15, RULE_logic_factor = 16, RULE_arithmetic = 17, RULE_term = 18, 
		RULE_skip_expression = 19, RULE_expr_list = 20, RULE_array_expression = 21, 
		RULE_sexp_expression = 22, RULE_pattern_list = 23, RULE_sexprPattern = 24, 
		RULE_wildcardPattern = 25, RULE_arrayPattern = 26, RULE_listPattern = 27, 
		RULE_namedPattern = 28, RULE_namedVarPattern = 29, RULE_decimalPattern = 30, 
		RULE_stringPattern = 31, RULE_charPattern = 32, RULE_truePattern = 33, 
		RULE_falsePattern = 34, RULE_boxTagPattern = 35, RULE_valTagPattern = 36, 
		RULE_strTagPattern = 37, RULE_arrayTagPattern = 38, RULE_sexpTagPattern = 39, 
		RULE_funTagPattern = 40, RULE_patternInBraces = 41, RULE_simplePattern = 42, 
		RULE_consPattern = 43, RULE_pattern = 44, RULE_case_branch = 45, RULE_case_branches = 46, 
		RULE_case_expression = 47, RULE_lambda_expression = 48, RULE_factor = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"simplelanguage", "function", "varSingleDef", "varSingleLineDef", "def", 
			"block", "while_expression", "for_expression", "do_while_expression", 
			"elifSequence", "if_expression", "expression", "ref", "assign_term", 
			"or_term", "logic_term", "logic_factor", "arithmetic", "term", "skip_expression", 
			"expr_list", "array_expression", "sexp_expression", "pattern_list", "sexprPattern", 
			"wildcardPattern", "arrayPattern", "listPattern", "namedPattern", "namedVarPattern", 
			"decimalPattern", "stringPattern", "charPattern", "truePattern", "falsePattern", 
			"boxTagPattern", "valTagPattern", "strTagPattern", "arrayTagPattern", 
			"sexpTagPattern", "funTagPattern", "patternInBraces", "simplePattern", 
			"consPattern", "pattern", "case_branch", "case_branches", "case_expression", 
			"lambda_expression", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'('", "','", "')'", "'{'", "'}'", "'='", "'var'", "'while'", 
			"'do'", "'od'", "'for'", "'elif'", "'then'", "'if'", "'else'", "'fi'", 
			"'['", "']'", "':='", "'skip'", "'_'", "'@'", "'true'", "'false'", "'#box'", 
			"'#val'", "'#str'", "'#array'", "'#sexp'", "'#fun'", "':'", "'->'", "'|'", 
			"'case'", "'of'", "'esac'", "'.'", null, null, null, "';'", "'!!'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "COMMENT", "LINE_COMMENT", "OP_SEQ", "OP_OR", 
			"OP_AND", "OP_COMPARE", "OP_ADD", "OP_MUL", "IDENTIFIER", "UIDENTIFIER", 
			"STRING_LITERAL", "CHAR_LITERAL", "NUMERIC_LITERAL"
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
	public String getGrammarFileName() { return "SimpleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimplelanguageContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleLanguageParser.EOF, 0); }
		public SimplelanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplelanguage; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSimplelanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplelanguageContext simplelanguage() throws RecognitionException {
		SimplelanguageContext _localctx = new SimplelanguageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simplelanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			block();
			setState(101);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token s;
		public BlockContext body;
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpleLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpleLanguageParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			match(IDENTIFIER);
			setState(105);
			((FunctionContext)_localctx).s = match(T__1);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(106);
				match(IDENTIFIER);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(107);
					match(T__2);
					setState(108);
					match(IDENTIFIER);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(116);
			match(T__3);
			setState(117);
			match(T__4);
			setState(118);
			((FunctionContext)_localctx).body = block();
			setState(119);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarSingleDefContext extends ParserRuleContext {
		public Or_termContext val;
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public Or_termContext or_term() {
			return getRuleContext(Or_termContext.class,0);
		}
		public VarSingleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSingleDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitVarSingleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSingleDefContext varSingleDef() throws RecognitionException {
		VarSingleDefContext _localctx = new VarSingleDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varSingleDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IDENTIFIER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(122);
				match(T__6);
				setState(123);
				((VarSingleDefContext)_localctx).val = or_term();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarSingleLineDefContext extends ParserRuleContext {
		public List<VarSingleDefContext> varSingleDef() {
			return getRuleContexts(VarSingleDefContext.class);
		}
		public VarSingleDefContext varSingleDef(int i) {
			return getRuleContext(VarSingleDefContext.class,i);
		}
		public TerminalNode OP_SEQ() { return getToken(SimpleLanguageParser.OP_SEQ, 0); }
		public VarSingleLineDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSingleLineDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitVarSingleLineDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSingleLineDefContext varSingleLineDef() throws RecognitionException {
		VarSingleLineDefContext _localctx = new VarSingleLineDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varSingleLineDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			varSingleDef();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(128);
				match(T__2);
				setState(129);
				varSingleDef();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(OP_SEQ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public VarSingleLineDefContext varSingleLineDef() {
			return getRuleContext(VarSingleLineDefContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				varSingleLineDef();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					def();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(147);
				expression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_expressionContext extends ParserRuleContext {
		public Token w;
		public ExpressionContext condition;
		public BlockContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitWhile_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_expressionContext while_expression() throws RecognitionException {
		While_expressionContext _localctx = new While_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((While_expressionContext)_localctx).w = match(T__8);
			setState(151);
			((While_expressionContext)_localctx).condition = expression();
			setState(152);
			match(T__9);
			setState(153);
			((While_expressionContext)_localctx).body = block();
			setState(154);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_expressionContext extends ParserRuleContext {
		public Token f;
		public BlockContext init;
		public ExpressionContext condition;
		public ExpressionContext last;
		public BlockContext body;
		public Token od;
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitFor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((For_expressionContext)_localctx).f = match(T__11);
			setState(157);
			((For_expressionContext)_localctx).init = block();
			setState(158);
			match(T__2);
			setState(159);
			((For_expressionContext)_localctx).condition = expression();
			setState(160);
			match(T__2);
			setState(161);
			((For_expressionContext)_localctx).last = expression();
			setState(162);
			match(T__9);
			setState(163);
			((For_expressionContext)_localctx).body = block();
			setState(164);
			((For_expressionContext)_localctx).od = match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_expressionContext extends ParserRuleContext {
		public Token d;
		public BlockContext body;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDo_while_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_expressionContext do_while_expression() throws RecognitionException {
		Do_while_expressionContext _localctx = new Do_while_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((Do_while_expressionContext)_localctx).d = match(T__9);
			setState(167);
			((Do_while_expressionContext)_localctx).body = block();
			setState(168);
			match(T__8);
			setState(169);
			((Do_while_expressionContext)_localctx).condition = expression();
			setState(170);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifSequenceContext extends ParserRuleContext {
		public Token el;
		public ExpressionContext cond;
		public BlockContext elif;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitElifSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifSequenceContext elifSequence() throws RecognitionException {
		ElifSequenceContext _localctx = new ElifSequenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elifSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((ElifSequenceContext)_localctx).el = match(T__12);
			setState(173);
			((ElifSequenceContext)_localctx).cond = expression();
			setState(174);
			match(T__13);
			setState(175);
			((ElifSequenceContext)_localctx).elif = block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_expressionContext extends ParserRuleContext {
		public Token i;
		public ExpressionContext condition;
		public BlockContext then;
		public BlockContext alt;
		public Token f;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ElifSequenceContext> elifSequence() {
			return getRuleContexts(ElifSequenceContext.class);
		}
		public ElifSequenceContext elifSequence(int i) {
			return getRuleContext(ElifSequenceContext.class,i);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((If_expressionContext)_localctx).i = match(T__14);
			setState(178);
			((If_expressionContext)_localctx).condition = expression();
			setState(179);
			match(T__13);
			setState(180);
			((If_expressionContext)_localctx).then = block();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(181);
				elifSequence();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(187);
				match(T__15);
				setState(188);
				((If_expressionContext)_localctx).alt = block();
				}
			}

			setState(191);
			((If_expressionContext)_localctx).f = match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Assign_termContext> assign_term() {
			return getRuleContexts(Assign_termContext.class);
		}
		public Assign_termContext assign_term(int i) {
			return getRuleContext(Assign_termContext.class,i);
		}
		public List<TerminalNode> OP_SEQ() { return getTokens(SimpleLanguageParser.OP_SEQ); }
		public TerminalNode OP_SEQ(int i) {
			return getToken(SimpleLanguageParser.OP_SEQ, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			assign_term();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SEQ) {
				{
				{
				setState(194);
				match(OP_SEQ);
				setState(195);
				assign_term();
				}
				}
				setState(200);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RefContext extends ParserRuleContext {
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	 
		public RefContext() { }
		public void copyFrom(RefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirRefContext extends RefContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public DirRefContext(RefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDirRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElemRefContext extends RefContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElemRefContext(RefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitElemRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ref);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DirRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ElemRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				factor(0);
				setState(203);
				match(T__17);
				setState(204);
				expression();
				setState(205);
				match(T__18);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_termContext extends ParserRuleContext {
		public Assign_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_term; }
	 
		public Assign_termContext() { }
		public void copyFrom(Assign_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends Assign_termContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public Assign_termContext assign_term() {
			return getRuleContext(Assign_termContext.class,0);
		}
		public AssignmentContext(Assign_termContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends Assign_termContext {
		public Or_termContext or_term() {
			return getRuleContext(Or_termContext.class,0);
		}
		public ExprContext(Assign_termContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_termContext assign_term() throws RecognitionException {
		Assign_termContext _localctx = new Assign_termContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_term);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				ref();
				setState(210);
				match(T__19);
				setState(211);
				assign_term();
				}
				break;
			case 2:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				or_term();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Or_termContext extends ParserRuleContext {
		public List<Logic_termContext> logic_term() {
			return getRuleContexts(Logic_termContext.class);
		}
		public Logic_termContext logic_term(int i) {
			return getRuleContext(Logic_termContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(SimpleLanguageParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(SimpleLanguageParser.OP_OR, i);
		}
		public Or_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitOr_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_termContext or_term() throws RecognitionException {
		Or_termContext _localctx = new Or_termContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_or_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			logic_term();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(217);
				match(OP_OR);
				setState(218);
				logic_term();
				}
				}
				setState(223);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_termContext extends ParserRuleContext {
		public List<Logic_factorContext> logic_factor() {
			return getRuleContexts(Logic_factorContext.class);
		}
		public Logic_factorContext logic_factor(int i) {
			return getRuleContext(Logic_factorContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(SimpleLanguageParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(SimpleLanguageParser.OP_AND, i);
		}
		public Logic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitLogic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_termContext logic_term() throws RecognitionException {
		Logic_termContext _localctx = new Logic_termContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			logic_factor();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(225);
				match(OP_AND);
				setState(226);
				logic_factor();
				}
				}
				setState(231);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_factorContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode OP_COMPARE() { return getToken(SimpleLanguageParser.OP_COMPARE, 0); }
		public Logic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitLogic_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_factorContext logic_factor() throws RecognitionException {
		Logic_factorContext _localctx = new Logic_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			arithmetic();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COMPARE) {
				{
				setState(233);
				match(OP_COMPARE);
				setState(234);
				arithmetic();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OP_ADD() { return getTokens(SimpleLanguageParser.OP_ADD); }
		public TerminalNode OP_ADD(int i) {
			return getToken(SimpleLanguageParser.OP_ADD, i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			term();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD) {
				{
				{
				setState(238);
				match(OP_ADD);
				setState(239);
				term();
				}
				}
				setState(244);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OP_MUL() { return getTokens(SimpleLanguageParser.OP_MUL); }
		public TerminalNode OP_MUL(int i) {
			return getToken(SimpleLanguageParser.OP_MUL, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			factor(0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL) {
				{
				{
				setState(246);
				match(OP_MUL);
				setState(247);
				factor(0);
				}
				}
				setState(252);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Skip_expressionContext extends ParserRuleContext {
		public Skip_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSkip_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_expressionContext skip_expression() throws RecognitionException {
		Skip_expressionContext _localctx = new Skip_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_skip_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(256);
				match(T__2);
				setState(257);
				expression();
				}
				}
				setState(262);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_expressionContext extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitArray_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__17);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166406L) != 0)) {
				{
				setState(264);
				expr_list();
				}
			}

			setState(267);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sexp_expressionContext extends ParserRuleContext {
		public TerminalNode UIDENTIFIER() { return getToken(SimpleLanguageParser.UIDENTIFIER, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Sexp_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSexp_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sexp_expressionContext sexp_expression() throws RecognitionException {
		Sexp_expressionContext _localctx = new Sexp_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sexp_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(UIDENTIFIER);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(270);
				match(T__1);
				setState(271);
				expr_list();
				setState(272);
				match(T__3);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_listContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public Pattern_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitPattern_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_listContext pattern_list() throws RecognitionException {
		Pattern_listContext _localctx = new Pattern_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pattern_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			pattern();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(277);
				match(T__2);
				setState(278);
				pattern();
				}
				}
				setState(283);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SexprPatternContext extends ParserRuleContext {
		public TerminalNode UIDENTIFIER() { return getToken(SimpleLanguageParser.UIDENTIFIER, 0); }
		public Pattern_listContext pattern_list() {
			return getRuleContext(Pattern_listContext.class,0);
		}
		public SexprPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexprPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSexprPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexprPatternContext sexprPattern() throws RecognitionException {
		SexprPatternContext _localctx = new SexprPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sexprPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(UIDENTIFIER);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(285);
				match(T__1);
				setState(286);
				pattern_list();
				setState(287);
				match(T__3);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardPatternContext extends ParserRuleContext {
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitWildcardPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayPatternContext extends ParserRuleContext {
		public Pattern_listContext pattern_list() {
			return getRuleContext(Pattern_listContext.class,0);
		}
		public ArrayPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitArrayPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayPatternContext arrayPattern() throws RecognitionException {
		ArrayPatternContext _localctx = new ArrayPatternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__17);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725728560676900L) != 0)) {
				{
				setState(294);
				pattern_list();
				}
			}

			setState(297);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListPatternContext extends ParserRuleContext {
		public Pattern_listContext pattern_list() {
			return getRuleContext(Pattern_listContext.class,0);
		}
		public ListPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitListPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListPatternContext listPattern() throws RecognitionException {
		ListPatternContext _localctx = new ListPatternContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__4);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725728560676900L) != 0)) {
				{
				setState(300);
				pattern_list();
				}
			}

			setState(303);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamedPatternContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public NamedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitNamedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedPatternContext namedPattern() throws RecognitionException {
		NamedPatternContext _localctx = new NamedPatternContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_namedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(T__22);
			setState(307);
			pattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamedVarPatternContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public NamedVarPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedVarPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitNamedVarPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedVarPatternContext namedVarPattern() throws RecognitionException {
		NamedVarPatternContext _localctx = new NamedVarPatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedVarPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalPatternContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SimpleLanguageParser.NUMERIC_LITERAL, 0); }
		public DecimalPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDecimalPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalPatternContext decimalPattern() throws RecognitionException {
		DecimalPatternContext _localctx = new DecimalPatternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decimalPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(NUMERIC_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringPatternContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SimpleLanguageParser.STRING_LITERAL, 0); }
		public StringPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitStringPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringPatternContext stringPattern() throws RecognitionException {
		StringPatternContext _localctx = new StringPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharPatternContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(SimpleLanguageParser.CHAR_LITERAL, 0); }
		public CharPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCharPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharPatternContext charPattern() throws RecognitionException {
		CharPatternContext _localctx = new CharPatternContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_charPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CHAR_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TruePatternContext extends ParserRuleContext {
		public TruePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truePattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitTruePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruePatternContext truePattern() throws RecognitionException {
		TruePatternContext _localctx = new TruePatternContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_truePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FalsePatternContext extends ParserRuleContext {
		public FalsePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falsePattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitFalsePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalsePatternContext falsePattern() throws RecognitionException {
		FalsePatternContext _localctx = new FalsePatternContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_falsePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoxTagPatternContext extends ParserRuleContext {
		public BoxTagPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxTagPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitBoxTagPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxTagPatternContext boxTagPattern() throws RecognitionException {
		BoxTagPatternContext _localctx = new BoxTagPatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_boxTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValTagPatternContext extends ParserRuleContext {
		public ValTagPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valTagPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitValTagPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValTagPatternContext valTagPattern() throws RecognitionException {
		ValTagPatternContext _localctx = new ValTagPatternContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_valTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StrTagPatternContext extends ParserRuleContext {
		public StrTagPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strTagPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitStrTagPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrTagPatternContext strTagPattern() throws RecognitionException {
		StrTagPatternContext _localctx = new StrTagPatternContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_strTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTagPatternContext extends ParserRuleContext {
		public ArrayTagPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTagPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitArrayTagPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTagPatternContext arrayTagPattern() throws RecognitionException {
		ArrayTagPatternContext _localctx = new ArrayTagPatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__28);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SexpTagPatternContext extends ParserRuleContext {
		public SexpTagPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpTagPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSexpTagPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexpTagPatternContext sexpTagPattern() throws RecognitionException {
		SexpTagPatternContext _localctx = new SexpTagPatternContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sexpTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunTagPatternContext extends ParserRuleContext {
		public FunTagPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funTagPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitFunTagPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTagPatternContext funTagPattern() throws RecognitionException {
		FunTagPatternContext _localctx = new FunTagPatternContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_funTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternInBracesContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternInBracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInBraces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitPatternInBraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternInBracesContext patternInBraces() throws RecognitionException {
		PatternInBracesContext _localctx = new PatternInBracesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_patternInBraces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__1);
			setState(334);
			pattern();
			setState(335);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePatternContext extends ParserRuleContext {
		public SexprPatternContext sexprPattern() {
			return getRuleContext(SexprPatternContext.class,0);
		}
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public ArrayPatternContext arrayPattern() {
			return getRuleContext(ArrayPatternContext.class,0);
		}
		public ListPatternContext listPattern() {
			return getRuleContext(ListPatternContext.class,0);
		}
		public NamedPatternContext namedPattern() {
			return getRuleContext(NamedPatternContext.class,0);
		}
		public NamedVarPatternContext namedVarPattern() {
			return getRuleContext(NamedVarPatternContext.class,0);
		}
		public DecimalPatternContext decimalPattern() {
			return getRuleContext(DecimalPatternContext.class,0);
		}
		public StringPatternContext stringPattern() {
			return getRuleContext(StringPatternContext.class,0);
		}
		public CharPatternContext charPattern() {
			return getRuleContext(CharPatternContext.class,0);
		}
		public TruePatternContext truePattern() {
			return getRuleContext(TruePatternContext.class,0);
		}
		public FalsePatternContext falsePattern() {
			return getRuleContext(FalsePatternContext.class,0);
		}
		public BoxTagPatternContext boxTagPattern() {
			return getRuleContext(BoxTagPatternContext.class,0);
		}
		public ValTagPatternContext valTagPattern() {
			return getRuleContext(ValTagPatternContext.class,0);
		}
		public StrTagPatternContext strTagPattern() {
			return getRuleContext(StrTagPatternContext.class,0);
		}
		public ArrayTagPatternContext arrayTagPattern() {
			return getRuleContext(ArrayTagPatternContext.class,0);
		}
		public SexpTagPatternContext sexpTagPattern() {
			return getRuleContext(SexpTagPatternContext.class,0);
		}
		public FunTagPatternContext funTagPattern() {
			return getRuleContext(FunTagPatternContext.class,0);
		}
		public PatternInBracesContext patternInBraces() {
			return getRuleContext(PatternInBracesContext.class,0);
		}
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSimplePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simplePattern);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				sexprPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				wildcardPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				arrayPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				listPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				namedPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				namedVarPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				decimalPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				stringPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(345);
				charPattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(346);
				truePattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(347);
				falsePattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(348);
				boxTagPattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(349);
				valTagPattern();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(350);
				strTagPattern();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(351);
				arrayTagPattern();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(352);
				sexpTagPattern();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(353);
				funTagPattern();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(354);
				patternInBraces();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsPatternContext extends ParserRuleContext {
		public SimplePatternContext simplePattern() {
			return getRuleContext(SimplePatternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ConsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitConsPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsPatternContext consPattern() throws RecognitionException {
		ConsPatternContext _localctx = new ConsPatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_consPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			simplePattern();
			setState(358);
			match(T__31);
			setState(359);
			pattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public ConsPatternContext consPattern() {
			return getRuleContext(ConsPatternContext.class,0);
		}
		public SimplePatternContext simplePattern() {
			return getRuleContext(SimplePatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pattern);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				consPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				simplePattern();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_branchContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Case_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCase_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_branchContext case_branch() throws RecognitionException {
		Case_branchContext _localctx = new Case_branchContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_case_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			pattern();
			setState(366);
			match(T__32);
			setState(367);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_branchesContext extends ParserRuleContext {
		public List<Case_branchContext> case_branch() {
			return getRuleContexts(Case_branchContext.class);
		}
		public Case_branchContext case_branch(int i) {
			return getRuleContext(Case_branchContext.class,i);
		}
		public Case_branchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_branches; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCase_branches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_branchesContext case_branches() throws RecognitionException {
		Case_branchesContext _localctx = new Case_branchesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_case_branches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			case_branch();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(370);
				match(T__33);
				setState(371);
				case_branch();
				}
				}
				setState(376);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_branchesContext case_branches() {
			return getRuleContext(Case_branchesContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__34);
			setState(378);
			expression();
			setState(379);
			match(T__35);
			setState(380);
			case_branches();
			setState(381);
			match(T__36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_expressionContext extends ParserRuleContext {
		public Token b;
		public Token s;
		public BlockContext body;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpleLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpleLanguageParser.IDENTIFIER, i);
		}
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitLambda_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((Lambda_expressionContext)_localctx).b = match(T__0);
			setState(384);
			((Lambda_expressionContext)_localctx).s = match(T__1);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(385);
				match(IDENTIFIER);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(386);
					match(T__2);
					setState(387);
					match(IDENTIFIER);
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(395);
			match(T__3);
			setState(396);
			match(T__4);
			setState(397);
			((Lambda_expressionContext)_localctx).body = block();
			setState(398);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipExprContext extends FactorContext {
		public Skip_expressionContext skip_expression() {
			return getRuleContext(Skip_expressionContext.class,0);
		}
		public SkipExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSkipExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileExprContext extends FactorContext {
		public While_expressionContext while_expression() {
			return getRuleContext(While_expressionContext.class,0);
		}
		public WhileExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointAccessExprContext extends FactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public PointAccessExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitPointAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfExprContext extends FactorContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public IfExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndAccessContext extends FactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndAccessContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitIndAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends FactorContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SimpleLanguageParser.NUMERIC_LITERAL, 0); }
		public NumericLiteralContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharLiteralContext extends FactorContext {
		public TerminalNode CHAR_LITERAL() { return getToken(SimpleLanguageParser.CHAR_LITERAL, 0); }
		public CharLiteralContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileExprContext extends FactorContext {
		public Do_while_expressionContext do_while_expression() {
			return getRuleContext(Do_while_expressionContext.class,0);
		}
		public DoWhileExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDoWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectCallContext extends FactorContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DirectCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDirectCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExprContext extends FactorContext {
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public LambdaExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndirectCallContext extends FactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndirectCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitIndirectCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends FactorContext {
		public Array_expressionContext array_expression() {
			return getRuleContext(Array_expressionContext.class,0);
		}
		public ArrayExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends FactorContext {
		public TerminalNode STRING_LITERAL() { return getToken(SimpleLanguageParser.STRING_LITERAL, 0); }
		public StringLiteralContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SexpExprContext extends FactorContext {
		public Sexp_expressionContext sexp_expression() {
			return getRuleContext(Sexp_expressionContext.class,0);
		}
		public SexpExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSexpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends FactorContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParenExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForExprContext extends FactorContext {
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public ForExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseExprContext extends FactorContext {
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public CaseExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAccessContext extends FactorContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public NameAccessContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitNameAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_factor, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(401);
				if_expression();
				}
				break;
			case 2:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402);
				lambda_expression();
				}
				break;
			case 3:
				{
				_localctx = new CaseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(403);
				case_expression();
				}
				break;
			case 4:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(404);
				array_expression();
				}
				break;
			case 5:
				{
				_localctx = new SexpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				sexp_expression();
				}
				break;
			case 6:
				{
				_localctx = new SkipExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				skip_expression();
				}
				break;
			case 7:
				{
				_localctx = new WhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				while_expression();
				}
				break;
			case 8:
				{
				_localctx = new ForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				for_expression();
				}
				break;
			case 9:
				{
				_localctx = new DoWhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409);
				do_while_expression();
				}
				break;
			case 10:
				{
				_localctx = new DirectCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				match(IDENTIFIER);
				setState(411);
				match(T__1);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166406L) != 0)) {
					{
					setState(412);
					expression();
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(413);
						match(T__2);
						setState(414);
						expression();
						}
						}
						setState(419);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(422);
				match(T__3);
				}
				break;
			case 11:
				{
				_localctx = new NameAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(423);
				match(IDENTIFIER);
				}
				break;
			case 12:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				match(STRING_LITERAL);
				}
				break;
			case 13:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				match(NUMERIC_LITERAL);
				}
				break;
			case 14:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				match(CHAR_LITERAL);
				}
				break;
			case 15:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427);
				match(T__1);
				setState(428);
				block();
				setState(429);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new PointAccessExprContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(433);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(434);
						match(T__37);
						setState(435);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						_localctx = new IndirectCallContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(436);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(437);
						match(T__1);
						setState(446);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166406L) != 0)) {
							{
							setState(438);
							expression();
							setState(443);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__2) {
								{
								{
								setState(439);
								match(T__2);
								setState(440);
								expression();
								}
								}
								setState(445);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(448);
						match(T__3);
						}
						break;
					case 3:
						{
						_localctx = new IndAccessContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(449);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(450);
						match(T__17);
						setState(451);
						expression();
						setState(452);
						match(T__18);
						}
						break;
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 49:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u01cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001n\b\u0001\n\u0001\f\u0001q\t"+
		"\u0001\u0003\u0001s\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002}\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0083"+
		"\b\u0003\n\u0003\f\u0003\u0086\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u008c\b\u0004\u0001\u0005\u0005\u0005\u008f\b"+
		"\u0005\n\u0005\f\u0005\u0092\t\u0005\u0001\u0005\u0003\u0005\u0095\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n"+
		"\u0001\n\u0001\n\u0003\n\u00be\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00c5\b\u000b\n\u000b\f\u000b\u00c8\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d0\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d7\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00dc\b\u000e\n\u000e\f\u000e\u00df\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00e4\b\u000f\n\u000f\f\u000f\u00e7"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ec\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f1\b\u0011\n\u0011"+
		"\f\u0011\u00f4\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00f9\b\u0012\n\u0012\f\u0012\u00fc\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0103\b\u0014\n\u0014\f\u0014"+
		"\u0106\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u010a\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0113\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0118\b\u0017\n\u0017\f\u0017\u011b\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0122\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0128\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u012e\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0164"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0003,\u016c\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u0175\b.\n.\f.\u0178\t.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00050\u0185\b0\n0\f0\u0188\t0\u00030\u018a\b0\u00010\u00010\u00010"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u01a0\b1\n1"+
		"\f1\u01a3\t1\u00031\u01a5\b1\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u01b0\b1\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00051\u01ba\b1\n1\f1\u01bd\t1\u00031\u01bf\b1"+
		"\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u01c7\b1\n1\f1\u01ca"+
		"\t1\u00011\u0000\u0001b2\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`b\u0000\u0000\u01db\u0000d\u0001\u0000\u0000\u0000\u0002g\u0001\u0000"+
		"\u0000\u0000\u0004y\u0001\u0000\u0000\u0000\u0006~\u0001\u0000\u0000\u0000"+
		"\b\u008b\u0001\u0000\u0000\u0000\n\u0090\u0001\u0000\u0000\u0000\f\u0096"+
		"\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a6"+
		"\u0001\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00b1"+
		"\u0001\u0000\u0000\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0018\u00cf"+
		"\u0001\u0000\u0000\u0000\u001a\u00d6\u0001\u0000\u0000\u0000\u001c\u00d8"+
		"\u0001\u0000\u0000\u0000\u001e\u00e0\u0001\u0000\u0000\u0000 \u00e8\u0001"+
		"\u0000\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u00f5\u0001\u0000"+
		"\u0000\u0000&\u00fd\u0001\u0000\u0000\u0000(\u00ff\u0001\u0000\u0000\u0000"+
		"*\u0107\u0001\u0000\u0000\u0000,\u010d\u0001\u0000\u0000\u0000.\u0114"+
		"\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u00002\u0123\u0001\u0000"+
		"\u0000\u00004\u0125\u0001\u0000\u0000\u00006\u012b\u0001\u0000\u0000\u0000"+
		"8\u0131\u0001\u0000\u0000\u0000:\u0135\u0001\u0000\u0000\u0000<\u0137"+
		"\u0001\u0000\u0000\u0000>\u0139\u0001\u0000\u0000\u0000@\u013b\u0001\u0000"+
		"\u0000\u0000B\u013d\u0001\u0000\u0000\u0000D\u013f\u0001\u0000\u0000\u0000"+
		"F\u0141\u0001\u0000\u0000\u0000H\u0143\u0001\u0000\u0000\u0000J\u0145"+
		"\u0001\u0000\u0000\u0000L\u0147\u0001\u0000\u0000\u0000N\u0149\u0001\u0000"+
		"\u0000\u0000P\u014b\u0001\u0000\u0000\u0000R\u014d\u0001\u0000\u0000\u0000"+
		"T\u0163\u0001\u0000\u0000\u0000V\u0165\u0001\u0000\u0000\u0000X\u016b"+
		"\u0001\u0000\u0000\u0000Z\u016d\u0001\u0000\u0000\u0000\\\u0171\u0001"+
		"\u0000\u0000\u0000^\u0179\u0001\u0000\u0000\u0000`\u017f\u0001\u0000\u0000"+
		"\u0000b\u01af\u0001\u0000\u0000\u0000de\u0003\n\u0005\u0000ef\u0005\u0000"+
		"\u0000\u0001f\u0001\u0001\u0000\u0000\u0000gh\u0005\u0001\u0000\u0000"+
		"hi\u00050\u0000\u0000ir\u0005\u0002\u0000\u0000jo\u00050\u0000\u0000k"+
		"l\u0005\u0003\u0000\u0000ln\u00050\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rj\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0004\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u0003\n\u0005\u0000wx\u0005"+
		"\u0006\u0000\u0000x\u0003\u0001\u0000\u0000\u0000y|\u00050\u0000\u0000"+
		"z{\u0005\u0007\u0000\u0000{}\u0003\u001c\u000e\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0005\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\b\u0000\u0000\u007f\u0084\u0003\u0004\u0002\u0000\u0080\u0081\u0005"+
		"\u0003\u0000\u0000\u0081\u0083\u0003\u0004\u0002\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"*\u0000\u0000\u0088\u0007\u0001\u0000\u0000\u0000\u0089\u008c\u0003\u0006"+
		"\u0003\u0000\u008a\u008c\u0003\u0002\u0001\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\t\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0003\b\u0004\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u0016\u000b\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097"+
		"\u0098\u0003\u0016\u000b\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099\u009a"+
		"\u0003\n\u0005\u0000\u009a\u009b\u0005\u000b\u0000\u0000\u009b\r\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\f\u0000\u0000\u009d\u009e\u0003\n"+
		"\u0005\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0003\u0016"+
		"\u000b\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0003\u0016"+
		"\u000b\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a4\u0003\n\u0005"+
		"\u0000\u00a4\u00a5\u0005\u000b\u0000\u0000\u00a5\u000f\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000"+
		"\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa\u0003\u0016\u000b\u0000\u00aa"+
		"\u00ab\u0005\u000b\u0000\u0000\u00ab\u0011\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005\r\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000\u00ae\u00af"+
		"\u0005\u000e\u0000\u0000\u00af\u00b0\u0003\n\u0005\u0000\u00b0\u0013\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u000f\u0000\u0000\u00b2\u00b3\u0003"+
		"\u0016\u000b\u0000\u00b3\u00b4\u0005\u000e\u0000\u0000\u00b4\u00b8\u0003"+
		"\n\u0005\u0000\u00b5\u00b7\u0003\u0012\t\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bd\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0010"+
		"\u0000\u0000\u00bc\u00be\u0003\n\u0005\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0011\u0000\u0000\u00c0\u0015\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c6\u0003\u001a\r\u0000\u00c2\u00c3\u0005*\u0000\u0000"+
		"\u00c3\u00c5\u0003\u001a\r\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u0017\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c9\u00d0\u00050\u0000\u0000\u00ca\u00cb"+
		"\u0003b1\u0000\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00cd\u0003\u0016"+
		"\u000b\u0000\u00cd\u00ce\u0005\u0013\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003\u0018"+
		"\f\u0000\u00d2\u00d3\u0005\u0014\u0000\u0000\u00d3\u00d4\u0003\u001a\r"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003\u001c\u000e"+
		"\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u001b\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003\u001e\u000f"+
		"\u0000\u00d9\u00da\u0005+\u0000\u0000\u00da\u00dc\u0003\u001e\u000f\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u001d\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e5\u0003 \u0010\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2\u00e4"+
		"\u0003 \u0010\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u001f\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0003\"\u0011\u0000\u00e9\u00ea\u0005-"+
		"\u0000\u0000\u00ea\u00ec\u0003\"\u0011\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec!\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f2\u0003$\u0012\u0000\u00ee\u00ef\u0005.\u0000\u0000\u00ef\u00f1"+
		"\u0003$\u0012\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3#\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00fa\u0003b1\u0000\u00f6\u00f7\u0005/\u0000\u0000"+
		"\u00f7\u00f9\u0003b1\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb%\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005\u0015\u0000\u0000\u00fe\'\u0001\u0000"+
		"\u0000\u0000\u00ff\u0104\u0003\u0016\u000b\u0000\u0100\u0101\u0005\u0003"+
		"\u0000\u0000\u0101\u0103\u0003\u0016\u000b\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105)\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0109\u0005\u0012\u0000"+
		"\u0000\u0108\u010a\u0003(\u0014\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0013\u0000\u0000\u010c+\u0001\u0000\u0000\u0000\u010d"+
		"\u0112\u00051\u0000\u0000\u010e\u010f\u0005\u0002\u0000\u0000\u010f\u0110"+
		"\u0003(\u0014\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0113\u0001"+
		"\u0000\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113-\u0001\u0000\u0000\u0000\u0114\u0119\u0003X,"+
		"\u0000\u0115\u0116\u0005\u0003\u0000\u0000\u0116\u0118\u0003X,\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"/\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0121"+
		"\u00051\u0000\u0000\u011d\u011e\u0005\u0002\u0000\u0000\u011e\u011f\u0003"+
		".\u0017\u0000\u011f\u0120\u0005\u0004\u0000\u0000\u0120\u0122\u0001\u0000"+
		"\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0016\u0000"+
		"\u0000\u01243\u0001\u0000\u0000\u0000\u0125\u0127\u0005\u0012\u0000\u0000"+
		"\u0126\u0128\u0003.\u0017\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\u0013\u0000\u0000\u012a5\u0001\u0000\u0000\u0000\u012b\u012d"+
		"\u0005\u0005\u0000\u0000\u012c\u012e\u0003.\u0017\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005\u0006\u0000\u0000\u01307\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u00050\u0000\u0000\u0132\u0133\u0005\u0017\u0000"+
		"\u0000\u0133\u0134\u0003X,\u0000\u01349\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u00050\u0000\u0000\u0136;\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"4\u0000\u0000\u0138=\u0001\u0000\u0000\u0000\u0139\u013a\u00052\u0000"+
		"\u0000\u013a?\u0001\u0000\u0000\u0000\u013b\u013c\u00053\u0000\u0000\u013c"+
		"A\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0018\u0000\u0000\u013eC\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005\u0019\u0000\u0000\u0140E\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0005\u001a\u0000\u0000\u0142G\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005\u001b\u0000\u0000\u0144I\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0005\u001c\u0000\u0000\u0146K\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\u001d\u0000\u0000\u0148M\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005\u001e\u0000\u0000\u014aO\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"\u001f\u0000\u0000\u014cQ\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0002"+
		"\u0000\u0000\u014e\u014f\u0003X,\u0000\u014f\u0150\u0005\u0004\u0000\u0000"+
		"\u0150S\u0001\u0000\u0000\u0000\u0151\u0164\u00030\u0018\u0000\u0152\u0164"+
		"\u00032\u0019\u0000\u0153\u0164\u00034\u001a\u0000\u0154\u0164\u00036"+
		"\u001b\u0000\u0155\u0164\u00038\u001c\u0000\u0156\u0164\u0003:\u001d\u0000"+
		"\u0157\u0164\u0003<\u001e\u0000\u0158\u0164\u0003>\u001f\u0000\u0159\u0164"+
		"\u0003@ \u0000\u015a\u0164\u0003B!\u0000\u015b\u0164\u0003D\"\u0000\u015c"+
		"\u0164\u0003F#\u0000\u015d\u0164\u0003H$\u0000\u015e\u0164\u0003J%\u0000"+
		"\u015f\u0164\u0003L&\u0000\u0160\u0164\u0003N\'\u0000\u0161\u0164\u0003"+
		"P(\u0000\u0162\u0164\u0003R)\u0000\u0163\u0151\u0001\u0000\u0000\u0000"+
		"\u0163\u0152\u0001\u0000\u0000\u0000\u0163\u0153\u0001\u0000\u0000\u0000"+
		"\u0163\u0154\u0001\u0000\u0000\u0000\u0163\u0155\u0001\u0000\u0000\u0000"+
		"\u0163\u0156\u0001\u0000\u0000\u0000\u0163\u0157\u0001\u0000\u0000\u0000"+
		"\u0163\u0158\u0001\u0000\u0000\u0000\u0163\u0159\u0001\u0000\u0000\u0000"+
		"\u0163\u015a\u0001\u0000\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000"+
		"\u0163\u015c\u0001\u0000\u0000\u0000\u0163\u015d\u0001\u0000\u0000\u0000"+
		"\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000"+
		"\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0162\u0001\u0000\u0000\u0000\u0164U\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0003T*\u0000\u0166\u0167\u0005 \u0000\u0000\u0167\u0168\u0003"+
		"X,\u0000\u0168W\u0001\u0000\u0000\u0000\u0169\u016c\u0003V+\u0000\u016a"+
		"\u016c\u0003T*\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016a\u0001"+
		"\u0000\u0000\u0000\u016cY\u0001\u0000\u0000\u0000\u016d\u016e\u0003X,"+
		"\u0000\u016e\u016f\u0005!\u0000\u0000\u016f\u0170\u0003\n\u0005\u0000"+
		"\u0170[\u0001\u0000\u0000\u0000\u0171\u0176\u0003Z-\u0000\u0172\u0173"+
		"\u0005\"\u0000\u0000\u0173\u0175\u0003Z-\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177]\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017a\u0005#\u0000\u0000"+
		"\u017a\u017b\u0003\u0016\u000b\u0000\u017b\u017c\u0005$\u0000\u0000\u017c"+
		"\u017d\u0003\\.\u0000\u017d\u017e\u0005%\u0000\u0000\u017e_\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0005\u0001\u0000\u0000\u0180\u0189\u0005\u0002"+
		"\u0000\u0000\u0181\u0186\u00050\u0000\u0000\u0182\u0183\u0005\u0003\u0000"+
		"\u0000\u0183\u0185\u00050\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000"+
		"\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u0181\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005\u0004\u0000\u0000\u018c\u018d\u0005\u0005\u0000\u0000"+
		"\u018d\u018e\u0003\n\u0005\u0000\u018e\u018f\u0005\u0006\u0000\u0000\u018f"+
		"a\u0001\u0000\u0000\u0000\u0190\u0191\u00061\uffff\uffff\u0000\u0191\u01b0"+
		"\u0003\u0014\n\u0000\u0192\u01b0\u0003`0\u0000\u0193\u01b0\u0003^/\u0000"+
		"\u0194\u01b0\u0003*\u0015\u0000\u0195\u01b0\u0003,\u0016\u0000\u0196\u01b0"+
		"\u0003&\u0013\u0000\u0197\u01b0\u0003\f\u0006\u0000\u0198\u01b0\u0003"+
		"\u000e\u0007\u0000\u0199\u01b0\u0003\u0010\b\u0000\u019a\u019b\u00050"+
		"\u0000\u0000\u019b\u01a4\u0005\u0002\u0000\u0000\u019c\u01a1\u0003\u0016"+
		"\u000b\u0000\u019d\u019e\u0005\u0003\u0000\u0000\u019e\u01a0\u0003\u0016"+
		"\u000b\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01b0\u0005\u0004"+
		"\u0000\u0000\u01a7\u01b0\u00050\u0000\u0000\u01a8\u01b0\u00052\u0000\u0000"+
		"\u01a9\u01b0\u00054\u0000\u0000\u01aa\u01b0\u00053\u0000\u0000\u01ab\u01ac"+
		"\u0005\u0002\u0000\u0000\u01ac\u01ad\u0003\n\u0005\u0000\u01ad\u01ae\u0005"+
		"\u0004\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u0190\u0001"+
		"\u0000\u0000\u0000\u01af\u0192\u0001\u0000\u0000\u0000\u01af\u0193\u0001"+
		"\u0000\u0000\u0000\u01af\u0194\u0001\u0000\u0000\u0000\u01af\u0195\u0001"+
		"\u0000\u0000\u0000\u01af\u0196\u0001\u0000\u0000\u0000\u01af\u0197\u0001"+
		"\u0000\u0000\u0000\u01af\u0198\u0001\u0000\u0000\u0000\u01af\u0199\u0001"+
		"\u0000\u0000\u0000\u01af\u019a\u0001\u0000\u0000\u0000\u01af\u01a7\u0001"+
		"\u0000\u0000\u0000\u01af\u01a8\u0001\u0000\u0000\u0000\u01af\u01a9\u0001"+
		"\u0000\u0000\u0000\u01af\u01aa\u0001\u0000\u0000\u0000\u01af\u01ab\u0001"+
		"\u0000\u0000\u0000\u01b0\u01c8\u0001\u0000\u0000\u0000\u01b1\u01b2\n\t"+
		"\u0000\u0000\u01b2\u01b3\u0005&\u0000\u0000\u01b3\u01c7\u00050\u0000\u0000"+
		"\u01b4\u01b5\n\u0007\u0000\u0000\u01b5\u01be\u0005\u0002\u0000\u0000\u01b6"+
		"\u01bb\u0003\u0016\u000b\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8"+
		"\u01ba\u0003\u0016\u000b\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bb\u0001\u0000\u0000\u0000\u01be\u01b6\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c7\u0005\u0004\u0000\u0000\u01c1\u01c2\n\u0005\u0000\u0000\u01c2\u01c3"+
		"\u0005\u0012\u0000\u0000\u01c3\u01c4\u0003\u0016\u000b\u0000\u01c4\u01c5"+
		"\u0005\u0013\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01b1"+
		"\u0001\u0000\u0000\u0000\u01c6\u01b4\u0001\u0000\u0000\u0000\u01c6\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9c\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000$or|\u0084\u008b"+
		"\u0090\u0094\u00b8\u00bd\u00c6\u00cf\u00d6\u00dd\u00e5\u00eb\u00f2\u00fa"+
		"\u0104\u0109\u0112\u0119\u0121\u0127\u012d\u0163\u016b\u0176\u0186\u0189"+
		"\u01a1\u01a4\u01af\u01bb\u01be\u01c6\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}