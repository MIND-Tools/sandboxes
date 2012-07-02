package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeReferenceCompartmentEditPart;

/**
 * Area of a {@link CompositeReferenceCustomEditPart}
 * @author maroto
 *
 */
public class CompositeReferenceCompartmentCustomEditPart extends
		CompositeReferenceCompartmentEditPart {

	public CompositeReferenceCompartmentCustomEditPart(View view) {
		super(view);
	}
		
	@Override
	public void refresh() {
		super.refresh();
		getMindProxy().refresh();
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		getMindProxy().createDefaultEditPolicies();
	}
	
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = getMindProxy().getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}
	
	@Override
	public void activate() {
		super.activate();
		getMindProxy().activate();
	}
	
	@Override
	protected LayoutManager getLayoutManager() {
		LayoutManager layoutManager = getMindProxy().getLayoutManager();
		if (layoutManager == null) {
			layoutManager = super.getLayoutManager();
		}
		return layoutManager;
	}

}
