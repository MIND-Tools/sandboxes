package org.ow2.fractal.mind.diagram.custom.figures;

import java.io.InputStream;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * A shape with a background image
 * @author AVE
 *
 */

public class CShape extends Shape {

private Display display;	
	
	public CShape(){
		super();
		display = Display.getDefault();
	}

	/**
	 * Fills the shape with the image imageName and resizes it to his parent's size
	 * The Shape must be integrated in a container
	 * If more than one shape share the container, they share height
	 * @author AVE
	 * @param graphics
	 * @param imageName the path to the image file
	 */
	protected void fillShape(Graphics graphics, String imageName) {
		
		/* Resize to share the container's space with all others children */
		
		//Get the bounds and size of this item's container
		Shape container = findContainerShape();
		Rectangle containerBounds = container.getClientArea();		
		Dimension containerSize = container.getSize();
	
		//We must reduce height by 3
		containerSize.shrink(0, 3);
			
		//Resize
		this.setPreferredSize(containerSize);
		
		/* Draw image as background */
		graphics.drawRectangle(containerBounds);
		graphics.drawImage(getImage(imageName), image.getBounds().x,image.getBounds().y,image.getBounds().width,image.getBounds().height, containerBounds.x, containerBounds.y, containerBounds.width, containerBounds.height);
	}
	
	Image image;
	
	protected Image getImage(String imageName) {
		if (image == null) {
			InputStream input = getClass().getResourceAsStream(imageName);
			image = new Image(display,input); 
		}
		return image;
	}
	
	
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


	/**
	 * Does nothing : we don't want the outline to show the image
	 * @author MAO
	 */
	@Override
	protected void outlineShape(Graphics graphics) {
		//Do nothing
	}
	
	/**
	 * Does nothing : if there is no image show the background
	 * To draw an image override this method to call fillShape(Graphics graphics, String imageName)
	 * @author MAO
	 */
	@Override
	protected void fillShape(Graphics graphics) {
		//Do nothing
	}

}
