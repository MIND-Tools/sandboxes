package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.CShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;

/**
* Class for the customization of InlinceCFigure
* Extends CShape to draw an image
*
* @author AVE
* @date 20/08/2009
* @Version 
* **/

public class InlineCFigure extends CShape implements IFractalShape {

	public InlineCFigure(){
		super();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		//Call the method to draw an image
		//instead of the basic call
		super.fillShape(graphics, INLINEC_IMAGE_NAME); 
	}
	
	
	//Taille par défaut de l'image
	protected static Dimension PREFERRED_SIZE = new Dimension (50,50);
	
	
}
