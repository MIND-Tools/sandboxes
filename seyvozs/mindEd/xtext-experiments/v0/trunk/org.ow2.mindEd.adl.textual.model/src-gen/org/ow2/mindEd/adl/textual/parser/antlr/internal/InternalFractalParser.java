package org.ow2.mindEd.adl.textual.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_CODEC", "RULE_STRING", "RULE_SL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'composite'", "'<'", "','", "'>'", "'('", "')'", "'extends'", "'contains'", "'as'", "'='", "'attribute'", "'optional'", "'['", "']'", "'[]'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'source'", "'conformsto'", "'@'", "'null'", "'0x'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'.*'", "':'", "'..'", "'-'", "'+'", "'provides'", "'requires'"
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
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int RULE_CODEC=6;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
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
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g"; }



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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:74:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:75:2: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:76:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdlDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81);
            iv_ruleAdlDefinition=ruleAdlDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdlDefinition91); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:83:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_architecturedefinition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:28: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:89:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:3: ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:106:1: (lv_architecturedefinition_1_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:106:1: (lv_architecturedefinition_1_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:107:3: lv_architecturedefinition_1_0= ruleArchitectureDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitecturedefinitionArchitectureDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159);
            lv_architecturedefinition_1_0=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"architecturedefinition",
                      		lv_architecturedefinition_1_0, 
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


    // $ANTLR start "entryRuleImportDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:131:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:132:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:133:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition195);
            iv_ruleImportDefinition=ruleImportDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportDefinition205); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:140:1: ruleImportDefinition returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importName_1_1 = null;

        AntlrDatatypeRuleToken lv_importName_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:143:28: ( (otherlv_0= 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) otherlv_2= ';' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:1: (otherlv_0= 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) otherlv_2= ';' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:1: (otherlv_0= 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) otherlv_2= ';' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:3: otherlv_0= 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleImportDefinition242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDefinitionAccess().getImportKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:148:1: ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:149:1: ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:149:1: ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:150:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:150:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:151:3: lv_importName_1_1= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFQNParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleImportDefinition265);
                    lv_importName_1_1=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"importName",
                              		lv_importName_1_1, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:166:8: lv_importName_1_2= ruleFULL_IMPORT_NAME
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFULL_IMPORT_NAMEParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition284);
                    lv_importName_1_2=ruleFULL_IMPORT_NAME();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"importName",
                              		lv_importName_1_2, 
                              		"FULL_IMPORT_NAME");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleImportDefinition299); if (state.failed) return current;
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


    // $ANTLR start "entryRuleArchitectureDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:196:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:197:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:198:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition335);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchitectureDefinition345); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:205:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:208:28: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:209:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:209:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred3_InternalFractal()) ) {
                    alt3=1;
                }
                else if ( (synpred4_InternalFractal()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt3=1;
                }
                break;
            case 15:
            case 16:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:210:2: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition395);
                    this_ComponentTypeDefinition_0=ruleComponentTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComponentTypeDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:223:2: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition425);
                    this_PrimitiveComponentDefinition_1=rulePrimitiveComponentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveComponentDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:236:2: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition455);
                    this_CompositeComponentDefinition_2=ruleCompositeComponentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeComponentDefinition_2; 
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


    // $ANTLR start "entryRulePrimitiveComponentDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:255:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:256:2: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:257:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition490);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition500); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveComponentDefinition"


    // $ANTLR start "rulePrimitiveComponentDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:264:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? ) ;
    public final EObject rulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_primitiveFormalArgumentsList_4_0 = null;

        EObject lv_referencesList_5_0 = null;

        EObject lv_body_7_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:267:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:268:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:268:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:268:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:268:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:269:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:269:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:270:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition546);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveComponentDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:286:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:287:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:287:1: (lv_abstract_1_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:288:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePrimitiveComponentDefinition565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_1_0, grammarAccess.getPrimitiveComponentDefinitionAccess().getAbstractAbstractKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveComponentDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimitiveComponentDefinition591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:1: ( (lv_name_3_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:306:1: (lv_name_3_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:306:1: (lv_name_3_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:307:3: lv_name_3_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFQNParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition612);
            lv_name_3_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveComponentDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:2: ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:324:1: (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:324:1: (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:325:3: lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition633);
                    lv_primitiveFormalArgumentsList_4_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"primitiveFormalArgumentsList",
                              		lv_primitiveFormalArgumentsList_4_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:341:3: ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:342:1: (lv_referencesList_5_0= rulePrimitiveReferencesList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:342:1: (lv_referencesList_5_0= rulePrimitiveReferencesList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:343:3: lv_referencesList_5_0= rulePrimitiveReferencesList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getReferencesListPrimitiveReferencesListParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition655);
                    lv_referencesList_5_0=rulePrimitiveReferencesList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"referencesList",
                              		lv_referencesList_5_0, 
                              		"PrimitiveReferencesList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:359:3: ( (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )?
            int alt9=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt9=1;
                    }
                    break;
                case 30:
                case 39:
                case 40:
                case 42:
                case 57:
                case 58:
                    {
                    alt9=2;
                    }
                    break;
                case EOF:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred11_InternalFractal()) ) {
                        alt9=2;
                    }
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:359:4: (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:359:4: (otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:359:6: otherlv_6= '{' ( (lv_body_7_0= rulePrimitiveBody ) )? otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePrimitiveComponentDefinition670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_6_0_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:363:1: ( (lv_body_7_0= rulePrimitiveBody ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==30||(LA8_0>=39 && LA8_0<=40)||LA8_0==42||(LA8_0>=57 && LA8_0<=58)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==18) ) {
                        int LA8_2 = input.LA(2);

                        if ( (synpred9_InternalFractal()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: (lv_body_7_0= rulePrimitiveBody )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: (lv_body_7_0= rulePrimitiveBody )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:365:3: lv_body_7_0= rulePrimitiveBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition691);
                            lv_body_7_0=rulePrimitiveBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimitiveComponentDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_7_0, 
                                      		"PrimitiveBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePrimitiveComponentDefinition704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_6_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:6: ( (lv_body_9_0= rulePrimitiveBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:6: ( (lv_body_9_0= rulePrimitiveBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:387:1: (lv_body_9_0= rulePrimitiveBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:387:1: (lv_body_9_0= rulePrimitiveBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:388:3: lv_body_9_0= rulePrimitiveBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition732);
                    lv_body_9_0=rulePrimitiveBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_9_0, 
                              		"PrimitiveBody");
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
    // $ANTLR end "rulePrimitiveComponentDefinition"


    // $ANTLR start "entryRulePrimitiveDefinitionElement"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:412:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:413:2: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:414:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement770);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement780); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveDefinitionElement"


    // $ANTLR start "rulePrimitiveDefinitionElement"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:421:1: rulePrimitiveDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:424:28: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:425:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:425:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred12_InternalFractal()) ) {
                    alt10=1;
                }
                else if ( (synpred13_InternalFractal()) ) {
                    alt10=2;
                }
                else if ( (synpred14_InternalFractal()) ) {
                    alt10=3;
                }
                else if ( (true) ) {
                    alt10=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 57:
            case 58:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:426:2: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement830);
                    this_InterfaceDefinition_0=ruleInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:439:2: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement860);
                    this_AttributeDefinition_1=ruleAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:452:2: this_DataDefinition_2= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement890);
                    this_DataDefinition_2=ruleDataDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:465:2: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement920);
                    this_ImplementationDefinition_3=ruleImplementationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImplementationDefinition_3; 
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
    // $ANTLR end "rulePrimitiveDefinitionElement"


    // $ANTLR start "entryRuleComponentTypeDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:484:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:485:2: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:486:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition955);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentTypeDefinition965); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentTypeDefinition"


    // $ANTLR start "ruleComponentTypeDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:493:1: ruleComponentTypeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? ) ;
    public final EObject ruleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_referencesList_3_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:496:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:497:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:497:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:497:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:497:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:498:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:498:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:499:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1011);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentTypeDefinitionRule());
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

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentTypeDefinition1024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:519:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:520:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:520:1: (lv_name_2_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:521:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1045);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:537:2: ( (lv_referencesList_3_0= ruleTypeReferencesList ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:1: (lv_referencesList_3_0= ruleTypeReferencesList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:1: (lv_referencesList_3_0= ruleTypeReferencesList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:539:3: lv_referencesList_3_0= ruleTypeReferencesList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getReferencesListTypeReferencesListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1066);
                    lv_referencesList_3_0=ruleTypeReferencesList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"referencesList",
                              		lv_referencesList_3_0, 
                              		"TypeReferencesList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:555:3: ( (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )?
            int alt14=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt14=1;
                    }
                    break;
                case 42:
                case 57:
                case 58:
                    {
                    alt14=2;
                    }
                    break;
                case EOF:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred19_InternalFractal()) ) {
                        alt14=2;
                    }
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:555:4: (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:555:4: (otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:555:6: otherlv_4= '{' ( (lv_body_5_0= ruleTypeBody ) )? otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentTypeDefinition1081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:559:1: ( (lv_body_5_0= ruleTypeBody ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==42||(LA13_0>=57 && LA13_0<=58)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==18) ) {
                        int LA13_2 = input.LA(2);

                        if ( (synpred17_InternalFractal()) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:560:1: (lv_body_5_0= ruleTypeBody )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:560:1: (lv_body_5_0= ruleTypeBody )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:561:3: lv_body_5_0= ruleTypeBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1102);
                            lv_body_5_0=ruleTypeBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getComponentTypeDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_5_0, 
                                      		"TypeBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponentTypeDefinition1115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getComponentTypeDefinitionAccess().getRightCurlyBracketKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:582:6: ( (lv_body_7_0= ruleTypeBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:582:6: ( (lv_body_7_0= ruleTypeBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:583:1: (lv_body_7_0= ruleTypeBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:583:1: (lv_body_7_0= ruleTypeBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:584:3: lv_body_7_0= ruleTypeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1143);
                    lv_body_7_0=ruleTypeBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_7_0, 
                              		"TypeBody");
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
    // $ANTLR end "ruleComponentTypeDefinition"


    // $ANTLR start "entryRuleTypeReferenceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:608:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:609:2: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:610:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1181);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1191); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReferenceDefinition"


    // $ANTLR start "ruleTypeReferenceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:617:1: ruleTypeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0_0= ruleFQN ) ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:620:28: ( ( (lv_referenceName_0_0= ruleFQN ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:621:1: ( (lv_referenceName_0_0= ruleFQN ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:621:1: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:622:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:622:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:623:3: lv_referenceName_0_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1236);
            lv_referenceName_0_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeReferenceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"referenceName",
                      		lv_referenceName_0_0, 
                      		"FQN");
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
    // $ANTLR end "ruleTypeReferenceDefinition"


    // $ANTLR start "entryRuleTypeDefinitionElement"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:647:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:648:2: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:649:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1271);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinitionElement1281); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDefinitionElement"


    // $ANTLR start "ruleTypeDefinitionElement"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:1: ruleTypeDefinitionElement returns [EObject current=null] : this_InterfaceDefinition_0= ruleInterfaceDefinition ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:659:28: (this_InterfaceDefinition_0= ruleInterfaceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:2: this_InterfaceDefinition_0= ruleInterfaceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1330);
            this_InterfaceDefinition_0=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_InterfaceDefinition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleTypeDefinitionElement"


    // $ANTLR start "entryRuleCompositeComponentDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:680:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:681:2: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:682:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeComponentDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1364);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1374); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeComponentDefinition"


    // $ANTLR start "ruleCompositeComponentDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:689:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? ) ;
    public final EObject ruleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_templateSpecifiersList_3_0 = null;

        EObject lv_compositeFormalArgumentsList_4_0 = null;

        EObject lv_referencesList_5_0 = null;

        EObject lv_body_7_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:692:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:693:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:693:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:693:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:693:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:695:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1420);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
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

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCompositeComponentDefinition1433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:715:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:716:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:716:1: (lv_name_2_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:717:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1454);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:733:2: ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:734:1: (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:734:1: (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:735:3: lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1475);
                    lv_templateSpecifiersList_3_0=ruleTemplateSpecifiersList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:751:3: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:752:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:752:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:753:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1497);
                    lv_compositeFormalArgumentsList_4_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:769:3: ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:770:1: (lv_referencesList_5_0= ruleCompositeReferencesList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:770:1: (lv_referencesList_5_0= ruleCompositeReferencesList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:771:3: lv_referencesList_5_0= ruleCompositeReferencesList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getReferencesListCompositeReferencesListParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1519);
                    lv_referencesList_5_0=ruleCompositeReferencesList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"referencesList",
                              		lv_referencesList_5_0, 
                              		"CompositeReferencesList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:3: ( (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )?
            int alt19=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt19=1;
                    }
                    break;
                case 27:
                case 35:
                case 42:
                case 57:
                case 58:
                    {
                    alt19=2;
                    }
                    break;
                case EOF:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred25_InternalFractal()) ) {
                        alt19=2;
                    }
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:4: (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:4: (otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:6: otherlv_6= '{' ( (lv_body_7_0= ruleCompositeBody ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCompositeComponentDefinition1534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_6_0_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:791:1: ( (lv_body_7_0= ruleCompositeBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:792:1: (lv_body_7_0= ruleCompositeBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:792:1: (lv_body_7_0= ruleCompositeBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:793:3: lv_body_7_0= ruleCompositeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1555);
                    lv_body_7_0=ruleCompositeBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_7_0, 
                              		"CompositeBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCompositeComponentDefinition1567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_6_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:814:6: ( (lv_body_9_0= ruleCompositeBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:814:6: ( (lv_body_9_0= ruleCompositeBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:815:1: (lv_body_9_0= ruleCompositeBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:815:1: (lv_body_9_0= ruleCompositeBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:816:3: lv_body_9_0= ruleCompositeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1595);
                    lv_body_9_0=ruleCompositeBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_9_0, 
                              		"CompositeBody");
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
    // $ANTLR end "ruleCompositeComponentDefinition"


    // $ANTLR start "entryRuleTemplateSpecifiersList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:840:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:841:2: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:842:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifiersListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1633);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1643); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:849:1: ruleTemplateSpecifiersList returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_templateSpecifiers_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:852:28: ( (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:1: (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:1: (otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:3: otherlv_0= '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTemplateSpecifiersList1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:857:1: ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:857:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:857:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:858:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:858:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:859:3: lv_templateSpecifiers_1_0= ruleTemplateSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1702);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:875:2: (otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:875:4: otherlv_2= ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTemplateSpecifiersList1715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:879:1: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:880:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:880:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:881:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1736);
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
            	    break loop20;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTemplateSpecifiersList1751); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFormalArgumentsList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:909:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:910:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:911:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1787);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalArgumentsList1797); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:918:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:921:28: ( (otherlv_0= '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:922:1: (otherlv_0= '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:922:1: (otherlv_0= '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) otherlv_4= ')' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:922:3: otherlv_0= '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFormalArgumentsList1834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:926:1: ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:926:2: ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:926:2: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:927:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:927:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:928:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1856);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:944:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:944:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFormalArgumentsList1869); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:948:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:949:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:949:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:950:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1890);
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
            	    break loop21;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFormalArgumentsList1905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_2());
                  
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


    // $ANTLR start "entryRulePrimitiveReferencesList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:978:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:979:2: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:980:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveReferencesListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList1941);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveReferencesList1951); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveReferencesList"


    // $ANTLR start "rulePrimitiveReferencesList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:987:1: rulePrimitiveReferencesList returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:990:28: ( (otherlv_0= 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:1: (otherlv_0= 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:1: (otherlv_0= 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:3: otherlv_0= 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePrimitiveReferencesList1988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:995:1: ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:996:1: (lv_references_1_0= rulePrimitiveReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:996:1: (lv_references_1_0= rulePrimitiveReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:997:3: lv_references_1_0= rulePrimitiveReferenceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2009);
            lv_references_1_0=rulePrimitiveReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveReferencesListRule());
              	        }
                     		add(
                     			current, 
                     			"references",
                      		lv_references_1_0, 
                      		"PrimitiveReferenceDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1013:2: (otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1013:4: otherlv_2= ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveReferencesList2022); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1017:1: ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1018:1: (lv_references_3_0= rulePrimitiveReferenceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1018:1: (lv_references_3_0= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1019:3: lv_references_3_0= rulePrimitiveReferenceDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2043);
            	    lv_references_3_0=rulePrimitiveReferenceDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrimitiveReferencesListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"references",
            	              		lv_references_3_0, 
            	              		"PrimitiveReferenceDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "rulePrimitiveReferencesList"


    // $ANTLR start "entryRuleCompositeReferencesList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1043:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1044:2: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1045:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeReferencesListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2081);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeReferencesList2091); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeReferencesList"


    // $ANTLR start "ruleCompositeReferencesList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1052:1: ruleCompositeReferencesList returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1055:28: ( (otherlv_0= 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1056:1: (otherlv_0= 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1056:1: (otherlv_0= 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1056:3: otherlv_0= 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCompositeReferencesList2128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1060:1: ( (lv_references_1_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1061:1: (lv_references_1_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1061:1: (lv_references_1_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1062:3: lv_references_1_0= ruleCompositeReferenceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2149);
            lv_references_1_0=ruleCompositeReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeReferencesListRule());
              	        }
                     		add(
                     			current, 
                     			"references",
                      		lv_references_1_0, 
                      		"CompositeReferenceDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1078:2: (otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1078:4: otherlv_2= ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferencesList2162); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1082:1: ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1083:1: (lv_references_3_0= ruleCompositeReferenceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1083:1: (lv_references_3_0= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1084:3: lv_references_3_0= ruleCompositeReferenceDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2183);
            	    lv_references_3_0=ruleCompositeReferenceDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompositeReferencesListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"references",
            	              		lv_references_3_0, 
            	              		"CompositeReferenceDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleCompositeReferencesList"


    // $ANTLR start "entryRuleTypeReferencesList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1108:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1109:2: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1110:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferencesListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2221);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReferencesList2231); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReferencesList"


    // $ANTLR start "ruleTypeReferencesList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1117:1: ruleTypeReferencesList returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1120:28: ( (otherlv_0= 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1121:1: (otherlv_0= 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1121:1: (otherlv_0= 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1121:3: otherlv_0= 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) (otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeReferencesList2268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1125:1: ( (lv_references_1_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1126:1: (lv_references_1_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1126:1: (lv_references_1_0= ruleTypeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1127:3: lv_references_1_0= ruleTypeReferenceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2289);
            lv_references_1_0=ruleTypeReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeReferencesListRule());
              	        }
                     		add(
                     			current, 
                     			"references",
                      		lv_references_1_0, 
                      		"TypeReferenceDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1143:2: (otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1143:4: otherlv_2= ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTypeReferencesList2302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1147:1: ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1148:1: (lv_references_3_0= ruleTypeReferenceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1148:1: (lv_references_3_0= ruleTypeReferenceDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1149:3: lv_references_3_0= ruleTypeReferenceDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2323);
            	    lv_references_3_0=ruleTypeReferenceDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeReferencesListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"references",
            	              		lv_references_3_0, 
            	              		"TypeReferenceDefinition");
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
    // $ANTLR end "ruleTypeReferencesList"


    // $ANTLR start "entryRuleFormalArgument"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1173:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1174:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1175:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2361);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalArgument2371); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1182:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1185:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1186:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1186:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1187:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1187:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1188:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalArgument2412); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCompositeDefinitionElement"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1212:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1213:2: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1214:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDefinitionElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2452);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2462); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeDefinitionElement"


    // $ANTLR start "ruleCompositeDefinitionElement"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1221:1: ruleCompositeDefinitionElement returns [EObject current=null] : (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_0 = null;

        EObject this_InterfaceDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1224:28: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1225:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1225:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred31_InternalFractal()) ) {
                    alt25=1;
                }
                else if ( (synpred32_InternalFractal()) ) {
                    alt25=2;
                }
                else if ( (true) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt25=1;
                }
                break;
            case 57:
            case 58:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1226:2: this_SubComponentDefinition_0= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2512);
                    this_SubComponentDefinition_0=ruleSubComponentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1239:2: this_InterfaceDefinition_1= ruleInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2542);
                    this_InterfaceDefinition_1=ruleInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1252:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2572);
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
    // $ANTLR end "ruleCompositeDefinitionElement"


    // $ANTLR start "entryRuleSubComponentDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1271:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1272:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1273:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2607);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentDefinition2617); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1280:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_referenceDefinition_2_0 = null;

        EObject lv_body_5_1 = null;

        EObject lv_body_5_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1283:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1285:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1285:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1286:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2663);
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

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubComponentDefinition2676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1306:1: ( (lv_referenceDefinition_2_0= ruleComponentReference ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1307:1: (lv_referenceDefinition_2_0= ruleComponentReference )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1307:1: (lv_referenceDefinition_2_0= ruleComponentReference )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1308:3: lv_referenceDefinition_2_0= ruleComponentReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getReferenceDefinitionComponentReferenceParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_ruleSubComponentDefinition2697);
                    lv_referenceDefinition_2_0=ruleComponentReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"referenceDefinition",
                              		lv_referenceDefinition_2_0, 
                              		"ComponentReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubComponentDefinition2710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1328:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1329:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1329:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1330:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubComponentDefinition2727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getSubComponentDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1346:2: ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1348:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1348:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
                    int alt28=2;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        int LA28_1 = input.LA(2);

                        if ( (synpred35_InternalFractal()) ) {
                            alt28=1;
                        }
                        else if ( (true) ) {
                            alt28=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 20:
                        {
                        alt28=1;
                        }
                        break;
                    case 16:
                        {
                        alt28=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1349:3: lv_body_5_1= ruleSubComponentCompositeBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentCompositeBodyParserRuleCall_5_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentDefinition2755);
                            lv_body_5_1=ruleSubComponentCompositeBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_5_1, 
                                      		"SubComponentCompositeBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1364:8: lv_body_5_2= ruleSubComponentPrimitiveBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentPrimitiveBodyParserRuleCall_5_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentDefinition2774);
                            lv_body_5_2=ruleSubComponentPrimitiveBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_5_2, 
                                      		"SubComponentPrimitiveBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

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
    // $ANTLR end "ruleSubComponentDefinition"


    // $ANTLR start "entryRuleSubComponentCompositeBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1392:1: entryRuleSubComponentCompositeBody returns [EObject current=null] : iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF ;
    public final EObject entryRuleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1393:2: (iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1394:2: iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentCompositeBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2816);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2826); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1401:1: ruleSubComponentCompositeBody returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' ) ;
    public final EObject ruleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1404:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1405:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1405:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1405:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}'
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1405:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1406:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1406:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1407:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentCompositeBody2872);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1423:3: ( (lv_anonymous_1_0= 'composite' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1424:1: (lv_anonymous_1_0= 'composite' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1424:1: (lv_anonymous_1_0= 'composite' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1425:3: lv_anonymous_1_0= 'composite'
            {
            lv_anonymous_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSubComponentCompositeBody2891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_anonymous_1_0, grammarAccess.getSubComponentCompositeBodyAccess().getAnonymousCompositeKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentCompositeBodyRule());
              	        }
                     		setWithLastConsumed(current, "anonymous", true, "composite");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSubComponentCompositeBody2916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1442:1: ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27||LA32_0==35||LA32_0==42||(LA32_0>=57 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1442:2: ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) (otherlv_4= ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1442:2: ( (lv_elements_3_0= ruleCompositeDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1443:1: (lv_elements_3_0= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1443:1: (lv_elements_3_0= ruleCompositeDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1444:3: lv_elements_3_0= ruleCompositeDefinitionElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsCompositeDefinitionElementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_ruleSubComponentCompositeBody2938);
            	    lv_elements_3_0=ruleCompositeDefinitionElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"CompositeDefinitionElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1460:2: (otherlv_4= ';' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==14) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1460:4: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSubComponentCompositeBody2951); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getSubComponentCompositeBodyAccess().getSemicolonKeyword_3_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSubComponentCompositeBody2967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubComponentCompositeBodyAccess().getRightCurlyBracketKeyword_4());
                  
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1476:1: entryRuleSubComponentPrimitiveBody returns [EObject current=null] : iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF ;
    public final EObject entryRuleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentPrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1477:2: (iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody3003);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody3013); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1485:1: ruleSubComponentPrimitiveBody returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' ) ;
    public final EObject ruleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1488:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) otherlv_2= '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )? )* otherlv_5= '}'
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1490:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1490:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentPrimitiveBody3059);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1507:3: ( (lv_anonymous_1_0= 'primitive' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1508:1: (lv_anonymous_1_0= 'primitive' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1508:1: (lv_anonymous_1_0= 'primitive' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1509:3: lv_anonymous_1_0= 'primitive'
            {
            lv_anonymous_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSubComponentPrimitiveBody3078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_anonymous_1_0, grammarAccess.getSubComponentPrimitiveBodyAccess().getAnonymousPrimitiveKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentPrimitiveBodyRule());
              	        }
                     		setWithLastConsumed(current, "anonymous", true, "primitive");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSubComponentPrimitiveBody3103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1526:1: ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30||(LA35_0>=39 && LA35_0<=40)||LA35_0==42||(LA35_0>=57 && LA35_0<=58)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1526:2: ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) (otherlv_4= ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1526:2: ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1527:1: (lv_elements_3_0= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1527:1: (lv_elements_3_0= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1528:3: lv_elements_3_0= rulePrimitiveDefinitionElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsPrimitiveDefinitionElementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_ruleSubComponentPrimitiveBody3125);
            	    lv_elements_3_0=rulePrimitiveDefinitionElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"PrimitiveDefinitionElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1544:2: (otherlv_4= ';' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==14) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1544:4: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSubComponentPrimitiveBody3138); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getSubComponentPrimitiveBodyAccess().getSemicolonKeyword_3_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSubComponentPrimitiveBody3154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubComponentPrimitiveBodyAccess().getRightCurlyBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleCompositeBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1560:1: entryRuleCompositeBody returns [EObject current=null] : iv_ruleCompositeBody= ruleCompositeBody EOF ;
    public final EObject entryRuleCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1561:2: (iv_ruleCompositeBody= ruleCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1562:2: iv_ruleCompositeBody= ruleCompositeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_entryRuleCompositeBody3190);
            iv_ruleCompositeBody=ruleCompositeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeBody3200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeBody"


    // $ANTLR start "ruleCompositeBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1569:1: ruleCompositeBody returns [EObject current=null] : ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) (otherlv_1= ';' )? )* ;
    public final EObject ruleCompositeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1572:28: ( ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) (otherlv_1= ';' )? )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1573:1: ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) (otherlv_1= ';' )? )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1573:1: ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) (otherlv_1= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==27||LA37_0==35||LA37_0==42||(LA37_0>=57 && LA37_0<=58)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1573:2: ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) (otherlv_1= ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1573:2: ( (lv_elements_0_0= ruleCompositeDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1574:1: (lv_elements_0_0= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1574:1: (lv_elements_0_0= ruleCompositeDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1575:3: lv_elements_0_0= ruleCompositeDefinitionElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositeBodyAccess().getElementsCompositeDefinitionElementParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeBody3246);
            	    lv_elements_0_0=ruleCompositeDefinitionElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompositeBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"CompositeDefinitionElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1591:2: (otherlv_1= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==14) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1591:4: otherlv_1= ';'
            	            {
            	            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeBody3259); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getCompositeBodyAccess().getSemicolonKeyword_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


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
    // $ANTLR end "ruleCompositeBody"


    // $ANTLR start "entryRulePrimitiveBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1603:1: entryRulePrimitiveBody returns [EObject current=null] : iv_rulePrimitiveBody= rulePrimitiveBody EOF ;
    public final EObject entryRulePrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1604:2: (iv_rulePrimitiveBody= rulePrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1605:2: iv_rulePrimitiveBody= rulePrimitiveBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_entryRulePrimitiveBody3298);
            iv_rulePrimitiveBody=rulePrimitiveBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveBody3308); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveBody"


    // $ANTLR start "rulePrimitiveBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1612:1: rulePrimitiveBody returns [EObject current=null] : ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) (otherlv_1= ';' )? )* ;
    public final EObject rulePrimitiveBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1615:28: ( ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) (otherlv_1= ';' )? )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1616:1: ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) (otherlv_1= ';' )? )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1616:1: ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) (otherlv_1= ';' )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30||(LA39_0>=39 && LA39_0<=40)||LA39_0==42||(LA39_0>=57 && LA39_0<=58)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1616:2: ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) (otherlv_1= ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1616:2: ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1617:1: (lv_elements_0_0= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1617:1: (lv_elements_0_0= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1618:3: lv_elements_0_0= rulePrimitiveDefinitionElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimitiveBodyAccess().getElementsPrimitiveDefinitionElementParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveBody3354);
            	    lv_elements_0_0=rulePrimitiveDefinitionElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrimitiveBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"PrimitiveDefinitionElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1634:2: (otherlv_1= ';' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==14) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1634:4: otherlv_1= ';'
            	            {
            	            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePrimitiveBody3367); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getPrimitiveBodyAccess().getSemicolonKeyword_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // $ANTLR end "rulePrimitiveBody"


    // $ANTLR start "entryRuleTypeBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1646:1: entryRuleTypeBody returns [EObject current=null] : iv_ruleTypeBody= ruleTypeBody EOF ;
    public final EObject entryRuleTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1647:2: (iv_ruleTypeBody= ruleTypeBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1648:2: iv_ruleTypeBody= ruleTypeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_entryRuleTypeBody3406);
            iv_ruleTypeBody=ruleTypeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBody3416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeBody"


    // $ANTLR start "ruleTypeBody"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1655:1: ruleTypeBody returns [EObject current=null] : ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) (otherlv_1= ';' )? )* ;
    public final EObject ruleTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1658:28: ( ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) (otherlv_1= ';' )? )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1659:1: ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) (otherlv_1= ';' )? )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1659:1: ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) (otherlv_1= ';' )? )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==42||(LA41_0>=57 && LA41_0<=58)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1659:2: ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) (otherlv_1= ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1659:2: ( (lv_elements_0_0= ruleTypeDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1660:1: (lv_elements_0_0= ruleTypeDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1660:1: (lv_elements_0_0= ruleTypeDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1661:3: lv_elements_0_0= ruleTypeDefinitionElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeBodyAccess().getElementsTypeDefinitionElementParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinitionElement_in_ruleTypeBody3462);
            	    lv_elements_0_0=ruleTypeDefinitionElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"TypeDefinitionElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1677:2: (otherlv_1= ';' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==14) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1677:4: otherlv_1= ';'
            	            {
            	            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTypeBody3475); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getTypeBodyAccess().getSemicolonKeyword_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


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
    // $ANTLR end "ruleTypeBody"


    // $ANTLR start "entryRuleComponentReference"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1691:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1692:2: (iv_ruleComponentReference= ruleComponentReference EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1693:2: iv_ruleComponentReference= ruleComponentReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_entryRuleComponentReference3516);
            iv_ruleComponentReference=ruleComponentReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentReference3526); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentReference"


    // $ANTLR start "ruleComponentReference"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1700:1: ruleComponentReference returns [EObject current=null] : (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition ) ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeReferenceDefinition_0 = null;

        EObject this_PrimitiveReferenceDefinition_1 = null;

        EObject this_TypeReferenceDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1703:28: ( (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1704:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1704:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred49_InternalFractal()) ) {
                    alt42=1;
                }
                else if ( (synpred50_InternalFractal()) ) {
                    alt42=2;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1705:2: this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComponentReferenceAccess().getCompositeReferenceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleComponentReference3576);
                    this_CompositeReferenceDefinition_0=ruleCompositeReferenceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeReferenceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1718:2: this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComponentReferenceAccess().getPrimitiveReferenceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_ruleComponentReference3606);
                    this_PrimitiveReferenceDefinition_1=rulePrimitiveReferenceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveReferenceDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1731:2: this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComponentReferenceAccess().getTypeReferenceDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleComponentReference3636);
                    this_TypeReferenceDefinition_2=ruleTypeReferenceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeReferenceDefinition_2; 
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
    // $ANTLR end "ruleComponentReference"


    // $ANTLR start "entryRuleCompositeReferenceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1750:1: entryRuleCompositeReferenceDefinition returns [EObject current=null] : iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF ;
    public final EObject entryRuleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferenceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1751:2: (iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1752:2: iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3671);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3681); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeReferenceDefinition"


    // $ANTLR start "ruleCompositeReferenceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1759:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        EObject lv_templatesList_2_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_argumentsList_7_0 = null;

        EObject lv_argumentsList_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1762:28: ( ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1763:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1763:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1763:2: ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1763:2: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1764:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1764:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1765:3: lv_referenceName_0_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3727);
            lv_referenceName_0_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeReferenceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"referenceName",
                      		lv_referenceName_0_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1781:2: (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1781:4: otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCompositeReferenceDefinition3740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1785:1: ( (lv_templatesList_2_0= ruleTemplateDefinition ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1786:1: (lv_templatesList_2_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1786:1: (lv_templatesList_2_0= ruleTemplateDefinition )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1787:3: lv_templatesList_2_0= ruleTemplateDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3761);
                    lv_templatesList_2_0=ruleTemplateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeReferenceDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_2_0, 
                              		"TemplateDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1803:2: (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==22) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1803:4: otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferenceDefinition3774); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1807:1: ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1808:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1808:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1809:3: lv_templatesList_4_0= ruleTemplateDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3795);
                    	    lv_templatesList_4_0=ruleTemplateDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeReferenceDefinitionRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompositeReferenceDefinition3809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1829:3: (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1829:5: otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCompositeReferenceDefinition3824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1833:1: ( (lv_argumentsList_7_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1834:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1834:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1835:3: lv_argumentsList_7_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3845);
                    lv_argumentsList_7_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeReferenceDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_7_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1851:2: (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1851:4: otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferenceDefinition3858); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1855:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1856:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1856:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1857:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3879);
                    	    lv_argumentsList_9_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeReferenceDefinitionRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCompositeReferenceDefinition3893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompositeReferenceDefinitionAccess().getRightParenthesisKeyword_2_3());
                          
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
    // $ANTLR end "ruleCompositeReferenceDefinition"


    // $ANTLR start "entryRulePrimitiveReferenceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1885:1: entryRulePrimitiveReferenceDefinition returns [EObject current=null] : iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF ;
    public final EObject entryRulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferenceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1886:2: (iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1887:2: iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3931);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3941); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveReferenceDefinition"


    // $ANTLR start "rulePrimitiveReferenceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1894:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        EObject lv_argumentsList_2_0 = null;

        EObject lv_argumentsList_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1897:28: ( ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:2: ( (lv_referenceName_0_0= ruleFQN ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:2: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1900:3: lv_referenceName_0_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3987);
            lv_referenceName_0_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveReferenceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"referenceName",
                      		lv_referenceName_0_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1916:2: (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1916:4: otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveReferenceDefinition4000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1920:1: ( (lv_argumentsList_2_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1921:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1921:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1922:3: lv_argumentsList_2_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4021);
                    lv_argumentsList_2_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveReferenceDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_2_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1938:2: (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==22) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1938:4: otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveReferenceDefinition4034); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1942:1: ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1943:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1943:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1944:3: lv_argumentsList_4_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4055);
                    	    lv_argumentsList_4_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimitiveReferenceDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_4_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePrimitiveReferenceDefinition4069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimitiveReferenceDefinitionAccess().getRightParenthesisKeyword_1_3());
                          
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
    // $ANTLR end "rulePrimitiveReferenceDefinition"


    // $ANTLR start "entryRuleTemplateDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1972:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1973:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1974:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4107);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateDefinition4117); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1981:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1984:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==29) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1985:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1986:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1986:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1987:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateDefinition4160); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTemplateDefinition4177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2007:3: ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2008:1: (lv_reference_2_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2008:1: (lv_reference_2_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2009:3: lv_reference_2_0= ruleCompositeReferenceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateDefinitionAccess().getReferenceCompositeReferenceDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4200);
            lv_reference_2_0=ruleCompositeReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_2_0, 
                      		"CompositeReferenceDefinition");
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


    // $ANTLR start "entryRuleAttributeDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2033:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2034:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2035:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4236);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeDefinition4246); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2042:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? ) ;
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
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2045:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2046:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2046:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2046:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2046:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2047:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2047:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2048:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition4292);
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeDefinition4305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:1: ( (lv_type_2_0= ruleAttributeType ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=49 && LA51_0<=51)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==RULE_ID) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2069:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2069:1: (lv_type_2_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2070:3: lv_type_2_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4326);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2086:3: ( (lv_attributeName_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2087:1: (lv_attributeName_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2087:1: (lv_attributeName_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2088:3: lv_attributeName_3_0= RULE_ID
            {
            lv_attributeName_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeDefinition4344); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2104:2: (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2104:4: otherlv_4= '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeDefinition4362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2108:1: ( (lv_value_5_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2109:1: (lv_value_5_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2109:1: (lv_value_5_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2110:3: lv_value_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleAttributeDefinition4383);
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


    // $ANTLR start "entryRuleArgumentDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2134:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2135:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2136:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4421);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentDefinition4431); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2143:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;

        AntlrDatatypeRuleToken lv_argumentValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2146:28: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2147:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2147:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==EOF||LA53_1==22||LA53_1==25) ) {
                    alt53=2;
                }
                else if ( (LA53_1==29) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==RULE_INT||LA53_0==RULE_STRING||(LA53_0>=43 && LA53_0<=44)||(LA53_0>=55 && LA53_0<=56)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2147:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2147:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2147:3: ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_argumentValue_2_0= ruleValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2147:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2148:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2148:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2149:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleArgumentDefinition4474); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleArgumentDefinition4491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2169:1: ( (lv_argumentValue_2_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2170:1: (lv_argumentValue_2_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2170:1: (lv_argumentValue_2_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2171:3: lv_argumentValue_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleArgumentDefinition4512);
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
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2188:6: ( (lv_argumentValue_3_0= ruleValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2188:6: ( (lv_argumentValue_3_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2189:1: (lv_argumentValue_3_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2189:1: (lv_argumentValue_3_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2190:3: lv_argumentValue_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleArgumentDefinition4540);
                    lv_argumentValue_3_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgumentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"argumentValue",
                              		lv_argumentValue_3_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleArgumentDefinition"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2214:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2215:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2216:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4576);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition4586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2223:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFQN ) )? otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' ) | ( (lv_collection_9_0= '[]' ) ) )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_optional_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        Token lv_collectionsize_7_0=null;
        Token otherlv_8=null;
        Token lv_collection_9_0=null;
        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_role_1_0 = null;

        AntlrDatatypeRuleToken lv_signature_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2226:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFQN ) )? otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' ) | ( (lv_collection_9_0= '[]' ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFQN ) )? otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' ) | ( (lv_collection_9_0= '[]' ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFQN ) )? otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' ) | ( (lv_collection_9_0= '[]' ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFQN ) )? otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' ) | ( (lv_collection_9_0= '[]' ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2228:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2228:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2229:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition4632);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2245:3: ( (lv_role_1_0= ruleRole ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2246:1: (lv_role_1_0= ruleRole )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2246:1: (lv_role_1_0= ruleRole )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2247:3: lv_role_1_0= ruleRole
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleInterfaceDefinition4654);
            lv_role_1_0=ruleRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"role",
                      		lv_role_1_0, 
                      		"Role");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2263:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==31) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2264:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2264:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2265:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInterfaceDefinition4672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_2_0, grammarAccess.getInterfaceDefinitionAccess().getOptionalOptionalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2278:3: ( (lv_signature_3_0= ruleFQN ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2279:1: (lv_signature_3_0= ruleFQN )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2279:1: (lv_signature_3_0= ruleFQN )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2280:3: lv_signature_3_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFQNParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleInterfaceDefinition4707);
                    lv_signature_3_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"signature",
                              		lv_signature_3_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInterfaceDefinition4720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2300:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2301:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2301:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2302:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInterfaceDefinition4737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2318:2: ( ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' ) | ( (lv_collection_9_0= '[]' ) ) )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==32) ) {
                alt58=1;
            }
            else if ( (LA58_0==34) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2318:3: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2318:3: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2318:4: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2318:4: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2319:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2319:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2320:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInterfaceDefinition4762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_6_0, grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_6_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2333:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2334:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2334:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2335:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInterfaceDefinition4792); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_7_0, grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_6_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
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

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInterfaceDefinition4810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2356:6: ( (lv_collection_9_0= '[]' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2356:6: ( (lv_collection_9_0= '[]' ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2357:1: (lv_collection_9_0= '[]' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2357:1: (lv_collection_9_0= '[]' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2358:3: lv_collection_9_0= '[]'
                    {
                    lv_collection_9_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInterfaceDefinition4835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_9_0, grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_6_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[]");
                      	    
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
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleBindingDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2379:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2380:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2381:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4886);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBindingDefinition4896); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2388:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? (otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? ) ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_interfaceSourceParentLabel_3_0=null;
        Token otherlv_4=null;
        Token lv_interfaceSourceLabel_5_0=null;
        Token otherlv_6=null;
        Token lv_interfaceSourceIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_interfaceTargetParentLabel_11_0=null;
        Token otherlv_12=null;
        Token lv_interfaceTargetLabel_13_0=null;
        Token otherlv_14=null;
        Token lv_interfaceTargetIndex_15_0=null;
        Token otherlv_16=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2391:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? (otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2392:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? (otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2392:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? (otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2392:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? (otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2392:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2393:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2393:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2394:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4942);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2410:3: (otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2410:5: otherlv_1= 'binds' (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) ) otherlv_4= '.' ( (lv_interfaceSourceLabel_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) ) otherlv_12= '.' ( (lv_interfaceTargetLabel_13_0= RULE_ID ) ) (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            {
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBindingDefinition4956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2414:1: (otherlv_2= 'this' | ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==36) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2414:3: otherlv_2= 'this'
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBindingDefinition4969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:6: ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:6: ( (lv_interfaceSourceParentLabel_3_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2420:1: (lv_interfaceSourceParentLabel_3_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2420:1: (lv_interfaceSourceParentLabel_3_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2421:3: lv_interfaceSourceParentLabel_3_0= RULE_ID
                    {
                    lv_interfaceSourceParentLabel_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition4992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_interfaceSourceParentLabel_3_0, grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentLabelIDTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"interfaceSourceParentLabel",
                              		lv_interfaceSourceParentLabel_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBindingDefinition5010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_1_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2441:1: ( (lv_interfaceSourceLabel_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2442:1: (lv_interfaceSourceLabel_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2442:1: (lv_interfaceSourceLabel_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2443:3: lv_interfaceSourceLabel_5_0= RULE_ID
            {
            lv_interfaceSourceLabel_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition5027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_interfaceSourceLabel_5_0, grammarAccess.getBindingDefinitionAccess().getInterfaceSourceLabelIDTerminalRuleCall_1_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"interfaceSourceLabel",
                      		lv_interfaceSourceLabel_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2459:2: (otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2459:4: otherlv_6= '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBindingDefinition5045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_1_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2463:1: ( (lv_interfaceSourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2464:1: (lv_interfaceSourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2464:1: (lv_interfaceSourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2465:3: lv_interfaceSourceIndex_7_0= RULE_INT
                    {
                    lv_interfaceSourceIndex_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBindingDefinition5062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_interfaceSourceIndex_7_0, grammarAccess.getBindingDefinitionAccess().getInterfaceSourceIndexINTTerminalRuleCall_1_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"interfaceSourceIndex",
                              		lv_interfaceSourceIndex_7_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBindingDefinition5079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_1_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBindingDefinition5093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_1_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2489:1: (otherlv_10= 'this' | ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==36) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2489:3: otherlv_10= 'this'
                    {
                    otherlv_10=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBindingDefinition5106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_6_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2494:6: ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2494:6: ( (lv_interfaceTargetParentLabel_11_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2495:1: (lv_interfaceTargetParentLabel_11_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2495:1: (lv_interfaceTargetParentLabel_11_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2496:3: lv_interfaceTargetParentLabel_11_0= RULE_ID
                    {
                    lv_interfaceTargetParentLabel_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition5129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_interfaceTargetParentLabel_11_0, grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentLabelIDTerminalRuleCall_1_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"interfaceTargetParentLabel",
                              		lv_interfaceTargetParentLabel_11_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBindingDefinition5147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_1_7());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2516:1: ( (lv_interfaceTargetLabel_13_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2517:1: (lv_interfaceTargetLabel_13_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2517:1: (lv_interfaceTargetLabel_13_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2518:3: lv_interfaceTargetLabel_13_0= RULE_ID
            {
            lv_interfaceTargetLabel_13_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition5164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_interfaceTargetLabel_13_0, grammarAccess.getBindingDefinitionAccess().getInterfaceTargetLabelIDTerminalRuleCall_1_8_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"interfaceTargetLabel",
                      		lv_interfaceTargetLabel_13_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2534:2: (otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==32) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2534:4: otherlv_14= '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBindingDefinition5182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_1_9_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2538:1: ( (lv_interfaceTargetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2539:1: (lv_interfaceTargetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2539:1: (lv_interfaceTargetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2540:3: lv_interfaceTargetIndex_15_0= RULE_INT
                    {
                    lv_interfaceTargetIndex_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBindingDefinition5199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_interfaceTargetIndex_15_0, grammarAccess.getBindingDefinitionAccess().getInterfaceTargetIndexINTTerminalRuleCall_1_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"interfaceTargetIndex",
                              		lv_interfaceTargetIndex_15_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBindingDefinition5216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_1_9_2());
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleBindingDefinition"


    // $ANTLR start "entryRuleDataDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2568:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2569:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2570:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5255);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataDefinition5265); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2577:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2580:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2581:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2581:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2581:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2581:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2582:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2582:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2583:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5311);
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

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDataDefinition5324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2603:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID||LA65_0==RULE_SL||LA65_0==37||LA65_0==54) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_CODEC) ) {
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2603:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2603:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2604:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2604:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2605:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileC_in_ruleDataDefinition5346);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2622:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2622:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2623:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2623:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2624:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5373);
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


    // $ANTLR start "entryRuleImplementationDefinition"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2648:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2649:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2650:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5410);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementationDefinition5420); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2657:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2660:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2661:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2661:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2661:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2661:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==42) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2662:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2662:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2663:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5466);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleImplementationDefinition5479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2683:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||LA67_0==RULE_SL||LA67_0==37||LA67_0==54) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_CODEC) ) {
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2683:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2683:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2684:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2684:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2685:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileC_in_ruleImplementationDefinition5501);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2702:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2702:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2703:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2703:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2704:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5528);
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


    // $ANTLR start "entryRuleTemplateSpecifier"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2728:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2729:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2730:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5565);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateSpecifier5575); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2737:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2740:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2742:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2742:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2743:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateSpecifier5617); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTemplateSpecifier5634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2763:1: ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2764:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2764:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2765:3: lv_reference_2_0= ruleTypeReferenceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifierAccess().getReferenceTypeReferenceDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5655);
            lv_reference_2_0=ruleTypeReferenceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateSpecifierRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_2_0, 
                      		"TypeReferenceDefinition");
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


    // $ANTLR start "entryRuleFileC"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2789:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2790:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileC_in_entryRuleFileC5691);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileC5701); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2798:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_fileName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2801:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2802:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2802:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2802:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_fileName_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2802:2: ( (lv_directory_0_0= rulePath ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_SL||LA68_1==53) ) {
                    alt68=1;
                }
            }
            else if ( (LA68_0==RULE_SL||LA68_0==37||LA68_0==54) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2803:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2803:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2804:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleFileC5747);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2820:3: ( (lv_fileName_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:1: (lv_fileName_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:1: (lv_fileName_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2822:3: lv_fileName_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getFileNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleFileC5769);
            lv_fileName_1_0=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFileCRule());
              	        }
                     		set(
                     			current, 
                     			"fileName",
                      		lv_fileName_1_0, 
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


    // $ANTLR start "entryRuleFileName"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2846:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2847:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2848:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_entryRuleFileName5806);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileName5817); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2855:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2858:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2859:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2859:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2859:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFileName5857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2866:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==37) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2867:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFileName5876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFileName5891); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInlineCodeC"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2887:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2888:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2889:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5938);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineCodeC5948); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2896:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODEC ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2899:28: ( ( (lv_codeC_0_0= RULE_CODEC ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2900:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2900:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2901:1: (lv_codeC_0_0= RULE_CODEC )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2901:1: (lv_codeC_0_0= RULE_CODEC )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2902:3: lv_codeC_0_0= RULE_CODEC
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODEC,FollowSets000.FOLLOW_RULE_CODEC_in_ruleInlineCodeC5989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_codeC_0_0, grammarAccess.getInlineCodeCAccess().getCodeCCodeCTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInlineCodeCRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"codeC",
                      		lv_codeC_0_0, 
                      		"CodeC");
              	    
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


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2926:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2927:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2928:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6029);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList6039); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2935:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2938:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2939:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2939:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2939:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2939:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2940:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2940:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2941:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList6085);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2957:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==42) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2959:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList6106);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2983:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2984:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2985:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation6143);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation6153); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2992:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2995:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2996:1: (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2996:1: (otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2996:3: otherlv_0= '@' ( (lv_name_1_0= ruleAnnotationType ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation6190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3000:1: ( (lv_name_1_0= ruleAnnotationType ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3001:1: (lv_name_1_0= ruleAnnotationType )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3001:1: (lv_name_1_0= ruleAnnotationType )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3002:3: lv_name_1_0= ruleAnnotationType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_ruleAnnotation6211);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3018:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==24) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3018:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation6224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3022:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3023:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3023:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3024:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_ruleAnnotation6245);
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3040:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==22) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3040:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation6258); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3044:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3045:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3045:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3046:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_ruleAnnotation6279);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnnotation6293); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3074:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3075:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3076:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6331);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationElement6341); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3083:1: ruleAnnotationElement returns [EObject current=null] : ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_1_0=null;
        Token otherlv_2=null;
        EObject lv_elementValue_0_0 = null;

        EObject lv_elementValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3086:28: ( ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT||LA73_0==RULE_STRING||LA73_0==17||LA73_0==42) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3088:1: (lv_elementValue_0_0= ruleElementValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3088:1: (lv_elementValue_0_0= ruleElementValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3089:3: lv_elementValue_0_0= ruleElementValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleAnnotationElement6387);
                    lv_elementValue_0_0=ruleElementValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationElementRule());
                      	        }
                             		set(
                             			current, 
                             			"elementValue",
                              		lv_elementValue_0_0, 
                              		"ElementValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3106:6: ( ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3106:6: ( ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3106:7: ( (lv_elementName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elementValue_3_0= ruleElementValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3106:7: ( (lv_elementName_1_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3107:1: (lv_elementName_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3107:1: (lv_elementName_1_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3108:3: lv_elementName_1_0= RULE_ID
                    {
                    lv_elementName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationElement6411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_elementName_1_0, grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"elementName",
                              		lv_elementName_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationElement6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3128:1: ( (lv_elementValue_3_0= ruleElementValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3129:1: (lv_elementValue_3_0= ruleElementValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3129:1: (lv_elementValue_3_0= ruleElementValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3130:3: lv_elementValue_3_0= ruleElementValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleAnnotationElement6449);
                    lv_elementValue_3_0=ruleElementValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationElementRule());
                      	        }
                             		set(
                             			current, 
                             			"elementValue",
                              		lv_elementValue_3_0, 
                              		"ElementValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


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
    // $ANTLR end "ruleAnnotationElement"


    // $ANTLR start "entryRuleElementValue"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3154:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3155:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3156:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_entryRuleElementValue6486);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementValue6496); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3163:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3167:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3167:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt74=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt74=1;
                }
                break;
            case 42:
                {
                alt74=2;
                }
                break;
            case 17:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3168:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleElementValue6546);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3181:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleElementValue6576);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3194:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6606);
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


    // $ANTLR start "entryRuleConstantValue"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3213:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3214:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3215:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_entryRuleConstantValue6641);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantValue6651); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3222:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3225:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3226:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3226:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3228:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantFormat_in_ruleConstantValue6696);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3252:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3253:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3254:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6732);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantFormat6743); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3261:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3264:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3265:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3265:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_INT) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_STRING) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3265:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConstantFormat6783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3273:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConstantFormat6809); if (state.failed) return current;
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


    // $ANTLR start "entryRuleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3288:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3289:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3290:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6854);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6864); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3297:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3300:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3301:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3301:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3301:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElementValueArrayInitializer6901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3305:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3306:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3306:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3307:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6922);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3323:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==22) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3323:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleElementValueArrayInitializer6935); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3327:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3328:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3328:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3329:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6956);
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElementValueArrayInitializer6970); if (state.failed) return current;
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


    // $ANTLR start "entryRuleValue"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3357:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3358:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3359:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue7007);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue7018); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3366:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3369:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3370:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3370:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt77=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt77=1;
                }
                break;
            case RULE_INT:
            case 55:
            case 56:
                {
                alt77=2;
                }
                break;
            case 44:
                {
                alt77=3;
                }
                break;
            case RULE_STRING:
                {
                alt77=4;
                }
                break;
            case 43:
                {
                alt77=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3370:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValue7058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3379:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleValue7091);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3391:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleHexadecimalType_in_ruleValue7124);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3402:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleValue7150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3411:2: kw= 'null'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleValue7174); if (state.failed) return current;
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


    // $ANTLR start "entryRuleHexadecimalType"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3424:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3425:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3426:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexadecimalTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7215);
            iv_ruleHexadecimalType=ruleHexadecimalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHexadecimalType7226); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3433:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3436:28: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3437:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3437:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3438:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleHexadecimalType7264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHexadecimalTypeAccess().getXKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleHexadecimalType7279); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnnotationType"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3458:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3459:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3460:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7325);
            iv_ruleAnnotationType=ruleAnnotationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType7336); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3467:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3470:28: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3471:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3471:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            int alt78=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt78=1;
                }
                break;
            case 46:
                {
                alt78=2;
                }
                break;
            case 47:
                {
                alt78=3;
                }
                break;
            case 48:
                {
                alt78=4;
                }
                break;
            case RULE_ID:
                {
                alt78=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3472:2: kw= 'Override'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAnnotationType7374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3479:2: kw= 'Singleton'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAnnotationType7393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3486:2: kw= 'LDFlags'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAnnotationType7412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3493:2: kw= 'CFlags'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAnnotationType7431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3500:5: this_FQN_4= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationTypeAccess().getFQNParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleAnnotationType7459);
                    this_FQN_4=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FQN_4);
                          
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


    // $ANTLR start "entryRuleAttributeType"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3518:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3519:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3520:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_entryRuleAttributeType7505);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeType7516); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3527:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3530:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3531:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3531:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt79=1;
                }
                break;
            case 50:
                {
                alt79=2;
                }
                break;
            case 51:
                {
                alt79=3;
                }
                break;
            case RULE_ID:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3532:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAttributeType7554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3539:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAttributeType7573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3546:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAttributeType7592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3552:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeType7613); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFQN"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3567:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3568:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3569:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_entryRuleFQN7659);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFQN7670); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3576:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3579:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3580:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3580:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3580:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN7710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3587:1: (kw= '.' this_ID_2= RULE_ID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==37) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3588:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFQN7729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN7744); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFULL_IMPORT_NAME"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3608:1: entryRuleFULL_IMPORT_NAME returns [String current=null] : iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF ;
    public final String entryRuleFULL_IMPORT_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_IMPORT_NAME = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3609:2: (iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3610:2: iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFULL_IMPORT_NAMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7792);
            iv_ruleFULL_IMPORT_NAME=ruleFULL_IMPORT_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFULL_IMPORT_NAME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7803); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFULL_IMPORT_NAME"


    // $ANTLR start "ruleFULL_IMPORT_NAME"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3617:1: ruleFULL_IMPORT_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleFULL_IMPORT_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3620:28: ( (this_FQN_0= ruleFQN kw= '.*' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3621:1: (this_FQN_0= ruleFQN kw= '.*' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3621:1: (this_FQN_0= ruleFQN kw= '.*' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3622:5: this_FQN_0= ruleFQN kw= '.*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFQNParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7850);
            this_FQN_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FQN_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFULL_IMPORT_NAME7868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFULL_IMPORT_NAMEAccess().getFullStopAsteriskKeyword_1()); 
                  
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
    // $ANTLR end "ruleFULL_IMPORT_NAME"


    // $ANTLR start "entryRulePath"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3646:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3647:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3648:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath7909);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath7920); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3655:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_ID_0= RULE_ID (kw= ':' )? ) | kw= '.' | kw= '..' )? (this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_8= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_4=null;
        Token this_ID_5=null;
        Token this_SL_8=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3658:28: ( ( ( (this_ID_0= RULE_ID (kw= ':' )? ) | kw= '.' | kw= '..' )? (this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_8= RULE_SL ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:1: ( ( (this_ID_0= RULE_ID (kw= ':' )? ) | kw= '.' | kw= '..' )? (this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_8= RULE_SL )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:1: ( ( (this_ID_0= RULE_ID (kw= ':' )? ) | kw= '.' | kw= '..' )? (this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_8= RULE_SL )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:2: ( (this_ID_0= RULE_ID (kw= ':' )? ) | kw= '.' | kw= '..' )? (this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_8= RULE_SL
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:2: ( (this_ID_0= RULE_ID (kw= ':' )? ) | kw= '.' | kw= '..' )?
            int alt82=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt82=1;
                    }
                    break;
                case 37:
                    {
                    alt82=2;
                    }
                    break;
                case 54:
                    {
                    alt82=3;
                    }
                    break;
            }

            switch (alt82) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:3: (this_ID_0= RULE_ID (kw= ':' )? )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:3: (this_ID_0= RULE_ID (kw= ':' )? )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:8: this_ID_0= RULE_ID (kw= ':' )?
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePath7962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0_0()); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3666:1: (kw= ':' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==53) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3667:2: kw= ':'
                            {
                            kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePath7981); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getPathAccess().getColonKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3674:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePath8003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3681:2: kw= '..'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePath8022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3686:3: (this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_SL) ) {
                    int LA86_1 = input.LA(2);

                    if ( (LA86_1==RULE_ID) ) {
                        int LA86_2 = input.LA(3);

                        if ( (LA86_2==RULE_ID||LA86_2==RULE_SL||LA86_2==55) ) {
                            alt86=1;
                        }


                    }
                    else if ( (LA86_1==RULE_SL||LA86_1==54) ) {
                        alt86=1;
                    }


                }


                switch (alt86) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3686:8: this_SL_4= RULE_SL ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_4=(Token)match(input,RULE_SL,FollowSets000.FOLLOW_RULE_SL_in_rulePath8040); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_4, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3693:1: ( (this_ID_5= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==RULE_ID||LA85_0==RULE_SL) ) {
            	        alt85=1;
            	    }
            	    else if ( (LA85_0==54) ) {
            	        alt85=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 85, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3693:2: (this_ID_5= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3693:2: (this_ID_5= RULE_ID (kw= '-' )? )*
            	            loop84:
            	            do {
            	                int alt84=2;
            	                int LA84_0 = input.LA(1);

            	                if ( (LA84_0==RULE_ID) ) {
            	                    alt84=1;
            	                }


            	                switch (alt84) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3693:7: this_ID_5= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePath8062); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_5);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_5, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3700:1: (kw= '-' )?
            	            	    int alt83=2;
            	            	    int LA83_0 = input.LA(1);

            	            	    if ( (LA83_0==55) ) {
            	            	        alt83=1;
            	            	    }
            	            	    switch (alt83) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3701:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePath8081); if (state.failed) return current;
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
            	            	    break loop84;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3708:2: kw= '..'
            	            {
            	            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePath8104); if (state.failed) return current;
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
            	    break loop86;
                }
            } while (true);

            this_SL_8=(Token)match(input,RULE_SL,FollowSets000.FOLLOW_RULE_SL_in_rulePath8122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SL_8);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SL_8, grammarAccess.getPathAccess().getSLTerminalRuleCall_2()); 
                  
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


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3728:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3729:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3730:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT8168);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT8179); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3737:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3740:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3741:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3741:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3741:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3741:2: (kw= '+' | kw= '-' )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==56) ) {
                alt87=1;
            }
            else if ( (LA87_0==55) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3742:2: kw= '+'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulesignedINT8218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3749:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulesignedINT8237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT8254); if (state.failed) return current;
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


    // $ANTLR start "ruleRole"
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3769:1: ruleRole returns [Enumerator current=null] : ( (enumLiteral_0= 'provides' ) | (enumLiteral_1= 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3771:28: ( ( (enumLiteral_0= 'provides' ) | (enumLiteral_1= 'requires' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3772:1: ( (enumLiteral_0= 'provides' ) | (enumLiteral_1= 'requires' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3772:1: ( (enumLiteral_0= 'provides' ) | (enumLiteral_1= 'requires' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==57) ) {
                alt88=1;
            }
            else if ( (LA88_0==58) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3772:2: (enumLiteral_0= 'provides' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3772:2: (enumLiteral_0= 'provides' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3772:4: enumLiteral_0= 'provides'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleRole8313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3778:6: (enumLiteral_1= 'requires' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3778:6: (enumLiteral_1= 'requires' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3778:8: enumLiteral_1= 'requires'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleRole8330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1()); 
                          
                    }

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
    // $ANTLR end "ruleRole"

    // $ANTLR start synpred3_InternalFractal
    public final void synpred3_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ComponentTypeDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:210:2: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:210:2: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleComponentTypeDefinition_in_synpred3_InternalFractal395);
        this_ComponentTypeDefinition_0=ruleComponentTypeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalFractal

    // $ANTLR start synpred4_InternalFractal
    public final void synpred4_InternalFractal_fragment() throws RecognitionException {   
        EObject this_PrimitiveComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:223:2: (this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:223:2: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveComponentDefinition_in_synpred4_InternalFractal425);
        this_PrimitiveComponentDefinition_1=rulePrimitiveComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalFractal

    // $ANTLR start synpred9_InternalFractal
    public final void synpred9_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_7_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: ( (lv_body_7_0= rulePrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: (lv_body_7_0= rulePrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:364:1: (lv_body_7_0= rulePrimitiveBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:365:3: lv_body_7_0= rulePrimitiveBody
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_synpred9_InternalFractal691);
        lv_body_7_0=rulePrimitiveBody();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalFractal

    // $ANTLR start synpred11_InternalFractal
    public final void synpred11_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_9_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:6: ( ( (lv_body_9_0= rulePrimitiveBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:6: ( (lv_body_9_0= rulePrimitiveBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:386:6: ( (lv_body_9_0= rulePrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:387:1: (lv_body_9_0= rulePrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:387:1: (lv_body_9_0= rulePrimitiveBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:388:3: lv_body_9_0= rulePrimitiveBody
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_synpred11_InternalFractal732);
        lv_body_9_0=rulePrimitiveBody();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalFractal

    // $ANTLR start synpred12_InternalFractal
    public final void synpred12_InternalFractal_fragment() throws RecognitionException {   
        EObject this_InterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:426:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:426:2: this_InterfaceDefinition_0= ruleInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_synpred12_InternalFractal830);
        this_InterfaceDefinition_0=ruleInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalFractal

    // $ANTLR start synpred13_InternalFractal
    public final void synpred13_InternalFractal_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:439:2: (this_AttributeDefinition_1= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:439:2: this_AttributeDefinition_1= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_synpred13_InternalFractal860);
        this_AttributeDefinition_1=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalFractal

    // $ANTLR start synpred14_InternalFractal
    public final void synpred14_InternalFractal_fragment() throws RecognitionException {   
        EObject this_DataDefinition_2 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:452:2: (this_DataDefinition_2= ruleDataDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:452:2: this_DataDefinition_2= ruleDataDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_synpred14_InternalFractal890);
        this_DataDefinition_2=ruleDataDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalFractal

    // $ANTLR start synpred17_InternalFractal
    public final void synpred17_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_5_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:560:1: ( (lv_body_5_0= ruleTypeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:560:1: (lv_body_5_0= ruleTypeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:560:1: (lv_body_5_0= ruleTypeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:561:3: lv_body_5_0= ruleTypeBody
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_synpred17_InternalFractal1102);
        lv_body_5_0=ruleTypeBody();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalFractal

    // $ANTLR start synpred19_InternalFractal
    public final void synpred19_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_7_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:582:6: ( ( (lv_body_7_0= ruleTypeBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:582:6: ( (lv_body_7_0= ruleTypeBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:582:6: ( (lv_body_7_0= ruleTypeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:583:1: (lv_body_7_0= ruleTypeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:583:1: (lv_body_7_0= ruleTypeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:584:3: lv_body_7_0= ruleTypeBody
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_synpred19_InternalFractal1143);
        lv_body_7_0=ruleTypeBody();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalFractal

    // $ANTLR start synpred25_InternalFractal
    public final void synpred25_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_9_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:814:6: ( ( (lv_body_9_0= ruleCompositeBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:814:6: ( (lv_body_9_0= ruleCompositeBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:814:6: ( (lv_body_9_0= ruleCompositeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:815:1: (lv_body_9_0= ruleCompositeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:815:1: (lv_body_9_0= ruleCompositeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:816:3: lv_body_9_0= ruleCompositeBody
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_synpred25_InternalFractal1595);
        lv_body_9_0=ruleCompositeBody();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalFractal

    // $ANTLR start synpred31_InternalFractal
    public final void synpred31_InternalFractal_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1226:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1226:2: this_SubComponentDefinition_0= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_synpred31_InternalFractal2512);
        this_SubComponentDefinition_0=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalFractal

    // $ANTLR start synpred32_InternalFractal
    public final void synpred32_InternalFractal_fragment() throws RecognitionException {   
        EObject this_InterfaceDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1239:2: (this_InterfaceDefinition_1= ruleInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1239:2: this_InterfaceDefinition_1= ruleInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_synpred32_InternalFractal2542);
        this_InterfaceDefinition_1=ruleInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalFractal

    // $ANTLR start synpred35_InternalFractal
    public final void synpred35_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_5_1 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1349:3: (lv_body_5_1= ruleSubComponentCompositeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1349:3: lv_body_5_1= ruleSubComponentCompositeBody
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentCompositeBodyParserRuleCall_5_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_synpred35_InternalFractal2755);
        lv_body_5_1=ruleSubComponentCompositeBody();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalFractal

    // $ANTLR start synpred36_InternalFractal
    public final void synpred36_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_body_5_1 = null;

        EObject lv_body_5_2 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1348:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1348:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
        int alt91=2;
        switch ( input.LA(1) ) {
        case 42:
            {
            int LA91_1 = input.LA(2);

            if ( (synpred35_InternalFractal()) ) {
                alt91=1;
            }
            else if ( (true) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 1, input);

                throw nvae;
            }
            }
            break;
        case 20:
            {
            alt91=1;
            }
            break;
        case 16:
            {
            alt91=2;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }

        switch (alt91) {
            case 1 :
                // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1349:3: lv_body_5_1= ruleSubComponentCompositeBody
                {
                pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_synpred36_InternalFractal2755);
                lv_body_5_1=ruleSubComponentCompositeBody();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1364:8: lv_body_5_2= ruleSubComponentPrimitiveBody
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentPrimitiveBodyParserRuleCall_5_0_1()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_synpred36_InternalFractal2774);
                lv_body_5_2=ruleSubComponentPrimitiveBody();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalFractal

    // $ANTLR start synpred49_InternalFractal
    public final void synpred49_InternalFractal_fragment() throws RecognitionException {   
        EObject this_CompositeReferenceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1705:2: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1705:2: this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_synpred49_InternalFractal3576);
        this_CompositeReferenceDefinition_0=ruleCompositeReferenceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalFractal

    // $ANTLR start synpred50_InternalFractal
    public final void synpred50_InternalFractal_fragment() throws RecognitionException {   
        EObject this_PrimitiveReferenceDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1718:2: (this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1718:2: this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_synpred50_InternalFractal3606);
        this_PrimitiveReferenceDefinition_1=rulePrimitiveReferenceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalFractal

    // Delegated rules

    public final boolean synpred35_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred31_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred12_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred36_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred25_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\1\4\1\16\1\4\2\uffff\1\16";
    static final String DFA2_maxS =
        "\1\4\1\64\1\4\2\uffff\1\64";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\26\uffff\1\2\16\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\26\uffff\1\2\16\uffff\1\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "150:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )";
        }
    }
    static final String DFA29_eotS =
        "\13\uffff";
    static final String DFA29_eofS =
        "\1\4\12\uffff";
    static final String DFA29_minS =
        "\1\16\1\0\11\uffff";
    static final String DFA29_maxS =
        "\1\72\1\0\11\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA29_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\4\1\uffff\1\2\1\uffff\1\4\1\uffff\1\2\6\uffff\1\4\7\uffff"+
            "\1\4\6\uffff\1\1\16\uffff\2\4",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1346:2: ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalFractal()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x000004000019A000L});
        public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleImportDefinition242 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleImportDefinition265 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition284 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleImportDefinition299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition546 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition565 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition591 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition612 = new BitSet(new long[]{0x0600058045020000L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition633 = new BitSet(new long[]{0x0600058044020000L});
        public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition655 = new BitSet(new long[]{0x0600058040020000L});
        public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition670 = new BitSet(new long[]{0x0600058040040000L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition691 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePrimitiveComponentDefinition704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1011 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentTypeDefinition1024 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1045 = new BitSet(new long[]{0x0600040004020000L});
        public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1066 = new BitSet(new long[]{0x0600040000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1081 = new BitSet(new long[]{0x0600040000040000L});
        public static final BitSet FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1102 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleComponentTypeDefinition1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1420 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCompositeComponentDefinition1433 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1454 = new BitSet(new long[]{0x060004080D220000L});
        public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1475 = new BitSet(new long[]{0x060004080D020000L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1497 = new BitSet(new long[]{0x060004080C020000L});
        public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1519 = new BitSet(new long[]{0x0600040808020000L});
        public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition1534 = new BitSet(new long[]{0x0600040808040000L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1555 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList1680 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1702 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList1715 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1736 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList1834 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1856 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList1869 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1890 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList1941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rulePrimitiveReferencesList1988 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2009 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveReferencesList2022 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2043 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCompositeReferencesList2128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2149 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferencesList2162 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2183 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypeReferencesList2268 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2289 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleTypeReferencesList2302 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2323 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument2412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2663 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSubComponentDefinition2676 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleComponentReference_in_ruleSubComponentDefinition2697 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSubComponentDefinition2710 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2727 = new BitSet(new long[]{0x0000040000110002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentDefinition2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentDefinition2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentCompositeBody2872 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSubComponentCompositeBody2891 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSubComponentCompositeBody2916 = new BitSet(new long[]{0x0600040808040000L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleSubComponentCompositeBody2938 = new BitSet(new long[]{0x0600040808044000L});
        public static final BitSet FOLLOW_14_in_ruleSubComponentCompositeBody2951 = new BitSet(new long[]{0x0600040808040000L});
        public static final BitSet FOLLOW_18_in_ruleSubComponentCompositeBody2967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody3003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody3013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentPrimitiveBody3059 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSubComponentPrimitiveBody3078 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSubComponentPrimitiveBody3103 = new BitSet(new long[]{0x0600058040040000L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_ruleSubComponentPrimitiveBody3125 = new BitSet(new long[]{0x0600058040044000L});
        public static final BitSet FOLLOW_14_in_ruleSubComponentPrimitiveBody3138 = new BitSet(new long[]{0x0600058040040000L});
        public static final BitSet FOLLOW_18_in_ruleSubComponentPrimitiveBody3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_entryRuleCompositeBody3190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeBody3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeBody3246 = new BitSet(new long[]{0x0600040808004002L});
        public static final BitSet FOLLOW_14_in_ruleCompositeBody3259 = new BitSet(new long[]{0x0600040808000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_entryRulePrimitiveBody3298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveBody3308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveBody3354 = new BitSet(new long[]{0x0600058040004002L});
        public static final BitSet FOLLOW_14_in_rulePrimitiveBody3367 = new BitSet(new long[]{0x0600058040000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_entryRuleTypeBody3406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBody3416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleTypeBody3462 = new BitSet(new long[]{0x0600040000004002L});
        public static final BitSet FOLLOW_14_in_ruleTypeBody3475 = new BitSet(new long[]{0x0600040000000002L});
        public static final BitSet FOLLOW_ruleComponentReference_in_entryRuleComponentReference3516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentReference3526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleComponentReference3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_ruleComponentReference3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleComponentReference3636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3727 = new BitSet(new long[]{0x0000000001200002L});
        public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3740 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3761 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3774 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3795 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3809 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3824 = new BitSet(new long[]{0x01801800000000B0L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3845 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3858 = new BitSet(new long[]{0x01801800000000B0L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3879 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3987 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition4000 = new BitSet(new long[]{0x01801800000000B0L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4021 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition4034 = new BitSet(new long[]{0x01801800000000B0L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4055 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4160 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTemplateDefinition4177 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition4292 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAttributeDefinition4305 = new BitSet(new long[]{0x000E000000000010L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4326 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition4344 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeDefinition4362 = new BitSet(new long[]{0x01801800000000B0L});
        public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition4383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition4431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition4474 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleArgumentDefinition4491 = new BitSet(new long[]{0x01801800000000B0L});
        public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition4586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition4632 = new BitSet(new long[]{0x0600040000000000L});
        public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition4654 = new BitSet(new long[]{0x0000000090000010L});
        public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition4672 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleInterfaceDefinition4707 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition4720 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition4737 = new BitSet(new long[]{0x0000000500000002L});
        public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition4762 = new BitSet(new long[]{0x0000000200000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition4792 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInterfaceDefinition4810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleInterfaceDefinition4835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4886 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition4896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4942 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleBindingDefinition4956 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_36_in_ruleBindingDefinition4969 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4992 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBindingDefinition5010 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5027 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_32_in_ruleBindingDefinition5045 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5062 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBindingDefinition5079 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleBindingDefinition5093 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_36_in_ruleBindingDefinition5106 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5129 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBindingDefinition5147 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5164 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleBindingDefinition5182 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5199 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBindingDefinition5216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5311 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleDataDefinition5324 = new BitSet(new long[]{0x0040002000000150L});
        public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5466 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleImplementationDefinition5479 = new BitSet(new long[]{0x0040002000000150L});
        public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier5575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier5617 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTemplateSpecifier5634 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileC5701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_ruleFileC5747 = new BitSet(new long[]{0x0040002000000110L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleFileC5769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName5806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileName5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5857 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleFileName5876 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC5948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CODEC_in_ruleInlineCodeC5989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6085 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6106 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation6190 = new BitSet(new long[]{0x0001E00000000010L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation6211 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation6224 = new BitSet(new long[]{0x00000400000200B0L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6245 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation6258 = new BitSet(new long[]{0x00000400000200B0L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6279 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleAnnotation6293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement6411 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationElement6428 = new BitSet(new long[]{0x00000400000200A0L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue6486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementValue6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue6546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue6576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue6641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue6651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue6696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat6743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat6783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat6809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6854 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer6901 = new BitSet(new long[]{0x00000400000200A0L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6922 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer6935 = new BitSet(new long[]{0x00000400000200A0L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6956 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer6970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue7007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue7018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValue7058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleValue7091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue7124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleValue7150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleValue7174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleHexadecimalType7264 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType7279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType7336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAnnotationType7374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAnnotationType7393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAnnotationType7412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAnnotationType7431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleAnnotationType7459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType7505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType7516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAttributeType7554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAttributeType7573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleAttributeType7592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType7613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN7659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFQN7670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7710 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleFQN7729 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7744 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7850 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleFULL_IMPORT_NAME7868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath7909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath7920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePath7962 = new BitSet(new long[]{0x0020000000000100L});
        public static final BitSet FOLLOW_53_in_rulePath7981 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_37_in_rulePath8003 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_54_in_rulePath8022 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_SL_in_rulePath8040 = new BitSet(new long[]{0x0040000000000110L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePath8062 = new BitSet(new long[]{0x0080000000000110L});
        public static final BitSet FOLLOW_55_in_rulePath8081 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_54_in_rulePath8104 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_SL_in_rulePath8122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT8168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT8179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulesignedINT8218 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_55_in_rulesignedINT8237 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT8254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleRole8313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRole8330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_synpred3_InternalFractal395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_synpred4_InternalFractal425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_synpred9_InternalFractal691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_synpred11_InternalFractal732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_synpred12_InternalFractal830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred13_InternalFractal860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_synpred14_InternalFractal890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_synpred17_InternalFractal1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_synpred19_InternalFractal1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_synpred25_InternalFractal1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred31_InternalFractal2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_synpred32_InternalFractal2542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_synpred35_InternalFractal2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_synpred36_InternalFractal2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_synpred36_InternalFractal2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_synpred49_InternalFractal3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_synpred50_InternalFractal3606 = new BitSet(new long[]{0x0000000000000002L});
    }


}