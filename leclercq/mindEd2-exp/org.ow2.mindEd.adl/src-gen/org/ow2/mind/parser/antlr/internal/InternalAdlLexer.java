package org.ow2.mind.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdlLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int RULE_INLINEDCODE=5;
    public static final int RULE_INT=6;
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
    public static final int Tokens=67;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=7;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=10;
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
    public InternalAdlLexer() {;} 
    public InternalAdlLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:10:5: ( 'import' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:10:7: 'import'
            {
            match("import"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:11:5: ( ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:11:7: ';'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:12:5: ( 'type' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:12:7: 'type'
            {
            match("type"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:13:5: ( 'extends' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:13:7: 'extends'
            {
            match("extends"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:14:5: ( ',' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:14:7: ','
            {
            match(','); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:15:5: ( '{' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:15:7: '{'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:16:5: ( '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:16:7: '}'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:17:5: ( 'abstract' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:17:7: 'abstract'
            {
            match("abstract"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:18:5: ( 'primitive' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:18:7: 'primitive'
            {
            match("primitive"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:19:5: ( '(' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:19:7: '('
            {
            match('('); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:20:5: ( ')' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:20:7: ')'
            {
            match(')'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:21:5: ( 'composite' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:21:7: 'composite'
            {
            match("composite"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:22:5: ( '<' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:22:7: '<'
            {
            match('<'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:23:5: ( '>' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:23:7: '>'
            {
            match('>'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:24:5: ( 'conformsto' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:24:7: 'conformsto'
            {
            match("conformsto"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:25:5: ( '=' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:25:7: '='
            {
            match('='); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:26:5: ( 'provides' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:26:7: 'provides'
            {
            match("provides"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:27:5: ( 'as' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:27:7: 'as'
            {
            match("as"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:28:5: ( '[' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:28:7: '['
            {
            match('['); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:29:5: ( ']' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:29:7: ']'
            {
            match(']'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:30:5: ( 'requires' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:30:7: 'requires'
            {
            match("requires"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:31:5: ( 'optional' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:31:7: 'optional'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:32:5: ( 'input' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:32:7: 'input'
            {
            match("input"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:33:5: ( 'output' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:33:7: 'output'
            {
            match("output"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:34:5: ( ':' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:34:7: ':'
            {
            match(':'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:35:5: ( 'attribute' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:35:7: 'attribute'
            {
            match("attribute"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:36:5: ( 'data' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:36:7: 'data'
            {
            match("data"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:37:5: ( 'source' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:37:7: 'source'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:38:5: ( '/' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:38:7: '/'
            {
            match('/'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:39:5: ( './' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:39:7: './'
            {
            match("./"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:40:5: ( '../' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:40:7: '../'
            {
            match("../"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:41:5: ( '.' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:41:7: '.'
            {
            match('.'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:42:5: ( 'contains' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:42:7: 'contains'
            {
            match("contains"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:43:5: ( 'binds' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:43:7: 'binds'
            {
            match("binds"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:44:5: ( 'this' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:44:7: 'this'
            {
            match("this"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:45:5: ( 'to' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:45:7: 'to'
            {
            match("to"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:46:5: ( '@' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:46:7: '@'
            {
            match('@'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:47:5: ( 'NULL' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:47:7: 'NULL'
            {
            match("NULL"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:48:5: ( 'null' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:48:7: 'null'
            {
            match("null"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:49:5: ( 'true' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:49:7: 'true'
            {
            match("true"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:50:5: ( 'false' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:50:7: 'false'
            {
            match("false"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:51:5: ( '*' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:51:7: '*'
            {
            match('*'); 

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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:52:5: ( 'struct' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:52:7: 'struct'
            {
            match("struct"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:53:5: ( 'union' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:53:7: 'union'
            {
            match("union"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:54:5: ( 'enum' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:54:7: 'enum'
            {
            match("enum"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:55:5: ( 'int' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:55:7: 'int'
            {
            match("int"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:56:5: ( 'string' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:56:7: 'string'
            {
            match("string"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:57:5: ( 'int8_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:57:7: 'int8_t'
            {
            match("int8_t"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:58:5: ( 'uint8_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:58:7: 'uint8_t'
            {
            match("uint8_t"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:59:5: ( 'int16_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:59:7: 'int16_t'
            {
            match("int16_t"); 


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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:60:5: ( 'uint16_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:60:7: 'uint16_t'
            {
            match("uint16_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:61:5: ( 'int32_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:61:7: 'int32_t'
            {
            match("int32_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:62:5: ( 'uint32_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:62:7: 'uint32_t'
            {
            match("uint32_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:63:5: ( 'intptr_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:63:7: 'intptr_t'
            {
            match("intptr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:64:5: ( 'uintptr_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:64:7: 'uintptr_t'
            {
            match("uintptr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start RULE_INLINEDCODE
    public final void mRULE_INLINEDCODE() throws RecognitionException {
        try {
            int _type = RULE_INLINEDCODE;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5254:18: ( '{{' ( options {greedy=false; } : . )* '}}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5254:20: '{{' ( options {greedy=false; } : . )* '}}'
            {
            match("{{"); 

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5254:25: ( options {greedy=false; } : . )*
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
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5254:53: .
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
    // $ANTLR end RULE_INLINEDCODE

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5256:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5256:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5256:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5256:11: '^'
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5256:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:
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
            	    break loop3;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5258:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5258:12: ( '0' .. '9' )+
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5258:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5258:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5260:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5260:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5262:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5262:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5262:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5262:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5264:41: '\\r'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5266:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5266:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5266:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5268:16: ( . )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5268:18: .
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
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | RULE_INLINEDCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=63;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case '1':
                        {
                        int LA13_117 = input.LA(5);

                        if ( (LA13_117=='6') ) {
                            int LA13_149 = input.LA(6);

                            if ( (LA13_149=='_') ) {
                                int LA13_183 = input.LA(7);

                                if ( (LA13_183=='t') ) {
                                    int LA13_210 = input.LA(8);

                                    if ( ((LA13_210>='0' && LA13_210<='9')||(LA13_210>='A' && LA13_210<='Z')||LA13_210=='_'||(LA13_210>='a' && LA13_210<='z')) ) {
                                        alt13=57;
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    case '8':
                        {
                        int LA13_118 = input.LA(5);

                        if ( (LA13_118=='_') ) {
                            int LA13_150 = input.LA(6);

                            if ( (LA13_150=='t') ) {
                                int LA13_184 = input.LA(7);

                                if ( ((LA13_184>='0' && LA13_184<='9')||(LA13_184>='A' && LA13_184<='Z')||LA13_184=='_'||(LA13_184>='a' && LA13_184<='z')) ) {
                                    alt13=57;
                                }
                                else {
                                    alt13=48;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    case 'p':
                        {
                        int LA13_119 = input.LA(5);

                        if ( (LA13_119=='t') ) {
                            int LA13_151 = input.LA(6);

                            if ( (LA13_151=='r') ) {
                                int LA13_185 = input.LA(7);

                                if ( (LA13_185=='_') ) {
                                    int LA13_212 = input.LA(8);

                                    if ( (LA13_212=='t') ) {
                                        int LA13_234 = input.LA(9);

                                        if ( ((LA13_234>='0' && LA13_234<='9')||(LA13_234>='A' && LA13_234<='Z')||LA13_234=='_'||(LA13_234>='a' && LA13_234<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=54;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    case '3':
                        {
                        int LA13_120 = input.LA(5);

                        if ( (LA13_120=='2') ) {
                            int LA13_152 = input.LA(6);

                            if ( (LA13_152=='_') ) {
                                int LA13_186 = input.LA(7);

                                if ( (LA13_186=='t') ) {
                                    int LA13_213 = input.LA(8);

                                    if ( ((LA13_213>='0' && LA13_213<='9')||(LA13_213>='A' && LA13_213<='Z')||LA13_213=='_'||(LA13_213>='a' && LA13_213<='z')) ) {
                                        alt13=57;
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    case '0':
                    case '2':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt13=57;
                        }
                        break;
                    default:
                        alt13=46;}

                    }
                    break;
                case 'p':
                    {
                    int LA13_90 = input.LA(4);

                    if ( (LA13_90=='u') ) {
                        int LA13_122 = input.LA(5);

                        if ( (LA13_122=='t') ) {
                            int LA13_153 = input.LA(6);

                            if ( ((LA13_153>='0' && LA13_153<='9')||(LA13_153>='A' && LA13_153<='Z')||LA13_153=='_'||(LA13_153>='a' && LA13_153<='z')) ) {
                                alt13=57;
                            }
                            else {
                                alt13=23;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                    }
                    break;
                default:
                    alt13=57;}

                }
                break;
            case 'm':
                {
                int LA13_40 = input.LA(3);

                if ( (LA13_40=='p') ) {
                    int LA13_91 = input.LA(4);

                    if ( (LA13_91=='o') ) {
                        int LA13_123 = input.LA(5);

                        if ( (LA13_123=='r') ) {
                            int LA13_154 = input.LA(6);

                            if ( (LA13_154=='t') ) {
                                int LA13_188 = input.LA(7);

                                if ( ((LA13_188>='0' && LA13_188<='9')||(LA13_188>='A' && LA13_188<='Z')||LA13_188=='_'||(LA13_188>='a' && LA13_188<='z')) ) {
                                    alt13=57;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0==';') ) {
            alt13=2;
        }
        else if ( (LA13_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA13_43 = input.LA(3);

                if ( (LA13_43=='u') ) {
                    int LA13_92 = input.LA(4);

                    if ( (LA13_92=='e') ) {
                        int LA13_124 = input.LA(5);

                        if ( ((LA13_124>='0' && LA13_124<='9')||(LA13_124>='A' && LA13_124<='Z')||LA13_124=='_'||(LA13_124>='a' && LA13_124<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=40;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            case 'h':
                {
                int LA13_44 = input.LA(3);

                if ( (LA13_44=='i') ) {
                    int LA13_93 = input.LA(4);

                    if ( (LA13_93=='s') ) {
                        int LA13_125 = input.LA(5);

                        if ( ((LA13_125>='0' && LA13_125<='9')||(LA13_125>='A' && LA13_125<='Z')||LA13_125=='_'||(LA13_125>='a' && LA13_125<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=35;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            case 'o':
                {
                int LA13_45 = input.LA(3);

                if ( ((LA13_45>='0' && LA13_45<='9')||(LA13_45>='A' && LA13_45<='Z')||LA13_45=='_'||(LA13_45>='a' && LA13_45<='z')) ) {
                    alt13=57;
                }
                else {
                    alt13=36;}
                }
                break;
            case 'y':
                {
                int LA13_46 = input.LA(3);

                if ( (LA13_46=='p') ) {
                    int LA13_95 = input.LA(4);

                    if ( (LA13_95=='e') ) {
                        int LA13_126 = input.LA(5);

                        if ( ((LA13_126>='0' && LA13_126<='9')||(LA13_126>='A' && LA13_126<='Z')||LA13_126=='_'||(LA13_126>='a' && LA13_126<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=3;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA13_47 = input.LA(3);

                if ( (LA13_47=='u') ) {
                    int LA13_96 = input.LA(4);

                    if ( (LA13_96=='m') ) {
                        int LA13_127 = input.LA(5);

                        if ( ((LA13_127>='0' && LA13_127<='9')||(LA13_127>='A' && LA13_127<='Z')||LA13_127=='_'||(LA13_127>='a' && LA13_127<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            case 'x':
                {
                int LA13_48 = input.LA(3);

                if ( (LA13_48=='t') ) {
                    int LA13_97 = input.LA(4);

                    if ( (LA13_97=='e') ) {
                        int LA13_128 = input.LA(5);

                        if ( (LA13_128=='n') ) {
                            int LA13_159 = input.LA(6);

                            if ( (LA13_159=='d') ) {
                                int LA13_189 = input.LA(7);

                                if ( (LA13_189=='s') ) {
                                    int LA13_215 = input.LA(8);

                                    if ( ((LA13_215>='0' && LA13_215<='9')||(LA13_215>='A' && LA13_215<='Z')||LA13_215=='_'||(LA13_215>='a' && LA13_215<='z')) ) {
                                        alt13=57;
                                    }
                                    else {
                                        alt13=4;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0==',') ) {
            alt13=5;
        }
        else if ( (LA13_0=='{') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='{') ) {
                alt13=56;
            }
            else {
                alt13=6;}
        }
        else if ( (LA13_0=='}') ) {
            alt13=7;
        }
        else if ( (LA13_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA13_53 = input.LA(3);

                if ( (LA13_53=='s') ) {
                    int LA13_98 = input.LA(4);

                    if ( (LA13_98=='t') ) {
                        int LA13_129 = input.LA(5);

                        if ( (LA13_129=='r') ) {
                            int LA13_160 = input.LA(6);

                            if ( (LA13_160=='a') ) {
                                int LA13_190 = input.LA(7);

                                if ( (LA13_190=='c') ) {
                                    int LA13_216 = input.LA(8);

                                    if ( (LA13_216=='t') ) {
                                        int LA13_237 = input.LA(9);

                                        if ( ((LA13_237>='0' && LA13_237<='9')||(LA13_237>='A' && LA13_237<='Z')||LA13_237=='_'||(LA13_237>='a' && LA13_237<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=8;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            case 's':
                {
                int LA13_54 = input.LA(3);

                if ( ((LA13_54>='0' && LA13_54<='9')||(LA13_54>='A' && LA13_54<='Z')||LA13_54=='_'||(LA13_54>='a' && LA13_54<='z')) ) {
                    alt13=57;
                }
                else {
                    alt13=18;}
                }
                break;
            case 't':
                {
                int LA13_55 = input.LA(3);

                if ( (LA13_55=='t') ) {
                    int LA13_100 = input.LA(4);

                    if ( (LA13_100=='r') ) {
                        int LA13_130 = input.LA(5);

                        if ( (LA13_130=='i') ) {
                            int LA13_161 = input.LA(6);

                            if ( (LA13_161=='b') ) {
                                int LA13_191 = input.LA(7);

                                if ( (LA13_191=='u') ) {
                                    int LA13_217 = input.LA(8);

                                    if ( (LA13_217=='t') ) {
                                        int LA13_238 = input.LA(9);

                                        if ( (LA13_238=='e') ) {
                                            int LA13_252 = input.LA(10);

                                            if ( ((LA13_252>='0' && LA13_252<='9')||(LA13_252>='A' && LA13_252<='Z')||LA13_252=='_'||(LA13_252>='a' && LA13_252<='z')) ) {
                                                alt13=57;
                                            }
                                            else {
                                                alt13=26;}
                                        }
                                        else {
                                            alt13=57;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0=='p') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='r') ) {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA13_101 = input.LA(4);

                    if ( (LA13_101=='v') ) {
                        int LA13_131 = input.LA(5);

                        if ( (LA13_131=='i') ) {
                            int LA13_162 = input.LA(6);

                            if ( (LA13_162=='d') ) {
                                int LA13_192 = input.LA(7);

                                if ( (LA13_192=='e') ) {
                                    int LA13_218 = input.LA(8);

                                    if ( (LA13_218=='s') ) {
                                        int LA13_239 = input.LA(9);

                                        if ( ((LA13_239>='0' && LA13_239<='9')||(LA13_239>='A' && LA13_239<='Z')||LA13_239=='_'||(LA13_239>='a' && LA13_239<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=17;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_102 = input.LA(4);

                    if ( (LA13_102=='m') ) {
                        int LA13_132 = input.LA(5);

                        if ( (LA13_132=='i') ) {
                            int LA13_163 = input.LA(6);

                            if ( (LA13_163=='t') ) {
                                int LA13_193 = input.LA(7);

                                if ( (LA13_193=='i') ) {
                                    int LA13_219 = input.LA(8);

                                    if ( (LA13_219=='v') ) {
                                        int LA13_240 = input.LA(9);

                                        if ( (LA13_240=='e') ) {
                                            int LA13_254 = input.LA(10);

                                            if ( ((LA13_254>='0' && LA13_254<='9')||(LA13_254>='A' && LA13_254<='Z')||LA13_254=='_'||(LA13_254>='a' && LA13_254<='z')) ) {
                                                alt13=57;
                                            }
                                            else {
                                                alt13=9;}
                                        }
                                        else {
                                            alt13=57;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                    }
                    break;
                default:
                    alt13=57;}

            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='(') ) {
            alt13=10;
        }
        else if ( (LA13_0==')') ) {
            alt13=11;
        }
        else if ( (LA13_0=='c') ) {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='o') ) {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    switch ( input.LA(4) ) {
                    case 'f':
                        {
                        int LA13_133 = input.LA(5);

                        if ( (LA13_133=='o') ) {
                            int LA13_164 = input.LA(6);

                            if ( (LA13_164=='r') ) {
                                int LA13_194 = input.LA(7);

                                if ( (LA13_194=='m') ) {
                                    int LA13_220 = input.LA(8);

                                    if ( (LA13_220=='s') ) {
                                        int LA13_241 = input.LA(9);

                                        if ( (LA13_241=='t') ) {
                                            int LA13_255 = input.LA(10);

                                            if ( (LA13_255=='o') ) {
                                                int LA13_265 = input.LA(11);

                                                if ( ((LA13_265>='0' && LA13_265<='9')||(LA13_265>='A' && LA13_265<='Z')||LA13_265=='_'||(LA13_265>='a' && LA13_265<='z')) ) {
                                                    alt13=57;
                                                }
                                                else {
                                                    alt13=15;}
                                            }
                                            else {
                                                alt13=57;}
                                        }
                                        else {
                                            alt13=57;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    case 't':
                        {
                        int LA13_134 = input.LA(5);

                        if ( (LA13_134=='a') ) {
                            int LA13_165 = input.LA(6);

                            if ( (LA13_165=='i') ) {
                                int LA13_195 = input.LA(7);

                                if ( (LA13_195=='n') ) {
                                    int LA13_221 = input.LA(8);

                                    if ( (LA13_221=='s') ) {
                                        int LA13_242 = input.LA(9);

                                        if ( ((LA13_242>='0' && LA13_242<='9')||(LA13_242>='A' && LA13_242<='Z')||LA13_242=='_'||(LA13_242>='a' && LA13_242<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=33;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    default:
                        alt13=57;}

                    }
                    break;
                case 'm':
                    {
                    int LA13_104 = input.LA(4);

                    if ( (LA13_104=='p') ) {
                        int LA13_135 = input.LA(5);

                        if ( (LA13_135=='o') ) {
                            int LA13_166 = input.LA(6);

                            if ( (LA13_166=='s') ) {
                                int LA13_196 = input.LA(7);

                                if ( (LA13_196=='i') ) {
                                    int LA13_222 = input.LA(8);

                                    if ( (LA13_222=='t') ) {
                                        int LA13_243 = input.LA(9);

                                        if ( (LA13_243=='e') ) {
                                            int LA13_257 = input.LA(10);

                                            if ( ((LA13_257>='0' && LA13_257<='9')||(LA13_257>='A' && LA13_257<='Z')||LA13_257=='_'||(LA13_257>='a' && LA13_257<='z')) ) {
                                                alt13=57;
                                            }
                                            else {
                                                alt13=12;}
                                        }
                                        else {
                                            alt13=57;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                    }
                    break;
                default:
                    alt13=57;}

            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='<') ) {
            alt13=13;
        }
        else if ( (LA13_0=='>') ) {
            alt13=14;
        }
        else if ( (LA13_0=='=') ) {
            alt13=16;
        }
        else if ( (LA13_0=='[') ) {
            alt13=19;
        }
        else if ( (LA13_0==']') ) {
            alt13=20;
        }
        else if ( (LA13_0=='r') ) {
            int LA13_18 = input.LA(2);

            if ( (LA13_18=='e') ) {
                int LA13_65 = input.LA(3);

                if ( (LA13_65=='q') ) {
                    int LA13_105 = input.LA(4);

                    if ( (LA13_105=='u') ) {
                        int LA13_136 = input.LA(5);

                        if ( (LA13_136=='i') ) {
                            int LA13_167 = input.LA(6);

                            if ( (LA13_167=='r') ) {
                                int LA13_197 = input.LA(7);

                                if ( (LA13_197=='e') ) {
                                    int LA13_223 = input.LA(8);

                                    if ( (LA13_223=='s') ) {
                                        int LA13_244 = input.LA(9);

                                        if ( ((LA13_244>='0' && LA13_244<='9')||(LA13_244>='A' && LA13_244<='Z')||LA13_244=='_'||(LA13_244>='a' && LA13_244<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=21;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA13_66 = input.LA(3);

                if ( (LA13_66=='t') ) {
                    int LA13_106 = input.LA(4);

                    if ( (LA13_106=='p') ) {
                        int LA13_137 = input.LA(5);

                        if ( (LA13_137=='u') ) {
                            int LA13_168 = input.LA(6);

                            if ( (LA13_168=='t') ) {
                                int LA13_198 = input.LA(7);

                                if ( ((LA13_198>='0' && LA13_198<='9')||(LA13_198>='A' && LA13_198<='Z')||LA13_198=='_'||(LA13_198>='a' && LA13_198<='z')) ) {
                                    alt13=57;
                                }
                                else {
                                    alt13=24;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            case 'p':
                {
                int LA13_67 = input.LA(3);

                if ( (LA13_67=='t') ) {
                    int LA13_107 = input.LA(4);

                    if ( (LA13_107=='i') ) {
                        int LA13_138 = input.LA(5);

                        if ( (LA13_138=='o') ) {
                            int LA13_169 = input.LA(6);

                            if ( (LA13_169=='n') ) {
                                int LA13_199 = input.LA(7);

                                if ( (LA13_199=='a') ) {
                                    int LA13_225 = input.LA(8);

                                    if ( (LA13_225=='l') ) {
                                        int LA13_245 = input.LA(9);

                                        if ( ((LA13_245>='0' && LA13_245<='9')||(LA13_245>='A' && LA13_245<='Z')||LA13_245=='_'||(LA13_245>='a' && LA13_245<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=22;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0==':') ) {
            alt13=25;
        }
        else if ( (LA13_0=='d') ) {
            int LA13_21 = input.LA(2);

            if ( (LA13_21=='a') ) {
                int LA13_69 = input.LA(3);

                if ( (LA13_69=='t') ) {
                    int LA13_108 = input.LA(4);

                    if ( (LA13_108=='a') ) {
                        int LA13_139 = input.LA(5);

                        if ( ((LA13_139>='0' && LA13_139<='9')||(LA13_139>='A' && LA13_139<='Z')||LA13_139=='_'||(LA13_139>='a' && LA13_139<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=27;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA13_70 = input.LA(3);

                if ( (LA13_70=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'u':
                        {
                        int LA13_140 = input.LA(5);

                        if ( (LA13_140=='c') ) {
                            int LA13_171 = input.LA(6);

                            if ( (LA13_171=='t') ) {
                                int LA13_200 = input.LA(7);

                                if ( ((LA13_200>='0' && LA13_200<='9')||(LA13_200>='A' && LA13_200<='Z')||LA13_200=='_'||(LA13_200>='a' && LA13_200<='z')) ) {
                                    alt13=57;
                                }
                                else {
                                    alt13=43;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    case 'i':
                        {
                        int LA13_141 = input.LA(5);

                        if ( (LA13_141=='n') ) {
                            int LA13_172 = input.LA(6);

                            if ( (LA13_172=='g') ) {
                                int LA13_201 = input.LA(7);

                                if ( ((LA13_201>='0' && LA13_201<='9')||(LA13_201>='A' && LA13_201<='Z')||LA13_201=='_'||(LA13_201>='a' && LA13_201<='z')) ) {
                                    alt13=57;
                                }
                                else {
                                    alt13=47;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                        }
                        break;
                    default:
                        alt13=57;}

                }
                else {
                    alt13=57;}
                }
                break;
            case 'o':
                {
                int LA13_71 = input.LA(3);

                if ( (LA13_71=='u') ) {
                    int LA13_110 = input.LA(4);

                    if ( (LA13_110=='r') ) {
                        int LA13_142 = input.LA(5);

                        if ( (LA13_142=='c') ) {
                            int LA13_173 = input.LA(6);

                            if ( (LA13_173=='e') ) {
                                int LA13_202 = input.LA(7);

                                if ( ((LA13_202>='0' && LA13_202<='9')||(LA13_202>='A' && LA13_202<='Z')||LA13_202=='_'||(LA13_202>='a' && LA13_202<='z')) ) {
                                    alt13=57;
                                }
                                else {
                                    alt13=28;}
                            }
                            else {
                                alt13=57;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=61;
                }
                break;
            case '*':
                {
                alt13=60;
                }
                break;
            default:
                alt13=29;}

        }
        else if ( (LA13_0=='.') ) {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt13=31;
                }
                break;
            case '/':
                {
                alt13=30;
                }
                break;
            default:
                alt13=32;}

        }
        else if ( (LA13_0=='b') ) {
            int LA13_25 = input.LA(2);

            if ( (LA13_25=='i') ) {
                int LA13_78 = input.LA(3);

                if ( (LA13_78=='n') ) {
                    int LA13_111 = input.LA(4);

                    if ( (LA13_111=='d') ) {
                        int LA13_143 = input.LA(5);

                        if ( (LA13_143=='s') ) {
                            int LA13_174 = input.LA(6);

                            if ( ((LA13_174>='0' && LA13_174<='9')||(LA13_174>='A' && LA13_174<='Z')||LA13_174=='_'||(LA13_174>='a' && LA13_174<='z')) ) {
                                alt13=57;
                            }
                            else {
                                alt13=34;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='@') ) {
            alt13=37;
        }
        else if ( (LA13_0=='N') ) {
            int LA13_27 = input.LA(2);

            if ( (LA13_27=='U') ) {
                int LA13_80 = input.LA(3);

                if ( (LA13_80=='L') ) {
                    int LA13_112 = input.LA(4);

                    if ( (LA13_112=='L') ) {
                        int LA13_144 = input.LA(5);

                        if ( ((LA13_144>='0' && LA13_144<='9')||(LA13_144>='A' && LA13_144<='Z')||LA13_144=='_'||(LA13_144>='a' && LA13_144<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=38;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='n') ) {
            int LA13_28 = input.LA(2);

            if ( (LA13_28=='u') ) {
                int LA13_81 = input.LA(3);

                if ( (LA13_81=='l') ) {
                    int LA13_113 = input.LA(4);

                    if ( (LA13_113=='l') ) {
                        int LA13_145 = input.LA(5);

                        if ( ((LA13_145>='0' && LA13_145<='9')||(LA13_145>='A' && LA13_145<='Z')||LA13_145=='_'||(LA13_145>='a' && LA13_145<='z')) ) {
                            alt13=57;
                        }
                        else {
                            alt13=39;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='f') ) {
            int LA13_29 = input.LA(2);

            if ( (LA13_29=='a') ) {
                int LA13_82 = input.LA(3);

                if ( (LA13_82=='l') ) {
                    int LA13_114 = input.LA(4);

                    if ( (LA13_114=='s') ) {
                        int LA13_146 = input.LA(5);

                        if ( (LA13_146=='e') ) {
                            int LA13_177 = input.LA(6);

                            if ( ((LA13_177>='0' && LA13_177<='9')||(LA13_177>='A' && LA13_177<='Z')||LA13_177=='_'||(LA13_177>='a' && LA13_177<='z')) ) {
                                alt13=57;
                            }
                            else {
                                alt13=41;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
            }
            else {
                alt13=57;}
        }
        else if ( (LA13_0=='*') ) {
            alt13=42;
        }
        else if ( (LA13_0=='u') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA13_84 = input.LA(3);

                if ( (LA13_84=='i') ) {
                    int LA13_115 = input.LA(4);

                    if ( (LA13_115=='o') ) {
                        int LA13_147 = input.LA(5);

                        if ( (LA13_147=='n') ) {
                            int LA13_178 = input.LA(6);

                            if ( ((LA13_178>='0' && LA13_178<='9')||(LA13_178>='A' && LA13_178<='Z')||LA13_178=='_'||(LA13_178>='a' && LA13_178<='z')) ) {
                                alt13=57;
                            }
                            else {
                                alt13=44;}
                        }
                        else {
                            alt13=57;}
                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            case 'i':
                {
                int LA13_85 = input.LA(3);

                if ( (LA13_85=='n') ) {
                    int LA13_116 = input.LA(4);

                    if ( (LA13_116=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'p':
                            {
                            int LA13_179 = input.LA(6);

                            if ( (LA13_179=='t') ) {
                                int LA13_206 = input.LA(7);

                                if ( (LA13_206=='r') ) {
                                    int LA13_229 = input.LA(8);

                                    if ( (LA13_229=='_') ) {
                                        int LA13_246 = input.LA(9);

                                        if ( (LA13_246=='t') ) {
                                            int LA13_260 = input.LA(10);

                                            if ( ((LA13_260>='0' && LA13_260<='9')||(LA13_260>='A' && LA13_260<='Z')||LA13_260=='_'||(LA13_260>='a' && LA13_260<='z')) ) {
                                                alt13=57;
                                            }
                                            else {
                                                alt13=55;}
                                        }
                                        else {
                                            alt13=57;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                            }
                            break;
                        case '1':
                            {
                            int LA13_180 = input.LA(6);

                            if ( (LA13_180=='6') ) {
                                int LA13_207 = input.LA(7);

                                if ( (LA13_207=='_') ) {
                                    int LA13_230 = input.LA(8);

                                    if ( (LA13_230=='t') ) {
                                        int LA13_247 = input.LA(9);

                                        if ( ((LA13_247>='0' && LA13_247<='9')||(LA13_247>='A' && LA13_247<='Z')||LA13_247=='_'||(LA13_247>='a' && LA13_247<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=51;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                            }
                            break;
                        case '3':
                            {
                            int LA13_181 = input.LA(6);

                            if ( (LA13_181=='2') ) {
                                int LA13_208 = input.LA(7);

                                if ( (LA13_208=='_') ) {
                                    int LA13_231 = input.LA(8);

                                    if ( (LA13_231=='t') ) {
                                        int LA13_248 = input.LA(9);

                                        if ( ((LA13_248>='0' && LA13_248<='9')||(LA13_248>='A' && LA13_248<='Z')||LA13_248=='_'||(LA13_248>='a' && LA13_248<='z')) ) {
                                            alt13=57;
                                        }
                                        else {
                                            alt13=53;}
                                    }
                                    else {
                                        alt13=57;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                            }
                            break;
                        case '8':
                            {
                            int LA13_182 = input.LA(6);

                            if ( (LA13_182=='_') ) {
                                int LA13_209 = input.LA(7);

                                if ( (LA13_209=='t') ) {
                                    int LA13_232 = input.LA(8);

                                    if ( ((LA13_232>='0' && LA13_232<='9')||(LA13_232>='A' && LA13_232<='Z')||LA13_232=='_'||(LA13_232>='a' && LA13_232<='z')) ) {
                                        alt13=57;
                                    }
                                    else {
                                        alt13=49;}
                                }
                                else {
                                    alt13=57;}
                            }
                            else {
                                alt13=57;}
                            }
                            break;
                        default:
                            alt13=57;}

                    }
                    else {
                        alt13=57;}
                }
                else {
                    alt13=57;}
                }
                break;
            default:
                alt13=57;}

        }
        else if ( (LA13_0=='^') ) {
            int LA13_32 = input.LA(2);

            if ( ((LA13_32>='A' && LA13_32<='Z')||LA13_32=='_'||(LA13_32>='a' && LA13_32<='z')) ) {
                alt13=57;
            }
            else {
                alt13=63;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='q'||(LA13_0>='v' && LA13_0<='z')) ) {
            alt13=57;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=58;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_35 = input.LA(2);

            if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFE')) ) {
                alt13=59;
            }
            else {
                alt13=63;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_36 = input.LA(2);

            if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFE')) ) {
                alt13=59;
            }
            else {
                alt13=63;}
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=62;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='+'||LA13_0=='-'||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=63;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | RULE_INLINEDCODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:162: T50
                {
                mT50(); 

                }
                break;
            case 40 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:166: T51
                {
                mT51(); 

                }
                break;
            case 41 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:170: T52
                {
                mT52(); 

                }
                break;
            case 42 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:174: T53
                {
                mT53(); 

                }
                break;
            case 43 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:178: T54
                {
                mT54(); 

                }
                break;
            case 44 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:182: T55
                {
                mT55(); 

                }
                break;
            case 45 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:186: T56
                {
                mT56(); 

                }
                break;
            case 46 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:190: T57
                {
                mT57(); 

                }
                break;
            case 47 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:194: T58
                {
                mT58(); 

                }
                break;
            case 48 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:198: T59
                {
                mT59(); 

                }
                break;
            case 49 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:202: T60
                {
                mT60(); 

                }
                break;
            case 50 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:206: T61
                {
                mT61(); 

                }
                break;
            case 51 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:210: T62
                {
                mT62(); 

                }
                break;
            case 52 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:214: T63
                {
                mT63(); 

                }
                break;
            case 53 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:218: T64
                {
                mT64(); 

                }
                break;
            case 54 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:222: T65
                {
                mT65(); 

                }
                break;
            case 55 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:226: T66
                {
                mT66(); 

                }
                break;
            case 56 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:230: RULE_INLINEDCODE
                {
                mRULE_INLINEDCODE(); 

                }
                break;
            case 57 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:247: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:255: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:264: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 60 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:276: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:292: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 62 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:308: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1:316: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}