package org.ow2.fractal.mind.diagram.custom.helpers;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.layouts.ComponentLayout;
import org.ow2.fractal.mind.diagram.custom.providers.DragEditPartsCustomTracker;

import adl.diagram.edit.helpers.MindBaseEditHelper;

public class ComponentHelper {
	
	public static IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// Custom Layout
			ComponentLayout layout = new ComponentLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	public static IFigure setupBody(IFigure body) {
		if (body.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout() ;
			body.setLayoutManager(layout);
		}
		return body; // use nodeShape itself as contentPane
	}
	
	public static DragTracker getDragTracker(EditPart ep) {
		return new DragEditPartsCustomTracker(ep);
	}
	
	
}
