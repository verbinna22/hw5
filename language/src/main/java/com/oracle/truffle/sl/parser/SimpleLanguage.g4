/*
 * Copyright (c) 2012, 2025, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * The parser and lexer need to be generated using "mx create-sl-parser".
 */

grammar SimpleLanguage;

@parser::header
{
// DO NOT MODIFY - generated from SimpleLanguage.g4 using "mx create-sl-parser"
}

@lexer::header
{
// DO NOT MODIFY - generated from SimpleLanguage.g4 using "mx create-sl-parser"
}

// parser 




simplelanguage
	: block EOF
	;


function
	: 'fun' IDENTIFIER
		s='(' (IDENTIFIER (',' IDENTIFIER)*)? ')'
		'{' body=block '}'
	;

varSingleDef
    : IDENTIFIER ('=' val=or_term)?
    ;

varSingleLineDef
    : 'var' varSingleDef (',' varSingleDef)* ';'
    ;

def
    : varSingleLineDef
    | function
    ;

block
	: def* expression?
	;

while_expression
    : w='while' condition=expression
    		'do' body=block 'od'
    	;

for_expression
    : f='for' init=block ',' condition=expression ',' last=expression
    		'do' body=block od='od'
    	;

do_while_expression
    : d='do' body=block
        'while' condition=expression 'od'
    ;

elifSequence : el='elif' cond=expression 'then' elif=block ;

if_expression
	: i='if' condition=expression 'then'
		  then=block
		elifSequence*
		( 'else' alt=block )? f='fi'
	;


expression
	: assign_term (OP_SEQ assign_term)*
	;

ref
    : IDENTIFIER                # DirRef
    | factor '[' expression ']' # ElemRef
    ;

assign_term
    : ref ':=' assign_term # Assignment
    | or_term              # Expr
    ;

or_term
    : logic_term (OP_OR logic_term)*
    ;

logic_term
	: logic_factor (OP_AND logic_factor)*
	;


logic_factor
	: arithmetic (OP_COMPARE arithmetic)?
	;


arithmetic
	: term (OP_ADD term)*
	;


term
	: factor (OP_MUL factor)*
	;

skip_expression
    : 'skip'
    ;

expr_list
    : expression (',' expression)*
    ;

array_expression
    : '[' (expr_list)? ']'
    ;

list_expression
    : '{' (expr_list)? '}'
    ;

sexp_expression
    : UIDENTIFIER ('(' expr_list ')')?
    ;

pattern_list
    : pattern (',' pattern)*
    ;

sexprPattern
    : UIDENTIFIER ('(' pattern_list ')')?
    ;

wildcardPattern
    : '_'
    ;

arrayPattern
    : '[' (pattern_list)? ']'
    ;

listPattern
    : '{' (pattern_list)? '}'
    ;

namedPattern
    : IDENTIFIER '@' pattern
    ;

namedVarPattern
    : IDENTIFIER
    ;

decimalPattern
    : NUMERIC_LITERAL
    ;

stringPattern
    : STRING_LITERAL
    ;

charPattern
    : CHAR_LITERAL
    ;

truePattern
    : 'true'
    ;

falsePattern
    : 'false'
    ;

boxTagPattern
    : '#box'
    ;

valTagPattern
    : '#val'
    ;

strTagPattern
    : '#str'
    ;

arrayTagPattern
    : '#array'
    ;

sexpTagPattern
    : '#sexp'
    ;

funTagPattern
    : '#fun'
    ;

patternInBraces
    : '(' pattern ')'
    ;

simplePattern
    : sexprPattern
    | wildcardPattern
    | arrayPattern
    | listPattern
    | namedPattern
    | namedVarPattern
    | decimalPattern
    | stringPattern
    | charPattern
    | truePattern
    | falsePattern
    | boxTagPattern
    | valTagPattern
    | strTagPattern
    | arrayTagPattern
    | sexpTagPattern
    | funTagPattern
    | patternInBraces
    ;

consPattern
    : simplePattern ':' pattern
    ;

pattern
    : consPattern
    | simplePattern
    ;

case_branch
    : pattern '->' block
    ;

case_branches
    : case_branch ('|' case_branch)*
    ;

case_expression
    : 'case' expression 'of' case_branches 'esac'
    ;

lambda_expression
    : b='fun' s='(' (IDENTIFIER (',' IDENTIFIER)*)? ')'
             		'{' body=block '}'
    ;


factor
	: if_expression                 # IfExpr
	| lambda_expression             # LambdaExpr
	| case_expression               # CaseExpr
	| array_expression              # ArrayExpr
	| list_expression               # ListExpr
	| sexp_expression               # SexpExpr
	| skip_expression               # SkipExpr
    | while_expression              # WhileExpr
    | for_expression                # ForExpr
    | do_while_expression           # DoWhileExpr
    | factor '.' IDENTIFIER         # PointAccessExpr
    | IDENTIFIER '(' ( expression (',' expression)* )? ')'  # DirectCall
    | factor '(' ( expression (',' expression)* )? ')'  # IndirectCall
	| IDENTIFIER                    # NameAccess
	| factor '[' expression ']'     # IndAccess
	| STRING_LITERAL				# StringLiteral
	| NUMERIC_LITERAL				# NumericLiteral
	| CHAR_LITERAL                  # CharLiteral
	| '(' block ')'			# ParenExpression
	;

// lexer

WS : [ \t\r\n\u000C]+ -> skip;
COMMENT : '(*' .*? '*)' -> skip;
LINE_COMMENT : '--' ~[\r\n]* -> skip;

OP_SEQ: ';';
OP_OR: '!!';
OP_AND: '&&';
OP_COMPARE: '<' | '<=' | '>' | '>=' | '==' | '!=';
OP_ADD: '+' | '-';
OP_MUL: '*' | '/' | '%';

fragment LETTER : [A-Z] | [a-z] | '_' | '$';
fragment LLETTER : [a-z];
fragment ULETTER : [A-Z];
fragment NON_ZERO_DIGIT : [1-9];
fragment DIGIT : [0-9];
fragment HEX_DIGIT : [0-9] | [a-f] | [A-F];
fragment OCT_DIGIT : [0-7];
fragment BINARY_DIGIT : '0' | '1';
fragment TAB : '\t';
fragment STRING_CHAR : ~('"' | '\r' | '\n');
fragment CHAR : ~('\'' | '\r' | '\n');

IDENTIFIER : LLETTER (LETTER | DIGIT)*;
UIDENTIFIER : ULETTER (LETTER | DIGIT)*;
STRING_LITERAL : '"' STRING_CHAR* '"';
CHAR_LITERAL : '\'' CHAR '\'';
NUMERIC_LITERAL : '0' | NON_ZERO_DIGIT DIGIT*;

