package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
* @author AVE
* @date 20/08/2009
* @Version 
* **/
public class CompositeSubComponentCustomFigure extends
							AbstractComponentShape {
	
	public CompositeSubComponentCustomFigure() {
	}
		
	//Couleur de la bordure
	protected static Color borderColor = PURPLE;
	
	// Couleur de fond
	protected static Color bodyAreaColor = LIGHT_PURPLE;
		
	//Taille par défaut du component
	protected static Dimension componentPreferredSize = new Dimension (200,200);
	
	

}