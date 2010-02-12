package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
 * @author Olivier Marot
 *
 */
public class AnnotationElementCustomFigure extends AbstractComponentShape {

	public AnnotationElementCustomFigure() {
		super();
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_BLUE;
	protected static Color BORDER_COLOR = BLUE;
	
	protected static Dimension PREFERRED_SIZE = new Dimension (100,20);

}
