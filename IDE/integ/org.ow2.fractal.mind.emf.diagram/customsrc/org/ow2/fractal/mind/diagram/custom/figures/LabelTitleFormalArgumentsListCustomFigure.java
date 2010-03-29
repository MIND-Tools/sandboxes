package org.ow2.fractal.mind.diagram.custom.figures;

import java.util.Iterator;

import javax.xml.bind.Marshaller.Listener;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model. 
 * This class is the title label for the FormalArgumentsList
 * @author Olivier Marot
 *
 */
public class LabelTitleFormalArgumentsListCustomFigure extends AbstractComponentNameWrappingLabel implements IFractalShape {

	protected static Dimension MAXIMUM_SIZE = new Dimension(5000,20);
	protected static Color BACKGROUND_COLOR = WHITE;
	protected static Color BORDER_COLOR = BROWN;
	
	public LabelTitleFormalArgumentsListCustomFigure() {
		super();
		//set the title
		this.setText(" Formal Arguments");
		//set the size
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		//add a border
		createBorder();
		
		setEditable(false);
		
	}

	private void createBorder() {
		ComponentBorder border = new ComponentBorder();
		border.setColor(BORDER_COLOR);
		setBorder(border);
	}
	
	


}
