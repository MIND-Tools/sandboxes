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
public class CompositeComponentDefinitionCustomFigure extends
							AbstractComponentShape {

	
	//Couleur de fond du component
	public static Color bodyAreaColor = LIGHT_BLUE;
	
	//Couleur de la bordure
	public static Color borderColor = BLUE;
	
	//Taille maximum du label
	public static Dimension nameLabelMaxSize = new Dimension (5000,50);
	
	//Taille par défaut du component
	public static Dimension componentPreferredSize = new Dimension (500,500);

}