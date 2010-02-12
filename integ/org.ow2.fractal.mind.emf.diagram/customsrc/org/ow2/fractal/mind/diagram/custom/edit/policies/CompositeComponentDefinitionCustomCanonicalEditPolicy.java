package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.helpers.CanonicalEditPolicyHelper;

import adl.diagram.edit.policies.CompositeComponentDefinitionCanonicalEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;

public class CompositeComponentDefinitionCustomCanonicalEditPolicy extends
		CompositeComponentDefinitionCanonicalEditPolicy {

	@Override
	protected String getDefaultFactoryHint() {
		return CanonicalEditPolicyHelper.getDefaultFactoryHint(this);
	}
	
	@Override
	protected String getFactoryHint(IAdaptable elementAdapter) {
		CanonicalElementAdapter element = (CanonicalElementAdapter) elementAdapter;
		int VID = MindVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), (EObject)element.getRealObject());
		return MindVisualIDRegistry.getType(VID);
	}
	
}
