lexer grammar InternalAdl;
@header {
package org.ow2.mind.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'this' ;
T13 : '*' ;
T14 : 'struct' ;
T15 : 'union' ;
T16 : 'enum' ;
T17 : 'int' ;
T18 : 'string' ;
T19 : 'int8_t' ;
T20 : 'uint8_t' ;
T21 : 'int16_t' ;
T22 : 'uint16_t' ;
T23 : 'int32_t' ;
T24 : 'uint32_t' ;
T25 : 'intptr_t' ;
T26 : 'uintptr_t' ;
T27 : 'import' ;
T28 : ';' ;
T29 : 'type' ;
T30 : 'extends' ;
T31 : ',' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'primitive' ;
T35 : '(' ;
T36 : ')' ;
T37 : 'composite' ;
T38 : '<' ;
T39 : '>' ;
T40 : 'conformsto' ;
T41 : '=' ;
T42 : 'provides' ;
T43 : 'as' ;
T44 : ']' ;
T45 : 'requires' ;
T46 : 'input' ;
T47 : 'output' ;
T48 : ':' ;
T49 : 'attribute' ;
T50 : 'data' ;
T51 : 'source' ;
T52 : '/' ;
T53 : './' ;
T54 : '../' ;
T55 : '.' ;
T56 : 'contains' ;
T57 : 'binds' ;
T58 : 'to' ;
T59 : '[' ;
T60 : '@' ;
T61 : 'abstract' ;
T62 : 'optional' ;
T63 : 'NULL' ;
T64 : 'null' ;
T65 : 'true' ;
T66 : 'false' ;

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12008
RULE_INLINEDCODE : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12010
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12012
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12014
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12016
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12018
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12020
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.adl.ui/src-gen/org/ow2/mind/ui/contentassist/antlr/internal/InternalAdl.g" 12022
RULE_ANY_OTHER : .;


