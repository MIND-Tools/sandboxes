package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
 * @author Olivier Marot
 *
 */
public class ComponentTypeDefinitionCustomFigure extends
		AbstractComponentShape {

	//Couleur de la bordure
	protected static Color borderColor = GREY;
	
	//Couleur du body
	protected static Color bodyAreaColor = LIGHT_GREY;
	
	//Taille maximum du label
	protected static Dimension nameLabelMaxSize = new Dimension (5000,50);;
	
	//Taille par défaut
	protected static Dimension componentPreferredSize = new Dimension (200,200);
	
}
