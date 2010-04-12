package org.ow2.fractal.mind.xtext.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
//import org.ow2.fractal.mind.diagram.custom.figures.IFractalShape;
import org.ow2.fractal.mind.diagram.custom.figures.IFractalShape;

/**
 * class which Attribute styles to IDs
 * 
 * @author Nicolas LINGOIS
 * 
 */
public class LexicalHighlightingConfiguration extends
		SemanticHighlightingConfiguration {

	public static final String KEYWORD_ID = "keyword";
	public static final String PUNCTUATION_ID = "punctuation";
	public static final String COMMENT_ID = "comment";
	public static final String STRING_ID = "string";
	public static final String NUMBER_ID = "number";
	public static final String DEFAULT_ID = "default";
	public static final String INVALID_TOKEN_ID = "error";
	public static final String COMPOSITE_ID = "composite";
	public static final String PRIMITIVE_ID = "primitive";
	
	public static final String PROVIDES_ID = "provides";
	public static final String REQUIRES_ID = "requires";
	
	public static final String IMPORT_ID = "import";
	public static final String BINDING_ID = "binds";
	
	
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
		
		acceptor.acceptDefaultHighlighting(HEXA_ID, "Hexadecimal",
				numberTextStyle());
		
		// From SemanticHighlightingConfiguration
		acceptor.acceptDefaultHighlighting(DATA_ID, "data/source style",
				dataTextStyle());
		
		acceptor.acceptDefaultHighlighting(ANNOTATIONS_ID, "annotation style",
				annotationTextStyle());

		// Component definition
		acceptor.acceptDefaultHighlighting(COMPOSITE_ID, "composite style",
				compositeTextStyle());
		
		acceptor.acceptDefaultHighlighting(PRIMITIVE_ID, "primitive style",
				primitiveTextStyle());
		
		// Interfaces
		acceptor.acceptDefaultHighlighting(PROVIDES_ID, "provides style",
				providesTextStyle());
		acceptor.acceptDefaultHighlighting(REQUIRES_ID, "requires style",
				requiresTextStyle());
		acceptor.acceptDefaultHighlighting(BINDING_ID, "binding style",
				bindingTextStyle());
		
		// Import
		acceptor.acceptDefaultHighlighting(IMPORT_ID, "import style",
				importTextStyle());
	}

	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	
	// -- Component definition
	public TextStyle compositeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(IFractalShape.BLUE.getRGB());
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle primitiveTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(IFractalShape.RED.getRGB());
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}	
	// --

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
	
	// -- Interfaces 
	public TextStyle providesTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(IFractalShape.GREEN.getRGB());
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	public TextStyle requiresTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(IFractalShape.RED.getRGB());
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	public TextStyle bindingTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(IFractalShape.GRAY.getRGB());
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	// --
	
	// Import 
	public TextStyle importTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(IFractalShape.GRAY.getRGB());
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
