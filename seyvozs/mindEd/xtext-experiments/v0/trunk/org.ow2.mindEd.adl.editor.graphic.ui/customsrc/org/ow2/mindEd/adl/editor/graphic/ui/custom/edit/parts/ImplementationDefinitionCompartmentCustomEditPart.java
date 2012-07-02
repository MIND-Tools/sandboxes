package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.ImplementationDefinitionCompartmentEditPart;

public class ImplementationDefinitionCompartmentCustomEditPart extends
		ImplementationDefinitionCompartmentEditPart {

	public ImplementationDefinitionCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		getMindProxy().createDefaultEditPolicies();
	}

}
