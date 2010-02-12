package org.ow2.fractal.mind.xtext.parser.antlr.internal; 

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
import org.ow2.fractal.mind.xtext.services.FractalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_CODEC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'composite'", "'<'", "','", "'>'", "'('", "')'", "'extends'", "'contains'", "'as'", "'='", "'?'", "'attribute'", "'['", "']'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'nodata'", "'source'", "'conformsto'", "'@'", "'0x'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'.*'", "'+'", "'-'", "'optional'", "'mandatory'", "'provides'", "'requires'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_CODEC=7;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_PATH=6;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    
    private AntlrDatatypeRuleToken lastConsumedDatatypeToken = new AntlrDatatypeRuleToken();

        public InternalFractalParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g"; }


     
     	private FractalGrammarAccess grammarAccess;
     	
        public InternalFractalParser(TokenStream input, IAstFactory factory, FractalGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlDefinition";	
       	} 



    // $ANTLR start entryRuleAdlDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:73:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:73:55: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:74:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdlDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition73);
            iv_ruleAdlDefinition=ruleAdlDefinition();
            _fsp--;

             current =iv_ruleAdlDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAdlDefinition


    // $ANTLR start ruleAdlDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:81:1: ruleAdlDefinition returns [EObject current=null] : ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_definitionAnnotationsList_1 = null;

        EObject lv_architecturedefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:86:6: ( ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:2: (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:2: (lv_imports_0= ruleImportDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:90:6: lv_imports_0= ruleImportDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition142);
            	    lv_imports_0=ruleImportDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "imports", lv_imports_0, "ImportDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:108:3: (lv_definitionAnnotationsList_1= ruleAnnotationsList )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:111:6: lv_definitionAnnotationsList_1= ruleAnnotationsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getDefinitionAnnotationsListAnnotationsListParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition181);
                    lv_definitionAnnotationsList_1=ruleAnnotationsList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "definitionAnnotationsList", lv_definitionAnnotationsList_1, "AnnotationsList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:129:3: (lv_architecturedefinition_2= ruleArchitectureDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:132:6: lv_architecturedefinition_2= ruleArchitectureDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitecturedefinitionArchitectureDefinitionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition220);
            lv_architecturedefinition_2=ruleArchitectureDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "architecturedefinition", lv_architecturedefinition_2, "ArchitectureDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAdlDefinition


    // $ANTLR start entryRuleImportDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:157:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:157:58: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:158:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition257);
            iv_ruleImportDefinition=ruleImportDefinition();
            _fsp--;

             current =iv_ruleImportDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImportDefinition


    // $ANTLR start ruleImportDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:165:1: ruleImportDefinition returns [EObject current=null] : ( 'import' (lv_importName_1= ruleIMPORT_NAME ) ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:170:6: ( ( 'import' (lv_importName_1= ruleIMPORT_NAME ) ';' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:1: ( 'import' (lv_importName_1= ruleIMPORT_NAME ) ';' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:1: ( 'import' (lv_importName_1= ruleIMPORT_NAME ) ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:2: 'import' (lv_importName_1= ruleIMPORT_NAME ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleImportDefinition301); 

                    createLeafNode(grammarAccess.getImportDefinitionAccess().getImportKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:175:1: (lv_importName_1= ruleIMPORT_NAME )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:178:6: lv_importName_1= ruleIMPORT_NAME
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameIMPORT_NAMEParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIMPORT_NAME_in_ruleImportDefinition335);
            lv_importName_1=ruleIMPORT_NAME();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "importName", lv_importName_1, "IMPORT_NAME", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleImportDefinition348); 

                    createLeafNode(grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImportDefinition


    // $ANTLR start entryRuleArchitectureDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:207:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:207:64: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:208:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArchitectureDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition381);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();
            _fsp--;

             current =iv_ruleArchitectureDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition391); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArchitectureDefinition


    // $ANTLR start ruleArchitectureDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:215:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:220:6: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:221:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:221:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
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
                NoViableAltException nvae =
                    new NoViableAltException("221:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:222:5: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition438);
                    this_ComponentTypeDefinition_0=ruleComponentTypeDefinition();
                    _fsp--;

                     
                            current = this_ComponentTypeDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:232:5: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition465);
                    this_PrimitiveComponentDefinition_1=rulePrimitiveComponentDefinition();
                    _fsp--;

                     
                            current = this_PrimitiveComponentDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:242:5: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition492);
                    this_CompositeComponentDefinition_2=ruleCompositeComponentDefinition();
                    _fsp--;

                     
                            current = this_CompositeComponentDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArchitectureDefinition


    // $ANTLR start entryRulePrimitiveComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:257:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:257:70: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:258:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition524);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();
            _fsp--;

             current =iv_rulePrimitiveComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveComponentDefinition


    // $ANTLR start rulePrimitiveComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:265:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) ) ;
    public final EObject rulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0=null;
        AntlrDatatypeRuleToken lv_name_2 = null;

        EObject lv_primitiveFormalArgumentsList_3 = null;

        EObject lv_referencesList_4 = null;

        EObject lv_elements_6 = null;

        EObject lv_elements_7 = null;

        EObject lv_elements_9 = null;

        EObject lv_elements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:270:6: ( ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:2: (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:2: (lv_abstract_0= 'abstract' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:273:6: lv_abstract_0= 'abstract'
                    {
                    lv_abstract_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePrimitiveComponentDefinition580); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getAbstractAbstractKeyword_0_0(), "abstract"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "abstract", true, "abstract", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_rulePrimitiveComponentDefinition603); 

                    createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:296:1: (lv_name_2= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:299:6: lv_name_2= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition637);
            lv_name_2=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:317:2: (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:320:6: lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition675);
                    lv_primitiveFormalArgumentsList_3=ruleFormalArgumentsList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "primitiveFormalArgumentsList", lv_primitiveFormalArgumentsList_3, "FormalArgumentsList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:338:3: (lv_referencesList_4= rulePrimitiveReferencesList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:341:6: lv_referencesList_4= rulePrimitiveReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getReferencesListPrimitiveReferencesListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition714);
                    lv_referencesList_4=rulePrimitiveReferencesList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "referencesList", lv_referencesList_4, "PrimitiveReferencesList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==EOF||LA11_0==31||(LA11_0>=38 && LA11_0<=40)||LA11_0==42||(LA11_0>=56 && LA11_0<=57)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("359:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:5: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_rulePrimitiveComponentDefinition730); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==31||(LA8_0>=38 && LA8_0<=40)||LA8_0==42||(LA8_0>=56 && LA8_0<=57)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==42) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:366:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition765);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "elements", lv_elements_6, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:384:3: (lv_elements_7= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:387:6: lv_elements_7= rulePrimitiveDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition804);
                    	    lv_elements_7=rulePrimitiveDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "elements", lv_elements_7, "PrimitiveDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_rulePrimitiveComponentDefinition819); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==31||(LA10_0>=38 && LA10_0<=40)||LA10_0==42||(LA10_0>=56 && LA10_0<=57)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:7: (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:7: (lv_elements_9= ruleAnnotationsList )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==42) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:413:6: lv_elements_9= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition861);
                    	            lv_elements_9=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "elements", lv_elements_9, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:431:3: (lv_elements_10= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:434:6: lv_elements_10= rulePrimitiveDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition900);
                    	    lv_elements_10=rulePrimitiveDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "elements", lv_elements_10, "PrimitiveDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveComponentDefinition


    // $ANTLR start entryRulePrimitiveDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:459:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:459:68: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:460:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement940);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();
            _fsp--;

             current =iv_rulePrimitiveDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveDefinitionElement


    // $ANTLR start rulePrimitiveDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:467:1: rulePrimitiveDefinitionElement returns [EObject current=null] : ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:472:6: ( ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 56:
            case 57:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 38:
            case 39:
                {
                alt12=3;
                }
                break;
            case 40:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("473:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:474:5: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement998);
                    this_InterfaceDefinition_0=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:484:5: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1025);
                    this_AttributeDefinition_1=ruleAttributeDefinition();
                    _fsp--;

                     
                            current = this_AttributeDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:494:5: this_DataDefinition_2= ruleDataDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1052);
                    this_DataDefinition_2=ruleDataDefinition();
                    _fsp--;

                     
                            current = this_DataDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:504:5: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1079);
                    this_ImplementationDefinition_3=ruleImplementationDefinition();
                    _fsp--;

                     
                            current = this_ImplementationDefinition_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:512:2: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:512:3: ';'
                    {
                    match(input,14,FOLLOW_14_in_rulePrimitiveDefinitionElement1089); 

                            createLeafNode(grammarAccess.getPrimitiveDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveDefinitionElement


    // $ANTLR start entryRuleComponentTypeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:523:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:523:65: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:524:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1124);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();
            _fsp--;

             current =iv_ruleComponentTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentTypeDefinition1134); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComponentTypeDefinition


    // $ANTLR start ruleComponentTypeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:531:1: ruleComponentTypeDefinition returns [EObject current=null] : ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) ;
    public final EObject ruleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_referencesList_2 = null;

        EObject lv_elements_3 = null;

        EObject lv_elements_4 = null;

        EObject lv_elements_6 = null;

        EObject lv_elements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:536:6: ( ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:537:1: ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:537:1: ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:537:2: 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )
            {
            match(input,19,FOLLOW_19_in_ruleComponentTypeDefinition1168); 

                    createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:1: (lv_name_1= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:544:6: lv_name_1= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1202);
            lv_name_1=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:562:2: (lv_referencesList_2= ruleTypeReferencesList )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:565:6: lv_referencesList_2= ruleTypeReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getReferencesListTypeReferencesListParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1240);
                    lv_referencesList_2=ruleTypeReferencesList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "referencesList", lv_referencesList_2, "TypeReferencesList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:3: ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF||LA19_0==42||(LA19_0>=56 && LA19_0<=57)) ) {
                alt19=1;
            }
            else if ( (LA19_0==17) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("583:3: ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:4: ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:4: ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42||(LA16_0>=56 && LA16_0<=57)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:5: (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:5: (lv_elements_3= ruleAnnotationsList )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==42) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:586:6: lv_elements_3= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_0_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1281);
                    	            lv_elements_3=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "elements", lv_elements_3, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:604:3: (lv_elements_4= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:607:6: lv_elements_4= ruleTypeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1320);
                    	    lv_elements_4=ruleTypeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "elements", lv_elements_4, "TypeDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:6: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:6: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:7: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleComponentTypeDefinition1342); 

                            createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==42||(LA18_0>=56 && LA18_0<=57)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==42) ) {
                    	        alt17=1;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:633:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_1_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1377);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "elements", lv_elements_6, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:651:3: (lv_elements_7= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:654:6: lv_elements_7= ruleTypeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1416);
                    	    lv_elements_7=ruleTypeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "elements", lv_elements_7, "TypeDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleComponentTypeDefinition1431); 

                            createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComponentTypeDefinition


    // $ANTLR start entryRuleTypeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:683:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:683:65: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1466);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();
            _fsp--;

             current =iv_ruleTypeReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1476); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeReferenceDefinition


    // $ANTLR start ruleTypeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:691:1: ruleTypeReferenceDefinition returns [EObject current=null] : (lv_referenceName_0= ruleFQN ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:696:6: ( (lv_referenceName_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:697:1: (lv_referenceName_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:697:1: (lv_referenceName_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:700:6: lv_referenceName_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1534);
            lv_referenceName_0=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeReferenceDefinition


    // $ANTLR start entryRuleTypeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:725:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:725:63: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:726:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1570);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();
            _fsp--;

             current =iv_ruleTypeDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinitionElement1580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDefinitionElement


    // $ANTLR start ruleTypeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:733:1: ruleTypeDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition | (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' ) ) ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_InterfaceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:738:6: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:739:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:739:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' ) )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:740:5: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1627);
                    this_InterfaceDefinition_0=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:749:6: (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:749:6: (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:750:5: this_InterfaceDefinition_1= ruleInterfaceDefinition ';'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1655);
                    this_InterfaceDefinition_1=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,14,FOLLOW_14_in_ruleTypeDefinitionElement1663); 

                            createLeafNode(grammarAccess.getTypeDefinitionElementAccess().getSemicolonKeyword_1_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeDefinitionElement


    // $ANTLR start entryRuleCompositeComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:769:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:769:70: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:770:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1697);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();
            _fsp--;

             current =iv_ruleCompositeComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeComponentDefinition


    // $ANTLR start ruleCompositeComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:777:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) ) ;
    public final EObject ruleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_templateSpecifiersList_2 = null;

        EObject lv_compositeFormalArgumentsList_3 = null;

        EObject lv_referencesList_4 = null;

        EObject lv_elements_6 = null;

        EObject lv_elements_7 = null;

        EObject lv_elements_9 = null;

        EObject lv_elements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:782:6: ( ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:783:1: ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:783:1: ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:783:2: 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )
            {
            match(input,20,FOLLOW_20_in_ruleCompositeComponentDefinition1741); 

                    createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:787:1: (lv_name_1= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:790:6: lv_name_1= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1775);
            lv_name_1=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:808:2: (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:811:6: lv_templateSpecifiersList_2= ruleTemplateSpecifiersList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1813);
                    lv_templateSpecifiersList_2=ruleTemplateSpecifiersList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "templateSpecifiersList", lv_templateSpecifiersList_2, "TemplateSpecifiersList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:829:3: (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:832:6: lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1852);
                    lv_compositeFormalArgumentsList_3=ruleFormalArgumentsList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "compositeFormalArgumentsList", lv_compositeFormalArgumentsList_3, "FormalArgumentsList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:850:3: (lv_referencesList_4= ruleCompositeReferencesList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:853:6: lv_referencesList_4= ruleCompositeReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getReferencesListCompositeReferencesListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1891);
                    lv_referencesList_4=ruleCompositeReferencesList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "referencesList", lv_referencesList_4, "CompositeReferencesList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            else if ( (LA28_0==EOF||LA28_0==20||LA28_0==27||LA28_0==34||LA28_0==42||(LA28_0>=56 && LA28_0<=57)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("871:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:5: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleCompositeComponentDefinition1907); 

                            createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:875:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20||LA25_0==27||LA25_0==34||LA25_0==42||(LA25_0>=56 && LA25_0<=57)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:875:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:875:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==42) ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:878:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1942);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "elements", lv_elements_6, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:896:3: (lv_elements_7= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:899:6: lv_elements_7= ruleCompositeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1981);
                    	    lv_elements_7=ruleCompositeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "elements", lv_elements_7, "CompositeDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleCompositeComponentDefinition1996); 

                            createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20||LA27_0==27||LA27_0==34||LA27_0==42||(LA27_0>=56 && LA27_0<=57)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:7: (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:7: (lv_elements_9= ruleAnnotationsList )?
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==42) ) {
                    	        alt26=1;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:925:6: lv_elements_9= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2038);
                    	            lv_elements_9=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "elements", lv_elements_9, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:943:3: (lv_elements_10= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:946:6: lv_elements_10= ruleCompositeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2077);
                    	    lv_elements_10=ruleCompositeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "elements", lv_elements_10, "CompositeDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeComponentDefinition


    // $ANTLR start entryRuleTemplateSpecifiersList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:971:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:971:64: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:972:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSpecifiersListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2117);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;

             current =iv_ruleTemplateSpecifiersList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2127); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateSpecifiersList


    // $ANTLR start ruleTemplateSpecifiersList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:979:1: ruleTemplateSpecifiersList returns [EObject current=null] : ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject lv_templateSpecifiers_1 = null;

        EObject lv_templateSpecifiers_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:984:6: ( ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:985:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:985:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:985:2: '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>'
            {
            match(input,21,FOLLOW_21_in_ruleTemplateSpecifiersList2161); 

                    createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:989:1: ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:989:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:989:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:992:6: lv_templateSpecifiers_1= ruleTemplateSpecifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2196);
            lv_templateSpecifiers_1=ruleTemplateSpecifier();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSpecifiersListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "templateSpecifiers", lv_templateSpecifiers_1, "TemplateSpecifier", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1010:2: ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==22) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1010:3: ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTemplateSpecifiersList2210); 

            	            createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1014:1: (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1017:6: lv_templateSpecifiers_3= ruleTemplateSpecifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2244);
            	    lv_templateSpecifiers_3=ruleTemplateSpecifier();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTemplateSpecifiersListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "templateSpecifiers", lv_templateSpecifiers_3, "TemplateSpecifier", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            match(input,23,FOLLOW_23_in_ruleTemplateSpecifiersList2260); 

                    createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getGreaterThanSignKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateSpecifiersList


    // $ANTLR start entryRuleFormalArgumentsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1046:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1046:61: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1047:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalArgumentsListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2293);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;

             current =iv_ruleFormalArgumentsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList2303); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormalArgumentsList


    // $ANTLR start ruleFormalArgumentsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:1: ruleFormalArgumentsList returns [EObject current=null] : ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject lv_formalArguments_1 = null;

        EObject lv_formalArguments_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1059:6: ( ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1060:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1060:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1060:2: '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleFormalArgumentsList2337); 

                    createLeafNode(grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1064:1: ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1064:2: (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1064:2: (lv_formalArguments_1= ruleFormalArgument )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1067:6: lv_formalArguments_1= ruleFormalArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2372);
            lv_formalArguments_1=ruleFormalArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormalArgumentsListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "formalArguments", lv_formalArguments_1, "FormalArgument", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1085:2: ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1085:3: ',' (lv_formalArguments_3= ruleFormalArgument )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleFormalArgumentsList2386); 

            	            createLeafNode(grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1089:1: (lv_formalArguments_3= ruleFormalArgument )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1092:6: lv_formalArguments_3= ruleFormalArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2420);
            	    lv_formalArguments_3=ruleFormalArgument();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormalArgumentsListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "formalArguments", lv_formalArguments_3, "FormalArgument", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            match(input,25,FOLLOW_25_in_ruleFormalArgumentsList2436); 

                    createLeafNode(grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormalArgumentsList


    // $ANTLR start entryRulePrimitiveReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1121:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1121:65: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1122:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2469);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;

             current =iv_rulePrimitiveReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferencesList2479); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveReferencesList


    // $ANTLR start rulePrimitiveReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1129:1: rulePrimitiveReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1134:6: ( ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1135:1: ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1135:1: ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1135:2: 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )*
            {
            match(input,26,FOLLOW_26_in_rulePrimitiveReferencesList2513); 

                    createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1139:1: (lv_references_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1142:6: lv_references_1= rulePrimitiveReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2547);
            lv_references_1=rulePrimitiveReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "references", lv_references_1, "PrimitiveReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1160:2: ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1160:3: ',' (lv_references_3= rulePrimitiveReferenceDefinition )
            	    {
            	    match(input,22,FOLLOW_22_in_rulePrimitiveReferencesList2561); 

            	            createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1164:1: (lv_references_3= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1167:6: lv_references_3= rulePrimitiveReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2595);
            	    lv_references_3=rulePrimitiveReferenceDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "references", lv_references_3, "PrimitiveReferenceDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveReferencesList


    // $ANTLR start entryRuleCompositeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1192:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1192:65: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1193:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2634);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;

             current =iv_ruleCompositeReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferencesList2644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeReferencesList


    // $ANTLR start ruleCompositeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1200:1: ruleCompositeReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1205:6: ( ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1206:1: ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1206:1: ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1206:2: 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )*
            {
            match(input,26,FOLLOW_26_in_ruleCompositeReferencesList2678); 

                    createLeafNode(grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1210:1: (lv_references_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1213:6: lv_references_1= ruleCompositeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2712);
            lv_references_1=ruleCompositeReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "references", lv_references_1, "CompositeReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1231:2: ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1231:3: ',' (lv_references_3= ruleCompositeReferenceDefinition )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleCompositeReferencesList2726); 

            	            createLeafNode(grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1235:1: (lv_references_3= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1238:6: lv_references_3= ruleCompositeReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2760);
            	    lv_references_3=ruleCompositeReferenceDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "references", lv_references_3, "CompositeReferenceDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeReferencesList


    // $ANTLR start entryRuleTypeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1263:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1263:60: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1264:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2799);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;

             current =iv_ruleTypeReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferencesList2809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeReferencesList


    // $ANTLR start ruleTypeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1271:1: ruleTypeReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1276:6: ( ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:1: ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:1: ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:2: 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )*
            {
            match(input,26,FOLLOW_26_in_ruleTypeReferencesList2843); 

                    createLeafNode(grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1281:1: (lv_references_1= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1284:6: lv_references_1= ruleTypeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2877);
            lv_references_1=ruleTypeReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "references", lv_references_1, "TypeReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1302:2: ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1302:3: ',' (lv_references_3= ruleTypeReferenceDefinition )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTypeReferencesList2891); 

            	            createLeafNode(grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1306:1: (lv_references_3= ruleTypeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1309:6: lv_references_3= ruleTypeReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2925);
            	    lv_references_3=ruleTypeReferenceDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "references", lv_references_3, "TypeReferenceDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeReferencesList


    // $ANTLR start entryRuleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1334:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1334:56: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1335:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2964);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;

             current =iv_ruleFormalArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument2974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormalArgument


    // $ANTLR start ruleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1342:1: ruleFormalArgument returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1347:6: ( (lv_name_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1348:1: (lv_name_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1348:1: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1350:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument3020); 

            		createLeafNode(grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormalArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormalArgument


    // $ANTLR start entryRuleCompositeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1375:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1375:68: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1376:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3060);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;

             current =iv_ruleCompositeDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3070); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeDefinitionElement


    // $ANTLR start ruleCompositeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1383:1: ruleCompositeDefinitionElement returns [EObject current=null] : ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_0 = null;

        EObject this_CompositeAnonymousSubComponent_1 = null;

        EObject this_InterfaceDefinition_2 = null;

        EObject this_BindingDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1388:6: ( ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:1: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:1: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt34=1;
                }
                break;
            case 20:
                {
                alt34=2;
                }
                break;
            case 56:
            case 57:
                {
                alt34=3;
                }
                break;
            case 34:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1389:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1390:5: this_SubComponentDefinition_0= ruleSubComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3118);
                    this_SubComponentDefinition_0=ruleSubComponentDefinition();
                    _fsp--;

                     
                            current = this_SubComponentDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1400:5: this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getCompositeAnonymousSubComponentParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleCompositeDefinitionElement3145);
                    this_CompositeAnonymousSubComponent_1=ruleCompositeAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_CompositeAnonymousSubComponent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1410:5: this_InterfaceDefinition_2= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3172);
                    this_InterfaceDefinition_2=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1420:5: this_BindingDefinition_3= ruleBindingDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3199);
                    this_BindingDefinition_3=ruleBindingDefinition();
                    _fsp--;

                     
                            current = this_BindingDefinition_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1428:2: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1428:3: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleCompositeDefinitionElement3209); 

                            createLeafNode(grammarAccess.getCompositeDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeDefinitionElement


    // $ANTLR start entryRuleSubComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1439:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1439:64: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1440:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3244);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;

             current =iv_ruleSubComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition3254); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubComponentDefinition


    // $ANTLR start ruleSubComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1447:1: ruleSubComponentDefinition returns [EObject current=null] : ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeSubComponent_1 = null;

        EObject this_CompositeAnonymousSubComponent_2 = null;

        EObject this_PrimitiveSubComponent_3 = null;

        EObject this_PrimitiveAnonymousSubComponent_4 = null;

        EObject this_TemplateSubComponent_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1452:6: ( ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1453:1: ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1453:1: ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1453:2: 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )
            {
            match(input,27,FOLLOW_27_in_ruleSubComponentDefinition3288); 

                    createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1457:1: (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )
            int alt36=5;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1458:5: this_CompositeSubComponent_1= ruleCompositeSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeSubComponentParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3311);
                    this_CompositeSubComponent_1=ruleCompositeSubComponent();
                    _fsp--;

                     
                            current = this_CompositeSubComponent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1468:5: this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeAnonymousSubComponentParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3338);
                    this_CompositeAnonymousSubComponent_2=ruleCompositeAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_CompositeAnonymousSubComponent_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:5: this_PrimitiveSubComponent_3= rulePrimitiveSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveSubComponentParserRuleCall_1_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3365);
                    this_PrimitiveSubComponent_3=rulePrimitiveSubComponent();
                    _fsp--;

                     
                            current = this_PrimitiveSubComponent_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1488:5: this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveAnonymousSubComponentParserRuleCall_1_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3392);
                    this_PrimitiveAnonymousSubComponent_4=rulePrimitiveAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_PrimitiveAnonymousSubComponent_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1498:5: this_TemplateSubComponent_5= ruleTemplateSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplateSubComponentParserRuleCall_1_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3419);
                    this_TemplateSubComponent_5=ruleTemplateSubComponent();
                    _fsp--;

                     
                            current = this_TemplateSubComponent_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubComponentDefinition


    // $ANTLR start entryRuleCompositeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1515:1: entryRuleCompositeReferenceDefinition returns [EObject current=null] : iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF ;
    public final EObject entryRuleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1515:70: (iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1516:2: iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3454);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;

             current =iv_ruleCompositeReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeReferenceDefinition


    // $ANTLR start ruleCompositeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1523:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_templatesList_2 = null;

        EObject lv_templatesList_4 = null;

        EObject lv_argumentsList_7 = null;

        EObject lv_argumentsList_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1528:6: ( ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1529:1: ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1529:1: ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1529:2: (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1529:2: (lv_referenceName_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1532:6: lv_referenceName_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3523);
            lv_referenceName_0=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1550:2: ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1550:3: '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>'
                    {
                    match(input,21,FOLLOW_21_in_ruleCompositeReferenceDefinition3537); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1554:1: (lv_templatesList_2= ruleTemplateDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1557:6: lv_templatesList_2= ruleTemplateDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3571);
                    lv_templatesList_2=ruleTemplateDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "templatesList", lv_templatesList_2, "TemplateDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1575:2: ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==22) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1575:3: ',' (lv_templatesList_4= ruleTemplateDefinition )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3585); 

                    	            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1579:1: (lv_templatesList_4= ruleTemplateDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1582:6: lv_templatesList_4= ruleTemplateDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3619);
                    	    lv_templatesList_4=ruleTemplateDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "templatesList", lv_templatesList_4, "TemplateDefinition", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleCompositeReferenceDefinition3634); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1604:3: ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1604:4: '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleCompositeReferenceDefinition3646); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1608:1: (lv_argumentsList_7= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1611:6: lv_argumentsList_7= ruleArgumentDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3680);
                    lv_argumentsList_7=ruleArgumentDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "argumentsList", lv_argumentsList_7, "ArgumentDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1629:2: ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==22) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1629:3: ',' (lv_argumentsList_9= ruleArgumentDefinition )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3694); 

                    	            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1633:1: (lv_argumentsList_9= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1636:6: lv_argumentsList_9= ruleArgumentDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3728);
                    	    lv_argumentsList_9=ruleArgumentDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "argumentsList", lv_argumentsList_9, "ArgumentDefinition", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleCompositeReferenceDefinition3743); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeReferenceDefinition


    // $ANTLR start entryRuleCompositeSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1665:1: entryRuleCompositeSubComponent returns [EObject current=null] : iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF ;
    public final EObject entryRuleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1665:63: (iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1666:2: iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3778);
            iv_ruleCompositeSubComponent=ruleCompositeSubComponent();
            _fsp--;

             current =iv_ruleCompositeSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSubComponent3788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeSubComponent


    // $ANTLR start ruleCompositeSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1673:1: ruleCompositeSubComponent returns [EObject current=null] : ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1678:6: ( ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1679:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1679:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1679:2: 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID )
            {
            match(input,20,FOLLOW_20_in_ruleCompositeSubComponent3822); 

                    createLeafNode(grammarAccess.getCompositeSubComponentAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1683:1: (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1686:6: lv_referenceDefinition_1= ruleCompositeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3856);
            lv_referenceDefinition_1=ruleCompositeReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "CompositeReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,28,FOLLOW_28_in_ruleCompositeSubComponent3869); 

                    createLeafNode(grammarAccess.getCompositeSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1708:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1710:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeSubComponent3891); 

            		createLeafNode(grammarAccess.getCompositeSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeSubComponent


    // $ANTLR start entryRuleCompositeAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1735:1: entryRuleCompositeAnonymousSubComponent returns [EObject current=null] : iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF ;
    public final EObject entryRuleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1735:72: (iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1736:2: iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3932);
            iv_ruleCompositeAnonymousSubComponent=ruleCompositeAnonymousSubComponent();
            _fsp--;

             current =iv_ruleCompositeAnonymousSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeAnonymousSubComponent


    // $ANTLR start ruleCompositeAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1743:1: ruleCompositeAnonymousSubComponent returns [EObject current=null] : ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' ) ;
    public final EObject ruleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;

        EObject lv_elements_5 = null;

        EObject lv_elements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1748:6: ( ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1749:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1749:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1749:2: 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleCompositeAnonymousSubComponent3976); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1753:1: (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1756:6: lv_referenceDefinition_1= ruleCompositeReferenceDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent4010);
                    lv_referenceDefinition_1=ruleCompositeReferenceDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "CompositeReferenceDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_ruleCompositeAnonymousSubComponent4024); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1778:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1780:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4046); 

            		createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleCompositeAnonymousSubComponent4063); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1802:1: ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==20||LA43_0==27||LA43_0==34||LA43_0==42||(LA43_0>=56 && LA43_0<=57)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1802:2: (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1802:2: (lv_elements_5= ruleAnnotationsList )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==42) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1805:6: lv_elements_5= ruleAnnotationsList
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4098);
            	            lv_elements_5=ruleAnnotationsList();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		add(current, "elements", lv_elements_5, "AnnotationsList", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1823:3: (lv_elements_6= ruleCompositeDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1826:6: lv_elements_6= ruleCompositeDefinitionElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4137);
            	    lv_elements_6=ruleCompositeDefinitionElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_6, "CompositeDefinitionElement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleCompositeAnonymousSubComponent4152); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompositeAnonymousSubComponent


    // $ANTLR start entryRulePrimitiveReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1855:1: entryRulePrimitiveReferenceDefinition returns [EObject current=null] : iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF ;
    public final EObject entryRulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1855:70: (iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1856:2: iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4185);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;

             current =iv_rulePrimitiveReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4195); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveReferenceDefinition


    // $ANTLR start rulePrimitiveReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1863:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_argumentsList_2 = null;

        EObject lv_argumentsList_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1868:6: ( ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1869:1: ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1869:1: ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1869:2: (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1869:2: (lv_referenceName_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1872:6: lv_referenceName_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition4254);
            lv_referenceName_0=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1890:2: ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1890:3: '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_rulePrimitiveReferenceDefinition4268); 

                            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1894:1: (lv_argumentsList_2= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1897:6: lv_argumentsList_2= ruleArgumentDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4302);
                    lv_argumentsList_2=ruleArgumentDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "argumentsList", lv_argumentsList_2, "ArgumentDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1915:2: ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==22) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1915:3: ',' (lv_argumentsList_4= ruleArgumentDefinition )
                    	    {
                    	    match(input,22,FOLLOW_22_in_rulePrimitiveReferenceDefinition4316); 

                    	            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1919:1: (lv_argumentsList_4= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1922:6: lv_argumentsList_4= ruleArgumentDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4350);
                    	    lv_argumentsList_4=ruleArgumentDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "argumentsList", lv_argumentsList_4, "ArgumentDefinition", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_rulePrimitiveReferenceDefinition4365); 

                            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveReferenceDefinition


    // $ANTLR start entryRuleTemplateDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1951:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1951:60: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1952:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4400);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;

             current =iv_ruleTemplateDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition4410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateDefinition


    // $ANTLR start ruleTemplateDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1959:1: ruleTemplateDefinition returns [EObject current=null] : ( ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) ) | ( (lv_templateValue_4= ruleFQN ) | '?' ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_templateName_0=null;
        AntlrDatatypeRuleToken lv_templateValue_2 = null;

        AntlrDatatypeRuleToken lv_templateValue_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1964:6: ( ( ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) ) | ( (lv_templateValue_4= ruleFQN ) | '?' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:1: ( ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) ) | ( (lv_templateValue_4= ruleFQN ) | '?' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:1: ( ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) ) | ( (lv_templateValue_4= ruleFQN ) | '?' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==29) ) {
                    alt48=1;
                }
                else if ( (LA48_1==EOF||(LA48_1>=22 && LA48_1<=23)||LA48_1==36) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1965:1: ( ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) ) | ( (lv_templateValue_4= ruleFQN ) | '?' ) )", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA48_0==30) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1965:1: ( ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) ) | ( (lv_templateValue_4= ruleFQN ) | '?' ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:2: ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:2: ( (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:3: (lv_templateName_0= RULE_ID ) '=' ( (lv_templateValue_2= ruleFQN ) | '?' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:3: (lv_templateName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1967:6: lv_templateName_0= RULE_ID
                    {
                    lv_templateName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition4458); 

                    		createLeafNode(grammarAccess.getTemplateDefinitionAccess().getTemplateNameIDTerminalRuleCall_0_0_0(), "templateName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "templateName", lv_templateName_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,29,FOLLOW_29_in_ruleTemplateDefinition4475); 

                            createLeafNode(grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1989:1: ( (lv_templateValue_2= ruleFQN ) | '?' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==30) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1989:1: ( (lv_templateValue_2= ruleFQN ) | '?' )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1989:2: (lv_templateValue_2= ruleFQN )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1989:2: (lv_templateValue_2= ruleFQN )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1992:6: lv_templateValue_2= ruleFQN
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getTemplateValueFQNParserRuleCall_0_2_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleFQN_in_ruleTemplateDefinition4510);
                            lv_templateValue_2=ruleFQN();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "templateValue", lv_templateValue_2, "FQN", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2011:6: '?'
                            {
                            match(input,30,FOLLOW_30_in_ruleTemplateDefinition4529); 

                                    createLeafNode(grammarAccess.getTemplateDefinitionAccess().getQuestionMarkKeyword_0_2_1(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2016:6: ( (lv_templateValue_4= ruleFQN ) | '?' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2016:6: ( (lv_templateValue_4= ruleFQN ) | '?' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==30) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2016:6: ( (lv_templateValue_4= ruleFQN ) | '?' )", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2016:7: (lv_templateValue_4= ruleFQN )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2016:7: (lv_templateValue_4= ruleFQN )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2019:6: lv_templateValue_4= ruleFQN
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getTemplateValueFQNParserRuleCall_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleFQN_in_ruleTemplateDefinition4572);
                            lv_templateValue_4=ruleFQN();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "templateValue", lv_templateValue_4, "FQN", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2038:6: '?'
                            {
                            match(input,30,FOLLOW_30_in_ruleTemplateDefinition4591); 

                                    createLeafNode(grammarAccess.getTemplateDefinitionAccess().getQuestionMarkKeyword_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateDefinition


    // $ANTLR start entryRuleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2049:1: entryRuleTemplateSubComponent returns [EObject current=null] : iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF ;
    public final EObject entryRuleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2049:62: (iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2050:2: iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4625);
            iv_ruleTemplateSubComponent=ruleTemplateSubComponent();
            _fsp--;

             current =iv_ruleTemplateSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSubComponent4635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateSubComponent


    // $ANTLR start ruleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2057:1: ruleTemplateSubComponent returns [EObject current=null] : ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2062:6: ( ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2063:1: ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2063:1: ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2063:2: ( RULE_ID ) 'as' (lv_name_2= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2063:2: ( RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2066:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4682); 

            		createLeafNode(grammarAccess.getTemplateSubComponentAccess().getTemplateReferenceTemplateSpecifierCrossReference_0_0(), "templateReference"); 
            	

            }

            match(input,28,FOLLOW_28_in_ruleTemplateSubComponent4694); 

                    createLeafNode(grammarAccess.getTemplateSubComponentAccess().getAsKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2083:1: (lv_name_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2085:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4716); 

            		createLeafNode(grammarAccess.getTemplateSubComponentAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateSubComponent


    // $ANTLR start entryRulePrimitiveSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2110:1: entryRulePrimitiveSubComponent returns [EObject current=null] : iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF ;
    public final EObject entryRulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2110:63: (iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2111:2: iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4757);
            iv_rulePrimitiveSubComponent=rulePrimitiveSubComponent();
            _fsp--;

             current =iv_rulePrimitiveSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSubComponent4767); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveSubComponent


    // $ANTLR start rulePrimitiveSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2118:1: rulePrimitiveSubComponent returns [EObject current=null] : ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) ;
    public final EObject rulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2123:6: ( ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2124:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2124:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2124:2: 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID )
            {
            match(input,16,FOLLOW_16_in_rulePrimitiveSubComponent4801); 

                    createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getPrimitiveKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2128:1: (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2131:6: lv_referenceDefinition_1= rulePrimitiveReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4835);
            lv_referenceDefinition_1=rulePrimitiveReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "PrimitiveReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,28,FOLLOW_28_in_rulePrimitiveSubComponent4848); 

                    createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2153:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2155:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4870); 

            		createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveSubComponent


    // $ANTLR start entryRulePrimitiveAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2180:1: entryRulePrimitiveAnonymousSubComponent returns [EObject current=null] : iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF ;
    public final EObject entryRulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2180:72: (iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2181:2: iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4911);
            iv_rulePrimitiveAnonymousSubComponent=rulePrimitiveAnonymousSubComponent();
            _fsp--;

             current =iv_rulePrimitiveAnonymousSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveAnonymousSubComponent


    // $ANTLR start rulePrimitiveAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2188:1: rulePrimitiveAnonymousSubComponent returns [EObject current=null] : ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' ) ;
    public final EObject rulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;

        EObject lv_elements_5 = null;

        EObject lv_elements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2193:6: ( ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2194:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2194:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2194:2: 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}'
            {
            match(input,16,FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4955); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2198:1: (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2201:6: lv_referenceDefinition_1= rulePrimitiveReferenceDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4989);
                    lv_referenceDefinition_1=rulePrimitiveReferenceDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "PrimitiveReferenceDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_rulePrimitiveAnonymousSubComponent5003); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2223:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2225:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent5025); 

            		createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_rulePrimitiveAnonymousSubComponent5042); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2247:1: ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==31||(LA51_0>=38 && LA51_0<=40)||LA51_0==42||(LA51_0>=56 && LA51_0<=57)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2247:2: (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2247:2: (lv_elements_5= ruleAnnotationsList )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==42) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2250:6: lv_elements_5= ruleAnnotationsList
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent5077);
            	            lv_elements_5=ruleAnnotationsList();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		add(current, "elements", lv_elements_5, "AnnotationsList", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2268:3: (lv_elements_6= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2271:6: lv_elements_6= rulePrimitiveDefinitionElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5116);
            	    lv_elements_6=rulePrimitiveDefinitionElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_6, "PrimitiveDefinitionElement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_rulePrimitiveAnonymousSubComponent5131); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveAnonymousSubComponent


    // $ANTLR start entryRuleAttributeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2300:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2300:61: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2301:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5164);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;

             current =iv_ruleAttributeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeDefinition


    // $ANTLR start ruleAttributeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2308:1: ruleAttributeDefinition returns [EObject current=null] : ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_2=null;
        AntlrDatatypeRuleToken lv_type_1 = null;

        AntlrDatatypeRuleToken lv_value_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2313:6: ( ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2314:1: ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2314:1: ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2314:2: 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )?
            {
            match(input,31,FOLLOW_31_in_ruleAttributeDefinition5208); 

                    createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2318:1: (lv_type_1= ruleAttributeType )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=48 && LA52_0<=50)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==RULE_ID) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2321:6: lv_type_1= ruleAttributeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5242);
                    lv_type_1=ruleAttributeType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1, "AttributeType", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2339:3: (lv_attributeName_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2341:6: lv_attributeName_2= RULE_ID
            {
            lv_attributeName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5269); 

            		createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_2_0(), "attributeName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "attributeName", lv_attributeName_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2359:2: ( '=' (lv_value_4= ruleValue ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2359:3: '=' (lv_value_4= ruleValue )
                    {
                    match(input,29,FOLLOW_29_in_ruleAttributeDefinition5287); 

                            createLeafNode(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2363:1: (lv_value_4= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2366:6: lv_value_4= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5321);
                    lv_value_4=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_4, "Value", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttributeDefinition


    // $ANTLR start entryRuleArgumentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2391:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2391:60: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2392:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5360);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;

             current =iv_ruleArgumentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgumentDefinition


    // $ANTLR start ruleArgumentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2399:1: ruleArgumentDefinition returns [EObject current=null] : ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0=null;
        AntlrDatatypeRuleToken lv_argumentValue_2 = null;

        AntlrDatatypeRuleToken lv_argumentValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2404:6: ( ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==29) ) {
                    alt54=1;
                }
                else if ( (LA54_1==EOF||LA54_1==22||LA54_1==25) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2405:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_INT||LA54_0==RULE_STRING||LA54_0==43||(LA54_0>=52 && LA54_0<=53)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2405:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:2: ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:2: ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:3: (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:3: (lv_argumentName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2407:6: lv_argumentName_0= RULE_ID
                    {
                    lv_argumentName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5418); 

                    		createLeafNode(grammarAccess.getArgumentDefinitionAccess().getArgumentNameIDTerminalRuleCall_0_0_0(), "argumentName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "argumentName", lv_argumentName_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,29,FOLLOW_29_in_ruleArgumentDefinition5435); 

                            createLeafNode(grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2429:1: (lv_argumentValue_2= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2432:6: lv_argumentValue_2= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5469);
                    lv_argumentValue_2=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "argumentValue", lv_argumentValue_2, "Value", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2451:6: (lv_argumentValue_3= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2451:6: (lv_argumentValue_3= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2454:6: lv_argumentValue_3= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5514);
                    lv_argumentValue_3=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "argumentValue", lv_argumentValue_3, "Value", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgumentDefinition


    // $ANTLR start entryRuleInterfaceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2479:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2479:61: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2480:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5551);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition5561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceDefinition


    // $ANTLR start ruleInterfaceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2487:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_collection_3=null;
        Token lv_collectionsize_4=null;
        Token lv_collection_5=null;
        Token lv_name_10=null;
        Token lv_collection_11=null;
        Token lv_collectionsize_12=null;
        Token lv_collection_13=null;
        Enumerator lv_role_0 = null;

        Enumerator lv_contingency_6 = null;

        Enumerator lv_role_7 = null;

        AntlrDatatypeRuleToken lv_signature_8 = null;

        Enumerator lv_contingency_14 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2492:6: ( ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2493:1: ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2493:1: ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==56) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==28) ) {
                    alt61=1;
                }
                else if ( (LA61_1==RULE_ID) ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2493:1: ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) )", 61, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA61_0==57) ) {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==RULE_ID) ) {
                    alt61=2;
                }
                else if ( (LA61_2==28) ) {
                    alt61=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2493:1: ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) )", 61, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2493:1: ( ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? ) | ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2493:2: ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2493:2: ( (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )? )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2493:3: (lv_role_0= ruleRole ) 'as' (lv_name_2= RULE_ID ) ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )? (lv_contingency_6= ruleContingency )?
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2493:3: (lv_role_0= ruleRole )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2496:6: lv_role_0= ruleRole
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleInterfaceDefinition5621);
                    lv_role_0=ruleRole();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "role", lv_role_0, "Role", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,28,FOLLOW_28_in_ruleInterfaceDefinition5634); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_0_1(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2518:1: (lv_name_2= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2520:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDefinition5656); 

                    		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_0_2_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2538:2: ( (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==32) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2538:3: (lv_collection_3= '[' ) (lv_collectionsize_4= RULE_INT )? (lv_collection_5= ']' )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2538:3: (lv_collection_3= '[' )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2540:6: lv_collection_3= '['
                            {
                            lv_collection_3=(Token)input.LT(1);
                            match(input,32,FOLLOW_32_in_ruleInterfaceDefinition5686); 

                                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_0_3_0_0(), "collection"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "collection", true, "[", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2559:2: (lv_collectionsize_4= RULE_INT )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==RULE_INT) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2561:6: lv_collectionsize_4= RULE_INT
                                    {
                                    lv_collectionsize_4=(Token)input.LT(1);
                                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInterfaceDefinition5721); 

                                    		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_0_3_1_0(), "collectionsize"); 
                                    	

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "collectionsize", lv_collectionsize_4, "INT", lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }
                                    break;

                            }

                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2579:3: (lv_collection_5= ']' )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2581:6: lv_collection_5= ']'
                            {
                            lv_collection_5=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleInterfaceDefinition5751); 

                                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionRightSquareBracketKeyword_0_3_2_0(), "collection"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "collection", true, "]", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2600:4: (lv_contingency_6= ruleContingency )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=54 && LA57_0<=55)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2603:6: lv_contingency_6= ruleContingency
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_0_4_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleContingency_in_ruleInterfaceDefinition5800);
                            lv_contingency_6=ruleContingency();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "contingency", lv_contingency_6, "Contingency", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2622:6: ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2622:6: ( (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )? )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2622:7: (lv_role_7= ruleRole ) (lv_signature_8= ruleFQN ) 'as' (lv_name_10= RULE_ID ) ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )? (lv_contingency_14= ruleContingency )?
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2622:7: (lv_role_7= ruleRole )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2625:6: lv_role_7= ruleRole
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleInterfaceDefinition5847);
                    lv_role_7=ruleRole();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "role", lv_role_7, "Role", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2643:2: (lv_signature_8= ruleFQN )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2646:6: lv_signature_8= ruleFQN
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFQNParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleInterfaceDefinition5885);
                    lv_signature_8=ruleFQN();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "signature", lv_signature_8, "FQN", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,28,FOLLOW_28_in_ruleInterfaceDefinition5898); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_1_2(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2668:1: (lv_name_10= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2670:6: lv_name_10= RULE_ID
                    {
                    lv_name_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDefinition5920); 

                    		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_1_3_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_10, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2688:2: ( (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==32) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2688:3: (lv_collection_11= '[' ) (lv_collectionsize_12= RULE_INT )? (lv_collection_13= ']' )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2688:3: (lv_collection_11= '[' )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2690:6: lv_collection_11= '['
                            {
                            lv_collection_11=(Token)input.LT(1);
                            match(input,32,FOLLOW_32_in_ruleInterfaceDefinition5950); 

                                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_1_4_0_0(), "collection"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "collection", true, "[", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2709:2: (lv_collectionsize_12= RULE_INT )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==RULE_INT) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2711:6: lv_collectionsize_12= RULE_INT
                                    {
                                    lv_collectionsize_12=(Token)input.LT(1);
                                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInterfaceDefinition5985); 

                                    		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_1_4_1_0(), "collectionsize"); 
                                    	

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "collectionsize", lv_collectionsize_12, "INT", lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }
                                    break;

                            }

                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2729:3: (lv_collection_13= ']' )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2731:6: lv_collection_13= ']'
                            {
                            lv_collection_13=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleInterfaceDefinition6015); 

                                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionRightSquareBracketKeyword_1_4_2_0(), "collection"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "collection", true, "]", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2750:4: (lv_contingency_14= ruleContingency )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=54 && LA60_0<=55)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2753:6: lv_contingency_14= ruleContingency
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_1_5_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleContingency_in_ruleInterfaceDefinition6064);
                            lv_contingency_14=ruleContingency();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "contingency", lv_contingency_14, "Contingency", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterfaceDefinition


    // $ANTLR start entryRuleBindingDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2778:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2778:59: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2779:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition6103);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;

             current =iv_ruleBindingDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition6113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBindingDefinition


    // $ANTLR start ruleBindingDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2786:1: ruleBindingDefinition returns [EObject current=null] : ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceSourceParentName_2=null;
        Token lv_interfaceSourceName_4=null;
        Token lv_interfaceSourceIndex_6=null;
        Token lv_interfaceTargetParentName_10=null;
        Token lv_interfaceTargetName_12=null;
        Token lv_interfaceTargetIndex_14=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2791:6: ( ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2792:1: ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2792:1: ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2792:2: 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            {
            match(input,34,FOLLOW_34_in_ruleBindingDefinition6147); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2796:1: ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2796:1: ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2796:2: 'this'
                    {
                    match(input,35,FOLLOW_35_in_ruleBindingDefinition6157); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2801:6: (lv_interfaceSourceParentName_2= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2801:6: (lv_interfaceSourceParentName_2= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2803:6: lv_interfaceSourceParentName_2= RULE_ID
                    {
                    lv_interfaceSourceParentName_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6185); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentNameIDTerminalRuleCall_1_1_0(), "interfaceSourceParentName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "interfaceSourceParentName", lv_interfaceSourceParentName_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_ruleBindingDefinition6203); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2825:1: (lv_interfaceSourceName_4= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2827:6: lv_interfaceSourceName_4= RULE_ID
            {
            lv_interfaceSourceName_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6225); 

            		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceNameIDTerminalRuleCall_3_0(), "interfaceSourceName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "interfaceSourceName", lv_interfaceSourceName_4, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2845:2: ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==32) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2845:3: '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']'
                    {
                    match(input,32,FOLLOW_32_in_ruleBindingDefinition6243); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_4_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2849:1: (lv_interfaceSourceIndex_6= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2851:6: lv_interfaceSourceIndex_6= RULE_INT
                    {
                    lv_interfaceSourceIndex_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition6265); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceIndexINTTerminalRuleCall_4_1_0(), "interfaceSourceIndex"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "interfaceSourceIndex", lv_interfaceSourceIndex_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,33,FOLLOW_33_in_ruleBindingDefinition6282); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_ruleBindingDefinition6293); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_5(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2877:1: ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==35) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ID) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2877:1: ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2877:2: 'this'
                    {
                    match(input,35,FOLLOW_35_in_ruleBindingDefinition6303); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_6_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2882:6: (lv_interfaceTargetParentName_10= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2882:6: (lv_interfaceTargetParentName_10= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2884:6: lv_interfaceTargetParentName_10= RULE_ID
                    {
                    lv_interfaceTargetParentName_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6331); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentNameIDTerminalRuleCall_6_1_0(), "interfaceTargetParentName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "interfaceTargetParentName", lv_interfaceTargetParentName_10, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_ruleBindingDefinition6349); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_7(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2906:1: (lv_interfaceTargetName_12= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2908:6: lv_interfaceTargetName_12= RULE_ID
            {
            lv_interfaceTargetName_12=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6371); 

            		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetNameIDTerminalRuleCall_8_0(), "interfaceTargetName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "interfaceTargetName", lv_interfaceTargetName_12, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2926:2: ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==32) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2926:3: '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']'
                    {
                    match(input,32,FOLLOW_32_in_ruleBindingDefinition6389); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_9_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2930:1: (lv_interfaceTargetIndex_14= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2932:6: lv_interfaceTargetIndex_14= RULE_INT
                    {
                    lv_interfaceTargetIndex_14=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition6411); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetIndexINTTerminalRuleCall_9_1_0(), "interfaceTargetIndex"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "interfaceTargetIndex", lv_interfaceTargetIndex_14, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,33,FOLLOW_33_in_ruleBindingDefinition6428); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_9_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBindingDefinition


    // $ANTLR start entryRuleDataDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2961:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2961:56: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2962:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6463);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;

             current =iv_ruleDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition6473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataDefinition


    // $ANTLR start ruleDataDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2969:1: ruleDataDefinition returns [EObject current=null] : ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2974:6: ( ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2975:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2975:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            else if ( (LA67_0==39) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2975:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2975:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2975:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2975:3: 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleDataDefinition6508); 

                            createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2979:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ID||LA66_0==RULE_PATH) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==RULE_CODEC) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2979:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2979:2: (lv_fileC_1= ruleFileC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2979:2: (lv_fileC_1= ruleFileC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2982:6: lv_fileC_1= ruleFileC
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition6543);
                            lv_fileC_1=ruleFileC();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "fileC", lv_fileC_1, "FileC", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3001:6: (lv_inlineCcode_2= ruleInlineCodeC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3001:6: (lv_inlineCcode_2= ruleInlineCodeC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3004:6: lv_inlineCcode_2= ruleInlineCodeC
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_0_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6587);
                            lv_inlineCcode_2=ruleInlineCodeC();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inlineCcode", lv_inlineCcode_2, "InlineCodeC", currentNode);
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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3023:6: 'nodata'
                    {
                    match(input,39,FOLLOW_39_in_ruleDataDefinition6608); 

                            createLeafNode(grammarAccess.getDataDefinitionAccess().getNodataKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataDefinition


    // $ANTLR start entryRuleImplementationDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3034:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3034:66: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3035:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6641);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;

             current =iv_ruleImplementationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition6651); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImplementationDefinition


    // $ANTLR start ruleImplementationDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3042:1: ruleImplementationDefinition returns [EObject current=null] : ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3047:6: ( ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3048:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3048:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3048:2: 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
            {
            match(input,40,FOLLOW_40_in_ruleImplementationDefinition6685); 

                    createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3052:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||LA68_0==RULE_PATH) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_CODEC) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3052:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3052:2: (lv_fileC_1= ruleFileC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3052:2: (lv_fileC_1= ruleFileC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3055:6: lv_fileC_1= ruleFileC
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition6720);
                    lv_fileC_1=ruleFileC();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "fileC", lv_fileC_1, "FileC", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3074:6: (lv_inlineCcode_2= ruleInlineCodeC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3074:6: (lv_inlineCcode_2= ruleInlineCodeC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3077:6: lv_inlineCcode_2= ruleInlineCodeC
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6764);
                    lv_inlineCcode_2=ruleInlineCodeC();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "inlineCcode", lv_inlineCcode_2, "InlineCodeC", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImplementationDefinition


    // $ANTLR start entryRuleTemplateSpecifier
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3102:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3102:59: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3103:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6802);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;

             current =iv_ruleTemplateSpecifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier6812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateSpecifier


    // $ANTLR start ruleTemplateSpecifier
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3110:1: ruleTemplateSpecifier returns [EObject current=null] : ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFQN ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        AntlrDatatypeRuleToken lv_componentTypeName_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3115:6: ( ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFQN ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3116:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFQN ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3116:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3116:2: (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3116:2: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3118:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier6859); 

            		createLeafNode(grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,41,FOLLOW_41_in_ruleTemplateSpecifier6876); 

                    createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3140:1: (lv_componentTypeName_2= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3143:6: lv_componentTypeName_2= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getComponentTypeNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleTemplateSpecifier6910);
            lv_componentTypeName_2=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "componentTypeName", lv_componentTypeName_2, "FQN", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTemplateSpecifier


    // $ANTLR start entryRuleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3168:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3168:47: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3169:2: iv_ruleFileC= ruleFileC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC6947);
            iv_ruleFileC=ruleFileC();
            _fsp--;

             current =iv_ruleFileC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFileC


    // $ANTLR start ruleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3176:1: ruleFileC returns [EObject current=null] : ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        Token lv_directory_0=null;
        AntlrDatatypeRuleToken lv_fileName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3181:6: ( ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3182:1: ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3182:1: ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3182:2: (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3182:2: (lv_directory_0= RULE_PATH )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_PATH) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3184:6: lv_directory_0= RULE_PATH
                    {
                    lv_directory_0=(Token)input.LT(1);
                    match(input,RULE_PATH,FOLLOW_RULE_PATH_in_ruleFileC7004); 

                    		createLeafNode(grammarAccess.getFileCAccess().getDirectoryPathTerminalRuleCall_0_0(), "directory"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "directory", lv_directory_0, "Path", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3202:3: (lv_fileName_1= ruleFileName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3205:6: lv_fileName_1= ruleFileName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFileNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC7047);
            lv_fileName_1=ruleFileName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fileName", lv_fileName_1, "FileName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFileC


    // $ANTLR start entryRuleFileName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3230:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3230:49: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3231:2: iv_ruleFileName= ruleFileName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName7085);
            iv_ruleFileName=ruleFileName();
            _fsp--;

             current =iv_ruleFileName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName7096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFileName


    // $ANTLR start ruleFileName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3238:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3244:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3245:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3245:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3245:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName7136); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3252:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==36) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3253:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleFileName7155); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getFileNameAccess().getFullStopKeyword_1_0(), null); 
                        
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName7170); 

                    		current.merge(this_ID_2);
                        
                     
                        createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFileName


    // $ANTLR start entryRuleInlineCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3273:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3273:53: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3274:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC7215);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;

             current =iv_ruleInlineCodeC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC7225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInlineCodeC


    // $ANTLR start ruleInlineCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3281:1: ruleInlineCodeC returns [EObject current=null] : (lv_codeC_0= RULE_CODEC ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3286:6: ( (lv_codeC_0= RULE_CODEC ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3287:1: (lv_codeC_0= RULE_CODEC )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3287:1: (lv_codeC_0= RULE_CODEC )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3289:6: lv_codeC_0= RULE_CODEC
            {
            lv_codeC_0=(Token)input.LT(1);
            match(input,RULE_CODEC,FOLLOW_RULE_CODEC_in_ruleInlineCodeC7271); 

            		createLeafNode(grammarAccess.getInlineCodeCAccess().getCodeCCodeCTerminalRuleCall_0(), "codeC"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInlineCodeCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "codeC", lv_codeC_0, "CodeC", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInlineCodeC


    // $ANTLR start entryRuleAnnotationsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3314:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3314:57: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3315:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7311);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;

             current =iv_ruleAnnotationsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList7321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationsList


    // $ANTLR start ruleAnnotationsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3322:1: ruleAnnotationsList returns [EObject current=null] : ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0 = null;

        EObject lv_annotations_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3327:6: ( ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3328:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3328:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3328:2: (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3328:2: (lv_annotations_0= ruleAnnotation )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3331:6: lv_annotations_0= ruleAnnotation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7380);
            lv_annotations_0=ruleAnnotation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationsListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "annotations", lv_annotations_0, "Annotation", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3349:2: (lv_annotations_1= ruleAnnotation )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==42) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3352:6: lv_annotations_1= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7418);
            	    lv_annotations_1=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAnnotationsListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "annotations", lv_annotations_1, "Annotation", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationsList


    // $ANTLR start entryRuleAnnotation
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3377:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3377:52: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3378:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation7456);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation7466); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3385:1: ruleAnnotation returns [EObject current=null] : ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_annotationElements_3 = null;

        EObject lv_annotationElements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3390:6: ( ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3391:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3391:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3391:2: '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            {
            match(input,42,FOLLOW_42_in_ruleAnnotation7500); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3395:1: (lv_name_1= ruleAnnotationType )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3398:6: lv_name_1= ruleAnnotationType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnotation7534);
            lv_name_1=ruleAnnotationType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "AnnotationType", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3416:2: ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3416:3: '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAnnotation7548); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3420:1: (lv_annotationElements_3= ruleAnnotationElement )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3423:6: lv_annotationElements_3= ruleAnnotationElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7582);
                    lv_annotationElements_3=ruleAnnotationElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "annotationElements", lv_annotationElements_3, "AnnotationElement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3441:2: ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==22) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3441:3: ',' (lv_annotationElements_5= ruleAnnotationElement )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleAnnotation7596); 

                    	            createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3445:1: (lv_annotationElements_5= ruleAnnotationElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3448:6: lv_annotationElements_5= ruleAnnotationElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7630);
                    	    lv_annotationElements_5=ruleAnnotationElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "annotationElements", lv_annotationElements_5, "AnnotationElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleAnnotation7645); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleAnnotationElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3477:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3477:59: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3478:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7680);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;

             current =iv_ruleAnnotationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationElement


    // $ANTLR start ruleAnnotationElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3485:1: ruleAnnotationElement returns [EObject current=null] : ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_1=null;
        EObject lv_elementValue_0 = null;

        EObject lv_elementValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3490:6: ( ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3491:1: ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3491:1: ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT||LA74_0==RULE_STRING||LA74_0==17||LA74_0==42) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3491:1: ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3491:2: (lv_elementValue_0= ruleElementValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3491:2: (lv_elementValue_0= ruleElementValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3494:6: lv_elementValue_0= ruleElementValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7749);
                    lv_elementValue_0=ruleElementValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elementValue", lv_elementValue_0, "ElementValue", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3513:6: ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3513:6: ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3513:7: (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3513:7: (lv_elementName_1= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3515:6: lv_elementName_1= RULE_ID
                    {
                    lv_elementName_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7782); 

                    		createLeafNode(grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_1_0_0(), "elementName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elementName", lv_elementName_1, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,29,FOLLOW_29_in_ruleAnnotationElement7799); 

                            createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_1_1(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3537:1: (lv_elementValue_3= ruleElementValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3540:6: lv_elementValue_3= ruleElementValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7833);
                    lv_elementValue_3=ruleElementValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elementValue", lv_elementValue_3, "ElementValue", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationElement


    // $ANTLR start entryRuleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3565:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3565:54: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3566:2: iv_ruleElementValue= ruleElementValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7871);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;

             current =iv_ruleElementValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7881); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElementValue


    // $ANTLR start ruleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3573:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3578:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3579:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3579:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt75=1;
                }
                break;
            case 42:
                {
                alt75=2;
                }
                break;
            case 17:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3579:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3580:5: this_ConstantValue_0= ruleConstantValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7928);
                    this_ConstantValue_0=ruleConstantValue();
                    _fsp--;

                     
                            current = this_ConstantValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3590:5: this_Annotation_1= ruleAnnotation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7955);
                    this_Annotation_1=ruleAnnotation();
                    _fsp--;

                     
                            current = this_Annotation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3600:5: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7982);
                    this_ElementValueArrayInitializer_2=ruleElementValueArrayInitializer();
                    _fsp--;

                     
                            current = this_ElementValueArrayInitializer_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElementValue


    // $ANTLR start entryRuleConstantValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3615:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3615:55: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3616:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue8014);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue8024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3623:1: ruleConstantValue returns [EObject current=null] : (lv_value_0= ruleConstantFormat ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3628:6: ( (lv_value_0= ruleConstantFormat ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3629:1: (lv_value_0= ruleConstantFormat )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3629:1: (lv_value_0= ruleConstantFormat )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3632:6: lv_value_0= ruleConstantFormat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue8082);
            lv_value_0=ruleConstantFormat();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "ConstantFormat", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleConstantFormat
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3657:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3657:55: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3658:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat8119);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;

             current =iv_ruleConstantFormat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat8130); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantFormat


    // $ANTLR start ruleConstantFormat
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3665:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3671:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3672:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3672:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_STRING) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3672:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3672:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat8170); 

                    		current.merge(this_INT_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3680:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat8196); 

                    		current.merge(this_STRING_1);
                        
                     
                        createLeafNode(grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantFormat


    // $ANTLR start entryRuleElementValueArrayInitializer
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3695:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3695:70: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3696:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer8239);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;

             current =iv_ruleElementValueArrayInitializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer8249); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElementValueArrayInitializer


    // $ANTLR start ruleElementValueArrayInitializer
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3703:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1 = null;

        EObject lv_values_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3708:6: ( ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3709:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3709:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3709:2: '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}'
            {
            match(input,17,FOLLOW_17_in_ruleElementValueArrayInitializer8283); 

                    createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3713:1: (lv_values_1= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3716:6: lv_values_1= ruleElementValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8317);
            lv_values_1=ruleElementValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElementValueArrayInitializerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "values", lv_values_1, "ElementValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3734:2: ( ',' (lv_values_3= ruleElementValue ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==22) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3734:3: ',' (lv_values_3= ruleElementValue )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleElementValueArrayInitializer8331); 

            	            createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3738:1: (lv_values_3= ruleElementValue )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3741:6: lv_values_3= ruleElementValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8365);
            	    lv_values_3=ruleElementValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getElementValueArrayInitializerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "values", lv_values_3, "ElementValue", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer8380); 

                    createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElementValueArrayInitializer


    // $ANTLR start entryRuleValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3770:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3770:46: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3771:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue8414);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue8425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3778:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3784:6: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3785:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3785:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )
            int alt78=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt78=1;
                }
                break;
            case RULE_INT:
            case 52:
            case 53:
                {
                alt78=2;
                }
                break;
            case 43:
                {
                alt78=3;
                }
                break;
            case RULE_STRING:
                {
                alt78=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3785:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3785:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue8465); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3794:5: this_signedINT_1= rulesignedINT
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue8498);
                    this_signedINT_1=rulesignedINT();
                    _fsp--;


                    		current.merge(this_signedINT_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3806:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue8531);
                    this_HexadecimalType_2=ruleHexadecimalType();
                    _fsp--;


                    		current.merge(this_HexadecimalType_2);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3817:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue8557); 

                    		current.merge(this_STRING_3);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleHexadecimalType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3832:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3832:56: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3833:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHexadecimalTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType8601);
            iv_ruleHexadecimalType=ruleHexadecimalType();
            _fsp--;

             current =iv_ruleHexadecimalType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType8612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHexadecimalType


    // $ANTLR start ruleHexadecimalType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3840:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3846:6: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3847:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3847:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3848:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ruleHexadecimalType8650); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getHexadecimalTypeAccess().getXKeyword_0(), null); 
                
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType8665); 

            		current.merge(this_INT_1);
                
             
                createLeafNode(grammarAccess.getHexadecimalTypeAccess().getINTTerminalRuleCall_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleHexadecimalType


    // $ANTLR start entryRuleAnnotationType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3868:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3868:55: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3869:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8709);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;

             current =iv_ruleAnnotationType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType8720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationType


    // $ANTLR start ruleAnnotationType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3876:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3882:6: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3883:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3883:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt79=1;
                }
                break;
            case 45:
                {
                alt79=2;
                }
                break;
            case 46:
                {
                alt79=3;
                }
                break;
            case 47:
                {
                alt79=4;
                }
                break;
            case RULE_ID:
                {
                alt79=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3883:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3884:2: kw= 'Override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleAnnotationType8758); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3891:2: kw= 'Singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleAnnotationType8777); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3898:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleAnnotationType8796); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3905:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleAnnotationType8815); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3912:5: this_FQN_4= ruleFQN
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAnnotationTypeAccess().getFQNParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFQN_in_ruleAnnotationType8843);
                    this_FQN_4=ruleFQN();
                    _fsp--;


                    		current.merge(this_FQN_4);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationType


    // $ANTLR start entryRuleAttributeType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3930:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3930:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3931:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType8887);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;

             current =iv_ruleAttributeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType8898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeType


    // $ANTLR start ruleAttributeType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3938:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3944:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3945:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3945:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt80=1;
                }
                break;
            case 49:
                {
                alt80=2;
                }
                break;
            case 50:
                {
                alt80=3;
                }
                break;
            case RULE_ID:
                {
                alt80=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3945:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3946:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleAttributeType8936); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3953:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleAttributeType8955); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3960:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleAttributeType8974); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3966:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType8995); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getAttributeTypeAccess().getIDTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
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


    // $ANTLR start entryRuleFQN
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3981:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3981:44: (iv_ruleFQN= ruleFQN EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3982:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN9039);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN9050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3989:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3995:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3996:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN9090); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4003:1: (kw= '.' this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==36) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4004:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,36,FOLLOW_36_in_ruleFQN9109); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN9124); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFQN


    // $ANTLR start entryRuleIMPORT_NAME
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4024:1: entryRuleIMPORT_NAME returns [String current=null] : iv_ruleIMPORT_NAME= ruleIMPORT_NAME EOF ;
    public final String entryRuleIMPORT_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT_NAME = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4024:52: (iv_ruleIMPORT_NAME= ruleIMPORT_NAME EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4025:2: iv_ruleIMPORT_NAME= ruleIMPORT_NAME EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIMPORT_NAMERule(), currentNode); 
            pushFollow(FOLLOW_ruleIMPORT_NAME_in_entryRuleIMPORT_NAME9170);
            iv_ruleIMPORT_NAME=ruleIMPORT_NAME();
            _fsp--;

             current =iv_ruleIMPORT_NAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORT_NAME9181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIMPORT_NAME


    // $ANTLR start ruleIMPORT_NAME
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4032:1: ruleIMPORT_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleIMPORT_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4038:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4039:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4039:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4039:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIMPORT_NAME9221); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getIMPORT_NAMEAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4046:1: (kw= '.' this_ID_2= RULE_ID )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==36) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4047:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,36,FOLLOW_36_in_ruleIMPORT_NAME9240); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getIMPORT_NAMEAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIMPORT_NAME9255); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getIMPORT_NAMEAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4059:3: (kw= '.*' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==51) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4060:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleIMPORT_NAME9276); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getIMPORT_NAMEAccess().getFullStopAsteriskKeyword_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIMPORT_NAME


    // $ANTLR start entryRulesignedINT
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4073:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4073:50: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4074:2: iv_rulesignedINT= rulesignedINT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT9317);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;

             current =iv_rulesignedINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT9328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulesignedINT


    // $ANTLR start rulesignedINT
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4081:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4087:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4088:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4088:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4088:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4088:2: (kw= '+' | kw= '-' )?
            int alt84=3;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==52) ) {
                alt84=1;
            }
            else if ( (LA84_0==53) ) {
                alt84=2;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4089:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_rulesignedINT9367); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4096:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_rulesignedINT9386); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT9403); 

            		current.merge(this_INT_2);
                
             
                createLeafNode(grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulesignedINT


    // $ANTLR start ruleContingency
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4116:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4120:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4121:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4121:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==54) ) {
                alt85=1;
            }
            else if ( (LA85_0==55) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4121:1: ( ( 'optional' ) | ( 'mandatory' ) )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4121:2: ( 'optional' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4121:2: ( 'optional' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4121:4: 'optional'
                    {
                    match(input,54,FOLLOW_54_in_ruleContingency9460); 

                            current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4127:6: ( 'mandatory' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4127:6: ( 'mandatory' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4127:8: 'mandatory'
                    {
                    match(input,55,FOLLOW_55_in_ruleContingency9475); 

                            current = grammarAccess.getContingencyAccess().getMandatoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContingencyAccess().getMandatoryEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContingency


    // $ANTLR start ruleRole
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4137:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4141:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4142:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4142:1: ( ( 'provides' ) | ( 'requires' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==56) ) {
                alt86=1;
            }
            else if ( (LA86_0==57) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4142:1: ( ( 'provides' ) | ( 'requires' ) )", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4142:2: ( 'provides' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4142:2: ( 'provides' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4142:4: 'provides'
                    {
                    match(input,56,FOLLOW_56_in_ruleRole9518); 

                            current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4148:6: ( 'requires' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4148:6: ( 'requires' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4148:8: 'requires'
                    {
                    match(input,57,FOLLOW_57_in_ruleRole9533); 

                            current = grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRole


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA20_eotS =
        "\26\uffff";
    static final String DFA20_eofS =
        "\7\uffff\1\16\1\uffff\1\16\1\uffff\2\16\3\uffff\2\16\1\uffff\1\16"+
        "\1\uffff\1\16";
    static final String DFA20_minS =
        "\1\70\2\4\1\34\3\4\1\16\1\34\1\16\1\5\2\16\2\uffff\1\5\2\16\1\41"+
        "\1\16\1\41\1\16";
    static final String DFA20_maxS =
        "\1\71\2\34\1\44\3\4\1\71\1\44\1\71\1\41\2\71\2\uffff\1\41\2\71\1"+
        "\41\1\71\1\41\1\71";
    static final String DFA20_acceptS =
        "\15\uffff\1\2\1\1\7\uffff";
    static final String DFA20_specialS =
        "\26\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2",
            "\1\3\27\uffff\1\4",
            "\1\3\27\uffff\1\4",
            "\1\6\7\uffff\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\15\3\uffff\1\16\15\uffff\1\12\11\uffff\1\16\13\uffff\1\13"+
            "\1\14\2\16",
            "\1\6\7\uffff\1\5",
            "\1\15\3\uffff\1\16\15\uffff\1\17\11\uffff\1\16\13\uffff\1\20"+
            "\1\21\2\16",
            "\1\22\33\uffff\1\23",
            "\1\15\3\uffff\1\16\27\uffff\1\16\15\uffff\2\16",
            "\1\15\3\uffff\1\16\27\uffff\1\16\15\uffff\2\16",
            "",
            "",
            "\1\24\33\uffff\1\25",
            "\1\15\3\uffff\1\16\27\uffff\1\16\15\uffff\2\16",
            "\1\15\3\uffff\1\16\27\uffff\1\16\15\uffff\2\16",
            "\1\23",
            "\1\15\3\uffff\1\16\27\uffff\1\16\13\uffff\1\13\1\14\2\16",
            "\1\25",
            "\1\15\3\uffff\1\16\27\uffff\1\16\13\uffff\1\20\1\21\2\16"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "739:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | (this_InterfaceDefinition_1= ruleInterfaceDefinition ';' ) )";
        }
    }
    static final String DFA36_eotS =
        "\151\uffff";
    static final String DFA36_eofS =
        "\30\uffff\1\51\7\uffff\1\56\110\uffff";
    static final String DFA36_minS =
        "\3\4\1\uffff\1\25\1\uffff\1\30\1\uffff\7\4\1\25\3\26\2\5\1\26\1"+
        "\5\1\26\1\16\1\30\1\26\2\5\1\26\1\5\1\26\1\16\3\4\1\30\2\4\1\34"+
        "\1\26\1\uffff\2\4\1\34\1\26\1\uffff\6\26\2\5\1\26\1\5\2\26\2\5\1"+
        "\26\1\5\2\26\2\5\1\26\1\5\2\26\2\5\1\26\1\5\1\26\3\4\1\26\1\4\2"+
        "\26\1\4\6\26\2\5\1\26\1\5\2\26\2\5\1\26\1\5\1\26\1\4\3\26";
    static final String DFA36_maxS =
        "\1\24\2\34\1\uffff\1\44\1\uffff\1\44\1\uffff\1\4\1\36\1\65\2\4\1"+
        "\65\1\4\2\44\1\27\1\35\2\5\1\31\1\5\1\31\1\71\1\44\1\35\2\5\1\31"+
        "\1\5\1\31\1\71\1\36\1\4\1\36\1\34\2\65\1\34\1\31\1\uffff\2\65\1"+
        "\34\1\31\1\uffff\1\44\1\27\2\44\1\27\1\31\2\5\1\31\1\5\1\31\1\35"+
        "\2\5\1\31\1\5\2\31\2\5\1\31\1\5\1\31\1\35\2\5\1\31\1\5\1\31\1\4"+
        "\1\36\1\4\1\31\1\65\2\31\1\65\1\31\2\44\1\27\1\44\1\31\2\5\1\31"+
        "\1\5\2\31\2\5\1\31\1\5\1\31\1\4\2\31\1\44";
    static final String DFA36_acceptS =
        "\3\uffff\1\5\1\uffff\1\2\1\uffff\1\4\41\uffff\1\1\4\uffff\1\3\72"+
        "\uffff";
    static final String DFA36_specialS =
        "\151\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\3\13\uffff\1\2\3\uffff\1\1",
            "\1\4\27\uffff\1\5",
            "\1\6\27\uffff\1\7",
            "",
            "\1\11\2\uffff\1\12\3\uffff\1\13\7\uffff\1\10",
            "",
            "\1\15\3\uffff\1\16\7\uffff\1\14",
            "",
            "\1\17",
            "\1\20\31\uffff\1\21",
            "\1\22\1\25\2\uffff\1\27\42\uffff\1\26\10\uffff\1\23\1\24",
            "\1\30",
            "\1\31",
            "\1\32\1\35\2\uffff\1\37\42\uffff\1\36\10\uffff\1\33\1\34",
            "\1\40",
            "\1\11\2\uffff\1\12\3\uffff\1\13\7\uffff\1\10",
            "\1\43\1\44\5\uffff\1\41\6\uffff\1\42",
            "\1\43\1\44",
            "\1\46\2\uffff\1\47\3\uffff\1\45",
            "\1\25",
            "\1\25",
            "\1\46\2\uffff\1\47",
            "\1\50",
            "\1\46\2\uffff\1\47",
            "\1\51\2\uffff\1\5\1\51\1\uffff\1\51\6\uffff\1\51\6\uffff\1\51"+
            "\7\uffff\1\51\15\uffff\2\51",
            "\1\15\3\uffff\1\16\7\uffff\1\14",
            "\1\53\2\uffff\1\54\3\uffff\1\52",
            "\1\35",
            "\1\35",
            "\1\53\2\uffff\1\54",
            "\1\55",
            "\1\53\2\uffff\1\54",
            "\1\56\2\uffff\1\7\1\56\1\uffff\1\56\6\uffff\1\56\6\uffff\1\56"+
            "\7\uffff\1\56\15\uffff\2\56",
            "\1\57\31\uffff\1\60",
            "\1\61",
            "\1\62\31\uffff\1\63",
            "\1\12\3\uffff\1\13",
            "\1\64\1\67\2\uffff\1\71\42\uffff\1\70\10\uffff\1\65\1\66",
            "\1\72\1\75\2\uffff\1\77\42\uffff\1\76\10\uffff\1\73\1\74",
            "\1\13",
            "\1\46\2\uffff\1\47",
            "",
            "\1\100\1\103\2\uffff\1\105\42\uffff\1\104\10\uffff\1\101\1\102",
            "\1\106\1\111\2\uffff\1\113\42\uffff\1\112\10\uffff\1\107\1\110",
            "\1\16",
            "\1\53\2\uffff\1\54",
            "",
            "\1\43\1\44\14\uffff\1\114",
            "\1\43\1\44",
            "\1\43\1\44\14\uffff\1\42",
            "\1\43\1\44\5\uffff\1\115\6\uffff\1\116",
            "\1\43\1\44",
            "\1\46\2\uffff\1\47",
            "\1\67",
            "\1\67",
            "\1\46\2\uffff\1\47",
            "\1\117",
            "\1\46\2\uffff\1\47",
            "\1\46\2\uffff\1\47\3\uffff\1\120",
            "\1\75",
            "\1\75",
            "\1\46\2\uffff\1\47",
            "\1\121",
            "\1\46\2\uffff\1\47",
            "\1\53\2\uffff\1\54",
            "\1\103",
            "\1\103",
            "\1\53\2\uffff\1\54",
            "\1\122",
            "\1\53\2\uffff\1\54",
            "\1\53\2\uffff\1\54\3\uffff\1\123",
            "\1\111",
            "\1\111",
            "\1\53\2\uffff\1\54",
            "\1\124",
            "\1\53\2\uffff\1\54",
            "\1\125",
            "\1\126\31\uffff\1\127",
            "\1\130",
            "\1\46\2\uffff\1\47",
            "\1\131\1\134\2\uffff\1\136\42\uffff\1\135\10\uffff\1\132\1\133",
            "\1\46\2\uffff\1\47",
            "\1\53\2\uffff\1\54",
            "\1\137\1\142\2\uffff\1\144\42\uffff\1\143\10\uffff\1\140\1\141",
            "\1\53\2\uffff\1\54",
            "\1\43\1\44\14\uffff\1\114",
            "\1\43\1\44\14\uffff\1\145",
            "\1\43\1\44",
            "\1\43\1\44\14\uffff\1\116",
            "\1\46\2\uffff\1\47",
            "\1\134",
            "\1\134",
            "\1\46\2\uffff\1\47",
            "\1\146",
            "\1\46\2\uffff\1\47",
            "\1\53\2\uffff\1\54",
            "\1\142",
            "\1\142",
            "\1\53\2\uffff\1\54",
            "\1\147",
            "\1\53\2\uffff\1\54",
            "\1\150",
            "\1\46\2\uffff\1\47",
            "\1\53\2\uffff\1\54",
            "\1\43\1\44\14\uffff\1\145"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1457:1: (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition142 = new BitSet(new long[]{0x000004000019A000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition181 = new BitSet(new long[]{0x0000000000198000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIMPORT_NAME_in_ruleImportDefinition335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition580 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition637 = new BitSet(new long[]{0x030005C085020002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition675 = new BitSet(new long[]{0x030005C084020002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition714 = new BitSet(new long[]{0x030005C080020002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition730 = new BitSet(new long[]{0x030005C080040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition765 = new BitSet(new long[]{0x030001C080000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition804 = new BitSet(new long[]{0x030005C080040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveComponentDefinition819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition861 = new BitSet(new long[]{0x030001C080000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition900 = new BitSet(new long[]{0x030005C080000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement998 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1025 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1052 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1079 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveDefinitionElement1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleComponentTypeDefinition1168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1202 = new BitSet(new long[]{0x0300040004020002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1240 = new BitSet(new long[]{0x0300040000020002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1281 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1320 = new BitSet(new long[]{0x0300040000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1342 = new BitSet(new long[]{0x0300040000040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1377 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1416 = new BitSet(new long[]{0x0300040000040000L});
    public static final BitSet FOLLOW_18_in_ruleComponentTypeDefinition1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1655 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDefinitionElement1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeComponentDefinition1741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1775 = new BitSet(new long[]{0x030004040D320002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1813 = new BitSet(new long[]{0x030004040D120002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1852 = new BitSet(new long[]{0x030004040C120002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1891 = new BitSet(new long[]{0x0300040408120002L});
    public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition1907 = new BitSet(new long[]{0x0300040408140000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1942 = new BitSet(new long[]{0x0300000408100000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1981 = new BitSet(new long[]{0x0300040408140000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2038 = new BitSet(new long[]{0x0300000408100000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2077 = new BitSet(new long[]{0x0300040408100002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList2161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2196 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList2210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2244 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList2337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2372 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList2386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2420 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveReferencesList2513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2547 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferencesList2561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2595 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompositeReferencesList2678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2712 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferencesList2726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2760 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeReferencesList2843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2877 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTypeReferencesList2891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2925 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3118 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleCompositeDefinitionElement3145 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3172 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3199 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleCompositeDefinitionElement3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSubComponentDefinition3288 = new BitSet(new long[]{0x0000000000110010L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3523 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3537 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3571 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3585 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3619 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3634 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3646 = new BitSet(new long[]{0x0030080000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3680 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3694 = new BitSet(new long[]{0x0030080000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3728 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSubComponent3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeSubComponent3822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3856 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositeSubComponent3869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeSubComponent3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeAnonymousSubComponent3976 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent4010 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositeAnonymousSubComponent4024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4046 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeAnonymousSubComponent4063 = new BitSet(new long[]{0x0300040408140000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4098 = new BitSet(new long[]{0x0300000408100000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4137 = new BitSet(new long[]{0x0300040408140000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeAnonymousSubComponent4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition4254 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition4268 = new BitSet(new long[]{0x0030080000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4302 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition4316 = new BitSet(new long[]{0x0030080000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4350 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4458 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemplateDefinition4475 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTemplateDefinition4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTemplateDefinition4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTemplateDefinition4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTemplateDefinition4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSubComponent4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4682 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTemplateSubComponent4694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSubComponent4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveSubComponent4801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4835 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveSubComponent4848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4955 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4989 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveAnonymousSubComponent5003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent5025 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveAnonymousSubComponent5042 = new BitSet(new long[]{0x030005C080040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent5077 = new BitSet(new long[]{0x030001C080000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5116 = new BitSet(new long[]{0x030005C080040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveAnonymousSubComponent5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAttributeDefinition5208 = new BitSet(new long[]{0x0007000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5269 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeDefinition5287 = new BitSet(new long[]{0x0030080000000130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5418 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArgumentDefinition5435 = new BitSet(new long[]{0x0030080000000130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition5621 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition5634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition5656 = new BitSet(new long[]{0x00C0000100000002L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition5686 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition5721 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInterfaceDefinition5751 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition5847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInterfaceDefinition5885 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition5898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition5920 = new BitSet(new long[]{0x00C0000100000002L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition5950 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition5985 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInterfaceDefinition6015 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition6103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition6147 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition6157 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6185 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition6203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6225 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition6243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition6265 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition6282 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition6293 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition6303 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6331 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition6349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6371 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition6389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition6411 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataDefinition6508 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataDefinition6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplementationDefinition6685 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier6859 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTemplateSpecifier6876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTemplateSpecifier6910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC6947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATH_in_ruleFileC7004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName7085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName7136 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFileName7155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC7215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODEC_in_ruleInlineCodeC7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7380 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7418 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAnnotation7500 = new BitSet(new long[]{0x0000F00000000010L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation7534 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAnnotation7548 = new BitSet(new long[]{0x0000040000020130L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7582 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation7596 = new BitSet(new long[]{0x0000040000020130L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7630 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleAnnotation7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7782 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationElement7799 = new BitSet(new long[]{0x0000040000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue8014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat8119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer8239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer8283 = new BitSet(new long[]{0x0000040000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8317 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer8331 = new BitSet(new long[]{0x0000040000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8365 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue8414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType8601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleHexadecimalType8650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAnnotationType8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAnnotationType8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAnnotationType8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAnnotationType8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAnnotationType8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType8887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType8898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttributeType8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAttributeType8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAttributeType8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN9039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN9090 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFQN9109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN9124 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleIMPORT_NAME_in_entryRuleIMPORT_NAME9170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORT_NAME9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIMPORT_NAME9221 = new BitSet(new long[]{0x0008001000000002L});
    public static final BitSet FOLLOW_36_in_ruleIMPORT_NAME9240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIMPORT_NAME9255 = new BitSet(new long[]{0x0008001000000002L});
    public static final BitSet FOLLOW_51_in_ruleIMPORT_NAME9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT9317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulesignedINT9367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_53_in_rulesignedINT9386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleContingency9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleContingency9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRole9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleRole9533 = new BitSet(new long[]{0x0000000000000002L});

}