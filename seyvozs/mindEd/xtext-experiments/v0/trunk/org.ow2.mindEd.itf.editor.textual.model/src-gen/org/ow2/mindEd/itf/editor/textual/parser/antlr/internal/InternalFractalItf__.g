lexer grammar InternalFractalItf;
@header {
package org.ow2.mindEd.itf.editor.textual.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T18 : ';' ;
T19 : 'typedef' ;
T20 : '{' ;
T21 : '}' ;
T22 : 'struct' ;
T23 : 'union' ;
T24 : ':' ;
T25 : 'enum' ;
T26 : ',' ;
T27 : '=' ;
T28 : '*' ;
T29 : '(' ;
T30 : ')' ;
T31 : '[' ;
T32 : ']' ;
T33 : '.' ;
T34 : '#define' ;
T35 : 'interface' ;
T36 : 'unmanaged' ;
T37 : 'void' ;
T38 : '...' ;
T39 : '#include' ;
T40 : '@' ;
T41 : 'null' ;
T42 : '||' ;
T43 : '&&' ;
T44 : '|' ;
T45 : '^' ;
T46 : '&' ;
T47 : 'e' ;
T48 : 'E' ;
T49 : 'const' ;
T50 : 'volatile' ;
T51 : 'char' ;
T52 : 'short' ;
T53 : 'int' ;
T54 : 'long' ;
T55 : 'float' ;
T56 : 'double' ;
T57 : 'signed' ;
T58 : 'unsigned' ;
T59 : 'string' ;
T60 : 'int8_t' ;
T61 : 'uint8_t' ;
T62 : 'int16_t' ;
T63 : 'uint16_t' ;
T64 : 'int32_t' ;
T65 : 'uint32_t' ;
T66 : 'int64_t' ;
T67 : 'uint64_t' ;
T68 : 'intptr_t' ;
T69 : 'uintptr_t' ;
T70 : 'in' ;
T71 : 'out' ;

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4557
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4559
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4561
RULE_SHIFTOPERATION : ('<<'|'>>');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4563
RULE_ADDITIVEOPERATION : ('+'|'-');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4565
RULE_MULOPERATION : ('*'|'/'|'%');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4567
RULE_UNARYOPERATION : ('&'|'*'|'+'|'-'|'~'|'!');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4569
RULE_FDSYMBOL : ('f'|'F'|'d'|'D');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4571
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4573
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4575
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4577
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4579
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4581
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g" 4583
RULE_ANY_OTHER : .;


