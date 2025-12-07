// Generated from language/src/main/java/com/oracle/truffle/sl/parser/SimpleLanguage.g4 by ANTLR 4.13.2
package com.oracle.truffle.sl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#simplelanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplelanguage(SimpleLanguageParser.SimplelanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SimpleLanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#varSingleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSingleDef(SimpleLanguageParser.VarSingleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#varSingleLineDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSingleLineDef(SimpleLanguageParser.VarSingleLineDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(SimpleLanguageParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(SimpleLanguageParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(SimpleLanguageParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(SimpleLanguageParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#debugger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugger_statement(SimpleLanguageParser.Debugger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#while_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_expression(SimpleLanguageParser.While_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expression(SimpleLanguageParser.For_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#do_while_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_expression(SimpleLanguageParser.Do_while_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#elifSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifSequence(SimpleLanguageParser.ElifSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(SimpleLanguageParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(SimpleLanguageParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#or_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_term(SimpleLanguageParser.Or_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#logic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_term(SimpleLanguageParser.Logic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#logic_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_factor(SimpleLanguageParser.Logic_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(SimpleLanguageParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleLanguageParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#skip_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_expression(SimpleLanguageParser.Skip_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SimpleLanguageParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExpr(SimpleLanguageParser.SkipExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(SimpleLanguageParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(SimpleLanguageParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileExpr(SimpleLanguageParser.DoWhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAccess}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAccess(SimpleLanguageParser.NameAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SimpleLanguageParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteral}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SimpleLanguageParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(SimpleLanguageParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberCall}
	 * labeled alternative in {@link SimpleLanguageParser#member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberCall(SimpleLanguageParser.MemberCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAssign}
	 * labeled alternative in {@link SimpleLanguageParser#member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAssign(SimpleLanguageParser.MemberAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberField}
	 * labeled alternative in {@link SimpleLanguageParser#member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberField(SimpleLanguageParser.MemberFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndex}
	 * labeled alternative in {@link SimpleLanguageParser#member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndex(SimpleLanguageParser.MemberIndexContext ctx);
}