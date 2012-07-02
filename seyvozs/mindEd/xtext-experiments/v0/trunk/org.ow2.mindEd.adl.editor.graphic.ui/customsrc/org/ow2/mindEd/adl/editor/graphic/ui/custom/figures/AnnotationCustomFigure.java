package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;


/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * @author Olivier Marot
 *
 */
public class AnnotationCustomFigure extends AbstractComponentShape {

	public AnnotationCustomFigure() {
		super();
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_BLUE;
	protected static Color BORDER_COLOR = BLUE;
	
	protected static Dimension PREFERRED_SIZE = new Dimension (100,20);

}
