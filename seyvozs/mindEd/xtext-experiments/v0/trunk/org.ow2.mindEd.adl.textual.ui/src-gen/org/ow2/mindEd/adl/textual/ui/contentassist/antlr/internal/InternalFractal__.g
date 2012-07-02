lexer grammar InternalFractal;
@header {
package org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'this' ;
T14 : 'null' ;
T15 : 'Override' ;
T16 : 'Singleton' ;
T17 : 'LDFlags' ;
T18 : 'CFlags' ;
T19 : 'STRUCT' ;
T20 : 'UNION' ;
T21 : 'ENUM' ;
T22 : '+' ;
T23 : '-' ;
T24 : 'provides' ;
T25 : 'requires' ;
T26 : 'import' ;
T27 : ';' ;
T28 : 'primitive' ;
T29 : '{' ;
T30 : '}' ;
T31 : 'type' ;
T32 : 'composite' ;
T33 : '<' ;
T34 : '>' ;
T35 : ',' ;
T36 : '(' ;
T37 : ')' ;
T38 : 'extends' ;
T39 : 'contains' ;
T40 : 'as' ;
T41 : '=' ;
T42 : 'attribute' ;
T43 : ']' ;
T44 : 'binds' ;
T45 : '.' ;
T46 : 'to' ;
T47 : '[' ;
T48 : 'data' ;
T49 : 'source' ;
T50 : 'conformsto' ;
T51 : '@' ;
T52 : '0x' ;
T53 : '.*' ;
T54 : 'abstract' ;
T55 : 'optional' ;
T56 : '[]' ;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9889
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9891
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9893
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9895
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9897
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9899
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9901
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9903
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9905
RULE_ANY_OTHER : .;


