package org.ow2.fractal.mind.diagram.custom.layouts;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;

/** 
 * Extends FreeFormLayoutEx (by mmostafa) to prevent children superposition
 * @author maroto
 *
 */
public class CustomFreeFormLayoutEx extends FreeFormLayoutEx {
	
	ArrayList<Rectangle> childrenBounds = new ArrayList<Rectangle>();
	

	public void layout(IFigure parent) {
        Iterator children = parent.getChildren().iterator();
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
