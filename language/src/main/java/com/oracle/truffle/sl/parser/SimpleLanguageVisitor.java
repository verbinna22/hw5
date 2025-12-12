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
	 * Visit a parse tree produced by {@link SimpleLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirRef}
	 * labeled alternative in {@link SimpleLanguageParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirRef(SimpleLanguageParser.DirRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElemRef}
	 * labeled alternative in {@link SimpleLanguageParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemRef(SimpleLanguageParser.ElemRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SimpleLanguageParser#assign_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link SimpleLanguageParser#assign_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#list_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_term(SimpleLanguageParser.List_termContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLanguageParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(SimpleLanguageParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(SimpleLanguageParser.Array_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#list_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expression(SimpleLanguageParser.List_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#sexp_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexp_expression(SimpleLanguageParser.Sexp_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#pattern_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_list(SimpleLanguageParser.Pattern_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#sexprPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexprPattern(SimpleLanguageParser.SexprPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#wildcardPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardPattern(SimpleLanguageParser.WildcardPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#arrayPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayPattern(SimpleLanguageParser.ArrayPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#listPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPattern(SimpleLanguageParser.ListPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#namedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedPattern(SimpleLanguageParser.NamedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#namedVarPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedVarPattern(SimpleLanguageParser.NamedVarPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#decimalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalPattern(SimpleLanguageParser.DecimalPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#stringPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPattern(SimpleLanguageParser.StringPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#charPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPattern(SimpleLanguageParser.CharPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#truePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruePattern(SimpleLanguageParser.TruePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#falsePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalsePattern(SimpleLanguageParser.FalsePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#boxTagPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxTagPattern(SimpleLanguageParser.BoxTagPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#valTagPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValTagPattern(SimpleLanguageParser.ValTagPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#strTagPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrTagPattern(SimpleLanguageParser.StrTagPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#arrayTagPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTagPattern(SimpleLanguageParser.ArrayTagPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#sexpTagPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpTagPattern(SimpleLanguageParser.SexpTagPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#funTagPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTagPattern(SimpleLanguageParser.FunTagPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#patternInBraces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternInBraces(SimpleLanguageParser.PatternInBracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#simplePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePattern(SimpleLanguageParser.SimplePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#consPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsPattern(SimpleLanguageParser.ConsPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(SimpleLanguageParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#case_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_branch(SimpleLanguageParser.Case_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#case_branches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_branches(SimpleLanguageParser.Case_branchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(SimpleLanguageParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(SimpleLanguageParser.Lambda_expressionContext ctx);
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
	 * Visit a parse tree produced by the {@code PointAccessExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointAccessExpr(SimpleLanguageParser.PointAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SimpleLanguageParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndAccess}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndAccess(SimpleLanguageParser.IndAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteral}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SimpleLanguageParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(SimpleLanguageParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileExpr(SimpleLanguageParser.DoWhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectCall}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectCall(SimpleLanguageParser.DirectCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(SimpleLanguageParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndirectCall}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectCall(SimpleLanguageParser.IndirectCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SimpleLanguageParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SimpleLanguageParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SexpExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpExpr(SimpleLanguageParser.SexpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(SimpleLanguageParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(SimpleLanguageParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(SimpleLanguageParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseExpr}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(SimpleLanguageParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAccess}
	 * labeled alternative in {@link SimpleLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAccess(SimpleLanguageParser.NameAccessContext ctx);
}