package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * @author Olivier Marot
 *
 */
public class AnnotationsListCustomFigure extends AbstractComponentShape {

	protected static Dimension MAXIMUM_SIZE = new Dimension(5000,150);
	protected static Dimension PREFERRED_SIZE = new Dimension(100,150);
	
	public AnnotationsListCustomFigure() {
		setBackgroundColor(WHITE);
		setMaximumSize(MAXIMUM_SIZE);
		setPreferredSize(PREFERRED_SIZE);
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_BLUE;
	

}
