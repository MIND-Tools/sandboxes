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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'extends'", "','", "'composite'", "'<'", "'>'", "'('", "')'", "'contains'", "'as'", "'='", "'?'", "'attribute'", "'['", "']'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'{{'", "'}}'", "'nodata'", "'source'", "'conformsto'", "'@'", "':'", "'/'", "'\\\\'", "'!'", "'\\\"'", "'\\''", "'*'", "'\\\\\\\\'", "'override'", "'singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'optional'", "'mandatory'", "'provides'", "'requires'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:81:1: ruleAdlDefinition returns [EObject current=null] : ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_definitionAnnotationsList_1 = null;

        EObject lv_architecturedefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:86:6: ( ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:2: (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:2: (lv_imports_0= ruleImportDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
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

            if ( (LA2_0==43) ) {
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:129:3: (lv_architecturedefinition_2= ruleArchitectureDefinition )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)||LA3_0==18||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
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
            	    	       		add(current, "architecturedefinition", lv_architecturedefinition_2, "ArchitectureDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
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
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition258);
            iv_ruleImportDefinition=ruleImportDefinition();
            _fsp--;

             current =iv_ruleImportDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition268); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:165:1: ruleImportDefinition returns [EObject current=null] : ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ( '.*' )? ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:170:6: ( ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ( '.*' )? ';' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:1: ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ( '.*' )? ';' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:1: ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ( '.*' )? ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:2: 'import' (lv_importName_1= ruleFullyQualifiedName ) ( '.*' )? ';'
            {
            match(input,11,FOLLOW_11_in_ruleImportDefinition302); 

                    createLeafNode(grammarAccess.getImportDefinitionAccess().getImportKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:175:1: (lv_importName_1= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:178:6: lv_importName_1= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleImportDefinition336);
            lv_importName_1=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "importName", lv_importName_1, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:196:2: ( '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:196:3: '.*'
                    {
                    match(input,12,FOLLOW_12_in_ruleImportDefinition350); 

                            createLeafNode(grammarAccess.getImportDefinitionAccess().getFullStopAsteriskKeyword_2(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleImportDefinition361); 

                    createLeafNode(grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_3(), null); 
                

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:211:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:211:64: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:212:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArchitectureDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition394);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();
            _fsp--;

             current =iv_ruleArchitectureDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition404); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:219:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:224:6: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:225:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:225:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 14:
            case 15:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("225:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:226:5: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition451);
                    this_ComponentTypeDefinition_0=ruleComponentTypeDefinition();
                    _fsp--;

                     
                            current = this_ComponentTypeDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:236:5: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition478);
                    this_PrimitiveComponentDefinition_1=rulePrimitiveComponentDefinition();
                    _fsp--;

                     
                            current = this_PrimitiveComponentDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:246:5: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition505);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:261:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:261:70: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:262:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition537);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();
            _fsp--;

             current =iv_rulePrimitiveComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition547); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:269:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_primitiveReferencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* ) ) ;
    public final EObject rulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0=null;
        AntlrDatatypeRuleToken lv_name_2 = null;

        EObject lv_primitiveFormalArgumentsList_3 = null;

        EObject lv_primitiveReferencesList_4 = null;

        EObject lv_primitiveElements_6 = null;

        EObject lv_primitiveElements_7 = null;

        EObject lv_primitiveElements_9 = null;

        EObject lv_primitiveElements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:274:6: ( ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_primitiveReferencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:275:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_primitiveReferencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:275:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_primitiveReferencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:275:2: (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_primitiveReferencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:275:2: (lv_abstract_0= 'abstract' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:277:6: lv_abstract_0= 'abstract'
                    {
                    lv_abstract_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_rulePrimitiveComponentDefinition593); 

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

            match(input,15,FOLLOW_15_in_rulePrimitiveComponentDefinition616); 

                    createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:300:1: (lv_name_2= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:303:6: lv_name_2= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveComponentDefinition650);
            lv_name_2=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:321:2: (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:324:6: lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition688);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:342:3: (lv_primitiveReferencesList_4= rulePrimitiveReferencesList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:345:6: lv_primitiveReferencesList_4= rulePrimitiveReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveReferencesListPrimitiveReferencesListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition727);
                    lv_primitiveReferencesList_4=rulePrimitiveReferencesList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "primitiveReferencesList", lv_primitiveReferencesList_4, "PrimitiveReferencesList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:3: ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||(LA13_0>=14 && LA13_0<=15)||LA13_0==18||LA13_0==21||LA13_0==30||LA13_0==37||(LA13_0>=40 && LA13_0<=41)||LA13_0==43||(LA13_0>=61 && LA13_0<=62)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("363:3: ( ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )* )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:4: ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:4: ( '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:5: '{' ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_rulePrimitiveComponentDefinition743); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:367:1: ( (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==30||LA10_0==37||(LA10_0>=40 && LA10_0<=41)||LA10_0==43||(LA10_0>=61 && LA10_0<=62)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:367:2: (lv_primitiveElements_6= ruleAnnotationsList )? (lv_primitiveElements_7= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:367:2: (lv_primitiveElements_6= ruleAnnotationsList )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==43) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:370:6: lv_primitiveElements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition778);
                    	            lv_primitiveElements_6=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "primitiveElements", lv_primitiveElements_6, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:388:3: (lv_primitiveElements_7= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:391:6: lv_primitiveElements_7= rulePrimitiveDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveElementsPrimitiveDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition817);
                    	    lv_primitiveElements_7=rulePrimitiveDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "primitiveElements", lv_primitiveElements_7, "PrimitiveDefinitionElement", currentNode);
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

                    match(input,17,FOLLOW_17_in_rulePrimitiveComponentDefinition832); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:414:6: ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:414:6: ( (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==30||LA12_0==37||(LA12_0>=40 && LA12_0<=41)||LA12_0==43||(LA12_0>=61 && LA12_0<=62)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:414:7: (lv_primitiveElements_9= ruleAnnotationsList )? (lv_primitiveElements_10= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:414:7: (lv_primitiveElements_9= ruleAnnotationsList )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==43) ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:417:6: lv_primitiveElements_9= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition874);
                    	            lv_primitiveElements_9=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "primitiveElements", lv_primitiveElements_9, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:435:3: (lv_primitiveElements_10= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:438:6: lv_primitiveElements_10= rulePrimitiveDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveElementsPrimitiveDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition913);
                    	    lv_primitiveElements_10=rulePrimitiveDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "primitiveElements", lv_primitiveElements_10, "PrimitiveDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:463:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:463:68: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:464:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement953);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();
            _fsp--;

             current =iv_rulePrimitiveDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement963); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:471:1: rulePrimitiveDefinitionElement returns [EObject current=null] : ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:476:6: ( ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:477:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:477:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:477:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:477:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 37:
            case 40:
                {
                alt14=3;
                }
                break;
            case 41:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("477:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:478:5: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement1011);
                    this_InterfaceDefinition_0=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:488:5: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1038);
                    this_AttributeDefinition_1=ruleAttributeDefinition();
                    _fsp--;

                     
                            current = this_AttributeDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:498:5: this_DataDefinition_2= ruleDataDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1065);
                    this_DataDefinition_2=ruleDataDefinition();
                    _fsp--;

                     
                            current = this_DataDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:508:5: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1092);
                    this_ImplementationDefinition_3=ruleImplementationDefinition();
                    _fsp--;

                     
                            current = this_ImplementationDefinition_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:516:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:516:3: ';'
                    {
                    match(input,13,FOLLOW_13_in_rulePrimitiveDefinitionElement1102); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:527:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:527:65: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:528:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1137);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();
            _fsp--;

             current =iv_ruleComponentTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentTypeDefinition1147); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:535:1: ruleComponentTypeDefinition returns [EObject current=null] : ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_typeReferencesList_2= ruleTypeReferencesList )? ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) ;
    public final EObject ruleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_typeReferencesList_2 = null;

        EObject lv_typeElements_3 = null;

        EObject lv_typeElements_4 = null;

        EObject lv_typeElements_6 = null;

        EObject lv_typeElements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:540:6: ( ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_typeReferencesList_2= ruleTypeReferencesList )? ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:1: ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_typeReferencesList_2= ruleTypeReferencesList )? ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:1: ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_typeReferencesList_2= ruleTypeReferencesList )? ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:2: 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_typeReferencesList_2= ruleTypeReferencesList )? ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) )
            {
            match(input,18,FOLLOW_18_in_ruleComponentTypeDefinition1181); 

                    createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:545:1: (lv_name_1= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:548:6: lv_name_1= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleComponentTypeDefinition1215);
            lv_name_1=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:566:2: (lv_typeReferencesList_2= ruleTypeReferencesList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:569:6: lv_typeReferencesList_2= ruleTypeReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeReferencesListTypeReferencesListParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1253);
                    lv_typeReferencesList_2=ruleTypeReferencesList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "typeReferencesList", lv_typeReferencesList_2, "TypeReferencesList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:587:3: ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EOF||(LA21_0>=14 && LA21_0<=15)||LA21_0==18||LA21_0==21||LA21_0==43||(LA21_0>=61 && LA21_0<=62)) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("587:3: ( ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:587:4: ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:587:4: ( (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==43||(LA18_0>=61 && LA18_0<=62)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:587:5: (lv_typeElements_3= ruleAnnotationsList )? (lv_typeElements_4= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:587:5: (lv_typeElements_3= ruleAnnotationsList )?
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==43) ) {
                    	        alt17=1;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:590:6: lv_typeElements_3= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeElementsAnnotationsListParserRuleCall_3_0_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1294);
                    	            lv_typeElements_3=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "typeElements", lv_typeElements_3, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:608:3: (lv_typeElements_4= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:611:6: lv_typeElements_4= ruleTypeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeElementsTypeDefinitionElementParserRuleCall_3_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1333);
                    	    lv_typeElements_4=ruleTypeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "typeElements", lv_typeElements_4, "TypeDefinitionElement", currentNode);
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


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:6: ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:6: ( '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:7: '{' ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleComponentTypeDefinition1355); 

                            createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:634:1: ( (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==43||(LA20_0>=61 && LA20_0<=62)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:634:2: (lv_typeElements_6= ruleAnnotationsList )? (lv_typeElements_7= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:634:2: (lv_typeElements_6= ruleAnnotationsList )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==43) ) {
                    	        alt19=1;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:637:6: lv_typeElements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeElementsAnnotationsListParserRuleCall_3_1_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1390);
                    	            lv_typeElements_6=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "typeElements", lv_typeElements_6, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:655:3: (lv_typeElements_7= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:658:6: lv_typeElements_7= ruleTypeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeElementsTypeDefinitionElementParserRuleCall_3_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1429);
                    	    lv_typeElements_7=ruleTypeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "typeElements", lv_typeElements_7, "TypeDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleComponentTypeDefinition1444); 

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


    // $ANTLR start entryRuleTypeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:687:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:687:60: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:688:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList1479);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;

             current =iv_ruleTypeReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferencesList1489); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:695:1: ruleTypeReferencesList returns [EObject current=null] : ( 'extends' (lv_typeReferences_1= ruleTypeReferenceDefinition ) ( ',' (lv_typeReferences_3= ruleTypeReferenceDefinition ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_typeReferences_1 = null;

        EObject lv_typeReferences_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:700:6: ( ( 'extends' (lv_typeReferences_1= ruleTypeReferenceDefinition ) ( ',' (lv_typeReferences_3= ruleTypeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:701:1: ( 'extends' (lv_typeReferences_1= ruleTypeReferenceDefinition ) ( ',' (lv_typeReferences_3= ruleTypeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:701:1: ( 'extends' (lv_typeReferences_1= ruleTypeReferenceDefinition ) ( ',' (lv_typeReferences_3= ruleTypeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:701:2: 'extends' (lv_typeReferences_1= ruleTypeReferenceDefinition ) ( ',' (lv_typeReferences_3= ruleTypeReferenceDefinition ) )*
            {
            match(input,19,FOLLOW_19_in_ruleTypeReferencesList1523); 

                    createLeafNode(grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:705:1: (lv_typeReferences_1= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:708:6: lv_typeReferences_1= ruleTypeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getTypeReferencesTypeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList1557);
            lv_typeReferences_1=ruleTypeReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "typeReferences", lv_typeReferences_1, "TypeReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:726:2: ( ',' (lv_typeReferences_3= ruleTypeReferenceDefinition ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:726:3: ',' (lv_typeReferences_3= ruleTypeReferenceDefinition )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleTypeReferencesList1571); 

            	            createLeafNode(grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:730:1: (lv_typeReferences_3= ruleTypeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:733:6: lv_typeReferences_3= ruleTypeReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getTypeReferencesTypeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList1605);
            	    lv_typeReferences_3=ruleTypeReferenceDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "typeReferences", lv_typeReferences_3, "TypeReferenceDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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


    // $ANTLR start entryRuleTypeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:758:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:758:65: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:759:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1644);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();
            _fsp--;

             current =iv_ruleTypeReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1654); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:766:1: ruleTypeReferenceDefinition returns [EObject current=null] : (lv_referenceName_0= ruleFullyQualifiedName ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:771:6: ( (lv_referenceName_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:772:1: (lv_referenceName_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:772:1: (lv_referenceName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:775:6: lv_referenceName_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFullyQualifiedNameParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypeReferenceDefinition1712);
            lv_referenceName_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FullyQualifiedName", currentNode);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:800:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:800:63: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:801:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1748);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();
            _fsp--;

             current =iv_ruleTypeDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinitionElement1758); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:808:1: ruleTypeDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:813:6: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:814:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:814:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:815:5: this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1805);
            this_InterfaceDefinition_0=ruleInterfaceDefinition();
            _fsp--;

             
                    current = this_InterfaceDefinition_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:823:1: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:823:2: ';'
                    {
                    match(input,13,FOLLOW_13_in_ruleTypeDefinitionElement1814); 

                            createLeafNode(grammarAccess.getTypeDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                        

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
    // $ANTLR end ruleTypeDefinitionElement


    // $ANTLR start entryRuleCompositeComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:834:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:834:70: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:835:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1849);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();
            _fsp--;

             current =iv_ruleCompositeComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1859); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:842:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_compositeReferencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* ) ) ;
    public final EObject ruleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_templateSpecifiersList_2 = null;

        EObject lv_compositeFormalArgumentsList_3 = null;

        EObject lv_compositeReferencesList_4 = null;

        EObject lv_compositeElements_6 = null;

        EObject lv_compositeElements_7 = null;

        EObject lv_compositeElements_9 = null;

        EObject lv_compositeElements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:847:6: ( ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_compositeReferencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:848:1: ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_compositeReferencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:848:1: ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_compositeReferencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:848:2: 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_compositeReferencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* )
            {
            match(input,21,FOLLOW_21_in_ruleCompositeComponentDefinition1893); 

                    createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:852:1: (lv_name_1= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:855:6: lv_name_1= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleCompositeComponentDefinition1927);
            lv_name_1=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:873:2: (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:876:6: lv_templateSpecifiersList_2= ruleTemplateSpecifiersList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1965);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:894:3: (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:897:6: lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition2004);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:915:3: (lv_compositeReferencesList_4= ruleCompositeReferencesList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:918:6: lv_compositeReferencesList_4= ruleCompositeReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeReferencesListCompositeReferencesListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition2043);
                    lv_compositeReferencesList_4=ruleCompositeReferencesList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "compositeReferencesList", lv_compositeReferencesList_4, "CompositeReferencesList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:936:3: ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            else if ( (LA31_0==EOF||(LA31_0>=14 && LA31_0<=15)||LA31_0==18||LA31_0==21||LA31_0==26||LA31_0==33||LA31_0==43||(LA31_0>=61 && LA31_0<=62)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("936:3: ( ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )* )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:936:4: ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:936:4: ( '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:936:5: '{' ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleCompositeComponentDefinition2059); 

                            createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:940:1: ( (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==26||LA28_0==33||LA28_0==43||(LA28_0>=61 && LA28_0<=62)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:940:2: (lv_compositeElements_6= ruleAnnotationsList )? (lv_compositeElements_7= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:940:2: (lv_compositeElements_6= ruleAnnotationsList )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==43) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:943:6: lv_compositeElements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2094);
                    	            lv_compositeElements_6=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "compositeElements", lv_compositeElements_6, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:961:3: (lv_compositeElements_7= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:964:6: lv_compositeElements_7= ruleCompositeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeElementsCompositeDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2133);
                    	    lv_compositeElements_7=ruleCompositeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "compositeElements", lv_compositeElements_7, "CompositeDefinitionElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleCompositeComponentDefinition2148); 

                            createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:987:6: ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:987:6: ( (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==26||LA30_0==33||LA30_0==43||(LA30_0>=61 && LA30_0<=62)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:987:7: (lv_compositeElements_9= ruleAnnotationsList )? (lv_compositeElements_10= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:987:7: (lv_compositeElements_9= ruleAnnotationsList )?
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==43) ) {
                    	        alt29=1;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:990:6: lv_compositeElements_9= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2190);
                    	            lv_compositeElements_9=ruleAnnotationsList();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        
                    	            	        try {
                    	            	       		add(current, "compositeElements", lv_compositeElements_9, "AnnotationsList", currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1008:3: (lv_compositeElements_10= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1011:6: lv_compositeElements_10= ruleCompositeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeElementsCompositeDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2229);
                    	    lv_compositeElements_10=ruleCompositeDefinitionElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "compositeElements", lv_compositeElements_10, "CompositeDefinitionElement", currentNode);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1036:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1036:64: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1037:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSpecifiersListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2269);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;

             current =iv_ruleTemplateSpecifiersList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2279); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1044:1: ruleTemplateSpecifiersList returns [EObject current=null] : ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject lv_templateSpecifiers_1 = null;

        EObject lv_templateSpecifiers_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1049:6: ( ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1050:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1050:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1050:2: '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>'
            {
            match(input,22,FOLLOW_22_in_ruleTemplateSpecifiersList2313); 

                    createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:1: ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1057:6: lv_templateSpecifiers_1= ruleTemplateSpecifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2348);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1075:2: ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1075:3: ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleTemplateSpecifiersList2362); 

            	            createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1079:1: (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1082:6: lv_templateSpecifiers_3= ruleTemplateSpecifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2396);
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
            	    break loop32;
                }
            } while (true);


            }

            match(input,23,FOLLOW_23_in_ruleTemplateSpecifiersList2412); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1111:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1111:61: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1112:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalArgumentsListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2445);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;

             current =iv_ruleFormalArgumentsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList2455); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1119:1: ruleFormalArgumentsList returns [EObject current=null] : ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject lv_formalArguments_1 = null;

        EObject lv_formalArguments_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1124:6: ( ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:2: '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleFormalArgumentsList2489); 

                    createLeafNode(grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1129:1: ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1129:2: (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1129:2: (lv_formalArguments_1= ruleFormalArgument )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1132:6: lv_formalArguments_1= ruleFormalArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2524);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1150:2: ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1150:3: ',' (lv_formalArguments_3= ruleFormalArgument )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleFormalArgumentsList2538); 

            	            createLeafNode(grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1154:1: (lv_formalArguments_3= ruleFormalArgument )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1157:6: lv_formalArguments_3= ruleFormalArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2572);
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
            	    break loop33;
                }
            } while (true);


            }

            match(input,25,FOLLOW_25_in_ruleFormalArgumentsList2588); 

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


    // $ANTLR start entryRuleCompositeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1186:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1186:65: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1187:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2621);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;

             current =iv_ruleCompositeReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferencesList2631); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1194:1: ruleCompositeReferencesList returns [EObject current=null] : ( 'extends' (lv_compositeReferences_1= ruleCompositeReferenceDefinition ) ( ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_compositeReferences_1 = null;

        EObject lv_compositeReferences_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1199:6: ( ( 'extends' (lv_compositeReferences_1= ruleCompositeReferenceDefinition ) ( ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1200:1: ( 'extends' (lv_compositeReferences_1= ruleCompositeReferenceDefinition ) ( ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1200:1: ( 'extends' (lv_compositeReferences_1= ruleCompositeReferenceDefinition ) ( ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1200:2: 'extends' (lv_compositeReferences_1= ruleCompositeReferenceDefinition ) ( ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition ) )*
            {
            match(input,19,FOLLOW_19_in_ruleCompositeReferencesList2665); 

                    createLeafNode(grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1204:1: (lv_compositeReferences_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1207:6: lv_compositeReferences_1= ruleCompositeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getCompositeReferencesCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2699);
            lv_compositeReferences_1=ruleCompositeReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "compositeReferences", lv_compositeReferences_1, "CompositeReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1225:2: ( ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1225:3: ',' (lv_compositeReferences_3= ruleCompositeReferenceDefinition )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleCompositeReferencesList2713); 

            	            createLeafNode(grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1229:1: (lv_compositeReferences_3= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1232:6: lv_compositeReferences_3= ruleCompositeReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getCompositeReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2747);
            	    lv_compositeReferences_3=ruleCompositeReferenceDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "compositeReferences", lv_compositeReferences_3, "CompositeReferenceDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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


    // $ANTLR start entryRulePrimitiveReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1257:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1257:65: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1258:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2786);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;

             current =iv_rulePrimitiveReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferencesList2796); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1265:1: rulePrimitiveReferencesList returns [EObject current=null] : ( 'extends' (lv_primitiveReferences_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_primitiveReferences_1 = null;

        EObject lv_primitiveReferences_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1270:6: ( ( 'extends' (lv_primitiveReferences_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1271:1: ( 'extends' (lv_primitiveReferences_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1271:1: ( 'extends' (lv_primitiveReferences_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1271:2: 'extends' (lv_primitiveReferences_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition ) )*
            {
            match(input,19,FOLLOW_19_in_rulePrimitiveReferencesList2830); 

                    createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1275:1: (lv_primitiveReferences_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1278:6: lv_primitiveReferences_1= rulePrimitiveReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getPrimitiveReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2864);
            lv_primitiveReferences_1=rulePrimitiveReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "primitiveReferences", lv_primitiveReferences_1, "PrimitiveReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1296:2: ( ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1296:3: ',' (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition )
            	    {
            	    match(input,20,FOLLOW_20_in_rulePrimitiveReferencesList2878); 

            	            createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1300:1: (lv_primitiveReferences_3= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1303:6: lv_primitiveReferences_3= rulePrimitiveReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getPrimitiveReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2912);
            	    lv_primitiveReferences_3=rulePrimitiveReferenceDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "primitiveReferences", lv_primitiveReferences_3, "PrimitiveReferenceDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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


    // $ANTLR start entryRuleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1328:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1328:56: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1329:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2951);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;

             current =iv_ruleFormalArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument2961); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1336:1: ruleFormalArgument returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1341:6: ( (lv_name_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1342:1: (lv_name_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1342:1: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1344:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument3007); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1369:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1369:68: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1370:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3047);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;

             current =iv_ruleCompositeDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3057); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1377:1: ruleCompositeDefinitionElement returns [EObject current=null] : ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ( ';' )? ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_0 = null;

        EObject this_InterfaceDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1382:6: ( ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1383:1: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1383:1: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1383:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1383:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt36=1;
                }
                break;
            case 61:
            case 62:
                {
                alt36=2;
                }
                break;
            case 33:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1383:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1384:5: this_SubComponentDefinition_0= ruleSubComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3105);
                    this_SubComponentDefinition_0=ruleSubComponentDefinition();
                    _fsp--;

                     
                            current = this_SubComponentDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1394:5: this_InterfaceDefinition_1= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3132);
                    this_InterfaceDefinition_1=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1404:5: this_BindingDefinition_2= ruleBindingDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3159);
                    this_BindingDefinition_2=ruleBindingDefinition();
                    _fsp--;

                     
                            current = this_BindingDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1412:2: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1412:3: ';'
                    {
                    match(input,13,FOLLOW_13_in_ruleCompositeDefinitionElement3169); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1423:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1423:64: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1424:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3204);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;

             current =iv_ruleSubComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition3214); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1431:1: ruleSubComponentDefinition returns [EObject current=null] : ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeSubComponent_1 = null;

        EObject this_CompositeAnonymousSubComponent_2 = null;

        EObject this_PrimitiveSubComponent_3 = null;

        EObject this_PrimitiveAnonymousSubComponent_4 = null;

        EObject this_TemplateSubComponent_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1436:6: ( ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1437:1: ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1437:1: ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1437:2: 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )
            {
            match(input,26,FOLLOW_26_in_ruleSubComponentDefinition3248); 

                    createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1441:1: (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )
            int alt38=5;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1442:5: this_CompositeSubComponent_1= ruleCompositeSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeSubComponentParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3271);
                    this_CompositeSubComponent_1=ruleCompositeSubComponent();
                    _fsp--;

                     
                            current = this_CompositeSubComponent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1452:5: this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeAnonymousSubComponentParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3298);
                    this_CompositeAnonymousSubComponent_2=ruleCompositeAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_CompositeAnonymousSubComponent_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1462:5: this_PrimitiveSubComponent_3= rulePrimitiveSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveSubComponentParserRuleCall_1_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3325);
                    this_PrimitiveSubComponent_3=rulePrimitiveSubComponent();
                    _fsp--;

                     
                            current = this_PrimitiveSubComponent_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1472:5: this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveAnonymousSubComponentParserRuleCall_1_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3352);
                    this_PrimitiveAnonymousSubComponent_4=rulePrimitiveAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_PrimitiveAnonymousSubComponent_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1482:5: this_TemplateSubComponent_5= ruleTemplateSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplateSubComponentParserRuleCall_1_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3379);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1497:1: entryRuleCompositeReferenceDefinition returns [EObject current=null] : iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF ;
    public final EObject entryRuleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1497:70: (iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1498:2: iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3412);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;

             current =iv_ruleCompositeReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3422); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1505:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_templatesList_2 = null;

        EObject lv_templatesList_4 = null;

        EObject lv_argumentsList_7 = null;

        EObject lv_argumentsList_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1510:6: ( ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1511:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1511:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1511:2: (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1511:2: (lv_referenceName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1514:6: lv_referenceName_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFullyQualifiedNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleCompositeReferenceDefinition3481);
            lv_referenceName_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1532:2: ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1532:3: '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3495); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1536:1: (lv_templatesList_2= ruleTemplateDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1539:6: lv_templatesList_2= ruleTemplateDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3529);
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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1557:2: ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1557:3: ',' (lv_templatesList_4= ruleTemplateDefinition )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleCompositeReferenceDefinition3543); 

                    	            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1561:1: (lv_templatesList_4= ruleTemplateDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1564:6: lv_templatesList_4= ruleTemplateDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3577);
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
                    	    break loop39;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleCompositeReferenceDefinition3592); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1586:3: ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1586:4: '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleCompositeReferenceDefinition3604); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1590:1: (lv_argumentsList_7= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1593:6: lv_argumentsList_7= ruleArgumentDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3638);
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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1611:2: ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1611:3: ',' (lv_argumentsList_9= ruleArgumentDefinition )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleCompositeReferenceDefinition3652); 

                    	            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1615:1: (lv_argumentsList_9= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1618:6: lv_argumentsList_9= ruleArgumentDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3686);
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
                    	    break loop41;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleCompositeReferenceDefinition3701); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1647:1: entryRuleCompositeSubComponent returns [EObject current=null] : iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF ;
    public final EObject entryRuleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1647:63: (iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1648:2: iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3736);
            iv_ruleCompositeSubComponent=ruleCompositeSubComponent();
            _fsp--;

             current =iv_ruleCompositeSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSubComponent3746); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1655:1: ruleCompositeSubComponent returns [EObject current=null] : ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_compositeReferenceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1660:6: ( ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1661:1: ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1661:1: ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1661:2: 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID )
            {
            match(input,21,FOLLOW_21_in_ruleCompositeSubComponent3780); 

                    createLeafNode(grammarAccess.getCompositeSubComponentAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1665:1: (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1668:6: lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeSubComponentAccess().getCompositeReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3814);
            lv_compositeReferenceDefinition_1=ruleCompositeReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "compositeReferenceDefinition", lv_compositeReferenceDefinition_1, "CompositeReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,27,FOLLOW_27_in_ruleCompositeSubComponent3827); 

                    createLeafNode(grammarAccess.getCompositeSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1690:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1692:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeSubComponent3849); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1717:1: entryRuleCompositeAnonymousSubComponent returns [EObject current=null] : iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF ;
    public final EObject entryRuleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1717:72: (iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1718:2: iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3890);
            iv_ruleCompositeAnonymousSubComponent=ruleCompositeAnonymousSubComponent();
            _fsp--;

             current =iv_ruleCompositeAnonymousSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3900); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1725:1: ruleCompositeAnonymousSubComponent returns [EObject current=null] : ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement ) )* '}' ) ;
    public final EObject ruleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_compositeReferenceDefinition_1 = null;

        EObject lv_compositeElements_5 = null;

        EObject lv_compositeElements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1730:6: ( ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1731:1: ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1731:1: ( 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1731:2: 'composite' (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement ) )* '}'
            {
            match(input,21,FOLLOW_21_in_ruleCompositeAnonymousSubComponent3934); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1735:1: (lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1738:6: lv_compositeReferenceDefinition_1= ruleCompositeReferenceDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3968);
                    lv_compositeReferenceDefinition_1=ruleCompositeReferenceDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "compositeReferenceDefinition", lv_compositeReferenceDefinition_1, "CompositeReferenceDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleCompositeAnonymousSubComponent3982); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1760:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1762:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4004); 

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

            match(input,16,FOLLOW_16_in_ruleCompositeAnonymousSubComponent4021); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1784:1: ( (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==26||LA45_0==33||LA45_0==43||(LA45_0>=61 && LA45_0<=62)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1784:2: (lv_compositeElements_5= ruleAnnotationsList )? (lv_compositeElements_6= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1784:2: (lv_compositeElements_5= ruleAnnotationsList )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==43) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1787:6: lv_compositeElements_5= ruleAnnotationsList
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4056);
            	            lv_compositeElements_5=ruleAnnotationsList();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		add(current, "compositeElements", lv_compositeElements_5, "AnnotationsList", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1805:3: (lv_compositeElements_6= ruleCompositeDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1808:6: lv_compositeElements_6= ruleCompositeDefinitionElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeElementsCompositeDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4095);
            	    lv_compositeElements_6=ruleCompositeDefinitionElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "compositeElements", lv_compositeElements_6, "CompositeDefinitionElement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleCompositeAnonymousSubComponent4110); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1837:1: entryRulePrimitiveReferenceDefinition returns [EObject current=null] : iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF ;
    public final EObject entryRulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1837:70: (iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1838:2: iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4143);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;

             current =iv_rulePrimitiveReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4153); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1845:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_argumentsList_2 = null;

        EObject lv_argumentsList_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1850:6: ( ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1851:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1851:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1851:2: (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1851:2: (lv_referenceName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1854:6: lv_referenceName_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFullyQualifiedNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveReferenceDefinition4212);
            lv_referenceName_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1872:2: ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1872:3: '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_rulePrimitiveReferenceDefinition4226); 

                            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1876:1: (lv_argumentsList_2= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1879:6: lv_argumentsList_2= ruleArgumentDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4260);
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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1897:2: ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==20) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1897:3: ',' (lv_argumentsList_4= ruleArgumentDefinition )
                    	    {
                    	    match(input,20,FOLLOW_20_in_rulePrimitiveReferenceDefinition4274); 

                    	            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1901:1: (lv_argumentsList_4= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1904:6: lv_argumentsList_4= ruleArgumentDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4308);
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
                    	    break loop46;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_rulePrimitiveReferenceDefinition4323); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1933:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1933:60: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1934:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4358);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;

             current =iv_ruleTemplateDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition4368); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1941:1: ruleTemplateDefinition returns [EObject current=null] : ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_templateName_0=null;
        AntlrDatatypeRuleToken lv_templateValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1946:6: ( ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1947:1: ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1947:1: ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1947:2: ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1947:2: ( (lv_templateName_0= RULE_ID ) '=' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==28) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1947:3: (lv_templateName_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1947:3: (lv_templateName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1949:6: lv_templateName_0= RULE_ID
                    {
                    lv_templateName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition4416); 

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

                    match(input,28,FOLLOW_28_in_ruleTemplateDefinition4433); 

                            createLeafNode(grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1971:3: ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==29) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1971:3: ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1971:4: (lv_templateValue_2= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1971:4: (lv_templateValue_2= ruleFullyQualifiedName )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1974:6: lv_templateValue_2= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getTemplateValueFullyQualifiedNameParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTemplateDefinition4470);
                    lv_templateValue_2=ruleFullyQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "templateValue", lv_templateValue_2, "FullyQualifiedName", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1993:6: '?'
                    {
                    match(input,29,FOLLOW_29_in_ruleTemplateDefinition4489); 

                            createLeafNode(grammarAccess.getTemplateDefinitionAccess().getQuestionMarkKeyword_1_1(), null); 
                        

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
    // $ANTLR end ruleTemplateDefinition


    // $ANTLR start entryRuleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2004:1: entryRuleTemplateSubComponent returns [EObject current=null] : iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF ;
    public final EObject entryRuleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2004:62: (iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2005:2: iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4523);
            iv_ruleTemplateSubComponent=ruleTemplateSubComponent();
            _fsp--;

             current =iv_ruleTemplateSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSubComponent4533); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2012:1: ruleTemplateSubComponent returns [EObject current=null] : ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2017:6: ( ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2018:1: ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2018:1: ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2018:2: ( RULE_ID ) 'as' (lv_name_2= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2018:2: ( RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2021:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4580); 

            		createLeafNode(grammarAccess.getTemplateSubComponentAccess().getTemplateReferenceDefinitionTemplateSpecifierCrossReference_0_0(), "templateReferenceDefinition"); 
            	

            }

            match(input,27,FOLLOW_27_in_ruleTemplateSubComponent4592); 

                    createLeafNode(grammarAccess.getTemplateSubComponentAccess().getAsKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2038:1: (lv_name_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2040:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4614); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2065:1: entryRulePrimitiveSubComponent returns [EObject current=null] : iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF ;
    public final EObject entryRulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2065:63: (iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2066:2: iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4655);
            iv_rulePrimitiveSubComponent=rulePrimitiveSubComponent();
            _fsp--;

             current =iv_rulePrimitiveSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSubComponent4665); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2073:1: rulePrimitiveSubComponent returns [EObject current=null] : ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) ;
    public final EObject rulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_primitiveReferenceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2078:6: ( ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2079:1: ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2079:1: ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2079:2: 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID )
            {
            match(input,15,FOLLOW_15_in_rulePrimitiveSubComponent4699); 

                    createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getPrimitiveKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2083:1: (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2086:6: lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveSubComponentAccess().getPrimitiveReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4733);
            lv_primitiveReferenceDefinition_1=rulePrimitiveReferenceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "primitiveReferenceDefinition", lv_primitiveReferenceDefinition_1, "PrimitiveReferenceDefinition", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,27,FOLLOW_27_in_rulePrimitiveSubComponent4746); 

                    createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2108:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2110:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4768); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2135:1: entryRulePrimitiveAnonymousSubComponent returns [EObject current=null] : iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF ;
    public final EObject entryRulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2135:72: (iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2136:2: iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4809);
            iv_rulePrimitiveAnonymousSubComponent=rulePrimitiveAnonymousSubComponent();
            _fsp--;

             current =iv_rulePrimitiveAnonymousSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4819); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2143:1: rulePrimitiveAnonymousSubComponent returns [EObject current=null] : ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement ) )* '}' ) ;
    public final EObject rulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_primitiveReferenceDefinition_1 = null;

        EObject lv_primitiveElements_5 = null;

        EObject lv_primitiveElements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2148:6: ( ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2149:1: ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2149:1: ( 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2149:2: 'primitive' (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement ) )* '}'
            {
            match(input,15,FOLLOW_15_in_rulePrimitiveAnonymousSubComponent4853); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2153:1: (lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2156:6: lv_primitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4887);
                    lv_primitiveReferenceDefinition_1=rulePrimitiveReferenceDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "primitiveReferenceDefinition", lv_primitiveReferenceDefinition_1, "PrimitiveReferenceDefinition", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_rulePrimitiveAnonymousSubComponent4901); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2178:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2180:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4923); 

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

            match(input,16,FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4940); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2202:1: ( (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==30||LA52_0==37||(LA52_0>=40 && LA52_0<=41)||LA52_0==43||(LA52_0>=61 && LA52_0<=62)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2202:2: (lv_primitiveElements_5= ruleAnnotationsList )? (lv_primitiveElements_6= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2202:2: (lv_primitiveElements_5= ruleAnnotationsList )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==43) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2205:6: lv_primitiveElements_5= ruleAnnotationsList
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4975);
            	            lv_primitiveElements_5=ruleAnnotationsList();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		add(current, "primitiveElements", lv_primitiveElements_5, "AnnotationsList", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2223:3: (lv_primitiveElements_6= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2226:6: lv_primitiveElements_6= rulePrimitiveDefinitionElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveElementsPrimitiveDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5014);
            	    lv_primitiveElements_6=rulePrimitiveDefinitionElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "primitiveElements", lv_primitiveElements_6, "PrimitiveDefinitionElement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_rulePrimitiveAnonymousSubComponent5029); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2255:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2255:61: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2256:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5062);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;

             current =iv_ruleAttributeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5072); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2263:1: ruleAttributeDefinition returns [EObject current=null] : ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_2=null;
        AntlrDatatypeRuleToken lv_type_1 = null;

        AntlrDatatypeRuleToken lv_value_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2268:6: ( ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2269:1: ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2269:1: ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2269:2: 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )?
            {
            match(input,30,FOLLOW_30_in_ruleAttributeDefinition5106); 

                    createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2273:1: (lv_type_1= ruleAttributeType )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=56 && LA53_0<=58)) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==RULE_ID) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2276:6: lv_type_1= ruleAttributeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5140);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2294:3: (lv_attributeName_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2296:6: lv_attributeName_2= RULE_ID
            {
            lv_attributeName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5167); 

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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2314:2: ( '=' (lv_value_4= ruleValue ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2314:3: '=' (lv_value_4= ruleValue )
                    {
                    match(input,28,FOLLOW_28_in_ruleAttributeDefinition5185); 

                            createLeafNode(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2318:1: (lv_value_4= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2321:6: lv_value_4= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5219);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2346:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2346:60: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2347:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5258);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;

             current =iv_ruleArgumentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5268); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2354:1: ruleArgumentDefinition returns [EObject current=null] : ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0=null;
        AntlrDatatypeRuleToken lv_argumentValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2359:6: ( ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2360:1: ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2360:1: ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2360:2: ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2360:2: ( (lv_argumentName_0= RULE_ID ) '=' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==28) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2360:3: (lv_argumentName_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2360:3: (lv_argumentName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2362:6: lv_argumentName_0= RULE_ID
                    {
                    lv_argumentName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5316); 

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

                    match(input,28,FOLLOW_28_in_ruleArgumentDefinition5333); 

                            createLeafNode(grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2384:3: (lv_argumentValue_2= ruleValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2387:6: lv_argumentValue_2= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5369);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2412:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2412:61: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2413:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5406);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition5416); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2420:1: ruleInterfaceDefinition returns [EObject current=null] : ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        Token lv_collection_4=null;
        Token lv_collectionsize_5=null;
        Token lv_collection_6=null;
        Enumerator lv_role_0 = null;

        AntlrDatatypeRuleToken lv_signature_1 = null;

        Enumerator lv_contingency_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2425:6: ( ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2426:1: ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2426:1: ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2426:2: (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2426:2: (lv_role_0= ruleRole )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2429:6: lv_role_0= ruleRole
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRole_in_ruleInterfaceDefinition5475);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2447:2: (lv_signature_1= ruleFullyQualifiedName )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2450:6: lv_signature_1= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition5513);
                    lv_signature_1=ruleFullyQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "signature", lv_signature_1, "FullyQualifiedName", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleInterfaceDefinition5527); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2472:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2474:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDefinition5549); 

            		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2492:2: ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2492:3: (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2492:3: (lv_collection_4= '[' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2494:6: lv_collection_4= '['
                    {
                    lv_collection_4=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleInterfaceDefinition5579); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_4_0_0(), "collection"); 
                        

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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2513:2: (lv_collectionsize_5= RULE_INT )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2515:6: lv_collectionsize_5= RULE_INT
                            {
                            lv_collectionsize_5=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInterfaceDefinition5614); 

                            		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_4_1_0(), "collectionsize"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "collectionsize", lv_collectionsize_5, "INT", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2533:3: (lv_collection_6= ']' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2535:6: lv_collection_6= ']'
                    {
                    lv_collection_6=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleInterfaceDefinition5644); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionRightSquareBracketKeyword_4_2_0(), "collection"); 
                        

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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2554:4: (lv_contingency_7= ruleContingency )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=59 && LA59_0<=60)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2557:6: lv_contingency_7= ruleContingency
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleContingency_in_ruleInterfaceDefinition5693);
                    lv_contingency_7=ruleContingency();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contingency", lv_contingency_7, "Contingency", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
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
    // $ANTLR end ruleInterfaceDefinition


    // $ANTLR start entryRuleBindingDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2582:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2582:59: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2583:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition5731);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;

             current =iv_ruleBindingDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition5741); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2590:1: ruleBindingDefinition returns [EObject current=null] : ( 'binds' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceSourceIndex_6=null;
        Token lv_interfaceTargetIndex_14=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2595:6: ( ( 'binds' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2596:1: ( 'binds' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2596:1: ( 'binds' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2596:2: 'binds' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | ( RULE_ID ) ) '.' ( RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            {
            match(input,33,FOLLOW_33_in_ruleBindingDefinition5775); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2600:1: ( 'this' | ( RULE_ID ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==34) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2600:1: ( 'this' | ( RULE_ID ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2600:2: 'this'
                    {
                    match(input,34,FOLLOW_34_in_ruleBindingDefinition5785); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2605:6: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2605:6: ( RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2608:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5813); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentArchitectureDefinitionCrossReference_1_1_0(), "interfaceSourceParent"); 
                    	

                    }


                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition5826); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2625:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2628:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5848); 

            		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceInterfaceDefinitionCrossReference_3_0(), "interfaceSource"); 
            	

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2641:2: ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2641:3: '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']'
                    {
                    match(input,31,FOLLOW_31_in_ruleBindingDefinition5861); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_4_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2645:1: (lv_interfaceSourceIndex_6= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2647:6: lv_interfaceSourceIndex_6= RULE_INT
                    {
                    lv_interfaceSourceIndex_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition5883); 

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

                    match(input,32,FOLLOW_32_in_ruleBindingDefinition5900); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_ruleBindingDefinition5911); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_5(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2673:1: ( 'this' | ( RULE_ID ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==34) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2673:1: ( 'this' | ( RULE_ID ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2673:2: 'this'
                    {
                    match(input,34,FOLLOW_34_in_ruleBindingDefinition5921); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_6_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2678:6: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2678:6: ( RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2681:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5949); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentArchitectureDefinitionCrossReference_6_1_0(), "interfaceTargetParent"); 
                    	

                    }


                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition5962); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_7(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2698:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2701:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5984); 

            		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetInterfaceDefinitionCrossReference_8_0(), "interfaceTarget"); 
            	

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2714:2: ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2714:3: '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']'
                    {
                    match(input,31,FOLLOW_31_in_ruleBindingDefinition5997); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_9_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2718:1: (lv_interfaceTargetIndex_14= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2720:6: lv_interfaceTargetIndex_14= RULE_INT
                    {
                    lv_interfaceTargetIndex_14=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition6019); 

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

                    match(input,32,FOLLOW_32_in_ruleBindingDefinition6036); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2749:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2749:56: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2750:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6071);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;

             current =iv_ruleDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition6081); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2757:1: ruleDataDefinition returns [EObject current=null] : ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2762:6: ( ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2763:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2763:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==37) ) {
                alt65=1;
            }
            else if ( (LA65_0==40) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2763:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2763:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2763:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2763:3: 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
                    {
                    match(input,37,FOLLOW_37_in_ruleDataDefinition6116); 

                            createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2767:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_ID) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==38) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2767:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2767:2: (lv_fileC_1= ruleFileC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2767:2: (lv_fileC_1= ruleFileC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2770:6: lv_fileC_1= ruleFileC
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition6151);
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
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:7: '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}'
                            {
                            match(input,38,FOLLOW_38_in_ruleDataDefinition6171); 

                                    createLeafNode(grammarAccess.getDataDefinitionAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0_1_1_0(), null); 
                                
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2793:1: (lv_inlineCcode_3= ruleInlineCodeC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2796:6: lv_inlineCcode_3= ruleInlineCodeC
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_0_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6205);
                            lv_inlineCcode_3=ruleInlineCodeC();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inlineCcode", lv_inlineCcode_3, "InlineCodeC", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            match(input,39,FOLLOW_39_in_ruleDataDefinition6218); 

                                    createLeafNode(grammarAccess.getDataDefinitionAccess().getRightCurlyBracketRightCurlyBracketKeyword_0_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2819:6: 'nodata'
                    {
                    match(input,40,FOLLOW_40_in_ruleDataDefinition6236); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2830:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2830:66: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2831:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6269);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;

             current =iv_ruleImplementationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition6279); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2838:1: ruleImplementationDefinition returns [EObject current=null] : ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2843:6: ( ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2844:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2844:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2844:2: 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
            {
            match(input,41,FOLLOW_41_in_ruleImplementationDefinition6313); 

                    createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2848:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==38) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2848:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2848:2: (lv_fileC_1= ruleFileC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2848:2: (lv_fileC_1= ruleFileC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2851:6: lv_fileC_1= ruleFileC
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition6348);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2870:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2870:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2870:7: '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}'
                    {
                    match(input,38,FOLLOW_38_in_ruleImplementationDefinition6368); 

                            createLeafNode(grammarAccess.getImplementationDefinitionAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2874:1: (lv_inlineCcode_3= ruleInlineCodeC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2877:6: lv_inlineCcode_3= ruleInlineCodeC
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6402);
                    lv_inlineCcode_3=ruleInlineCodeC();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "inlineCcode", lv_inlineCcode_3, "InlineCodeC", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,39,FOLLOW_39_in_ruleImplementationDefinition6415); 

                            createLeafNode(grammarAccess.getImplementationDefinitionAccess().getRightCurlyBracketRightCurlyBracketKeyword_1_1_2(), null); 
                        

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2906:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2906:59: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2907:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6450);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;

             current =iv_ruleTemplateSpecifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier6460); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2914:1: ruleTemplateSpecifier returns [EObject current=null] : ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        AntlrDatatypeRuleToken lv_componentTypeName_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2919:6: ( ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2920:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2920:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2920:2: (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2920:2: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2922:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier6507); 

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

            match(input,42,FOLLOW_42_in_ruleTemplateSpecifier6524); 

                    createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2944:1: (lv_componentTypeName_2= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2947:6: lv_componentTypeName_2= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getComponentTypeNameFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTemplateSpecifier6558);
            lv_componentTypeName_2=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "componentTypeName", lv_componentTypeName_2, "FullyQualifiedName", currentNode);
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


    // $ANTLR start entryRuleFullyQualifiedName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2972:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2972:59: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2973:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName6596);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;

             current =iv_ruleFullyQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName6607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFullyQualifiedName


    // $ANTLR start ruleFullyQualifiedName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2980:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2986:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2987:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2987:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2987:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName6647); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2994:1: (kw= '.' this_ID_2= RULE_ID )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==35) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2995:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FOLLOW_35_in_ruleFullyQualifiedName6666); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName6681); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end ruleFullyQualifiedName


    // $ANTLR start entryRuleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3015:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3015:47: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:2: iv_ruleFileC= ruleFileC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC6726);
            iv_ruleFileC=ruleFileC();
            _fsp--;

             current =iv_ruleFileC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6736); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3023:1: ruleFileC returns [EObject current=null] : ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0 = null;

        AntlrDatatypeRuleToken lv_fileName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3028:6: ( ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3029:1: ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3029:1: ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3029:2: (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3029:2: (lv_directory_0= rulePath )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( ((LA68_1>=44 && LA68_1<=46)||LA68_1==51) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3032:6: lv_directory_0= rulePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_ruleFileC6795);
                    lv_directory_0=rulePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "directory", lv_directory_0, "Path", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3050:3: (lv_fileName_1= ruleFilename )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3053:6: lv_fileName_1= ruleFilename
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFilenameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFilename_in_ruleFileC6834);
            lv_fileName_1=ruleFilename();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fileName", lv_fileName_1, "Filename", currentNode);
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


    // $ANTLR start entryRuleFilename
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3078:1: entryRuleFilename returns [String current=null] : iv_ruleFilename= ruleFilename EOF ;
    public final String entryRuleFilename() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilename = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3078:49: (iv_ruleFilename= ruleFilename EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3079:2: iv_ruleFilename= ruleFilename EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFilenameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFilename_in_entryRuleFilename6872);
            iv_ruleFilename=ruleFilename();
            _fsp--;

             current =iv_ruleFilename.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilename6883); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFilename


    // $ANTLR start ruleFilename
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3086:1: ruleFilename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFilename() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3092:6: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3093:1: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3093:1: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3093:6: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilename6923); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFilenameAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ruleFilename6941); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getFilenameAccess().getFullStopKeyword_1(), null); 
                
            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilename6956); 

            		current.merge(this_ID_2);
                
             
                createLeafNode(grammarAccess.getFilenameAccess().getIDTerminalRuleCall_2(), null); 
                

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
    // $ANTLR end ruleFilename


    // $ANTLR start entryRuleInlineCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3121:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3121:53: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3122:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6999);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;

             current =iv_ruleInlineCodeC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC7009); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3129:1: ruleInlineCodeC returns [EObject current=null] : (lv_codeC_0= ruleCodeC ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_codeC_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3134:6: ( (lv_codeC_0= ruleCodeC ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3135:1: (lv_codeC_0= ruleCodeC )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3135:1: (lv_codeC_0= ruleCodeC )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3138:6: lv_codeC_0= ruleCodeC
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInlineCodeCAccess().getCodeCCodeCParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeC_in_ruleInlineCodeC7067);
            lv_codeC_0=ruleCodeC();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInlineCodeCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "codeC", lv_codeC_0, "CodeC", currentNode);
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
    // $ANTLR end ruleInlineCodeC


    // $ANTLR start entryRuleAnnotationsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3163:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3163:57: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3164:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7103);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;

             current =iv_ruleAnnotationsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList7113); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3171:1: ruleAnnotationsList returns [EObject current=null] : ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0 = null;

        EObject lv_annotations_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3176:6: ( ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3177:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3177:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3177:2: (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3177:2: (lv_annotations_0= ruleAnnotation )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3180:6: lv_annotations_0= ruleAnnotation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7172);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3198:2: (lv_annotations_1= ruleAnnotation )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==43) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3201:6: lv_annotations_1= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7210);
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
            	    break loop69;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3226:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3226:52: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3227:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation7248);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation7258); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3234:1: ruleAnnotation returns [EObject current=null] : ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_annotationElements_3 = null;

        EObject lv_annotationElements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3239:6: ( ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3240:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3240:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3240:2: '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            {
            match(input,43,FOLLOW_43_in_ruleAnnotation7292); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3244:1: (lv_name_1= ruleAnnotationType )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3247:6: lv_name_1= ruleAnnotationType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnotation7326);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3265:2: ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==24) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3265:3: '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAnnotation7340); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3269:1: (lv_annotationElements_3= ruleAnnotationElement )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3272:6: lv_annotationElements_3= ruleAnnotationElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7374);
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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3290:2: ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==20) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3290:3: ',' (lv_annotationElements_5= ruleAnnotationElement )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleAnnotation7388); 

                    	            createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3294:1: (lv_annotationElements_5= ruleAnnotationElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3297:6: lv_annotationElements_5= ruleAnnotationElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7422);
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
                    	    break loop70;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleAnnotation7437); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3326:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3326:59: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3327:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7472);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;

             current =iv_ruleAnnotationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7482); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3334:1: ruleAnnotationElement returns [EObject current=null] : ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_0=null;
        EObject lv_elementValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3339:6: ( ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3340:1: ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3340:1: ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3340:2: ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3340:2: ( (lv_elementName_0= RULE_ID ) '=' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3340:3: (lv_elementName_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3340:3: (lv_elementName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3342:6: lv_elementName_0= RULE_ID
                    {
                    lv_elementName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7530); 

                    		createLeafNode(grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_0_0_0(), "elementName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elementName", lv_elementName_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,28,FOLLOW_28_in_ruleAnnotationElement7547); 

                            createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:3: (lv_elementValue_2= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3367:6: lv_elementValue_2= ruleElementValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7583);
            lv_elementValue_2=ruleElementValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "elementValue", lv_elementValue_2, "ElementValue", currentNode);
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
    // $ANTLR end ruleAnnotationElement


    // $ANTLR start entryRuleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3392:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3392:54: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3393:2: iv_ruleElementValue= ruleElementValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7620);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;

             current =iv_ruleElementValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7630); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3400:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3405:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3406:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3406:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt73=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt73=1;
                }
                break;
            case 43:
                {
                alt73=2;
                }
                break;
            case 16:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3406:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3407:5: this_ConstantValue_0= ruleConstantValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7677);
                    this_ConstantValue_0=ruleConstantValue();
                    _fsp--;

                     
                            current = this_ConstantValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3417:5: this_Annotation_1= ruleAnnotation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7704);
                    this_Annotation_1=ruleAnnotation();
                    _fsp--;

                     
                            current = this_Annotation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3427:5: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7731);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3442:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3442:55: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3443:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7763);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7773); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3450:1: ruleConstantValue returns [EObject current=null] : (lv_value_0= ruleConstantFormat ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3455:6: ( (lv_value_0= ruleConstantFormat ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3456:1: (lv_value_0= ruleConstantFormat )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3456:1: (lv_value_0= ruleConstantFormat )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3459:6: lv_value_0= ruleConstantFormat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7831);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3484:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3484:55: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3485:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7868);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;

             current =iv_ruleConstantFormat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7879); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3492:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3498:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3499:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3499:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_STRING) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3499:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3499:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7919); 

                    		current.merge(this_INT_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3507:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7945); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3522:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3522:70: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3523:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7988);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;

             current =iv_ruleElementValueArrayInitializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7998); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3530:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1 = null;

        EObject lv_values_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3535:6: ( ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3536:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3536:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3536:2: '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}'
            {
            match(input,16,FOLLOW_16_in_ruleElementValueArrayInitializer8032); 

                    createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3540:1: (lv_values_1= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3543:6: lv_values_1= ruleElementValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8066);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3561:2: ( ',' (lv_values_3= ruleElementValue ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==20) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3561:3: ',' (lv_values_3= ruleElementValue )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleElementValueArrayInitializer8080); 

            	            createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3565:1: (lv_values_3= ruleElementValue )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3568:6: lv_values_3= ruleElementValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8114);
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
            	    break loop75;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleElementValueArrayInitializer8129); 

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


    // $ANTLR start entryRuleCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3597:1: entryRuleCodeC returns [String current=null] : iv_ruleCodeC= ruleCodeC EOF ;
    public final String entryRuleCodeC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3597:46: (iv_ruleCodeC= ruleCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3598:2: iv_ruleCodeC= ruleCodeC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeCRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeC_in_entryRuleCodeC8163);
            iv_ruleCodeC=ruleCodeC();
            _fsp--;

             current =iv_ruleCodeC.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeC8174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCodeC


    // $ANTLR start ruleCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3605:1: ruleCodeC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\\\"' | kw= '\\'' | kw= '*' )* ;
    public final AntlrDatatypeRuleToken ruleCodeC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3611:6: ( (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\\\"' | kw= '\\'' | kw= '*' )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3612:1: (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\\\"' | kw= '\\'' | kw= '*' )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3612:1: (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\\\"' | kw= '\\'' | kw= '*' )*
            loop76:
            do {
                int alt76=14;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt76=1;
                    }
                    break;
                case 44:
                    {
                    alt76=2;
                    }
                    break;
                case 20:
                    {
                    alt76=3;
                    }
                    break;
                case 29:
                    {
                    alt76=4;
                    }
                    break;
                case 13:
                    {
                    alt76=5;
                    }
                    break;
                case 35:
                    {
                    alt76=6;
                    }
                    break;
                case 45:
                    {
                    alt76=7;
                    }
                    break;
                case 46:
                    {
                    alt76=8;
                    }
                    break;
                case 47:
                    {
                    alt76=9;
                    }
                    break;
                case 43:
                    {
                    alt76=10;
                    }
                    break;
                case 48:
                    {
                    alt76=11;
                    }
                    break;
                case 49:
                    {
                    alt76=12;
                    }
                    break;
                case 50:
                    {
                    alt76=13;
                    }
                    break;

                }

                switch (alt76) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3612:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeC8214); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeCAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3621:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,44,FOLLOW_44_in_ruleCodeC8238); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getColonKeyword_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3628:2: kw= ','
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_ruleCodeC8257); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getCommaKeyword_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3635:2: kw= '?'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,29,FOLLOW_29_in_ruleCodeC8276); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getQuestionMarkKeyword_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3642:2: kw= ';'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_ruleCodeC8295); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getSemicolonKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3649:2: kw= '.'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FOLLOW_35_in_ruleCodeC8314); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getFullStopKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3656:2: kw= '/'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,45,FOLLOW_45_in_ruleCodeC8333); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getSolidusKeyword_6(), null); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3663:2: kw= '\\\\'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,46,FOLLOW_46_in_ruleCodeC8352); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getReverseSolidusKeyword_7(), null); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3670:2: kw= '!'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,47,FOLLOW_47_in_ruleCodeC8371); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getExclamationMarkKeyword_8(), null); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3677:2: kw= '@'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,43,FOLLOW_43_in_ruleCodeC8390); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getCommercialAtKeyword_9(), null); 
            	        

            	    }
            	    break;
            	case 11 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3684:2: kw= '\\\"'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,48,FOLLOW_48_in_ruleCodeC8409); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getQuotationMarkKeyword_10(), null); 
            	        

            	    }
            	    break;
            	case 12 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3691:2: kw= '\\''
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,49,FOLLOW_49_in_ruleCodeC8428); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getApostropheKeyword_11(), null); 
            	        

            	    }
            	    break;
            	case 13 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3698:2: kw= '*'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,50,FOLLOW_50_in_ruleCodeC8447); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getAsteriskKeyword_12(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


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
    // $ANTLR end ruleCodeC


    // $ANTLR start entryRulePath
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3711:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3711:45: (iv_rulePath= rulePath EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3712:2: iv_rulePath= rulePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathRule(), currentNode); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath8487);
            iv_rulePath=rulePath();
            _fsp--;

             current =iv_rulePath.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath8498); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3719:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_5=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3725:6: ( (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3726:1: (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3726:1: (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3726:6: this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath8538); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3733:1: (kw= ':' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==44) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3734:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_rulePath8557); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getColonKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3739:3: ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )*
            loop79:
            do {
                int alt79=2;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA79_1 = input.LA(2);

                    if ( (LA79_1==RULE_ID) ) {
                        int LA79_4 = input.LA(3);

                        if ( ((LA79_4>=45 && LA79_4<=46)||LA79_4==51) ) {
                            alt79=1;
                        }


                    }


                    }
                    break;
                case 51:
                    {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==RULE_ID) ) {
                        int LA79_4 = input.LA(3);

                        if ( ((LA79_4>=45 && LA79_4<=46)||LA79_4==51) ) {
                            alt79=1;
                        }


                    }


                    }
                    break;
                case 45:
                    {
                    int LA79_3 = input.LA(2);

                    if ( (LA79_3==RULE_ID) ) {
                        int LA79_4 = input.LA(3);

                        if ( ((LA79_4>=45 && LA79_4<=46)||LA79_4==51) ) {
                            alt79=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3739:4: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3739:4: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )
            	    int alt78=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt78=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt78=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt78=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("3739:4: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )", 78, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt78) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3740:2: kw= '\\\\'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,46,FOLLOW_46_in_rulePath8574); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getPathAccess().getReverseSolidusKeyword_2_0_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3747:2: kw= '\\\\\\\\'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,51,FOLLOW_51_in_rulePath8593); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getPathAccess().getReverseSolidusReverseSolidusKeyword_2_0_1(), null); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3754:2: kw= '/'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,45,FOLLOW_45_in_rulePath8612); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_2_0_2(), null); 
            	                

            	            }
            	            break;

            	    }

            	    this_ID_5=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath8628); 

            	    		current.merge(this_ID_5);
            	        
            	     
            	        createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3766:3: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt80=1;
                }
                break;
            case 51:
                {
                alt80=2;
                }
                break;
            case 45:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3766:3: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3767:2: kw= '\\\\'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_rulePath8649); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getReverseSolidusKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3774:2: kw= '\\\\\\\\'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_rulePath8668); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getReverseSolidusReverseSolidusKeyword_3_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3781:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_rulePath8687); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_3_2(), null); 
                        

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
    // $ANTLR end rulePath


    // $ANTLR start entryRuleValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3794:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3794:46: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3795:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue8727);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue8738); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3802:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3808:6: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3809:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3809:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt81=1;
                }
                break;
            case RULE_INT:
                {
                alt81=2;
                }
                break;
            case RULE_STRING:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3809:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3809:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue8778); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3817:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue8804); 

                    		current.merge(this_INT_1);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getINTTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3825:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue8830); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

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


    // $ANTLR start entryRuleAnnotationType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3840:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3840:55: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3841:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8874);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;

             current =iv_ruleAnnotationType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType8885); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3848:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_4=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3854:6: ( (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3855:1: (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3855:1: (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID )
            int alt82=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt82=1;
                }
                break;
            case 53:
                {
                alt82=2;
                }
                break;
            case 54:
                {
                alt82=3;
                }
                break;
            case 55:
                {
                alt82=4;
                }
                break;
            case RULE_ID:
                {
                alt82=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3855:1: (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3856:2: kw= 'override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleAnnotationType8923); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3863:2: kw= 'singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleAnnotationType8942); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3870:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleAnnotationType8961); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3877:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleAnnotationType8980); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3883:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationType9001); 

                    		current.merge(this_ID_4);
                        
                     
                        createLeafNode(grammarAccess.getAnnotationTypeAccess().getIDTerminalRuleCall_4(), null); 
                        

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3898:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3898:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3899:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType9045);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;

             current =iv_ruleAttributeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType9056); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3906:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3912:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3913:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3913:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt83=1;
                }
                break;
            case 57:
                {
                alt83=2;
                }
                break;
            case 58:
                {
                alt83=3;
                }
                break;
            case RULE_ID:
                {
                alt83=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3913:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3914:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleAttributeType9094); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3921:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_ruleAttributeType9113); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3928:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleAttributeType9132); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3934:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType9153); 

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


    // $ANTLR start ruleContingency
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3949:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3953:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3954:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3954:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==59) ) {
                alt84=1;
            }
            else if ( (LA84_0==60) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3954:1: ( ( 'optional' ) | ( 'mandatory' ) )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3954:2: ( 'optional' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3954:2: ( 'optional' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3954:4: 'optional'
                    {
                    match(input,59,FOLLOW_59_in_ruleContingency9210); 

                            current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3960:6: ( 'mandatory' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3960:6: ( 'mandatory' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3960:8: 'mandatory'
                    {
                    match(input,60,FOLLOW_60_in_ruleContingency9225); 

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3970:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3974:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3975:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3975:1: ( ( 'provides' ) | ( 'requires' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==61) ) {
                alt85=1;
            }
            else if ( (LA85_0==62) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3975:1: ( ( 'provides' ) | ( 'requires' ) )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3975:2: ( 'provides' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3975:2: ( 'provides' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3975:4: 'provides'
                    {
                    match(input,61,FOLLOW_61_in_ruleRole9268); 

                            current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3981:6: ( 'requires' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3981:6: ( 'requires' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3981:8: 'requires'
                    {
                    match(input,62,FOLLOW_62_in_ruleRole9283); 

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


    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA38_eotS =
        "\73\uffff";
    static final String DFA38_eofS =
        "\25\uffff\1\42\4\uffff\1\46\40\uffff";
    static final String DFA38_minS =
        "\3\4\1\uffff\1\26\1\uffff\1\30\1\uffff\7\4\1\26\5\24\1\15\1\30\3"+
        "\24\1\15\3\4\1\30\2\4\1\33\1\uffff\2\4\1\33\1\uffff\14\24\4\4\4"+
        "\24";
    static final String DFA38_maxS =
        "\1\25\2\33\1\uffff\1\43\1\uffff\1\43\1\uffff\1\4\1\35\1\6\2\4\1"+
        "\6\1\4\2\43\1\27\1\34\2\31\1\76\1\43\1\34\2\31\1\76\1\35\1\4\1\35"+
        "\1\33\2\6\1\33\1\uffff\2\6\1\33\1\uffff\3\43\1\27\1\31\1\34\3\31"+
        "\1\34\2\31\1\35\1\4\2\6\2\43\2\31";
    static final String DFA38_acceptS =
        "\3\uffff\1\5\1\uffff\1\2\1\uffff\1\4\32\uffff\1\1\3\uffff\1\3\24"+
        "\uffff";
    static final String DFA38_specialS =
        "\73\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\12\uffff\1\2\5\uffff\1\1",
            "\1\4\26\uffff\1\5",
            "\1\6\26\uffff\1\7",
            "",
            "\1\11\1\uffff\1\12\2\uffff\1\13\7\uffff\1\10",
            "",
            "\1\15\2\uffff\1\16\7\uffff\1\14",
            "",
            "\1\17",
            "\1\20\30\uffff\1\21",
            "\1\22\1\23\1\24",
            "\1\25",
            "\1\26",
            "\1\27\1\30\1\31",
            "\1\32",
            "\1\11\1\uffff\1\12\2\uffff\1\13\7\uffff\1\10",
            "\1\35\2\uffff\1\36\4\uffff\1\33\6\uffff\1\34",
            "\1\35\2\uffff\1\36",
            "\1\40\4\uffff\1\41\2\uffff\1\37",
            "\1\40\4\uffff\1\41",
            "\1\40\4\uffff\1\41",
            "\3\42\1\5\2\42\2\uffff\1\42\4\uffff\1\42\6\uffff\1\42\11\uffff"+
            "\1\42\21\uffff\2\42",
            "\1\15\2\uffff\1\16\7\uffff\1\14",
            "\1\44\4\uffff\1\45\2\uffff\1\43",
            "\1\44\4\uffff\1\45",
            "\1\44\4\uffff\1\45",
            "\3\46\1\7\2\46\2\uffff\1\46\4\uffff\1\46\6\uffff\1\46\11\uffff"+
            "\1\46\21\uffff\2\46",
            "\1\47\30\uffff\1\21",
            "\1\50",
            "\1\51\30\uffff\1\52",
            "\1\12\2\uffff\1\13",
            "\1\53\1\23\1\24",
            "\1\54\1\55\1\56",
            "\1\13",
            "",
            "\1\57\1\30\1\31",
            "\1\60\1\61\1\62",
            "\1\16",
            "",
            "\1\35\2\uffff\1\36\13\uffff\1\34",
            "\1\35\2\uffff\1\36\13\uffff\1\34",
            "\1\35\2\uffff\1\36\4\uffff\1\63\6\uffff\1\64",
            "\1\35\2\uffff\1\36",
            "\1\40\4\uffff\1\41",
            "\1\40\4\uffff\1\41\2\uffff\1\65",
            "\1\40\4\uffff\1\41",
            "\1\40\4\uffff\1\41",
            "\1\44\4\uffff\1\45",
            "\1\44\4\uffff\1\45\2\uffff\1\66",
            "\1\44\4\uffff\1\45",
            "\1\44\4\uffff\1\45",
            "\1\67\30\uffff\1\52",
            "\1\70",
            "\1\71\1\55\1\56",
            "\1\72\1\61\1\62",
            "\1\35\2\uffff\1\36\13\uffff\1\64",
            "\1\35\2\uffff\1\36\13\uffff\1\64",
            "\1\40\4\uffff\1\41",
            "\1\44\4\uffff\1\45"
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1441:1: (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition142 = new BitSet(new long[]{0x000008000024C802L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition181 = new BitSet(new long[]{0x000000000024C002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition220 = new BitSet(new long[]{0x000000000024C002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportDefinition302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleImportDefinition336 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleImportDefinition350 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveComponentDefinition593 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveComponentDefinition650 = new BitSet(new long[]{0x60000B2041090002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition688 = new BitSet(new long[]{0x60000B2040090002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition727 = new BitSet(new long[]{0x60000B2040010002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition743 = new BitSet(new long[]{0x60000B2040020000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition778 = new BitSet(new long[]{0x6000032040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition817 = new BitSet(new long[]{0x60000B2040020000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition874 = new BitSet(new long[]{0x6000032040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition913 = new BitSet(new long[]{0x60000B2040000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement1011 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1038 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1065 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1092 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveDefinitionElement1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleComponentTypeDefinition1181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleComponentTypeDefinition1215 = new BitSet(new long[]{0x6000080000090002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1253 = new BitSet(new long[]{0x6000080000010002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1294 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1333 = new BitSet(new long[]{0x6000080000000002L});
    public static final BitSet FOLLOW_16_in_ruleComponentTypeDefinition1355 = new BitSet(new long[]{0x6000080000020000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1390 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1429 = new BitSet(new long[]{0x6000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTypeReferencesList1523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList1557 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTypeReferencesList1571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList1605 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypeReferenceDefinition1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1805 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDefinitionElement1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeComponentDefinition1893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleCompositeComponentDefinition1927 = new BitSet(new long[]{0x6000080205490002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1965 = new BitSet(new long[]{0x6000080205090002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition2004 = new BitSet(new long[]{0x6000080204090002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition2043 = new BitSet(new long[]{0x6000080204010002L});
    public static final BitSet FOLLOW_16_in_ruleCompositeComponentDefinition2059 = new BitSet(new long[]{0x6000080204020000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2094 = new BitSet(new long[]{0x6000000204000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2133 = new BitSet(new long[]{0x6000080204020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2190 = new BitSet(new long[]{0x6000000204000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2229 = new BitSet(new long[]{0x6000080204000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList2313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2348 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleTemplateSpecifiersList2362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2396 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList2489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2524 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleFormalArgumentsList2538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2572 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCompositeReferencesList2665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2699 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeReferencesList2713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2747 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveReferencesList2830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2864 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveReferencesList2878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2912 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3105 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3132 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3159 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleCompositeDefinitionElement3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSubComponentDefinition3248 = new BitSet(new long[]{0x0000000000208010L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleCompositeReferenceDefinition3481 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3495 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3529 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeReferenceDefinition3543 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3577 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3592 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3604 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3638 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeReferenceDefinition3652 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3686 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSubComponent3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSubComponent3780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3814 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCompositeSubComponent3827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeSubComponent3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeAnonymousSubComponent3934 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3968 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCompositeAnonymousSubComponent3982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4004 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeAnonymousSubComponent4021 = new BitSet(new long[]{0x6000080204020000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4056 = new BitSet(new long[]{0x6000000204000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4095 = new BitSet(new long[]{0x6000080204020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeAnonymousSubComponent4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveReferenceDefinition4212 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition4226 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4260 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveReferenceDefinition4274 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4308 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4416 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTemplateDefinition4433 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTemplateDefinition4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTemplateDefinition4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSubComponent4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4580 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemplateSubComponent4592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSubComponent4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveSubComponent4699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4733 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveSubComponent4746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveAnonymousSubComponent4853 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4887 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveAnonymousSubComponent4901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4923 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4940 = new BitSet(new long[]{0x60000B2040020000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4975 = new BitSet(new long[]{0x6000032040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5014 = new BitSet(new long[]{0x60000B2040020000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveAnonymousSubComponent5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAttributeDefinition5106 = new BitSet(new long[]{0x0700000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5167 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAttributeDefinition5185 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5316 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArgumentDefinition5333 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition5475 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition5513 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInterfaceDefinition5527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition5549 = new BitSet(new long[]{0x1800000080000002L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition5579 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition5614 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition5644 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition5731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition5775 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5785 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5813 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition5826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5848 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition5861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5883 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition5900 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition5911 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5921 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5949 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition5962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5984 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition5997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition6019 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataDefinition6116 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataDefinition6171 = new BitSet(new long[]{0x0007F88820102010L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6205 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDataDefinition6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataDefinition6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleImplementationDefinition6313 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplementationDefinition6368 = new BitSet(new long[]{0x0007F88820102010L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6402 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleImplementationDefinition6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier6507 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTemplateSpecifier6524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTemplateSpecifier6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName6596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName6647 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFullyQualifiedName6666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName6681 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC6726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC6795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFilename_in_ruleFileC6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_entryRuleFilename6872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilename6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilename6923 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFilename6941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilename6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC7009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeC_in_ruleInlineCodeC7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7172 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7210 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAnnotation7292 = new BitSet(new long[]{0x00F0000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation7326 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAnnotation7340 = new BitSet(new long[]{0x0000080000010070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7374 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation7388 = new BitSet(new long[]{0x0000080000010070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7422 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleAnnotation7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7530 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAnnotationElement7547 = new BitSet(new long[]{0x0000080000010060L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleElementValueArrayInitializer8032 = new BitSet(new long[]{0x0000080000010060L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8066 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_ruleElementValueArrayInitializer8080 = new BitSet(new long[]{0x0000080000010060L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8114 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer8129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeC_in_entryRuleCodeC8163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeC8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeC8214 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_44_in_ruleCodeC8238 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_20_in_ruleCodeC8257 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_29_in_ruleCodeC8276 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_13_in_ruleCodeC8295 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_35_in_ruleCodeC8314 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_45_in_ruleCodeC8333 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_46_in_ruleCodeC8352 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_47_in_ruleCodeC8371 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_43_in_ruleCodeC8390 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_48_in_ruleCodeC8409 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_49_in_ruleCodeC8428 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_50_in_ruleCodeC8447 = new BitSet(new long[]{0x0007F80820102012L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath8487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath8538 = new BitSet(new long[]{0x0008700000000000L});
    public static final BitSet FOLLOW_44_in_rulePath8557 = new BitSet(new long[]{0x0008600000000000L});
    public static final BitSet FOLLOW_46_in_rulePath8574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_51_in_rulePath8593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45_in_rulePath8612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath8628 = new BitSet(new long[]{0x0008600000000000L});
    public static final BitSet FOLLOW_46_in_rulePath8649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePath8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePath8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue8727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAnnotationType8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAnnotationType8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAnnotationType8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAnnotationType8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationType9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType9045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAttributeType9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAttributeType9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAttributeType9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleContingency9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleContingency9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRole9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRole9283 = new BitSet(new long[]{0x0000000000000002L});

}