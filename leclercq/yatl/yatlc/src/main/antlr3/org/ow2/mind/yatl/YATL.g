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

private Token nextWithSpace(Token e) {
  List tokens = ((CommonTokenStream) input).getTokens();
  if (e.getTokenIndex() +1 >= tokens.size()) return null;
	Token ws = (Token) tokens.get(e.getTokenIndex()+1);
	return (ws.getType() == WHITESPACE) ? ws : null;
}
}

// -----------------------------------------------------------------------------
//  Top-level grammar
// -----------------------------------------------------------------------------

templateFile :
  packageDirective? importDirective* templateClass+
    -> ^(TEMPLATE_FILE importDirective* packageDirective? templateClass+ );

importDirective :
  IMPORT^ STATIC? ID DOT! (ID DOT!)*
  (
    STAR
    | ID
  )
  SEMICOLON!;

packageDirective :
  PACKAGE^ fullyQualifiedName SEMICOLON!;

templateClass :
  qualifier* CLASS^ ID (EXTENDS type)? (IMPLEMENTS type (COMMA! type)*)? LBRACE! templateClassBody* RBRACE!;

templateClassBody :
  (qualifier* DOLLAR) => template
  | memberDeclaration;

memberDeclaration :
  inMemberDeclaration+ memberDeclarationRest
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
  ID^ genericSpecifierList? (DOT! ID genericSpecifierList?)* (LBRACKET RBRACKET)*;

genericSpecifierList :
  LT^ genericSpecifier (COMMA! genericSpecifier)* GT!;

genericSpecifier :
  type
  | QUESTION
  (
    (
      EXTENDS
      | SUPER
    )
    type
  )?;

declarator :
  type ID
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
  templatePrototype LBRACE templateContent RBRACE
   -> ^(TEMPLATE templatePrototype templateContent? );

templatePrototype :
  qualifier* DOLLAR! ID^ LPAREN! (declarator (COMMA! declarator)*)? RPAREN! templateThrows?;

templateThrows :
  THROWS^ ID (COMMA! ID)*;

templateContent :
  templateBody*;

templateBody :
 l=QUOTE templateBody1* r=QUOTE
    -> STRING[$l] templateBody1* STRING[$r] 
 | templateBody1;

templateBody1 :
  INLINED_CODE
  | templateBodyExpr
  | LBRACE templateBody* RBRACE
    -> STRING[$LBRACE] templateBody* STRING[$RBRACE] 
  | templateBodyAny
  ;

templateBodyExpr @init {Token ws = null;} :
  LT e1=templateExpr GT
   {
    ws = nextWithSpace($GT);
   }
    -> {ws!=null}? $e1 STRING[ws]
    -> $e1;

templateBodyAny @init {Token ws = null;} :
  e=templateBodyAny1
   {
    ws = nextWithSpace($e.tree.getToken());
   }
    -> {ws!= null}? STRING[$e.tree.getText() + ws.getText()]
    -> STRING[$e.tree.getText()]
  | OUTPUT_COMMENT
   {
    ws = nextWithSpace($OUTPUT_COMMENT);
   }
    -> {ws!= null}? STRING[$OUTPUT_COMMENT.text.substring(1) + ws.getText()]
    -> STRING[$OUTPUT_COMMENT.text.substring(1)];
    
templateBodyAny1 : 
  ~(
    INLINED_CODE
    | LT
    | LBRACE
    | RBRACE
    | OUTPUT_COMMENT
    | QUOTE
   );

templateExpr :
  DOLLAR ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN
    -> ^(CALL_EXPR ID $params? )
  | declarator DASH expr PIPE innerExpr (SEMICOLON qualif+=exprQualifier (COMMA qualif+=exprQualifier)*)?
      -> ^(ITERABLE_EXPR declarator expr innerExpr $qualif? )
  | e1=expr
  (
    QUESTION e2=innerExpr (DASH e3=innerExpr)? (SEMICOLON qualif+=exprQualifier (COMMA qualif+=exprQualifier)*)?
      -> ^(QUESTION_EXPR $e1 $e2 $e3? $qualif? )
    | (SEMICOLON qualif+=exprQualifier (COMMA qualif+=exprQualifier)*)?
      -> ^(SIMPLE_EXPR $e1 $qualif? )
  );

innerExpr :
  anonymousTemplate 
  | templateExpr;

anonymousTemplate :
  LBRACE templateBody* RBRACE
   -> ^(TEMPLATE templateBody*);

exprQualifier :
  SEPARATOR^ ASSIGN! string
  | NULL^ ASSIGN! string;

string @init {String s = "";} :
  QUOTE (stringContent {s += $stringContent.text;})* QUOTE
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

expr :
  QUOTE^ expr1? QUOTE expr?
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
    | OUTPUT_COMMENT
    | QUOTE
   );

fullyQualifiedName :
  ID (DOT ID)*
    -> ^(FQN ID+ );

// -----------------------------------------------------------------------------
//  Tokens
// -----------------------------------------------------------------------------

WHITESPACE :
  (
    '\t'
    | ' '
    | '\r'
    | '\n'
    | '\u000C'
  )+
  
   {
    $channel = HIDDEN;
   };

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

OUTPUT_COMMENT :
  '$//' ~(
    '\n'
    | '\r'
   )*
  '\r'? '\n' 
  | '$/*'(.)* '*/';
  

COMMENT :
  '//'
  ~(
    '\n'
    | '\r'
   )*
  '\r'? '\n' 
   {
    $channel = HIDDEN;
   }
  | '/*' (.)* '*/' 
   {
    $channel = HIDDEN;
   };

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
