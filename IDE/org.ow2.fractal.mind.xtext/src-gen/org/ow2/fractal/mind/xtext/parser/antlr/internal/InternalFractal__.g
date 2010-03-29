lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'import' ;
T14 : ';' ;
T15 : 'abstract' ;
T16 : 'primitive' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'type' ;
T20 : 'composite' ;
T21 : '<' ;
T22 : ',' ;
T23 : '>' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'extends' ;
T27 : 'contains' ;
T28 : 'as' ;
T29 : '=' ;
T30 : '?' ;
T31 : 'attribute' ;
T32 : '[' ;
T33 : ']' ;
T34 : 'binds' ;
T35 : 'this' ;
T36 : '.' ;
T37 : 'to' ;
T38 : 'data' ;
T39 : 'nodata' ;
T40 : 'source' ;
T41 : 'conformsto' ;
T42 : '@' ;
T43 : '0x' ;
T44 : 'Override' ;
T45 : 'Singleton' ;
T46 : 'LDFlags' ;
T47 : 'CFlags' ;
T48 : 'STRUCT' ;
T49 : 'UNION' ;
T50 : 'ENUM' ;
T51 : '.*' ;
T52 : '+' ;
T53 : '-' ;
T54 : 'optional' ;
T55 : 'mandatory' ;
T56 : 'provides' ;
T57 : 'requires' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4157
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4159
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4161
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4163
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4165
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4167
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4169
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4171
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4173
RULE_ANY_OTHER : .;


