lexer grammar InternalAdl;
@header {
package org.ow2.mind.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'import' ;
T13 : ';' ;
T14 : 'type' ;
T15 : 'extends' ;
T16 : ',' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'abstract' ;
T20 : 'primitive' ;
T21 : '(' ;
T22 : ')' ;
T23 : 'composite' ;
T24 : '<' ;
T25 : '>' ;
T26 : 'conformsto' ;
T27 : '=' ;
T28 : 'provides' ;
T29 : 'as' ;
T30 : '[' ;
T31 : ']' ;
T32 : 'requires' ;
T33 : 'optional' ;
T34 : 'input' ;
T35 : 'output' ;
T36 : ':' ;
T37 : 'attribute' ;
T38 : 'data' ;
T39 : 'source' ;
T40 : '/' ;
T41 : './' ;
T42 : '../' ;
T43 : '.' ;
T44 : 'contains' ;
T45 : 'binds' ;
T46 : 'this' ;
T47 : 'to' ;
T48 : '@' ;
T49 : 'NULL' ;
T50 : 'null' ;
T51 : 'true' ;
T52 : 'false' ;
T53 : '*' ;
T54 : 'struct' ;
T55 : 'union' ;
T56 : 'enum' ;
T57 : 'int' ;
T58 : 'string' ;
T59 : 'int8_t' ;
T60 : 'uint8_t' ;
T61 : 'int16_t' ;
T62 : 'uint16_t' ;
T63 : 'int32_t' ;
T64 : 'uint32_t' ;
T65 : 'intptr_t' ;
T66 : 'uintptr_t' ;

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5254
RULE_INLINEDCODE : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5256
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5258
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5260
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5262
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5264
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5266
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g" 5268
RULE_ANY_OTHER : .;


