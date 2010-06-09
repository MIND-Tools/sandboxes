grammar ADL2;

options{
  output=tremplate;
}

tokens {
  // ADL keywords
  ABSTRACT   = 'abstract';
  AS         = 'as';
  ATTRIBUTE  = 'attribute';
  BINDS      = 'binds';
  COMPOSITE  = 'composite';
  CONFORMSTO = 'conformsto';
  CONTAINS   = 'contains';
  DATA       = 'data';
  EXTENDS    = 'extends';
  IMPORT     = 'import';
  MANDATORY  = 'mandatory';
  NULL       = 'NULL" | "null';
  OPTIONAL   = 'optional';
  PRIMITIVE  = 'primitive';
  PROPERTY   = 'property';
  PROVIDES   = 'provides';
  REQUIRES   = 'requires';
  SOURCE     = 'source';
  THIS       = 'this';
  TO         = 'to';
  TYPE       = 'type';
  STRING     = 'string';
  INT        = 'int';
  INT8_T     = 'int8_t';
  UINT8_T    = 'uint8_t';
  INT16_T    = 'int16_t';
  UINT16_T   = 'uint16_t';
  INT32_T    = 'int32_t';
  UINT32_T   = 'uint32_t';
  INT64_T    = 'int64_t';
  UINT64_T   = 'uint64_t';
  INTPTR_T   = 'intptr_t';
  UINTPTR_T  = 'uintptr_t';

  // separators
  LPAREN     = '(';
  RPAREN     = ')';
  LBRACE     = '{';
  RBRACE     = '}';
  LBRACKET   = '[';
  RBRACKET   = ']';
  LT         = '<';
  GT         = '>';
  SEMICOLON  = ';';
  COMMA      = ',';
  DOT        = '.';
  DOTDOT     = '..';
  SLASH      = '/';
  STAR       = '*';
  AT         = '@';
  ASSIGN     = '=';
  ANY        = '?';
  MINUS      = '-';
  PLUS       = '+';

  // imaginary token
  FQN;
  DEF_REF;
  PARAM_DECL;
  ARGS;
  TYPE_PARAM_DECL;
  TYPE_ARGS;
  PATH;
  ARRAY;
}

@header {
package org.ow2.mind.adl.parser;
}

@lexer::header {
package org.ow2.mind.adl.parser;
}

// -----------------------------------------------------------------------------
// File level grammar
// -----------------------------------------------------------------------------

adlFile :
  annotations (importDirective annotations)* architectureDefinition;

importDirective :
  IMPORT ID DOT (ID DOT)*
  (
    STAR
    | ID
  )
  SEMICOLON;

architectureDefinition :
  primitiveDefinition
  | compositeDefinition
  | typeDefinition;

// -----------------------------------------------------------------------------
// Definition prototypes grammar
// -----------------------------------------------------------------------------

typeDefinition :
  TYPE fullyQualifiedName extendedTypeDefinitions? typeDefinitionBody;

extendedTypeDefinitions :
  EXTENDS typeDefinitionReference (COMMA typeDefinitionReference)*;

typeDefinitionReference :
  fullyQualifiedName;

typeDefinitionBody :
  LBRACE (typeDefinitionElement)* RBRACE;

typeDefinitionElement :
  annotations
  (
    interfaceDefinition SEMICOLON
    | invalidStatement SEMICOLON
  );

// -----------------------------------------------------------------------------

primitiveDefinition :
  ABSTRACT? PRIMITIVE fullyQualifiedName formalParameterDeclarationList? extendedPrimitiveDefinitions? primitiveDefinitionBody;

formalParameterDeclarationList :
  LPAREN formalParameterDeclaration (COMMA formalParameterDeclaration)* RPAREN;

formalParameterDeclaration :
  ID;

extendedPrimitiveDefinitions :
  EXTENDS primitiveDefinitionReference (COMMA primitiveDefinitionReference)*;

primitiveDefinitionReference :
  fullyQualifiedName argumentList?;

argumentList :
  LPAREN
  (
    simpleArgumentList
    | argumentAssignementList
  )
  RPAREN;

simpleArgumentList :
  argument (COMMA argument)*;

argumentAssignementList :
  argumentAssignement (COMMA argumentAssignement)*;

argument :
  stringValue
  | integerValue
  | referenceValue
  | nullValue;

argumentAssignement :
  ID ASSIGN argument;

primitiveDefinitionBody :
  LBRACE primitiveDefinitionElement* RBRACE;

primitiveDefinitionElement :
  annotations
  (
    interfaceDefinition SEMICOLON
    | attributeDefinition SEMICOLON
    | dataDefinition SEMICOLON
    | implementationDefinition SEMICOLON
    | invalidStatement SEMICOLON
  );

// -----------------------------------------------------------------------------

compositeDefinition :
  COMPOSITE fullyQualifiedName formalTypeParameterDeclarationList? formalParameterDeclarationList? extendedCompositeDefinitions? compositeDefinitionBody;

formalTypeParameterDeclarationList :
  LT formalTypeParameterDeclaration (COMMA formalTypeParameterDeclaration)* GT;

formalTypeParameterDeclaration :
  ID CONFORMSTO typeDefinitionReference;

compositeDefinitionReference :
  fullyQualifiedName typeArgumentList? argumentList?;

