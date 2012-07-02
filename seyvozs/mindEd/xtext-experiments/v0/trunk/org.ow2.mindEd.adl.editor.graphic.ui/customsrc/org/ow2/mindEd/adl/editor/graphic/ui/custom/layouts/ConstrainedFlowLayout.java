package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * A layout meaned for references but could be used for other items.<p>
 * This is basically a FlowLayout which understands constraints. The total height
 * used by the children is remembered so that the parent can access it and 
 * calculate its own size depending on it.
 * @see {@link FlowLayout}
 * @author maroto
 *
 */
public class ConstrainedFlowLayout extends FlowLayout {
	

	protected ConstrainedWorkingData constrainedData = new ConstrainedWorkingData();
	
	protected HashMap<IFigure,Object> constraints = new HashMap<IFigure,Object>();
	
	public ConstrainedFlowLayout(boolean fillvalue) {
		super();
		setFill(fillvalue);
	}

	/**
	 * @return the total height used to layout the children
	 */
	public int getTotalHeight() {
		return totalHeight;
	}
	
	protected int totalHeight = 0;
	
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
	
	
	
	@SuppressWarnings("rawtypes")
	public void layout(IFigure parent) {
		Rectangle relativeArea = parent.getClientArea();
		constrainedData.area = transposer.t(relativeArea);
		
		// parent may not be set yet
		if (relativeArea.width == 0) return;

		Iterator iterator = parent.getChildren().iterator();
		int dx;

		initVariables(parent);
		initRow();
		int i = 0; 
		while (iterator.hasNext()) {
			IFigure f = (IFigure)iterator.next();
			
			Rectangle bounds = getConstraint(f);

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
			
			Rectangle r = new Rectangle(0, 0, bounds.width, bounds.height);
			
			if (constrainedData.rowCount > 0) {
				if (constrainedData.rowWidth + bounds.width > constrainedData.maxWidth)
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
