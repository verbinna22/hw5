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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WS=38, COMMENT=39, 
		LINE_COMMENT=40, OP_SEQ=41, OP_CONS=42, OP_OR=43, OP_AND=44, OP_COMPARE=45, 
		OP_ADD=46, OP_MUL=47, IDENTIFIER=48, UIDENTIFIER=49, STRING_LITERAL=50, 
		CHAR_LITERAL=51, NUMERIC_LITERAL=52;
	public static final int
		RULE_simplelanguage = 0, RULE_function = 1, RULE_varSingleDef = 2, RULE_varSingleLineDef = 3, 
		RULE_def = 4, RULE_block = 5, RULE_while_expression = 6, RULE_for_expression = 7, 
		RULE_do_while_expression = 8, RULE_elifSequence = 9, RULE_if_expression = 10, 
		RULE_expression = 11, RULE_ref = 12, RULE_assign_term = 13, RULE_list_term = 14, 
		RULE_or_term = 15, RULE_logic_term = 16, RULE_logic_factor = 17, RULE_arithmetic = 18, 
		RULE_term = 19, RULE_skip_expression = 20, RULE_expr_list = 21, RULE_array_expression = 22, 
		RULE_list_expression = 23, RULE_sexp_expression = 24, RULE_pattern_list = 25, 
		RULE_sexprPattern = 26, RULE_wildcardPattern = 27, RULE_arrayPattern = 28, 
		RULE_listPattern = 29, RULE_namedPattern = 30, RULE_namedVarPattern = 31, 
		RULE_decimalPattern = 32, RULE_stringPattern = 33, RULE_charPattern = 34, 
		RULE_truePattern = 35, RULE_falsePattern = 36, RULE_boxTagPattern = 37, 
		RULE_valTagPattern = 38, RULE_strTagPattern = 39, RULE_arrayTagPattern = 40, 
		RULE_sexpTagPattern = 41, RULE_funTagPattern = 42, RULE_patternInBraces = 43, 
		RULE_simplePattern = 44, RULE_consPattern = 45, RULE_pattern = 46, RULE_case_branch = 47, 
		RULE_case_branches = 48, RULE_case_expression = 49, RULE_lambda_expression = 50, 
		RULE_factor = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"simplelanguage", "function", "varSingleDef", "varSingleLineDef", "def", 
			"block", "while_expression", "for_expression", "do_while_expression", 
			"elifSequence", "if_expression", "expression", "ref", "assign_term", 
			"list_term", "or_term", "logic_term", "logic_factor", "arithmetic", "term", 
			"skip_expression", "expr_list", "array_expression", "list_expression", 
			"sexp_expression", "pattern_list", "sexprPattern", "wildcardPattern", 
			"arrayPattern", "listPattern", "namedPattern", "namedVarPattern", "decimalPattern", 
			"stringPattern", "charPattern", "truePattern", "falsePattern", "boxTagPattern", 
			"valTagPattern", "strTagPattern", "arrayTagPattern", "sexpTagPattern", 
			"funTagPattern", "patternInBraces", "simplePattern", "consPattern", "pattern", 
			"case_branch", "case_branches", "case_expression", "lambda_expression", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'('", "','", "')'", "'{'", "'}'", "'='", "'var'", "'while'", 
			"'do'", "'od'", "'for'", "'elif'", "'then'", "'if'", "'else'", "'fi'", 
			"'['", "']'", "':='", "'skip'", "'_'", "'@'", "'true'", "'false'", "'#box'", 
			"'#val'", "'#str'", "'#array'", "'#sexp'", "'#fun'", "'->'", "'|'", "'case'", 
			"'of'", "'esac'", "'.'", null, null, null, "';'", "':'", "'!!'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "COMMENT", "LINE_COMMENT", "OP_SEQ", "OP_CONS", "OP_OR", 
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
			setState(104);
			block();
			setState(105);
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
			setState(107);
			match(T__0);
			setState(108);
			match(IDENTIFIER);
			setState(109);
			((FunctionContext)_localctx).s = match(T__1);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(110);
				match(IDENTIFIER);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(111);
					match(T__2);
					setState(112);
					match(IDENTIFIER);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(T__3);
			setState(121);
			match(T__4);
			setState(122);
			((FunctionContext)_localctx).body = block();
			setState(123);
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
		public List_termContext val;
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public List_termContext list_term() {
			return getRuleContext(List_termContext.class,0);
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
			setState(125);
			match(IDENTIFIER);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(126);
				match(T__6);
				setState(127);
				((VarSingleDefContext)_localctx).val = list_term();
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
			setState(130);
			match(T__7);
			setState(131);
			varSingleDef();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(132);
				match(T__2);
				setState(133);
				varSingleDef();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				varSingleLineDef();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					def();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(151);
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
			setState(154);
			((While_expressionContext)_localctx).w = match(T__8);
			setState(155);
			((While_expressionContext)_localctx).condition = expression();
			setState(156);
			match(T__9);
			setState(157);
			((While_expressionContext)_localctx).body = block();
			setState(158);
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
			setState(160);
			((For_expressionContext)_localctx).f = match(T__11);
			setState(161);
			((For_expressionContext)_localctx).init = block();
			setState(162);
			match(T__2);
			setState(163);
			((For_expressionContext)_localctx).condition = expression();
			setState(164);
			match(T__2);
			setState(165);
			((For_expressionContext)_localctx).last = expression();
			setState(166);
			match(T__9);
			setState(167);
			((For_expressionContext)_localctx).body = block();
			setState(168);
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
			setState(170);
			((Do_while_expressionContext)_localctx).d = match(T__9);
			setState(171);
			((Do_while_expressionContext)_localctx).body = block();
			setState(172);
			match(T__8);
			setState(173);
			((Do_while_expressionContext)_localctx).condition = expression();
			setState(174);
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
			setState(176);
			((ElifSequenceContext)_localctx).el = match(T__12);
			setState(177);
			((ElifSequenceContext)_localctx).cond = expression();
			setState(178);
			match(T__13);
			setState(179);
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
			setState(181);
			((If_expressionContext)_localctx).i = match(T__14);
			setState(182);
			((If_expressionContext)_localctx).condition = expression();
			setState(183);
			match(T__13);
			setState(184);
			((If_expressionContext)_localctx).then = block();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(185);
				elifSequence();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(191);
				match(T__15);
				setState(192);
				((If_expressionContext)_localctx).alt = block();
				}
			}

			setState(195);
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
			setState(197);
			assign_term();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SEQ) {
				{
				{
				setState(198);
				match(OP_SEQ);
				setState(199);
				assign_term();
				}
				}
				setState(204);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DirRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ElemRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				factor(0);
				setState(207);
				match(T__17);
				setState(208);
				expression();
				setState(209);
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
		public List_termContext list_term() {
			return getRuleContext(List_termContext.class,0);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				ref();
				setState(214);
				match(T__19);
				setState(215);
				assign_term();
				}
				break;
			case 2:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				list_term();
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
	public static class List_termContext extends ParserRuleContext {
		public List<Or_termContext> or_term() {
			return getRuleContexts(Or_termContext.class);
		}
		public Or_termContext or_term(int i) {
			return getRuleContext(Or_termContext.class,i);
		}
		public List<TerminalNode> OP_CONS() { return getTokens(SimpleLanguageParser.OP_CONS); }
		public TerminalNode OP_CONS(int i) {
			return getToken(SimpleLanguageParser.OP_CONS, i);
		}
		public List_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitList_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_termContext list_term() throws RecognitionException {
		List_termContext _localctx = new List_termContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			or_term();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_CONS) {
				{
				{
				setState(221);
				match(OP_CONS);
				setState(222);
				or_term();
				}
				}
				setState(227);
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
		enterRule(_localctx, 30, RULE_or_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			logic_term();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(229);
				match(OP_OR);
				setState(230);
				logic_term();
				}
				}
				setState(235);
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
		enterRule(_localctx, 32, RULE_logic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			logic_factor();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(237);
				match(OP_AND);
				setState(238);
				logic_factor();
				}
				}
				setState(243);
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
		enterRule(_localctx, 34, RULE_logic_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			arithmetic();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COMPARE) {
				{
				setState(245);
				match(OP_COMPARE);
				setState(246);
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
		enterRule(_localctx, 36, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			term();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD) {
				{
				{
				setState(250);
				match(OP_ADD);
				setState(251);
				term();
				}
				}
				setState(256);
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
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			factor(0);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL) {
				{
				{
				setState(258);
				match(OP_MUL);
				setState(259);
				factor(0);
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
		enterRule(_localctx, 40, RULE_skip_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 42, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expression();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(268);
				match(T__2);
				setState(269);
				expression();
				}
				}
				setState(274);
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
		enterRule(_localctx, 44, RULE_array_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__17);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725741460297254L) != 0)) {
				{
				setState(276);
				expr_list();
				}
			}

			setState(279);
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
		enterRule(_localctx, 46, RULE_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__4);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725741460297254L) != 0)) {
				{
				setState(282);
				expr_list();
				}
			}

			setState(285);
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
		enterRule(_localctx, 48, RULE_sexp_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(UIDENTIFIER);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(288);
				match(T__1);
				setState(289);
				expr_list();
				setState(290);
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
		enterRule(_localctx, 50, RULE_pattern_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			pattern();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(295);
				match(T__2);
				setState(296);
				pattern();
				}
				}
				setState(301);
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
		enterRule(_localctx, 52, RULE_sexprPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(UIDENTIFIER);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(303);
				match(T__1);
				setState(304);
				pattern_list();
				setState(305);
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
		enterRule(_localctx, 54, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 56, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__17);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725728560676900L) != 0)) {
				{
				setState(312);
				pattern_list();
				}
			}

			setState(315);
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
		enterRule(_localctx, 58, RULE_listPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__4);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725728560676900L) != 0)) {
				{
				setState(318);
				pattern_list();
				}
			}

			setState(321);
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
		enterRule(_localctx, 60, RULE_namedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IDENTIFIER);
			setState(324);
			match(T__22);
			setState(325);
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
		enterRule(_localctx, 62, RULE_namedVarPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 64, RULE_decimalPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 66, RULE_stringPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		enterRule(_localctx, 68, RULE_charPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 70, RULE_truePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 72, RULE_falsePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		enterRule(_localctx, 74, RULE_boxTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 76, RULE_valTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 78, RULE_strTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		enterRule(_localctx, 80, RULE_arrayTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		enterRule(_localctx, 82, RULE_sexpTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 84, RULE_funTagPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 86, RULE_patternInBraces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__1);
			setState(352);
			pattern();
			setState(353);
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
		enterRule(_localctx, 88, RULE_simplePattern);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				sexprPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				wildcardPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				arrayPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				listPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				namedPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				namedVarPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
				decimalPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				stringPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(363);
				charPattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(364);
				truePattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(365);
				falsePattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(366);
				boxTagPattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(367);
				valTagPattern();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(368);
				strTagPattern();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(369);
				arrayTagPattern();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(370);
				sexpTagPattern();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(371);
				funTagPattern();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(372);
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
		public TerminalNode OP_CONS() { return getToken(SimpleLanguageParser.OP_CONS, 0); }
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
		enterRule(_localctx, 90, RULE_consPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			simplePattern();
			setState(376);
			match(OP_CONS);
			setState(377);
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
		enterRule(_localctx, 92, RULE_pattern);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				consPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
		enterRule(_localctx, 94, RULE_case_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			pattern();
			setState(384);
			match(T__31);
			setState(385);
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
		enterRule(_localctx, 96, RULE_case_branches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			case_branch();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(388);
				match(T__32);
				setState(389);
				case_branch();
				}
				}
				setState(394);
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
		enterRule(_localctx, 98, RULE_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__33);
			setState(396);
			expression();
			setState(397);
			match(T__34);
			setState(398);
			case_branches();
			setState(399);
			match(T__35);
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
		enterRule(_localctx, 100, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((Lambda_expressionContext)_localctx).b = match(T__0);
			setState(402);
			((Lambda_expressionContext)_localctx).s = match(T__1);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(403);
				match(IDENTIFIER);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(404);
					match(T__2);
					setState(405);
					match(IDENTIFIER);
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(413);
			match(T__3);
			setState(414);
			match(T__4);
			setState(415);
			((Lambda_expressionContext)_localctx).body = block();
			setState(416);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_factor, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(419);
				if_expression();
				}
				break;
			case 2:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				lambda_expression();
				}
				break;
			case 3:
				{
				_localctx = new CaseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421);
				case_expression();
				}
				break;
			case 4:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				array_expression();
				}
				break;
			case 5:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(423);
				list_expression();
				}
				break;
			case 6:
				{
				_localctx = new SexpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				sexp_expression();
				}
				break;
			case 7:
				{
				_localctx = new SkipExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				skip_expression();
				}
				break;
			case 8:
				{
				_localctx = new WhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				while_expression();
				}
				break;
			case 9:
				{
				_localctx = new ForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427);
				for_expression();
				}
				break;
			case 10:
				{
				_localctx = new DoWhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				do_while_expression();
				}
				break;
			case 11:
				{
				_localctx = new DirectCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(429);
				match(IDENTIFIER);
				setState(430);
				match(T__1);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725741460297254L) != 0)) {
					{
					setState(431);
					expression();
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(432);
						match(T__2);
						setState(433);
						expression();
						}
						}
						setState(438);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(441);
				match(T__3);
				}
				break;
			case 12:
				{
				_localctx = new NameAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(442);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(443);
				match(STRING_LITERAL);
				}
				break;
			case 14:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(444);
				match(NUMERIC_LITERAL);
				}
				break;
			case 15:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(445);
				match(CHAR_LITERAL);
				}
				break;
			case 16:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(446);
				match(T__1);
				setState(447);
				block();
				setState(448);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new PointAccessExprContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(452);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(453);
						match(T__36);
						setState(454);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						_localctx = new IndirectCallContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(455);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(456);
						match(T__1);
						setState(465);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725741460297254L) != 0)) {
							{
							setState(457);
							expression();
							setState(462);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__2) {
								{
								{
								setState(458);
								match(T__2);
								setState(459);
								expression();
								}
								}
								setState(464);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(467);
						match(T__3);
						}
						break;
					case 3:
						{
						_localctx = new IndAccessContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(468);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(469);
						match(T__17);
						setState(470);
						expression();
						setState(471);
						match(T__18);
						}
						break;
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		case 51:
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
		"\u0004\u00014\u01df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"r\b\u0001\n\u0001\f\u0001u\t\u0001\u0003\u0001w\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0081\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0087\b\u0003\n\u0003\f\u0003\u008a\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0090\b\u0004\u0001\u0005"+
		"\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001\u0005\u0003"+
		"\u0005\u0099\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00bb\b\n\n"+
		"\n\f\n\u00be\t\n\u0001\n\u0001\n\u0003\n\u00c2\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c9\b\u000b\n\u000b\f\u000b"+
		"\u00cc\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00d4\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00db\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e0\b\u000e\n\u000e\f\u000e"+
		"\u00e3\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e8\b"+
		"\u000f\n\u000f\f\u000f\u00eb\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00f0\b\u0010\n\u0010\f\u0010\u00f3\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00f8\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00fd\b\u0012\n\u0012\f\u0012\u0100\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0105\b\u0013\n\u0013\f\u0013\u0108"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u010f\b\u0015\n\u0015\f\u0015\u0112\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0116\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u011c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0125\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u012a\b\u0019\n\u0019\f\u0019\u012d"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0134\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u013a\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0140\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0176\b,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u017e"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00050\u0187\b0\n"+
		"0\f0\u018a\t0\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012"+
		"\u00012\u00012\u00012\u00052\u0197\b2\n2\f2\u019a\t2\u00032\u019c\b2\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00053\u01b3\b3\n3\f3\u01b6\t3\u00033\u01b8\b3\u00013\u00013\u00013"+
		"\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u01c3\b3\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00053\u01cd\b3\n3\f3\u01d0"+
		"\t3\u00033\u01d2\b3\u00013\u00013\u00013\u00013\u00013\u00013\u00053\u01da"+
		"\b3\n3\f3\u01dd\t3\u00013\u0000\u0001f4\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0000\u01ef\u0000h\u0001\u0000\u0000\u0000"+
		"\u0002k\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000\u0006\u0082"+
		"\u0001\u0000\u0000\u0000\b\u008f\u0001\u0000\u0000\u0000\n\u0094\u0001"+
		"\u0000\u0000\u0000\f\u009a\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000"+
		"\u0000\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00b0\u0001\u0000"+
		"\u0000\u0000\u0014\u00b5\u0001\u0000\u0000\u0000\u0016\u00c5\u0001\u0000"+
		"\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a\u00da\u0001\u0000"+
		"\u0000\u0000\u001c\u00dc\u0001\u0000\u0000\u0000\u001e\u00e4\u0001\u0000"+
		"\u0000\u0000 \u00ec\u0001\u0000\u0000\u0000\"\u00f4\u0001\u0000\u0000"+
		"\u0000$\u00f9\u0001\u0000\u0000\u0000&\u0101\u0001\u0000\u0000\u0000("+
		"\u0109\u0001\u0000\u0000\u0000*\u010b\u0001\u0000\u0000\u0000,\u0113\u0001"+
		"\u0000\u0000\u0000.\u0119\u0001\u0000\u0000\u00000\u011f\u0001\u0000\u0000"+
		"\u00002\u0126\u0001\u0000\u0000\u00004\u012e\u0001\u0000\u0000\u00006"+
		"\u0135\u0001\u0000\u0000\u00008\u0137\u0001\u0000\u0000\u0000:\u013d\u0001"+
		"\u0000\u0000\u0000<\u0143\u0001\u0000\u0000\u0000>\u0147\u0001\u0000\u0000"+
		"\u0000@\u0149\u0001\u0000\u0000\u0000B\u014b\u0001\u0000\u0000\u0000D"+
		"\u014d\u0001\u0000\u0000\u0000F\u014f\u0001\u0000\u0000\u0000H\u0151\u0001"+
		"\u0000\u0000\u0000J\u0153\u0001\u0000\u0000\u0000L\u0155\u0001\u0000\u0000"+
		"\u0000N\u0157\u0001\u0000\u0000\u0000P\u0159\u0001\u0000\u0000\u0000R"+
		"\u015b\u0001\u0000\u0000\u0000T\u015d\u0001\u0000\u0000\u0000V\u015f\u0001"+
		"\u0000\u0000\u0000X\u0175\u0001\u0000\u0000\u0000Z\u0177\u0001\u0000\u0000"+
		"\u0000\\\u017d\u0001\u0000\u0000\u0000^\u017f\u0001\u0000\u0000\u0000"+
		"`\u0183\u0001\u0000\u0000\u0000b\u018b\u0001\u0000\u0000\u0000d\u0191"+
		"\u0001\u0000\u0000\u0000f\u01c2\u0001\u0000\u0000\u0000hi\u0003\n\u0005"+
		"\u0000ij\u0005\u0000\u0000\u0001j\u0001\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0001\u0000\u0000lm\u00050\u0000\u0000mv\u0005\u0002\u0000\u0000ns\u0005"+
		"0\u0000\u0000op\u0005\u0003\u0000\u0000pr\u00050\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"vn\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0004\u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0003\n\u0005"+
		"\u0000{|\u0005\u0006\u0000\u0000|\u0003\u0001\u0000\u0000\u0000}\u0080"+
		"\u00050\u0000\u0000~\u007f\u0005\u0007\u0000\u0000\u007f\u0081\u0003\u001c"+
		"\u000e\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0005\u0001\u0000\u0000\u0000\u0082\u0083\u0005\b\u0000\u0000"+
		"\u0083\u0088\u0003\u0004\u0002\u0000\u0084\u0085\u0005\u0003\u0000\u0000"+
		"\u0085\u0087\u0003\u0004\u0002\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005)\u0000\u0000\u008c"+
		"\u0007\u0001\u0000\u0000\u0000\u008d\u0090\u0003\u0006\u0003\u0000\u008e"+
		"\u0090\u0003\u0002\u0001\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\t\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0003\b\u0004\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0003\u0016\u000b\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u000b\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c\u0003\u0016"+
		"\u000b\u0000\u009c\u009d\u0005\n\u0000\u0000\u009d\u009e\u0003\n\u0005"+
		"\u0000\u009e\u009f\u0005\u000b\u0000\u0000\u009f\r\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\f\u0000\u0000\u00a1\u00a2\u0003\n\u0005\u0000\u00a2"+
		"\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4"+
		"\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a6\u0003\u0016\u000b\u0000\u00a6"+
		"\u00a7\u0005\n\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000\u00a8\u00a9"+
		"\u0005\u000b\u0000\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\n\u0000\u0000\u00ab\u00ac\u0003\n\u0005\u0000\u00ac\u00ad\u0005"+
		"\t\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000\u00ae\u00af\u0005\u000b"+
		"\u0000\u0000\u00af\u0011\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\r\u0000"+
		"\u0000\u00b1\u00b2\u0003\u0016\u000b\u0000\u00b2\u00b3\u0005\u000e\u0000"+
		"\u0000\u00b3\u00b4\u0003\n\u0005\u0000\u00b4\u0013\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00b7\u0003\u0016\u000b\u0000"+
		"\u00b7\u00b8\u0005\u000e\u0000\u0000\u00b8\u00bc\u0003\n\u0005\u0000\u00b9"+
		"\u00bb\u0003\u0012\t\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c1\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0010\u0000\u0000\u00c0\u00c2"+
		"\u0003\n\u0005\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0011\u0000\u0000\u00c4\u0015\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003"+
		"\u001a\r\u0000\u00c6\u00c7\u0005)\u0000\u0000\u00c7\u00c9\u0003\u001a"+
		"\r\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d4\u00050\u0000\u0000\u00ce\u00cf\u0003f3\u0000\u00cf"+
		"\u00d0\u0005\u0012\u0000\u0000\u00d0\u00d1\u0003\u0016\u000b\u0000\u00d1"+
		"\u00d2\u0005\u0013\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d4"+
		"\u0019\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d7"+
		"\u0005\u0014\u0000\u0000\u00d7\u00d8\u0003\u001a\r\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0003\u001c\u000e\u0000\u00da\u00d5\u0001"+
		"\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u001b\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e1\u0003\u001e\u000f\u0000\u00dd\u00de\u0005"+
		"*\u0000\u0000\u00de\u00e0\u0003\u001e\u000f\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u001d\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e9\u0003 \u0010"+
		"\u0000\u00e5\u00e6\u0005+\u0000\u0000\u00e6\u00e8\u0003 \u0010\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u001f\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00f1\u0003\"\u0011\u0000\u00ed\u00ee\u0005,\u0000\u0000\u00ee\u00f0"+
		"\u0003\"\u0011\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2!\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f7\u0003$\u0012\u0000\u00f5\u00f6\u0005-\u0000\u0000"+
		"\u00f6\u00f8\u0003$\u0012\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8#\u0001\u0000\u0000\u0000\u00f9\u00fe"+
		"\u0003&\u0013\u0000\u00fa\u00fb\u0005.\u0000\u0000\u00fb\u00fd\u0003&"+
		"\u0013\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff%\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0106\u0003f3\u0000\u0102\u0103\u0005/\u0000\u0000\u0103"+
		"\u0105\u0003f3\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0108\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\'\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u0015\u0000\u0000\u010a)\u0001\u0000\u0000"+
		"\u0000\u010b\u0110\u0003\u0016\u000b\u0000\u010c\u010d\u0005\u0003\u0000"+
		"\u0000\u010d\u010f\u0003\u0016\u000b\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111+\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115\u0005\u0012\u0000\u0000"+
		"\u0114\u0116\u0003*\u0015\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005\u0013\u0000\u0000\u0118-\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0005\u0005\u0000\u0000\u011a\u011c\u0003*\u0015\u0000\u011b\u011a\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\u0006\u0000\u0000\u011e/\u0001\u0000"+
		"\u0000\u0000\u011f\u0124\u00051\u0000\u0000\u0120\u0121\u0005\u0002\u0000"+
		"\u0000\u0121\u0122\u0003*\u0015\u0000\u0122\u0123\u0005\u0004\u0000\u0000"+
		"\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u01251\u0001\u0000\u0000\u0000\u0126"+
		"\u012b\u0003\\.\u0000\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u012a"+
		"\u0003\\.\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c3\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u0133\u00051\u0000\u0000\u012f\u0130\u0005\u0002\u0000"+
		"\u0000\u0130\u0131\u00032\u0019\u0000\u0131\u0132\u0005\u0004\u0000\u0000"+
		"\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u01345\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0005\u0016\u0000\u0000\u01367\u0001\u0000\u0000\u0000\u0137\u0139"+
		"\u0005\u0012\u0000\u0000\u0138\u013a\u00032\u0019\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0013\u0000\u0000\u013c9\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0005\u0005\u0000\u0000\u013e\u0140\u00032\u0019"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0006\u0000"+
		"\u0000\u0142;\u0001\u0000\u0000\u0000\u0143\u0144\u00050\u0000\u0000\u0144"+
		"\u0145\u0005\u0017\u0000\u0000\u0145\u0146\u0003\\.\u0000\u0146=\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u00050\u0000\u0000\u0148?\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u00054\u0000\u0000\u014aA\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u00052\u0000\u0000\u014cC\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"3\u0000\u0000\u014eE\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0018\u0000"+
		"\u0000\u0150G\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0019\u0000\u0000"+
		"\u0152I\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u001a\u0000\u0000\u0154"+
		"K\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u001b\u0000\u0000\u0156M\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005\u001c\u0000\u0000\u0158O\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0005\u001d\u0000\u0000\u015aQ\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0005\u001e\u0000\u0000\u015cS\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005\u001f\u0000\u0000\u015eU\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0005\u0002\u0000\u0000\u0160\u0161\u0003\\.\u0000\u0161\u0162"+
		"\u0005\u0004\u0000\u0000\u0162W\u0001\u0000\u0000\u0000\u0163\u0176\u0003"+
		"4\u001a\u0000\u0164\u0176\u00036\u001b\u0000\u0165\u0176\u00038\u001c"+
		"\u0000\u0166\u0176\u0003:\u001d\u0000\u0167\u0176\u0003<\u001e\u0000\u0168"+
		"\u0176\u0003>\u001f\u0000\u0169\u0176\u0003@ \u0000\u016a\u0176\u0003"+
		"B!\u0000\u016b\u0176\u0003D\"\u0000\u016c\u0176\u0003F#\u0000\u016d\u0176"+
		"\u0003H$\u0000\u016e\u0176\u0003J%\u0000\u016f\u0176\u0003L&\u0000\u0170"+
		"\u0176\u0003N\'\u0000\u0171\u0176\u0003P(\u0000\u0172\u0176\u0003R)\u0000"+
		"\u0173\u0176\u0003T*\u0000\u0174\u0176\u0003V+\u0000\u0175\u0163\u0001"+
		"\u0000\u0000\u0000\u0175\u0164\u0001\u0000\u0000\u0000\u0175\u0165\u0001"+
		"\u0000\u0000\u0000\u0175\u0166\u0001\u0000\u0000\u0000\u0175\u0167\u0001"+
		"\u0000\u0000\u0000\u0175\u0168\u0001\u0000\u0000\u0000\u0175\u0169\u0001"+
		"\u0000\u0000\u0000\u0175\u016a\u0001\u0000\u0000\u0000\u0175\u016b\u0001"+
		"\u0000\u0000\u0000\u0175\u016c\u0001\u0000\u0000\u0000\u0175\u016d\u0001"+
		"\u0000\u0000\u0000\u0175\u016e\u0001\u0000\u0000\u0000\u0175\u016f\u0001"+
		"\u0000\u0000\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0175\u0171\u0001"+
		"\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0175\u0173\u0001"+
		"\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176Y\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0003X,\u0000\u0178\u0179\u0005*\u0000\u0000"+
		"\u0179\u017a\u0003\\.\u0000\u017a[\u0001\u0000\u0000\u0000\u017b\u017e"+
		"\u0003Z-\u0000\u017c\u017e\u0003X,\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e]\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0003\\.\u0000\u0180\u0181\u0005 \u0000\u0000\u0181\u0182"+
		"\u0003\n\u0005\u0000\u0182_\u0001\u0000\u0000\u0000\u0183\u0188\u0003"+
		"^/\u0000\u0184\u0185\u0005!\u0000\u0000\u0185\u0187\u0003^/\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"a\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\"\u0000\u0000\u018c\u018d\u0003\u0016\u000b\u0000\u018d\u018e\u0005"+
		"#\u0000\u0000\u018e\u018f\u0003`0\u0000\u018f\u0190\u0005$\u0000\u0000"+
		"\u0190c\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0001\u0000\u0000\u0192"+
		"\u019b\u0005\u0002\u0000\u0000\u0193\u0198\u00050\u0000\u0000\u0194\u0195"+
		"\u0005\u0003\u0000\u0000\u0195\u0197\u00050\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019c\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u0193\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0005\u0004\u0000\u0000\u019e\u019f\u0005"+
		"\u0005\u0000\u0000\u019f\u01a0\u0003\n\u0005\u0000\u01a0\u01a1\u0005\u0006"+
		"\u0000\u0000\u01a1e\u0001\u0000\u0000\u0000\u01a2\u01a3\u00063\uffff\uffff"+
		"\u0000\u01a3\u01c3\u0003\u0014\n\u0000\u01a4\u01c3\u0003d2\u0000\u01a5"+
		"\u01c3\u0003b1\u0000\u01a6\u01c3\u0003,\u0016\u0000\u01a7\u01c3\u0003"+
		".\u0017\u0000\u01a8\u01c3\u00030\u0018\u0000\u01a9\u01c3\u0003(\u0014"+
		"\u0000\u01aa\u01c3\u0003\f\u0006\u0000\u01ab\u01c3\u0003\u000e\u0007\u0000"+
		"\u01ac\u01c3\u0003\u0010\b\u0000\u01ad\u01ae\u00050\u0000\u0000\u01ae"+
		"\u01b7\u0005\u0002\u0000\u0000\u01af\u01b4\u0003\u0016\u000b\u0000\u01b0"+
		"\u01b1\u0005\u0003\u0000\u0000\u01b1\u01b3\u0003\u0016\u000b\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7"+
		"\u01af\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01c3\u0005\u0004\u0000\u0000\u01ba"+
		"\u01c3\u00050\u0000\u0000\u01bb\u01c3\u00052\u0000\u0000\u01bc\u01c3\u0005"+
		"4\u0000\u0000\u01bd\u01c3\u00053\u0000\u0000\u01be\u01bf\u0005\u0002\u0000"+
		"\u0000\u01bf\u01c0\u0003\n\u0005\u0000\u01c0\u01c1\u0005\u0004\u0000\u0000"+
		"\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01a2\u0001\u0000\u0000\u0000"+
		"\u01c2\u01a4\u0001\u0000\u0000\u0000\u01c2\u01a5\u0001\u0000\u0000\u0000"+
		"\u01c2\u01a6\u0001\u0000\u0000\u0000\u01c2\u01a7\u0001\u0000\u0000\u0000"+
		"\u01c2\u01a8\u0001\u0000\u0000\u0000\u01c2\u01a9\u0001\u0000\u0000\u0000"+
		"\u01c2\u01aa\u0001\u0000\u0000\u0000\u01c2\u01ab\u0001\u0000\u0000\u0000"+
		"\u01c2\u01ac\u0001\u0000\u0000\u0000\u01c2\u01ad\u0001\u0000\u0000\u0000"+
		"\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c2\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c2\u01be\u0001\u0000\u0000\u0000\u01c3\u01db\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\n\t\u0000\u0000\u01c5\u01c6\u0005%\u0000\u0000\u01c6\u01da"+
		"\u00050\u0000\u0000\u01c7\u01c8\n\u0007\u0000\u0000\u01c8\u01d1\u0005"+
		"\u0002\u0000\u0000\u01c9\u01ce\u0003\u0016\u000b\u0000\u01ca\u01cb\u0005"+
		"\u0003\u0000\u0000\u01cb\u01cd\u0003\u0016\u000b\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01c9\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01da\u0005\u0004\u0000\u0000\u01d4\u01d5\n\u0005"+
		"\u0000\u0000\u01d5\u01d6\u0005\u0012\u0000\u0000\u01d6\u01d7\u0003\u0016"+
		"\u000b\u0000\u01d7\u01d8\u0005\u0013\u0000\u0000\u01d8\u01da\u0001\u0000"+
		"\u0000\u0000\u01d9\u01c4\u0001\u0000\u0000\u0000\u01d9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d4\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000"+
		"\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dcg\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000&sv\u0080\u0088\u008f\u0094\u0098\u00bc\u00c1\u00ca\u00d3\u00da"+
		"\u00e1\u00e9\u00f1\u00f7\u00fe\u0106\u0110\u0115\u011b\u0124\u012b\u0133"+
		"\u0139\u013f\u0175\u017d\u0188\u0198\u019b\u01b4\u01b7\u01c2\u01ce\u01d1"+
		"\u01d9\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}