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

                if ( (LA1_0==13) ) {
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:198:1: ruleImportDefinition returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:201:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImportDefinition397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDefinitionAccess().getImportKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:206:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:207:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:207:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:208:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition418);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleImportDefinition430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_2());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:236:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:237:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:238:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard467);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard478); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:245:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:248:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:249:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:249:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:250:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard525);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:260:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:261:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard544); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:274:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:275:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:276:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition586);
            iv_ruleCompositeDefinition=ruleCompositeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinition596); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:283:1: ruleCompositeDefinition returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_templateSpecifiersList_2_0 = null;

        EObject lv_compositeFormalArgumentsList_3_0 = null;

        EObject lv_elements_7_1 = null;

        EObject lv_elements_7_2 = null;

        EObject lv_elements_7_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:286:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:287:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:287:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:287:3: otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleCompositeDefinition633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:291:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:292:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:292:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:293:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition654);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:309:2: ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:1: (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:1: (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:311:3: lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeDefinition675);
                    lv_templateSpecifiersList_2_0=ruleTemplateSpecifiersList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"templateSpecifiersList",
                              		lv_templateSpecifiersList_2_0, 
                              		"TemplateSpecifiersList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:327:3: ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:329:3: lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition697);
                    lv_compositeFormalArgumentsList_3_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_3_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:5: otherlv_4= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleCompositeDefinition711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:351:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypeArchitectureDefinitionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition738);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDefinition752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:371:1: ( ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||LA8_0==27||LA8_0==29||LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: ( (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:373:1: (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:373:1: (lv_elements_7_1= ruleHostedInterfaceDefinition | lv_elements_7_2= ruleSubComponentDefinition | lv_elements_7_3= ruleBindingDefinition )
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	    case 27:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:374:3: lv_elements_7_1= ruleHostedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsHostedInterfaceDefinitionParserRuleCall_6_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeDefinition775);
            	            lv_elements_7_1=ruleHostedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_1, 
            	                      		"HostedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:389:8: lv_elements_7_2= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_6_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition794);
            	            lv_elements_7_2=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_2, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:404:8: lv_elements_7_3= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_6_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition813);
            	            lv_elements_7_3=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_3, 
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
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCompositeDefinition829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:434:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:435:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:436:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition865);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition875); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:443:1: rulePrimitiveDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) ) )* otherlv_8= '}' ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_compositeFormalArgumentsList_3_0 = null;

        EObject lv_elements_7_1 = null;

        EObject lv_elements_7_2 = null;

        EObject lv_elements_7_3 = null;

        EObject lv_elements_7_4 = null;

        EObject lv_elements_7_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:446:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:447:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:447:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:447:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) ) )* otherlv_8= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:447:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:448:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:448:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:449:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,20,FOLLOW_20_in_rulePrimitiveDefinition918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_0_0, grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_0_0());
                          
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:466:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:467:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:467:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:468:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition965);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:484:2: ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:485:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:485:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:486:3: lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition986);
                    lv_compositeFormalArgumentsList_3_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_3_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:502:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:502:5: otherlv_4= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePrimitiveDefinition1000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:506:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:507:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:507:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:508:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypeArchitectureDefinitionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1027);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePrimitiveDefinition1041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:528:1: ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23||LA13_0==27||(LA13_0>=48 && LA13_0<=50)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:529:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:529:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:530:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:530:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleImplementationDefinition | lv_elements_7_4= ruleAttributeDefinition | lv_elements_7_5= ruleDataDefinition )
            	    int alt12=5;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:531:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1064);
            	            lv_elements_7_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:546:8: lv_elements_7_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1083);
            	            lv_elements_7_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:561:8: lv_elements_7_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_6_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1102);
            	            lv_elements_7_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:576:8: lv_elements_7_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_6_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1121);
            	            lv_elements_7_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:591:8: lv_elements_7_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_6_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1140);
            	            lv_elements_7_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_5, 
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
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrimitiveDefinition1156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:621:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:622:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:623:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1192);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1202); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:630:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_5_1 = null;

        EObject lv_elements_5_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:633:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_6= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:634:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_6= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:634:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_6= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:634:3: otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:638:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:639:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:639:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:640:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1260);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTypeDefinition1273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:660:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:662:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypeArchitectureDefinitionCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1300);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTypeDefinition1314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:682:1: ( ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:683:1: ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:683:1: ( (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:684:1: (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:684:1: (lv_elements_5_1= ruleProvidedInterfaceDefinition | lv_elements_5_2= ruleRequiredInterfaceDefinition )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==23) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==27) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:685:3: lv_elements_5_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1337);
            	            lv_elements_5_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_5_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:700:8: lv_elements_5_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1356);
            	            lv_elements_5_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_5_2, 
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
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTypeDefinition1372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTypeDefinitionAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:730:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:731:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:732:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1408);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1418); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:739:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:742:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:743:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:743:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:744:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1468);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:757:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1498);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:776:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:777:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:778:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1533);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1543); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:785:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_role_0_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']' )? otherlv_7= ';' ) ;
    public final EObject ruleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_collection_4_0=null;
        Token lv_collectionsize_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:788:28: ( ( ( (lv_role_0_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']' )? otherlv_7= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:789:1: ( ( (lv_role_0_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']' )? otherlv_7= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:789:1: ( ( (lv_role_0_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']' )? otherlv_7= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:789:2: ( (lv_role_0_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']' )? otherlv_7= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:789:2: ( (lv_role_0_0= 'provides' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:790:1: (lv_role_0_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:790:1: (lv_role_0_0= 'provides' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:791:3: lv_role_0_0= 'provides'
            {
            lv_role_0_0=(Token)match(input,23,FOLLOW_23_in_ruleProvidedInterfaceDefinition1586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_0_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getRoleProvidesKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_0_0, "provides");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:804:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:805:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:805:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:806:3: ruleQualifiedName
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
               
              	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1626);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleProvidedInterfaceDefinition1638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:826:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:827:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:827:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:828:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:844:2: ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:844:3: ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? otherlv_6= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:844:3: ( (lv_collection_4_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:845:1: (lv_collection_4_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:845:1: (lv_collection_4_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:846:3: lv_collection_4_0= '['
                    {
                    lv_collection_4_0=(Token)match(input,25,FOLLOW_25_in_ruleProvidedInterfaceDefinition1679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_4_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:859:2: ( (lv_collectionsize_5_0= RULE_INT ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_INT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:860:1: (lv_collectionsize_5_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:860:1: (lv_collectionsize_5_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:861:3: lv_collectionsize_5_0= RULE_INT
                            {
                            lv_collectionsize_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition1709); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_5_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_5_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleProvidedInterfaceDefinition1727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleProvidedInterfaceDefinition1741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getSemicolonKeyword_5());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:893:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:894:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:895:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition1777);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition1787); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:902:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_role_0_0= 'requires' ) ) ( (lv_optional_1_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:905:28: ( ( ( (lv_role_0_0= 'requires' ) ) ( (lv_optional_1_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:906:1: ( ( (lv_role_0_0= 'requires' ) ) ( (lv_optional_1_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:906:1: ( ( (lv_role_0_0= 'requires' ) ) ( (lv_optional_1_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:906:2: ( (lv_role_0_0= 'requires' ) ) ( (lv_optional_1_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:906:2: ( (lv_role_0_0= 'requires' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:907:1: (lv_role_0_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:907:1: (lv_role_0_0= 'requires' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:908:3: lv_role_0_0= 'requires'
            {
            lv_role_0_0=(Token)match(input,27,FOLLOW_27_in_ruleRequiredInterfaceDefinition1830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_0_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getRoleRequiresKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_0_0, "requires");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:921:2: ( (lv_optional_1_0= 'optional' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:922:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:922:1: (lv_optional_1_0= 'optional' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:923:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,28,FOLLOW_28_in_ruleRequiredInterfaceDefinition1861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_1_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getOptionalOptionalKeyword_1_0());
                          
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:937:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:937:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:938:3: ruleQualifiedName
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
               
              	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition1902);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleRequiredInterfaceDefinition1914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:958:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:959:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:959:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:960:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition1931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:976:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:976:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:976:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:977:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:977:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:978:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,25,FOLLOW_25_in_ruleRequiredInterfaceDefinition1955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_5_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_INT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:992:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:992:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:993:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition1985); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_6_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
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

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleRequiredInterfaceDefinition2003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleRequiredInterfaceDefinition2017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getSemicolonKeyword_6());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1026:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1027:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2053);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2063); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1034:1: ruleSubComponentDefinition returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) )? (otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>' )? (otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')' )? otherlv_12= 'as' ( (lv_name_13_0= RULE_ID ) ) ( (lv_body_14_0= ruleSubComponentBody ) )? otherlv_15= ';' ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_15=null;
        EObject lv_templatesList_3_0 = null;

        EObject lv_templatesList_5_0 = null;

        EObject lv_argumentsList_8_0 = null;

        EObject lv_argumentsList_10_0 = null;

        EObject lv_body_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1037:28: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) )? (otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>' )? (otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')' )? otherlv_12= 'as' ( (lv_name_13_0= RULE_ID ) ) ( (lv_body_14_0= ruleSubComponentBody ) )? otherlv_15= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1038:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) )? (otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>' )? (otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')' )? otherlv_12= 'as' ( (lv_name_13_0= RULE_ID ) ) ( (lv_body_14_0= ruleSubComponentBody ) )? otherlv_15= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1038:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) )? (otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>' )? (otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')' )? otherlv_12= 'as' ( (lv_name_13_0= RULE_ID ) ) ( (lv_body_14_0= ruleSubComponentBody ) )? otherlv_15= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1038:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) )? (otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>' )? (otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')' )? otherlv_12= 'as' ( (lv_name_13_0= RULE_ID ) ) ( (lv_body_14_0= ruleSubComponentBody ) )? otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSubComponentDefinition2100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1042:1: ( ( ruleQualifiedName ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1043:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1043:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1044:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTypeArchitectureDefinitionCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2127);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1060:3: (otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1060:5: otherlv_2= '<' ( (lv_templatesList_3_0= ruleTemplateDefinition ) ) (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSubComponentDefinition2141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1064:1: ( (lv_templatesList_3_0= ruleTemplateDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1065:1: (lv_templatesList_3_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1065:1: (lv_templatesList_3_0= ruleTemplateDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1066:3: lv_templatesList_3_0= ruleTemplateDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2162);
                    lv_templatesList_3_0=ruleTemplateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_3_0, 
                              		"TemplateDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1082:2: (otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==31) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1082:4: otherlv_4= ',' ( (lv_templatesList_5_0= ruleTemplateDefinition ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleSubComponentDefinition2175); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1086:1: ( (lv_templatesList_5_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1087:1: (lv_templatesList_5_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1087:1: (lv_templatesList_5_0= ruleTemplateDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1088:3: lv_templatesList_5_0= ruleTemplateDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2196);
                    	    lv_templatesList_5_0=ruleTemplateDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templatesList",
                    	              		lv_templatesList_5_0, 
                    	              		"TemplateDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition2210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1108:3: (otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1108:5: otherlv_7= '(' ( (lv_argumentsList_8_0= ruleArgumentDefinition ) ) (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleSubComponentDefinition2225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1112:1: ( (lv_argumentsList_8_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1113:1: (lv_argumentsList_8_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1113:1: (lv_argumentsList_8_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1114:3: lv_argumentsList_8_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2246);
                    lv_argumentsList_8_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_8_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1130:2: (otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==31) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1130:4: otherlv_9= ',' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleSubComponentDefinition2259); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1134:1: ( (lv_argumentsList_10_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1135:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1135:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1136:3: lv_argumentsList_10_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2280);
                    	    lv_argumentsList_10_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_10_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleSubComponentDefinition2294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleSubComponentDefinition2308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1160:1: ( (lv_name_13_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1161:1: (lv_name_13_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1161:1: (lv_name_13_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1162:3: lv_name_13_0= RULE_ID
            {
            lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition2325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_13_0, grammarAccess.getSubComponentDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_13_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1178:2: ( (lv_body_14_0= ruleSubComponentBody ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16||LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1179:1: (lv_body_14_0= ruleSubComponentBody )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1179:1: (lv_body_14_0= ruleSubComponentBody )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1180:3: lv_body_14_0= ruleSubComponentBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentBodyParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2351);
                    lv_body_14_0=ruleSubComponentBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_14_0, 
                              		"SubComponentBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleSubComponentDefinition2364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getSubComponentDefinitionAccess().getSemicolonKeyword_7());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1208:1: entryRuleSubComponentBody returns [EObject current=null] : iv_ruleSubComponentBody= ruleSubComponentBody EOF ;
    public final EObject entryRuleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1209:2: (iv_ruleSubComponentBody= ruleSubComponentBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1210:2: iv_ruleSubComponentBody= ruleSubComponentBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2400);
            iv_ruleSubComponentBody=ruleSubComponentBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentBody2410); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1217:1: ruleSubComponentBody returns [EObject current=null] : (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) ;
    public final EObject ruleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentCompositeBody_0 = null;

        EObject this_SubComponentPrimitiveBody_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1220:28: ( (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1221:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1221:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            else if ( (LA29_0==21) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1222:2: this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentCompositeBodyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2460);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1235:2: this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentPrimitiveBodyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2490);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1254:1: entryRuleSubComponentCompositeBody returns [EObject current=null] : iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF ;
    public final EObject entryRuleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1255:2: (iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1256:2: iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentCompositeBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2525);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2535); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1263:1: ruleSubComponentCompositeBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1266:28: ( ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:2: ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:2: ( (lv_anonymous_0_0= 'composite' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1268:1: (lv_anonymous_0_0= 'composite' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1268:1: (lv_anonymous_0_0= 'composite' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1269:3: lv_anonymous_0_0= 'composite'
            {
            lv_anonymous_0_0=(Token)match(input,16,FOLLOW_16_in_ruleSubComponentCompositeBody2578); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentCompositeBody2603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1286:1: ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23||LA31_0==27||LA31_0==29||LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1287:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1287:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1288:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1288:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    int alt30=4;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt30=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1289:3: lv_elements_2_1= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2626);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1304:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2645);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1319:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody2664);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1334:8: lv_elements_2_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsBindingDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody2683);
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
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSubComponentCompositeBody2699); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1364:1: entryRuleSubComponentPrimitiveBody returns [EObject current=null] : iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF ;
    public final EObject entryRuleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentPrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1365:2: (iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1366:2: iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2735);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2745); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1373:1: ruleSubComponentPrimitiveBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1376:28: ( ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1377:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1377:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1377:2: ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1377:2: ( (lv_anonymous_0_0= 'primitive' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1378:1: (lv_anonymous_0_0= 'primitive' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1378:1: (lv_anonymous_0_0= 'primitive' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1379:3: lv_anonymous_0_0= 'primitive'
            {
            lv_anonymous_0_0=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentPrimitiveBody2788); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentPrimitiveBody2813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1396:1: ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23||LA33_0==27||(LA33_0>=48 && LA33_0<=50)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1397:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1397:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1398:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1398:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    int alt32=5;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt32=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt32=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1399:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody2836);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1414:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody2855);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1429:8: lv_elements_2_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody2874);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1444:8: lv_elements_2_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody2893);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1459:8: lv_elements_2_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsDataDefinitionParserRuleCall_2_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody2912);
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
            	    break loop33;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSubComponentPrimitiveBody2928); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1493:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement2966);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement2976); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1500:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1503:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1504:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1504:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 23:
            case 27:
                {
                alt34=1;
                }
                break;
            case 29:
                {
                alt34=2;
                }
                break;
            case 35:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1505:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3026);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1518:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3056);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1531:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3086);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1550:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1551:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1552:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3121);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement3131); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1559:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1562:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1563:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1563:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 23:
            case 27:
                {
                alt35=1;
                }
                break;
            case 49:
                {
                alt35=2;
                }
                break;
            case 48:
                {
                alt35=3;
                }
                break;
            case 50:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1564:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3181);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1577:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3211);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1590:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3241);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1603:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3271);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1622:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1623:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1624:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3306);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition3316); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1631:1: ruleBindingDefinition returns [EObject current=null] : (otherlv_0= 'binds' (otherlv_1= 'this' | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? otherlv_8= 'to' (otherlv_9= 'this' | ( (otherlv_10= RULE_ID ) ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']' )? otherlv_16= ';' ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_sourceIndex_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_targetIndex_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1634:28: ( (otherlv_0= 'binds' (otherlv_1= 'this' | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? otherlv_8= 'to' (otherlv_9= 'this' | ( (otherlv_10= RULE_ID ) ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']' )? otherlv_16= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1635:1: (otherlv_0= 'binds' (otherlv_1= 'this' | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? otherlv_8= 'to' (otherlv_9= 'this' | ( (otherlv_10= RULE_ID ) ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']' )? otherlv_16= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1635:1: (otherlv_0= 'binds' (otherlv_1= 'this' | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? otherlv_8= 'to' (otherlv_9= 'this' | ( (otherlv_10= RULE_ID ) ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']' )? otherlv_16= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1635:3: otherlv_0= 'binds' (otherlv_1= 'this' | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? otherlv_8= 'to' (otherlv_9= 'this' | ( (otherlv_10= RULE_ID ) ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']' )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleBindingDefinition3353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1639:1: (otherlv_1= 'this' | ( (otherlv_2= RULE_ID ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1639:3: otherlv_1= 'this'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1644:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1644:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1645:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1645:1: (otherlv_2= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1646:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1664:1: ( (otherlv_4= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1665:1: (otherlv_4= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1665:1: (otherlv_4= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1666:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceRequiredInterfaceDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1680:2: (otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1680:4: otherlv_5= '[' ( (lv_sourceIndex_6_0= RULE_INT ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleBindingDefinition3446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1684:1: ( (lv_sourceIndex_6_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1685:1: (lv_sourceIndex_6_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1685:1: (lv_sourceIndex_6_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1686:3: lv_sourceIndex_6_0= RULE_INT
                    {
                    lv_sourceIndex_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sourceIndex_6_0, grammarAccess.getBindingDefinitionAccess().getSourceIndexINTTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sourceIndex",
                              		lv_sourceIndex_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleBindingDefinition3480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleBindingDefinition3494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getToKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1710:1: (otherlv_9= 'this' | ( (otherlv_10= RULE_ID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1710:3: otherlv_9= 'this'
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getThisKeyword_6_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1715:6: ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1715:6: ( (otherlv_10= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:1: (otherlv_10= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1717:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_6_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_7());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1735:1: ( (otherlv_12= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1736:1: (otherlv_12= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1736:1: (otherlv_12= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1737:3: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceProvidedInterfaceDefinitionCrossReference_8_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1751:2: (otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1751:4: otherlv_13= '[' ( (lv_targetIndex_14_0= RULE_INT ) ) otherlv_15= ']'
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleBindingDefinition3587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_9_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1755:1: ( (lv_targetIndex_14_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1756:1: (lv_targetIndex_14_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1756:1: (lv_targetIndex_14_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1757:3: lv_targetIndex_14_0= RULE_INT
                    {
                    lv_targetIndex_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_targetIndex_14_0, grammarAccess.getBindingDefinitionAccess().getTargetIndexINTTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"targetIndex",
                              		lv_targetIndex_14_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleBindingDefinition3621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_9_2());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleBindingDefinition3635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getSemicolonKeyword_10());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1789:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1790:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1791:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3671);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument3681); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1798:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1801:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1802:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1802:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1803:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1803:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1804:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument3722); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1828:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1829:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1830:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList3762);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList3772); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1837:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1840:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1841:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1841:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1841:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFormalArgumentsList3809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1845:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1846:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1846:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1847:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList3830);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1863:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==31) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1863:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleFormalArgumentsList3843); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1867:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1868:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1868:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1869:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList3864);
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
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleFormalArgumentsList3878); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1897:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier3914);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier3924); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1906:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1909:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1910:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1910:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1910:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1910:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1911:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1911:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1912:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier3966); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleTemplateSpecifier3983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1932:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1933:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1933:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1934:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4010);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1958:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1959:2: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1960:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifiersListRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList4046);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList4056); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1967:1: ruleTemplateSpecifiersList returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_templateSpecifiers_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1970:28: ( (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1971:1: (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1971:1: (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1971:3: otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTemplateSpecifiersList4093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1975:1: ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1975:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1975:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1976:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1976:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1977:3: lv_templateSpecifiers_1_0= ruleTemplateSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4115);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1993:2: (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==31) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1993:4: otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleTemplateSpecifiersList4128); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1997:1: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1998:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1998:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1999:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4149);
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
            	    break loop41;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleTemplateSpecifiersList4164); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2027:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2028:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2029:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType4201);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType4212); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2036:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2039:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2040:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2040:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt42=1;
                }
                break;
            case 41:
                {
                alt42=2;
                }
                break;
            case 42:
                {
                alt42=3;
                }
                break;
            case RULE_ID:
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2041:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleAttributeType4250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2048:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeType4269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeType4288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2061:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType4309); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2076:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2077:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2078:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT4355);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT4366); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2085:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2088:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2089:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2089:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2089:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2089:2: (kw= '+' | kw= '-' )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            else if ( (LA43_0==44) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2090:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulesignedINT4405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2097:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulesignedINT4424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT4441); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2117:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2118:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2119:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexadecimalTypeRule()); 
            }
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4487);
            iv_ruleHexadecimalType=ruleHexadecimalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType4498); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2126:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2129:28: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2130:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2130:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2131:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleHexadecimalType4536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHexadecimalTypeAccess().getXKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType4551); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2151:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2152:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2153:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4597);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4608); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2160:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2163:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2164:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2164:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt44=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt44=1;
                }
                break;
            case RULE_INT:
            case 43:
            case 44:
                {
                alt44=2;
                }
                break;
            case 45:
                {
                alt44=3;
                }
                break;
            case RULE_STRING:
                {
                alt44=4;
                }
                break;
            case 46:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2164:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2173:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue4681);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2185:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue4714);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2196:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2205:2: kw= 'null'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValue4764); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2218:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2219:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2220:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4804);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition4814); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2230:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==47) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2232:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2232:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition4857); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleTemplateDefinition4874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2253:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2254:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2254:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2255:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition4903);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2279:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2280:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2281:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4939);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition4949); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2288:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2291:28: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==47) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:3: ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2293:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2293:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2294:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition4992); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleArgumentDefinition5009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2314:3: ( (lv_argumentValue_2_0= ruleValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2315:1: (lv_argumentValue_2_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2315:1: (lv_argumentValue_2_0= ruleValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2316:3: lv_argumentValue_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5032);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2340:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2341:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2342:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5068);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5078); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2349:1: ruleAttributeDefinition returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributeName_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2352:28: ( (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2353:1: (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2353:1: (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2353:3: otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleAttributeDefinition5115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2357:1: ( (lv_type_1_0= ruleAttributeType ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=40 && LA47_0<=42)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_ID) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2358:1: (lv_type_1_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2358:1: (lv_type_1_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2359:3: lv_type_1_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5136);
                    lv_type_1_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"AttributeType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:3: ( (lv_attributeName_2_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2376:1: (lv_attributeName_2_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2376:1: (lv_attributeName_2_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2377:3: lv_attributeName_2_0= RULE_ID
            {
            lv_attributeName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_attributeName_2_0, grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"attributeName",
                      		lv_attributeName_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2393:2: (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2393:4: otherlv_3= '=' ( (lv_value_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleAttributeDefinition5172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2397:1: ( (lv_value_4_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2398:1: (lv_value_4_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2398:1: (lv_value_4_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2399:3: lv_value_4_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5193);
                    lv_value_4_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2423:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2424:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2425:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5231);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5241); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2432:1: ruleImplementationDefinition returns [EObject current=null] : (otherlv_0= 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fileC_1_0 = null;

        EObject lv_inlineCcode_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2435:28: ( (otherlv_0= 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:1: (otherlv_0= 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:1: (otherlv_0= 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2436:3: otherlv_0= 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleImplementationDefinition5278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2440:1: ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==RULE_SL||LA49_0==37||LA49_0==51) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_CODE_C) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2440:2: ( (lv_fileC_1_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2440:2: ( (lv_fileC_1_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2441:1: (lv_fileC_1_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2441:1: (lv_fileC_1_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2442:3: lv_fileC_1_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5300);
                    lv_fileC_1_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_1_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2459:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2459:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2460:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2460:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2461:3: lv_inlineCcode_2_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5327);
                    lv_inlineCcode_2_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_2_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImplementationDefinition5340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImplementationDefinitionAccess().getSemicolonKeyword_2());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2489:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2490:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2491:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5376);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5386); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2498:1: ruleDataDefinition returns [EObject current=null] : (otherlv_0= 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fileC_1_0 = null;

        EObject lv_inlineCcode_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2501:28: ( (otherlv_0= 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2502:1: (otherlv_0= 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2502:1: (otherlv_0= 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2502:3: otherlv_0= 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleDataDefinition5423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataDefinitionAccess().getDataKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2506:1: ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==RULE_SL||LA50_0==37||LA50_0==51) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_CODE_C) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2506:2: ( (lv_fileC_1_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2506:2: ( (lv_fileC_1_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2507:1: (lv_fileC_1_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2507:1: (lv_fileC_1_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2508:3: lv_fileC_1_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition5445);
                    lv_fileC_1_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_1_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2525:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2525:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2526:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2526:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2527:3: lv_inlineCcode_2_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5472);
                    lv_inlineCcode_2_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_2_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDataDefinition5485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataDefinitionAccess().getSemicolonKeyword_2());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2555:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2556:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2557:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5522);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5533); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2564:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2567:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2568:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2568:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2568:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2575:1: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==37) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2576:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName5592); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5607); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2596:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2597:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2598:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC5654);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC5664); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2605:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2608:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2609:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2609:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2609:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2609:2: ( (lv_directory_0_0= rulePath ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_SL) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==RULE_SL||LA52_0==37||LA52_0==51) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2610:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2610:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2611:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFileC5710);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2627:3: ( (lv_name_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2628:1: (lv_name_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2628:1: (lv_name_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2629:3: lv_name_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC5732);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2654:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2655:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5768);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC5778); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2662:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2665:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2666:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2666:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2667:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2667:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2668:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC5819); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2692:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2693:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2694:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath5860);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath5871); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2701:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_3=null;
        Token this_ID_4=null;
        Token this_SL_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2704:28: ( ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )?
            int alt53=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt53=1;
                    }
                    break;
                case 37:
                    {
                    alt53=2;
                    }
                    break;
                case 51:
                    {
                    alt53=3;
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2705:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath5912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2714:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePath5936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2721:2: kw= '..'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePath5955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2726:3: (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_SL) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==RULE_ID) ) {
                        int LA57_2 = input.LA(3);

                        if ( (LA57_2==RULE_ID||LA57_2==RULE_SL||LA57_2==44) ) {
                            alt57=1;
                        }


                    }
                    else if ( (LA57_1==RULE_SL||LA57_1==51) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2726:8: this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_3=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath5973); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_3, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:1: ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==RULE_ID||LA56_0==RULE_SL) ) {
            	        alt56=1;
            	    }
            	    else if ( (LA56_0==51) ) {
            	        alt56=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 56, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==RULE_ID) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:7: this_ID_4= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath5995); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_4);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_4, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2740:1: (kw= '-' )?
            	            	    int alt54=2;
            	            	    int LA54_0 = input.LA(1);

            	            	    if ( (LA54_0==44) ) {
            	            	        alt54=1;
            	            	    }
            	            	    switch (alt54) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,44,FOLLOW_44_in_rulePath6014); if (state.failed) return current;
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
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2748:2: kw= '..'
            	            {
            	            kw=(Token)match(input,51,FOLLOW_51_in_rulePath6037); if (state.failed) return current;
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
            	    break loop57;
                }
            } while (true);

            this_SL_7=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6055); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2768:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2769:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2770:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6101);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6112); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2777:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2780:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2781:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2781:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2781:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2788:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2789:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleFileName6171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6186); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2811:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2812:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2813:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6235);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6245); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2820:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2823:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2824:1: (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2824:1: (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2824:3: otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleAnnotation6282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2828:1: ( (lv_name_1_0= ruleAnnotationType ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2829:1: (lv_name_1_0= ruleAnnotationType )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2829:1: (lv_name_1_0= ruleAnnotationType )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2830:3: lv_name_1_0= ruleAnnotationType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnotation6303);
            lv_name_1_0=ruleAnnotationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"AnnotationType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2846:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==33) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2846:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation6316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2850:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2851:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2851:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2852:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6337);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2868:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==31) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2868:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleAnnotation6350); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2872:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2873:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2873:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2874:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6371);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleAnnotation6385); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnnotationType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2902:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType6424);
            iv_ruleAnnotationType=ruleAnnotationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType6435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationType"


    // $ANTLR start "ruleAnnotationType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2911:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_QualifiedName_4= ruleQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2914:28: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_QualifiedName_4= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2915:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_QualifiedName_4= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2915:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_QualifiedName_4= ruleQualifiedName )
            int alt61=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt61=1;
                }
                break;
            case 54:
                {
                alt61=2;
                }
                break;
            case 55:
                {
                alt61=3;
                }
                break;
            case 56:
                {
                alt61=4;
                }
                break;
            case RULE_ID:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2916:2: kw= 'Override'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleAnnotationType6473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2923:2: kw= 'Singleton'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleAnnotationType6492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2930:2: kw= 'LDFlags'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleAnnotationType6511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2937:2: kw= 'CFlags'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleAnnotationType6530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2944:5: this_QualifiedName_4= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationTypeAccess().getQualifiedNameParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotationType6558);
                    this_QualifiedName_4=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QualifiedName_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleAnnotationType"


    // $ANTLR start "entryRuleAnnotationElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2962:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2963:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2964:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6603);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement6613); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2971:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2974:28: ( ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:3: ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2975:3: ( (lv_elementName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2976:1: (lv_elementName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2976:1: (lv_elementName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2977:3: lv_elementName_0_0= RULE_ID
                    {
                    lv_elementName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement6656); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleAnnotationElement6673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2997:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2998:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2998:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2999:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement6696);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3023:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3024:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3025:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue6732);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue6742); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3032:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3035:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3036:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3036:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt63=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt63=1;
                }
                break;
            case 52:
                {
                alt63=2;
                }
                break;
            case 18:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3037:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue6792);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3050:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue6822);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3063:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6852);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3082:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3083:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3084:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6887);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6897); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3091:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3094:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3095:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3095:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3095:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer6934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3099:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3100:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3100:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3101:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6955);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3117:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==31) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3117:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleElementValueArrayInitializer6968); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3121:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3122:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3122:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3123:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6989);
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
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleElementValueArrayInitializer7003); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3151:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3152:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3153:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7039);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7049); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3160:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3163:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3164:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3164:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3165:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3165:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7094);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3190:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3191:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3192:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7130);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7141); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3199:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3202:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3203:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3203:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_STRING) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3203:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3211:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7207); if (state.failed) return current;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x0000000000712000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition418 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard525 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinition596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCompositeDefinition633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition654 = new BitSet(new long[]{0x0000000240060000L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeDefinition675 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition697 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeDefinition711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition738 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeDefinition752 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeDefinition775 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition794 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition813 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeDefinition829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveDefinition918 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition965 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition986 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveDefinition1000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1027 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveDefinition1041 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1064 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1083 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1102 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1121 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1140 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveDefinition1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1260 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDefinition1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1300 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTypeDefinition1314 = new BitSet(new long[]{0x0000000008880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1337 = new BitSet(new long[]{0x0000000008880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1356 = new BitSet(new long[]{0x0000000008880000L});
    public static final BitSet FOLLOW_19_in_ruleTypeDefinition1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleProvidedInterfaceDefinition1586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1626 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProvidedInterfaceDefinition1638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1655 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleProvidedInterfaceDefinition1679 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition1709 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProvidedInterfaceDefinition1727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvidedInterfaceDefinition1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRequiredInterfaceDefinition1830 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleRequiredInterfaceDefinition1861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition1902 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRequiredInterfaceDefinition1914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition1931 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleRequiredInterfaceDefinition1955 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition1985 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRequiredInterfaceDefinition2003 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRequiredInterfaceDefinition2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSubComponentDefinition2100 = new BitSet(new long[]{0x0000000241000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2127 = new BitSet(new long[]{0x0000000241000000L});
    public static final BitSet FOLLOW_30_in_ruleSubComponentDefinition2141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2162 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleSubComponentDefinition2175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2196 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition2210 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_33_in_ruleSubComponentDefinition2225 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2246 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleSubComponentDefinition2259 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2280 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleSubComponentDefinition2294 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubComponentDefinition2308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2325 = new BitSet(new long[]{0x0000000000214000L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2351 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSubComponentDefinition2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentBody2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubComponentCompositeBody2578 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentCompositeBody2603 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2626 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2645 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody2664 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody2683 = new BitSet(new long[]{0x0000000828880000L});
    public static final BitSet FOLLOW_19_in_ruleSubComponentCompositeBody2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentPrimitiveBody2788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentPrimitiveBody2813 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody2836 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody2855 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody2874 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody2893 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody2912 = new BitSet(new long[]{0x0007000008880000L});
    public static final BitSet FOLLOW_19_in_ruleSubComponentPrimitiveBody2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition3353 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3366 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3396 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3433 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_25_in_ruleBindingDefinition3446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3463 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBindingDefinition3480 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBindingDefinition3494 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3507 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3537 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3574 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleBindingDefinition3587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3604 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBindingDefinition3621 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBindingDefinition3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList3762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormalArgumentsList3809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList3830 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleFormalArgumentsList3843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList3864 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleFormalArgumentsList3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier3966 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTemplateSpecifier3983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList4046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTemplateSpecifiersList4093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4115 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleTemplateSpecifiersList4128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList4149 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_ruleTemplateSpecifiersList4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType4201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttributeType4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttributeType4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttributeType4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulesignedINT4405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44_in_rulesignedINT4424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHexadecimalType4536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValue4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4857 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTemplateDefinition4874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition4992 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleArgumentDefinition5009 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttributeDefinition5115 = new BitSet(new long[]{0x0000070000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5154 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttributeDefinition5172 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleImplementationDefinition5278 = new BitSet(new long[]{0x0008002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplementationDefinition5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDataDefinition5423 = new BitSet(new long[]{0x0008002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5445 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5472 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataDefinition5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5573 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName5592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5607 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC5710 = new BitSet(new long[]{0x0008002000000110L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath5860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath5912 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37_in_rulePath5936 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_51_in_rulePath5955 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath5973 = new BitSet(new long[]{0x0008000000000110L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath5995 = new BitSet(new long[]{0x0000100000000110L});
    public static final BitSet FOLLOW_44_in_rulePath6014 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_51_in_rulePath6037 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6152 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleFileName6171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAnnotation6282 = new BitSet(new long[]{0x01E0000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation6303 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation6316 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6337 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleAnnotation6350 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6371 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleAnnotation6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType6424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAnnotationType6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAnnotationType6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAnnotationType6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAnnotationType6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationType6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement6656 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAnnotationElement6673 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue6732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer6934 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6955 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleElementValueArrayInitializer6968 = new BitSet(new long[]{0x0010000000040070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6989 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleElementValueArrayInitializer7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7207 = new BitSet(new long[]{0x0000000000000002L});

}