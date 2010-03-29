package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author Yann Davin
 * 
 */
public class ContainerShape extends Shape implements IFractalShape{
	
	public ContainerShape(){
		super();
		setBackgroundColor(WHITE);
		setForegroundColor(new Color(null,150,150,150));
	}
	
	public ContainerShape(boolean editable){
		super();
		setForegroundColor(new Color(null,150,150,150));
		this.editable = editable;
		updateBackground();
	}
	
	
	private boolean editable=true;
	public void setEditable(boolean editable){
		this.editable = editable;
		updateBackground();
	}
	
	public boolean getEditable(){
		return this.editable;
	}
	
	private void updateBackground(){
		if(editable == true){
			setBackgroundColor(WHITE);
		}else{
			setBackgroundColor(GRAY_FOR_MERGED_ELEMENT);
		}
	}
	
	protected void fillShape(Graphics graphics) {
		graphics.fillRectangle(getClientArea());
	}

	public Rectangle getBounds() {
		Rectangle r = super.getBounds();
		//Rectangle result = new Rectangle(r.x, r.y , r.width , r.height);
		return r.getCopy();
	}
	
	protected void outlineShape(Graphics graphics) {
		this.setLineWidth(1);
		Rectangle r = this.getBounds();
		
	//	r.setSize(r.width, r.height );
		graphics.drawRectangle(r);
	}

	public Rectangle getClientArea(Rectangle rect) {
		// TODO Auto-generated method stub
		return super.getClientArea(rect);
	}
}
