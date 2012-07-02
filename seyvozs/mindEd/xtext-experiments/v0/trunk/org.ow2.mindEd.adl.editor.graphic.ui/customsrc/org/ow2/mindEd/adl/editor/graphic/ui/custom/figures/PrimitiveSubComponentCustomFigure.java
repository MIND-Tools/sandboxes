package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;

/**
* Description :
* Customizes the appearance of the figure
*
* @author AVE
* @date 20/08/2009
* @Version 
* **/
public class PrimitiveSubComponentCustomFigure extends
							AbstractComponentShape {
	
	//Couleur de fond du component
	public static Color bodyAreaColor = LIGHT_ORANGE;

	//Couleur de la bordure
	public static Color borderColor = ORANGE;
	
	//Taille maximum du label
	public static Dimension nameLabelMaxSize = new Dimension (500000,50);

	//Taille par défaut du component
	public static Dimension componentPreferredSize = new Dimension (200,200);

}