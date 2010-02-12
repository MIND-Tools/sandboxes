package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
* Description :
* Customizes the appearance of the figure
*
* @author AVE
* @date 20/08/2009
* @Version 
* **/
public class PrimitiveAnonymousComponentCustomFigure extends
							AbstractComponentShape {
	
	//Couleur de fond du component
	private Color bodyAreaColor = LIGHT_ORANGE;

	public Color getBodyAreaColor() {
		return bodyAreaColor;
	}
	
	public void setBodyAreaColor(Color newColor) {
		bodyAreaColor = newColor;
	}
	
	//Couleur de la bordure
	private Color borderColor = ORANGE;
	
	public Color getBorderColor() {
		return borderColor;
	}
	
	//Taille maximum du label
	private Dimension nameLabelMaxSize = new Dimension (500000,50);

	public Dimension getNameLabelMaxSize() {
		return nameLabelMaxSize;
	}
	
	//Taille par défaut du component
	private Dimension componentPreferredSize = new Dimension (50,50);

	public Dimension getComponentPreferredSize() {
		return componentPreferredSize;
	}
}