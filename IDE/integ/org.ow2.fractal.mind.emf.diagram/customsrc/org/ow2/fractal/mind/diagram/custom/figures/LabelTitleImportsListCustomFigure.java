package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * This class is the title label for the ImportsList
 * @author Olivier Marot
 *
 */
public class LabelTitleImportsListCustomFigure extends
		AbstractComponentNameWrappingLabel {
	
	protected static Dimension PREFERRED_SIZE = new Dimension(500000,20);
	protected static Dimension MAXIMUM_SIZE = new Dimension(500000,20);
	protected static Color BACKGROUND_COLOR = LIGHT_GRAY;
	protected static Color BORDER_COLOR = GRAY;
	protected static Color FOREGROUND_COLOR = LIGHT_GRAY;
	
	public LabelTitleImportsListCustomFigure() {
		super();
		this.setText(" Imports");
		setPreferredSize(PREFERRED_SIZE);
		setMaximumSize(MAXIMUM_SIZE);
		setBackgroundColor(BACKGROUND_COLOR);
		setForegroundColor(FOREGROUND_COLOR);
		createBorder();
		
		setEditable(false);
		
	}

	private void createBorder() {
		ComponentBorder border = new ComponentBorder();
		border.setColor(BORDER_COLOR);
		setBorder(border);
	}
}
