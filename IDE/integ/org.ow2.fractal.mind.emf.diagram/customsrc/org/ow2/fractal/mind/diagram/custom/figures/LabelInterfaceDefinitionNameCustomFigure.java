package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class LabelInterfaceDefinitionNameCustomFigure extends WrappingLabel {
	
	public LabelInterfaceDefinitionNameCustomFigure() {
		super();
		setText("<...>");
		setOpaque(false);
	}

}
