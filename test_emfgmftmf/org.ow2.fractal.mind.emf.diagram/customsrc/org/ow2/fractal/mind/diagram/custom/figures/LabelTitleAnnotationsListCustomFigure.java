package org.ow2.fractal.mind.diagram.custom.figures;


import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * This class is the title label for the ReferencesList
 * @author Olivier Marot
 *
 */
public class LabelTitleAnnotationsListCustomFigure extends
AbstractComponentNameWrappingLabel {
	
	protected static Dimension PREFERRED_SIZE = new Dimension(5000,20);
	protected static Dimension MAXIMUM_SIZE = new Dimension(5000,20);
	protected static Color BACKGROUND_COLOR = LIGHT_BLUE;
	protected static Color BORDER_COLOR = BLUE;
	protected static Color FOREGROUND_COLOR = LIGHT_BLUE;
	
	public LabelTitleAnnotationsListCustomFigure() {
		super();
		//set title
		this.setText(" Annotations");
		//set size
		setPreferredSize(PREFERRED_SIZE);
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		setForegroundColor(FOREGROUND_COLOR);
		//add border
		createBorder();
		
		setEditable(false);
		
	}

	private void createBorder() {
		ComponentBorder border = new ComponentBorder();
		border.setColor(BORDER_COLOR);
		setBorder(border);
	}
}

