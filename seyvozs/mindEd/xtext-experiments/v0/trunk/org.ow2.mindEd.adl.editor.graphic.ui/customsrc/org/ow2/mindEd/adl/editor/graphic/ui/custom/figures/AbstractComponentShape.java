package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * 
 * @author Yann Davin
 * 
 */
public class AbstractComponentShape extends Shape implements IFractalShape {

	

//	public AbstractComponentShape(){
//		setForegroundColor(LIGHT_GRAY);
//		setBackgroundColor(WHITE);
//		new RectangularDropShadowLineBorder(5);
//	}
//	
	protected void fillShape(Graphics graphics) {
		graphics.setXORMode(true);
		
		Rectangle r = getBounds().getCopy();
		graphics.fillRectangle(r);
	}

//	public Rectangle getBounds() {
//		Rectangle r = super.getBounds();
//		Rectangle result = new Rectangle(r.x, r.y , r.width, r.height);
//		return result;
//	}

	/**
	 * @see Shape#outlineShape(Graphics)
	 */
	protected void outlineShape(Graphics graphics) {
		this.setLineWidth(1);
		Rectangle r = this.getBounds();
		graphics.drawRectangle(r);
	}

//	public void setBackgroundColor(Color bg) {
//		super.setBackgroundColor(bg);
//	}
//
//	public void setForegroundColor(Color fg) {
//		super.setForegroundColor(fg);
//	}
//	
//	public ContainerShape getArea() {
//		return null;
//	}
//	
//	public void setMerged(Boolean merged) {
//		if (merged) {
//			setBackgroundColor(LIGHT_GRAY);
//			setForegroundColor(LIGHT_GRAY);
//			setBorder(createMergedBorder());
//		}
//		else {
//			// TODO
//		}
//	}
//	
//	private Border createMergedBorder() {
//		ComponentBorder result = new ComponentBorder();
//		result.setColor(GRAY);
//		return result;
//	}
	/**
	 *  Subclasses should override this method
	 * Generated figures will do this if the accessor is called
	 * getCompartment() in the .gmfgraph file
	 */
	
	public IFigure getCompartment() {
		return null;
	};
}
