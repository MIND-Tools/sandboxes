package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.TemplateSpecifiersListCompartmentEditPart;

public class TemplateSpecifiersListCompartmentCustomEditPart extends
		TemplateSpecifiersListCompartmentEditPart {
	
	public TemplateSpecifiersListCompartmentCustomEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		getMindProxy().createDefaultEditPolicies();
	}
	
	@Override
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
	
	public void refresh() {
		super.refresh();
		getMindProxy().refresh();
	}

	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		getParent().refresh();
	}
	
	
}
