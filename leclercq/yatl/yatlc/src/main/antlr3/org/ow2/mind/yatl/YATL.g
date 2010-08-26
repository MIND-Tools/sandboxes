grammar YATL;

options {
  output    = AST;
  backtrack = true;
  ASTLabelType = CommonTree;
}

tokens {
  CLASS   = 'class';
  IMPORT     = 'import';
  PACKAGE    = 'package';
  EXTENDS    = 'extends';
  IMPLEMENTS = 'implements';
  SUPER      = 'super';
  NULL       = 'null';
  SEPARATOR  = 'separator';
  PRIVATE = 'private';
  PROTECTED= 'protected';
  PUBLIC = 'public';
  STATIC = 'static';
  FINAL = 'final';
  SYNCHRONIZED = 'syncronized';
  THROWS = 'throws';
  LPAREN     = '(';
  RPAREN     = ')';
  LBRACE     = '{';
  RBRACE     = '}';
  LBRACKET   = '[';
  RBRACKET   = ']';
  LT         = '<';
  GT         = '>';
  QUOTE      = '"';
  SEMICOLON  = ';';
  DASH       = ':';
  COMMA      = ',';
  DOT        = '.';
  STAR       = '*';
  PIPE       = '|';
  QUESTION   = '?';
  DOLLAR     = '$';
  ASSIGN     = '=';
  ESC        = '\\';
  CMT_START  = '/*';
  CMT_END    = '*/';
  CMT_LINE   = '//';

  // imaginary token
  FQN;
  TEMPLATE_FILE;
  MEMBER;
  TEMPLATE;
  SIMPLE_EXPR;
  ITERABLE_EXPR;
  CALL_EXPR;
  QUESTION_EXPR;
  STRING;
  EXPR;
  DECL;
  WS;
}

@header {
package org.ow2.mind.yatl;

import java.util.Set;
import java.util.HashSet;
}

@lexer::header {
package org.ow2.mind.yatl;
}

@members {
List<String> errors = new ArrayList<String>();

public String formatError(RecognitionException e) {
  return getErrorHeader(e) + " " + getErrorMessage(e, tokenNames);
}

public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
  errors.add(formatError(e));
}
}

// -----------------------------------------------------------------------------
//  Top-level grammar
// -----------------------------------------------------------------------------

templateFile :
  wsc? packageDirective? (wsc? importDirective)* (wsc? templateClass)+ wsc?
    -> ^(TEMPLATE_FILE importDirective* packageDirective? templateClass+ );

importDirective :
  IMPORT^ wsc!? STATIC? wsc!? ID wsc!? DOT! wsc!? (ID wsc!? DOT! wsc!?)*
  (
    STAR
    | ID
  ) wsc!?
  SEMICOLON!;

packageDirective :
  PACKAGE^ wsc!? fullyQualifiedName wsc!? SEMICOLON!;

templateClass :
  (qualifier wsc!)* CLASS^ wsc! ID (wsc! EXTENDS wsc! type)? (wsc! IMPLEMENTS wsc! type wsc!? (COMMA! wsc!? type wsc!?)*)? wsc!? LBRACE! (wsc!? templateClassBody)* wsc!? RBRACE!;

templateClassBody :
  ((qualifier wsc)* DOLLAR) => template
  | memberDeclaration;

memberDeclaration :
  inMemberDeclaration+ wsc? memberDeclarationRest
    -> ^(MEMBER inMemberDeclaration+ memberDeclarationRest);

inMemberDeclaration :
  LPAREN innerMemberDeclaration* RPAREN
  | 
  ~(
    LBRACE
    | RBRACE
    | LPAREN
    | RPAREN
    | SEMICOLON
   );

innerMemberDeclaration :
  LBRACE innerMemberDeclaration* RBRACE
  | LPAREN innerMemberDeclaration* RPAREN
  | 
  ~(
    LBRACE
    | RBRACE
    | LPAREN
    | RPAREN
   );

