lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : '?' ;
T12 : 'this' ;
T13 : 'nodata' ;
T14 : ':' ;
T15 : ',' ;
T16 : ';' ;
T17 : '.' ;
T18 : '/' ;
T19 : '\\' ;
T20 : '!' ;
T21 : '@' ;
T22 : '\"' ;
T23 : '\'' ;
T24 : '*' ;
T25 : '\\\\' ;
T26 : 'override' ;
T27 : 'singleton' ;
T28 : 'LDFlags' ;
T29 : 'CFlags' ;
T30 : 'STRUCT' ;
T31 : 'UNION' ;
T32 : 'ENUM' ;
T33 : 'optional' ;
T34 : 'mandatory' ;
T35 : 'provides' ;
T36 : 'requires' ;
T37 : 'import' ;
T38 : '.*' ;
T39 : 'primitive' ;
T40 : '{' ;
T41 : '}' ;
T42 : 'type' ;
T43 : 'extends' ;
T44 : 'composite' ;
T45 : '<' ;
T46 : '>' ;
T47 : '(' ;
T48 : ')' ;
T49 : 'contains' ;
T50 : 'as' ;
T51 : '=' ;
T52 : 'attribute' ;
T53 : 'binds' ;
T54 : 'to' ;
T55 : '[' ;
T56 : ']' ;
T57 : 'data' ;
T58 : '{{' ;
T59 : '}}' ;
T60 : 'source' ;
T61 : 'conformsto' ;
T62 : 'abstract' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8158
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8160
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8162
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8164
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8166
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8168
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8170
RULE_ANY_OTHER : .;


