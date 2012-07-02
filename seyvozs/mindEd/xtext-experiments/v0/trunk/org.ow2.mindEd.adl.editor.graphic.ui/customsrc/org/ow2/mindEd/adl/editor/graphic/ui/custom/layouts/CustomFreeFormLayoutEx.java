package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;

/** 
 * Extends FreeFormLayoutEx (by mmostafa) to prevent children superposition
 * and tell the parent which size it should have (the second feature is not implemented yet)
 * @author maroto
 *
 */
public class CustomFreeFormLayoutEx extends FreeFormLayoutEx {
	
	protected ArrayList<Rectangle> childrenBounds = new ArrayList<Rectangle>();
	
	public ArrayList<Rectangle> getChildrenBounds() {
		return childrenBounds;
	}
	
	
	public void layout(IFigure parent) {
        Iterator<?> children = parent.getChildren().iterator();
        Point offset = getOrigin(parent);
        IFigure f;
        childrenBounds.clear();
        
        while (children.hasNext()) {
            f = (IFigure)children.next();
            Rectangle bounds = (Rectangle)getConstraint(f);
            
            // -- There is no constraint
            if (bounds == null) {
            	// Prevent the superposition
            	preventSuperposition(f);
            	// Remember the child
            	childrenBounds.add(f.getBounds());
            	continue;
            }

            // -- There is a constraint, process width and height
            int widthHint = bounds.width;
            int heightHint = bounds.height;
            if (widthHint == -1 || heightHint == -1) {
                Dimension _preferredSize = f.getPreferredSize(widthHint, heightHint);
                bounds = bounds.getCopy();
                if (widthHint == -1)
                    bounds.width = _preferredSize.width;
                if (heightHint == -1)
                    bounds.height = _preferredSize.height;
            }
            Dimension min = f.getMinimumSize(widthHint, heightHint);
            Dimension max = f.getMaximumSize();
            
            if (min.width>bounds.width)
                bounds.width = min.width;
            else if (max.width < bounds.width)
                bounds.width = max.width;
            
            if (min.height>bounds.height)
                bounds.height = min.height;
            else if (max.height < bounds.height)
                bounds.height = max.height;
            bounds = bounds.getTranslated(offset);
            f.setBounds(bounds);
            
            // Prevent the superposition
            preventSuperposition(f);
            setConstraint(f, f.getBounds());
            // Remember the child
            childrenBounds.add(f.getBounds());
        }
        
       // TODO
        // Find the component's primary shape (parent is the body's shape)
//        IFigure containerShape = parent.getParent(); 
//        while (!(containerShape instanceof ContainerShape)){
//        	if (containerShape == null) return;
//        	containerShape = containerShape.getParent();
//        }
        // Body is a scrollable pane, so it's size may not be the "visible" size.
        // It is wide enough to contain all children, so we use its size
        // to extend the component
        // (this statement is false)
//        Rectangle areaBounds = parent.getBounds();
//        containerShape.getParent().setConstraint(containerShape, areaBounds);
    }
	
	
	/**
	 * Calculates the new position needed to prevent the child
	 * from being on top of another one. Works with childrenBounds, the
	 * list of the children already processed by the layout() method.<p>
	 * Translates the figure to adjust.
	 * @param figure the figure of the child being processed
	 * 
	 */
	protected void preventSuperposition(IFigure figure) {
		Rectangle bounds = figure.getBounds();
		
		// Prevent superposition with other children already processed
        for(Rectangle childBounds : childrenBounds) {
        	if (childBounds.intersects(bounds)) {
    			Rectangle intersection = childBounds.getIntersection(bounds);
    			
    			if (intersection.equals(bounds)) {
    				// figure is entirely contained in child
    				figure.translate(childBounds.width - (bounds.x - childBounds.x) + 5, 0);
    			}
    			else if (intersection.equals(childBounds)) {
    				// child is entirely contained in figure
    				figure.translate(bounds.width - (bounds.getLeft().x - childBounds.getLeft().x) + 5 , 0);
    			}
    			else {
    				// normal intersection
    				Dimension direction = bounds.getCenter()
							.getDifference(intersection.getCenter());
					if (Math.abs(direction.width) > Math.abs(direction.height)) {
						figure.translate(Integer.signum(direction.width) * (intersection.width + 10), 0);
					}
					else {
						figure.translate(0, Integer.signum(direction.height) * (intersection.height + 10));
					}
    			}
        	}
        }
	}
	
	public void setConstraint(IFigure figure, Object newConstraint) {
		super.setConstraint(figure, newConstraint);
	}
	
}
