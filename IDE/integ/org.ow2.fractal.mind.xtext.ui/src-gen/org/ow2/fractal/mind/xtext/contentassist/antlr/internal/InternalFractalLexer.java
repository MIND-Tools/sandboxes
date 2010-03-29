package org.ow2.fractal.mind.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalLexer extends Lexer {
    public static final int RULE_ID=6;
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
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:10:5: ( '?' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:10:7: '?'
            {
            match('?'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:11:5: ( 'this' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:11:7: 'this'
            {
            match("this"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:12:5: ( 'nodata' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:12:7: 'nodata'
            {
            match("nodata"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:13:5: ( ':' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:13:7: ':'
            {
            match(':'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:14:5: ( ',' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:14:7: ','
            {
            match(','); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:15:5: ( ';' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:15:7: ';'
            {
            match(';'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:16:5: ( '.' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:16:7: '.'
            {
            match('.'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:17:5: ( '/' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:17:7: '/'
            {
            match('/'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:18:5: ( '\\\\' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:18:7: '\\\\'
            {
            match('\\'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:19:5: ( '!' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:19:7: '!'
            {
            match('!'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:20:5: ( '@' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:20:7: '@'
            {
            match('@'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:21:5: ( '\\\"' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:21:7: '\\\"'
            {
            match('\"'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:22:5: ( '\\'' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:22:7: '\\''
            {
            match('\''); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:23:5: ( '*' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:23:7: '*'
            {
            match('*'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:24:5: ( '\\\\\\\\' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:24:7: '\\\\\\\\'
            {
            match("\\\\"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:25:5: ( 'override' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:25:7: 'override'
            {
            match("override"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:26:5: ( 'singleton' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:26:7: 'singleton'
            {
            match("singleton"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:27:5: ( 'LDFlags' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:27:7: 'LDFlags'
            {
            match("LDFlags"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:28:5: ( 'CFlags' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:28:7: 'CFlags'
            {
            match("CFlags"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:29:5: ( 'STRUCT' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:29:7: 'STRUCT'
            {
            match("STRUCT"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:30:5: ( 'UNION' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:30:7: 'UNION'
            {
            match("UNION"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:31:5: ( 'ENUM' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:31:7: 'ENUM'
            {
            match("ENUM"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:32:5: ( 'optional' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:32:7: 'optional'
            {
            match("optional"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:33:5: ( 'mandatory' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:33:7: 'mandatory'
            {
            match("mandatory"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:34:5: ( 'provides' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:34:7: 'provides'
            {
            match("provides"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:35:5: ( 'requires' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:35:7: 'requires'
            {
            match("requires"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:36:5: ( 'import' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:36:7: 'import'
            {
            match("import"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:37:5: ( '.*' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:37:7: '.*'
            {
            match(".*"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:38:5: ( 'primitive' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:38:7: 'primitive'
            {
            match("primitive"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:39:5: ( '{' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:39:7: '{'
            {
            match('{'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:40:5: ( '}' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:40:7: '}'
            {
            match('}'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:41:5: ( 'type' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:41:7: 'type'
            {
            match("type"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:42:5: ( 'extends' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:42:7: 'extends'
            {
            match("extends"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:43:5: ( 'composite' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:43:7: 'composite'
            {
            match("composite"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:44:5: ( '<' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:44:7: '<'
            {
            match('<'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:45:5: ( '>' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:45:7: '>'
            {
            match('>'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:46:5: ( '(' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:46:7: '('
            {
            match('('); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:47:5: ( ')' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:47:7: ')'
            {
            match(')'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:48:5: ( 'contains' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:48:7: 'contains'
            {
            match("contains"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:49:5: ( 'as' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:49:7: 'as'
            {
            match("as"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:50:5: ( '=' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:50:7: '='
            {
            match('='); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:51:5: ( 'attribute' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:51:7: 'attribute'
            {
            match("attribute"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:52:5: ( 'binds' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:52:7: 'binds'
            {
            match("binds"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:53:5: ( 'to' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:53:7: 'to'
            {
            match("to"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:54:5: ( '[' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:54:7: '['
            {
            match('['); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:55:5: ( ']' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:55:7: ']'
            {
            match(']'); 

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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:56:5: ( 'data' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:56:7: 'data'
            {
            match("data"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:57:5: ( '{{' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:57:7: '{{'
            {
            match("{{"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:58:5: ( '}}' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:58:7: '}}'
            {
            match("}}"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:59:5: ( 'source' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:59:7: 'source'
            {
            match("source"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:60:5: ( 'conformsto' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:60:7: 'conformsto'
            {
            match("conformsto"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:61:5: ( 'abstract' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:61:7: 'abstract'
            {
            match("abstract"); 


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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8158:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8158:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8158:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8158:11: '^'
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

            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8158:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:
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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8160:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8160:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8160:12: ( '0' .. '9' )+
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
            	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8160:13: '0' .. '9'
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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("8162:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8162:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8164:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8164:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8164:24: ( options {greedy=false; } : . )*
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
            	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8164:52: .
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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8166:41: '\\r'
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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8168:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8168:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8168:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:
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
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8170:16: ( . )
            // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:8170:18: .
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
        // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=59;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='?') ) {
            alt12=1;
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_46 = input.LA(3);

                if ( ((LA12_46>='0' && LA12_46<='9')||(LA12_46>='A' && LA12_46<='Z')||LA12_46=='_'||(LA12_46>='a' && LA12_46<='z')) ) {
                    alt12=53;
                }
                else {
                    alt12=44;}
                }
                break;
            case 'h':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='i') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='s') ) {
                        int LA12_126 = input.LA(5);

                        if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                            alt12=53;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 'y':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='p') ) {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='e') ) {
                        int LA12_127 = input.LA(5);

                        if ( ((LA12_127>='0' && LA12_127<='9')||(LA12_127>='A' && LA12_127<='Z')||LA12_127=='_'||(LA12_127>='a' && LA12_127<='z')) ) {
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
                break;
            default:
                alt12=53;}

        }
        else if ( (LA12_0=='n') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='o') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='d') ) {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='a') ) {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='t') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='a') ) {
                                int LA12_176 = input.LA(7);

                                if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=3;}
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
        else if ( (LA12_0==':') ) {
            alt12=4;
        }
        else if ( (LA12_0==',') ) {
            alt12=5;
        }
        else if ( (LA12_0==';') ) {
            alt12=6;
        }
        else if ( (LA12_0=='.') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='*') ) {
                alt12=28;
            }
            else {
                alt12=7;}
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
                alt12=8;}

        }
        else if ( (LA12_0=='\\') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='\\') ) {
                alt12=15;
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='!') ) {
            alt12=10;
        }
        else if ( (LA12_0=='@') ) {
            alt12=11;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_12 = input.LA(2);

            if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFE')) ) {
                alt12=55;
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_13 = input.LA(2);

            if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFE')) ) {
                alt12=55;
            }
            else {
                alt12=13;}
        }
        else if ( (LA12_0=='*') ) {
            alt12=14;
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'v':
                {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='e') ) {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='r') ) {
                        int LA12_129 = input.LA(5);

                        if ( (LA12_129=='r') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='i') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='d') ) {
                                    int LA12_198 = input.LA(8);

                                    if ( (LA12_198=='e') ) {
                                        int LA12_216 = input.LA(9);

                                        if ( ((LA12_216>='0' && LA12_216<='9')||(LA12_216>='A' && LA12_216<='Z')||LA12_216=='_'||(LA12_216>='a' && LA12_216<='z')) ) {
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
                    else {
                        alt12=53;}
                }
                else {
                    alt12=53;}
                }
                break;
            case 'p':
                {
                int LA12_68 = input.LA(3);

                if ( (LA12_68=='t') ) {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='i') ) {
                        int LA12_130 = input.LA(5);

                        if ( (LA12_130=='o') ) {
                            int LA12_155 = input.LA(6);

                            if ( (LA12_155=='n') ) {
                                int LA12_178 = input.LA(7);

                                if ( (LA12_178=='a') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( (LA12_199=='l') ) {
                                        int LA12_217 = input.LA(9);

                                        if ( ((LA12_217>='0' && LA12_217<='9')||(LA12_217>='A' && LA12_217<='Z')||LA12_217=='_'||(LA12_217>='a' && LA12_217<='z')) ) {
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
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='u') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='r') ) {
                        int LA12_131 = input.LA(5);

                        if ( (LA12_131=='c') ) {
                            int LA12_156 = input.LA(6);

                            if ( (LA12_156=='e') ) {
                                int LA12_179 = input.LA(7);

                                if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
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
                break;
            case 'i':
                {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='n') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='g') ) {
                        int LA12_132 = input.LA(5);

                        if ( (LA12_132=='l') ) {
                            int LA12_157 = input.LA(6);

                            if ( (LA12_157=='e') ) {
                                int LA12_180 = input.LA(7);

                                if ( (LA12_180=='t') ) {
                                    int LA12_201 = input.LA(8);

                                    if ( (LA12_201=='o') ) {
                                        int LA12_218 = input.LA(9);

                                        if ( (LA12_218=='n') ) {
                                            int LA12_232 = input.LA(10);

                                            if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=17;}
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
        else if ( (LA12_0=='L') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='D') ) {
                int LA12_71 = input.LA(3);

                if ( (LA12_71=='F') ) {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='l') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='a') ) {
                            int LA12_158 = input.LA(6);

                            if ( (LA12_158=='g') ) {
                                int LA12_181 = input.LA(7);

                                if ( (LA12_181=='s') ) {
                                    int LA12_202 = input.LA(8);

                                    if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                        alt12=53;
                                    }
                                    else {
                                        alt12=18;}
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
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='F') ) {
                int LA12_72 = input.LA(3);

                if ( (LA12_72=='l') ) {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='a') ) {
                        int LA12_134 = input.LA(5);

                        if ( (LA12_134=='g') ) {
                            int LA12_159 = input.LA(6);

                            if ( (LA12_159=='s') ) {
                                int LA12_182 = input.LA(7);

                                if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                                    alt12=53;
                                }
                                else {
                                    alt12=19;}
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
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='T') ) {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='R') ) {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='U') ) {
                        int LA12_135 = input.LA(5);

                        if ( (LA12_135=='C') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='T') ) {
                                int LA12_183 = input.LA(7);

                                if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
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
        else if ( (LA12_0=='U') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='N') ) {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='I') ) {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='O') ) {
                        int LA12_136 = input.LA(5);

                        if ( (LA12_136=='N') ) {
                            int LA12_161 = input.LA(6);

                            if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                alt12=53;
                            }
                            else {
                                alt12=21;}
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
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='N') ) {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='U') ) {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='M') ) {
                        int LA12_137 = input.LA(5);

                        if ( ((LA12_137>='0' && LA12_137<='9')||(LA12_137>='A' && LA12_137<='Z')||LA12_137=='_'||(LA12_137>='a' && LA12_137<='z')) ) {
                            alt12=53;
                        }
                        else {
                            alt12=22;}
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
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='a') ) {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='n') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='d') ) {
                        int LA12_138 = input.LA(5);

                        if ( (LA12_138=='a') ) {
                            int LA12_163 = input.LA(6);

                            if ( (LA12_163=='t') ) {
                                int LA12_185 = input.LA(7);

                                if ( (LA12_185=='o') ) {
                                    int LA12_205 = input.LA(8);

                                    if ( (LA12_205=='r') ) {
                                        int LA12_220 = input.LA(9);

                                        if ( (LA12_220=='y') ) {
                                            int LA12_233 = input.LA(10);

                                            if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
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
        else if ( (LA12_0=='p') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='r') ) {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA12_114 = input.LA(4);

                    if ( (LA12_114=='m') ) {
                        int LA12_139 = input.LA(5);

                        if ( (LA12_139=='i') ) {
                            int LA12_164 = input.LA(6);

                            if ( (LA12_164=='t') ) {
                                int LA12_186 = input.LA(7);

                                if ( (LA12_186=='i') ) {
                                    int LA12_206 = input.LA(8);

                                    if ( (LA12_206=='v') ) {
                                        int LA12_221 = input.LA(9);

                                        if ( (LA12_221=='e') ) {
                                            int LA12_234 = input.LA(10);

                                            if ( ((LA12_234>='0' && LA12_234<='9')||(LA12_234>='A' && LA12_234<='Z')||LA12_234=='_'||(LA12_234>='a' && LA12_234<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=29;}
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
                case 'o':
                    {
                    int LA12_115 = input.LA(4);

                    if ( (LA12_115=='v') ) {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='i') ) {
                            int LA12_165 = input.LA(6);

                            if ( (LA12_165=='d') ) {
                                int LA12_187 = input.LA(7);

                                if ( (LA12_187=='e') ) {
                                    int LA12_207 = input.LA(8);

                                    if ( (LA12_207=='s') ) {
                                        int LA12_222 = input.LA(9);

                                        if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=25;}
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
        else if ( (LA12_0=='r') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='e') ) {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='q') ) {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='u') ) {
                        int LA12_141 = input.LA(5);

                        if ( (LA12_141=='i') ) {
                            int LA12_166 = input.LA(6);

                            if ( (LA12_166=='r') ) {
                                int LA12_188 = input.LA(7);

                                if ( (LA12_188=='e') ) {
                                    int LA12_208 = input.LA(8);

                                    if ( (LA12_208=='s') ) {
                                        int LA12_223 = input.LA(9);

                                        if ( ((LA12_223>='0' && LA12_223<='9')||(LA12_223>='A' && LA12_223<='Z')||LA12_223=='_'||(LA12_223>='a' && LA12_223<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=26;}
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
        else if ( (LA12_0=='i') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='m') ) {
                int LA12_79 = input.LA(3);

                if ( (LA12_79=='p') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='o') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='r') ) {
                            int LA12_167 = input.LA(6);

                            if ( (LA12_167=='t') ) {
                                int LA12_189 = input.LA(7);

                                if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
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
                else {
                    alt12=53;}
            }
            else {
                alt12=53;}
        }
        else if ( (LA12_0=='{') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='{') ) {
                alt12=48;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='}') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='}') ) {
                alt12=49;
            }
            else {
                alt12=31;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='x') ) {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='t') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='e') ) {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='n') ) {
                            int LA12_168 = input.LA(6);

                            if ( (LA12_168=='d') ) {
                                int LA12_190 = input.LA(7);

                                if ( (LA12_190=='s') ) {
                                    int LA12_210 = input.LA(8);

                                    if ( ((LA12_210>='0' && LA12_210<='9')||(LA12_210>='A' && LA12_210<='Z')||LA12_210=='_'||(LA12_210>='a' && LA12_210<='z')) ) {
                                        alt12=53;
                                    }
                                    else {
                                        alt12=33;}
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
        else if ( (LA12_0=='c') ) {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='o') ) {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    switch ( input.LA(4) ) {
                    case 'f':
                        {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='o') ) {
                            int LA12_169 = input.LA(6);

                            if ( (LA12_169=='r') ) {
                                int LA12_191 = input.LA(7);

                                if ( (LA12_191=='m') ) {
                                    int LA12_211 = input.LA(8);

                                    if ( (LA12_211=='s') ) {
                                        int LA12_225 = input.LA(9);

                                        if ( (LA12_225=='t') ) {
                                            int LA12_237 = input.LA(10);

                                            if ( (LA12_237=='o') ) {
                                                int LA12_245 = input.LA(11);

                                                if ( ((LA12_245>='0' && LA12_245<='9')||(LA12_245>='A' && LA12_245<='Z')||LA12_245=='_'||(LA12_245>='a' && LA12_245<='z')) ) {
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
                        else {
                            alt12=53;}
                        }
                        break;
                    case 't':
                        {
                        int LA12_145 = input.LA(5);

                        if ( (LA12_145=='a') ) {
                            int LA12_170 = input.LA(6);

                            if ( (LA12_170=='i') ) {
                                int LA12_192 = input.LA(7);

                                if ( (LA12_192=='n') ) {
                                    int LA12_212 = input.LA(8);

                                    if ( (LA12_212=='s') ) {
                                        int LA12_226 = input.LA(9);

                                        if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                            alt12=53;
                                        }
                                        else {
                                            alt12=39;}
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
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='p') ) {
                        int LA12_146 = input.LA(5);

                        if ( (LA12_146=='o') ) {
                            int LA12_171 = input.LA(6);

                            if ( (LA12_171=='s') ) {
                                int LA12_193 = input.LA(7);

                                if ( (LA12_193=='i') ) {
                                    int LA12_213 = input.LA(8);

                                    if ( (LA12_213=='t') ) {
                                        int LA12_227 = input.LA(9);

                                        if ( (LA12_227=='e') ) {
                                            int LA12_239 = input.LA(10);

                                            if ( ((LA12_239>='0' && LA12_239<='9')||(LA12_239>='A' && LA12_239<='Z')||LA12_239=='_'||(LA12_239>='a' && LA12_239<='z')) ) {
                                                alt12=53;
                                            }
                                            else {
                                                alt12=34;}
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
            alt12=35;
        }
        else if ( (LA12_0=='>') ) {
            alt12=36;
        }
        else if ( (LA12_0=='(') ) {
            alt12=37;
        }
        else if ( (LA12_0==')') ) {
            alt12=38;
        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='s') ) {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='t') ) {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147=='r') ) {
                            int LA12_172 = input.LA(6);

                            if ( (LA12_172=='a') ) {
                                int LA12_194 = input.LA(7);

                                if ( (LA12_194=='c') ) {
                                    int LA12_214 = input.LA(8);

                                    if ( (LA12_214=='t') ) {
                                        int LA12_228 = input.LA(9);

                                        if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
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
                break;
            case 't':
                {
                int LA12_91 = input.LA(3);

                if ( (LA12_91=='t') ) {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='r') ) {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='i') ) {
                            int LA12_173 = input.LA(6);

                            if ( (LA12_173=='b') ) {
                                int LA12_195 = input.LA(7);

                                if ( (LA12_195=='u') ) {
                                    int LA12_215 = input.LA(8);

                                    if ( (LA12_215=='t') ) {
                                        int LA12_229 = input.LA(9);

                                        if ( (LA12_229=='e') ) {
                                            int LA12_241 = input.LA(10);

                                            if ( ((LA12_241>='0' && LA12_241<='9')||(LA12_241>='A' && LA12_241<='Z')||LA12_241=='_'||(LA12_241>='a' && LA12_241<='z')) ) {
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
                else {
                    alt12=53;}
                }
                break;
            case 's':
                {
                int LA12_92 = input.LA(3);

                if ( ((LA12_92>='0' && LA12_92<='9')||(LA12_92>='A' && LA12_92<='Z')||LA12_92=='_'||(LA12_92>='a' && LA12_92<='z')) ) {
                    alt12=53;
                }
                else {
                    alt12=40;}
                }
                break;
            default:
                alt12=53;}

        }
        else if ( (LA12_0=='=') ) {
            alt12=41;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_36 = input.LA(2);

            if ( (LA12_36=='i') ) {
                int LA12_94 = input.LA(3);

                if ( (LA12_94=='n') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='d') ) {
                        int LA12_149 = input.LA(5);

                        if ( (LA12_149=='s') ) {
                            int LA12_174 = input.LA(6);

                            if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
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
        else if ( (LA12_0=='[') ) {
            alt12=45;
        }
        else if ( (LA12_0==']') ) {
            alt12=46;
        }
        else if ( (LA12_0=='d') ) {
            int LA12_39 = input.LA(2);

            if ( (LA12_39=='a') ) {
                int LA12_97 = input.LA(3);

                if ( (LA12_97=='t') ) {
                    int LA12_125 = input.LA(4);

                    if ( (LA12_125=='a') ) {
                        int LA12_150 = input.LA(5);

                        if ( ((LA12_150>='0' && LA12_150<='9')||(LA12_150>='A' && LA12_150<='Z')||LA12_150=='_'||(LA12_150>='a' && LA12_150<='z')) ) {
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
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:218: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:235: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:247: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:263: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:279: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // ../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g:1:287: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}