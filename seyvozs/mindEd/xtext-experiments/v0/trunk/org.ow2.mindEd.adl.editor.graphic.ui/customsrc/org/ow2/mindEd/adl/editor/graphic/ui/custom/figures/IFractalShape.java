package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.IFractalSize;

/**
 * Defines all colors
 * @author Olivier Marot
 *
 */
public interface IFractalShape extends IFractalSize {
	static Color WHITE = new Color(null,255,255,255);
	static Color GRAY_FOR_MERGED_ELEMENT = new Color(null,200,200,200);
	static Color LIGHT_GREY = new Color(null,220,220,220);
	static Color DARK_GRAY = new Color(null,100,100,100);
	static Color BLACK = new Color(null,0,0,0);
	static Color RED = new Color(null,240,10,10);
	static Color GREEN = new Color(null,150,240,150);
	static Color GREY = new Color(null,150,150,150);
	static Color BLUE = new Color(null,100,100,250);
	static Color LIGHT_BLUE = new Color(null, 240, 240, 250);
	static Color BROWN = new Color(null,200,150,75);
	static Color LIGHT_BROWN = new Color(null,240,210,180);
	static Color YELLOW = new Color(null,254,254,0);
	static Color LIGHT_YELLOW = new Color(null,250,250,200);
	static Color LIGHT_GREEN = new Color(null,235,250,235);
	static Color PURPLE = new Color(null, 153, 0, 204);
	static Color LIGHT_PURPLE = new Color(null, 240, 230, 250);
	static Color LIGHT_RED = new Color(null, 255, 240, 240);
	static Color ORANGE = new Color(null, 255, 165, 0);
	static Color LIGHT_ORANGE = new Color(null, 255, 230, 200);
	
	static String INLINEC_IMAGE_NAME = "/images/InlineC.png";
	static String FILEC_IMAGE_NAME   = "/images/CFile.png";
	
}
