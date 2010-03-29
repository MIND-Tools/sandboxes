package org.ow2.fractal.mind.diagram.custom.layouts;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public class ConstrainedFlowLayout extends FlowLayout {
	

	protected ConstrainedWorkingData constrainedData = new ConstrainedWorkingData();
	
	protected HashMap constraints = new HashMap();
	
	public ConstrainedFlowLayout(boolean fillvalue) {
		super();
		setFill(fillvalue);
	}

	public int getTotalHeight() {
		return totalHeight;
	}
	
	public int totalHeight = 0;
	
	/**
	 * Holds the necessary information for layout calculations.
	 */
	protected class ConstrainedWorkingData {
		public int rowHeight, rowWidth, rowCount, rowX, rowY, maxWidth;
		public Rectangle bounds[], area;
		public IFigure row[];
	}
	
	public void setConstraint(IFigure child, Object constraint) {
		invalidate(child);
		constraints.put(child, constraint);
	}
	
	public Rectangle getConstraint(IFigure child) {
		Object constraint = constraints.get(child);
		if (constraint instanceof Rectangle) {
			return (Rectangle) constraint;
		}
		return new Rectangle(-1,-1,-1,-1);
	}
	
	protected void initVariables(IFigure parent) {
		constrainedData.row = new IFigure[parent.getChildren().size()];
		constrainedData.bounds = new Rectangle[constrainedData.row.length];
		constrainedData.maxWidth = constrainedData.area.width;
	}
	
	protected void initRow() {
		constrainedData.rowX = 0;
		constrainedData.rowHeight = 0;
		constrainedData.rowWidth = 0;
		constrainedData.rowCount = 0;
	}
	
	public void layout(IFigure parent) {
		Rectangle relativeArea = parent.getClientArea();
		constrainedData.area = transposer.t(relativeArea);

		Iterator iterator = parent.getChildren().iterator();
		int dx;

		//Calculate the hints to be passed to children
		int wHint = -1;
		int hHint = -1;
		if (isHorizontal())
			wHint = parent.getClientArea().width;
		else
			hHint = parent.getClientArea().height;

		initVariables(parent);
		initRow();
		int i = 0; 
		while (iterator.hasNext()) {
			IFigure f = (IFigure)iterator.next();
			Dimension pref = transposer.t(getChildSize(f, wHint, hHint));
			
			Rectangle cons = getConstraint(f);
			if (cons.width > 0) {
				pref.width = cons.width;
			}
			if (cons.height > 0) {
				pref.height = cons.height;
			}
			
			Rectangle r = new Rectangle(0, 0, pref.width, pref.height);

			
			if (constrainedData.rowCount > 0) {
				if (constrainedData.rowWidth + pref.width > constrainedData.maxWidth)
					layoutRow(parent);
			}
			r.x = constrainedData.rowX;
			r.y = constrainedData.rowY;
			dx = r.width + getMinorSpacing();
			constrainedData.rowX += dx;
			constrainedData.rowWidth += dx;
			constrainedData.rowHeight = Math.max(constrainedData.rowHeight, r.height);
			constrainedData.row [constrainedData.rowCount] = f;
			constrainedData.bounds[constrainedData.rowCount] = r;
			constrainedData.rowCount++;
			i++;
		}
		if (constrainedData.rowCount != 0)
			layoutRow(parent);
		totalHeight = constrainedData.rowY;
		constrainedData.rowY = 0;
	}
	
	public void setFill (boolean newFill) {
		fill = newFill;
	}
	
	protected void layoutRow(IFigure parent) {
		int majorAdjustment = 0;
		int minorAdjustment = 0;
		int correctMajorAlignment = majorAlignment;
		int correctMinorAlignment = minorAlignment;

		majorAdjustment = constrainedData.area.width - constrainedData.rowWidth + getMinorSpacing();
		
		switch (correctMajorAlignment) {
			case ALIGN_LEFTTOP: 
				majorAdjustment = 0;
				break;
			case ALIGN_CENTER:
				majorAdjustment /= 2;
				break;
			case ALIGN_RIGHTBOTTOM:
				break;
		}

		for (int j = 0; j < constrainedData.rowCount; j++) {
			if (fill) {
				constrainedData.bounds[j].height = constrainedData.rowHeight;	
			} else {
				minorAdjustment = constrainedData.rowHeight - constrainedData.bounds[j].height;
				switch (correctMinorAlignment) {
					case ALIGN_LEFTTOP: 
						minorAdjustment = 0;
						break;
					case ALIGN_CENTER:
						minorAdjustment /= 2;
					break;
					case ALIGN_RIGHTBOTTOM:
						break;
				}
				constrainedData.bounds[j].y += minorAdjustment;
			}
			constrainedData.bounds[j].x += majorAdjustment;
			
			setBoundsOfChild(parent, constrainedData.row[j], transposer.t(constrainedData.bounds[j]));
		}
		constrainedData.rowY += getMajorSpacing() + constrainedData.rowHeight;
		initRow();
	}

}
