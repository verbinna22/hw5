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
		RULE_list_expression = 22, RULE_sexp_expression = 23, RULE_pattern_list = 24, 
		RULE_sexprPattern = 25, RULE_wildcardPattern = 26, RULE_arrayPattern = 27, 
		RULE_listPattern = 28, RULE_namedPattern = 29, RULE_namedVarPattern = 30, 
		RULE_decimalPattern = 31, RULE_stringPattern = 32, RULE_charPattern = 33, 
		RULE_truePattern = 34, RULE_falsePattern = 35, RULE_boxTagPattern = 36, 
		RULE_valTagPattern = 37, RULE_strTagPattern = 38, RULE_arrayTagPattern = 39, 
		RULE_sexpTagPattern = 40, RULE_funTagPattern = 41, RULE_patternInBraces = 42, 
		RULE_simplePattern = 43, RULE_consPattern = 44, RULE_pattern = 45, RULE_case_branch = 46, 
		RULE_case_branches = 47, RULE_case_expression = 48, RULE_lambda_expression = 49, 
		RULE_factor = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"simplelanguage", "function", "varSingleDef", "varSingleLineDef", "def", 
			"block", "while_expression", "for_expression", "do_while_expression", 
			"elifSequence", "if_expression", "expression", "ref", "assign_term", 
			"or_term", "logic_term", "logic_factor", "arithmetic", "term", "skip_expression", 
			"expr_list", "array_expression", "list_expression", "sexp_expression", 
			"pattern_list", "sexprPattern", "wildcardPattern", "arrayPattern", "listPattern", 
			"namedPattern", "namedVarPattern", "decimalPattern", "stringPattern", 
			"charPattern", "truePattern", "falsePattern", "boxTagPattern", "valTagPattern", 
			"strTagPattern", "arrayTagPattern", "sexpTagPattern", "funTagPattern", 
			"patternInBraces", "simplePattern", "consPattern", "pattern", "case_branch", 
			"case_branches", "case_expression", "lambda_expression", "factor"
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
			setState(102);
			block();
			setState(103);
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
			setState(105);
			match(T__0);
			setState(106);
			match(IDENTIFIER);
			setState(107);
			((FunctionContext)_localctx).s = match(T__1);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(108);
				match(IDENTIFIER);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(109);
					match(T__2);
					setState(110);
					match(IDENTIFIER);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(T__3);
			setState(119);
			match(T__4);
			setState(120);
			((FunctionContext)_localctx).body = block();
			setState(121);
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
			setState(123);
			match(IDENTIFIER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(124);
				match(T__6);
				setState(125);
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
			setState(128);
			match(T__7);
			setState(129);
			varSingleDef();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(130);
				match(T__2);
				setState(131);
				varSingleDef();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				varSingleLineDef();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
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
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					def();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(149);
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
			setState(152);
			((While_expressionContext)_localctx).w = match(T__8);
			setState(153);
			((While_expressionContext)_localctx).condition = expression();
			setState(154);
			match(T__9);
			setState(155);
			((While_expressionContext)_localctx).body = block();
			setState(156);
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
			setState(158);
			((For_expressionContext)_localctx).f = match(T__11);
			setState(159);
			((For_expressionContext)_localctx).init = block();
			setState(160);
			match(T__2);
			setState(161);
			((For_expressionContext)_localctx).condition = expression();
			setState(162);
			match(T__2);
			setState(163);
			((For_expressionContext)_localctx).last = expression();
			setState(164);
			match(T__9);
			setState(165);
			((For_expressionContext)_localctx).body = block();
			setState(166);
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
			setState(168);
			((Do_while_expressionContext)_localctx).d = match(T__9);
			setState(169);
			((Do_while_expressionContext)_localctx).body = block();
			setState(170);
			match(T__8);
			setState(171);
			((Do_while_expressionContext)_localctx).condition = expression();
			setState(172);
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
			setState(174);
			((ElifSequenceContext)_localctx).el = match(T__12);
			setState(175);
			((ElifSequenceContext)_localctx).cond = expression();
			setState(176);
			match(T__13);
			setState(177);
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
			setState(179);
			((If_expressionContext)_localctx).i = match(T__14);
			setState(180);
			((If_expressionContext)_localctx).condition = expression();
			setState(181);
			match(T__13);
			setState(182);
			((If_expressionContext)_localctx).then = block();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(183);
				elifSequence();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(189);
				match(T__15);
				setState(190);
				((If_expressionContext)_localctx).alt = block();
				}
			}

			setState(193);
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
			setState(195);
			assign_term();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SEQ) {
				{
				{
				setState(196);
				match(OP_SEQ);
				setState(197);
				assign_term();
				}
				}
				setState(202);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DirRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ElemRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				factor(0);
				setState(205);
				match(T__17);
				setState(206);
				expression();
				setState(207);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				ref();
				setState(212);
				match(T__19);
				setState(213);
				assign_term();
				}
				break;
			case 2:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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
			setState(218);
			logic_term();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(219);
				match(OP_OR);
				setState(220);
				logic_term();
				}
				}
				setState(225);
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
			setState(226);
			logic_factor();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(227);
				match(OP_AND);
				setState(228);
				logic_factor();
				}
				}
				setState(233);
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
			setState(234);
			arithmetic();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COMPARE) {
				{
				setState(235);
				match(OP_COMPARE);
				setState(236);
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
			setState(239);
			term();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD) {
				{
				{
				setState(240);
				match(OP_ADD);
				setState(241);
				term();
				}
				}
				setState(246);
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
			setState(247);
			factor(0);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL) {
				{
				{
				setState(248);
				match(OP_MUL);
				setState(249);
				factor(0);
				}
				}
				setState(254);
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
			setState(255);
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
			setState(257);
			expression();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(258);
				match(T__2);
				setState(259);
				expression();
				}
				}
				setState(264);
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
			setState(265);
			match(T__17);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166438L) != 0)) {
				{
				setState(266);
				expr_list();
				}
			}

			setState(269);
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
	public static class List_expressionContext extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public List_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitList_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_expressionContext list_expression() throws RecognitionException {
		List_expressionContext _localctx = new List_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__4);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166438L) != 0)) {
				{
				setState(272);
				expr_list();
				}
			}

			setState(275);
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
		enterRule(_localctx, 46, RULE_sexp_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(UIDENTIFIER);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(278);
				match(T__1);
				setState(279);
				expr_list();
				setState(280);
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
		enterRule(_localctx, 48, RULE_pattern_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			pattern();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(285);
				match(T__2);
				setState(286);
				pattern();
				}
				}
				setState(291);
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
		enterRule(_localctx, 50, RULE_sexprPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(UIDENTIFIER);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(293);
				match(T__1);
				setState(294);
				pattern_list();
				setState(295);
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
		enterRule(_localctx, 52, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 54, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__17);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725728560676900L) != 0)) {
				{
				setState(302);
				pattern_list();
				}
			}

			setState(305);
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
		enterRule(_localctx, 56, RULE_listPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__4);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725728560676900L) != 0)) {
				{
				setState(308);
				pattern_list();
				}
			}

			setState(311);
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
		enterRule(_localctx, 58, RULE_namedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IDENTIFIER);
			setState(314);
			match(T__22);
			setState(315);
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
		enterRule(_localctx, 60, RULE_namedVarPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 62, RULE_decimalPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 64, RULE_stringPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 66, RULE_charPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 68, RULE_truePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 70, RULE_falsePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 72, RULE_boxTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 74, RULE_valTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		enterRule(_localctx, 76, RULE_strTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 78, RULE_arrayTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 80, RULE_sexpTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		enterRule(_localctx, 82, RULE_funTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 84, RULE_patternInBraces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__1);
			setState(342);
			pattern();
			setState(343);
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
		enterRule(_localctx, 86, RULE_simplePattern);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				sexprPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				wildcardPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				arrayPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				listPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				namedPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				namedVarPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				decimalPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(352);
				stringPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				charPattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				truePattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(355);
				falsePattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(356);
				boxTagPattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(357);
				valTagPattern();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(358);
				strTagPattern();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(359);
				arrayTagPattern();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(360);
				sexpTagPattern();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(361);
				funTagPattern();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(362);
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
		enterRule(_localctx, 88, RULE_consPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			simplePattern();
			setState(366);
			match(T__31);
			setState(367);
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
		enterRule(_localctx, 90, RULE_pattern);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				consPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
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
		enterRule(_localctx, 92, RULE_case_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			pattern();
			setState(374);
			match(T__32);
			setState(375);
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
		enterRule(_localctx, 94, RULE_case_branches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			case_branch();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(378);
				match(T__33);
				setState(379);
				case_branch();
				}
				}
				setState(384);
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
		enterRule(_localctx, 96, RULE_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__34);
			setState(386);
			expression();
			setState(387);
			match(T__35);
			setState(388);
			case_branches();
			setState(389);
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
		enterRule(_localctx, 98, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((Lambda_expressionContext)_localctx).b = match(T__0);
			setState(392);
			((Lambda_expressionContext)_localctx).s = match(T__1);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(393);
				match(IDENTIFIER);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(394);
					match(T__2);
					setState(395);
					match(IDENTIFIER);
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(403);
			match(T__3);
			setState(404);
			match(T__4);
			setState(405);
			((Lambda_expressionContext)_localctx).body = block();
			setState(406);
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
	public static class ListExprContext extends FactorContext {
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public ListExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitListExpr(this);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_factor, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(409);
				if_expression();
				}
				break;
			case 2:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				lambda_expression();
				}
				break;
			case 3:
				{
				_localctx = new CaseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411);
				case_expression();
				}
				break;
			case 4:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				array_expression();
				}
				break;
			case 5:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				list_expression();
				}
				break;
			case 6:
				{
				_localctx = new SexpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(414);
				sexp_expression();
				}
				break;
			case 7:
				{
				_localctx = new SkipExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				skip_expression();
				}
				break;
			case 8:
				{
				_localctx = new WhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(416);
				while_expression();
				}
				break;
			case 9:
				{
				_localctx = new ForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(417);
				for_expression();
				}
				break;
			case 10:
				{
				_localctx = new DoWhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(418);
				do_while_expression();
				}
				break;
			case 11:
				{
				_localctx = new DirectCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(419);
				match(IDENTIFIER);
				setState(420);
				match(T__1);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166438L) != 0)) {
					{
					setState(421);
					expression();
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(422);
						match(T__2);
						setState(423);
						expression();
						}
						}
						setState(428);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(431);
				match(T__3);
				}
				break;
			case 12:
				{
				_localctx = new NameAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(433);
				match(STRING_LITERAL);
				}
				break;
			case 14:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(434);
				match(NUMERIC_LITERAL);
				}
				break;
			case 15:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(435);
				match(CHAR_LITERAL);
				}
				break;
			case 16:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(436);
				match(T__1);
				setState(437);
				block();
				setState(438);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PointAccessExprContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(442);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(443);
						match(T__37);
						setState(444);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						_localctx = new IndirectCallContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(445);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(446);
						match(T__1);
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725758640166438L) != 0)) {
							{
							setState(447);
							expression();
							setState(452);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__2) {
								{
								{
								setState(448);
								match(T__2);
								setState(449);
								expression();
								}
								}
								setState(454);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(457);
						match(T__3);
						}
						break;
					case 3:
						{
						_localctx = new IndAccessContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(458);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(459);
						match(T__17);
						setState(460);
						expression();
						setState(461);
						match(T__18);
						}
						break;
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		case 50:
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
		"\u0004\u00014\u01d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001p\b\u0001\n\u0001"+
		"\f\u0001s\t\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u007f\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0085\b\u0003\n\u0003\f\u0003\u0088\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u008e\b\u0004\u0001\u0005\u0005\u0005\u0091"+
		"\b\u0005\n\u0005\f\u0005\u0094\t\u0005\u0001\u0005\u0003\u0005\u0097\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b9\b\n\n\n\f\n\u00bc"+
		"\t\n\u0001\n\u0001\n\u0003\n\u00c0\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00c7\b\u000b\n\u000b\f\u000b\u00ca\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d2\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d9\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00de\b\u000e\n\u000e\f\u000e\u00e1\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e6\b\u000f\n\u000f"+
		"\f\u000f\u00e9\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00ee\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f3\b"+
		"\u0011\n\u0011\f\u0011\u00f6\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00fb\b\u0012\n\u0012\f\u0012\u00fe\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0105\b\u0014\n"+
		"\u0014\f\u0014\u0108\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u010c"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0112"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u011b\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0120\b\u0018\n\u0018\f\u0018\u0123\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u012a\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0130\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0136\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u016c\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u0174\b-\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u017d\b/\n/\f/\u0180"+
		"\t/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00051\u018d\b1\n1\f1\u0190\t1\u00031\u0192\b1\u00011\u00011"+
		"\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0005"+
		"2\u01a9\b2\n2\f2\u01ac\t2\u00032\u01ae\b2\u00012\u00012\u00012\u00012"+
		"\u00012\u00012\u00012\u00012\u00012\u00032\u01b9\b2\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00052\u01c3\b2\n2\f2\u01c6\t2\u0003"+
		"2\u01c8\b2\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u01d0\b2\n"+
		"2\f2\u01d3\t2\u00012\u0000\u0001d3\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bd\u0000\u0000\u01e5\u0000f\u0001\u0000\u0000\u0000\u0002"+
		"i\u0001\u0000\u0000\u0000\u0004{\u0001\u0000\u0000\u0000\u0006\u0080\u0001"+
		"\u0000\u0000\u0000\b\u008d\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000"+
		"\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u009e\u0001\u0000\u0000"+
		"\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000"+
		"\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000"+
		"\u0000\u0018\u00d1\u0001\u0000\u0000\u0000\u001a\u00d8\u0001\u0000\u0000"+
		"\u0000\u001c\u00da\u0001\u0000\u0000\u0000\u001e\u00e2\u0001\u0000\u0000"+
		"\u0000 \u00ea\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000\u0000\u0000"+
		"$\u00f7\u0001\u0000\u0000\u0000&\u00ff\u0001\u0000\u0000\u0000(\u0101"+
		"\u0001\u0000\u0000\u0000*\u0109\u0001\u0000\u0000\u0000,\u010f\u0001\u0000"+
		"\u0000\u0000.\u0115\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u0000"+
		"2\u0124\u0001\u0000\u0000\u00004\u012b\u0001\u0000\u0000\u00006\u012d"+
		"\u0001\u0000\u0000\u00008\u0133\u0001\u0000\u0000\u0000:\u0139\u0001\u0000"+
		"\u0000\u0000<\u013d\u0001\u0000\u0000\u0000>\u013f\u0001\u0000\u0000\u0000"+
		"@\u0141\u0001\u0000\u0000\u0000B\u0143\u0001\u0000\u0000\u0000D\u0145"+
		"\u0001\u0000\u0000\u0000F\u0147\u0001\u0000\u0000\u0000H\u0149\u0001\u0000"+
		"\u0000\u0000J\u014b\u0001\u0000\u0000\u0000L\u014d\u0001\u0000\u0000\u0000"+
		"N\u014f\u0001\u0000\u0000\u0000P\u0151\u0001\u0000\u0000\u0000R\u0153"+
		"\u0001\u0000\u0000\u0000T\u0155\u0001\u0000\u0000\u0000V\u016b\u0001\u0000"+
		"\u0000\u0000X\u016d\u0001\u0000\u0000\u0000Z\u0173\u0001\u0000\u0000\u0000"+
		"\\\u0175\u0001\u0000\u0000\u0000^\u0179\u0001\u0000\u0000\u0000`\u0181"+
		"\u0001\u0000\u0000\u0000b\u0187\u0001\u0000\u0000\u0000d\u01b8\u0001\u0000"+
		"\u0000\u0000fg\u0003\n\u0005\u0000gh\u0005\u0000\u0000\u0001h\u0001\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000jk\u00050\u0000\u0000kt\u0005"+
		"\u0002\u0000\u0000lq\u00050\u0000\u0000mn\u0005\u0003\u0000\u0000np\u0005"+
		"0\u0000\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0005\u0005"+
		"\u0000\u0000xy\u0003\n\u0005\u0000yz\u0005\u0006\u0000\u0000z\u0003\u0001"+
		"\u0000\u0000\u0000{~\u00050\u0000\u0000|}\u0005\u0007\u0000\u0000}\u007f"+
		"\u0003\u001c\u000e\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0005\u0001\u0000\u0000\u0000\u0080\u0081\u0005\b\u0000"+
		"\u0000\u0081\u0086\u0003\u0004\u0002\u0000\u0082\u0083\u0005\u0003\u0000"+
		"\u0000\u0083\u0085\u0003\u0004\u0002\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005*\u0000\u0000"+
		"\u008a\u0007\u0001\u0000\u0000\u0000\u008b\u008e\u0003\u0006\u0003\u0000"+
		"\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\t\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0003\b\u0004\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0016\u000b\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u000b"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009a\u0003"+
		"\u0016\u000b\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b\u009c\u0003\n"+
		"\u0005\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\r\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\f\u0000\u0000\u009f\u00a0\u0003\n\u0005\u0000"+
		"\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000"+
		"\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0003\u0016\u000b\u0000"+
		"\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u00a6\u0003\n\u0005\u0000\u00a6"+
		"\u00a7\u0005\u000b\u0000\u0000\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\n\u0000\u0000\u00a9\u00aa\u0003\n\u0005\u0000\u00aa\u00ab"+
		"\u0005\t\u0000\u0000\u00ab\u00ac\u0003\u0016\u000b\u0000\u00ac\u00ad\u0005"+
		"\u000b\u0000\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\r\u0000\u0000\u00af\u00b0\u0003\u0016\u000b\u0000\u00b0\u00b1\u0005\u000e"+
		"\u0000\u0000\u00b1\u00b2\u0003\n\u0005\u0000\u00b2\u0013\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u000f\u0000\u0000\u00b4\u00b5\u0003\u0016\u000b"+
		"\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6\u00ba\u0003\n\u0005\u0000"+
		"\u00b7\u00b9\u0003\u0012\t\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0010\u0000\u0000\u00be"+
		"\u00c0\u0003\n\u0005\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0011\u0000\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3\u00c8"+
		"\u0003\u001a\r\u0000\u00c4\u00c5\u0005*\u0000\u0000\u00c5\u00c7\u0003"+
		"\u001a\r\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00d2\u00050\u0000\u0000\u00cc\u00cd\u0003d2\u0000"+
		"\u00cd\u00ce\u0005\u0012\u0000\u0000\u00ce\u00cf\u0003\u0016\u000b\u0000"+
		"\u00cf\u00d0\u0005\u0013\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d2\u0019\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u0018\f\u0000\u00d4"+
		"\u00d5\u0005\u0014\u0000\u0000\u00d5\u00d6\u0003\u001a\r\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003\u001c\u000e\u0000\u00d8\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u001b"+
		"\u0001\u0000\u0000\u0000\u00da\u00df\u0003\u001e\u000f\u0000\u00db\u00dc"+
		"\u0005+\u0000\u0000\u00dc\u00de\u0003\u001e\u000f\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u001d\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003"+
		" \u0010\u0000\u00e3\u00e4\u0005,\u0000\u0000\u00e4\u00e6\u0003 \u0010"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u001f\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0003\"\u0011\u0000\u00eb\u00ec\u0005-\u0000\u0000"+
		"\u00ec\u00ee\u0003\"\u0011\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00f4"+
		"\u0003$\u0012\u0000\u00f0\u00f1\u0005.\u0000\u0000\u00f1\u00f3\u0003$"+
		"\u0012\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5#\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fc\u0003d2\u0000\u00f8\u00f9\u0005/\u0000\u0000\u00f9"+
		"\u00fb\u0003d2\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\u0015\u0000\u0000\u0100\'\u0001\u0000\u0000"+
		"\u0000\u0101\u0106\u0003\u0016\u000b\u0000\u0102\u0103\u0005\u0003\u0000"+
		"\u0000\u0103\u0105\u0003\u0016\u000b\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107)\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010b\u0005\u0012\u0000\u0000"+
		"\u010a\u010c\u0003(\u0014\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005\u0013\u0000\u0000\u010e+\u0001\u0000\u0000\u0000\u010f\u0111"+
		"\u0005\u0005\u0000\u0000\u0110\u0112\u0003(\u0014\u0000\u0111\u0110\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\u0006\u0000\u0000\u0114-\u0001\u0000"+
		"\u0000\u0000\u0115\u011a\u00051\u0000\u0000\u0116\u0117\u0005\u0002\u0000"+
		"\u0000\u0117\u0118\u0003(\u0014\u0000\u0118\u0119\u0005\u0004\u0000\u0000"+
		"\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b/\u0001\u0000\u0000\u0000\u011c"+
		"\u0121\u0003Z-\u0000\u011d\u011e\u0005\u0003\u0000\u0000\u011e\u0120\u0003"+
		"Z-\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0129\u00051\u0000\u0000\u0125\u0126\u0005\u0002\u0000\u0000\u0126"+
		"\u0127\u00030\u0018\u0000\u0127\u0128\u0005\u0004\u0000\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a3\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"\u0016\u0000\u0000\u012c5\u0001\u0000\u0000\u0000\u012d\u012f\u0005\u0012"+
		"\u0000\u0000\u012e\u0130\u00030\u0018\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u0013\u0000\u0000\u01327\u0001\u0000\u0000\u0000"+
		"\u0133\u0135\u0005\u0005\u0000\u0000\u0134\u0136\u00030\u0018\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0006\u0000\u0000\u0138"+
		"9\u0001\u0000\u0000\u0000\u0139\u013a\u00050\u0000\u0000\u013a\u013b\u0005"+
		"\u0017\u0000\u0000\u013b\u013c\u0003Z-\u0000\u013c;\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u00050\u0000\u0000\u013e=\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u00054\u0000\u0000\u0140?\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"2\u0000\u0000\u0142A\u0001\u0000\u0000\u0000\u0143\u0144\u00053\u0000"+
		"\u0000\u0144C\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0018\u0000\u0000"+
		"\u0146E\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0019\u0000\u0000\u0148"+
		"G\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u001a\u0000\u0000\u014aI\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0005\u001b\u0000\u0000\u014cK\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\u001c\u0000\u0000\u014eM\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005\u001d\u0000\u0000\u0150O\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005\u001e\u0000\u0000\u0152Q\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0005\u001f\u0000\u0000\u0154S\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0005\u0002\u0000\u0000\u0156\u0157\u0003Z-\u0000\u0157\u0158\u0005\u0004"+
		"\u0000\u0000\u0158U\u0001\u0000\u0000\u0000\u0159\u016c\u00032\u0019\u0000"+
		"\u015a\u016c\u00034\u001a\u0000\u015b\u016c\u00036\u001b\u0000\u015c\u016c"+
		"\u00038\u001c\u0000\u015d\u016c\u0003:\u001d\u0000\u015e\u016c\u0003<"+
		"\u001e\u0000\u015f\u016c\u0003>\u001f\u0000\u0160\u016c\u0003@ \u0000"+
		"\u0161\u016c\u0003B!\u0000\u0162\u016c\u0003D\"\u0000\u0163\u016c\u0003"+
		"F#\u0000\u0164\u016c\u0003H$\u0000\u0165\u016c\u0003J%\u0000\u0166\u016c"+
		"\u0003L&\u0000\u0167\u016c\u0003N\'\u0000\u0168\u016c\u0003P(\u0000\u0169"+
		"\u016c\u0003R)\u0000\u016a\u016c\u0003T*\u0000\u016b\u0159\u0001\u0000"+
		"\u0000\u0000\u016b\u015a\u0001\u0000\u0000\u0000\u016b\u015b\u0001\u0000"+
		"\u0000\u0000\u016b\u015c\u0001\u0000\u0000\u0000\u016b\u015d\u0001\u0000"+
		"\u0000\u0000\u016b\u015e\u0001\u0000\u0000\u0000\u016b\u015f\u0001\u0000"+
		"\u0000\u0000\u016b\u0160\u0001\u0000\u0000\u0000\u016b\u0161\u0001\u0000"+
		"\u0000\u0000\u016b\u0162\u0001\u0000\u0000\u0000\u016b\u0163\u0001\u0000"+
		"\u0000\u0000\u016b\u0164\u0001\u0000\u0000\u0000\u016b\u0165\u0001\u0000"+
		"\u0000\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000"+
		"\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016cW\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0003V+\u0000\u016e\u016f\u0005 \u0000\u0000\u016f"+
		"\u0170\u0003Z-\u0000\u0170Y\u0001\u0000\u0000\u0000\u0171\u0174\u0003"+
		"X,\u0000\u0172\u0174\u0003V+\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0174[\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0003Z-\u0000\u0176\u0177\u0005!\u0000\u0000\u0177\u0178\u0003"+
		"\n\u0005\u0000\u0178]\u0001\u0000\u0000\u0000\u0179\u017e\u0003\\.\u0000"+
		"\u017a\u017b\u0005\"\u0000\u0000\u017b\u017d\u0003\\.\u0000\u017c\u017a"+
		"\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f_\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"#\u0000\u0000\u0182\u0183\u0003\u0016\u000b\u0000\u0183\u0184\u0005$\u0000"+
		"\u0000\u0184\u0185\u0003^/\u0000\u0185\u0186\u0005%\u0000\u0000\u0186"+
		"a\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u0001\u0000\u0000\u0188\u0191"+
		"\u0005\u0002\u0000\u0000\u0189\u018e\u00050\u0000\u0000\u018a\u018b\u0005"+
		"\u0003\u0000\u0000\u018b\u018d\u00050\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0189\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005\u0004\u0000\u0000\u0194\u0195\u0005\u0005"+
		"\u0000\u0000\u0195\u0196\u0003\n\u0005\u0000\u0196\u0197\u0005\u0006\u0000"+
		"\u0000\u0197c\u0001\u0000\u0000\u0000\u0198\u0199\u00062\uffff\uffff\u0000"+
		"\u0199\u01b9\u0003\u0014\n\u0000\u019a\u01b9\u0003b1\u0000\u019b\u01b9"+
		"\u0003`0\u0000\u019c\u01b9\u0003*\u0015\u0000\u019d\u01b9\u0003,\u0016"+
		"\u0000\u019e\u01b9\u0003.\u0017\u0000\u019f\u01b9\u0003&\u0013\u0000\u01a0"+
		"\u01b9\u0003\f\u0006\u0000\u01a1\u01b9\u0003\u000e\u0007\u0000\u01a2\u01b9"+
		"\u0003\u0010\b\u0000\u01a3\u01a4\u00050\u0000\u0000\u01a4\u01ad\u0005"+
		"\u0002\u0000\u0000\u01a5\u01aa\u0003\u0016\u000b\u0000\u01a6\u01a7\u0005"+
		"\u0003\u0000\u0000\u01a7\u01a9\u0003\u0016\u000b\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01a5\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b9\u0005\u0004\u0000\u0000\u01b0\u01b9\u0005"+
		"0\u0000\u0000\u01b1\u01b9\u00052\u0000\u0000\u01b2\u01b9\u00054\u0000"+
		"\u0000\u01b3\u01b9\u00053\u0000\u0000\u01b4\u01b5\u0005\u0002\u0000\u0000"+
		"\u01b5\u01b6\u0003\n\u0005\u0000\u01b6\u01b7\u0005\u0004\u0000\u0000\u01b7"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b8\u0198\u0001\u0000\u0000\u0000\u01b8"+
		"\u019a\u0001\u0000\u0000\u0000\u01b8\u019b\u0001\u0000\u0000\u0000\u01b8"+
		"\u019c\u0001\u0000\u0000\u0000\u01b8\u019d\u0001\u0000\u0000\u0000\u01b8"+
		"\u019e\u0001\u0000\u0000\u0000\u01b8\u019f\u0001\u0000\u0000\u0000\u01b8"+
		"\u01a0\u0001\u0000\u0000\u0000\u01b8\u01a1\u0001\u0000\u0000\u0000\u01b8"+
		"\u01a2\u0001\u0000\u0000\u0000\u01b8\u01a3\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b8\u01b1\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b8\u01b3\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b9\u01d1\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\n\t\u0000\u0000\u01bb\u01bc\u0005&\u0000\u0000\u01bc\u01d0\u0005"+
		"0\u0000\u0000\u01bd\u01be\n\u0007\u0000\u0000\u01be\u01c7\u0005\u0002"+
		"\u0000\u0000\u01bf\u01c4\u0003\u0016\u000b\u0000\u01c0\u01c1\u0005\u0003"+
		"\u0000\u0000\u01c1\u01c3\u0003\u0016\u000b\u0000\u01c2\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01d0\u0005\u0004\u0000\u0000\u01ca\u01cb\n\u0005\u0000"+
		"\u0000\u01cb\u01cc\u0005\u0012\u0000\u0000\u01cc\u01cd\u0003\u0016\u000b"+
		"\u0000\u01cd\u01ce\u0005\u0013\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000"+
		"\u0000\u01cf\u01ba\u0001\u0000\u0000\u0000\u01cf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2e\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"%qt~\u0086\u008d\u0092\u0096\u00ba\u00bf\u00c8\u00d1\u00d8\u00df\u00e7"+
		"\u00ed\u00f4\u00fc\u0106\u010b\u0111\u011a\u0121\u0129\u012f\u0135\u016b"+
		"\u0173\u017e\u018e\u0191\u01aa\u01ad\u01b8\u01c4\u01c7\u01cf\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}