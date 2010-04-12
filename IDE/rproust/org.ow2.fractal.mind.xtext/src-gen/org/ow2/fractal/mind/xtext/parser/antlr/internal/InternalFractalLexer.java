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
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_PATH=6;
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
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=58;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_CODEC=7;
    public static final int RULE_STRING=8;
    public static final int T50=50;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=11;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T57=57;
    public InternalFractalLexer() {;} 
    public InternalFractalLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
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
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:11:5: ( ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:11:7: ';'
            {
            match(';'); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:12:5: ( 'abstract' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:12:7: 'abstract'
            {
            match("abstract"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:13:5: ( 'primitive' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:13:7: 'primitive'
            {
            match("primitive"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:14:5: ( '{' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:14:7: '{'
            {
            match('{'); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:15:5: ( '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:15:7: '}'
            {
            match('}'); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:16:5: ( 'type' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:16:7: 'type'
            {
            match("type"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:17:5: ( 'composite' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:17:7: 'composite'
            {
            match("composite"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:18:5: ( '<' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:18:7: '<'
            {
            match('<'); 

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
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:20:5: ( '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:20:7: '>'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:21:5: ( '(' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:21:7: '('
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:22:5: ( ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:22:7: ')'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:23:5: ( 'extends' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:23:7: 'extends'
            {
            match("extends"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:24:5: ( 'contains' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:24:7: 'contains'
            {
            match("contains"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:25:5: ( 'as' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:25:7: 'as'
            {
            match("as"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:26:5: ( '=' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:26:7: '='
            {
            match('='); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:27:5: ( 'attribute' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:27:7: 'attribute'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:28:5: ( '[' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:28:7: '['
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:29:5: ( ']' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:29:7: ']'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:30:5: ( 'binds' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:30:7: 'binds'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:31:5: ( 'this' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:31:7: 'this'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:32:5: ( '.' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:32:7: '.'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:33:5: ( 'to' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:33:7: 'to'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:34:5: ( 'data' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:34:7: 'data'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:35:5: ( 'nodata' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:35:7: 'nodata'
            {
            match("nodata"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:36:5: ( 'source' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:36:7: 'source'
            {
            match("source"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:37:5: ( 'conformsto' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:37:7: 'conformsto'
            {
            match("conformsto"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:38:5: ( '@' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:38:7: '@'
            {
            match('@'); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:39:5: ( 'null' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:39:7: 'null'
            {
            match("null"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:40:5: ( '0x' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:40:7: '0x'
            {
            match("0x"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:41:5: ( 'Override' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:41:7: 'Override'
            {
            match("Override"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:42:5: ( 'Singleton' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:42:7: 'Singleton'
            {
            match("Singleton"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:43:5: ( 'LDFlags' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:43:7: 'LDFlags'
            {
            match("LDFlags"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:44:5: ( 'CFlags' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:44:7: 'CFlags'
            {
            match("CFlags"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:45:5: ( 'STRUCT' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:45:7: 'STRUCT'
            {
            match("STRUCT"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:46:5: ( 'UNION' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:46:7: 'UNION'
            {
            match("UNION"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:47:5: ( 'ENUM' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:47:7: 'ENUM'
            {
            match("ENUM"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:48:5: ( '.*' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:48:7: '.*'
            {
            match(".*"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:49:5: ( '+' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:49:7: '+'
            {
            match('+'); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:50:5: ( '-' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:50:7: '-'
            {
            match('-'); 

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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:51:5: ( 'optional' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:51:7: 'optional'
            {
            match("optional"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:52:5: ( 'mandatory' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:52:7: 'mandatory'
            {
            match("mandatory"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:53:5: ( 'provides' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:53:7: 'provides'
            {
            match("provides"); 


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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:54:5: ( 'requires' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:54:7: 'requires'
            {
            match("requires"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start RULE_CODEC
    public final void mRULE_CODEC() throws RecognitionException {
        try {
            int _type = RULE_CODEC;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4334:12: ( '{{' ( options {greedy=false; } : . )* '}}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4334:14: '{{' ( options {greedy=false; } : . )* '}}'
            {
            match("{{"); 

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4334:19: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='}') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='}') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='|')||(LA1_1>='~' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='|')||(LA1_0>='~' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4334:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("}}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_CODEC

    // $ANTLR start RULE_PATH
    public final void mRULE_PATH() throws RecognitionException {
        try {
            int _type = RULE_PATH;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:11: ( ( RULE_ID ( ':' )? | ( '.' )* ) ( ( '\\\\' | '\\\\\\\\' | '/' ) RULE_ID )* ( '\\\\' | '\\\\\\\\' | '/' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:13: ( RULE_ID ( ':' )? | ( '.' )* ) ( ( '\\\\' | '\\\\\\\\' | '/' ) RULE_ID )* ( '\\\\' | '\\\\\\\\' | '/' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:13: ( RULE_ID ( ':' )? | ( '.' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            else if ( ((LA4_0>='.' && LA4_0<='/')||LA4_0=='\\') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4336:13: ( RULE_ID ( ':' )? | ( '.' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:14: RULE_ID ( ':' )?
                    {
                    mRULE_ID(); 
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:22: ( ':' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==':') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:22: ':'
                            {
                            match(':'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:27: ( '.' )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:27: ( '.' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='.') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:27: '.'
                    	    {
                    	    match('.'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:33: ( ( '\\\\' | '\\\\\\\\' | '/' ) RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='\\') ) {
                        int LA6_3 = input.LA(3);

                        if ( ((LA6_3>='A' && LA6_3<='Z')||(LA6_3>='^' && LA6_3<='_')||(LA6_3>='a' && LA6_3<='z')) ) {
                            alt6=1;
                        }


                    }
                    else if ( ((LA6_1>='A' && LA6_1<='Z')||(LA6_1>='^' && LA6_1<='_')||(LA6_1>='a' && LA6_1<='z')) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0=='/') ) {
                    int LA6_2 = input.LA(2);

                    if ( ((LA6_2>='A' && LA6_2<='Z')||(LA6_2>='^' && LA6_2<='_')||(LA6_2>='a' && LA6_2<='z')) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:34: ( '\\\\' | '\\\\\\\\' | '/' ) RULE_ID
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:34: ( '\\\\' | '\\\\\\\\' | '/' )
            	    int alt5=3;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\\') ) {
            	        int LA5_1 = input.LA(2);

            	        if ( (LA5_1=='\\') ) {
            	            alt5=2;
            	        }
            	        else if ( ((LA5_1>='A' && LA5_1<='Z')||(LA5_1>='^' && LA5_1<='_')||(LA5_1>='a' && LA5_1<='z')) ) {
            	            alt5=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("4336:34: ( '\\\\' | '\\\\\\\\' | '/' )", 5, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA5_0=='/') ) {
            	        alt5=3;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("4336:34: ( '\\\\' | '\\\\\\\\' | '/' )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:35: '\\\\'
            	            {
            	            match('\\'); 

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:40: '\\\\\\\\'
            	            {
            	            match("\\\\"); 


            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:47: '/'
            	            {
            	            match('/'); 

            	            }
            	            break;

            	    }

            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:62: ( '\\\\' | '\\\\\\\\' | '/' )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\\') ) {
                    alt7=2;
                }
                else {
                    alt7=1;}
            }
            else if ( (LA7_0=='/') ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4336:62: ( '\\\\' | '\\\\\\\\' | '/' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:63: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:68: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4336:75: '/'
                    {
                    match('/'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PATH

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4338:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4338:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4338:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4338:11: '^'
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4338:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4340:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4340:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4340:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4340:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4342:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFE')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4342:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4344:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4344:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4344:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFE')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4344:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:41: '\\r'
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4348:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4348:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4348:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4350:16: ( . )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4350:18: .
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
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | RULE_CODEC | RULE_PATH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=54;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:158: T50
                {
                mT50(); 

                }
                break;
            case 39 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:162: T51
                {
                mT51(); 

                }
                break;
            case 40 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:166: T52
                {
                mT52(); 

                }
                break;
            case 41 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:170: T53
                {
                mT53(); 

                }
                break;
            case 42 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:174: T54
                {
                mT54(); 

                }
                break;
            case 43 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:178: T55
                {
                mT55(); 

                }
                break;
            case 44 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:182: T56
                {
                mT56(); 

                }
                break;
            case 45 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:186: T57
                {
                mT57(); 

                }
                break;
            case 46 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:190: RULE_CODEC
                {
                mRULE_CODEC(); 

                }
                break;
            case 47 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:201: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 48 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:211: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:219: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:228: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:240: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\56\1\uffff\2\56\1\67\1\uffff\2\56\5\uffff\1\56\3\uffff"+
        "\1\56\1\110\3\56\1\uffff\1\117\6\56\2\uffff\3\56\1\54\1\56\1\uffff"+
        "\1\60\1\uffff\2\54\2\uffff\1\56\1\uffff\1\56\2\uffff\2\56\1\144"+
        "\1\56\3\uffff\1\56\1\150\2\56\5\uffff\1\56\3\uffff\1\56\2\uffff"+
        "\4\56\3\uffff\7\56\2\uffff\4\56\4\uffff\3\56\1\uffff\3\56\1\uffff"+
        "\30\56\1\u009b\1\u009c\5\56\1\u00a2\1\56\1\u00a4\7\56\1\u00ac\10"+
        "\56\2\uffff\4\56\1\u00b9\1\uffff\1\56\1\uffff\6\56\1\u00c1\1\uffff"+
        "\3\56\1\u00c5\10\56\1\uffff\1\u00ce\1\u00cf\1\56\1\u00d1\2\56\1"+
        "\u00d4\1\uffff\3\56\1\uffff\7\56\1\u00df\2\uffff\1\56\1\uffff\1"+
        "\56\1\u00e2\1\uffff\3\56\1\u00e6\2\56\1\u00e9\1\56\1\u00eb\1\56"+
        "\1\uffff\1\u00ed\1\56\1\uffff\1\u00ef\1\56\1\u00f1\1\uffff\1\u00f2"+
        "\1\u00f3\1\uffff\1\u00f4\1\uffff\1\56\1\uffff\1\u00f6\1\uffff\1"+
        "\u00f7\4\uffff\1\u00f8\3\uffff";
    static final String DFA19_eofS =
        "\u00f9\uffff";
    static final String DFA19_minS =
        "\1\0\1\57\1\uffff\2\57\1\173\1\uffff\2\57\5\uffff\1\57\3\uffff\1"+
        "\57\1\52\3\57\1\uffff\1\170\6\57\2\uffff\3\57\1\101\1\57\1\uffff"+
        "\1\52\1\uffff\2\0\2\uffff\1\57\1\uffff\1\57\2\uffff\4\57\3\uffff"+
        "\4\57\5\uffff\1\57\3\uffff\1\57\2\uffff\4\57\3\uffff\7\57\2\uffff"+
        "\4\57\4\uffff\3\57\1\uffff\3\57\1\uffff\62\57\2\uffff\5\57\1\uffff"+
        "\1\57\1\uffff\7\57\1\uffff\14\57\1\uffff\7\57\1\uffff\3\57\1\uffff"+
        "\10\57\2\uffff\1\57\1\uffff\2\57\1\uffff\12\57\1\uffff\2\57\1\uffff"+
        "\3\57\1\uffff\2\57\1\uffff\1\57\1\uffff\1\57\1\uffff\1\57\1\uffff"+
        "\1\57\4\uffff\1\57\3\uffff";
    static final String DFA19_maxS =
        "\1\ufffe\1\172\1\uffff\2\172\1\173\1\uffff\2\172\5\uffff\1\172\3"+
        "\uffff\1\172\1\134\3\172\1\uffff\1\170\6\172\2\uffff\5\172\1\uffff"+
        "\1\57\1\uffff\2\ufffe\2\uffff\1\172\1\uffff\1\172\2\uffff\4\172"+
        "\3\uffff\4\172\5\uffff\1\172\3\uffff\1\172\2\uffff\4\172\3\uffff"+
        "\7\172\2\uffff\4\172\4\uffff\3\172\1\uffff\3\172\1\uffff\62\172"+
        "\2\uffff\5\172\1\uffff\1\172\1\uffff\7\172\1\uffff\14\172\1\uffff"+
        "\7\172\1\uffff\3\172\1\uffff\10\172\2\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\12\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff\1\172\3"+
        "\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\2\uffff\1\11\1\12\1\13\1\14\1\15\1\uffff"+
        "\1\21\1\23\1\24\5\uffff\1\35\7\uffff\1\50\1\51\5\uffff\1\57\1\uffff"+
        "\1\61\2\uffff\1\65\1\66\1\uffff\1\60\1\uffff\1\57\1\2\4\uffff\1"+
        "\56\1\5\1\6\4\uffff\1\11\1\12\1\13\1\14\1\15\1\uffff\1\21\1\23\1"+
        "\24\1\uffff\1\47\1\27\4\uffff\1\35\1\37\1\61\7\uffff\1\50\1\51\4"+
        "\uffff\1\63\1\64\1\62\1\65\3\uffff\1\20\3\uffff\1\30\62\uffff\1"+
        "\7\1\26\5\uffff\1\31\1\uffff\1\36\7\uffff\1\46\14\uffff\1\25\7\uffff"+
        "\1\45\3\uffff\1\1\10\uffff\1\32\1\33\1\uffff\1\44\2\uffff\1\43\12"+
        "\uffff\1\16\2\uffff\1\42\3\uffff\1\3\2\uffff\1\54\1\uffff\1\17\1"+
        "\uffff\1\40\1\uffff\1\52\1\uffff\1\55\1\22\1\4\1\10\1\uffff\1\41"+
        "\1\53\1\34";
    static final String DFA19_specialS =
        "\u00f9\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\51\4\54\1\52\1\14\1"+
            "\15\1\54\1\37\1\12\1\40\1\23\1\47\1\30\11\50\1\54\1\2\1\11\1"+
            "\17\1\13\1\54\1\27\2\45\1\34\1\45\1\36\6\45\1\33\2\45\1\31\3"+
            "\45\1\32\1\45\1\35\5\45\1\20\1\46\1\21\1\44\1\45\1\54\1\3\1"+
            "\22\1\10\1\24\1\16\3\45\1\1\3\45\1\42\1\25\1\41\1\4\1\45\1\43"+
            "\1\26\1\7\6\45\1\5\1\54\1\6\uff81\54",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\14\57\1\55\15\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\57\1\62\20\57\1\64\1\63\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\65\10\57",
            "\1\66",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\7\57\1\73\6\57\1\72\11\57\1\71\1\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\74\13\57",
            "",
            "",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\27\57\1\102\2\57",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\106\21\57",
            "\1\107\3\uffff\2\60\54\uffff\1\60",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\111\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\112\5\57\1\113\5\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\114\13\57",
            "",
            "\1\116",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\25\57\1\120\4\57",
            "\1\60\12\57\1\60\6\uffff\23\57\1\121\6\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\10\57\1\122\21\57",
            "\1\60\12\57\1\60\6\uffff\3\57\1\123\26\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\5\57\1\124\24\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\15\57\1\125\14\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\15\57\1\126\14\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\17\57\1\131\12\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\132\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\133\25\57",
            "\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\135\4\uffff\1\136",
            "",
            "\uffff\137",
            "\uffff\137",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\17\57\1\141\12\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\142\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\143\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\145\5\57\1\146\13\57",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\17\57\1\147\12\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\151\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\14\57\1\152\1\153\14\57",
            "",
            "",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\154\6\57",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\155\14\57",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\156\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\3\57\1\157\26\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\13\57\1\160\16\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\24\57\1\161\5\57",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\162\25\57",
            "\1\60\12\57\1\60\6\uffff\21\57\1\163\10\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\164\14\57",
            "\1\60\12\57\1\60\6\uffff\5\57\1\165\24\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\13\57\1\166\16\57",
            "\1\60\12\57\1\60\6\uffff\10\57\1\167\21\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\24\57\1\170\5\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\171\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\172\14\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\20\57\1\173\11\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\174\13\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\175\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\176\10\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\14\57\1\177\15\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\25\57\1\u0080\4\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u0081\25\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u0082\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\17\57\1\u0083\12\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\5\57\1\u0085\15\57\1\u0084\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u0086\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\3\57\1\u0087\26\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u0088\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u0089\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\13\57\1\u008a\16\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u008b\10\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u008c\10\57",
            "\1\60\12\57\1\60\6\uffff\24\57\1\u008d\5\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\6\57\1\u008e\23\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\13\57\1\u008f\16\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u0090\31\57",
            "\1\60\12\57\1\60\6\uffff\16\57\1\u0091\13\57\1\uffff\1\60\2"+
            "\uffff\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\14\57\1\u0092\15\57\1\uffff\1\60\2"+
            "\uffff\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u0093\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\3\57\1\u0094\26\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\24\57\1\u0095\5\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u0096\10\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u0097\10\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u0098\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u0099\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u009a\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\u009d\13\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u009e\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\u009f\13\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\u00a0\14\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00a1\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00a3\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\2\57\1\u00a5\27\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u00a6\10\57",
            "\1\60\12\57\1\60\6\uffff\2\57\1\u00a7\27\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\13\57\1\u00a8\16\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u00a9\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\6\57\1\u00aa\23\57",
            "\1\60\12\57\1\60\6\uffff\15\57\1\u00ab\14\57\1\uffff\1\60\2"+
            "\uffff\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\u00ad\13\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u00ae\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u00af\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00b0\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u00b1\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\57\1\u00b2\30\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00b3\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\3\57\1\u00b4\26\57",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00b5\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u00b6\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u00b7\10\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\3\57\1\u00b8\26\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u00ba\31\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00bb\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u00bc\21\57",
            "\1\60\12\57\1\60\6\uffff\23\57\1\u00bd\6\57\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00be\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\6\57\1\u00bf\23\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00c0\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\u00c2\14\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00c3\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u00c4\10\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\2\57\1\u00c6\27\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\24\57\1\u00c7\5\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u00c8\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00c9\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\10\57\1\u00ca\21\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\u00cb\14\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\14\57\1\u00cc\15\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00cd\7\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\3\57\1\u00d0\26\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00d2\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00d3\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\1\u00d5\31\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\u00d6\13\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00d7\25\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00d8\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00d9\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\25\57\1\u00da\4\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00db\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00dc\6\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00dd\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00de\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00e0\25\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\u00e1\13\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\13\57\1\u00e3\16\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\21\57\1\u00e4\10\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\22\57\1\u00e5\7\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00e7\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00e8\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\4\57\1\u00ea\25\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\23\57\1\u00ec\6\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\15\57\1\u00ee\14\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\30\57\1\u00f0\1\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\16\57\1\u00f5\13\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "",
            "",
            "",
            "\1\60\12\57\1\60\6\uffff\32\57\1\uffff\1\60\2\uffff\1\57\1\uffff"+
            "\32\57",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | RULE_CODEC | RULE_PATH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}