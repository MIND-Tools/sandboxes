package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * @author Olivier Marot
 *
 */
public class ReferenceFigure extends AbstractComponentShape {

	

	public ReferenceFigure() {
		super();
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_GREY;
	protected Color borderColor = GREY;
	
	protected static Dimension PREFERRED_SIZE = new Dimension (200,20);
	
	
	@Override
	public void setBounds(Rectangle rect) {
		super.setBounds(rect);
	}
	
	
	
	
	
	
//	@Override
//	protected void fillShape(Graphics graphics) {
//		super.fillShape(graphics);
//		/* Resize to share the container's space with all others children */
//		
//		//Get the bounds and size of this item's container
//		Shape container = findContainerShape();		
//		Dimension containerSize = container.getSize();
//		
//		// Let some space for the scrollbar
//		containerSize.shrink(10, 0);
//			
//		//Resize
//		this.setPreferredSize(containerSize);
//		
//	}
	
	
	/**
	 * Finds the container of this item by seeking the first item of type Shape in his parents
	 * @return the shape of this item's container
	 * @author mao
	 */
	protected Shape findContainerShape() {
		//Find the first parent of type Shape
		//It will be the container's shape
		for (IFigure parent = this.getParent(); parent != null; parent = parent.getParent()) {
			if (parent instanceof Shape) {
				return (Shape)parent;				
			}
		}
		return null;
	}
	
}
