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
		T__17=18, T__18=19, T__19=20, WS=21, COMMENT=22, LINE_COMMENT=23, OP_SEQ=24, 
		OP_OR=25, OP_AND=26, OP_COMPARE=27, OP_ADD=28, OP_MUL=29, IDENTIFIER=30, 
		STRING_LITERAL=31, NUMERIC_LITERAL=32;
	public static final int
		RULE_simplelanguage = 0, RULE_function = 1, RULE_varSingleDef = 2, RULE_varSingleLineDef = 3, 
		RULE_def = 4, RULE_block = 5, RULE_statement = 6, RULE_break_statement = 7, 
		RULE_continue_statement = 8, RULE_expression_statement = 9, RULE_debugger_statement = 10, 
		RULE_while_expression = 11, RULE_if_expression = 12, RULE_return_statement = 13, 
		RULE_expression = 14, RULE_or_term = 15, RULE_logic_term = 16, RULE_logic_factor = 17, 
		RULE_arithmetic = 18, RULE_term = 19, RULE_factor = 20, RULE_member_expression = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"simplelanguage", "function", "varSingleDef", "varSingleLineDef", "def", 
			"block", "statement", "break_statement", "continue_statement", "expression_statement", 
			"debugger_statement", "while_expression", "if_expression", "return_statement", 
			"expression", "or_term", "logic_term", "logic_factor", "arithmetic", 
			"term", "factor", "member_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'('", "','", "')'", "'{'", "'}'", "'='", "'var'", "'break'", 
			"'@'", "'continue'", "'debugger'", "'while'", "'if'", "'else'", "'return'", 
			"':='", "'.'", "'['", "']'", null, null, null, "';'", "'!!'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"LINE_COMMENT", "OP_SEQ", "OP_OR", "OP_AND", "OP_COMPARE", "OP_ADD", 
			"OP_MUL", "IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			function();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(45);
				function();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
			setState(53);
			match(T__0);
			setState(54);
			match(IDENTIFIER);
			setState(55);
			((FunctionContext)_localctx).s = match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(56);
				match(IDENTIFIER);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(57);
					match(T__2);
					setState(58);
					match(IDENTIFIER);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(66);
			match(T__3);
			setState(67);
			match(T__4);
			setState(68);
			((FunctionContext)_localctx).body = block();
			setState(69);
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
			setState(71);
			match(IDENTIFIER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(72);
				match(T__6);
				setState(73);
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
			setState(76);
			match(T__7);
			setState(77);
			varSingleDef();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				varSingleDef();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			varSingleLineDef();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(89);
				def();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Debugger_statementContext debugger_statement() {
			return getRuleContext(Debugger_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				break_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				return_statement();
				}
				break;
			case T__1:
			case T__12:
			case T__13:
			case IDENTIFIER:
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				expression_statement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				debugger_statement();
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
	public static class Break_statementContext extends ParserRuleContext {
		public Token b;
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((Break_statementContext)_localctx).b = match(T__8);
			setState(105);
			match(T__9);
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
	public static class Continue_statementContext extends ParserRuleContext {
		public Token c;
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((Continue_statementContext)_localctx).c = match(T__10);
			setState(108);
			match(T__9);
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
	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			expression();
			setState(111);
			match(T__9);
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
	public static class Debugger_statementContext extends ParserRuleContext {
		public Token d;
		public Debugger_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugger_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDebugger_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debugger_statementContext debugger_statement() throws RecognitionException {
		Debugger_statementContext _localctx = new Debugger_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_debugger_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((Debugger_statementContext)_localctx).d = match(T__11);
			setState(114);
			match(T__9);
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
		enterRule(_localctx, 22, RULE_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((While_expressionContext)_localctx).w = match(T__12);
			setState(117);
			match(T__1);
			setState(118);
			((While_expressionContext)_localctx).condition = expression();
			setState(119);
			match(T__3);
			setState(120);
			match(T__4);
			setState(121);
			((While_expressionContext)_localctx).body = block();
			setState(122);
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
	public static class If_expressionContext extends ParserRuleContext {
		public Token i;
		public ExpressionContext condition;
		public BlockContext then;
		public BlockContext alt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 24, RULE_if_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((If_expressionContext)_localctx).i = match(T__13);
			setState(125);
			match(T__1);
			setState(126);
			((If_expressionContext)_localctx).condition = expression();
			setState(127);
			match(T__3);
			setState(128);
			match(T__4);
			setState(129);
			((If_expressionContext)_localctx).then = block();
			setState(130);
			match(T__5);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(131);
				match(T__14);
				setState(132);
				match(T__4);
				setState(133);
				((If_expressionContext)_localctx).alt = block();
				setState(134);
				match(T__5);
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
	public static class Return_statementContext extends ParserRuleContext {
		public Token r;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((Return_statementContext)_localctx).r = match(T__15);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516217348L) != 0)) {
				{
				setState(139);
				expression();
				}
			}

			setState(142);
			match(T__9);
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
		public List<Or_termContext> or_term() {
			return getRuleContexts(Or_termContext.class);
		}
		public Or_termContext or_term(int i) {
			return getRuleContext(Or_termContext.class,i);
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
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			or_term();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SEQ) {
				{
				{
				setState(145);
				match(OP_SEQ);
				setState(146);
				or_term();
				}
				}
				setState(151);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			logic_term();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(OP_OR);
					setState(154);
					logic_term();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			logic_factor();
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					match(OP_AND);
					setState(162);
					logic_factor();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			arithmetic();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(169);
				match(OP_COMPARE);
				setState(170);
				arithmetic();
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			term();
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					match(OP_ADD);
					setState(175);
					term();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			factor();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					match(OP_MUL);
					setState(183);
					factor();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class ParenExpressionContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAccessContext extends FactorContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public List<Member_expressionContext> member_expression() {
			return getRuleContexts(Member_expressionContext.class);
		}
		public Member_expressionContext member_expression(int i) {
			return getRuleContext(Member_expressionContext.class,i);
		}
		public NameAccessContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitNameAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			int _alt;
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				if_expression();
				}
				break;
			case T__12:
				_localctx = new WhileExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				while_expression();
				}
				break;
			case IDENTIFIER:
				_localctx = new NameAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(IDENTIFIER);
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						member_expression();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(NUMERIC_LITERAL);
				}
				break;
			case T__1:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(T__1);
				setState(201);
				expression();
				setState(202);
				match(T__3);
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
	public static class Member_expressionContext extends ParserRuleContext {
		public Member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_expression; }
	 
		public Member_expressionContext() { }
		public void copyFrom(Member_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberCallContext extends Member_expressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberCallContext(Member_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitMemberCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberFieldContext extends Member_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public MemberFieldContext(Member_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitMemberField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexContext extends Member_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberIndexContext(Member_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitMemberIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAssignContext extends Member_expressionContext {
		public Or_termContext or_term() {
			return getRuleContext(Or_termContext.class,0);
		}
		public MemberAssignContext(Member_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitMemberAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_expressionContext member_expression() throws RecognitionException {
		Member_expressionContext _localctx = new Member_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_member_expression);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new MemberCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__1);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516217348L) != 0)) {
					{
					setState(207);
					expression();
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(208);
						match(T__2);
						setState(209);
						expression();
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(217);
				match(T__3);
				}
				break;
			case T__16:
				_localctx = new MemberAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__16);
				setState(219);
				or_term();
				}
				break;
			case T__17:
				_localctx = new MemberFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__17);
				setState(221);
				match(IDENTIFIER);
				}
				break;
			case T__18:
				_localctx = new MemberIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__18);
				setState(223);
				expression();
				setState(224);
				match(T__19);
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

	public static final String _serializedATN =
		"\u0004\u0001 \u00e5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001"+
		"\u0003\u0001A\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002K\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Q\b\u0003"+
		"\n\u0003\f\u0003T\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0089\b\f\u0001\r\u0001\r\u0003"+
		"\r\u008d\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0094\b\u000e\n\u000e\f\u000e\u0097\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u009c\b\u000f\n\u000f\f\u000f\u009f\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00a4\b\u0010\n\u0010\f\u0010"+
		"\u00a7\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ac\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00b1\b\u0012\n"+
		"\u0012\f\u0012\u00b4\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00b9\b\u0013\n\u0013\f\u0013\u00bc\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00c2\b\u0014\n\u0014\f\u0014\u00c5"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00cd\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00d3\b\u0015\n\u0015\f\u0015\u00d6\t\u0015\u0003\u0015"+
		"\u00d8\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e3\b\u0015"+
		"\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0000\u00eb\u0000"+
		",\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004G\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000"+
		"\u0000\n\\\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000eh\u0001"+
		"\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000"+
		"\u0000\u0014q\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000\u0000\u0018"+
		"|\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u0090"+
		"\u0001\u0000\u0000\u0000\u001e\u0098\u0001\u0000\u0000\u0000 \u00a0\u0001"+
		"\u0000\u0000\u0000\"\u00a8\u0001\u0000\u0000\u0000$\u00ad\u0001\u0000"+
		"\u0000\u0000&\u00b5\u0001\u0000\u0000\u0000(\u00cc\u0001\u0000\u0000\u0000"+
		"*\u00e2\u0001\u0000\u0000\u0000,0\u0003\u0002\u0001\u0000-/\u0003\u0002"+
		"\u0001\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000"+
		"\u0000\u000056\u0005\u0001\u0000\u000067\u0005\u001e\u0000\u00007@\u0005"+
		"\u0002\u0000\u00008=\u0005\u001e\u0000\u00009:\u0005\u0003\u0000\u0000"+
		":<\u0005\u001e\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@8\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u0004\u0000\u0000"+
		"CD\u0005\u0005\u0000\u0000DE\u0003\n\u0005\u0000EF\u0005\u0006\u0000\u0000"+
		"F\u0003\u0001\u0000\u0000\u0000GJ\u0005\u001e\u0000\u0000HI\u0005\u0007"+
		"\u0000\u0000IK\u0003\u001e\u000f\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000"+
		"MR\u0003\u0004\u0002\u0000NO\u0005\u0003\u0000\u0000OQ\u0003\u0004\u0002"+
		"\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0018\u0000\u0000V\u0007\u0001\u0000\u0000"+
		"\u0000WX\u0003\u0006\u0003\u0000X\t\u0001\u0000\u0000\u0000Y[\u0003\b"+
		"\u0004\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_`\u0003\u001c\u000e\u0000`\u000b\u0001\u0000"+
		"\u0000\u0000ag\u0003\u000e\u0007\u0000bg\u0003\u0010\b\u0000cg\u0003\u001a"+
		"\r\u0000dg\u0003\u0012\t\u0000eg\u0003\u0014\n\u0000fa\u0001\u0000\u0000"+
		"\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000g\r\u0001\u0000\u0000\u0000hi\u0005"+
		"\t\u0000\u0000ij\u0005\n\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kl"+
		"\u0005\u000b\u0000\u0000lm\u0005\n\u0000\u0000m\u0011\u0001\u0000\u0000"+
		"\u0000no\u0003\u001c\u000e\u0000op\u0005\n\u0000\u0000p\u0013\u0001\u0000"+
		"\u0000\u0000qr\u0005\f\u0000\u0000rs\u0005\n\u0000\u0000s\u0015\u0001"+
		"\u0000\u0000\u0000tu\u0005\r\u0000\u0000uv\u0005\u0002\u0000\u0000vw\u0003"+
		"\u001c\u000e\u0000wx\u0005\u0004\u0000\u0000xy\u0005\u0005\u0000\u0000"+
		"yz\u0003\n\u0005\u0000z{\u0005\u0006\u0000\u0000{\u0017\u0001\u0000\u0000"+
		"\u0000|}\u0005\u000e\u0000\u0000}~\u0005\u0002\u0000\u0000~\u007f\u0003"+
		"\u001c\u000e\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0081\u0005"+
		"\u0005\u0000\u0000\u0081\u0082\u0003\n\u0005\u0000\u0082\u0088\u0005\u0006"+
		"\u0000\u0000\u0083\u0084\u0005\u000f\u0000\u0000\u0084\u0085\u0005\u0005"+
		"\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0005\u0006\u0000"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0019\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0005\u0010\u0000\u0000\u008b\u008d\u0003\u001c\u000e"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\n\u0000\u0000"+
		"\u008f\u001b\u0001\u0000\u0000\u0000\u0090\u0095\u0003\u001e\u000f\u0000"+
		"\u0091\u0092\u0005\u0018\u0000\u0000\u0092\u0094\u0003\u001e\u000f\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u001d\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0098\u009d\u0003 \u0010\u0000\u0099\u009a\u0005\u0019\u0000\u0000\u009a"+
		"\u009c\u0003 \u0010\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u001f\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a5\u0003\"\u0011\u0000\u00a1\u00a2\u0005"+
		"\u001a\u0000\u0000\u00a2\u00a4\u0003\"\u0011\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6!\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0003$\u0012\u0000"+
		"\u00a9\u00aa\u0005\u001b\u0000\u0000\u00aa\u00ac\u0003$\u0012\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"#\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003&\u0013\u0000\u00ae\u00af\u0005"+
		"\u001c\u0000\u0000\u00af\u00b1\u0003&\u0013\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3%\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00ba\u0003(\u0014\u0000"+
		"\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b9\u0003(\u0014\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\'\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00cd"+
		"\u0003\u0018\f\u0000\u00be\u00cd\u0003\u0016\u000b\u0000\u00bf\u00c3\u0005"+
		"\u001e\u0000\u0000\u00c0\u00c2\u0003*\u0015\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00cd\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00cd\u0005\u001f"+
		"\u0000\u0000\u00c7\u00cd\u0005 \u0000\u0000\u00c8\u00c9\u0005\u0002\u0000"+
		"\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca\u00cb\u0005\u0004\u0000"+
		"\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00cc\u00be\u0001\u0000\u0000\u0000\u00cc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cd)\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d7\u0005\u0002\u0000\u0000\u00cf\u00d4\u0003\u001c\u000e\u0000"+
		"\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d3\u0003\u001c\u000e\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00e3\u0005\u0004\u0000\u0000"+
		"\u00da\u00db\u0005\u0011\u0000\u0000\u00db\u00e3\u0003\u001e\u000f\u0000"+
		"\u00dc\u00dd\u0005\u0012\u0000\u0000\u00dd\u00e3\u0005\u001e\u0000\u0000"+
		"\u00de\u00df\u0005\u0013\u0000\u0000\u00df\u00e0\u0003\u001c\u000e\u0000"+
		"\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00ce\u0001\u0000\u0000\u0000\u00e2\u00da\u0001\u0000\u0000\u0000"+
		"\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000"+
		"\u00e3+\u0001\u0000\u0000\u0000\u00140=@JR\\f\u0088\u008c\u0095\u009d"+
		"\u00a5\u00ab\u00b2\u00ba\u00c3\u00cc\u00d4\u00d7\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}