memberDeclarationRest :
  SEMICOLON
  | LBRACE innerMemberDeclaration* RBRACE;

type :
  ID^ (wsc!? genericSpecifierList )? (wsc!? DOT! wsc!? ID (wsc!? genericSpecifierList)?)* (wsc!? LBRACKET wsc!? RBRACKET)*;

genericSpecifierList :
  LT^ wsc!? genericSpecifier (wsc!? COMMA! wsc!? genericSpecifier)* wsc!? GT!;

genericSpecifier :
  type
  | QUESTION
  (
    wsc!? (
      EXTENDS
      | SUPER
    )
    wsc!? type
  )?;

declarator :
  type wsc ID
    -> ^(DECL ID type );

qualifier :
  PRIVATE
  | PROTECTED
  | PUBLIC
  | STATIC
  | FINAL
  | SYNCHRONIZED;

// -----------------------------------------------------------------------------
//  Template grammar
// -----------------------------------------------------------------------------

template :
  templatePrototype wsc? LBRACE ws? (templateContent ws?)?  RBRACE
   -> ^(TEMPLATE templatePrototype templateContent? );

templatePrototype :
  (qualifier wsc!)* DOLLAR! wsc!? ID^ wsc!? LPAREN! (wsc!? declarator (wsc!? COMMA! wsc!? declarator)*)? wsc!? RPAREN! (wsc!? templateThrows)?;

templateThrows :
  THROWS^ wsc! ID (wsc!? COMMA! wsc!? ID)*;

templateContent :
  templateBody (ws? templateBody)*;

templateBody :
 l=QUOTE templateBody1* r=QUOTE
    -> STRING[$l] templateBody1* STRING[$r] 
 | templateBody1;

templateBody1 :
  INLINED_CODE
  | templateBodyExpr
  | LBRACE ws1=ws? (templateContent ws2=ws?)? RBRACE
    -> STRING[$LBRACE] $ws1? templateContent? $ws2? STRING[$RBRACE] 
  | templateBodyAny
  ;

templateBodyAny :
  e=templateBodyAny1
     ->STRING[$e.tree.getText()];

templateBodyAny1 :
  ~(
    INLINED_CODE
    | LT
    | LBRACE
    | RBRACE
    | QUOTE
    | WHITESPACE
    | NEW_LINE
   );

templateBodyExpr :
  LT! templateExpr GT!;

templateExpr :
  ws? DOLLAR ws? fullyQualifiedName LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN
    -> ^(CALL_EXPR fullyQualifiedName $params? )
  | ws? declarator ws? DASH expr PIPE innerExpr qualif=qualifiers?
      -> ^(ITERABLE_EXPR declarator expr innerExpr $qualif? )
  | e1=expr
  (
    QUESTION e2=innerExpr (DASH e3=innerExpr)? qualif=qualifiers?
      -> ^(QUESTION_EXPR $e1 $e2 $e3? $qualif? )
    | qualif=qualifiers?
      -> ^(SIMPLE_EXPR $e1 $qualif? )
  );

innerExpr :
  anonymousTemplate 
  | ws? DOLLAR ws? fullyQualifiedName LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN ws?
    -> ^(CALL_EXPR fullyQualifiedName $params? )
  | ws? declarator ws? DASH expr PIPE innerExpr
      -> ^(ITERABLE_EXPR declarator expr innerExpr)
  | e1=expr
  (
    QUESTION e2=innerExpr (DASH e3=innerExpr)?
      -> ^(QUESTION_EXPR $e1 $e2 $e3? )
    |
      -> ^(SIMPLE_EXPR $e1 )
  );

anonymousTemplate :
  ws? LBRACE ws1=ws? (templateContent ws2=ws?)? RBRACE ws?
   -> ^(TEMPLATE templateContent);

qualifiers :
  SEMICOLON! ws!? exprQualifier (ws!? COMMA! ws!? exprQualifier)* ws!?;

