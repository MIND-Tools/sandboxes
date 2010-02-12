package org.ow2.fractal.mind.diagram.custom.figures;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * Figure to display custom border around component and definition figures.
 * @author Yann Davin
 *
 */
public class ComponentBorder extends LineBorder implements IFractalShape {
	protected Rectangle externalBorder = new Rectangle();
	
	public ComponentBorder(){
		super(new Color (null,200,200,200), 3);
	}
	
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));
		if (getWidth() % 2 == 1) {
			tempRect.width--;
			tempRect.height--;
		}
		tempRect.shrink(getWidth() / 2, getWidth() / 2);
		graphics.setLineWidth(getWidth());
		if (getColor() != null)
			graphics.setForegroundColor(getColor());
		graphics.drawRectangle(tempRect);

//		Test to set the border gradient
//		graphics.pushState();
//		graphics.setBackgroundColor(new Color(Display.getCurrent(),250,250,250));
//		graphics.setForegroundColor(getColor());
//		Rectangle copy = figure.getBounds().getCopy();
//		copy.width = 10;
//		graphics.fillGradient(copy, true);
//		
//		Rectangle copy2 = figure.getBounds().getCopy();
//		copy2.x  = copy2.x + copy2.width-10;
//		copy2.width = 10;
//		graphics.fillGradient(copy2, true);
//		
//		Rectangle copy4 = figure.getBounds().getCopy();
//		copy4.y = copy4.y + copy4.height -10;
//		copy4.height = 10;
//		graphics.fillRectangle(copy4);
//		graphics.popState();
//		
//		
//		Color fg = graphics.getForegroundColor();
//		Color bg = graphics.getBackgroundColor();
//		
//		graphics.pushState();
//		graphics.setBackgroundColor(fg);
//		graphics.setForegroundColor(bg);
//
//		Rectangle copy3 = figure.getBounds().getCopy();
//		copy3.height = 10;
//		graphics.fillRectangle(copy3);
//		graphics.popState();
		
		
		graphics.pushState();
		graphics.setForegroundColor(BLACK);
		graphics.setLineWidth(1);
		
		externalBorder = figure.getBounds().getCopy();
		externalBorder.width -= 1;
		externalBorder.height -= 1;
		graphics.drawRectangle(externalBorder);
		
		graphics.drawRectangle(figure.getClientArea());
		graphics.popState();
	}
}
