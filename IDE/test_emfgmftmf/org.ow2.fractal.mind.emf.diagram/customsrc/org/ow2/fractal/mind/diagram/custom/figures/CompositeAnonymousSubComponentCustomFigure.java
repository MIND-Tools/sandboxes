package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
* @author AVE
* @date 20/08/2009
* @Version 
* **/
public class CompositeAnonymousSubComponentCustomFigure extends
							AbstractComponentShape {
	
	// Couleur de fond du component
	protected static Color bodyAreaColor = LIGHT_PURPLE;

	// Couleur de la bordure
	protected static Color borderColor = PURPLE;
	
	// Taille par défaut du component
	protected static Dimension componentPreferredSize = new Dimension (200,200);

}