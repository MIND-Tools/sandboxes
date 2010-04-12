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
T30 : 'attribute' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'binds' ;
T34 : 'this' ;
T35 : '.' ;
T36 : 'to' ;
T37 : 'data' ;
T38 : 'nodata' ;
T39 : 'source' ;
T40 : 'conformsto' ;
T41 : '@' ;
T42 : 'null' ;
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

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4334
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4336
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4338
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4340
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4342
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4344
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4346
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4348
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4350
RULE_ANY_OTHER : .;


