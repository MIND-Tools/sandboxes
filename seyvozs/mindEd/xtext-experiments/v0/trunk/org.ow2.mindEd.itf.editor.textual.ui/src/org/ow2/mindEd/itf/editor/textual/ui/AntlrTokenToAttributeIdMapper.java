package org.ow2.mindEd.itf.editor.textual.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier;

/**
 * 
 * Token definition
 * 
 * @author Rémi Mélisson
 *
 */
public class AntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper{

	//private static final Pattern QUOTED = Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);	
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");	
	
	private static final HashSet<String> types = new HashSet<String>();
	static {
		TypeSpecifier[] tS = TypeSpecifier.values();
		for (int i=0; i<tS.length; i++){
			types.add("'" + tS[i].	getName() + "'");
		}		
	}
	
	/*
	 * Primitive keywords -> include, type & constant, interface
	 */
	protected static final HashSet<String> primitiveKeywords = new HashSet<String>();
	static {
		primitiveKeywords.add("'#define'");
		primitiveKeywords.add("'#include'");
		primitiveKeywords.add("'typedef'");
		primitiveKeywords.add("'interface'");
	}
	
	/*
	 * Secondary keywords  
	 */
	private static final HashSet<String> secondaryKeywords = new HashSet<String>();
	static {
		TypeQualifier[] tQ = TypeQualifier.values();
		for (int i=0; i<tQ.length; i++){
			secondaryKeywords.add("'" + tQ[i].	getName() + "'");
		}
		
		secondaryKeywords.add("struct");
		secondaryKeywords.add("union");
	}	
	
	/*
	 * Mapping with high lighting configuration
	 */
	private static final HashMap<String, HashSet<String>> mappingColorKeywordTokens = new HashMap<String, HashSet<String>>();
	static {
		mappingColorKeywordTokens.put(LexicalHighlightingConfiguration.PRIMITIVE_KEYWORD, primitiveKeywords);
		mappingColorKeywordTokens.put(LexicalHighlightingConfiguration.TYPE, types);
		mappingColorKeywordTokens.put(LexicalHighlightingConfiguration.SECONDARY_KEYWORD, secondaryKeywords);
	}
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		
		if(PUNCTUATION.matcher(tokenName).matches())
			return LexicalHighlightingConfiguration.PUNCTUATION;
		
		if("RULE_ML_COMMENT".equals(tokenName) | "RULE_SL_COMMENT".equals(tokenName)) {
			return LexicalHighlightingConfiguration.COMMENT;
		}
				
		/*
		if(QUOTED.matcher(tokenName).matches()) {
			return LexicalHighlightingConfiguration.KEYWORD_ID;
		}
		*/
		
		for ( Entry<String, HashSet<String>> e : mappingColorKeywordTokens.entrySet()){
			if (e.getValue().contains(tokenName))
				return e.getKey();
		}
		
		if("RULE_ID".equals(tokenName) | "RULE_SL_COMMENT".equals(tokenName)) {
			return LexicalHighlightingConfiguration.ID;
		}
				
		return null;
	}
	
}
