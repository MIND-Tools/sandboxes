package org.ow2.fractal.mind.diagram.custom.figures;


import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * @author Olivier Marot
 *
 */
public class TemplateSpecifiersListCustomFigure extends AbstractComponentShape {

	protected static Dimension MAXIMUM_SIZE = new Dimension(500000,75);
	
	public TemplateSpecifiersListCustomFigure() {
		setBackgroundColor(LIGHT_YELLOW);
		setMaximumSize(MAXIMUM_SIZE);
		setPreferredSize(MAXIMUM_SIZE);
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_YELLOW;
}