typeArgumentList :
  LT
  (
    simpleTypeArgumentList
    | typeArgumentAssignementList
  )
  GT;

simpleTypeArgumentList :
  typeArgument (COMMA typeArgument)*;

typeArgumentAssignementList :
  typeArgumentAssignement (COMMA typeArgumentAssignement)*;

typeArgument :
  compositeDefinitionReference
  | ANY;

typeArgumentAssignement :
  ID ASSIGN typeArgument;

extendedCompositeDefinitions :
  EXTENDS compositeDefinitionReference (COMMA compositeDefinitionReference)*;

compositeDefinitionBody :
  LBRACE compositeDefinitionElement* RBRACE;

compositeDefinitionElement :
  annotations
  (
    interfaceDefinition SEMICOLON
    | bindingDefinition SEMICOLON
    | subComponentDefinition SEMICOLON
    | invalidStatement SEMICOLON
  );

// -----------------------------------------------------------------------------
//  Content grammar
// -----------------------------------------------------------------------------

interfaceDefinition :
  (
    PROVIDES
    | REQUIRES
  )
  OPTIONAL? fullyQualifiedName AS ID (LBRACKET INTEGER_LITERAL? RBRACKET)?;

// -----------------------------------------------------------------------------

attributeDefinition :
  ATTRIBUTE attributeType? ID (ASSIGN attributeValue)?;

attributeType :
  INT
  | STRING
  | INT8_T
  | UINT8_T
  | INT16_T
  | UINT16_T
  | INT32_T
  | UINT32_T
  | INT64_T
  | UINT64_T
  | INTPTR_T
  | UINTPTR_T;

attributeValue :
  stringValue
  | integerValue
  | referenceValue
  | nullValue;

// -----------------------------------------------------------------------------

dataDefinition :
  DATA
  (
    path
    | INLINED_CODE
  );

implementationDefinition :
  SOURCE
  (
    path
    | INLINED_CODE
  );

path :
  (DOT SLASH)? (DOTDOT SLASH)* ID (SLASH ID)* DOT ID;

// -----------------------------------------------------------------------------

bindingDefinition :
  BINDS bindingComponentName DOT ID (LBRACKET INTEGER_LITERAL RBRACKET)? TO bindingComponentName DOT ID (LBRACKET INTEGER_LITERAL RBRACKET)?;

bindingComponentName :
  ID
  | THIS;

// -----------------------------------------------------------------------------

subComponentDefinition :
  CONTAINS subComponentReference;

subComponentReference :
  compositeDefinitionReference? AS ID
  (
    annotations
    (
      primitiveAnonymousDefinition
      | compositeAnonymousDefinition
    )
  )?;

primitiveAnonymousDefinition :
  PRIMITIVE LBRACE primitiveDefinitionElement* RBRACE;

compositeAnonymousDefinition :
  COMPOSITE LBRACE compositeDefinitionElement* RBRACE;

// -----------------------------------------------------------------------------

/** 
 * invalidStatement is defined to match a statement that starts with an invalid 
 * keyword and ends with a semicolon. This rule produces nothing in output tree
 * and reports an error.
 */
invalidStatement :
  t=
  ~(
    PROVIDES
    | REQUIRES
    | CONTAINS
    | BINDS
    | ATTRIBUTE
    | DATA
    | SOURCE
    | RBRACE
    | AT
    | LPAREN
    | DOT
   )
  (~SEMICOLON)* 
   {
    RecognitionException e = new MismatchedTokenException(RBRACE, input);
    e.token = $t;
    e.index = $t.getTokenIndex();
    e.line = $t.getLine();
    e.charPositionInLine = $t.getCharPositionInLine();
    reportError(e);
   };

// -----------------------------------------------------------------------------
//  Annotation grammar
// -----------------------------------------------------------------------------

annotations :
  annotation*;

annotation :
  AT fullyQualifiedName annotationParameter?;

annotationParameter :
  LPAREN
  (
    singleAnnotationValue
    | annotationValuePairs
  )
  RPAREN;

singleAnnotationValue :
  annotationValue;

annotationValuePairs :
  annotationValuePair (COMMA annotationValuePair)*;

annotationValuePair :
  ID ASSIGN annotationValue;

annotationValue :
  stringValue
  | integerValue
  | booleanValue
  | annotationAnnotationValue
  | arrayAnnotationValue
  | nullValue;

annotationAnnotationValue :
  annotation;

arrayAnnotationValue :
  LBRACE (annotationValue (COMMA annotationValue)*)? RBRACE;

// -----------------------------------------------------------------------------
//  Common grammar
// -----------------------------------------------------------------------------

fullyQualifiedName :
  ID (DOT ID)*;

stringValue :
  STRING_LITERAL;

integerValue :
  (
    MINUS
    | PLUS
  )?
  INTEGER_LITERAL;

booleanValue :
  BOOLEAN_LITERAL;

referenceValue :
  ID;

nullValue :
  NULL;

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

BOOLEAN_LITERAL :
  'true'
  | 'false';

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
  | '/*' (options {greedy=false;}: .)* '*/' 
   {
    $channel = HIDDEN;
   };

INLINED_CODE :
  '{{' (options {greedy=false;}: .)* '}}';

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

STRING_LITERAL :
  '"'
  (
    ESC_SEQ
    |
    ~(
      '\\'
      | '"'
     )
  )*
  '"';

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