exprQualifier :
  SEPARATOR^ ws!? ASSIGN! ws!? string
  | NULL^ ws!? ASSIGN! ws!? string;

string :
  QUOTE stringContent* QUOTE
    -> STRING[$string.text];

stringContent:
  ~ (QUOTE|ESC)
  | ESC QUOTE
  | ESC ESC
  | ESC '\''
  | ESC 'n'
  | ESC 'r'
  | ESC 't';

callExpr :
  DOLLAR ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN
    -> ^(CALL_EXPR ID $params? );

expr @init {String s = "";} :
  q1=QUOTE (stringContent {s += $stringContent.text;})* q2=QUOTE expr?
    -> ^($q1 STRING[s] $q2 expr?)
  | expr1;

expr1 :
  LPAREN^ expr? RPAREN expr?
  | LT^ expr? GT expr?
  | e1=anyExpr e2=expr?
    -> ^(EXPR $e1 $e2? );

anyExpr :
  ~(
    LPAREN
    | RPAREN
    | LBRACE
    | RBRACE
    | LT
    | GT
    | DASH
    | DOLLAR
    | PIPE
    | SEMICOLON
    | QUESTION
    | QUOTE
   );

fullyQualifiedName :
  ID (DOT ID)*
    -> ^(FQN ID+ );

ws :
  e=ws_
    -> WS[$e.text];

ws_ :
  (WHITESPACE | NEW_LINE)+;

wsc :
  (WHITESPACE | NEW_LINE | comment)+;

comment :
  CMT_START ~(CMT_END|CMT_START)* CMT_END
  | CMT_LINE ~(NEW_LINE)* NEW_LINE;

// -----------------------------------------------------------------------------
//  Tokens
// -----------------------------------------------------------------------------

WHITESPACE :
  '\t'
  | ' ';

NEW_LINE :
  '\r'
  | '\n'
  ;

ID :
  (
    'a'..'z'
    | 'A'..'Z'
    | '_'
  )
  (
    'a'..'z'
    | 'A'..'Z'
    | '0'..'9'
    | '_'
  )*;

ASSIGNEMENT_OPERATORS :
  '+='
  | '-='
  | '*='
  | '/='
  | '&='
  | '|='
  | '^='
  | '%='
  | '<<='
  | '>>='
  | '>>>=';

OPERATORS :
  '||'
  | '&&'
  | '|'
  | '&'
  | '=='
  | '!='
  | '\\<'
  | '//>'
  | '<='
  | '>='
  | '\\<<'
  | '\\>>'
  | '\\>>>'
  | '+'
  | '-'
  | '*'
  | '/'
  | '%'
  | '++'
  | '--'
  | '!'
  | '~';

INLINED_CODE :
  '<%' (options {greedy=false;}: .)* '%>';

INTEGER_LITERAL :
  DECIMAL_LITERAL
  (
    'l'
    | 'L'
  )?
  | HEX_LITERAL
  (
    'l'
    | 'L'
  )?
  | OCTAL_LITERAL
  (
    'l'
    | 'L'
  )?;

fragment DECIMAL_LITERAL :
  ('1'..'9') ('0'..'9')*;

fragment HEX_LITERAL :
  '0'
  (
    'x'
    | 'X'
  )
  (
    '0'..'9'
    | 'a'..'f'
    | 'A'..'F'
  )+;

fragment OCTAL_LITERAL :
  '0' ('0'..'7')+;

fragment HEX_DIGIT :
  (
    '0'..'9'
    | 'a'..'f'
    | 'A'..'F'
  );

fragment ESC_SEQ :
  '\\'
  (
    'b'
    | 't'
    | 'n'
    | 'f'
    | 'r'
    | '\"'
    | '\''
    | '\\'
  )
  | UNICODE_ESC
  | OCTAL_ESC;

fragment OCTAL_ESC :
  '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7');

fragment UNICODE_ESC :
  '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

ANY :
  .;
