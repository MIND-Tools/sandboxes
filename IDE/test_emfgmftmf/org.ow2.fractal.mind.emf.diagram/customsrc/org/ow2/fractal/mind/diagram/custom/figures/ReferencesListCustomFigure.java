package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * @author Olivier Marot
 *
 */
public class ReferencesListCustomFigure extends Shape implements IFractalShape {

	public static Dimension MAXIMUM_SIZE = new Dimension(50000,100);
	public static Dimension PREFERRED_SIZE = new Dimension(5000,100);
	
	public ReferencesListCustomFigure() {
		super();
	}
	
	public static Color BACKGROUND_COLOR = LIGHT_GRAY;

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setXORMode(true);
		
		Rectangle r = getBounds().getCopy();
		graphics.fillRectangle(r);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}
	
}
