lexer grammar InternalFractalIdt;
@header {
package org.ow2.mindEd.idt.editor.textual.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T18 : 'struct' ;
T19 : 'union' ;
T20 : 'null' ;
T21 : 'e' ;
T22 : 'E' ;
T23 : 'const' ;
T24 : 'volatile' ;
T25 : 'void' ;
T26 : 'char' ;
T27 : 'short' ;
T28 : 'int' ;
T29 : 'long' ;
T30 : 'float' ;
T31 : 'double' ;
T32 : 'signed' ;
T33 : 'unsigned' ;
T34 : 'string' ;
T35 : 'int8_t' ;
T36 : 'uint8_t' ;
T37 : 'int16_t' ;
T38 : 'uint16_t' ;
T39 : 'int32_t' ;
T40 : 'uint32_t' ;
T41 : 'int64_t' ;
T42 : 'uint64_t' ;
T43 : 'intptr_t' ;
T44 : 'uintptr_t' ;
T45 : 'in' ;
T46 : 'out' ;
T47 : '#endif' ;
T48 : '#ifndef' ;
T49 : ';' ;
T50 : 'typedef' ;
T51 : '{' ;
T52 : '}' ;
T53 : ':' ;
T54 : 'enum' ;
T55 : ',' ;
T56 : '=' ;
T57 : '*' ;
T58 : '(' ;
T59 : ')' ;
T60 : '[' ;
T61 : ']' ;
T62 : '.' ;
T63 : '#define' ;
T64 : 'interface' ;
T65 : 'unmanaged' ;
T66 : '...' ;
T67 : '#include' ;
T68 : '@' ;
T69 : '||' ;
T70 : '&&' ;
T71 : '|' ;
T72 : '^' ;
T73 : '&' ;

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 9997
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 9999
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10001
RULE_SHIFTOPERATION : ('<<'|'>>');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10003
RULE_ADDITIVEOPERATION : ('+'|'-');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10005
RULE_MULOPERATION : ('*'|'/'|'%');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10007
RULE_UNARYOPERATION : ('&'|'*'|'+'|'-'|'~'|'!');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10009
RULE_FDSYMBOL : ('f'|'F'|'d'|'D');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10011
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10013
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10015
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10017
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10019
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10021
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.idt.editor.textual.ui/src-gen/org/ow2/mindEd/idt/editor/textual/ui/contentassist/antlr/internal/InternalFractalIdt.g" 10023
RULE_ANY_OTHER : .;


