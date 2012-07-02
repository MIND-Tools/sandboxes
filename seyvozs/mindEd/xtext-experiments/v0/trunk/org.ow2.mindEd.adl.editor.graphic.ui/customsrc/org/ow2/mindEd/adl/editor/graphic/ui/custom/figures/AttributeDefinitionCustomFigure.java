package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
 * @author maroto
 *
 */
public class AttributeDefinitionCustomFigure extends AbstractComponentShape {


	public AttributeDefinitionCustomFigure() {
		super();
		setBackgroundColor(BACKGROUND_COLOR);
		createBorder();
		
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_GREEN;
	
	protected static Color BORDER_COLOR = GREEN;
	
	public static int ATTRIBUTE_HEIGHT = 20;
	
	
	private void createBorder() {
		ComponentBorder border = new ComponentBorder();
		border.setColor(BORDER_COLOR);
		setBorder(border);
	}
}

