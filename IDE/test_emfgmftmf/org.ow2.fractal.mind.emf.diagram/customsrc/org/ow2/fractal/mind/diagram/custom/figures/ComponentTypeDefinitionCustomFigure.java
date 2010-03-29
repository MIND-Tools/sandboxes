package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart.ComponentTypeDefinitionFigure;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
 * @author Olivier Marot
 *
 */
public class ComponentTypeDefinitionCustomFigure extends
		AbstractComponentShape {

	//Couleur de la bordure
	protected static Color BORDER_COLOR = GRAY;
	
	//Couleur du body
	protected static Color BODY_COLOR = LIGHT_GRAY;
	
	//Taille maximum du label
	protected static Dimension LABEL_MAX_SIZE = new Dimension (5000,50);;
	
	//Taille par défaut
	protected static Dimension PREFERRED_SIZE = new Dimension (200,200);
	
}
