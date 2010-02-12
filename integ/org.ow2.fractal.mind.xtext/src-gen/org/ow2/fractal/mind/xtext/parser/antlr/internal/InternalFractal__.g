lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : '.*' ;
T13 : ';' ;
T14 : 'abstract' ;
T15 : 'primitive' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'type' ;
T19 : 'extends' ;
T20 : ',' ;
T21 : 'composite' ;
T22 : '<' ;
T23 : '>' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'contains' ;
T27 : 'as' ;
T28 : '=' ;
T29 : '?' ;
T30 : 'attribute' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'binds' ;
T34 : 'this' ;
T35 : '.' ;
T36 : 'to' ;
T37 : 'data' ;
T38 : '{{' ;
T39 : '}}' ;
T40 : 'nodata' ;
T41 : 'source' ;
T42 : 'conformsto' ;
T43 : '@' ;
T44 : ':' ;
T45 : '/' ;
T46 : '\\' ;
T47 : '!' ;
T48 : '\"' ;
T49 : '\'' ;
T50 : '*' ;
T51 : '\\\\' ;
T52 : 'override' ;
T53 : 'singleton' ;
T54 : 'LDFlags' ;
T55 : 'CFlags' ;
T56 : 'STRUCT' ;
T57 : 'UNION' ;
T58 : 'ENUM' ;
T59 : 'optional' ;
T60 : 'mandatory' ;
T61 : 'provides' ;
T62 : 'requires' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 3990
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 3992
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 3994
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 3996
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 3998
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4000
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4002
RULE_ANY_OTHER : .;


