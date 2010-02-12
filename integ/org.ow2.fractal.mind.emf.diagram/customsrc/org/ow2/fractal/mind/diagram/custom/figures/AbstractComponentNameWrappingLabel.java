package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.AbstractBackground;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Image;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

/**
 * Custom figure to manage label background color.
 * Label of the figures component, definition, attributes, ... must be in gray
 * when the related model element can't be edited (typically when it's a merged element),
 * @author Yann Davin
 *
 */
public class AbstractComponentNameWrappingLabel extends WrappingLabel
			implements IFractalShape, IFractalSize{
	
	public AbstractComponentNameWrappingLabel(){
		setOpaque(true);
		setBackgroundColor(WHITE);
	}
	
	 public void paintFigure(Graphics graphics) {
			if (isOpaque()) {
				
				graphics.fillRectangle(getBounds());
				getTextFigure().setForegroundColor(BLACK);
			}
			
			if (getBorder() instanceof AbstractBackground) {
				((AbstractBackground) getBorder()).paintBackground(this, graphics, NO_INSETS);
			}
		
	        if (hasIcons()) {
	            paintIcons(graphics);
	        }
	    }

	    protected void paintClientArea(Graphics graphics) {
	        paintSelectionRectangle(graphics);
	        paintFocusRectangle(graphics);
	        super.paintClientArea(graphics);
	    }

	    private void paintSelectionRectangle(Graphics g) {
	        if (isSelected()) {
	            g.pushState();
	            g.setBackgroundColor(ColorConstants.menuBackgroundSelected);
	            g.fillGradient(getVisibleTextBounds(), true);
	            g.fillRectangle(getVisibleTextBounds());
	            g.popState();
	            g.setForegroundColor(ColorConstants.white);
	        }
	    }

	    private void paintFocusRectangle(Graphics g) {
	        if (hasFocus()) {
	            g.pushState();
	            g.setXORMode(true);
	           g.setForegroundColor(ColorConstants.menuBackgroundSelected);
	           g.setBackgroundColor(ColorConstants.white);
	            g.drawFocus(getVisibleTextBounds());
	            g.popState();
	        }
	    }
	    
	    private Rectangle getVisibleTextBounds() {
	        return getTextBounds().getIntersection(getClientArea());
	    }
	    
	    private void paintIcons(Graphics graphics) {
	        Point p = Point.SINGLETON;

	        if (getIconLocation() != null) {
	            p.setLocation(getIconLocation());

	            Rectangle figBounds = getBounds();
	            graphics.translate(figBounds.x, figBounds.y);

	            int num = getNumberofIcons();
	            for (int i = 0; i < num; i++) {
	                Image icon = getIcon(i);
	                if (icon != null) {
	                    graphics.drawImage(icon, p);
	                    p.x += getIconSize(i).width;
	                }
	            }
	            graphics.translate(-figBounds.x, -figBounds.y);
	        }
	    }
	    
	    private boolean editable=true;
	    
		public void setEditable(boolean editable){
			this.editable = editable;
//			updateBackground();
		}
		
		public boolean getEditable(){
			return this.editable;
		}
		
//		private void updateBackground(){
//			if(editable == true){
//				setBackgroundColor(WHITE);
//			}else{
//				setBackgroundColor(GRAY_FOR_MERGED_ELEMENT);
//			}
//		}
		
		public void setBounds(Rectangle rect) {
			super.setBounds(rect);
		}
}
