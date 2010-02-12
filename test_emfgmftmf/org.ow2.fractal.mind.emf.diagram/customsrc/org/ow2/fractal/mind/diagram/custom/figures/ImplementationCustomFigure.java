package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

public class ImplementationCustomFigure extends ContainerShape {

	//Background color of the component
	public static Color bodyAreaBackgroundColor = LIGHT_GREEN;

	//Foreground color of the component
	public static Color bodyAreaForegroundColor = LIGHT_GREEN;
	
	// Taille maximum du label
	public static Dimension nameLabelMaxSize = new Dimension (5000,50);

	
	// Taille par défaut du component
	public static Dimension componentPreferredSize = new Dimension (100,100);
	
	public static Color BORDER_COLOR = GRAY;

}
