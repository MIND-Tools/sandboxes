package org.ow2.mindEd.adl.textual.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CODE_C", "RULE_SL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'composite'", "'extends'", "'{'", "'}'", "'abstract'", "'primitive'", "'type'", "'provides'", "'as'", "'['", "']'", "'requires'", "'optional'", "'contains'", "'<'", "','", "'>'", "'('", "')'", "'binds'", "'this'", "'.'", "'to'", "'conformsto'", "'STRUCT'", "'UNION'", "'ENUM'", "'+'", "'-'", "'0x'", "'null'", "'='", "'attribute'", "'source'", "'data'", "'..'", "'@'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CODE_C=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SL=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalFractalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFractalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFractalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalGrammarAccess grammarAccess;
     	
        public InternalFractalParser(TokenStream input, FractalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlDefinition";	
       	}
       	
       	@Override
       	protected FractalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAdlDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:73:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:74:2: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:75:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdlDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81);
            iv_ruleAdlDefinition=ruleAdlDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdlDefinition"


    // $ANTLR start "ruleAdlDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:82:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_architectureDefinition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:85:28: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==52) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred1_InternalFractal()) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137);
            	    lv_imports_0_0=ruleImportDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"ImportDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:104:3: ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_architectureDefinition_1_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_architectureDefinition_1_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:106:3: lv_architectureDefinition_1_0= ruleArchitectureDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitectureDefinitionArchitectureDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159);
            lv_architectureDefinition_1_0=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"architectureDefinition",
                      		lv_architectureDefinition_1_0, 
                      		"ArchitectureDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdlDefinition"


    // $ANTLR start "entryRuleArchitectureDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:130:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:131:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:132:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition195);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureDefinition"


    // $ANTLR start "ruleArchitectureDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:139:1: ruleArchitectureDefinition returns [EObject current=null] : (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeDefinition_0 = null;

        EObject this_PrimitiveDefinition_1 = null;

        EObject this_TypeDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:142:28: ( (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:143:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:143:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2_InternalFractal()) ) {
                    alt2=1;
                }
                else if ( (synpred3_InternalFractal()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt2=1;
                }
                break;
            case 20:
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:2: this_CompositeDefinition_0= ruleCompositeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition255);
                    this_CompositeDefinition_0=ruleCompositeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition285);
                    this_PrimitiveDefinition_1=rulePrimitiveDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:170:2: this_TypeDefinition_2= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition315);
                    this_TypeDefinition_2=ruleTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleImportDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:189:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:190:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:191:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition350);
            iv_ruleImportDefinition=ruleImportDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition360); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDefinition"


    // $ANTLR start "ruleImportDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:198:1: ruleImportDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:201:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:203:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:203:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:204:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImportDefinition406);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImportDefinition419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportDefinitionAccess().getImportKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:224:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:225:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:225:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:226:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition440);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_2_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImportDefinition452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDefinition"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:254:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:255:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:256:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard489);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard500); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:263:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:266:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:267:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:267:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:268:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard547);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:278:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:279:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleCompositeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:292:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:293:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:294:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition608);
            iv_ruleCompositeDefinition=ruleCompositeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinition618); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeDefinition"


    // $ANTLR start "ruleCompositeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:301:1: ruleCompositeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_templateSpecifiersList_3_0 = null;

        EObject lv_compositeFormalArgumentsList_4_0 = null;

        EObject lv_elements_8_1 = null;

        EObject lv_elements_8_2 = null;

        EObject lv_elements_8_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:304:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) ) )* otherlv_9= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) ) )* otherlv_9= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) ) )* otherlv_9= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) ) )* otherlv_9= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:306:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:306:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:307:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeDefinition664);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCompositeDefinition677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:327:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:329:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:2: ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:346:1: (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:346:1: (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:347:3: lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeDefinition719);
                    lv_templateSpecifiersList_3_0=ruleTemplateSpecifiersList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"templateSpecifiersList",
                              		lv_templateSpecifiersList_3_0, 
                              		"TemplateSpecifiersList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:363:3: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:365:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition741);
                    lv_compositeFormalArgumentsList_4_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_4_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:381:3: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:381:5: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleCompositeDefinition755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:385:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:387:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCompositeDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypeArchitectureDefinitionCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition782);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDefinition796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:407:1: ( ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23||LA10_0==27||LA10_0==29||LA10_0==35||LA10_0==52) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:408:1: ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:408:1: ( (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:409:1: (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:409:1: (lv_elements_8_1= ruleHostedInterfaceDefinition | lv_elements_8_2= ruleSubComponentDefinition | lv_elements_8_3= ruleBindingDefinition )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA9_1 = input.LA(2);

            	        if ( (synpred10_InternalFractal()) ) {
            	            alt9=1;
            	        }
            	        else if ( (synpred11_InternalFractal()) ) {
            	            alt9=2;
            	        }
            	        else if ( (true) ) {
            	            alt9=3;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 23:
            	    case 27:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:410:3: lv_elements_8_1= ruleHostedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsHostedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeDefinition819);
            	            lv_elements_8_1=ruleHostedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_1, 
            	                      		"HostedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:425:8: lv_elements_8_2= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition838);
            	            lv_elements_8_2=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_2, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:440:8: lv_elements_8_3= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition857);
            	            lv_elements_8_3=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_3, 
            	                      		"BindingDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleCompositeDefinition873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeDefinition"


    // $ANTLR start "entryRulePrimitiveDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:470:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:471:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:472:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition909);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDefinition"


    // $ANTLR start "rulePrimitiveDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:479:1: rulePrimitiveDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) ) )* otherlv_9= '}' ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_compositeFormalArgumentsList_4_0 = null;

        EObject lv_elements_8_1 = null;

        EObject lv_elements_8_2 = null;

        EObject lv_elements_8_3 = null;

        EObject lv_elements_8_4 = null;

        EObject lv_elements_8_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:482:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) ) )* otherlv_9= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:483:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) ) )* otherlv_9= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:483:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) ) )* otherlv_9= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:483:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) ) )* otherlv_9= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:483:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:484:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:484:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:485:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveDefinition965);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:501:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:502:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:502:1: (lv_abstract_1_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:503:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,20,FOLLOW_20_in_rulePrimitiveDefinition984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_1_0, grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition1010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:520:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:521:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:521:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:522:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1031);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:2: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:539:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:539:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:540:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1052);
                    lv_compositeFormalArgumentsList_4_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_4_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:556:3: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:556:5: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_rulePrimitiveDefinition1066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:560:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:561:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:561:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:562:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypeArchitectureDefinitionCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1093);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulePrimitiveDefinition1107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:582:1: ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23||LA16_0==27||(LA16_0>=48 && LA16_0<=50)||LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:583:1: ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:583:1: ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:584:1: (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:584:1: (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition | lv_elements_8_3= ruleImplementationDefinition | lv_elements_8_4= ruleAttributeDefinition | lv_elements_8_5= ruleDataDefinition )
            	    int alt15=5;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA15_1 = input.LA(2);

            	        if ( (synpred17_InternalFractal()) ) {
            	            alt15=1;
            	        }
            	        else if ( (synpred18_InternalFractal()) ) {
            	            alt15=2;
            	        }
            	        else if ( (synpred19_InternalFractal()) ) {
            	            alt15=3;
            	        }
            	        else if ( (synpred20_InternalFractal()) ) {
            	            alt15=4;
            	        }
            	        else if ( (true) ) {
            	            alt15=5;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt15=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:3: lv_elements_8_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1130);
            	            lv_elements_8_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:600:8: lv_elements_8_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1149);
            	            lv_elements_8_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:615:8: lv_elements_8_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1168);
            	            lv_elements_8_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:630:8: lv_elements_8_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1187);
            	            lv_elements_8_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:645:8: lv_elements_8_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_7_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1206);
            	            lv_elements_8_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_5, 
            	                      		"DataDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_rulePrimitiveDefinition1222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:675:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:676:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:677:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1258);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1268); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:684:1: ruleTypeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_6_1 = null;

        EObject lv_elements_6_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:687:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_7= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:688:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_7= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:688:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_7= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:688:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_7= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:688:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:689:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:689:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:690:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleTypeDefinition1314);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:710:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:711:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:711:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:712:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1348);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:728:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:728:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTypeDefinition1361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:732:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:733:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:733:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:734:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypeArchitectureDefinitionCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1388);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTypeDefinition1402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:754:1: ( ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23||LA20_0==27||LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:755:1: ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:755:1: ( (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:756:1: (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:756:1: (lv_elements_6_1= ruleProvidedInterfaceDefinition | lv_elements_6_2= ruleRequiredInterfaceDefinition )
            	    int alt19=2;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA19_1 = input.LA(2);

            	        if ( (synpred24_InternalFractal()) ) {
            	            alt19=1;
            	        }
            	        else if ( (true) ) {
            	            alt19=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:757:3: lv_elements_6_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_5_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1425);
            	            lv_elements_6_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_6_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:772:8: lv_elements_6_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_5_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1444);
            	            lv_elements_6_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_6_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTypeDefinition1460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTypeDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleHostedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:802:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:803:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:804:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1496);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1506); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHostedInterfaceDefinition"


    // $ANTLR start "ruleHostedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:811:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:814:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:815:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:815:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            int alt21=2;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA21_1 = input.LA(2);

                if ( (synpred26_InternalFractal()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt21=1;
                }
                break;
            case 27:
                {
                alt21=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:816:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1556);
                    this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProvidedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:829:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1586);
                    this_RequiredInterfaceDefinition_1=ruleRequiredInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RequiredInterfaceDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHostedInterfaceDefinition"


    // $ANTLR start "entryRuleProvidedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:848:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:849:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:850:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1621);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1631); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedInterfaceDefinition"


    // $ANTLR start "ruleProvidedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:857:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:860:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:861:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:861:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:861:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:861:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:862:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:862:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:863:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition1677);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:879:3: ( (lv_role_1_0= 'provides' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:880:1: (lv_role_1_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:880:1: (lv_role_1_0= 'provides' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:881:3: lv_role_1_0= 'provides'
            {
            lv_role_1_0=(Token)match(input,23,FOLLOW_23_in_ruleProvidedInterfaceDefinition1696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getRoleProvidesKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "provides");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:894:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:895:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:895:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:896:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1736);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleProvidedInterfaceDefinition1748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:916:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:917:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:917:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:918:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:934:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:934:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:934:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:935:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:935:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,25,FOLLOW_25_in_ruleProvidedInterfaceDefinition1789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_5_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:949:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_INT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:950:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:950:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:951:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition1819); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_6_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_6_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleProvidedInterfaceDefinition1837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleProvidedInterfaceDefinition1851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getProvidedInterfaceDefinitionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedInterfaceDefinition"


    // $ANTLR start "entryRuleRequiredInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:983:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:984:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:985:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition1887);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition1897); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredInterfaceDefinition"


    // $ANTLR start "ruleRequiredInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:992:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
    public final EObject ruleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        Token lv_collectionsize_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:995:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:996:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:996:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:996:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:996:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:997:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:997:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:998:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition1943);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1014:3: ( (lv_role_1_0= 'requires' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1015:1: (lv_role_1_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1015:1: (lv_role_1_0= 'requires' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1016:3: lv_role_1_0= 'requires'
            {
            lv_role_1_0=(Token)match(input,27,FOLLOW_27_in_ruleRequiredInterfaceDefinition1962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getRoleRequiresKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "requires");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1029:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1030:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1030:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1031:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,28,FOLLOW_28_in_ruleRequiredInterfaceDefinition1993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_2_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getOptionalOptionalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1044:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1045:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1045:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1046:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2034);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleRequiredInterfaceDefinition2046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1066:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1067:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1067:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1068:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1084:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1084:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1084:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1085:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1085:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1086:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,25,FOLLOW_25_in_ruleRequiredInterfaceDefinition2087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_6_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1099:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_INT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1100:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1100:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1101:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2117); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_7_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_6_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_7_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleRequiredInterfaceDefinition2135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRequiredInterfaceDefinition2149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRequiredInterfaceDefinitionAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredInterfaceDefinition"


    // $ANTLR start "entryRuleSubComponentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1133:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1134:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1135:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2185);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2195); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentDefinition"


    // $ANTLR start "ruleSubComponentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1142:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_16=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_templatesList_6_0 = null;

        EObject lv_argumentsList_9_0 = null;

        EObject lv_argumentsList_11_0 = null;

        EObject lv_body_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1145:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1146:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1146:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1146:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1146:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1147:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1147:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1148:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2241);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSubComponentDefinition2254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1168:1: ( ( ruleQualifiedName ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1169:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1169:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1170:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTypeArchitectureDefinitionCrossReference_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2281);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1186:3: (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1186:5: otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleSubComponentDefinition2295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1190:1: ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1191:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1191:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1192:3: lv_templatesList_4_0= ruleTemplateDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2316);
                    lv_templatesList_4_0=ruleTemplateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_4_0, 
                              		"TemplateDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1208:2: (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==31) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1208:4: otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleSubComponentDefinition2329); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1212:1: ( (lv_templatesList_6_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1213:1: (lv_templatesList_6_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1213:1: (lv_templatesList_6_0= ruleTemplateDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1214:3: lv_templatesList_6_0= ruleTemplateDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2350);
                    	    lv_templatesList_6_0=ruleTemplateDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templatesList",
                    	              		lv_templatesList_6_0, 
                    	              		"TemplateDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition2364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1234:3: (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1234:5: otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleSubComponentDefinition2379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1238:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1239:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1239:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1240:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2400);
                    lv_argumentsList_9_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_9_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1256:2: (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==31) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1256:4: otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleSubComponentDefinition2413); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1260:1: ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1261:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1261:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1262:3: lv_argumentsList_11_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2434);
                    	    lv_argumentsList_11_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_11_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleSubComponentDefinition2448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleSubComponentDefinition2462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1286:1: ( (lv_name_14_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1287:1: (lv_name_14_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1287:1: (lv_name_14_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1288:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition2479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_14_0, grammarAccess.getSubComponentDefinitionAccess().getNameIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_14_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1304:2: ( (lv_body_15_0= ruleSubComponentBody ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16||LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1305:1: (lv_body_15_0= ruleSubComponentBody )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1305:1: (lv_body_15_0= ruleSubComponentBody )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1306:3: lv_body_15_0= ruleSubComponentBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentBodyParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2505);
                    lv_body_15_0=ruleSubComponentBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_15_0, 
                              		"SubComponentBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleSubComponentDefinition2518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getSubComponentDefinitionAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentDefinition"


    // $ANTLR start "entryRuleSubComponentBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1334:1: entryRuleSubComponentBody returns [EObject current=null] : iv_ruleSubComponentBody= ruleSubComponentBody EOF ;
    public final EObject entryRuleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1335:2: (iv_ruleSubComponentBody= ruleSubComponentBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1336:2: iv_ruleSubComponentBody= ruleSubComponentBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2554);
            iv_ruleSubComponentBody=ruleSubComponentBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentBody2564); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentBody"


    // $ANTLR start "ruleSubComponentBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1343:1: ruleSubComponentBody returns [EObject current=null] : (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) ;
    public final EObject ruleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentCompositeBody_0 = null;

        EObject this_SubComponentPrimitiveBody_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1346:28: ( (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            else if ( (LA36_0==21) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1348:2: this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentCompositeBodyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2614);
                    this_SubComponentCompositeBody_0=ruleSubComponentCompositeBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentCompositeBody_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1361:2: this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentPrimitiveBodyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2644);
                    this_SubComponentPrimitiveBody_1=ruleSubComponentPrimitiveBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentPrimitiveBody_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentBody"


    // $ANTLR start "entryRuleSubComponentCompositeBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1380:1: entryRuleSubComponentCompositeBody returns [EObject current=null] : iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF ;
    public final EObject entryRuleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1381:2: (iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1382:2: iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentCompositeBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2679);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2689); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentCompositeBody"


    // $ANTLR start "ruleSubComponentCompositeBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1389:1: ruleSubComponentCompositeBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_1 = null;

        EObject lv_elements_2_2 = null;

        EObject lv_elements_2_3 = null;

        EObject lv_elements_2_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1392:28: ( ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1393:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1393:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1393:2: ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1393:2: ( (lv_anonymous_0_0= 'composite' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1394:1: (lv_anonymous_0_0= 'composite' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1394:1: (lv_anonymous_0_0= 'composite' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1395:3: lv_anonymous_0_0= 'composite'
            {
            lv_anonymous_0_0=(Token)match(input,16,FOLLOW_16_in_ruleSubComponentCompositeBody2732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_anonymous_0_0, grammarAccess.getSubComponentCompositeBodyAccess().getAnonymousCompositeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentCompositeBodyRule());
              	        }
                     		setWithLastConsumed(current, "anonymous", true, "composite");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentCompositeBody2757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1412:1: ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==23||LA38_0==27||LA38_0==29||LA38_0==35||LA38_0==52) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1413:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1413:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1414:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1414:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    int alt37=4;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA37_1 = input.LA(2);

            	        if ( (synpred42_InternalFractal()) ) {
            	            alt37=1;
            	        }
            	        else if ( (synpred43_InternalFractal()) ) {
            	            alt37=2;
            	        }
            	        else if ( (synpred44_InternalFractal()) ) {
            	            alt37=3;
            	        }
            	        else if ( (true) ) {
            	            alt37=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 37, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1415:3: lv_elements_2_1= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2780);
            	            lv_elements_2_1=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_1, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1430:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2799);
            	            lv_elements_2_2=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_2, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1445:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody2818);
            	            lv_elements_2_3=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_3, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1460:8: lv_elements_2_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsBindingDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody2837);
            	            lv_elements_2_4=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_4, 
            	                      		"BindingDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSubComponentCompositeBody2853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubComponentCompositeBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentCompositeBody"


    // $ANTLR start "entryRuleSubComponentPrimitiveBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1490:1: entryRuleSubComponentPrimitiveBody returns [EObject current=null] : iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF ;
    public final EObject entryRuleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentPrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: (iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:2: iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2889);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2899); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentPrimitiveBody"


    // $ANTLR start "ruleSubComponentPrimitiveBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1499:1: ruleSubComponentPrimitiveBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_1 = null;

        EObject lv_elements_2_2 = null;

        EObject lv_elements_2_3 = null;

        EObject lv_elements_2_4 = null;

        EObject lv_elements_2_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1502:28: ( ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1503:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1503:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1503:2: ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1503:2: ( (lv_anonymous_0_0= 'primitive' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1504:1: (lv_anonymous_0_0= 'primitive' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1504:1: (lv_anonymous_0_0= 'primitive' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1505:3: lv_anonymous_0_0= 'primitive'
            {
            lv_anonymous_0_0=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentPrimitiveBody2942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_anonymous_0_0, grammarAccess.getSubComponentPrimitiveBodyAccess().getAnonymousPrimitiveKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentPrimitiveBodyRule());
              	        }
                     		setWithLastConsumed(current, "anonymous", true, "primitive");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentPrimitiveBody2967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1522:1: ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==23||LA40_0==27||(LA40_0>=48 && LA40_0<=50)||LA40_0==52) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1523:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1523:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1524:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1524:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    int alt39=5;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA39_1 = input.LA(2);

            	        if ( (synpred46_InternalFractal()) ) {
            	            alt39=1;
            	        }
            	        else if ( (synpred47_InternalFractal()) ) {
            	            alt39=2;
            	        }
            	        else if ( (synpred48_InternalFractal()) ) {
            	            alt39=3;
            	        }
            	        else if ( (synpred49_InternalFractal()) ) {
            	            alt39=4;
            	        }
            	        else if ( (true) ) {
            	            alt39=5;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 39, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt39=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1525:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody2990);
            	            lv_elements_2_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1540:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody3009);
            	            lv_elements_2_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1555:8: lv_elements_2_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody3028);
            	            lv_elements_2_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1570:8: lv_elements_2_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody3047);
            	            lv_elements_2_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1585:8: lv_elements_2_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsDataDefinitionParserRuleCall_2_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody3066);
            	            lv_elements_2_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_5, 
            	                      		"DataDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSubComponentPrimitiveBody3082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubComponentPrimitiveBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentPrimitiveBody"


    // $ANTLR start "entryRuleCompositeElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1617:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1618:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3120);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement3130); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeElement"


    // $ANTLR start "ruleCompositeElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1626:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1629:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1630:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1630:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA41_1 = input.LA(2);

                if ( (synpred51_InternalFractal()) ) {
                    alt41=1;
                }
                else if ( (synpred52_InternalFractal()) ) {
                    alt41=2;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 27:
                {
                alt41=1;
                }
                break;
            case 29:
                {
                alt41=2;
                }
                break;
            case 35:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1631:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3180);
                    this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1644:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3210);
                    this_SubComponentDefinition_1=ruleSubComponentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1657:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3240);
                    this_BindingDefinition_2=ruleBindingDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BindingDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeElement"


    // $ANTLR start "entryRulePrimitiveElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1676:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1677:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1678:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3275);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement3285); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveElement"


    // $ANTLR start "rulePrimitiveElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1685:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1688:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1689:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1689:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred53_InternalFractal()) ) {
                    alt42=1;
                }
                else if ( (synpred54_InternalFractal()) ) {
                    alt42=2;
                }
                else if ( (synpred55_InternalFractal()) ) {
                    alt42=3;
                }
                else if ( (true) ) {
                    alt42=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 27:
                {
                alt42=1;
                }
                break;
            case 49:
                {
                alt42=2;
                }
                break;
            case 48:
                {
                alt42=3;
                }
                break;
            case 50:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1690:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3335);
                    this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1703:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3365);
                    this_ImplementationDefinition_1=ruleImplementationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImplementationDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3395);
                    this_AttributeDefinition_2=ruleAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1729:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3425);
                    this_DataDefinition_3=ruleDataDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataDefinition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveElement"


    // $ANTLR start "entryRuleBindingDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1748:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1749:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1750:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3460);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition3470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingDefinition"


    // $ANTLR start "ruleBindingDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1757:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' (otherlv_2= 'this' | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sourceIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_targetIndex_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1760:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' (otherlv_2= 'this' | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' (otherlv_2= 'this' | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' (otherlv_2= 'this' | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' (otherlv_2= 'this' | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1762:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1762:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1763:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3516);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleBindingDefinition3529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1783:1: (otherlv_2= 'this' | ( (otherlv_3= RULE_ID ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1783:3: otherlv_2= 'this'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getThisKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1788:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1788:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1789:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1789:1: (otherlv_3= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1790:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1808:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1809:1: (otherlv_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1809:1: (otherlv_5= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1810:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceRequiredInterfaceDefinitionCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1824:2: (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1824:4: otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleBindingDefinition3622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1828:1: ( (lv_sourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1829:1: (lv_sourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1829:1: (lv_sourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1830:3: lv_sourceIndex_7_0= RULE_INT
                    {
                    lv_sourceIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sourceIndex_7_0, grammarAccess.getBindingDefinitionAccess().getSourceIndexINTTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sourceIndex",
                              		lv_sourceIndex_7_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleBindingDefinition3656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleBindingDefinition3670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1854:1: (otherlv_10= 'this' | ( (otherlv_11= RULE_ID ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1854:3: otherlv_10= 'this'
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getThisKeyword_7_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:6: ( (otherlv_11= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:6: ( (otherlv_11= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:1: (otherlv_11= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:1: (otherlv_11= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1861:3: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_11, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_8());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1879:1: ( (otherlv_13= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1880:1: (otherlv_13= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1880:1: (otherlv_13= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1881:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceProvidedInterfaceDefinitionCrossReference_9_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1895:2: (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1895:4: otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleBindingDefinition3763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_10_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: ( (lv_targetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1900:1: (lv_targetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1900:1: (lv_targetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1901:3: lv_targetIndex_15_0= RULE_INT
                    {
                    lv_targetIndex_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_targetIndex_15_0, grammarAccess.getBindingDefinitionAccess().getTargetIndexINTTerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"targetIndex",
                              		lv_targetIndex_15_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleBindingDefinition3797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleBindingDefinition3811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getBindingDefinitionAccess().getSemicolonKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingDefinition"


    // $ANTLR start "entryRuleFormalArgument"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1933:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1934:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1935:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3847);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument3857); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArgument"


    // $ANTLR start "ruleFormalArgument"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1942:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1945:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1946:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1946:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1947:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1947:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1948:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument3898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormalArgumentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArgument"


    // $ANTLR start "entryRuleFormalArgumentsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1972:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1973:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1974:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList3938);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList3948); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArgumentsList"


    // $ANTLR start "ruleFormalArgumentsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1981:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1984:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFormalArgumentsList3985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1989:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1990:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1990:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1991:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4006);
            lv_formalArguments_1_0=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormalArgumentsListRule());
              	        }
                     		add(
                     			current, 
                     			"formalArguments",
                      		lv_formalArguments_1_0, 
                      		"FormalArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2007:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==31) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2007:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleFormalArgumentsList4019); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2011:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2012:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2012:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2013:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4040);
            	    lv_formalArguments_3_0=ruleFormalArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormalArgumentsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"formalArguments",
            	              		lv_formalArguments_3_0, 
            	              		"FormalArgument");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleFormalArgumentsList4054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArgumentsList"


    // $ANTLR start "entryRuleTemplateSpecifier"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2041:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2042:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2043:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4090);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier4100); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSpecifier"


    // $ANTLR start "ruleTemplateSpecifier"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2050:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2053:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2056:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier4142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateSpecifierRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleTemplateSpecifier4159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2076:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2077:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2077:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2078:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateSpecifierRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifierAccess().getReferenceTypeDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4186);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateSpecifier"


    // $ANTLR start "entryRuleTemplateSpecifiersList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2102:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2103:2: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2104:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifiersListRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList4222);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList4232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSpecifiersList"


    // $ANTLR start "ruleTemplateSpecifiersList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2111:1: ruleTemplateSpecifiersList returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_templateSpecifiers_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2114:28: ( (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:1: (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:1: (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:3: otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTemplateSpecifiersList4269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2119:1: ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2119:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2119:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2120:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2120:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2121:3: lv_templateSpecifiers_1_0= ruleTemplateSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4291);
            lv_templateSpecifiers_1_0=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateSpecifiersListRule());
              	        }
                     		add(
                     			current, 
                     			"templateSpecifiers",
                      		lv_templateSpecifiers_1_0, 
                      		"TemplateSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2137:2: (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==31) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2137:4: otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleTemplateSpecifiersList4304); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2141:1: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2142:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2142:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2143:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4325);
            	    lv_templateSpecifiers_3_0=ruleTemplateSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateSpecifiersListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"templateSpecifiers",
            	              		lv_templateSpecifiers_3_0, 
            	              		"TemplateSpecifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleTemplateSpecifiersList4340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTemplateSpecifiersListAccess().getGreaterThanSignKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateSpecifiersList"


    // $ANTLR start "entryRuleAttributeType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2171:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2172:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2173:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType4377);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType4388); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2180:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2183:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2184:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2184:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt50=1;
                }
                break;
            case 41:
                {
                alt50=2;
                }
                break;
            case 42:
                {
                alt50=3;
                }
                break;
            case RULE_ID:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2185:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleAttributeType4426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2192:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeType4445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2199:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeType4464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2205:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType4485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getAttributeTypeAccess().getIDTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2220:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2221:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2222:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT4531);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT4542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignedINT"


    // $ANTLR start "rulesignedINT"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2229:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2232:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:2: (kw= '+' | kw= '-' )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            else if ( (LA51_0==44) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2234:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulesignedINT4581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2241:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulesignedINT4600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT4617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignedINT"


    // $ANTLR start "entryRuleHexadecimalType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2261:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2262:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2263:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexadecimalTypeRule()); 
            }
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4663);
            iv_ruleHexadecimalType=ruleHexadecimalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType4674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexadecimalType"


    // $ANTLR start "ruleHexadecimalType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2270:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2273:28: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2274:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2274:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2275:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleHexadecimalType4712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHexadecimalTypeAccess().getXKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType4727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getHexadecimalTypeAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHexadecimalType"


    // $ANTLR start "entryRuleValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2295:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2296:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2297:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4773);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2304:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2307:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2308:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2308:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt52=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt52=1;
                }
                break;
            case RULE_INT:
            case 43:
            case 44:
                {
                alt52=2;
                }
                break;
            case 45:
                {
                alt52=3;
                }
                break;
            case RULE_STRING:
                {
                alt52=4;
                }
                break;
            case 46:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2308:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2317:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue4857);
                    this_signedINT_1=rulesignedINT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_signedINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2329:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue4890);
                    this_HexadecimalType_2=ruleHexadecimalType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HexadecimalType_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2340:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2349:2: kw= 'null'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValue4940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValueAccess().getNullKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleTemplateDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2362:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2363:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2364:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4980);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition4990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateDefinition"


    // $ANTLR start "ruleTemplateDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2371:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2374:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==47) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2376:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2376:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2377:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition5033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getTemplateDefinitionAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleTemplateDefinition5050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2397:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2398:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2398:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2399:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateDefinitionAccess().getReferenceCompositeDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition5079);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateDefinition"


    // $ANTLR start "entryRuleArgumentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2423:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2424:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2425:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5115);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5125); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentDefinition"


    // $ANTLR start "ruleArgumentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2432:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2435:28: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==47) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:3: ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2437:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2437:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2438:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_argumentName_0_0, grammarAccess.getArgumentDefinitionAccess().getArgumentNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"argumentName",
                              		lv_argumentName_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleArgumentDefinition5185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2458:3: ( (lv_argumentValue_2_0= ruleValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2459:1: (lv_argumentValue_2_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2459:1: (lv_argumentValue_2_0= ruleValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2460:3: lv_argumentValue_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5208);
            lv_argumentValue_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"argumentValue",
                      		lv_argumentValue_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentDefinition"


    // $ANTLR start "entryRuleAttributeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2484:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2485:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2486:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5244);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5254); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2493:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_attributeName_3_0=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2496:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2497:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2497:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2497:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2497:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2498:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2498:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2499:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5300);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleAttributeDefinition5313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2519:1: ( (lv_type_2_0= ruleAttributeType ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=40 && LA56_0<=42)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==RULE_ID) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2520:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2520:1: (lv_type_2_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2521:3: lv_type_2_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5334);
                    lv_type_2_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"AttributeType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2537:3: ( (lv_attributeName_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2538:1: (lv_attributeName_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2538:1: (lv_attributeName_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2539:3: lv_attributeName_3_0= RULE_ID
            {
            lv_attributeName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_attributeName_3_0, grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"attributeName",
                      		lv_attributeName_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2555:2: (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2555:4: otherlv_4= '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleAttributeDefinition5370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2559:1: ( (lv_value_5_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2560:1: (lv_value_5_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2560:1: (lv_value_5_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2561:3: lv_value_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5391);
                    lv_value_5_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleImplementationDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2585:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2586:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2587:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5429);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5439); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationDefinition"


    // $ANTLR start "ruleImplementationDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2594:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2597:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2598:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2598:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2598:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2598:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==52) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2599:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2599:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2600:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5485);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleImplementationDefinition5498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2620:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==RULE_SL||LA59_0==37||LA59_0==51) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_CODE_C) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2620:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2620:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2621:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2621:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2622:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5520);
                    lv_fileC_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2639:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2639:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2640:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2640:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2641:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5547);
                    lv_inlineCcode_3_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_3_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleImplementationDefinition5560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getImplementationDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationDefinition"


    // $ANTLR start "entryRuleDataDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2669:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2670:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2671:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5596);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5606); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDefinition"


    // $ANTLR start "ruleDataDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2678:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2681:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2682:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2682:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2682:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2682:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==52) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2683:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2683:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2684:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5652);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleDataDefinition5665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2704:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==RULE_SL||LA61_0==37||LA61_0==51) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_CODE_C) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2704:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2704:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2706:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition5687);
                    lv_fileC_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2723:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2723:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2724:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2724:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2725:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5714);
                    lv_inlineCcode_3_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_3_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDataDefinition5727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDataDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2753:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2754:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2755:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5764);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5775); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2762:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2765:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2766:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2766:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2766:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2773:1: (kw= '.' this_ID_2= RULE_ID )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==37) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2774:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName5834); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5849); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFileC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2794:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2795:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2796:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC5896);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC5906); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileC"


    // $ANTLR start "ruleFileC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2803:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2806:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2807:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2807:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2807:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2807:2: ( (lv_directory_0_0= rulePath ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_SL) ) {
                    alt63=1;
                }
            }
            else if ( (LA63_0==RULE_SL||LA63_0==37||LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2808:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2808:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2809:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFileC5952);
                    lv_directory_0_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFileCRule());
                      	        }
                             		set(
                             			current, 
                             			"directory",
                              		lv_directory_0_0, 
                              		"Path");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2825:3: ( (lv_name_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2826:1: (lv_name_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2826:1: (lv_name_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2827:3: lv_name_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC5974);
            lv_name_1_0=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFileCRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"FileName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileC"


    // $ANTLR start "entryRuleInlineCodeC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2851:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2852:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2853:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6010);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC6020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineCodeC"


    // $ANTLR start "ruleInlineCodeC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2860:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2863:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2864:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2864:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2865:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2865:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2866:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_codeC_0_0, grammarAccess.getInlineCodeCAccess().getCodeCCODE_CTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInlineCodeCRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"codeC",
                      		lv_codeC_0_0, 
                      		"CODE_C");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineCodeC"


    // $ANTLR start "entryRulePath"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2890:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2891:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2892:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath6102);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath6113); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2899:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_3=null;
        Token this_ID_4=null;
        Token this_SL_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2902:28: ( ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )?
            int alt64=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt64=1;
                    }
                    break;
                case 37:
                    {
                    alt64=2;
                    }
                    break;
                case 51:
                    {
                    alt64=3;
                    }
                    break;
            }

            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2912:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePath6178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2919:2: kw= '..'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePath6197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2924:3: (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_SL) ) {
                    int LA68_1 = input.LA(2);

                    if ( (LA68_1==RULE_ID) ) {
                        int LA68_2 = input.LA(3);

                        if ( (LA68_2==RULE_ID||LA68_2==RULE_SL||LA68_2==44) ) {
                            alt68=1;
                        }


                    }
                    else if ( (LA68_1==RULE_SL||LA68_1==51) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2924:8: this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_3=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6215); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_3, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2931:1: ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_ID||LA67_0==RULE_SL) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==51) ) {
            	        alt67=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2931:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2931:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);

            	                if ( (LA66_0==RULE_ID) ) {
            	                    alt66=1;
            	                }


            	                switch (alt66) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2931:7: this_ID_4= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6237); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_4);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_4, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2938:1: (kw= '-' )?
            	            	    int alt65=2;
            	            	    int LA65_0 = input.LA(1);

            	            	    if ( (LA65_0==44) ) {
            	            	        alt65=1;
            	            	    }
            	            	    switch (alt65) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2939:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,44,FOLLOW_44_in_rulePath6256); if (state.failed) return current;
            	            	            if ( state.backtracking==0 ) {

            	            	                      current.merge(kw);
            	            	                      newLeafNode(kw, grammarAccess.getPathAccess().getHyphenMinusKeyword_1_1_0_1()); 
            	            	                  
            	            	            }

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2946:2: kw= '..'
            	            {
            	            kw=(Token)match(input,51,FOLLOW_51_in_rulePath6279); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_1_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            this_SL_7=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SL_7);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SL_7, grammarAccess.getPathAccess().getSLTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleFileName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2966:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2967:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2968:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6343);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6354); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2978:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2979:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2979:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2979:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2986:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==37) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2987:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleFileName6413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3007:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3008:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3009:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6475);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList6485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationsList"


    // $ANTLR start "ruleAnnotationsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3016:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3019:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3020:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3020:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3020:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3020:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3021:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3021:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3022:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6531);
            lv_annotations_0_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
              	        }
                     		add(
                     			current, 
                     			"annotations",
                      		lv_annotations_0_0, 
                      		"Annotation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3038:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==52) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3039:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3039:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3040:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6552);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationsList"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3064:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3065:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3066:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6589);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3073:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_5 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3076:28: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3077:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3077:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3077:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleAnnotation6636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3081:1: ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3082:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3082:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3083:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3083:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            int alt71=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt71=1;
                }
                break;
            case 54:
                {
                alt71=2;
                }
                break;
            case 55:
                {
                alt71=3;
                }
                break;
            case 56:
                {
                alt71=4;
                }
                break;
            case RULE_ID:
                {
                alt71=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3084:3: lv_name_1_1= 'Override'
                    {
                    lv_name_1_1=(Token)match(input,53,FOLLOW_53_in_ruleAnnotation6656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_1, grammarAccess.getAnnotationAccess().getNameOverrideKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3096:8: lv_name_1_2= 'Singleton'
                    {
                    lv_name_1_2=(Token)match(input,54,FOLLOW_54_in_ruleAnnotation6685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_2, grammarAccess.getAnnotationAccess().getNameSingletonKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3108:8: lv_name_1_3= 'LDFlags'
                    {
                    lv_name_1_3=(Token)match(input,55,FOLLOW_55_in_ruleAnnotation6714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_3, grammarAccess.getAnnotationAccess().getNameLDFlagsKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3120:8: lv_name_1_4= 'CFlags'
                    {
                    lv_name_1_4=(Token)match(input,56,FOLLOW_56_in_ruleAnnotation6743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_4, grammarAccess.getAnnotationAccess().getNameCFlagsKeyword_1_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3132:8: lv_name_1_5= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation6775);
                    lv_name_1_5=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_5, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3150:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==33) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3150:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation6791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3154:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3155:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3155:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3156:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6812);
                    lv_annotationElements_3_0=ruleAnnotationElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotationElements",
                              		lv_annotationElements_3_0, 
                              		"AnnotationElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3172:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==31) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3172:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleAnnotation6825); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3176:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3177:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3177:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3178:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6846);
                    	    lv_annotationElements_5_0=ruleAnnotationElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotationElements",
                    	              		lv_annotationElements_5_0, 
                    	              		"AnnotationElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleAnnotation6860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3206:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3207:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3208:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6898);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement6908); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationElement"


    // $ANTLR start "ruleAnnotationElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3215:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3218:28: ( ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:3: ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:3: ( (lv_elementName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:1: (lv_elementName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:1: (lv_elementName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3221:3: lv_elementName_0_0= RULE_ID
                    {
                    lv_elementName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement6951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_elementName_0_0, grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"elementName",
                              		lv_elementName_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleAnnotationElement6968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3241:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3242:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3242:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3243:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement6991);
            lv_elementValue_2_0=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationElementRule());
              	        }
                     		set(
                     			current, 
                     			"elementValue",
                      		lv_elementValue_2_0, 
                      		"ElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationElement"


    // $ANTLR start "entryRuleElementValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3267:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3268:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7027);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7037); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementValue"


    // $ANTLR start "ruleElementValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3276:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3279:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3280:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3280:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt75=1;
                }
                break;
            case 52:
                {
                alt75=2;
                }
                break;
            case 18:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3281:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7087);
                    this_ConstantValue_0=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3294:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7117);
                    this_Annotation_1=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Annotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3307:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7147);
                    this_ElementValueArrayInitializer_2=ruleElementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ElementValueArrayInitializer_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementValue"


    // $ANTLR start "entryRuleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3326:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3327:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3328:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7182);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7192); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementValueArrayInitializer"


    // $ANTLR start "ruleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3335:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3338:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3339:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3339:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3339:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer7229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3343:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3344:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3344:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3345:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7250);
            lv_values_1_0=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementValueArrayInitializerRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"ElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3361:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==31) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3361:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleElementValueArrayInitializer7263); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3365:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3366:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3366:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3367:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7284);
            	    lv_values_3_0=ruleElementValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementValueArrayInitializerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"ElementValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleElementValueArrayInitializer7298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getElementValueArrayInitializerAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementValueArrayInitializer"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3395:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3396:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3397:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7334);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7344); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3404:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3407:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3408:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3408:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3409:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3409:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3410:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7389);
            lv_value_0_0=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ConstantFormat");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleConstantFormat"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3434:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3435:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3436:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7425);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantFormat"


    // $ANTLR start "ruleConstantFormat"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3443:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3446:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3447:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3447:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_STRING) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3447:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3455:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantFormat"

    // $ANTLR start synpred1_InternalFractal
    public final void synpred1_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_imports_0_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0_0= ruleImportDefinition ) )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        {
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:3: lv_imports_0_0= ruleImportDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137);
        lv_imports_0_0=ruleImportDefinition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalFractal

    // $ANTLR start synpred2_InternalFractal
    public final void synpred2_InternalFractal_fragment() throws RecognitionException {   
        EObject this_CompositeDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:2: (this_CompositeDefinition_0= ruleCompositeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:2: this_CompositeDefinition_0= ruleCompositeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompositeDefinition_in_synpred2_InternalFractal255);
        this_CompositeDefinition_0=ruleCompositeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalFractal

    // $ANTLR start synpred3_InternalFractal
    public final void synpred3_InternalFractal_fragment() throws RecognitionException {   
        EObject this_PrimitiveDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: (this_PrimitiveDefinition_1= rulePrimitiveDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePrimitiveDefinition_in_synpred3_InternalFractal285);
        this_PrimitiveDefinition_1=rulePrimitiveDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalFractal

    // $ANTLR start synpred10_InternalFractal
    public final void synpred10_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:410:3: (lv_elements_8_1= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:410:3: lv_elements_8_1= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsHostedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred10_InternalFractal819);
        lv_elements_8_1=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalFractal

    // $ANTLR start synpred11_InternalFractal
    public final void synpred11_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:425:8: (lv_elements_8_2= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:425:8: lv_elements_8_2= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred11_InternalFractal838);
        lv_elements_8_2=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalFractal

    // $ANTLR start synpred17_InternalFractal
    public final void synpred17_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:3: (lv_elements_8_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:3: lv_elements_8_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred17_InternalFractal1130);
        lv_elements_8_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalFractal

    // $ANTLR start synpred18_InternalFractal
    public final void synpred18_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:600:8: (lv_elements_8_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:600:8: lv_elements_8_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred18_InternalFractal1149);
        lv_elements_8_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalFractal

    // $ANTLR start synpred19_InternalFractal
    public final void synpred19_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:615:8: (lv_elements_8_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:615:8: lv_elements_8_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred19_InternalFractal1168);
        lv_elements_8_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalFractal

    // $ANTLR start synpred20_InternalFractal
    public final void synpred20_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:630:8: (lv_elements_8_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:630:8: lv_elements_8_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred20_InternalFractal1187);
        lv_elements_8_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalFractal

    // $ANTLR start synpred24_InternalFractal
    public final void synpred24_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_6_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:757:3: (lv_elements_6_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:757:3: lv_elements_6_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_5_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred24_InternalFractal1425);
        lv_elements_6_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalFractal

    // $ANTLR start synpred26_InternalFractal
    public final void synpred26_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ProvidedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:816:2: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:816:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred26_InternalFractal1556);
        this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalFractal

    // $ANTLR start synpred42_InternalFractal
    public final void synpred42_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1415:3: (lv_elements_2_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1415:3: lv_elements_2_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred42_InternalFractal2780);
        lv_elements_2_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalFractal

    // $ANTLR start synpred43_InternalFractal
    public final void synpred43_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1430:8: (lv_elements_2_2= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1430:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred43_InternalFractal2799);
        lv_elements_2_2=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalFractal

    // $ANTLR start synpred44_InternalFractal
    public final void synpred44_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1445:8: (lv_elements_2_3= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1445:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred44_InternalFractal2818);
        lv_elements_2_3=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalFractal

    // $ANTLR start synpred46_InternalFractal
    public final void synpred46_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1525:3: (lv_elements_2_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1525:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred46_InternalFractal2990);
        lv_elements_2_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalFractal

    // $ANTLR start synpred47_InternalFractal
    public final void synpred47_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1540:8: (lv_elements_2_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1540:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred47_InternalFractal3009);
        lv_elements_2_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalFractal

    // $ANTLR start synpred48_InternalFractal
    public final void synpred48_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1555:8: (lv_elements_2_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1555:8: lv_elements_2_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred48_InternalFractal3028);
        lv_elements_2_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalFractal

    // $ANTLR start synpred49_InternalFractal
    public final void synpred49_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1570:8: (lv_elements_2_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1570:8: lv_elements_2_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred49_InternalFractal3047);
        lv_elements_2_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalFractal

    // $ANTLR start synpred51_InternalFractal
    public final void synpred51_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1631:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1631:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred51_InternalFractal3180);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalFractal

    // $ANTLR start synpred52_InternalFractal
    public final void synpred52_InternalFractal_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1644:2: (this_SubComponentDefinition_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1644:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred52_InternalFractal3210);
        this_SubComponentDefinition_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalFractal

    // $ANTLR start synpred53_InternalFractal
    public final void synpred53_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1690:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1690:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred53_InternalFractal3335);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalFractal

    // $ANTLR start synpred54_InternalFractal
    public final void synpred54_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ImplementationDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1703:2: (this_ImplementationDefinition_1= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1703:2: this_ImplementationDefinition_1= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred54_InternalFractal3365);
        this_ImplementationDefinition_1=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalFractal

    // $ANTLR start synpred55_InternalFractal
    public final void synpred55_InternalFractal_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:2: (this_AttributeDefinition_2= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:2: this_AttributeDefinition_2= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred55_InternalFractal3395);
        this_AttributeDefinition_2=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalFractal

    // Delegated rules

    public final boolean synpred46_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x0010000000712000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImportDefinition406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition440 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard547 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinition618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeDefinition664 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeDefinition677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698 = new BitSet(new long[]{0x0000000240060000L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeDefinition719 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition741 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeDefinition755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition782 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeDefinition796 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeDefinition819 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition838 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition857 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeDefinition873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveDefinition965 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveDefinition984 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition1010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1031 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1052 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveDefinition1066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1093 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveDefinition1107 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1130 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1149 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1168 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1187 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1206 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveDefinition1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleTypeDefinition1314 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1348 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDefinition1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1388 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTypeDefinition1402 = new BitSet(new long[]{0x0010000008880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1425 = new BitSet(new long[]{0x0010000008880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1444 = new BitSet(new long[]{0x0010000008880000L});
    public static final BitSet FOLLOW_19_in_ruleTypeDefinition1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition1677 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProvidedInterfaceDefinition1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1736 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProvidedInterfaceDefinition1748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1765 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleProvidedInterfaceDefinition1789 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition1819 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProvidedInterfaceDefinition1837 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvidedInterfaceDefinition1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition1887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition1943 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRequiredInterfaceDefinition1962 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleRequiredInterfaceDefinition1993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRequiredInterfaceDefinition2046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2063 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleRequiredInterfaceDefinition2087 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2117 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRequiredInterfaceDefinition2135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRequiredInterfaceDefinition2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2241 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSubComponentDefinition2254 = new BitSet(new long[]{0x0000000241000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2281 = new BitSet(new long[]{0x0000000241000000L});
    public static final BitSet FOLLOW_30_in_ruleSubComponentDefinition2295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2316 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleSubComponentDefinition2329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2350 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition2364 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_33_in_ruleSubComponentDefinition2379 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2400 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleSubComponentDefinition2413 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2434 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleSubComponentDefinition2448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubComponentDefinition2462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2479 = new BitSet(new long[]{0x0000000000214000L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2505 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSubComponentDefinition2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentBody2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubComponentCompositeBody2732 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentCompositeBody2757 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2780 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2799 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody2818 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody2837 = new BitSet(new long[]{0x0010000828880000L});
    public static final BitSet FOLLOW_19_in_ruleSubComponentCompositeBody2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentPrimitiveBody2942 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentPrimitiveBody2967 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody2990 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody3009 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody3028 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody3047 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody3066 = new BitSet(new long[]{0x0017000008880000L});
    public static final BitSet FOLLOW_19_in_ruleSubComponentPrimitiveBody3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3516 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition3529 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3542 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3572 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3609 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_25_in_ruleBindingDefinition3622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3639 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBindingDefinition3656 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBindingDefinition3670 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3683 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3713 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3750 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleBindingDefinition3763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3780 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBindingDefinition3797 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBindingDefinition3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList3938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormalArgumentsList3985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4006 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleFormalArgumentsList4019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4040 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleFormalArgumentsList4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier4142 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTemplateSpecifier4159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList4222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTemplateSpecifiersList4269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4291 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleTemplateSpecifiersList4304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4325 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_ruleTemplateSpecifiersList4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType4377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttributeType4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttributeType4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttributeType4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulesignedINT4581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44_in_rulesignedINT4600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHexadecimalType4712 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValue4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition5033 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTemplateDefinition5050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5168 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleArgumentDefinition5185 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5300 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleAttributeDefinition5313 = new BitSet(new long[]{0x0000070000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5352 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttributeDefinition5370 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5485 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleImplementationDefinition5498 = new BitSet(new long[]{0x0008002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5520 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5547 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplementationDefinition5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5652 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleDataDefinition5665 = new BitSet(new long[]{0x0008002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5714 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataDefinition5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5815 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName5834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5849 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC5952 = new BitSet(new long[]{0x0008002000000110L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath6102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37_in_rulePath6178 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_51_in_rulePath6197 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6215 = new BitSet(new long[]{0x0008000000000110L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6237 = new BitSet(new long[]{0x0000100000000110L});
    public static final BitSet FOLLOW_44_in_rulePath6256 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_51_in_rulePath6279 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6394 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleFileName6413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6531 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6552 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAnnotation6636 = new BitSet(new long[]{0x01E0000000000010L});
    public static final BitSet FOLLOW_53_in_ruleAnnotation6656 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_54_in_ruleAnnotation6685 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_55_in_ruleAnnotation6714 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_56_in_ruleAnnotation6743 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation6775 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation6791 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6812 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleAnnotation6825 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6846 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleAnnotation6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement6951 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAnnotationElement6968 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer7229 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7250 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleElementValueArrayInitializer7263 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7284 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleElementValueArrayInitializer7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_synpred2_InternalFractal255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_synpred3_InternalFractal285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred10_InternalFractal819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred11_InternalFractal838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred17_InternalFractal1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred18_InternalFractal1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred19_InternalFractal1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred20_InternalFractal1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred24_InternalFractal1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred26_InternalFractal1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred42_InternalFractal2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred43_InternalFractal2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred44_InternalFractal2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred46_InternalFractal2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred47_InternalFractal3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred48_InternalFractal3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred49_InternalFractal3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred51_InternalFractal3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred52_InternalFractal3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred53_InternalFractal3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred54_InternalFractal3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred55_InternalFractal3395 = new BitSet(new long[]{0x0000000000000002L});

}