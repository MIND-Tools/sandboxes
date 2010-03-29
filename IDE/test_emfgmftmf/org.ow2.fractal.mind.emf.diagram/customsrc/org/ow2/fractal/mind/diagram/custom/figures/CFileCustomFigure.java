package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;


/**
* Class for the customization of CFileFigure
* Extends CShape to draw an image
*
* @author AVE
* @date 20/08/2009
* @Version 
* **/

public class CFileCustomFigure extends CShape implements IFractalShape {
	
	public CFileCustomFigure(){
		super();
	}
	
	/**
	 * Calls the CShape method to fill the shape with an image
	 * @author AVER
	 */
	@Override
	protected void fillShape(Graphics graphics) {
		//Call the method to draw an image
		//instead of the basic call
		super.fillShape(graphics, FILEC_IMAGE_NAME); 
	}
	
	//Taille par défaut de l'image
	protected static Dimension PREFERRED_SIZE = new Dimension (50,50);
	
}