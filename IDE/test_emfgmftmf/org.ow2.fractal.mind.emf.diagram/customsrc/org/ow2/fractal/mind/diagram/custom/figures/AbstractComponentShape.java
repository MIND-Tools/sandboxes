package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RectangularDropShadowLineBorder;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author Yann Davin
 * 
 */
public class AbstractComponentShape extends Shape implements IFractalShape {

	public AbstractComponentShape(){
		setForegroundColor(LIGHT_GRAY);
		setBackgroundColor(WHITE);
		new RectangularDropShadowLineBorder(5);
	}
	
	protected void fillShape(Graphics graphics) {
		graphics.setXORMode(true);
		
		Rectangle r = getBounds().getCopy();
		graphics.fillRectangle(r);
	}

	public Rectangle getBounds() {
		Rectangle r = super.getBounds();
		Rectangle result = new Rectangle(r.x, r.y , r.width, r.height);
		return result;
	}

	/**
	 * @see Shape#outlineShape(Graphics)
	 */
	protected void outlineShape(Graphics graphics) {
		this.setLineWidth(1);
		Rectangle r = this.getBounds();
		graphics.drawRectangle(r);
	}

	public void setBackgroundColor(Color bg) {
		super.setBackgroundColor(bg);
	}

	public void setForegroundColor(Color fg) {
		super.setForegroundColor(fg);
	}
	
	public ContainerShape getArea() {
		return null;
	}
}
