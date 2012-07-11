package org.ow2.mind.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.ow2.mind.services.AdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INLINEDCODE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'type'", "'extends'", "','", "'{'", "'}'", "'abstract'", "'primitive'", "'('", "')'", "'composite'", "'<'", "'>'", "'conformsto'", "'='", "'provides'", "'as'", "'['", "']'", "'requires'", "'optional'", "'input'", "'output'", "':'", "'attribute'", "'data'", "'source'", "'/'", "'./'", "'../'", "'.'", "'contains'", "'binds'", "'this'", "'to'", "'@'", "'NULL'", "'null'", "'true'", "'false'", "'*'", "'struct'", "'union'", "'enum'", "'int'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'intptr_t'", "'uintptr_t'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_INLINEDCODE=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalAdlParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[236+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AdlGrammarAccess grammarAccess;
     	
        public InternalAdlParser(TokenStream input, IAstFactory factory, AdlGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/ow2/mind/parser/antlr/internal/InternalAdl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Definition";	
       	}
       	
       	@Override
       	protected AdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:84:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:85:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:86:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition81);
            iv_ruleDefinition=ruleDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefinition


    // $ANTLR start ruleDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:93:1: ruleDefinition returns [EObject current=null] : (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDefinition_0 = null;

        EObject this_ParametricDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:98:6: ( (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:99:1: (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:99:1: (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("99:1: (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition )", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("99:1: (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition )", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt1=1;
                }
                break;
            case 19:
            case 20:
            case 23:
                {
                alt1=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("99:1: (this_TypeDefinition_0= ruleTypeDefinition | this_ParametricDefinition_1= ruleParametricDefinition )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:100:2: this_TypeDefinition_0= ruleTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getTypeDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleDefinition141);
                    this_TypeDefinition_0=ruleTypeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:113:2: this_ParametricDefinition_1= ruleParametricDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getParametricDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParametricDefinition_in_ruleDefinition171);
                    this_ParametricDefinition_1=ruleParametricDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParametricDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDefinition


    // $ANTLR start entryRuleParametricDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:132:1: entryRuleParametricDefinition returns [EObject current=null] : iv_ruleParametricDefinition= ruleParametricDefinition EOF ;
    public final EObject entryRuleParametricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametricDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:133:2: (iv_ruleParametricDefinition= ruleParametricDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:134:2: iv_ruleParametricDefinition= ruleParametricDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParametricDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParametricDefinition_in_entryRuleParametricDefinition206);
            iv_ruleParametricDefinition=ruleParametricDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParametricDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametricDefinition216); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParametricDefinition


    // $ANTLR start ruleParametricDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:141:1: ruleParametricDefinition returns [EObject current=null] : (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition ) ;
    public final EObject ruleParametricDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveDefinition_0 = null;

        EObject this_CompositeDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:146:6: ( (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:147:1: (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:147:1: (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("147:1: (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition )", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("147:1: (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition )", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
            case 20:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("147:1: (this_PrimitiveDefinition_0= rulePrimitiveDefinition | this_CompositeDefinition_1= ruleCompositeDefinition )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:148:2: this_PrimitiveDefinition_0= rulePrimitiveDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParametricDefinitionAccess().getPrimitiveDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleParametricDefinition266);
                    this_PrimitiveDefinition_0=rulePrimitiveDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:161:2: this_CompositeDefinition_1= ruleCompositeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParametricDefinitionAccess().getCompositeDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleParametricDefinition296);
                    this_CompositeDefinition_1=ruleCompositeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompositeDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParametricDefinition


    // $ANTLR start entryRuleImport
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:180:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:181:2: (iv_ruleImport= ruleImport EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:182:2: iv_ruleImport= ruleImport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport331);
            iv_ruleImport=ruleImport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport341); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:189:1: ruleImport returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:194:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:195:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:195:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:195:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:195:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:196:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:196:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:197:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleImport387);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleImport398); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getImportKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:223:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:224:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:224:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:225:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport419);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildCard();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importedNamespace",
              	        		lv_importedNamespace_2_0, 
              	        		"QualifiedNameWithWildCard", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,13,FOLLOW_13_in_ruleImport429); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:259:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:260:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:261:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition465);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition475); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDefinition


    // $ANTLR start ruleTypeDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:268:1: ruleTypeDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'type' ( (lv_name_3_0= ruleQualifiedName ) ) ( 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_annotations_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_extends_5_0 = null;

        EObject lv_extends_7_0 = null;

        EObject lv_content_9_0 = null;

        EObject lv_content_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:273:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'type' ( (lv_name_3_0= ruleQualifiedName ) ) ( 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:274:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'type' ( (lv_name_3_0= ruleQualifiedName ) ) ( 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:274:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'type' ( (lv_name_3_0= ruleQualifiedName ) ) ( 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:274:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'type' ( (lv_name_3_0= ruleQualifiedName ) ) ( 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:274:2: ( (lv_imports_0_0= ruleImport ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==48) ) {
                    int LA4_1 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:275:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:275:1: (lv_imports_0_0= ruleImport )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:276:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleTypeDefinition521);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"imports",
            	      	        		lv_imports_0_0, 
            	      	        		"Import", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:298:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==48) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:299:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:299:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:300:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTypeDefinition543);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleTypeDefinition554); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:326:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:327:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:327:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:328:3: lv_name_3_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition575);
            lv_name_3_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:350:2: ( 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:350:4: 'extends' ( (lv_extends_5_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )*
                    {
                    match(input,15,FOLLOW_15_in_ruleTypeDefinition586); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:354:1: ( (lv_extends_5_0= ruleDefinitionReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:355:1: (lv_extends_5_0= ruleDefinitionReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:355:1: (lv_extends_5_0= ruleDefinitionReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:356:3: lv_extends_5_0= ruleDefinitionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getExtendsDefinitionReferenceParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionReference_in_ruleTypeDefinition607);
                    lv_extends_5_0=ruleDefinitionReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extends",
                      	        		lv_extends_5_0, 
                      	        		"DefinitionReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:378:2: ( ',' ( (lv_extends_7_0= ruleDefinitionReference ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:378:4: ',' ( (lv_extends_7_0= ruleDefinitionReference ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleTypeDefinition618); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getTypeDefinitionAccess().getCommaKeyword_4_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:382:1: ( (lv_extends_7_0= ruleDefinitionReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:383:1: (lv_extends_7_0= ruleDefinitionReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:383:1: (lv_extends_7_0= ruleDefinitionReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:384:3: lv_extends_7_0= ruleDefinitionReference
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getExtendsDefinitionReferenceParserRuleCall_4_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDefinitionReference_in_ruleTypeDefinition639);
                    	    lv_extends_7_0=ruleDefinitionReference();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extends",
                    	      	        		lv_extends_7_0, 
                    	      	        		"DefinitionReference", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:406:6: ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||LA12_0==28||LA12_0==32||(LA12_0>=34 && LA12_0<=35)||LA12_0==48) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("406:6: ( ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' ) | ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )* )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:406:7: ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:406:7: ( '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:406:9: '{' ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleTypeDefinition655); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:410:1: ( ( (lv_content_9_0= ruleInterface ) ) ( ';' )? )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28||LA9_0==32||(LA9_0>=34 && LA9_0<=35)||LA9_0==48) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:410:2: ( (lv_content_9_0= ruleInterface ) ) ( ';' )?
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:410:2: ( (lv_content_9_0= ruleInterface ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:411:1: (lv_content_9_0= ruleInterface )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:411:1: (lv_content_9_0= ruleInterface )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:412:3: lv_content_9_0= ruleInterface
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getContentInterfaceParserRuleCall_5_0_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_in_ruleTypeDefinition677);
                    	    lv_content_9_0=ruleInterface();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"content",
                    	      	        		lv_content_9_0, 
                    	      	        		"Interface", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:434:2: ( ';' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==13) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:434:4: ';'
                    	            {
                    	            match(input,13,FOLLOW_13_in_ruleTypeDefinition688); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_5_0_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleTypeDefinition702); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:443:6: ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )*
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:443:6: ( ( (lv_content_12_0= ruleInterface ) ) ( ';' )? )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28||LA11_0==32||(LA11_0>=34 && LA11_0<=35)||LA11_0==48) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:443:7: ( (lv_content_12_0= ruleInterface ) ) ( ';' )?
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:443:7: ( (lv_content_12_0= ruleInterface ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:444:1: (lv_content_12_0= ruleInterface )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:444:1: (lv_content_12_0= ruleInterface )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:445:3: lv_content_12_0= ruleInterface
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getContentInterfaceParserRuleCall_5_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_in_ruleTypeDefinition731);
                    	    lv_content_12_0=ruleInterface();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"content",
                    	      	        		lv_content_12_0, 
                    	      	        		"Interface", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:467:2: ( ';' )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==13) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:467:4: ';'
                    	            {
                    	            match(input,13,FOLLOW_13_in_ruleTypeDefinition742); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_5_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeDefinition


    // $ANTLR start entryRulePrimitiveDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:479:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:480:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:481:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition783);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition793); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveDefinition


    // $ANTLR start rulePrimitiveDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:488:1: rulePrimitiveDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_abstract_2_0= 'abstract' ) )? 'primitive' ( (lv_name_4_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* ) ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_2_0=null;
        EObject lv_imports_0_0 = null;

        EObject lv_annotations_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_extends_11_0 = null;

        EObject lv_extends_13_0 = null;

        EObject lv_content_15_1 = null;

        EObject lv_content_15_2 = null;

        EObject lv_content_15_3 = null;

        EObject lv_content_15_4 = null;

        EObject lv_content_18_1 = null;

        EObject lv_content_18_2 = null;

        EObject lv_content_18_3 = null;

        EObject lv_content_18_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:493:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_abstract_2_0= 'abstract' ) )? 'primitive' ( (lv_name_4_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:494:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_abstract_2_0= 'abstract' ) )? 'primitive' ( (lv_name_4_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:494:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_abstract_2_0= 'abstract' ) )? 'primitive' ( (lv_name_4_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:494:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_abstract_2_0= 'abstract' ) )? 'primitive' ( (lv_name_4_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:494:2: ( (lv_imports_0_0= ruleImport ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==48) ) {
                    int LA13_1 = input.LA(2);

                    if ( (synpred13()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:495:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:495:1: (lv_imports_0_0= ruleImport )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:496:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_rulePrimitiveDefinition839);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"imports",
            	      	        		lv_imports_0_0, 
            	      	        		"Import", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:518:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:519:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:519:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:520:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePrimitiveDefinition861);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:542:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:543:1: (lv_abstract_2_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:543:1: (lv_abstract_2_0= 'abstract' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:544:3: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_rulePrimitiveDefinition880); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_2_0(), "abstract"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "abstract", lv_abstract_2_0, "abstract", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_rulePrimitiveDefinition904); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:567:1: ( (lv_name_4_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:568:1: (lv_name_4_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:568:1: (lv_name_4_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:569:3: lv_name_4_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition925);
            lv_name_4_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_4_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:591:2: ( '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:591:4: '(' ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_rulePrimitiveDefinition936); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:595:1: ( ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:595:2: ( (lv_parameters_6_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )*
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:595:2: ( (lv_parameters_6_0= ruleParameterDecl ) )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:596:1: (lv_parameters_6_0= ruleParameterDecl )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:596:1: (lv_parameters_6_0= ruleParameterDecl )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:597:3: lv_parameters_6_0= ruleParameterDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getParametersParameterDeclParserRuleCall_5_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameterDecl_in_rulePrimitiveDefinition958);
                            lv_parameters_6_0=ruleParameterDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"parameters",
                              	        		lv_parameters_6_0, 
                              	        		"ParameterDecl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:619:2: ( ',' ( (lv_parameters_8_0= ruleParameterDecl ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==16) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:619:4: ',' ( (lv_parameters_8_0= ruleParameterDecl ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_rulePrimitiveDefinition969); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_5_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:623:1: ( (lv_parameters_8_0= ruleParameterDecl ) )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:624:1: (lv_parameters_8_0= ruleParameterDecl )
                            	    {
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:624:1: (lv_parameters_8_0= ruleParameterDecl )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:625:3: lv_parameters_8_0= ruleParameterDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getParametersParameterDeclParserRuleCall_5_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameterDecl_in_rulePrimitiveDefinition990);
                            	    lv_parameters_8_0=ruleParameterDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"parameters",
                            	      	        		lv_parameters_8_0, 
                            	      	        		"ParameterDecl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,22,FOLLOW_22_in_rulePrimitiveDefinition1004); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:651:3: ( 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:651:5: 'extends' ( (lv_extends_11_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )*
                    {
                    match(input,15,FOLLOW_15_in_rulePrimitiveDefinition1017); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_6_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:655:1: ( (lv_extends_11_0= ruleDefinitionReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:656:1: (lv_extends_11_0= ruleDefinitionReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:656:1: (lv_extends_11_0= ruleDefinitionReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:657:3: lv_extends_11_0= ruleDefinitionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getExtendsDefinitionReferenceParserRuleCall_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionReference_in_rulePrimitiveDefinition1038);
                    lv_extends_11_0=ruleDefinitionReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extends",
                      	        		lv_extends_11_0, 
                      	        		"DefinitionReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:679:2: ( ',' ( (lv_extends_13_0= ruleDefinitionReference ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:679:4: ',' ( (lv_extends_13_0= ruleDefinitionReference ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_rulePrimitiveDefinition1049); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_6_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:683:1: ( (lv_extends_13_0= ruleDefinitionReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:684:1: (lv_extends_13_0= ruleDefinitionReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:684:1: (lv_extends_13_0= ruleDefinitionReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:685:3: lv_extends_13_0= ruleDefinitionReference
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getExtendsDefinitionReferenceParserRuleCall_6_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDefinitionReference_in_rulePrimitiveDefinition1070);
                    	    lv_extends_13_0=ruleDefinitionReference();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extends",
                    	      	        		lv_extends_13_0, 
                    	      	        		"DefinitionReference", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:707:6: ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            else if ( (LA27_0==EOF||LA27_0==28||LA27_0==32||(LA27_0>=34 && LA27_0<=35)||(LA27_0>=37 && LA27_0<=39)||LA27_0==48) ) {
                alt27=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("707:6: ( ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )* )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:707:7: ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:707:7: ( '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:707:9: '{' ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )* '}'
                    {
                    match(input,17,FOLLOW_17_in_rulePrimitiveDefinition1086); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_7_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:711:1: ( ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )? )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==28||LA23_0==32||(LA23_0>=34 && LA23_0<=35)||(LA23_0>=37 && LA23_0<=39)||LA23_0==48) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:711:2: ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) ) ( ';' )?
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:711:2: ( ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:712:1: ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:712:1: ( (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:713:1: (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:713:1: (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource )
                    	    int alt21=4;
                    	    switch ( input.LA(1) ) {
                    	    case 48:
                    	        {
                    	        int LA21_1 = input.LA(2);

                    	        if ( (synpred21()) ) {
                    	            alt21=1;
                    	        }
                    	        else if ( (synpred22()) ) {
                    	            alt21=2;
                    	        }
                    	        else if ( (synpred23()) ) {
                    	            alt21=3;
                    	        }
                    	        else if ( (true) ) {
                    	            alt21=4;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("713:1: (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource )", 21, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 28:
                    	    case 32:
                    	    case 34:
                    	    case 35:
                    	        {
                    	        alt21=1;
                    	        }
                    	        break;
                    	    case 37:
                    	        {
                    	        alt21=2;
                    	        }
                    	        break;
                    	    case 38:
                    	        {
                    	        alt21=3;
                    	        }
                    	        break;
                    	    case 39:
                    	        {
                    	        alt21=4;
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("713:1: (lv_content_15_1= ruleInterface | lv_content_15_2= ruleAttribute | lv_content_15_3= ruleData | lv_content_15_4= ruleSource )", 21, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt21) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:714:3: lv_content_15_1= ruleInterface
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentInterfaceParserRuleCall_7_0_1_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleInterface_in_rulePrimitiveDefinition1110);
                    	            lv_content_15_1=ruleInterface();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_15_1, 
                    	              	        		"Interface", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:735:8: lv_content_15_2= ruleAttribute
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentAttributeParserRuleCall_7_0_1_0_0_1(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAttribute_in_rulePrimitiveDefinition1129);
                    	            lv_content_15_2=ruleAttribute();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_15_2, 
                    	              	        		"Attribute", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:756:8: lv_content_15_3= ruleData
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentDataParserRuleCall_7_0_1_0_0_2(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleData_in_rulePrimitiveDefinition1148);
                    	            lv_content_15_3=ruleData();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_15_3, 
                    	              	        		"Data", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:777:8: lv_content_15_4= ruleSource
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentSourceParserRuleCall_7_0_1_0_0_3(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleSource_in_rulePrimitiveDefinition1167);
                    	            lv_content_15_4=ruleSource();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_15_4, 
                    	              	        		"Source", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:801:2: ( ';' )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==13) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:801:4: ';'
                    	            {
                    	            match(input,13,FOLLOW_13_in_rulePrimitiveDefinition1181); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getSemicolonKeyword_7_0_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_rulePrimitiveDefinition1195); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_7_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:810:6: ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )*
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:810:6: ( ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )? )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==28||LA26_0==32||(LA26_0>=34 && LA26_0<=35)||(LA26_0>=37 && LA26_0<=39)||LA26_0==48) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:810:7: ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) ) ( ';' )?
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:810:7: ( ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:811:1: ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:811:1: ( (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:812:1: (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:812:1: (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource )
                    	    int alt24=4;
                    	    switch ( input.LA(1) ) {
                    	    case 48:
                    	        {
                    	        int LA24_1 = input.LA(2);

                    	        if ( (synpred27()) ) {
                    	            alt24=1;
                    	        }
                    	        else if ( (synpred28()) ) {
                    	            alt24=2;
                    	        }
                    	        else if ( (synpred29()) ) {
                    	            alt24=3;
                    	        }
                    	        else if ( (true) ) {
                    	            alt24=4;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("812:1: (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource )", 24, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 28:
                    	    case 32:
                    	    case 34:
                    	    case 35:
                    	        {
                    	        alt24=1;
                    	        }
                    	        break;
                    	    case 37:
                    	        {
                    	        alt24=2;
                    	        }
                    	        break;
                    	    case 38:
                    	        {
                    	        alt24=3;
                    	        }
                    	        break;
                    	    case 39:
                    	        {
                    	        alt24=4;
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("812:1: (lv_content_18_1= ruleInterface | lv_content_18_2= ruleAttribute | lv_content_18_3= ruleData | lv_content_18_4= ruleSource )", 24, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt24) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:813:3: lv_content_18_1= ruleInterface
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentInterfaceParserRuleCall_7_1_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleInterface_in_rulePrimitiveDefinition1226);
                    	            lv_content_18_1=ruleInterface();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_18_1, 
                    	              	        		"Interface", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:834:8: lv_content_18_2= ruleAttribute
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentAttributeParserRuleCall_7_1_0_0_1(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAttribute_in_rulePrimitiveDefinition1245);
                    	            lv_content_18_2=ruleAttribute();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_18_2, 
                    	              	        		"Attribute", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:855:8: lv_content_18_3= ruleData
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentDataParserRuleCall_7_1_0_0_2(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleData_in_rulePrimitiveDefinition1264);
                    	            lv_content_18_3=ruleData();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_18_3, 
                    	              	        		"Data", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:876:8: lv_content_18_4= ruleSource
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentSourceParserRuleCall_7_1_0_0_3(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleSource_in_rulePrimitiveDefinition1283);
                    	            lv_content_18_4=ruleSource();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_18_4, 
                    	              	        		"Source", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:900:2: ( ';' )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==13) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:900:4: ';'
                    	            {
                    	            match(input,13,FOLLOW_13_in_rulePrimitiveDefinition1297); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getPrimitiveDefinitionAccess().getSemicolonKeyword_7_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveDefinition


    // $ANTLR start entryRuleParameterDecl
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:912:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:913:2: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:914:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameterDecl_in_entryRuleParameterDecl1338);
            iv_ruleParameterDecl=ruleParameterDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDecl1348); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterDecl


    // $ANTLR start ruleParameterDecl
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:921:1: ruleParameterDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:926:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:927:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:927:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:928:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:928:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:929:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDecl1389); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParameterDeclAccess().getNameIDTerminalRuleCall_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterDecl


    // $ANTLR start entryRuleCompositeDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:959:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:960:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:961:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition1429);
            iv_ruleCompositeDefinition=ruleCompositeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinition1439); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeDefinition


    // $ANTLR start ruleCompositeDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:968:1: ruleCompositeDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' ( (lv_name_3_0= ruleQualifiedName ) ) ( '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>' )? ( '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* ) ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_annotations_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_templateParameters_5_0 = null;

        EObject lv_templateParameters_7_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_extends_15_0 = null;

        EObject lv_extends_17_0 = null;

        EObject lv_content_19_1 = null;

        EObject lv_content_19_2 = null;

        EObject lv_content_19_3 = null;

        EObject lv_content_22_1 = null;

        EObject lv_content_22_2 = null;

        EObject lv_content_22_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:973:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' ( (lv_name_3_0= ruleQualifiedName ) ) ( '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>' )? ( '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:974:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' ( (lv_name_3_0= ruleQualifiedName ) ) ( '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>' )? ( '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:974:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' ( (lv_name_3_0= ruleQualifiedName ) ) ( '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>' )? ( '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:974:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' ( (lv_name_3_0= ruleQualifiedName ) ) ( '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>' )? ( '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')' )? ( 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )* )? ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:974:2: ( (lv_imports_0_0= ruleImport ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    int LA28_1 = input.LA(2);

                    if ( (synpred32()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==12) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:975:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:975:1: (lv_imports_0_0= ruleImport )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:976:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleCompositeDefinition1485);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"imports",
            	      	        		lv_imports_0_0, 
            	      	        		"Import", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:998:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==48) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:999:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:999:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1000:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleCompositeDefinition1507);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleCompositeDefinition1518); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1026:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1027:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1027:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1028:3: lv_name_3_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition1539);
            lv_name_3_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1050:2: ( '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1050:4: '<' ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )? '>'
                    {
                    match(input,24,FOLLOW_24_in_ruleCompositeDefinition1550); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getLessThanSignKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1054:1: ( ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1054:2: ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) ) ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )*
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1054:2: ( (lv_templateParameters_5_0= ruleTemplateParameterDecl ) )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1055:1: (lv_templateParameters_5_0= ruleTemplateParameterDecl )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1055:1: (lv_templateParameters_5_0= ruleTemplateParameterDecl )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1056:3: lv_templateParameters_5_0= ruleTemplateParameterDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateParametersTemplateParameterDeclParserRuleCall_4_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTemplateParameterDecl_in_ruleCompositeDefinition1572);
                            lv_templateParameters_5_0=ruleTemplateParameterDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"templateParameters",
                              	        		lv_templateParameters_5_0, 
                              	        		"TemplateParameterDecl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1078:2: ( ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==16) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1078:4: ',' ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleCompositeDefinition1583); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_4_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1082:1: ( (lv_templateParameters_7_0= ruleTemplateParameterDecl ) )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1083:1: (lv_templateParameters_7_0= ruleTemplateParameterDecl )
                            	    {
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1083:1: (lv_templateParameters_7_0= ruleTemplateParameterDecl )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1084:3: lv_templateParameters_7_0= ruleTemplateParameterDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateParametersTemplateParameterDeclParserRuleCall_4_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleTemplateParameterDecl_in_ruleCompositeDefinition1604);
                            	    lv_templateParameters_7_0=ruleTemplateParameterDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"templateParameters",
                            	      	        		lv_templateParameters_7_0, 
                            	      	        		"TemplateParameterDecl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_ruleCompositeDefinition1618); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getGreaterThanSignKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1110:3: ( '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1110:5: '(' ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleCompositeDefinition1631); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1114:1: ( ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1114:2: ( (lv_parameters_10_0= ruleParameterDecl ) ) ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )*
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1114:2: ( (lv_parameters_10_0= ruleParameterDecl ) )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1115:1: (lv_parameters_10_0= ruleParameterDecl )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1115:1: (lv_parameters_10_0= ruleParameterDecl )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1116:3: lv_parameters_10_0= ruleParameterDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getParametersParameterDeclParserRuleCall_5_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameterDecl_in_ruleCompositeDefinition1653);
                            lv_parameters_10_0=ruleParameterDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"parameters",
                              	        		lv_parameters_10_0, 
                              	        		"ParameterDecl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1138:2: ( ',' ( (lv_parameters_12_0= ruleParameterDecl ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==16) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1138:4: ',' ( (lv_parameters_12_0= ruleParameterDecl ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleCompositeDefinition1664); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_5_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1142:1: ( (lv_parameters_12_0= ruleParameterDecl ) )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1143:1: (lv_parameters_12_0= ruleParameterDecl )
                            	    {
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1143:1: (lv_parameters_12_0= ruleParameterDecl )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1144:3: lv_parameters_12_0= ruleParameterDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getParametersParameterDeclParserRuleCall_5_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameterDecl_in_ruleCompositeDefinition1685);
                            	    lv_parameters_12_0=ruleParameterDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"parameters",
                            	      	        		lv_parameters_12_0, 
                            	      	        		"ParameterDecl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,22,FOLLOW_22_in_ruleCompositeDefinition1699); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1170:3: ( 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1170:5: 'extends' ( (lv_extends_15_0= ruleDefinitionReference ) ) ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )*
                    {
                    match(input,15,FOLLOW_15_in_ruleCompositeDefinition1712); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_6_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1174:1: ( (lv_extends_15_0= ruleDefinitionReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1175:1: (lv_extends_15_0= ruleDefinitionReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1175:1: (lv_extends_15_0= ruleDefinitionReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1176:3: lv_extends_15_0= ruleDefinitionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getExtendsDefinitionReferenceParserRuleCall_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionReference_in_ruleCompositeDefinition1733);
                    lv_extends_15_0=ruleDefinitionReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extends",
                      	        		lv_extends_15_0, 
                      	        		"DefinitionReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1198:2: ( ',' ( (lv_extends_17_0= ruleDefinitionReference ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1198:4: ',' ( (lv_extends_17_0= ruleDefinitionReference ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleCompositeDefinition1744); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_6_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1202:1: ( (lv_extends_17_0= ruleDefinitionReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1203:1: (lv_extends_17_0= ruleDefinitionReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1203:1: (lv_extends_17_0= ruleDefinitionReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1204:3: lv_extends_17_0= ruleDefinitionReference
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getExtendsDefinitionReferenceParserRuleCall_6_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDefinitionReference_in_ruleCompositeDefinition1765);
                    	    lv_extends_17_0=ruleDefinitionReference();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extends",
                    	      	        		lv_extends_17_0, 
                    	      	        		"DefinitionReference", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1226:6: ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==17) ) {
                alt44=1;
            }
            else if ( (LA44_0==EOF||LA44_0==28||LA44_0==32||(LA44_0>=34 && LA44_0<=35)||(LA44_0>=44 && LA44_0<=45)||LA44_0==48) ) {
                alt44=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1226:6: ( ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' ) | ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )* )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1226:7: ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1226:7: ( '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1226:9: '{' ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleCompositeDefinition1781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_7_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1230:1: ( ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )? )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==28||LA40_0==32||(LA40_0>=34 && LA40_0<=35)||(LA40_0>=44 && LA40_0<=45)||LA40_0==48) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1230:2: ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) ) ( ';' )?
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1230:2: ( ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1231:1: ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1231:1: ( (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1232:1: (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1232:1: (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding )
                    	    int alt38=3;
                    	    switch ( input.LA(1) ) {
                    	    case 48:
                    	        {
                    	        int LA38_1 = input.LA(2);

                    	        if ( (synpred42()) ) {
                    	            alt38=1;
                    	        }
                    	        else if ( (synpred43()) ) {
                    	            alt38=2;
                    	        }
                    	        else if ( (true) ) {
                    	            alt38=3;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("1232:1: (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding )", 38, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 28:
                    	    case 32:
                    	    case 34:
                    	    case 35:
                    	        {
                    	        alt38=1;
                    	        }
                    	        break;
                    	    case 44:
                    	        {
                    	        alt38=2;
                    	        }
                    	        break;
                    	    case 45:
                    	        {
                    	        alt38=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1232:1: (lv_content_19_1= ruleInterface | lv_content_19_2= ruleSubComponent | lv_content_19_3= ruleBinding )", 38, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt38) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1233:3: lv_content_19_1= ruleInterface
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentInterfaceParserRuleCall_7_0_1_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleInterface_in_ruleCompositeDefinition1805);
                    	            lv_content_19_1=ruleInterface();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_19_1, 
                    	              	        		"Interface", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1254:8: lv_content_19_2= ruleSubComponent
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentSubComponentParserRuleCall_7_0_1_0_0_1(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleSubComponent_in_ruleCompositeDefinition1824);
                    	            lv_content_19_2=ruleSubComponent();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_19_2, 
                    	              	        		"SubComponent", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1275:8: lv_content_19_3= ruleBinding
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentBindingParserRuleCall_7_0_1_0_0_2(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleBinding_in_ruleCompositeDefinition1843);
                    	            lv_content_19_3=ruleBinding();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_19_3, 
                    	              	        		"Binding", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1299:2: ( ';' )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==13) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1299:4: ';'
                    	            {
                    	            match(input,13,FOLLOW_13_in_ruleCompositeDefinition1857); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getCompositeDefinitionAccess().getSemicolonKeyword_7_0_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleCompositeDefinition1871); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_7_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1308:6: ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )*
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1308:6: ( ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )? )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==28||LA43_0==32||(LA43_0>=34 && LA43_0<=35)||(LA43_0>=44 && LA43_0<=45)||LA43_0==48) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1308:7: ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) ) ( ';' )?
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1308:7: ( ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1309:1: ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1309:1: ( (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1310:1: (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1310:1: (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding )
                    	    int alt41=3;
                    	    switch ( input.LA(1) ) {
                    	    case 48:
                    	        {
                    	        int LA41_1 = input.LA(2);

                    	        if ( (synpred47()) ) {
                    	            alt41=1;
                    	        }
                    	        else if ( (synpred48()) ) {
                    	            alt41=2;
                    	        }
                    	        else if ( (true) ) {
                    	            alt41=3;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("1310:1: (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding )", 41, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 28:
                    	    case 32:
                    	    case 34:
                    	    case 35:
                    	        {
                    	        alt41=1;
                    	        }
                    	        break;
                    	    case 44:
                    	        {
                    	        alt41=2;
                    	        }
                    	        break;
                    	    case 45:
                    	        {
                    	        alt41=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1310:1: (lv_content_22_1= ruleInterface | lv_content_22_2= ruleSubComponent | lv_content_22_3= ruleBinding )", 41, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt41) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1311:3: lv_content_22_1= ruleInterface
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentInterfaceParserRuleCall_7_1_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleInterface_in_ruleCompositeDefinition1902);
                    	            lv_content_22_1=ruleInterface();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_22_1, 
                    	              	        		"Interface", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1332:8: lv_content_22_2= ruleSubComponent
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentSubComponentParserRuleCall_7_1_0_0_1(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleSubComponent_in_ruleCompositeDefinition1921);
                    	            lv_content_22_2=ruleSubComponent();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_22_2, 
                    	              	        		"SubComponent", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1353:8: lv_content_22_3= ruleBinding
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentBindingParserRuleCall_7_1_0_0_2(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleBinding_in_ruleCompositeDefinition1940);
                    	            lv_content_22_3=ruleBinding();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"content",
                    	              	        		lv_content_22_3, 
                    	              	        		"Binding", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1377:2: ( ';' )?
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==13) ) {
                    	        alt42=1;
                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1377:4: ';'
                    	            {
                    	            match(input,13,FOLLOW_13_in_ruleCompositeDefinition1954); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getCompositeDefinitionAccess().getSemicolonKeyword_7_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeDefinition


    // $ANTLR start entryRuleTemplateParameterDecl
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1389:1: entryRuleTemplateParameterDecl returns [EObject current=null] : iv_ruleTemplateParameterDecl= ruleTemplateParameterDecl EOF ;
    public final EObject entryRuleTemplateParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterDecl = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1390:2: (iv_ruleTemplateParameterDecl= ruleTemplateParameterDecl EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1391:2: iv_ruleTemplateParameterDecl= ruleTemplateParameterDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateParameterDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateParameterDecl_in_entryRuleTemplateParameterDecl1995);
            iv_ruleTemplateParameterDecl=ruleTemplateParameterDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateParameterDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterDecl2005); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateParameterDecl


    // $ANTLR start ruleTemplateParameterDecl
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1398:1: ruleTemplateParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_type_2_0= ruleDefinitionReference ) ) ) ;
    public final EObject ruleTemplateParameterDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1403:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_type_2_0= ruleDefinitionReference ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1404:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_type_2_0= ruleDefinitionReference ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1404:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_type_2_0= ruleDefinitionReference ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1404:2: ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_type_2_0= ruleDefinitionReference ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1404:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1405:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1405:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1406:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateParameterDecl2047); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTemplateParameterDeclAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateParameterDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,26,FOLLOW_26_in_ruleTemplateParameterDecl2062); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateParameterDeclAccess().getConformstoKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1432:1: ( (lv_type_2_0= ruleDefinitionReference ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1433:1: (lv_type_2_0= ruleDefinitionReference )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1433:1: (lv_type_2_0= ruleDefinitionReference )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1434:3: lv_type_2_0= ruleDefinitionReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateParameterDeclAccess().getTypeDefinitionReferenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDefinitionReference_in_ruleTemplateParameterDecl2083);
            lv_type_2_0=ruleDefinitionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateParameterDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_2_0, 
              	        		"DefinitionReference", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateParameterDecl


    // $ANTLR start entryRuleDefinitionReference
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1464:1: entryRuleDefinitionReference returns [EObject current=null] : iv_ruleDefinitionReference= ruleDefinitionReference EOF ;
    public final EObject entryRuleDefinitionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionReference = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1465:2: (iv_ruleDefinitionReference= ruleDefinitionReference EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1466:2: iv_ruleDefinitionReference= ruleDefinitionReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefinitionReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDefinitionReference_in_entryRuleDefinitionReference2119);
            iv_ruleDefinitionReference=ruleDefinitionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefinitionReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionReference2129); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefinitionReference


    // $ANTLR start ruleDefinitionReference
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1473:1: ruleDefinitionReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>' )? ( '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')' )? ) ;
    public final EObject ruleDefinitionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_templateParameters_2_0 = null;

        EObject lv_templateParameters_4_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1478:6: ( ( ( ( ruleQualifiedName ) ) ( '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>' )? ( '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1479:1: ( ( ( ruleQualifiedName ) ) ( '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>' )? ( '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1479:1: ( ( ( ruleQualifiedName ) ) ( '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>' )? ( '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1479:2: ( ( ruleQualifiedName ) ) ( '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>' )? ( '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1479:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1480:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1480:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1481:3: ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getDefinitionReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDefinitionReferenceAccess().getDefinitionDefinitionOrTemplateCrossReference_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDefinitionReference2181);
            ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1498:2: ( '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1498:4: '<' ( (lv_templateParameters_2_0= ruleTemplateParameter ) ) ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )* '>'
                    {
                    match(input,24,FOLLOW_24_in_ruleDefinitionReference2192); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionReferenceAccess().getLessThanSignKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1502:1: ( (lv_templateParameters_2_0= ruleTemplateParameter ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1503:1: (lv_templateParameters_2_0= ruleTemplateParameter )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1503:1: (lv_templateParameters_2_0= ruleTemplateParameter )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1504:3: lv_templateParameters_2_0= ruleTemplateParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDefinitionReferenceAccess().getTemplateParametersTemplateParameterParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleDefinitionReference2213);
                    lv_templateParameters_2_0=ruleTemplateParameter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDefinitionReferenceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"templateParameters",
                      	        		lv_templateParameters_2_0, 
                      	        		"TemplateParameter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1526:2: ( ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==16) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1526:4: ',' ( (lv_templateParameters_4_0= ruleTemplateParameter ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleDefinitionReference2224); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getDefinitionReferenceAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1530:1: ( (lv_templateParameters_4_0= ruleTemplateParameter ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1531:1: (lv_templateParameters_4_0= ruleTemplateParameter )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1531:1: (lv_templateParameters_4_0= ruleTemplateParameter )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1532:3: lv_templateParameters_4_0= ruleTemplateParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getDefinitionReferenceAccess().getTemplateParametersTemplateParameterParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleDefinitionReference2245);
                    	    lv_templateParameters_4_0=ruleTemplateParameter();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getDefinitionReferenceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"templateParameters",
                    	      	        		lv_templateParameters_4_0, 
                    	      	        		"TemplateParameter", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleDefinitionReference2257); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionReferenceAccess().getGreaterThanSignKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1558:3: ( '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1558:5: '(' ( (lv_parameters_7_0= ruleParameter ) ) ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )* ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleDefinitionReference2270); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionReferenceAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1562:1: ( (lv_parameters_7_0= ruleParameter ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1563:1: (lv_parameters_7_0= ruleParameter )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1563:1: (lv_parameters_7_0= ruleParameter )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1564:3: lv_parameters_7_0= ruleParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDefinitionReferenceAccess().getParametersParameterParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleDefinitionReference2291);
                    lv_parameters_7_0=ruleParameter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDefinitionReferenceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameters",
                      	        		lv_parameters_7_0, 
                      	        		"Parameter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1586:2: ( ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==16) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1586:4: ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleDefinitionReference2302); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getDefinitionReferenceAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1590:1: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1591:1: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1591:1: (lv_parameters_9_0= ruleParameter )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1592:3: lv_parameters_9_0= ruleParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getDefinitionReferenceAccess().getParametersParameterParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleDefinitionReference2323);
                    	    lv_parameters_9_0=ruleParameter();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getDefinitionReferenceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parameters",
                    	      	        		lv_parameters_9_0, 
                    	      	        		"Parameter", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleDefinitionReference2335); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionReferenceAccess().getRightParenthesisKeyword_2_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDefinitionReference


    // $ANTLR start entryRuleTemplateParameter
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1628:1: entryRuleTemplateParameter returns [EObject current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final EObject entryRuleTemplateParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameter = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1629:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1630:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateParameterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter2375);
            iv_ruleTemplateParameter=ruleTemplateParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter2385); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateParameter


    // $ANTLR start ruleTemplateParameter
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1637:1: ruleTemplateParameter returns [EObject current=null] : (this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment | ( () ( (lv_value_2_0= ruleDefinitionReference ) ) ) ) ;
    public final EObject ruleTemplateParameter() throws RecognitionException {
        EObject current = null;

        EObject this_TemplateParameterAssignment_0 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1642:6: ( (this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment | ( () ( (lv_value_2_0= ruleDefinitionReference ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1643:1: (this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment | ( () ( (lv_value_2_0= ruleDefinitionReference ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1643:1: (this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment | ( () ( (lv_value_2_0= ruleDefinitionReference ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==27) ) {
                    alt49=1;
                }
                else if ( (LA49_1==EOF||LA49_1==16||LA49_1==21||(LA49_1>=24 && LA49_1<=25)||LA49_1==43) ) {
                    alt49=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1643:1: (this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment | ( () ( (lv_value_2_0= ruleDefinitionReference ) ) ) )", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1643:1: (this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment | ( () ( (lv_value_2_0= ruleDefinitionReference ) ) ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1644:2: this_TemplateParameterAssignment_0= ruleTemplateParameterAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplateParameterAccess().getTemplateParameterAssignmentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateParameterAssignment_in_ruleTemplateParameter2435);
                    this_TemplateParameterAssignment_0=ruleTemplateParameterAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TemplateParameterAssignment_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1656:6: ( () ( (lv_value_2_0= ruleDefinitionReference ) ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1656:6: ( () ( (lv_value_2_0= ruleDefinitionReference ) ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1656:7: () ( (lv_value_2_0= ruleDefinitionReference ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1656:7: ()
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1657:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTemplateParameterAccess().getTemplateValueAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTemplateParameterAccess().getTemplateValueAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1670:2: ( (lv_value_2_0= ruleDefinitionReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1671:1: (lv_value_2_0= ruleDefinitionReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1671:1: (lv_value_2_0= ruleDefinitionReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1672:3: lv_value_2_0= ruleDefinitionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTemplateParameterAccess().getValueDefinitionReferenceParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionReference_in_ruleTemplateParameter2474);
                    lv_value_2_0=ruleDefinitionReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTemplateParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_2_0, 
                      	        		"DefinitionReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateParameter


    // $ANTLR start entryRuleTemplateParameterAssignment
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1702:1: entryRuleTemplateParameterAssignment returns [EObject current=null] : iv_ruleTemplateParameterAssignment= ruleTemplateParameterAssignment EOF ;
    public final EObject entryRuleTemplateParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterAssignment = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1703:2: (iv_ruleTemplateParameterAssignment= ruleTemplateParameterAssignment EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1704:2: iv_ruleTemplateParameterAssignment= ruleTemplateParameterAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateParameterAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateParameterAssignment_in_entryRuleTemplateParameterAssignment2511);
            iv_ruleTemplateParameterAssignment=ruleTemplateParameterAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateParameterAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterAssignment2521); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateParameterAssignment


    // $ANTLR start ruleTemplateParameterAssignment
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1711:1: ruleTemplateParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleDefinitionReference ) ) ) ;
    public final EObject ruleTemplateParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1716:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleDefinitionReference ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1717:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleDefinitionReference ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1717:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleDefinitionReference ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1717:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleDefinitionReference ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1717:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1718:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1718:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1719:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateParameterAssignment2563); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTemplateParameterAssignmentAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateParameterAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,27,FOLLOW_27_in_ruleTemplateParameterAssignment2578); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateParameterAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1745:1: ( (lv_value_2_0= ruleDefinitionReference ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1746:1: (lv_value_2_0= ruleDefinitionReference )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1746:1: (lv_value_2_0= ruleDefinitionReference )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1747:3: lv_value_2_0= ruleDefinitionReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateParameterAssignmentAccess().getValueDefinitionReferenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDefinitionReference_in_ruleTemplateParameterAssignment2599);
            lv_value_2_0=ruleDefinitionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateParameterAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"DefinitionReference", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateParameterAssignment


    // $ANTLR start entryRuleParameter
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1777:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1778:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1779:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2635);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2645); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1786:1: ruleParameter returns [EObject current=null] : (this_ParameterAssignment_0= ruleParameterAssignment | ( () ( (lv_value_2_0= ruleParameterValue ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterAssignment_0 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1791:6: ( (this_ParameterAssignment_0= ruleParameterAssignment | ( () ( (lv_value_2_0= ruleParameterValue ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1792:1: (this_ParameterAssignment_0= ruleParameterAssignment | ( () ( (lv_value_2_0= ruleParameterValue ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1792:1: (this_ParameterAssignment_0= ruleParameterAssignment | ( () ( (lv_value_2_0= ruleParameterValue ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==27) ) {
                    alt50=1;
                }
                else if ( (LA50_1==EOF||LA50_1==16||LA50_1==22||LA50_1==40||LA50_1==43) ) {
                    alt50=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1792:1: (this_ParameterAssignment_0= ruleParameterAssignment | ( () ( (lv_value_2_0= ruleParameterValue ) ) ) )", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA50_0>=RULE_INT && LA50_0<=RULE_STRING)||(LA50_0>=40 && LA50_0<=42)||(LA50_0>=49 && LA50_0<=52)) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1792:1: (this_ParameterAssignment_0= ruleParameterAssignment | ( () ( (lv_value_2_0= ruleParameterValue ) ) ) )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1793:2: this_ParameterAssignment_0= ruleParameterAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterAssignmentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleParameter2695);
                    this_ParameterAssignment_0=ruleParameterAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParameterAssignment_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1805:6: ( () ( (lv_value_2_0= ruleParameterValue ) ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1805:6: ( () ( (lv_value_2_0= ruleParameterValue ) ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1805:7: () ( (lv_value_2_0= ruleParameterValue ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1805:7: ()
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1806:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getParameterAccess().getParameterAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getParameterAccess().getParameterAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1819:2: ( (lv_value_2_0= ruleParameterValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1820:1: (lv_value_2_0= ruleParameterValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1820:1: (lv_value_2_0= ruleParameterValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1821:3: lv_value_2_0= ruleParameterValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterValue_in_ruleParameter2734);
                    lv_value_2_0=ruleParameterValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_2_0, 
                      	        		"ParameterValue", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleParameterAssignment
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1851:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1852:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1853:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment2771);
            iv_ruleParameterAssignment=ruleParameterAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAssignment2781); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterAssignment


    // $ANTLR start ruleParameterAssignment
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1860:1: ruleParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleParameterValue ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1865:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleParameterValue ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1866:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleParameterValue ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1866:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleParameterValue ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1866:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleParameterValue ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1866:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1867:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1867:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1868:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterAssignment2823); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParameterAssignmentAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,27,FOLLOW_27_in_ruleParameterAssignment2838); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1894:1: ( (lv_value_2_0= ruleParameterValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1895:1: (lv_value_2_0= ruleParameterValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1895:1: (lv_value_2_0= ruleParameterValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1896:3: lv_value_2_0= ruleParameterValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueParameterValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterValue_in_ruleParameterAssignment2859);
            lv_value_2_0=ruleParameterValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"ParameterValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterAssignment


    // $ANTLR start entryRuleParameterValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1926:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1927:2: (iv_ruleParameterValue= ruleParameterValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1928:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameterValue_in_entryRuleParameterValue2895);
            iv_ruleParameterValue=ruleParameterValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValue2905); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterValue


    // $ANTLR start ruleParameterValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1935:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1940:6: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1941:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1941:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_STRING)||(LA51_0>=40 && LA51_0<=42)||(LA51_0>=49 && LA51_0<=52)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==EOF||LA51_2==16||LA51_2==22) ) {
                    alt51=2;
                }
                else if ( (LA51_2==40||LA51_2==43) ) {
                    alt51=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1941:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1941:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1941:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1941:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1942:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1942:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1943:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterValueAccess().getLiteralLiteralParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleParameterValue2951);
                    lv_literal_0_0=ruleLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"literal",
                      	        		lv_literal_0_0, 
                      	        		"Literal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1966:6: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1966:6: ( ( RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1967:1: ( RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1967:1: ( RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1968:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterValue2979); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getParameterValueAccess().getRefParameterDeclCrossReference_1_0(), "ref"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterValue


    // $ANTLR start entryRuleContent
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1991:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1992:2: (iv_ruleContent= ruleContent EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1993:2: iv_ruleContent= ruleContent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent3015);
            iv_ruleContent=ruleContent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent3025); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContent


    // $ANTLR start ruleContent
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2000:1: ruleContent returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Attribute_1= ruleAttribute | this_Implementation_2= ruleImplementation | this_SubComponent_3= ruleSubComponent | this_Binding_4= ruleBinding ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_Implementation_2 = null;

        EObject this_SubComponent_3 = null;

        EObject this_Binding_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2005:6: ( (this_Interface_0= ruleInterface | this_Attribute_1= ruleAttribute | this_Implementation_2= ruleImplementation | this_SubComponent_3= ruleSubComponent | this_Binding_4= ruleBinding ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2006:1: (this_Interface_0= ruleInterface | this_Attribute_1= ruleAttribute | this_Implementation_2= ruleImplementation | this_SubComponent_3= ruleSubComponent | this_Binding_4= ruleBinding )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2006:1: (this_Interface_0= ruleInterface | this_Attribute_1= ruleAttribute | this_Implementation_2= ruleImplementation | this_SubComponent_3= ruleSubComponent | this_Binding_4= ruleBinding )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA52_1 = input.LA(2);

                if ( (synpred58()) ) {
                    alt52=1;
                }
                else if ( (synpred59()) ) {
                    alt52=2;
                }
                else if ( (synpred60()) ) {
                    alt52=3;
                }
                else if ( (synpred61()) ) {
                    alt52=4;
                }
                else if ( (true) ) {
                    alt52=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2006:1: (this_Interface_0= ruleInterface | this_Attribute_1= ruleAttribute | this_Implementation_2= ruleImplementation | this_SubComponent_3= ruleSubComponent | this_Binding_4= ruleBinding )", 52, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 32:
            case 34:
            case 35:
                {
                alt52=1;
                }
                break;
            case 37:
                {
                alt52=2;
                }
                break;
            case 38:
            case 39:
                {
                alt52=3;
                }
                break;
            case 44:
                {
                alt52=4;
                }
                break;
            case 45:
                {
                alt52=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2006:1: (this_Interface_0= ruleInterface | this_Attribute_1= ruleAttribute | this_Implementation_2= ruleImplementation | this_SubComponent_3= ruleSubComponent | this_Binding_4= ruleBinding )", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2007:2: this_Interface_0= ruleInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContentAccess().getInterfaceParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterface_in_ruleContent3075);
                    this_Interface_0=ruleInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Interface_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2020:2: this_Attribute_1= ruleAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContentAccess().getAttributeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleContent3105);
                    this_Attribute_1=ruleAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Attribute_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2033:2: this_Implementation_2= ruleImplementation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContentAccess().getImplementationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementation_in_ruleContent3135);
                    this_Implementation_2=ruleImplementation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Implementation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2046:2: this_SubComponent_3= ruleSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContentAccess().getSubComponentParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponent_in_ruleContent3165);
                    this_SubComponent_3=ruleSubComponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SubComponent_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2059:2: this_Binding_4= ruleBinding
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContentAccess().getBindingParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_in_ruleContent3195);
                    this_Binding_4=ruleBinding();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Binding_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContent


    // $ANTLR start entryRuleInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2078:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2079:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2080:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface3230);
            iv_ruleInterface=ruleInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface3240); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterface


    // $ANTLR start ruleInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2087:1: ruleInterface returns [EObject current=null] : (this_TypeInterface_0= ruleTypeInterface | this_FlowInterface_1= ruleFlowInterface ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        EObject this_TypeInterface_0 = null;

        EObject this_FlowInterface_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2092:6: ( (this_TypeInterface_0= ruleTypeInterface | this_FlowInterface_1= ruleFlowInterface ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2093:1: (this_TypeInterface_0= ruleTypeInterface | this_FlowInterface_1= ruleFlowInterface )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2093:1: (this_TypeInterface_0= ruleTypeInterface | this_FlowInterface_1= ruleFlowInterface )
            int alt53=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA53_1 = input.LA(2);

                if ( (synpred62()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2093:1: (this_TypeInterface_0= ruleTypeInterface | this_FlowInterface_1= ruleFlowInterface )", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 32:
                {
                alt53=1;
                }
                break;
            case 34:
            case 35:
                {
                alt53=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2093:1: (this_TypeInterface_0= ruleTypeInterface | this_FlowInterface_1= ruleFlowInterface )", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2094:2: this_TypeInterface_0= ruleTypeInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getTypeInterfaceParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeInterface_in_ruleInterface3290);
                    this_TypeInterface_0=ruleTypeInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeInterface_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2107:2: this_FlowInterface_1= ruleFlowInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getFlowInterfaceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFlowInterface_in_ruleInterface3320);
                    this_FlowInterface_1=ruleFlowInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FlowInterface_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterface


    // $ANTLR start entryRuleTypeInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2126:1: entryRuleTypeInterface returns [EObject current=null] : iv_ruleTypeInterface= ruleTypeInterface EOF ;
    public final EObject entryRuleTypeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2127:2: (iv_ruleTypeInterface= ruleTypeInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2128:2: iv_ruleTypeInterface= ruleTypeInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeInterface_in_entryRuleTypeInterface3355);
            iv_ruleTypeInterface=ruleTypeInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeInterface3365); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeInterface


    // $ANTLR start ruleTypeInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2135:1: ruleTypeInterface returns [EObject current=null] : (this_ServerInterface_0= ruleServerInterface | this_ClientInterface_1= ruleClientInterface ) ;
    public final EObject ruleTypeInterface() throws RecognitionException {
        EObject current = null;

        EObject this_ServerInterface_0 = null;

        EObject this_ClientInterface_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2140:6: ( (this_ServerInterface_0= ruleServerInterface | this_ClientInterface_1= ruleClientInterface ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2141:1: (this_ServerInterface_0= ruleServerInterface | this_ClientInterface_1= ruleClientInterface )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2141:1: (this_ServerInterface_0= ruleServerInterface | this_ClientInterface_1= ruleClientInterface )
            int alt54=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA54_1 = input.LA(2);

                if ( (synpred63()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2141:1: (this_ServerInterface_0= ruleServerInterface | this_ClientInterface_1= ruleClientInterface )", 54, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt54=1;
                }
                break;
            case 32:
                {
                alt54=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2141:1: (this_ServerInterface_0= ruleServerInterface | this_ClientInterface_1= ruleClientInterface )", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2142:2: this_ServerInterface_0= ruleServerInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeInterfaceAccess().getServerInterfaceParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleServerInterface_in_ruleTypeInterface3415);
                    this_ServerInterface_0=ruleServerInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ServerInterface_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2155:2: this_ClientInterface_1= ruleClientInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeInterfaceAccess().getClientInterfaceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleClientInterface_in_ruleTypeInterface3445);
                    this_ClientInterface_1=ruleClientInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ClientInterface_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeInterface


    // $ANTLR start entryRuleFlowInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2174:1: entryRuleFlowInterface returns [EObject current=null] : iv_ruleFlowInterface= ruleFlowInterface EOF ;
    public final EObject entryRuleFlowInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2175:2: (iv_ruleFlowInterface= ruleFlowInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2176:2: iv_ruleFlowInterface= ruleFlowInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFlowInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFlowInterface_in_entryRuleFlowInterface3480);
            iv_ruleFlowInterface=ruleFlowInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFlowInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowInterface3490); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFlowInterface


    // $ANTLR start ruleFlowInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2183:1: ruleFlowInterface returns [EObject current=null] : (this_InputInterface_0= ruleInputInterface | this_OutputInterface_1= ruleOutputInterface ) ;
    public final EObject ruleFlowInterface() throws RecognitionException {
        EObject current = null;

        EObject this_InputInterface_0 = null;

        EObject this_OutputInterface_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2188:6: ( (this_InputInterface_0= ruleInputInterface | this_OutputInterface_1= ruleOutputInterface ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2189:1: (this_InputInterface_0= ruleInputInterface | this_OutputInterface_1= ruleOutputInterface )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2189:1: (this_InputInterface_0= ruleInputInterface | this_OutputInterface_1= ruleOutputInterface )
            int alt55=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA55_1 = input.LA(2);

                if ( (synpred64()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2189:1: (this_InputInterface_0= ruleInputInterface | this_OutputInterface_1= ruleOutputInterface )", 55, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt55=1;
                }
                break;
            case 35:
                {
                alt55=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2189:1: (this_InputInterface_0= ruleInputInterface | this_OutputInterface_1= ruleOutputInterface )", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2190:2: this_InputInterface_0= ruleInputInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFlowInterfaceAccess().getInputInterfaceParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInputInterface_in_ruleFlowInterface3540);
                    this_InputInterface_0=ruleInputInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InputInterface_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2203:2: this_OutputInterface_1= ruleOutputInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFlowInterfaceAccess().getOutputInterfaceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputInterface_in_ruleFlowInterface3570);
                    this_OutputInterface_1=ruleOutputInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OutputInterface_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlowInterface


    // $ANTLR start entryRuleServerInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2222:1: entryRuleServerInterface returns [EObject current=null] : iv_ruleServerInterface= ruleServerInterface EOF ;
    public final EObject entryRuleServerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2223:2: (iv_ruleServerInterface= ruleServerInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2224:2: iv_ruleServerInterface= ruleServerInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getServerInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleServerInterface_in_entryRuleServerInterface3605);
            iv_ruleServerInterface=ruleServerInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleServerInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServerInterface3615); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleServerInterface


    // $ANTLR start ruleServerInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2231:1: ruleServerInterface returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'provides' ( (lv_signature_2_0= ruleQualifiedName ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']' )? ) ;
    public final EObject ruleServerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_signature_2_0 = null;

        EObject lv_size_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2236:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'provides' ( (lv_signature_2_0= ruleQualifiedName ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2237:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'provides' ( (lv_signature_2_0= ruleQualifiedName ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2237:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'provides' ( (lv_signature_2_0= ruleQualifiedName ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2237:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'provides' ( (lv_signature_2_0= ruleQualifiedName ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2237:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==48) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2238:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2238:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2239:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getServerInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleServerInterface3661);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getServerInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_ruleServerInterface3672); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServerInterfaceAccess().getProvidesKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2265:1: ( (lv_signature_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2266:1: (lv_signature_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2266:1: (lv_signature_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2267:3: lv_signature_2_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServerInterfaceAccess().getSignatureQualifiedNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleServerInterface3693);
            lv_signature_2_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getServerInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"signature",
              	        		lv_signature_2_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FOLLOW_29_in_ruleServerInterface3703); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServerInterfaceAccess().getAsKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2293:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2294:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2294:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2295:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServerInterface3720); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getServerInterfaceAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getServerInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_4_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2317:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2317:3: ( (lv_collection_5_0= '[' ) ) ( (lv_size_6_0= ruleIntegerLiteral ) )? ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2317:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2318:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2318:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2319:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleServerInterface3744); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getServerInterfaceAccess().getCollectionLeftSquareBracketKeyword_5_0_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getServerInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", lv_collection_5_0, "[", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2338:2: ( (lv_size_6_0= ruleIntegerLiteral ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2339:1: (lv_size_6_0= ruleIntegerLiteral )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2339:1: (lv_size_6_0= ruleIntegerLiteral )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2340:3: lv_size_6_0= ruleIntegerLiteral
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getServerInterfaceAccess().getSizeIntegerLiteralParserRuleCall_5_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleServerInterface3778);
                            lv_size_6_0=ruleIntegerLiteral();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getServerInterfaceRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"size",
                              	        		lv_size_6_0, 
                              	        		"IntegerLiteral", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_ruleServerInterface3789); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getServerInterfaceAccess().getRightSquareBracketKeyword_5_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleServerInterface


    // $ANTLR start entryRuleClientInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2374:1: entryRuleClientInterface returns [EObject current=null] : iv_ruleClientInterface= ruleClientInterface EOF ;
    public final EObject entryRuleClientInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2375:2: (iv_ruleClientInterface= ruleClientInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2376:2: iv_ruleClientInterface= ruleClientInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClientInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleClientInterface_in_entryRuleClientInterface3827);
            iv_ruleClientInterface=ruleClientInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClientInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClientInterface3837); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClientInterface


    // $ANTLR start ruleClientInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2383:1: ruleClientInterface returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'requires' ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleQualifiedName ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? ) ;
    public final EObject ruleClientInterface() throws RecognitionException {
        EObject current = null;

        Token lv_optional_2_0=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_signature_3_0 = null;

        EObject lv_size_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2388:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'requires' ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleQualifiedName ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2389:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'requires' ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleQualifiedName ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2389:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'requires' ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleQualifiedName ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2389:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'requires' ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleQualifiedName ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2389:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==48) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2390:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2390:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2391:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getClientInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleClientInterface3883);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getClientInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            match(input,32,FOLLOW_32_in_ruleClientInterface3894); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClientInterfaceAccess().getRequiresKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2417:1: ( (lv_optional_2_0= 'optional' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==33) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2418:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2418:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2419:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleClientInterface3912); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getClientInterfaceAccess().getOptionalOptionalKeyword_2_0(), "optional"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClientInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "optional", lv_optional_2_0, "optional", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2438:3: ( (lv_signature_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2439:1: (lv_signature_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2439:1: (lv_signature_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2440:3: lv_signature_3_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getClientInterfaceAccess().getSignatureQualifiedNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleClientInterface3947);
            lv_signature_3_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClientInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"signature",
              	        		lv_signature_3_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FOLLOW_29_in_ruleClientInterface3957); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClientInterfaceAccess().getAsKeyword_4(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2466:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2467:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2467:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2468:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClientInterface3974); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getClientInterfaceAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClientInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_5_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2490:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==30) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2490:3: ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2490:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2491:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2491:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2492:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleClientInterface3998); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getClientInterfaceAccess().getCollectionLeftSquareBracketKeyword_6_0_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClientInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", lv_collection_6_0, "[", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2511:2: ( (lv_size_7_0= ruleIntegerLiteral ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_INT) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2512:1: (lv_size_7_0= ruleIntegerLiteral )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2512:1: (lv_size_7_0= ruleIntegerLiteral )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2513:3: lv_size_7_0= ruleIntegerLiteral
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getClientInterfaceAccess().getSizeIntegerLiteralParserRuleCall_6_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleClientInterface4032);
                            lv_size_7_0=ruleIntegerLiteral();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getClientInterfaceRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"size",
                              	        		lv_size_7_0, 
                              	        		"IntegerLiteral", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_ruleClientInterface4043); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getClientInterfaceAccess().getRightSquareBracketKeyword_6_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClientInterface


    // $ANTLR start entryRuleInputInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2547:1: entryRuleInputInterface returns [EObject current=null] : iv_ruleInputInterface= ruleInputInterface EOF ;
    public final EObject entryRuleInputInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2548:2: (iv_ruleInputInterface= ruleInputInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2549:2: iv_ruleInputInterface= ruleInputInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInputInterface_in_entryRuleInputInterface4081);
            iv_ruleInputInterface=ruleInputInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInputInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputInterface4091); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInputInterface


    // $ANTLR start ruleInputInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2556:1: ruleInputInterface returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'input' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? ) ;
    public final EObject ruleInputInterface() throws RecognitionException {
        EObject current = null;

        Token lv_optional_2_0=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_size_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2561:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'input' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2562:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'input' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2562:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'input' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2562:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'input' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2562:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==48) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2563:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2563:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2564:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleInputInterface4137);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInputInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            match(input,34,FOLLOW_34_in_ruleInputInterface4148); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputInterfaceAccess().getInputKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2590:1: ( (lv_optional_2_0= 'optional' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==33) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2591:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2591:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2592:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleInputInterface4166); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInputInterfaceAccess().getOptionalOptionalKeyword_2_0(), "optional"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInputInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "optional", lv_optional_2_0, "optional", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2611:3: ( (lv_type_3_0= ruleFlowType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2612:1: (lv_type_3_0= ruleFlowType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2612:1: (lv_type_3_0= ruleFlowType )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2613:3: lv_type_3_0= ruleFlowType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInputInterfaceAccess().getTypeFlowTypeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowType_in_ruleInputInterface4201);
            lv_type_3_0=ruleFlowType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_3_0, 
              	        		"FlowType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FOLLOW_29_in_ruleInputInterface4211); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputInterfaceAccess().getAsKeyword_4(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2639:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2640:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2640:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2641:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputInterface4228); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInputInterfaceAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_5_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2663:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==30) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2663:3: ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2663:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2664:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2664:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2665:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleInputInterface4252); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInputInterfaceAccess().getCollectionLeftSquareBracketKeyword_6_0_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInputInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", lv_collection_6_0, "[", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2684:2: ( (lv_size_7_0= ruleIntegerLiteral ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_INT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2685:1: (lv_size_7_0= ruleIntegerLiteral )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2685:1: (lv_size_7_0= ruleIntegerLiteral )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2686:3: lv_size_7_0= ruleIntegerLiteral
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getInputInterfaceAccess().getSizeIntegerLiteralParserRuleCall_6_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleInputInterface4286);
                            lv_size_7_0=ruleIntegerLiteral();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getInputInterfaceRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"size",
                              	        		lv_size_7_0, 
                              	        		"IntegerLiteral", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_ruleInputInterface4297); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInputInterfaceAccess().getRightSquareBracketKeyword_6_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInputInterface


    // $ANTLR start entryRuleOutputInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2720:1: entryRuleOutputInterface returns [EObject current=null] : iv_ruleOutputInterface= ruleOutputInterface EOF ;
    public final EObject entryRuleOutputInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputInterface = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2721:2: (iv_ruleOutputInterface= ruleOutputInterface EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2722:2: iv_ruleOutputInterface= ruleOutputInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputInterface_in_entryRuleOutputInterface4335);
            iv_ruleOutputInterface=ruleOutputInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputInterface4345); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOutputInterface


    // $ANTLR start ruleOutputInterface
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2729:1: ruleOutputInterface returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'output' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? ) ;
    public final EObject ruleOutputInterface() throws RecognitionException {
        EObject current = null;

        Token lv_optional_2_0=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_size_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2734:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'output' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2735:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'output' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2735:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'output' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2735:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'output' ( (lv_optional_2_0= 'optional' ) )? ( (lv_type_3_0= ruleFlowType ) ) 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2735:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==48) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2736:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2736:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2737:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleOutputInterface4391);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOutputInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            match(input,35,FOLLOW_35_in_ruleOutputInterface4402); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputInterfaceAccess().getOutputKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2763:1: ( (lv_optional_2_0= 'optional' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==33) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2764:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2764:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2765:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleOutputInterface4420); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOutputInterfaceAccess().getOptionalOptionalKeyword_2_0(), "optional"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOutputInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "optional", lv_optional_2_0, "optional", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2784:3: ( (lv_type_3_0= ruleFlowType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2785:1: (lv_type_3_0= ruleFlowType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2785:1: (lv_type_3_0= ruleFlowType )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2786:3: lv_type_3_0= ruleFlowType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputInterfaceAccess().getTypeFlowTypeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowType_in_ruleOutputInterface4455);
            lv_type_3_0=ruleFlowType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_3_0, 
              	        		"FlowType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FOLLOW_29_in_ruleOutputInterface4465); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputInterfaceAccess().getAsKeyword_4(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2812:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2813:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2813:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2814:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputInterface4482); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOutputInterfaceAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_5_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2836:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==30) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2836:3: ( (lv_collection_6_0= '[' ) ) ( (lv_size_7_0= ruleIntegerLiteral ) )? ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2836:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2837:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2837:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2838:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleOutputInterface4506); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOutputInterfaceAccess().getCollectionLeftSquareBracketKeyword_6_0_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOutputInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", lv_collection_6_0, "[", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2857:2: ( (lv_size_7_0= ruleIntegerLiteral ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2858:1: (lv_size_7_0= ruleIntegerLiteral )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2858:1: (lv_size_7_0= ruleIntegerLiteral )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2859:3: lv_size_7_0= ruleIntegerLiteral
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getOutputInterfaceAccess().getSizeIntegerLiteralParserRuleCall_6_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleOutputInterface4540);
                            lv_size_7_0=ruleIntegerLiteral();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getOutputInterfaceRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"size",
                              	        		lv_size_7_0, 
                              	        		"IntegerLiteral", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_ruleOutputInterface4551); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOutputInterfaceAccess().getRightSquareBracketKeyword_6_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOutputInterface


    // $ANTLR start entryRuleFlowType
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2893:1: entryRuleFlowType returns [EObject current=null] : iv_ruleFlowType= ruleFlowType EOF ;
    public final EObject entryRuleFlowType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2894:2: (iv_ruleFlowType= ruleFlowType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2895:2: iv_ruleFlowType= ruleFlowType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFlowTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFlowType_in_entryRuleFlowType4589);
            iv_ruleFlowType=ruleFlowType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFlowType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowType4599); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFlowType


    // $ANTLR start ruleFlowType
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2902:1: ruleFlowType returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) | ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) ) ) ;
    public final EObject ruleFlowType() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_path_1_0 = null;

        Enumerator lv_kind_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2907:6: ( ( ( (lv_type_0_0= ruleAttributeType ) ) | ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2908:1: ( ( (lv_type_0_0= ruleAttributeType ) ) | ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2908:1: ( ( (lv_type_0_0= ruleAttributeType ) ) | ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=57 && LA72_0<=66)) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_ID||(LA72_0>=40 && LA72_0<=42)) ) {
                alt72=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2908:1: ( ( (lv_type_0_0= ruleAttributeType ) ) | ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) ) )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2908:2: ( (lv_type_0_0= ruleAttributeType ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2908:2: ( (lv_type_0_0= ruleAttributeType ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2909:1: (lv_type_0_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2909:1: (lv_type_0_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2910:3: lv_type_0_0= ruleAttributeType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFlowTypeAccess().getTypeAttributeTypeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleFlowType4645);
                    lv_type_0_0=ruleAttributeType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFlowTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_0_0, 
                      	        		"AttributeType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2933:6: ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2933:6: ( ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2933:7: ( (lv_path_1_0= rulePath ) ) ':' ( (lv_kind_3_0= ruleFlowTypeKind ) )? ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2933:7: ( (lv_path_1_0= rulePath ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2934:1: (lv_path_1_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2934:1: (lv_path_1_0= rulePath )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2935:3: lv_path_1_0= rulePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFlowTypeAccess().getPathPathParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFlowType4673);
                    lv_path_1_0=rulePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFlowTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"path",
                      	        		lv_path_1_0, 
                      	        		"Path", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,36,FOLLOW_36_in_ruleFlowType4683); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFlowTypeAccess().getColonKeyword_1_1(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2961:1: ( (lv_kind_3_0= ruleFlowTypeKind ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=54 && LA71_0<=56)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2962:1: (lv_kind_3_0= ruleFlowTypeKind )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2962:1: (lv_kind_3_0= ruleFlowTypeKind )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2963:3: lv_kind_3_0= ruleFlowTypeKind
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFlowTypeAccess().getKindFlowTypeKindEnumRuleCall_1_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFlowTypeKind_in_ruleFlowType4704);
                            lv_kind_3_0=ruleFlowTypeKind();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getFlowTypeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"kind",
                              	        		lv_kind_3_0, 
                              	        		"FlowTypeKind", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2985:3: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2986:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2986:1: (lv_name_4_0= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2987:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlowType4722); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getFlowTypeAccess().getNameIDTerminalRuleCall_1_3_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFlowTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_4_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlowType


    // $ANTLR start entryRuleAttribute
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3017:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3018:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3019:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4764);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4774); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3026:1: ruleAttribute returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleAttributeValue ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3031:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleAttributeValue ) ) )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3032:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleAttributeValue ) ) )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3032:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleAttributeValue ) ) )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3032:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleAttributeValue ) ) )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3032:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==48) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3033:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3033:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3034:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAttribute4820);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            match(input,37,FOLLOW_37_in_ruleAttribute4831); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeAccess().getAttributeKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3060:1: ( (lv_type_2_0= ruleFlowType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3061:1: (lv_type_2_0= ruleFlowType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3061:1: (lv_type_2_0= ruleFlowType )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3062:3: lv_type_2_0= ruleFlowType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getTypeFlowTypeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowType_in_ruleAttribute4852);
            lv_type_2_0=ruleFlowType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_2_0, 
              	        		"FlowType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3084:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3085:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3085:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3086:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4869); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3108:2: ( '=' ( (lv_value_5_0= ruleAttributeValue ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==27) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3108:4: '=' ( (lv_value_5_0= ruleAttributeValue ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleAttribute4885); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3112:1: ( (lv_value_5_0= ruleAttributeValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3113:1: (lv_value_5_0= ruleAttributeValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3113:1: (lv_value_5_0= ruleAttributeValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3114:3: lv_value_5_0= ruleAttributeValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttribute4906);
                    lv_value_5_0=ruleAttributeValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_5_0, 
                      	        		"AttributeValue", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleAttributeValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3144:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3145:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3146:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue4944);
            iv_ruleAttributeValue=ruleAttributeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue4954); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeValue


    // $ANTLR start ruleAttributeValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3153:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3158:6: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3159:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3159:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_INT && LA75_0<=RULE_STRING)||(LA75_0>=40 && LA75_0<=42)||(LA75_0>=49 && LA75_0<=52)) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==EOF||LA75_2==13||LA75_2==18||LA75_2==28||LA75_2==32||(LA75_2>=34 && LA75_2<=35)||(LA75_2>=37 && LA75_2<=39)||LA75_2==48) ) {
                    alt75=2;
                }
                else if ( (LA75_2==40||LA75_2==43) ) {
                    alt75=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3159:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )", 75, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3159:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( ( RULE_ID ) ) )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3159:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3159:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3160:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3160:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3161:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeValueAccess().getLiteralLiteralParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttributeValue5000);
                    lv_literal_0_0=ruleLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"literal",
                      	        		lv_literal_0_0, 
                      	        		"Literal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3184:6: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3184:6: ( ( RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3185:1: ( RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3185:1: ( RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3186:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeValue5028); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getAttributeValueAccess().getRefParameterDeclCrossReference_1_0(), "ref"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttributeValue


    // $ANTLR start entryRuleData
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3209:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3210:2: (iv_ruleData= ruleData EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3211:2: iv_ruleData= ruleData EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleData_in_entryRuleData5064);
            iv_ruleData=ruleData();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleData5074); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleData


    // $ANTLR start ruleData
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3218:1: ruleData returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'data' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_inlinedCode_3_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_path_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3223:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'data' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3224:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'data' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3224:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'data' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3224:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'data' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3224:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==48) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3225:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3225:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3226:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDataAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleData5120);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            match(input,38,FOLLOW_38_in_ruleData5131); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDataAccess().getDataKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3252:1: ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID||(LA77_0>=40 && LA77_0<=42)) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_INLINEDCODE) ) {
                alt77=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3252:1: ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3252:2: ( (lv_path_2_0= rulePath ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3252:2: ( (lv_path_2_0= rulePath ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3253:1: (lv_path_2_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3253:1: (lv_path_2_0= rulePath )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3254:3: lv_path_2_0= rulePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDataAccess().getPathPathParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleData5153);
                    lv_path_2_0=rulePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"path",
                      	        		lv_path_2_0, 
                      	        		"Path", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3277:6: ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3277:6: ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3278:1: (lv_inlinedCode_3_0= RULE_INLINEDCODE )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3278:1: (lv_inlinedCode_3_0= RULE_INLINEDCODE )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3279:3: lv_inlinedCode_3_0= RULE_INLINEDCODE
                    {
                    lv_inlinedCode_3_0=(Token)input.LT(1);
                    match(input,RULE_INLINEDCODE,FOLLOW_RULE_INLINEDCODE_in_ruleData5176); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDataAccess().getInlinedCodeInlinedCodeTerminalRuleCall_2_1_0(), "inlinedCode"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"inlinedCode",
                      	        		lv_inlinedCode_3_0, 
                      	        		"InlinedCode", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleData


    // $ANTLR start entryRuleSource
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3309:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3310:2: (iv_ruleSource= ruleSource EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3311:2: iv_ruleSource= ruleSource EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSourceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource5218);
            iv_ruleSource=ruleSource();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource5228); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSource


    // $ANTLR start ruleSource
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3318:1: ruleSource returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'source' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token lv_inlinedCode_3_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_path_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3323:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'source' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3324:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'source' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3324:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'source' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3324:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'source' ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3324:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==48) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3325:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3325:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3326:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSourceAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSource5274);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSourceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_ruleSource5285); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSourceAccess().getSourceKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3352:1: ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||(LA79_0>=40 && LA79_0<=42)) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_INLINEDCODE) ) {
                alt79=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3352:1: ( ( (lv_path_2_0= rulePath ) ) | ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) ) )", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3352:2: ( (lv_path_2_0= rulePath ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3352:2: ( (lv_path_2_0= rulePath ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3353:1: (lv_path_2_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3353:1: (lv_path_2_0= rulePath )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3354:3: lv_path_2_0= rulePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSourceAccess().getPathPathParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleSource5307);
                    lv_path_2_0=rulePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSourceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"path",
                      	        		lv_path_2_0, 
                      	        		"Path", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3377:6: ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3377:6: ( (lv_inlinedCode_3_0= RULE_INLINEDCODE ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3378:1: (lv_inlinedCode_3_0= RULE_INLINEDCODE )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3378:1: (lv_inlinedCode_3_0= RULE_INLINEDCODE )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3379:3: lv_inlinedCode_3_0= RULE_INLINEDCODE
                    {
                    lv_inlinedCode_3_0=(Token)input.LT(1);
                    match(input,RULE_INLINEDCODE,FOLLOW_RULE_INLINEDCODE_in_ruleSource5330); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSourceAccess().getInlinedCodeInlinedCodeTerminalRuleCall_2_1_0(), "inlinedCode"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSourceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"inlinedCode",
                      	        		lv_inlinedCode_3_0, 
                      	        		"InlinedCode", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSource


    // $ANTLR start entryRuleImplementation
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3409:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3410:2: (iv_ruleImplementation= ruleImplementation EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3411:2: iv_ruleImplementation= ruleImplementation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplementationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImplementation_in_entryRuleImplementation5372);
            iv_ruleImplementation=ruleImplementation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplementation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementation5382); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImplementation


    // $ANTLR start ruleImplementation
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3418:1: ruleImplementation returns [EObject current=null] : (this_Data_0= ruleData | this_Source_1= ruleSource ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        EObject this_Data_0 = null;

        EObject this_Source_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3423:6: ( (this_Data_0= ruleData | this_Source_1= ruleSource ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3424:1: (this_Data_0= ruleData | this_Source_1= ruleSource )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3424:1: (this_Data_0= ruleData | this_Source_1= ruleSource )
            int alt80=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA80_1 = input.LA(2);

                if ( (synpred89()) ) {
                    alt80=1;
                }
                else if ( (true) ) {
                    alt80=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3424:1: (this_Data_0= ruleData | this_Source_1= ruleSource )", 80, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt80=1;
                }
                break;
            case 39:
                {
                alt80=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3424:1: (this_Data_0= ruleData | this_Source_1= ruleSource )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3425:2: this_Data_0= ruleData
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getImplementationAccess().getDataParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleData_in_ruleImplementation5432);
                    this_Data_0=ruleData();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Data_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3438:2: this_Source_1= ruleSource
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getImplementationAccess().getSourceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSource_in_ruleImplementation5462);
                    this_Source_1=ruleSource();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Source_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImplementation


    // $ANTLR start entryRulePath
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3457:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3458:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3459:2: iv_rulePath= rulePath EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPathRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath5498);
            iv_rulePath=rulePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath5509); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePath


    // $ANTLR start rulePath
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3466:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '/' )? (kw= './' )? (kw= '../' )* this_ID_3= RULE_ID (kw= '/' this_ID_5= RULE_ID )* kw= '.' this_ID_7= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        Token this_ID_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3471:6: ( ( (kw= '/' )? (kw= './' )? (kw= '../' )* this_ID_3= RULE_ID (kw= '/' this_ID_5= RULE_ID )* kw= '.' this_ID_7= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3472:1: ( (kw= '/' )? (kw= './' )? (kw= '../' )* this_ID_3= RULE_ID (kw= '/' this_ID_5= RULE_ID )* kw= '.' this_ID_7= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3472:1: ( (kw= '/' )? (kw= './' )? (kw= '../' )* this_ID_3= RULE_ID (kw= '/' this_ID_5= RULE_ID )* kw= '.' this_ID_7= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3472:2: (kw= '/' )? (kw= './' )? (kw= '../' )* this_ID_3= RULE_ID (kw= '/' this_ID_5= RULE_ID )* kw= '.' this_ID_7= RULE_ID
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3472:2: (kw= '/' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==40) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3473:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_rulePath5548); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3478:3: (kw= './' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==41) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3479:2: kw= './'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_rulePath5564); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPathAccess().getFullStopSolidusKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3484:3: (kw= '../' )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==42) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3485:2: kw= '../'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,42,FOLLOW_42_in_rulePath5580); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPathAccess().getFullStopFullStopSolidusKeyword_2(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            this_ID_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath5597); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_3);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3497:1: (kw= '/' this_ID_5= RULE_ID )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==40) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3498:2: kw= '/' this_ID_5= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,40,FOLLOW_40_in_rulePath5616); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_4_0(), null); 
            	          
            	    }
            	    this_ID_5=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath5631); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_5);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_4_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            kw=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_rulePath5651); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getPathAccess().getFullStopKeyword_5(), null); 
                  
            }
            this_ID_7=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath5666); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_7);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePath


    // $ANTLR start entryRuleSubComponent
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3531:1: entryRuleSubComponent returns [EObject current=null] : iv_ruleSubComponent= ruleSubComponent EOF ;
    public final EObject entryRuleSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponent = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3532:2: (iv_ruleSubComponent= ruleSubComponent EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3533:2: iv_ruleSubComponent= ruleSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubComponent_in_entryRuleSubComponent5711);
            iv_ruleSubComponent=ruleSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponent5721); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubComponent


    // $ANTLR start ruleSubComponent
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3540:1: ruleSubComponent returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'contains' ( (lv_type_2_0= ruleDefinitionReference ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( (lv_anonymousDef_5_0= ruleAnonymousDefinition ) )? ) ;
    public final EObject ruleSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_anonymousDef_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3545:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'contains' ( (lv_type_2_0= ruleDefinitionReference ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( (lv_anonymousDef_5_0= ruleAnonymousDefinition ) )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3546:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'contains' ( (lv_type_2_0= ruleDefinitionReference ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( (lv_anonymousDef_5_0= ruleAnonymousDefinition ) )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3546:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'contains' ( (lv_type_2_0= ruleDefinitionReference ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( (lv_anonymousDef_5_0= ruleAnonymousDefinition ) )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3546:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'contains' ( (lv_type_2_0= ruleDefinitionReference ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( (lv_anonymousDef_5_0= ruleAnonymousDefinition ) )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3546:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==48) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3547:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3547:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3548:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubComponentAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSubComponent5767);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubComponentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            match(input,44,FOLLOW_44_in_ruleSubComponent5778); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentAccess().getContainsKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3574:1: ( (lv_type_2_0= ruleDefinitionReference ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3575:1: (lv_type_2_0= ruleDefinitionReference )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3575:1: (lv_type_2_0= ruleDefinitionReference )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3576:3: lv_type_2_0= ruleDefinitionReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSubComponentAccess().getTypeDefinitionReferenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDefinitionReference_in_ruleSubComponent5799);
            lv_type_2_0=ruleDefinitionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_2_0, 
              	        		"DefinitionReference", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FOLLOW_29_in_ruleSubComponent5809); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentAccess().getAsKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3602:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3603:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3603:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3604:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponent5826); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSubComponentAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_4_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3626:2: ( (lv_anonymousDef_5_0= ruleAnonymousDefinition ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==48) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred95()) ) {
                    alt86=1;
                }
            }
            else if ( (LA86_0==20||LA86_0==23) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3627:1: (lv_anonymousDef_5_0= ruleAnonymousDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3627:1: (lv_anonymousDef_5_0= ruleAnonymousDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3628:3: lv_anonymousDef_5_0= ruleAnonymousDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentAccess().getAnonymousDefAnonymousDefinitionParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnonymousDefinition_in_ruleSubComponent5852);
                    lv_anonymousDef_5_0=ruleAnonymousDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"anonymousDef",
                      	        		lv_anonymousDef_5_0, 
                      	        		"AnonymousDefinition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubComponent


    // $ANTLR start entryRuleAnonymousDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3658:1: entryRuleAnonymousDefinition returns [EObject current=null] : iv_ruleAnonymousDefinition= ruleAnonymousDefinition EOF ;
    public final EObject entryRuleAnonymousDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3659:2: (iv_ruleAnonymousDefinition= ruleAnonymousDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3660:2: iv_ruleAnonymousDefinition= ruleAnonymousDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnonymousDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnonymousDefinition_in_entryRuleAnonymousDefinition5889);
            iv_ruleAnonymousDefinition=ruleAnonymousDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnonymousDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnonymousDefinition5899); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnonymousDefinition


    // $ANTLR start ruleAnonymousDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3667:1: ruleAnonymousDefinition returns [EObject current=null] : (this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition | this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition ) ;
    public final EObject ruleAnonymousDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveAnonymousDefinition_0 = null;

        EObject this_CompositeAnonymousDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3672:6: ( (this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition | this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3673:1: (this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition | this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3673:1: (this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition | this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition )
            int alt87=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA87_1 = input.LA(2);

                if ( (synpred96()) ) {
                    alt87=1;
                }
                else if ( (true) ) {
                    alt87=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3673:1: (this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition | this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition )", 87, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt87=1;
                }
                break;
            case 23:
                {
                alt87=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3673:1: (this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition | this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition )", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3674:2: this_PrimitiveAnonymousDefinition_0= rulePrimitiveAnonymousDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnonymousDefinitionAccess().getPrimitiveAnonymousDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveAnonymousDefinition_in_ruleAnonymousDefinition5949);
                    this_PrimitiveAnonymousDefinition_0=rulePrimitiveAnonymousDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveAnonymousDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3687:2: this_CompositeAnonymousDefinition_1= ruleCompositeAnonymousDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnonymousDefinitionAccess().getCompositeAnonymousDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeAnonymousDefinition_in_ruleAnonymousDefinition5979);
                    this_CompositeAnonymousDefinition_1=ruleCompositeAnonymousDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompositeAnonymousDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnonymousDefinition


    // $ANTLR start entryRulePrimitiveAnonymousDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3708:1: entryRulePrimitiveAnonymousDefinition returns [EObject current=null] : iv_rulePrimitiveAnonymousDefinition= rulePrimitiveAnonymousDefinition EOF ;
    public final EObject entryRulePrimitiveAnonymousDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveAnonymousDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3709:2: (iv_rulePrimitiveAnonymousDefinition= rulePrimitiveAnonymousDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3710:2: iv_rulePrimitiveAnonymousDefinition= rulePrimitiveAnonymousDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveAnonymousDefinition_in_entryRulePrimitiveAnonymousDefinition6016);
            iv_rulePrimitiveAnonymousDefinition=rulePrimitiveAnonymousDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveAnonymousDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveAnonymousDefinition6026); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveAnonymousDefinition


    // $ANTLR start rulePrimitiveAnonymousDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3717:1: rulePrimitiveAnonymousDefinition returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'primitive' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';' )* '}' ) ;
    public final EObject rulePrimitiveAnonymousDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_content_4_1 = null;

        EObject lv_content_4_2 = null;

        EObject lv_content_4_3 = null;

        EObject lv_content_4_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3722:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'primitive' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';' )* '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3723:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'primitive' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';' )* '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3723:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'primitive' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';' )* '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3723:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* 'primitive' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';' )* '}'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3723:2: ()
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3724:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getPrimitiveAnonymousDefinitionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getPrimitiveAnonymousDefinitionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3737:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==48) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3738:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3738:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3739:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePrimitiveAnonymousDefinition6084);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveAnonymousDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_rulePrimitiveAnonymousDefinition6095); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getPrimitiveKeyword_2(), null); 
                  
            }
            match(input,17,FOLLOW_17_in_rulePrimitiveAnonymousDefinition6105); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3769:1: ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';' )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==28||LA90_0==32||(LA90_0>=34 && LA90_0<=35)||(LA90_0>=37 && LA90_0<=39)||LA90_0==48) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3769:2: ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) ) ';'
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3769:2: ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3770:1: ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3770:1: ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3771:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3771:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource )
            	    int alt89=4;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        int LA89_1 = input.LA(2);

            	        if ( (synpred98()) ) {
            	            alt89=1;
            	        }
            	        else if ( (synpred99()) ) {
            	            alt89=2;
            	        }
            	        else if ( (synpred100()) ) {
            	            alt89=3;
            	        }
            	        else if ( (true) ) {
            	            alt89=4;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("3771:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource )", 89, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 28:
            	    case 32:
            	    case 34:
            	    case 35:
            	        {
            	        alt89=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt89=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt89=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt89=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3771:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleAttribute | lv_content_4_3= ruleData | lv_content_4_4= ruleSource )", 89, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt89) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3772:3: lv_content_4_1= ruleInterface
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentInterfaceParserRuleCall_4_0_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInterface_in_rulePrimitiveAnonymousDefinition6129);
            	            lv_content_4_1=ruleInterface();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_1, 
            	              	        		"Interface", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3793:8: lv_content_4_2= ruleAttribute
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentAttributeParserRuleCall_4_0_0_1(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttribute_in_rulePrimitiveAnonymousDefinition6148);
            	            lv_content_4_2=ruleAttribute();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_2, 
            	              	        		"Attribute", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3814:8: lv_content_4_3= ruleData
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentDataParserRuleCall_4_0_0_2(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleData_in_rulePrimitiveAnonymousDefinition6167);
            	            lv_content_4_3=ruleData();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_3, 
            	              	        		"Data", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3835:8: lv_content_4_4= ruleSource
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentSourceParserRuleCall_4_0_0_3(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSource_in_rulePrimitiveAnonymousDefinition6186);
            	            lv_content_4_4=ruleSource();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_4, 
            	              	        		"Source", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    match(input,13,FOLLOW_13_in_rulePrimitiveAnonymousDefinition6199); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getSemicolonKeyword_4_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_rulePrimitiveAnonymousDefinition6211); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getRightCurlyBracketKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveAnonymousDefinition


    // $ANTLR start entryRuleCompositeAnonymousDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3875:1: entryRuleCompositeAnonymousDefinition returns [EObject current=null] : iv_ruleCompositeAnonymousDefinition= ruleCompositeAnonymousDefinition EOF ;
    public final EObject entryRuleCompositeAnonymousDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeAnonymousDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3876:2: (iv_ruleCompositeAnonymousDefinition= ruleCompositeAnonymousDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3877:2: iv_ruleCompositeAnonymousDefinition= ruleCompositeAnonymousDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeAnonymousDefinition_in_entryRuleCompositeAnonymousDefinition6247);
            iv_ruleCompositeAnonymousDefinition=ruleCompositeAnonymousDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeAnonymousDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeAnonymousDefinition6257); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeAnonymousDefinition


    // $ANTLR start ruleCompositeAnonymousDefinition
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3884:1: ruleCompositeAnonymousDefinition returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';' )* '}' ) ;
    public final EObject ruleCompositeAnonymousDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_content_4_1 = null;

        EObject lv_content_4_2 = null;

        EObject lv_content_4_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3889:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';' )* '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3890:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';' )* '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3890:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';' )* '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3890:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* 'composite' '{' ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';' )* '}'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3890:2: ()
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3891:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompositeAnonymousDefinitionAccess().getCompositeAnonymousDefinitionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getCompositeAnonymousDefinitionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3904:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==48) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3905:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3905:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3906:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleCompositeAnonymousDefinition6315);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeAnonymousDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleCompositeAnonymousDefinition6326); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getCompositeKeyword_2(), null); 
                  
            }
            match(input,17,FOLLOW_17_in_ruleCompositeAnonymousDefinition6336); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3936:1: ( ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';' )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==28||LA93_0==32||(LA93_0>=34 && LA93_0<=35)||(LA93_0>=44 && LA93_0<=45)||LA93_0==48) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3936:2: ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) ) ';'
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3936:2: ( ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3937:1: ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3937:1: ( (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3938:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3938:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding )
            	    int alt92=3;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        int LA92_1 = input.LA(2);

            	        if ( (synpred103()) ) {
            	            alt92=1;
            	        }
            	        else if ( (synpred104()) ) {
            	            alt92=2;
            	        }
            	        else if ( (true) ) {
            	            alt92=3;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("3938:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding )", 92, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 28:
            	    case 32:
            	    case 34:
            	    case 35:
            	        {
            	        alt92=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt92=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt92=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3938:1: (lv_content_4_1= ruleInterface | lv_content_4_2= ruleSubComponent | lv_content_4_3= ruleBinding )", 92, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt92) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3939:3: lv_content_4_1= ruleInterface
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getContentInterfaceParserRuleCall_4_0_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInterface_in_ruleCompositeAnonymousDefinition6360);
            	            lv_content_4_1=ruleInterface();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getCompositeAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_1, 
            	              	        		"Interface", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3960:8: lv_content_4_2= ruleSubComponent
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getContentSubComponentParserRuleCall_4_0_0_1(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponent_in_ruleCompositeAnonymousDefinition6379);
            	            lv_content_4_2=ruleSubComponent();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getCompositeAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_2, 
            	              	        		"SubComponent", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3981:8: lv_content_4_3= ruleBinding
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getContentBindingParserRuleCall_4_0_0_2(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBinding_in_ruleCompositeAnonymousDefinition6398);
            	            lv_content_4_3=ruleBinding();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getCompositeAnonymousDefinitionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"content",
            	              	        		lv_content_4_3, 
            	              	        		"Binding", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    match(input,13,FOLLOW_13_in_ruleCompositeAnonymousDefinition6411); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getSemicolonKeyword_4_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleCompositeAnonymousDefinition6423); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getRightCurlyBracketKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeAnonymousDefinition


    // $ANTLR start entryRuleBinding
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4021:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4022:2: (iv_ruleBinding= ruleBinding EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4023:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBindingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding6459);
            iv_ruleBinding=ruleBinding();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding6469); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBinding


    // $ANTLR start ruleBinding
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4030:1: ruleBinding returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'binds' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']' )? 'to' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']' )? ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_fromIndex_7_0 = null;

        EObject lv_tondex_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4035:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'binds' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']' )? 'to' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4036:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'binds' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']' )? 'to' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4036:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'binds' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']' )? 'to' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4036:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'binds' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']' )? 'to' ( ( ( RULE_ID ) ) | 'this' ) '.' ( ( RULE_ID ) ) ( '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4036:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==48) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4037:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4037:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4038:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBindingAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleBinding6515);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            match(input,45,FOLLOW_45_in_ruleBinding6526); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingAccess().getBindsKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4064:1: ( ( ( RULE_ID ) ) | 'this' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            else if ( (LA95_0==46) ) {
                alt95=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4064:1: ( ( ( RULE_ID ) ) | 'this' )", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4064:2: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4064:2: ( ( RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4065:1: ( RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4065:1: ( RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4066:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding6549); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBindingAccess().getFromSubCompSubComponentCrossReference_2_0_0(), "fromSubComp"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4082:7: 'this'
                    {
                    match(input,46,FOLLOW_46_in_ruleBinding6565); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingAccess().getThisKeyword_2_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleBinding6576); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingAccess().getFullStopKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4090:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4091:1: ( RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4091:1: ( RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4092:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding6598); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getBindingAccess().getFromItfInterfaceCrossReference_4_0(), "fromItf"); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4107:2: ( '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==30) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4107:4: '[' ( (lv_fromIndex_7_0= ruleIntegerLiteral ) ) ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleBinding6609); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingAccess().getLeftSquareBracketKeyword_5_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4111:1: ( (lv_fromIndex_7_0= ruleIntegerLiteral ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4112:1: (lv_fromIndex_7_0= ruleIntegerLiteral )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4112:1: (lv_fromIndex_7_0= ruleIntegerLiteral )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4113:3: lv_fromIndex_7_0= ruleIntegerLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBindingAccess().getFromIndexIntegerLiteralParserRuleCall_5_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleBinding6630);
                    lv_fromIndex_7_0=ruleIntegerLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"fromIndex",
                      	        		lv_fromIndex_7_0, 
                      	        		"IntegerLiteral", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,31,FOLLOW_31_in_ruleBinding6640); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingAccess().getRightSquareBracketKeyword_5_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_ruleBinding6652); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingAccess().getToKeyword_6(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4143:1: ( ( ( RULE_ID ) ) | 'this' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID) ) {
                alt97=1;
            }
            else if ( (LA97_0==46) ) {
                alt97=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4143:1: ( ( ( RULE_ID ) ) | 'this' )", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4143:2: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4143:2: ( ( RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4144:1: ( RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4144:1: ( RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4145:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding6675); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBindingAccess().getToSubCompSubComponentCrossReference_7_0_0(), "toSubComp"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4161:7: 'this'
                    {
                    match(input,46,FOLLOW_46_in_ruleBinding6691); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingAccess().getThisKeyword_7_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleBinding6702); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingAccess().getFullStopKeyword_8(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4169:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4170:1: ( RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4170:1: ( RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4171:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding6724); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getBindingAccess().getToItfInterfaceCrossReference_9_0(), "toItf"); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4186:2: ( '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==30) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4186:4: '[' ( (lv_tondex_15_0= ruleIntegerLiteral ) ) ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleBinding6735); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingAccess().getLeftSquareBracketKeyword_10_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4190:1: ( (lv_tondex_15_0= ruleIntegerLiteral ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4191:1: (lv_tondex_15_0= ruleIntegerLiteral )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4191:1: (lv_tondex_15_0= ruleIntegerLiteral )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4192:3: lv_tondex_15_0= ruleIntegerLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBindingAccess().getTondexIntegerLiteralParserRuleCall_10_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleBinding6756);
                    lv_tondex_15_0=ruleIntegerLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"tondex",
                      	        		lv_tondex_15_0, 
                      	        		"IntegerLiteral", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,31,FOLLOW_31_in_ruleBinding6766); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingAccess().getRightSquareBracketKeyword_10_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBinding


    // $ANTLR start entryRuleAnnotation
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4226:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4227:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4228:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6804);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6814); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4235:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4240:6: ( ( '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4241:1: ( '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4241:1: ( '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4241:3: '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')' )?
            {
            match(input,48,FOLLOW_48_in_ruleAnnotation6849); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4245:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4246:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4246:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4247:3: lv_name_1_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation6870);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4269:2: ( '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==21) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4269:4: '(' ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleAnnotation6881); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4273:1: ( ( (lv_parameters_3_0= ruleSimpleAnnotationField ) ) | ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* ) )?
                    int alt100=3;
                    int LA100_0 = input.LA(1);

                    if ( ((LA100_0>=RULE_INT && LA100_0<=RULE_STRING)||LA100_0==17||(LA100_0>=40 && LA100_0<=42)||(LA100_0>=48 && LA100_0<=52)) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==RULE_ID) ) {
                        int LA100_2 = input.LA(2);

                        if ( (LA100_2==27) ) {
                            alt100=2;
                        }
                        else if ( (LA100_2==40||LA100_2==43) ) {
                            alt100=1;
                        }
                    }
                    switch (alt100) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4273:2: ( (lv_parameters_3_0= ruleSimpleAnnotationField ) )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4273:2: ( (lv_parameters_3_0= ruleSimpleAnnotationField ) )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4274:1: (lv_parameters_3_0= ruleSimpleAnnotationField )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4274:1: (lv_parameters_3_0= ruleSimpleAnnotationField )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4275:3: lv_parameters_3_0= ruleSimpleAnnotationField
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getParametersSimpleAnnotationFieldParserRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSimpleAnnotationField_in_ruleAnnotation6903);
                            lv_parameters_3_0=ruleSimpleAnnotationField();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"parameters",
                              	        		lv_parameters_3_0, 
                              	        		"SimpleAnnotationField", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4298:6: ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4298:6: ( ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )* )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4298:7: ( (lv_parameters_4_0= ruleAnnotationField ) ) ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )*
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4298:7: ( (lv_parameters_4_0= ruleAnnotationField ) )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4299:1: (lv_parameters_4_0= ruleAnnotationField )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4299:1: (lv_parameters_4_0= ruleAnnotationField )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4300:3: lv_parameters_4_0= ruleAnnotationField
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getParametersAnnotationFieldParserRuleCall_2_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAnnotationField_in_ruleAnnotation6931);
                            lv_parameters_4_0=ruleAnnotationField();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"parameters",
                              	        		lv_parameters_4_0, 
                              	        		"AnnotationField", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4322:2: ( ',' ( (lv_parameters_6_0= ruleAnnotationField ) ) )*
                            loop99:
                            do {
                                int alt99=2;
                                int LA99_0 = input.LA(1);

                                if ( (LA99_0==16) ) {
                                    alt99=1;
                                }


                                switch (alt99) {
                            	case 1 :
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4322:4: ',' ( (lv_parameters_6_0= ruleAnnotationField ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleAnnotation6942); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4326:1: ( (lv_parameters_6_0= ruleAnnotationField ) )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4327:1: (lv_parameters_6_0= ruleAnnotationField )
                            	    {
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4327:1: (lv_parameters_6_0= ruleAnnotationField )
                            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4328:3: lv_parameters_6_0= ruleAnnotationField
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getParametersAnnotationFieldParserRuleCall_2_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleAnnotationField_in_ruleAnnotation6963);
                            	    lv_parameters_6_0=ruleAnnotationField();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"parameters",
                            	      	        		lv_parameters_6_0, 
                            	      	        		"AnnotationField", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop99;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    match(input,22,FOLLOW_22_in_ruleAnnotation6978); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleAnnotationField
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4362:1: entryRuleAnnotationField returns [EObject current=null] : iv_ruleAnnotationField= ruleAnnotationField EOF ;
    public final EObject entryRuleAnnotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationField = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4363:2: (iv_ruleAnnotationField= ruleAnnotationField EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4364:2: iv_ruleAnnotationField= ruleAnnotationField EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationFieldRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField7016);
            iv_ruleAnnotationField=ruleAnnotationField();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationField7026); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationField


    // $ANTLR start ruleAnnotationField
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4371:1: ruleAnnotationField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4376:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4377:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4377:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4377:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4377:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4378:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4378:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4379:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationField7068); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAnnotationFieldAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,27,FOLLOW_27_in_ruleAnnotationField7083); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationFieldAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4405:1: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4406:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4406:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4407:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationFieldAccess().getValueAnnotationValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_ruleAnnotationField7104);
            lv_value_2_0=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"AnnotationValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationField


    // $ANTLR start entryRuleSimpleAnnotationField
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4437:1: entryRuleSimpleAnnotationField returns [EObject current=null] : iv_ruleSimpleAnnotationField= ruleSimpleAnnotationField EOF ;
    public final EObject entryRuleSimpleAnnotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnnotationField = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4438:2: (iv_ruleSimpleAnnotationField= ruleSimpleAnnotationField EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4439:2: iv_ruleSimpleAnnotationField= ruleSimpleAnnotationField EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleAnnotationFieldRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimpleAnnotationField_in_entryRuleSimpleAnnotationField7140);
            iv_ruleSimpleAnnotationField=ruleSimpleAnnotationField();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleAnnotationField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAnnotationField7150); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleAnnotationField


    // $ANTLR start ruleSimpleAnnotationField
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4446:1: ruleSimpleAnnotationField returns [EObject current=null] : ( (lv_value_0_0= ruleAnnotationValue ) ) ;
    public final EObject ruleSimpleAnnotationField() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4451:6: ( ( (lv_value_0_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4452:1: ( (lv_value_0_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4452:1: ( (lv_value_0_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4453:1: (lv_value_0_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4453:1: (lv_value_0_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4454:3: lv_value_0_0= ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSimpleAnnotationFieldAccess().getValueAnnotationValueParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_ruleSimpleAnnotationField7195);
            lv_value_0_0=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSimpleAnnotationFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"AnnotationValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleAnnotationField


    // $ANTLR start entryRuleAnnotationValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4484:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4485:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4486:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue7230);
            iv_ruleAnnotationValue=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValue7240); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationValue


    // $ANTLR start ruleAnnotationValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4493:1: ruleAnnotationValue returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_AnnotationAnnotationValue_1= ruleAnnotationAnnotationValue | this_ArrayValue_2= ruleArrayValue ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_AnnotationAnnotationValue_1 = null;

        EObject this_ArrayValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4498:6: ( (this_Literal_0= ruleLiteral | this_AnnotationAnnotationValue_1= ruleAnnotationAnnotationValue | this_ArrayValue_2= ruleArrayValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4499:1: (this_Literal_0= ruleLiteral | this_AnnotationAnnotationValue_1= ruleAnnotationAnnotationValue | this_ArrayValue_2= ruleArrayValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4499:1: (this_Literal_0= ruleLiteral | this_AnnotationAnnotationValue_1= ruleAnnotationAnnotationValue | this_ArrayValue_2= ruleArrayValue )
            int alt102=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 40:
            case 41:
            case 42:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt102=1;
                }
                break;
            case 48:
                {
                alt102=2;
                }
                break;
            case 17:
                {
                alt102=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4499:1: (this_Literal_0= ruleLiteral | this_AnnotationAnnotationValue_1= ruleAnnotationAnnotationValue | this_ArrayValue_2= ruleArrayValue )", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4500:2: this_Literal_0= ruleLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getLiteralParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAnnotationValue7290);
                    this_Literal_0=ruleLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4513:2: this_AnnotationAnnotationValue_1= ruleAnnotationAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getAnnotationAnnotationValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotationAnnotationValue_in_ruleAnnotationValue7320);
                    this_AnnotationAnnotationValue_1=ruleAnnotationAnnotationValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AnnotationAnnotationValue_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4526:2: this_ArrayValue_2= ruleArrayValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getArrayValueParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayValue_in_ruleAnnotationValue7350);
                    this_ArrayValue_2=ruleArrayValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ArrayValue_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationValue


    // $ANTLR start entryRuleAnnotationAnnotationValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4545:1: entryRuleAnnotationAnnotationValue returns [EObject current=null] : iv_ruleAnnotationAnnotationValue= ruleAnnotationAnnotationValue EOF ;
    public final EObject entryRuleAnnotationAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4546:2: (iv_ruleAnnotationAnnotationValue= ruleAnnotationAnnotationValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4547:2: iv_ruleAnnotationAnnotationValue= ruleAnnotationAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationAnnotationValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationAnnotationValue_in_entryRuleAnnotationAnnotationValue7385);
            iv_ruleAnnotationAnnotationValue=ruleAnnotationAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationAnnotationValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationAnnotationValue7395); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationAnnotationValue


    // $ANTLR start ruleAnnotationAnnotationValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4554:1: ruleAnnotationAnnotationValue returns [EObject current=null] : ( (lv_value_0_0= ruleAnnotation ) ) ;
    public final EObject ruleAnnotationAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4559:6: ( ( (lv_value_0_0= ruleAnnotation ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4560:1: ( (lv_value_0_0= ruleAnnotation ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4560:1: ( (lv_value_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4561:1: (lv_value_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4561:1: (lv_value_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4562:3: lv_value_0_0= ruleAnnotation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAnnotationValueAccess().getValueAnnotationParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationAnnotationValue7440);
            lv_value_0_0=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationAnnotationValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"Annotation", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationAnnotationValue


    // $ANTLR start entryRuleArrayValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4592:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4593:2: (iv_ruleArrayValue= ruleArrayValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4594:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrayValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrayValue_in_entryRuleArrayValue7475);
            iv_ruleArrayValue=ruleArrayValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrayValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayValue7485); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArrayValue


    // $ANTLR start ruleArrayValue
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4601:1: ruleArrayValue returns [EObject current=null] : ( () '{' ( ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )* )? '}' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4606:6: ( ( () '{' ( ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )* )? '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4607:1: ( () '{' ( ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )* )? '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4607:1: ( () '{' ( ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )* )? '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4607:2: () '{' ( ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )* )? '}'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4607:2: ()
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4608:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getArrayValueAccess().getArrayValueAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getArrayValueAccess().getArrayValueAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,17,FOLLOW_17_in_ruleArrayValue7532); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrayValueAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4625:1: ( ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_ID||(LA104_0>=RULE_INT && LA104_0<=RULE_STRING)||LA104_0==17||(LA104_0>=40 && LA104_0<=42)||(LA104_0>=48 && LA104_0<=52)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4625:2: ( (lv_values_2_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )*
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4625:2: ( (lv_values_2_0= ruleAnnotationValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4626:1: (lv_values_2_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4626:1: (lv_values_2_0= ruleAnnotationValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4627:3: lv_values_2_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArrayValueAccess().getValuesAnnotationValueParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationValue_in_ruleArrayValue7554);
                    lv_values_2_0=ruleAnnotationValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArrayValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"values",
                      	        		lv_values_2_0, 
                      	        		"AnnotationValue", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4649:2: ( ',' ( (lv_values_4_0= ruleAnnotationValue ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==16) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4649:4: ',' ( (lv_values_4_0= ruleAnnotationValue ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleArrayValue7565); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4653:1: ( (lv_values_4_0= ruleAnnotationValue ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4654:1: (lv_values_4_0= ruleAnnotationValue )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4654:1: (lv_values_4_0= ruleAnnotationValue )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4655:3: lv_values_4_0= ruleAnnotationValue
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getArrayValueAccess().getValuesAnnotationValueParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationValue_in_ruleArrayValue7586);
                    	    lv_values_4_0=ruleAnnotationValue();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getArrayValueRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"values",
                    	      	        		lv_values_4_0, 
                    	      	        		"AnnotationValue", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleArrayValue7600); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrayValueAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArrayValue


    // $ANTLR start entryRuleLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4691:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4692:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4693:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral7638);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral7648); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4700:1: ruleLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PathLiteral_4= rulePathLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_PathLiteral_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4705:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PathLiteral_4= rulePathLiteral ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4706:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PathLiteral_4= rulePathLiteral )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4706:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PathLiteral_4= rulePathLiteral )
            int alt105=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt105=1;
                }
                break;
            case RULE_STRING:
                {
                alt105=2;
                }
                break;
            case 49:
            case 50:
                {
                alt105=3;
                }
                break;
            case 51:
            case 52:
                {
                alt105=4;
                }
                break;
            case RULE_ID:
            case 40:
            case 41:
            case 42:
                {
                alt105=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4706:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PathLiteral_4= rulePathLiteral )", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4707:2: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral7698);
                    this_IntegerLiteral_0=ruleIntegerLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IntegerLiteral_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4720:2: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral7728);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StringLiteral_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4733:2: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral7758);
                    this_NullLiteral_2=ruleNullLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NullLiteral_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4746:2: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral7788);
                    this_BooleanLiteral_3=ruleBooleanLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanLiteral_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4759:2: this_PathLiteral_4= rulePathLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getPathLiteralParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePathLiteral_in_ruleLiteral7818);
                    this_PathLiteral_4=rulePathLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PathLiteral_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleIntegerLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4778:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4779:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4780:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntegerLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral7853);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral7863); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntegerLiteral


    // $ANTLR start ruleIntegerLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4787:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4792:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4793:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4793:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4794:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4794:1: (lv_value_0_0= RULE_INT )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4795:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral7904); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntegerLiteralRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntegerLiteral


    // $ANTLR start entryRuleStringLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4825:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4826:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4827:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7944);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7954); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4834:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4839:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4840:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4840:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4841:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4841:1: (lv_value_0_0= RULE_STRING )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4842:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7995); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleNullLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4872:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4873:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4874:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8035);
            iv_ruleNullLiteral=ruleNullLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral8045); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNullLiteral


    // $ANTLR start ruleNullLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4881:1: ruleNullLiteral returns [EObject current=null] : ( ( (lv_value_0_0= 'NULL' ) ) | ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4886:6: ( ( ( (lv_value_0_0= 'NULL' ) ) | ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4887:1: ( ( (lv_value_0_0= 'NULL' ) ) | ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4887:1: ( ( (lv_value_0_0= 'NULL' ) ) | ( (lv_value_1_0= 'null' ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==49) ) {
                alt106=1;
            }
            else if ( (LA106_0==50) ) {
                alt106=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4887:1: ( ( (lv_value_0_0= 'NULL' ) ) | ( (lv_value_1_0= 'null' ) ) )", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4887:2: ( (lv_value_0_0= 'NULL' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4887:2: ( (lv_value_0_0= 'NULL' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4888:1: (lv_value_0_0= 'NULL' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4888:1: (lv_value_0_0= 'NULL' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4889:3: lv_value_0_0= 'NULL'
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleNullLiteral8088); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNullLiteralAccess().getValueNULLKeyword_0_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNullLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_0, "NULL", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4909:6: ( (lv_value_1_0= 'null' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4909:6: ( (lv_value_1_0= 'null' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4910:1: (lv_value_1_0= 'null' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4910:1: (lv_value_1_0= 'null' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4911:3: lv_value_1_0= 'null'
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleNullLiteral8125); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNullLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_1_0, "null", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNullLiteral


    // $ANTLR start entryRuleBooleanLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4938:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4939:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4940:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8174);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8184); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4947:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4952:6: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4953:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4953:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==51) ) {
                alt107=1;
            }
            else if ( (LA107_0==52) ) {
                alt107=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4953:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4953:2: ( (lv_value_0_0= 'true' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4953:2: ( (lv_value_0_0= 'true' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4954:1: (lv_value_0_0= 'true' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4954:1: (lv_value_0_0= 'true' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4955:3: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleBooleanLiteral8227); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_0, "true", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4975:6: ( (lv_value_1_0= 'false' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4975:6: ( (lv_value_1_0= 'false' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4976:1: (lv_value_1_0= 'false' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4976:1: (lv_value_1_0= 'false' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:4977:3: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleBooleanLiteral8264); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_1_0, "false", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRulePathLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5004:1: entryRulePathLiteral returns [EObject current=null] : iv_rulePathLiteral= rulePathLiteral EOF ;
    public final EObject entryRulePathLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLiteral = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5005:2: (iv_rulePathLiteral= rulePathLiteral EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5006:2: iv_rulePathLiteral= rulePathLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPathLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePathLiteral_in_entryRulePathLiteral8313);
            iv_rulePathLiteral=rulePathLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePathLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePathLiteral8323); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePathLiteral


    // $ANTLR start rulePathLiteral
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5013:1: rulePathLiteral returns [EObject current=null] : ( (lv_value_0_0= rulePath ) ) ;
    public final EObject rulePathLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5018:6: ( ( (lv_value_0_0= rulePath ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5019:1: ( (lv_value_0_0= rulePath ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5019:1: ( (lv_value_0_0= rulePath ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5020:1: (lv_value_0_0= rulePath )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5020:1: (lv_value_0_0= rulePath )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5021:3: lv_value_0_0= rulePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPathLiteralAccess().getValuePathParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePath_in_rulePathLiteral8368);
            lv_value_0_0=rulePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPathLiteralRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"Path", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePathLiteral


    // $ANTLR start entryRuleQualifiedName
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5053:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5054:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5055:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8406);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8417); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5062:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5067:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5068:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5068:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5068:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8457); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5075:1: (kw= '.' this_ID_2= RULE_ID )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==43) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5076:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,43,FOLLOW_43_in_ruleQualifiedName8476); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8491); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleQualifiedNameWithWildCard
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5096:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5097:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5098:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard8539);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard8550); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedNameWithWildCard


    // $ANTLR start ruleQualifiedNameWithWildCard
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5105:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' (this_ID_2= RULE_ID kw= '.' )* (kw= '*' | this_ID_5= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_5=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5110:6: ( (this_ID_0= RULE_ID kw= '.' (this_ID_2= RULE_ID kw= '.' )* (kw= '*' | this_ID_5= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5111:1: (this_ID_0= RULE_ID kw= '.' (this_ID_2= RULE_ID kw= '.' )* (kw= '*' | this_ID_5= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5111:1: (this_ID_0= RULE_ID kw= '.' (this_ID_2= RULE_ID kw= '.' )* (kw= '*' | this_ID_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5111:6: this_ID_0= RULE_ID kw= '.' (this_ID_2= RULE_ID kw= '.' )* (kw= '*' | this_ID_5= RULE_ID )
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard8590); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ruleQualifiedNameWithWildCard8608); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5124:1: (this_ID_2= RULE_ID kw= '.' )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==RULE_ID) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==43) ) {
                        alt109=1;
                    }


                }


                switch (alt109) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5124:6: this_ID_2= RULE_ID kw= '.'
            	    {
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard8624); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_2_0(), null); 
            	          
            	    }
            	    kw=(Token)input.LT(1);
            	    match(input,43,FOLLOW_43_in_ruleQualifiedNameWithWildCard8642); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_2_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5137:3: (kw= '*' | this_ID_5= RULE_ID )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==53) ) {
                alt110=1;
            }
            else if ( (LA110_0==RULE_ID) ) {
                alt110=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5137:3: (kw= '*' | this_ID_5= RULE_ID )", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5138:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleQualifiedNameWithWildCard8658); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_3_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5144:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard8679); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_5);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_3_1(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedNameWithWildCard


    // $ANTLR start ruleFlowTypeKind
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5159:1: ruleFlowTypeKind returns [Enumerator current=null] : ( ( 'struct' ) | ( 'union' ) | ( 'enum' ) ) ;
    public final Enumerator ruleFlowTypeKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5163:6: ( ( ( 'struct' ) | ( 'union' ) | ( 'enum' ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5164:1: ( ( 'struct' ) | ( 'union' ) | ( 'enum' ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5164:1: ( ( 'struct' ) | ( 'union' ) | ( 'enum' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt111=1;
                }
                break;
            case 55:
                {
                alt111=2;
                }
                break;
            case 56:
                {
                alt111=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5164:1: ( ( 'struct' ) | ( 'union' ) | ( 'enum' ) )", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5164:2: ( 'struct' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5164:2: ( 'struct' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5164:4: 'struct'
                    {
                    match(input,54,FOLLOW_54_in_ruleFlowTypeKind8737); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getFlowTypeKindAccess().getSTRUCTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getFlowTypeKindAccess().getSTRUCTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5170:6: ( 'union' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5170:6: ( 'union' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5170:8: 'union'
                    {
                    match(input,55,FOLLOW_55_in_ruleFlowTypeKind8752); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getFlowTypeKindAccess().getUNIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getFlowTypeKindAccess().getUNIONEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5176:6: ( 'enum' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5176:6: ( 'enum' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5176:8: 'enum'
                    {
                    match(input,56,FOLLOW_56_in_ruleFlowTypeKind8767); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getFlowTypeKindAccess().getENUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getFlowTypeKindAccess().getENUMEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlowTypeKind


    // $ANTLR start ruleAttributeType
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5186:1: ruleAttributeType returns [Enumerator current=null] : ( ( 'int' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5190:6: ( ( ( 'int' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5191:1: ( ( 'int' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5191:1: ( ( 'int' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt112=10;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt112=1;
                }
                break;
            case 58:
                {
                alt112=2;
                }
                break;
            case 59:
                {
                alt112=3;
                }
                break;
            case 60:
                {
                alt112=4;
                }
                break;
            case 61:
                {
                alt112=5;
                }
                break;
            case 62:
                {
                alt112=6;
                }
                break;
            case 63:
                {
                alt112=7;
                }
                break;
            case 64:
                {
                alt112=8;
                }
                break;
            case 65:
                {
                alt112=9;
                }
                break;
            case 66:
                {
                alt112=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5191:1: ( ( 'int' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5191:2: ( 'int' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5191:2: ( 'int' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5191:4: 'int'
                    {
                    match(input,57,FOLLOW_57_in_ruleAttributeType8810); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getIntEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5197:6: ( 'string' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5197:6: ( 'string' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5197:8: 'string'
                    {
                    match(input,58,FOLLOW_58_in_ruleAttributeType8825); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5203:6: ( 'int8_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5203:6: ( 'int8_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5203:8: 'int8_t'
                    {
                    match(input,59,FOLLOW_59_in_ruleAttributeType8840); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getInt8_tEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getInt8_tEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5209:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5209:6: ( 'uint8_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5209:8: 'uint8_t'
                    {
                    match(input,60,FOLLOW_60_in_ruleAttributeType8855); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getUint8_tEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUint8_tEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5215:6: ( 'int16_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5215:6: ( 'int16_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5215:8: 'int16_t'
                    {
                    match(input,61,FOLLOW_61_in_ruleAttributeType8870); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getInt16_tEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getInt16_tEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5221:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5221:6: ( 'uint16_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5221:8: 'uint16_t'
                    {
                    match(input,62,FOLLOW_62_in_ruleAttributeType8885); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getUint16_tEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUint16_tEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5227:6: ( 'int32_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5227:6: ( 'int32_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5227:8: 'int32_t'
                    {
                    match(input,63,FOLLOW_63_in_ruleAttributeType8900); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getInt32_tEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getInt32_tEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5233:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5233:6: ( 'uint32_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5233:8: 'uint32_t'
                    {
                    match(input,64,FOLLOW_64_in_ruleAttributeType8915); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getUint32_tEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUint32_tEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5239:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5239:6: ( 'intptr_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5239:8: 'intptr_t'
                    {
                    match(input,65,FOLLOW_65_in_ruleAttributeType8930); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getIntptr_tEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getIntptr_tEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5245:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5245:6: ( 'uintptr_t' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:5245:8: 'uintptr_t'
                    {
                    match(input,66,FOLLOW_66_in_ruleAttributeType8945); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getUintptr_tEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUintptr_tEnumLiteralDeclaration_9(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttributeType

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:100:2: ( ruleTypeDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:100:2: ruleTypeDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleTypeDefinition_in_synpred1141);
        ruleTypeDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:148:2: ( rulePrimitiveDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:148:2: rulePrimitiveDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePrimitiveDefinition_in_synpred2266);
        rulePrimitiveDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:275:1: ( ( ruleImport ) )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:275:1: ( ruleImport )
        {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:275:1: ( ruleImport )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:276:3: ruleImport
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleImport_in_synpred4521);
        ruleImport();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:495:1: ( ( ruleImport ) )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:495:1: ( ruleImport )
        {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:495:1: ( ruleImport )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:496:3: ruleImport
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleImport_in_synpred13839);
        ruleImport();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:714:3: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:714:3: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentInterfaceParserRuleCall_7_0_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred211110);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:735:8: ( ruleAttribute )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:735:8: ruleAttribute
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentAttributeParserRuleCall_7_0_1_0_0_1(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred221129);
        ruleAttribute();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:756:8: ( ruleData )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:756:8: ruleData
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentDataParserRuleCall_7_0_1_0_0_2(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleData_in_synpred231148);
        ruleData();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:813:3: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:813:3: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentInterfaceParserRuleCall_7_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred271226);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:834:8: ( ruleAttribute )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:834:8: ruleAttribute
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentAttributeParserRuleCall_7_1_0_0_1(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred281245);
        ruleAttribute();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:855:8: ( ruleData )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:855:8: ruleData
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getContentDataParserRuleCall_7_1_0_0_2(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleData_in_synpred291264);
        ruleData();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:975:1: ( ( ruleImport ) )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:975:1: ( ruleImport )
        {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:975:1: ( ruleImport )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:976:3: ruleImport
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleImport_in_synpred321485);
        ruleImport();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1233:3: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1233:3: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentInterfaceParserRuleCall_7_0_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred421805);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1254:8: ( ruleSubComponent )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1254:8: ruleSubComponent
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentSubComponentParserRuleCall_7_0_1_0_0_1(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponent_in_synpred431824);
        ruleSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1311:3: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1311:3: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentInterfaceParserRuleCall_7_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred471902);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1332:8: ( ruleSubComponent )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:1332:8: ruleSubComponent
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionAccess().getContentSubComponentParserRuleCall_7_1_0_0_1(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponent_in_synpred481921);
        ruleSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2007:2: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2007:2: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred583075);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2020:2: ( ruleAttribute )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2020:2: ruleAttribute
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred593105);
        ruleAttribute();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2033:2: ( ruleImplementation )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2033:2: ruleImplementation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementation_in_synpred603135);
        ruleImplementation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2046:2: ( ruleSubComponent )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2046:2: ruleSubComponent
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponent_in_synpred613165);
        ruleSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2094:2: ( ruleTypeInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2094:2: ruleTypeInterface
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleTypeInterface_in_synpred623290);
        ruleTypeInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2142:2: ( ruleServerInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2142:2: ruleServerInterface
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleServerInterface_in_synpred633415);
        ruleServerInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2190:2: ( ruleInputInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:2190:2: ruleInputInterface
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleInputInterface_in_synpred643540);
        ruleInputInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred89
    public final void synpred89_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3425:2: ( ruleData )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3425:2: ruleData
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleData_in_synpred895432);
        ruleData();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred89

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3627:1: ( ( ruleAnonymousDefinition ) )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3627:1: ( ruleAnonymousDefinition )
        {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3627:1: ( ruleAnonymousDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3628:3: ruleAnonymousDefinition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getSubComponentAccess().getAnonymousDefAnonymousDefinitionParserRuleCall_5_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAnonymousDefinition_in_synpred955852);
        ruleAnonymousDefinition();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3674:2: ( rulePrimitiveAnonymousDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3674:2: rulePrimitiveAnonymousDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePrimitiveAnonymousDefinition_in_synpred965949);
        rulePrimitiveAnonymousDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3772:3: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3772:3: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentInterfaceParserRuleCall_4_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred986129);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3793:8: ( ruleAttribute )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3793:8: ruleAttribute
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentAttributeParserRuleCall_4_0_0_1(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred996148);
        ruleAttribute();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3814:8: ( ruleData )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3814:8: ruleData
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousDefinitionAccess().getContentDataParserRuleCall_4_0_0_2(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleData_in_synpred1006167);
        ruleData();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3939:3: ( ruleInterface )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3939:3: ruleInterface
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getContentInterfaceParserRuleCall_4_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterface_in_synpred1036360);
        ruleInterface();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3960:8: ( ruleSubComponent )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mind/parser/antlr/internal/InternalAdl.g:3960:8: ruleSubComponent
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousDefinitionAccess().getContentSubComponentParserRuleCall_4_0_0_1(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponent_in_synpred1046379);
        ruleSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred104

    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred48() {
        backtracking++;
        int start = input.mark();
        try {
            synpred48_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred100() {
        backtracking++;
        int start = input.mark();
        try {
            synpred100_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred103() {
        backtracking++;
        int start = input.mark();
        try {
            synpred103_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred64() {
        backtracking++;
        int start = input.mark();
        try {
            synpred64_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred89() {
        backtracking++;
        int start = input.mark();
        try {
            synpred89_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred63() {
        backtracking++;
        int start = input.mark();
        try {
            synpred63_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred60() {
        backtracking++;
        int start = input.mark();
        try {
            synpred60_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred58() {
        backtracking++;
        int start = input.mark();
        try {
            synpred58_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred95() {
        backtracking++;
        int start = input.mark();
        try {
            synpred95_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred99() {
        backtracking++;
        int start = input.mark();
        try {
            synpred99_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleDefinition141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametricDefinition_in_ruleDefinition171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametricDefinition_in_entryRuleParametricDefinition206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametricDefinition216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleParametricDefinition266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleParametricDefinition296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleImport387 = new BitSet(new long[]{0x0001000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport419 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImport429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleTypeDefinition521 = new BitSet(new long[]{0x0001000000005000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypeDefinition543 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDefinition554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition575 = new BitSet(new long[]{0x0001000D10028002L});
    public static final BitSet FOLLOW_15_in_ruleTypeDefinition586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleTypeDefinition607 = new BitSet(new long[]{0x0001000D10030002L});
    public static final BitSet FOLLOW_16_in_ruleTypeDefinition618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleTypeDefinition639 = new BitSet(new long[]{0x0001000D10030002L});
    public static final BitSet FOLLOW_17_in_ruleTypeDefinition655 = new BitSet(new long[]{0x0001000D10040000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleTypeDefinition677 = new BitSet(new long[]{0x0001000D10042000L});
    public static final BitSet FOLLOW_13_in_ruleTypeDefinition688 = new BitSet(new long[]{0x0001000D10040000L});
    public static final BitSet FOLLOW_18_in_ruleTypeDefinition702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleTypeDefinition731 = new BitSet(new long[]{0x0001000D10002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDefinition742 = new BitSet(new long[]{0x0001000D10000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rulePrimitiveDefinition839 = new BitSet(new long[]{0x0001000000181000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePrimitiveDefinition861 = new BitSet(new long[]{0x0001000000180000L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveDefinition880 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveDefinition904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition925 = new BitSet(new long[]{0x000100ED10228002L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition936 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleParameterDecl_in_rulePrimitiveDefinition958 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveDefinition969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDecl_in_rulePrimitiveDefinition990 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveDefinition1004 = new BitSet(new long[]{0x000100ED10028002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveDefinition1017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_rulePrimitiveDefinition1038 = new BitSet(new long[]{0x000100ED10030002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveDefinition1049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_rulePrimitiveDefinition1070 = new BitSet(new long[]{0x000100ED10030002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveDefinition1086 = new BitSet(new long[]{0x000100ED10040000L});
    public static final BitSet FOLLOW_ruleInterface_in_rulePrimitiveDefinition1110 = new BitSet(new long[]{0x000100ED10042000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrimitiveDefinition1129 = new BitSet(new long[]{0x000100ED10042000L});
    public static final BitSet FOLLOW_ruleData_in_rulePrimitiveDefinition1148 = new BitSet(new long[]{0x000100ED10042000L});
    public static final BitSet FOLLOW_ruleSource_in_rulePrimitiveDefinition1167 = new BitSet(new long[]{0x000100ED10042000L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveDefinition1181 = new BitSet(new long[]{0x000100ED10040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveDefinition1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rulePrimitiveDefinition1226 = new BitSet(new long[]{0x000100ED10002002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrimitiveDefinition1245 = new BitSet(new long[]{0x000100ED10002002L});
    public static final BitSet FOLLOW_ruleData_in_rulePrimitiveDefinition1264 = new BitSet(new long[]{0x000100ED10002002L});
    public static final BitSet FOLLOW_ruleSource_in_rulePrimitiveDefinition1283 = new BitSet(new long[]{0x000100ED10002002L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveDefinition1297 = new BitSet(new long[]{0x000100ED10000002L});
    public static final BitSet FOLLOW_ruleParameterDecl_in_entryRuleParameterDecl1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDecl1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDecl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinition1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleCompositeDefinition1485 = new BitSet(new long[]{0x0001000000801000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleCompositeDefinition1507 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeDefinition1518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition1539 = new BitSet(new long[]{0x0001300D11228002L});
    public static final BitSet FOLLOW_24_in_ruleCompositeDefinition1550 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleTemplateParameterDecl_in_ruleCompositeDefinition1572 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeDefinition1583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateParameterDecl_in_ruleCompositeDefinition1604 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeDefinition1618 = new BitSet(new long[]{0x0001300D10228002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition1631 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleParameterDecl_in_ruleCompositeDefinition1653 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeDefinition1664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDecl_in_ruleCompositeDefinition1685 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeDefinition1699 = new BitSet(new long[]{0x0001300D10028002L});
    public static final BitSet FOLLOW_15_in_ruleCompositeDefinition1712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleCompositeDefinition1733 = new BitSet(new long[]{0x0001300D10030002L});
    public static final BitSet FOLLOW_16_in_ruleCompositeDefinition1744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleCompositeDefinition1765 = new BitSet(new long[]{0x0001300D10030002L});
    public static final BitSet FOLLOW_17_in_ruleCompositeDefinition1781 = new BitSet(new long[]{0x0001300D10040000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleCompositeDefinition1805 = new BitSet(new long[]{0x0001300D10042000L});
    public static final BitSet FOLLOW_ruleSubComponent_in_ruleCompositeDefinition1824 = new BitSet(new long[]{0x0001300D10042000L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleCompositeDefinition1843 = new BitSet(new long[]{0x0001300D10042000L});
    public static final BitSet FOLLOW_13_in_ruleCompositeDefinition1857 = new BitSet(new long[]{0x0001300D10040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeDefinition1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleCompositeDefinition1902 = new BitSet(new long[]{0x0001300D10002002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_ruleCompositeDefinition1921 = new BitSet(new long[]{0x0001300D10002002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleCompositeDefinition1940 = new BitSet(new long[]{0x0001300D10002002L});
    public static final BitSet FOLLOW_13_in_ruleCompositeDefinition1954 = new BitSet(new long[]{0x0001300D10000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterDecl_in_entryRuleTemplateParameterDecl1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterDecl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateParameterDecl2047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemplateParameterDecl2062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleTemplateParameterDecl2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_entryRuleDefinitionReference2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionReference2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDefinitionReference2181 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_24_in_ruleDefinitionReference2192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleDefinitionReference2213 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleDefinitionReference2224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleDefinitionReference2245 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_25_in_ruleDefinitionReference2257 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleDefinitionReference2270 = new BitSet(new long[]{0x001E0700000000D0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDefinitionReference2291 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleDefinitionReference2302 = new BitSet(new long[]{0x001E0700000000D0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDefinitionReference2323 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleDefinitionReference2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter2375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterAssignment_in_ruleTemplateParameter2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleTemplateParameter2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterAssignment_in_entryRuleTemplateParameterAssignment2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterAssignment2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateParameterAssignment2563 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemplateParameterAssignment2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleTemplateParameterAssignment2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleParameter2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleParameter2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment2771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterAssignment2823 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParameterAssignment2838 = new BitSet(new long[]{0x001E0700000000D0L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleParameterAssignment2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_entryRuleParameterValue2895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValue2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterValue2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterValue2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent3015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleContent3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleContent3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementation_in_ruleContent3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_ruleContent3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleContent3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface3230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeInterface_in_ruleInterface3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowInterface_in_ruleInterface3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeInterface_in_entryRuleTypeInterface3355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeInterface3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServerInterface_in_ruleTypeInterface3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientInterface_in_ruleTypeInterface3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowInterface_in_entryRuleFlowInterface3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowInterface3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputInterface_in_ruleFlowInterface3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputInterface_in_ruleFlowInterface3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServerInterface_in_entryRuleServerInterface3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServerInterface3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleServerInterface3661 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleServerInterface3672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleServerInterface3693 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleServerInterface3703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServerInterface3720 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleServerInterface3744 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleServerInterface3778 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleServerInterface3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientInterface_in_entryRuleClientInterface3827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClientInterface3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleClientInterface3883 = new BitSet(new long[]{0x0001000100000000L});
    public static final BitSet FOLLOW_32_in_ruleClientInterface3894 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleClientInterface3912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClientInterface3947 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleClientInterface3957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClientInterface3974 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleClientInterface3998 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleClientInterface4032 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleClientInterface4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputInterface_in_entryRuleInputInterface4081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputInterface4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInputInterface4137 = new BitSet(new long[]{0x0001000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInputInterface4148 = new BitSet(new long[]{0xFE00070200000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_33_in_ruleInputInterface4166 = new BitSet(new long[]{0xFE00070000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFlowType_in_ruleInputInterface4201 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInputInterface4211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputInterface4228 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInputInterface4252 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleInputInterface4286 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInputInterface4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputInterface_in_entryRuleOutputInterface4335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputInterface4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleOutputInterface4391 = new BitSet(new long[]{0x0001000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOutputInterface4402 = new BitSet(new long[]{0xFE00070200000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_33_in_ruleOutputInterface4420 = new BitSet(new long[]{0xFE00070000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFlowType_in_ruleOutputInterface4455 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOutputInterface4465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputInterface4482 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleOutputInterface4506 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleOutputInterface4540 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOutputInterface4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowType_in_entryRuleFlowType4589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowType4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleFlowType4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFlowType4673 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFlowType4683 = new BitSet(new long[]{0x01C0000000000010L});
    public static final BitSet FOLLOW_ruleFlowTypeKind_in_ruleFlowType4704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlowType4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute4820 = new BitSet(new long[]{0x0001002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute4831 = new BitSet(new long[]{0xFE00070000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFlowType_in_ruleAttribute4852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4869 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAttribute4885 = new BitSet(new long[]{0x001E0700000000D0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttribute4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue4944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributeValue5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValue5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData5064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleData5120 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_38_in_ruleData5131 = new BitSet(new long[]{0x0000070000000030L});
    public static final BitSet FOLLOW_rulePath_in_ruleData5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INLINEDCODE_in_ruleData5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource5218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSource5274 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSource5285 = new BitSet(new long[]{0x0000070000000030L});
    public static final BitSet FOLLOW_rulePath_in_ruleSource5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INLINEDCODE_in_ruleSource5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementation_in_entryRuleImplementation5372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementation5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleImplementation5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_ruleImplementation5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath5498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePath5548 = new BitSet(new long[]{0x0000060000000010L});
    public static final BitSet FOLLOW_41_in_rulePath5564 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_42_in_rulePath5580 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath5597 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_40_in_rulePath5616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath5631 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_43_in_rulePath5651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_entryRuleSubComponent5711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponent5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSubComponent5767 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSubComponent5778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitionReference_in_ruleSubComponent5799 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSubComponent5809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponent5826 = new BitSet(new long[]{0x0001000000900002L});
    public static final BitSet FOLLOW_ruleAnonymousDefinition_in_ruleSubComponent5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousDefinition_in_entryRuleAnonymousDefinition5889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousDefinition5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousDefinition_in_ruleAnonymousDefinition5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousDefinition_in_ruleAnonymousDefinition5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousDefinition_in_entryRulePrimitiveAnonymousDefinition6016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveAnonymousDefinition6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePrimitiveAnonymousDefinition6084 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveAnonymousDefinition6095 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveAnonymousDefinition6105 = new BitSet(new long[]{0x000100ED10040000L});
    public static final BitSet FOLLOW_ruleInterface_in_rulePrimitiveAnonymousDefinition6129 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrimitiveAnonymousDefinition6148 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleData_in_rulePrimitiveAnonymousDefinition6167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSource_in_rulePrimitiveAnonymousDefinition6186 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveAnonymousDefinition6199 = new BitSet(new long[]{0x000100ED10040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveAnonymousDefinition6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousDefinition_in_entryRuleCompositeAnonymousDefinition6247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeAnonymousDefinition6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleCompositeAnonymousDefinition6315 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeAnonymousDefinition6326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeAnonymousDefinition6336 = new BitSet(new long[]{0x0001300D10040000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleCompositeAnonymousDefinition6360 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSubComponent_in_ruleCompositeAnonymousDefinition6379 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleCompositeAnonymousDefinition6398 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCompositeAnonymousDefinition6411 = new BitSet(new long[]{0x0001300D10040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeAnonymousDefinition6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding6459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleBinding6515 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_45_in_ruleBinding6526 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding6549 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46_in_ruleBinding6565 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleBinding6576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding6598 = new BitSet(new long[]{0x0000800040000000L});
    public static final BitSet FOLLOW_30_in_ruleBinding6609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleBinding6630 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBinding6640 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleBinding6652 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding6675 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46_in_ruleBinding6691 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleBinding6702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding6724 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleBinding6735 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleBinding6756 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBinding6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAnnotation6849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation6870 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAnnotation6881 = new BitSet(new long[]{0x001F0700004200D0L});
    public static final BitSet FOLLOW_ruleSimpleAnnotationField_in_ruleAnnotation6903 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleAnnotation6931 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation6942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleAnnotation6963 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField7016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationField7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationField7068 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAnnotationField7083 = new BitSet(new long[]{0x001F0700000200D0L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationField7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnnotationField_in_entryRuleSimpleAnnotationField7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnnotationField7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleSimpleAnnotationField7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue7230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAnnotationValue7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationAnnotationValue_in_ruleAnnotationValue7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValue_in_ruleAnnotationValue7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationAnnotationValue_in_entryRuleAnnotationAnnotationValue7385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAnnotationValue7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationAnnotationValue7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValue_in_entryRuleArrayValue7475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayValue7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleArrayValue7532 = new BitSet(new long[]{0x001F0700000600D0L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayValue7554 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleArrayValue7565 = new BitSet(new long[]{0x001F0700000200D0L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayValue7586 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleArrayValue7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathLiteral_in_ruleLiteral7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral7853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNullLiteral8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNullLiteral8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBooleanLiteral8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBooleanLiteral8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathLiteral_in_entryRulePathLiteral8313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathLiteral8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rulePathLiteral8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8457 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleQualifiedName8476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8491 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard8539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard8590 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleQualifiedNameWithWildCard8608 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard8624 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleQualifiedNameWithWildCard8642 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_53_in_ruleQualifiedNameWithWildCard8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFlowTypeKind8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFlowTypeKind8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFlowTypeKind8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAttributeType8810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAttributeType8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAttributeType8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAttributeType8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAttributeType8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAttributeType8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAttributeType8900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAttributeType8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAttributeType8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAttributeType8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_synpred1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_synpred2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_synpred4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_synpred13839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred211110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred221129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_synpred231148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred271226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred281245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_synpred291264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_synpred321485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred421805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_synpred431824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred471902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_synpred481921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred583075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred593105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementation_in_synpred603135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_synpred613165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeInterface_in_synpred623290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServerInterface_in_synpred633415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputInterface_in_synpred643540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_synpred895432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousDefinition_in_synpred955852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousDefinition_in_synpred965949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred986129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred996148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_synpred1006167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_synpred1036360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponent_in_synpred1046379 = new BitSet(new long[]{0x0000000000000002L});

}