package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.InterfaceDefinitionShape;


public class InterfaceDefinitionShape extends Shape implements IFractalShape{
	
	private int[] myCachedPath = new int[18];
	public enum Role {PROVIDES,REQUIRES};
	protected Role role = Role.REQUIRES;
	private boolean editable = true;
	private Color extensionColor = null;
	
	public InterfaceDefinitionShape() {
		super();
	}

	public void setRole(InterfaceDefinitionShape.Role role){
		this.role = role;
		updateBackground();
	}
	
	public InterfaceDefinitionShape.Role getRole(){
		return this.role;
	}
	
	
	@Override
	protected void fillShape(Graphics graphics) {
		if(this.role == Role.REQUIRES){
			fillClientShape(graphics);
		}else{
			fillServerShape(graphics);
		}
	}

	protected void fillClientShape(Graphics graphics){
		Rectangle r = this.getBounds();
		int y = 5;
		int x = 5;
		setPathPoint(0, r.x + 0, r.y + y);
		setPathPoint(1, r.x + 0, r.y + 2*y);
		setPathPoint(2, r.x + 2*x, r.y + 2*y);
		setPathPoint(3, r.x + 2*x, r.y + 3*y);
		setPathPoint(4, r.x + 3*x, r.y + 3*y);
		setPathPoint(5, r.x + 3*x, r.y + 0);
		setPathPoint(6, r.x + 2*x, r.y + 0);
		setPathPoint(7, r.x + 2*x, r.y + y);
		setPathPoint(8, r.x + 0, r.y + y);
		graphics.fillPolygon(myCachedPath);
	}
	
	protected void fillServerShape(Graphics graphics) {
		Rectangle r = this.getBounds();
		int y = 5;
		int x = 5;
		int x0 = r.x + r.width - 15;
		setPathPoint(0, x0 + 0, r.y + 0);
		setPathPoint(1, x0 + 0, r.y + 3*y);
		setPathPoint(2, x0 + x, r.y + 3*y);
		setPathPoint(3, x0 + x, r.y + 2*y);
		setPathPoint(4, x0 + 3*x, r.y + 2*y);
		setPathPoint(5, x0 + 3*x, r.y + y);
		setPathPoint(6, x0 + x, r.y + y);
		setPathPoint(7, x0 + x, r.y + 0);
		setPathPoint(8, x0 + 0, r.y + 0);
		graphics.fillPolygon(myCachedPath);
	}
	
	
	@Override
	protected void outlineShape(Graphics graphics) {
		if(this.role == Role.REQUIRES){
			outlineClientShape(graphics);
		}else{
			outlineServerShape(graphics);
		}
	}

	protected void outlineServerShape(Graphics graphics) {
	}
		
	protected void outlineClientShape(Graphics graphics) {
	}
	
	private void setPathPoint(int index, int x, int y) {
		myCachedPath[index * 2] = x;
		myCachedPath[index * 2 + 1] = y;
	}
	
	public void updateBackground(){
		if(editable == true){
			if (extensionColor != null)
				setBackgroundColor(extensionColor);
			else if(role == Role.REQUIRES){
				setBackgroundColor(GREEN);
			}else{
				setBackgroundColor(RED);
			}
		}else{
			setBackgroundColor(GREY);
		}
	}
	
	public void setBackgroundColor(Color bg) {
		super.setBackgroundColor(bg);
	}
	
	public Color getExtensionColor() {
		return extensionColor;
	}
	
	public void setExtensionColor(Color color) {
		extensionColor  = color;
	}
	
	public void setEditable(boolean editable){
		this.editable = editable;
		updateBackground();
	}	
}
