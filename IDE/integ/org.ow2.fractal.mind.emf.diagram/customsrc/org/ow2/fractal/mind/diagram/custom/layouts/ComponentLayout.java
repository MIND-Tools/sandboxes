package org.ow2.fractal.mind.diagram.custom.layouts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.UpdateManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.figures.AbstractComponentNameWrappingLabel;
import org.ow2.fractal.mind.diagram.custom.figures.ContainerShape;


public class ComponentLayout extends ConstrainedToolbarLayout implements IFractalSize {
	
	/**
	 * The constrains map
	 */
	private Map constraints;
	
	public void layout(IFigure figure) {
		Rectangle clientArea = figure.getClientArea();
		List children = figure.getChildren();
		IFigure child;
		IFigure body = null;
		int totalTitlesHeight = 0;
		int totalListsHeight = 0;
		
		for (int i = 0; i < children.size(); i++) {
			child = (IFigure)children.get(i);
			
			if (child instanceof AbstractComponentNameWrappingLabel) { 
				child.setBounds(
						new Rectangle(
							clientArea.x,
							clientArea.y,
							clientArea.width,
							TITLE_HEIGHT
							)
						);
				totalTitlesHeight += TITLE_HEIGHT;
			}
			
			else if (child instanceof ContainerShape) {
				// Body is the last to be computed
				body = child;
			}
			
			else {
				// Child is a list
				Object constraint = this.getConstraint(child);
				Rectangle rect;
				if (constraint != null) {
					rect = ((Rectangle)constraint).getCopy();
				}
				else {
					rect = new Rectangle(-1,-1,-1,-1);
				}
				
				if (rect.height < 0 || rect.height > MAX_LIST_HEIGHT) {
					rect.height = MAX_LIST_HEIGHT;
				}
				if (rect.width < 0) {
					rect.width = clientArea.width;
				}
				if (rect.x <= 0) {
					rect.x = clientArea.x;
				}
				if (rect.y <= 0) {
					rect.y = clientArea.y + clientArea.height - rect.height - totalListsHeight;
				}
				
				child.setBounds(rect);
				totalListsHeight += rect.height;
			}			
		}
		
		if (body != null) {
			body.setBounds(new Rectangle(
							clientArea.x,
							clientArea.y + totalTitlesHeight,
							clientArea.width,
							clientArea.height - totalTitlesHeight - totalListsHeight
					)
			);
		}
		
	}
	
	
//	public void getListHeightFromChildren(IFigure listFigure) {
//		
//	}
	
	
	
	/**
	 * Sets the constraint for the given figure. Constraint must be a Rectangle,
	 * an attribute (x,y,width,height) set to -1 means it has no constraint.
	 */
	public void setConstraint(IFigure child, Object constraint) {
		if (constraint instanceof Rectangle) {
			Rectangle r = (Rectangle) constraint;
			super.setConstraint(child, constraint);
			if (constraints == null)
				constraints = new HashMap();
			if (constraint == null || r.equals(new Rectangle(-1,-1,-1,-1))) {
				if (constraints.containsKey(child))
					constraints.remove(child);
			} else
				constraints.put(child, constraint);
		}
//		else if (constraint instanceof ListConstraint) {
//			return;
//		}
//		else if (constraint instanceof TitleConstraint) {
//			return;
//		}
	}
	
	/**
	 * Returns the constraint for the given figure.
	 * @param child The figure
	 * @return The constraint
	 */
	public Object getConstraint(IFigure child) {
		if (constraints != null)
			return constraints.get(child);
		
		return null;
	}

	@Override
	protected Dimension calculatePreferredSize(IFigure container, int wHint,
			int hHint) {
		Rectangle clientArea = container.getClientArea();
		int preferredWidth = clientArea.width;
		int preferredHeight;
		
		if (hHint >= (clientArea.height)/4) {
			preferredHeight = (clientArea.height)/3;
		}
		else {
			preferredHeight = hHint;
		}
		return new Dimension(preferredWidth,preferredHeight);
	}


	
}
	

