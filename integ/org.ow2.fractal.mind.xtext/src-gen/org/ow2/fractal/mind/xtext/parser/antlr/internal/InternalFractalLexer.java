package org.ow2.fractal.mind.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T62=62;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=63;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=6;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalFractalLexer() {;} 
    public InternalFractalLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:10:5: ( 'import' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:10:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:11:5: ( '.*' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:11:7: '.*'
            {
            match(".*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:12:5: ( ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:12:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:13:5: ( 'abstract' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:13:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:14:5: ( 'primitive' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:14:7: 'primitive'
            {
            match("primitive"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:15:5: ( '{' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:15:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:16:5: ( '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:17:5: ( 'type' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:17:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:18:5: ( 'extends' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:18:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:19:5: ( ',' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:19:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:20:5: ( 'composite' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:20:7: 'composite'
            {
            match("composite"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:21:5: ( '<' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:21:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:22:5: ( '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:22:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:23:5: ( '(' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:23:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:24:5: ( ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:24:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:25:5: ( 'contains' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:25:7: 'contains'
            {
            match("contains"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:26:5: ( 'as' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:26:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:27:5: ( '=' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:27:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:28:5: ( '?' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:28:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:29:5: ( 'attribute' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:29:7: 'attribute'
            {
            match("attribute"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:30:5: ( '[' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:30:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:31:5: ( ']' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:31:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:32:5: ( 'binds' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:32:7: 'binds'
            {
            match("binds"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:33:5: ( 'this' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:33:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:34:5: ( '.' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:34:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:35:5: ( 'to' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:35:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:36:5: ( 'data' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:36:7: 'data'
            {
            match("data"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:37:5: ( '{{' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:37:7: '{{'
            {
            match("{{"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:38:5: ( '}}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:38:7: '}}'
            {
            match("}}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:39:5: ( 'nodata' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:39:7: 'nodata'
            {
            match("nodata"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:40:5: ( 'source' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:40:7: 'source'
            {
            match("source"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:41:5: ( 'conformsto' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:41:7: 'conformsto'
            {
            match("conformsto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:42:5: ( '@' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:42:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:43:5: ( ':' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:43:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:44:5: ( '/' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:44:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:45:5: ( '\\\\' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:45:7: '\\\\'
            {
            match('\\'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:46:5: ( '!' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:46:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:47:5: ( '\\\"' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:47:7: '\\\"'
            {
            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:48:5: ( '\\'' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:48:7: '\\''
            {
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:49:5: ( '*' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:49:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:50:5: ( '\\\\\\\\' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:50:7: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:51:5: ( 'override' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:51:7: 'override'
            {
            match("override"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:52:5: ( 'singleton' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:52:7: 'singleton'
            {
            match("singleton"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:53:5: ( 'LDFlags' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:53:7: 'LDFlags'
            {
            match("LDFlags"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:54:5: ( 'CFlags' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:54:7: 'CFlags'
            {
            match("CFlags"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:55:5: ( 'STRUCT' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:55:7: 'STRUCT'
            {
            match("STRUCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:56:5: ( 'UNION' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:56:7: 'UNION'
            {
            match("UNION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:57:5: ( 'ENUM' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:57:7: 'ENUM'
            {
            match("ENUM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:58:5: ( 'optional' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:58:7: 'optional'
            {
            match("optional"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:59:5: ( 'mandatory' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:59:7: 'mandatory'
            {
            match("mandatory"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:60:5: ( 'provides' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:60:7: 'provides'
            {
            match("provides"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:61:5: ( 'requires' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:61:7: 'requires'
            {
            match("requires"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3990:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3990:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3990:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3990:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3990:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3994:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3998:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4000:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4000:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4000:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4002:16: ( . )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4002:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=59;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='i') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='m') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='p') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='o') ) {
                        int LA12_126 = input.LA(5);

                        if ( (LA12_126=='r') ) {
                            int LA12_151 = input.LA(6);

                            if ( (LA12_151=='t') ) {
                                int LA12_176 = input.LA(7);

                                if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='.') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='*') ) {
                alt12=2;
            }
            else {
                alt12=25;}
        }
        else if ( (LA12_0==';') ) {
            alt12=3;
        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='s') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='t') ) {
                        int LA12_127 = input.LA(5);

                        if ( (LA12_127=='r') ) {
                            int LA12_152 = input.LA(6);

                            if ( (LA12_152=='a') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='c') ) {
                                    int LA12_198 = input.LA(8);

                                    if ( (LA12_198=='t') ) {
                                        int LA12_216 = input.LA(9);

                                        if ( ((LA12_216>='0' && LA12_216<='9')||(LA12_216>='A' && LA12_216<='Z')||LA12_216=='_'||(LA12_216>='a' && LA12_216<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=4;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 't':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='t') ) {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='r') ) {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='i') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='b') ) {
                                int LA12_178 = input.LA(7);

                                if ( (LA12_178=='u') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( (LA12_199=='t') ) {
                                        int LA12_217 = input.LA(9);

                                        if ( (LA12_217=='e') ) {
                                            int LA12_231 = input.LA(10);

                                            if ( ((LA12_231>='0' && LA12_231<='9')||(LA12_231>='A' && LA12_231<='Z')||LA12_231=='_'||(LA12_231>='a' && LA12_231<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=20;}
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 's':
                {
                int LA12_52 = input.LA(3);

                if ( ((LA12_52>='0' && LA12_52<='9')||(LA12_52>='A' && LA12_52<='Z')||LA12_52=='_'||(LA12_52>='a' && LA12_52<='z')) ) {
                    alt12=53;
                }
                else {
                    alt12=17;}
                }
                break;
            default:
                alt12=53;}

        }
        else if ( (LA12_0=='p') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='r') ) {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='v') ) {
                        int LA12_129 = input.LA(5);

                        if ( (LA12_129=='i') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='d') ) {
                                int LA12_179 = input.LA(7);

                                if ( (LA12_179=='e') ) {
                                    int LA12_200 = input.LA(8);

                                    if ( (LA12_200=='s') ) {
                                        int LA12_218 = input.LA(9);

                                        if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=51;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                    }
                    break;
                case 'i':
                    {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='m') ) {
                        int LA12_130 = input.LA(5);

                        if ( (LA12_130=='i') ) {
                            int LA12_155 = input.LA(6);

                            if ( (LA12_155=='t') ) {
                                int LA12_180 = input.LA(7);

                                if ( (LA12_180=='i') ) {
                                    int LA12_201 = input.LA(8);

                                    if ( (LA12_201=='v') ) {
                                        int LA12_219 = input.LA(9);

                                        if ( (LA12_219=='e') ) {
                                            int LA12_233 = input.LA(10);

                                            if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=5;}
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                    }
                    break;
                default:
                    alt12=53;}

            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='{') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='{') ) {
                alt12=28;
            }
            else {
                alt12=6;}
        }
        else if ( (LA12_0=='}') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='}') ) {
                alt12=29;
            }
            else {
                alt12=7;}
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='p') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='e') ) {
                        int LA12_131 = input.LA(5);

                        if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                            alt12=53;
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 'o':
                {
                int LA12_59 = input.LA(3);

                if ( ((LA12_59>='0' && LA12_59<='9')||(LA12_59>='A' && LA12_59<='Z')||LA12_59=='_'||(LA12_59>='a' && LA12_59<='z')) ) {
                    alt12=53;
                }
                else {
                    alt12=26;}
                }
                break;
            case 'h':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='i') ) {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='s') ) {
                        int LA12_132 = input.LA(5);

                        if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                            alt12=53;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            default:
                alt12=53;}

        }
        else if ( (LA12_0=='e') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='x') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='t') ) {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='e') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='n') ) {
                            int LA12_158 = input.LA(6);

                            if ( (LA12_158=='d') ) {
                                int LA12_181 = input.LA(7);

                                if ( (LA12_181=='s') ) {
                                    int LA12_202 = input.LA(8);

                                    if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                        alt12=53;
                                    }
                                    else {
                                        alt12=9;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0==',') ) {
            alt12=10;
        }
        else if ( (LA12_0=='c') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='o') ) {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    switch ( input.LA(4) ) {
                    case 'f':
                        {
                        int LA12_134 = input.LA(5);

                        if ( (LA12_134=='o') ) {
                            int LA12_159 = input.LA(6);

                            if ( (LA12_159=='r') ) {
                                int LA12_182 = input.LA(7);

                                if ( (LA12_182=='m') ) {
                                    int LA12_203 = input.LA(8);

                                    if ( (LA12_203=='s') ) {
                                        int LA12_221 = input.LA(9);

                                        if ( (LA12_221=='t') ) {
                                            int LA12_234 = input.LA(10);

                                            if ( (LA12_234=='o') ) {
                                                int LA12_244 = input.LA(11);

                                                if ( ((LA12_244>='0' && LA12_244<='9')||(LA12_244>='A' && LA12_244<='Z')||LA12_244=='_'||(LA12_244>='a' && LA12_244<='z')) ) {
                                                    alt12=53;
                                                }
                                                else {
                                                    alt12=32;}
                                            }
                                            else {
                                                alt12=53;}
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                        }
                        break;
                    case 't':
                        {
                        int LA12_135 = input.LA(5);

                        if ( (LA12_135=='a') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='i') ) {
                                int LA12_183 = input.LA(7);

                                if ( (LA12_183=='n') ) {
                                    int LA12_204 = input.LA(8);

                                    if ( (LA12_204=='s') ) {
                                        int LA12_222 = input.LA(9);

                                        if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                        }
                        break;
                    default:
                        alt12=53;}

                    }
                    break;
                case 'm':
                    {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='p') ) {
                        int LA12_136 = input.LA(5);

                        if ( (LA12_136=='o') ) {
                            int LA12_161 = input.LA(6);

                            if ( (LA12_161=='s') ) {
                                int LA12_184 = input.LA(7);

                                if ( (LA12_184=='i') ) {
                                    int LA12_205 = input.LA(8);

                                    if ( (LA12_205=='t') ) {
                                        int LA12_223 = input.LA(9);

                                        if ( (LA12_223=='e') ) {
                                            int LA12_236 = input.LA(10);

                                            if ( ((LA12_236>='0' && LA12_236<='9')||(LA12_236>='A' && LA12_236<='Z')||LA12_236=='_'||(LA12_236>='a' && LA12_236<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=11;}
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                    }
                    break;
                default:
                    alt12=53;}

            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='<') ) {
            alt12=12;
        }
        else if ( (LA12_0=='>') ) {
            alt12=13;
        }
        else if ( (LA12_0=='(') ) {
            alt12=14;
        }
        else if ( (LA12_0==')') ) {
            alt12=15;
        }
        else if ( (LA12_0=='=') ) {
            alt12=18;
        }
        else if ( (LA12_0=='?') ) {
            alt12=19;
        }
        else if ( (LA12_0=='[') ) {
            alt12=21;
        }
        else if ( (LA12_0==']') ) {
            alt12=22;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='i') ) {
                int LA12_72 = input.LA(3);

                if ( (LA12_72=='n') ) {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='d') ) {
                        int LA12_137 = input.LA(5);

                        if ( (LA12_137=='s') ) {
                            int LA12_162 = input.LA(6);

                            if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                alt12=53;
                            }
                            else {
                                alt12=23;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='a') ) {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='t') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='a') ) {
                        int LA12_138 = input.LA(5);

                        if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                            alt12=53;
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='o') ) {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='d') ) {
                    int LA12_114 = input.LA(4);

                    if ( (LA12_114=='a') ) {
                        int LA12_139 = input.LA(5);

                        if ( (LA12_139=='t') ) {
                            int LA12_164 = input.LA(6);

                            if ( (LA12_164=='a') ) {
                                int LA12_186 = input.LA(7);

                                if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='u') ) {
                    int LA12_115 = input.LA(4);

                    if ( (LA12_115=='r') ) {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='c') ) {
                            int LA12_165 = input.LA(6);

                            if ( (LA12_165=='e') ) {
                                int LA12_187 = input.LA(7);

                                if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=31;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 'i':
                {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='n') ) {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='g') ) {
                        int LA12_141 = input.LA(5);

                        if ( (LA12_141=='l') ) {
                            int LA12_166 = input.LA(6);

                            if ( (LA12_166=='e') ) {
                                int LA12_188 = input.LA(7);

                                if ( (LA12_188=='t') ) {
                                    int LA12_208 = input.LA(8);

                                    if ( (LA12_208=='o') ) {
                                        int LA12_224 = input.LA(9);

                                        if ( (LA12_224=='n') ) {
                                            int LA12_237 = input.LA(10);

                                            if ( ((LA12_237>='0' && LA12_237<='9')||(LA12_237>='A' && LA12_237<='Z')||LA12_237=='_'||(LA12_237>='a' && LA12_237<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            default:
                alt12=53;}

        }
        else if ( (LA12_0=='@') ) {
            alt12=33;
        }
        else if ( (LA12_0==':') ) {
            alt12=34;
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=57;
                }
                break;
            case '*':
                {
                alt12=56;
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='\\') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='\\') ) {
                alt12=41;
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='!') ) {
            alt12=37;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_29 = input.LA(2);

            if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFE')) ) {
                alt12=55;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_30 = input.LA(2);

            if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFE')) ) {
                alt12=55;
            }
            else {
                alt12=39;}
        }
        else if ( (LA12_0=='*') ) {
            alt12=40;
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'p':
                {
                int LA12_89 = input.LA(3);

                if ( (LA12_89=='t') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='i') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='o') ) {
                            int LA12_167 = input.LA(6);

                            if ( (LA12_167=='n') ) {
                                int LA12_189 = input.LA(7);

                                if ( (LA12_189=='a') ) {
                                    int LA12_209 = input.LA(8);

                                    if ( (LA12_209=='l') ) {
                                        int LA12_225 = input.LA(9);

                                        if ( ((LA12_225>='0' && LA12_225<='9')||(LA12_225>='A' && LA12_225<='Z')||LA12_225=='_'||(LA12_225>='a' && LA12_225<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=49;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 'v':
                {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='e') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='r') ) {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='r') ) {
                            int LA12_168 = input.LA(6);

                            if ( (LA12_168=='i') ) {
                                int LA12_190 = input.LA(7);

                                if ( (LA12_190=='d') ) {
                                    int LA12_210 = input.LA(8);

                                    if ( (LA12_210=='e') ) {
                                        int LA12_226 = input.LA(9);

                                        if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            default:
                alt12=53;}

        }
        else if ( (LA12_0=='L') ) {
            int LA12_33 = input.LA(2);

            if ( (LA12_33=='D') ) {
                int LA12_91 = input.LA(3);

                if ( (LA12_91=='F') ) {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='l') ) {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='a') ) {
                            int LA12_169 = input.LA(6);

                            if ( (LA12_169=='g') ) {
                                int LA12_191 = input.LA(7);

                                if ( (LA12_191=='s') ) {
                                    int LA12_211 = input.LA(8);

                                    if ( ((LA12_211>='0' && LA12_211<='9')||(LA12_211>='A' && LA12_211<='Z')||LA12_211=='_'||(LA12_211>='a' && LA12_211<='z')) ) {
                                        alt12=53;
                                    }
                                    else {
                                        alt12=44;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_34 = input.LA(2);

            if ( (LA12_34=='F') ) {
                int LA12_92 = input.LA(3);

                if ( (LA12_92=='l') ) {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='a') ) {
                        int LA12_145 = input.LA(5);

                        if ( (LA12_145=='g') ) {
                            int LA12_170 = input.LA(6);

                            if ( (LA12_170=='s') ) {
                                int LA12_192 = input.LA(7);

                                if ( ((LA12_192>='0' && LA12_192<='9')||(LA12_192>='A' && LA12_192<='Z')||LA12_192=='_'||(LA12_192>='a' && LA12_192<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_35 = input.LA(2);

            if ( (LA12_35=='T') ) {
                int LA12_93 = input.LA(3);

                if ( (LA12_93=='R') ) {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='U') ) {
                        int LA12_146 = input.LA(5);

                        if ( (LA12_146=='C') ) {
                            int LA12_171 = input.LA(6);

                            if ( (LA12_171=='T') ) {
                                int LA12_193 = input.LA(7);

                                if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='U') ) {
            int LA12_36 = input.LA(2);

            if ( (LA12_36=='N') ) {
                int LA12_94 = input.LA(3);

                if ( (LA12_94=='I') ) {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='O') ) {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147=='N') ) {
                            int LA12_172 = input.LA(6);

                            if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                                alt12=53;
                            }
                            else {
                                alt12=47;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='E') ) {
            int LA12_37 = input.LA(2);

            if ( (LA12_37=='N') ) {
                int LA12_95 = input.LA(3);

                if ( (LA12_95=='U') ) {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='M') ) {
                        int LA12_148 = input.LA(5);

                        if ( ((LA12_148>='0' && LA12_148<='9')||(LA12_148>='A' && LA12_148<='Z')||LA12_148=='_'||(LA12_148>='a' && LA12_148<='z')) ) {
                            alt12=53;
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_38 = input.LA(2);

            if ( (LA12_38=='a') ) {
                int LA12_96 = input.LA(3);

                if ( (LA12_96=='n') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='d') ) {
                        int LA12_149 = input.LA(5);

                        if ( (LA12_149=='a') ) {
                            int LA12_174 = input.LA(6);

                            if ( (LA12_174=='t') ) {
                                int LA12_195 = input.LA(7);

                                if ( (LA12_195=='o') ) {
                                    int LA12_214 = input.LA(8);

                                    if ( (LA12_214=='r') ) {
                                        int LA12_228 = input.LA(9);

                                        if ( (LA12_228=='y') ) {
                                            int LA12_240 = input.LA(10);

                                            if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=50;}
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_39 = input.LA(2);

            if ( (LA12_39=='e') ) {
                int LA12_97 = input.LA(3);

                if ( (LA12_97=='q') ) {
                    int LA12_125 = input.LA(4);

                    if ( (LA12_125=='u') ) {
                        int LA12_150 = input.LA(5);

                        if ( (LA12_150=='i') ) {
                            int LA12_175 = input.LA(6);

                            if ( (LA12_175=='r') ) {
                                int LA12_196 = input.LA(7);

                                if ( (LA12_196=='e') ) {
                                    int LA12_215 = input.LA(8);

                                    if ( (LA12_215=='s') ) {
                                        int LA12_229 = input.LA(9);

                                        if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=52;}
                                    }
                                    else {
                                        alt12=53;}
                                }
                                else {
                                    alt12=53;}
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_40 = input.LA(2);

            if ( ((LA12_40>='A' && LA12_40<='Z')||LA12_40=='_'||(LA12_40>='a' && LA12_40<='z')) ) {
                alt12=53;
            }
            else {
                alt12=59;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='B')||LA12_0=='D'||(LA12_0>='F' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='R')||LA12_0=='T'||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=53;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=54;
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=58;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||LA12_0=='+'||LA12_0=='-'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=59;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:218: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:235: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:247: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:263: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:279: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:287: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}