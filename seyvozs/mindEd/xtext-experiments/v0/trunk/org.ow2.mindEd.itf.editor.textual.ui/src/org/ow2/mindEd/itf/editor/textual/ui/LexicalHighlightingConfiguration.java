package org.ow2.mindEd.itf.editor.textual.ui;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * 
 * Keyword styling
 * 
 * @author Rémi Mélisson
 *
 */
public class LexicalHighlightingConfiguration implements
IHighlightingConfiguration {
	
	/***
	 * 
	 * Facility function for text style creation
	 * 
	 * @param background
	 * @param textColor
	 * @param style
	 * @return
	 */
	private static TextStyle createStyle(RGB background, RGB textColor, int style){
		TextStyle newStyle = new TextStyle();
		
		if (background != null)
			newStyle.setBackgroundColor(background);
		if (textColor != null)
			newStyle.setColor(textColor);		
		newStyle.setStyle(style);
		return newStyle;
	}
	
	// -- Color keywords and their style
	
	public static final String PRIMITIVE_KEYWORD = "primitive_keyword";
	public static final TextStyle PRIMITIVE_KEYWORD_STYLE= LexicalHighlightingConfiguration
		.createStyle(
			null,
			//purple
			new RGB(127,0,85),
			SWT.BOLD
		);
	
	public static final String SECONDARY_KEYWORD = "secondary_keyword";
	public static final TextStyle SECONDARY_KEYWORD_STYLE= LexicalHighlightingConfiguration
		.createStyle(
			null,
			null,
			SWT.NORMAL
		);
	
	public static final String TYPE = "type";
	public static final TextStyle TYPE_STYLE= LexicalHighlightingConfiguration
		.createStyle(
			null,
			//black
			new RGB(0,0,0),
			SWT.BOLD
		);
	
	public static final String PUNCTUATION = "punctuation";
	public static final TextStyle PUNCTUATION_STYLE= LexicalHighlightingConfiguration
		.createStyle(
			null,
			//grey
			new RGB(128,128,128),
			SWT.NORMAL
		);	
	
	public static final String COMMENT = "comment";
	public static final TextStyle COMMENT_STYLE= LexicalHighlightingConfiguration
		.createStyle(
			null,
			//green
			new RGB(63, 127, 95),
			SWT.NORMAL
		);		
	

	public static final String ID = "id";	
	public static final TextStyle ID_STYLE = LexicalHighlightingConfiguration
		.createStyle(null,
				//blue
				new RGB(0,0,155),
				SWT.ITALIC);	
	
	// --
	
	private static final HashMap<String,TextStyle> mappingColorKeywordStyle = new HashMap<String, TextStyle>();
	
	// initialize static hashmap
	static {
		mappingColorKeywordStyle.put(PRIMITIVE_KEYWORD, PRIMITIVE_KEYWORD_STYLE);
		mappingColorKeywordStyle.put(TYPE, TYPE_STYLE);
		mappingColorKeywordStyle.put(PUNCTUATION, PUNCTUATION_STYLE);
		mappingColorKeywordStyle.put(ID, ID_STYLE);
		mappingColorKeywordStyle.put(COMMENT, COMMENT_STYLE);
		mappingColorKeywordStyle.put(SECONDARY_KEYWORD, SECONDARY_KEYWORD_STYLE);
	}
		
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		for (Entry<String, TextStyle> e : mappingColorKeywordStyle.entrySet()){
			acceptor.acceptDefaultHighlighting(e.getKey(), e.getKey(), e.getValue());
		}
	}
		
}
