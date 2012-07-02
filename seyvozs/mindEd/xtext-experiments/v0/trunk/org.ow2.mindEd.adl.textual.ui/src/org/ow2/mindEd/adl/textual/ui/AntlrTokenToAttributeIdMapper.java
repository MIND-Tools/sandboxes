package org.ow2.mindEd.adl.textual.ui;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

/**
 * 
 * 
 * @author Nicolas Lingois
 *
 */
public class AntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper{
	
	private static final Pattern QUOTED = Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");
	
	protected String calculateId(String tokenName, int tokenType) {
		if("'0x'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.HEXA_ID;
		}
		
		// component definition
		if("'composite'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.COMPOSITE_ID;
		}		
		if("'primitive'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.PRIMITIVE_ID;
		}
		
		// interfaces
		if("'provides'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.PROVIDES_ID;
		}			
		if("'requires'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.REQUIRES_ID;
		}			
		if("'binds'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.BINDING_ID;
		}
		
		// import
		if("'import'".equals(tokenName)) {
			return LexicalHighlightingConfiguration.IMPORT_ID;
		}
		
		if(PUNCTUATION.matcher(tokenName).matches()) {
			return LexicalHighlightingConfiguration.PUNCTUATION_ID;
		}
		if(QUOTED.matcher(tokenName).matches()) {
			return LexicalHighlightingConfiguration.KEYWORD_ID;
		}
		if("RULE_STRING".equals(tokenName)) {
			return LexicalHighlightingConfiguration.STRING_ID;
		}
		if("RULE_INT".equals(tokenName)) {
			return LexicalHighlightingConfiguration.NUMBER_ID;
		}
		if("RULE_ML_COMMENT".equals(tokenName) | "RULE_SL_COMMENT".equals(tokenName)) {
			return LexicalHighlightingConfiguration.COMMENT_ID;
		}
		return LexicalHighlightingConfiguration.DEFAULT_ID;
	}
}
