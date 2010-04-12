lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'this' ;
T14 : 'nodata' ;
T15 : 'null' ;
T16 : 'Override' ;
T17 : 'Singleton' ;
T18 : 'LDFlags' ;
T19 : 'CFlags' ;
T20 : 'STRUCT' ;
T21 : 'UNION' ;
T22 : 'ENUM' ;
T23 : '+' ;
T24 : '-' ;
T25 : 'optional' ;
T26 : 'mandatory' ;
T27 : 'provides' ;
T28 : 'requires' ;
T29 : 'import' ;
T30 : ';' ;
T31 : 'primitive' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'type' ;
T35 : 'composite' ;
T36 : '<' ;
T37 : '>' ;
T38 : ',' ;
T39 : '(' ;
T40 : ')' ;
T41 : 'extends' ;
T42 : 'contains' ;
T43 : 'as' ;
T44 : '=' ;
T45 : 'attribute' ;
T46 : 'binds' ;
T47 : '.' ;
T48 : 'to' ;
T49 : '[' ;
T50 : ']' ;
T51 : 'data' ;
T52 : 'source' ;
T53 : 'conformsto' ;
T54 : '@' ;
T55 : '0x' ;
T56 : '.*' ;
T57 : 'abstract' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7632
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7634
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7636
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7638
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7640
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7642
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7644
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7646
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/ui/contentassist/antlr/internal/InternalFractal.g" 7648
RULE_ANY_OTHER : .;


