package org.ow2.fractal.mind.xtext;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

/**
 * class which Attribute styles to IDs
 * @author Nicolas LINGOIS
 *
 */
public class LexicalHighlightingConfiguration implements
		ILexicalHighlightingConfiguration {

	public static final String KEYWORD_ID = "keyword";
	public static final String PUNCTUATION_ID = "punctuation";
	public static final String COMMENT_ID = "comment";
	public static final String STRING_ID = "string";
	public static final String NUMBER_ID = "number";
	public static final String DEFAULT_ID = "default";
	public static final String INVALID_TOKEN_ID = "error";
	public static final String COMPOSITE_ID = "composite";
	public static final String PRIMITIVE_ID = "primitive";
	public static final String INTERFACE_ID = "interface";
	public static final String HEXA_ID = "0x";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword",
				keywordTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID,
				"Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment",
				commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String",
				stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number",
				numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default",
				defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol",
				errorTextStyle());
		acceptor.acceptDefaultHighlighting(INTERFACE_ID, "interfaces keyword",
				interfaceTextStyle());
		acceptor.acceptDefaultHighlighting(COMPOSITE_ID, "composite",
		compositeTextStyle());
		acceptor.acceptDefaultHighlighting(PRIMITIVE_ID, "primitive",
				primitiveTextStyle());
		acceptor.acceptDefaultHighlighting(HEXA_ID, "Hexadecimal",
				numberTextStyle());}
	
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	public TextStyle interfaceTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle compositeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(200, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle primitiveTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(200, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle errorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		// textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}

	public TextStyle numberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		return textStyle;
	}

	public TextStyle stringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

	public TextStyle commentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}

	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

}
