package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gef.requests.TargetRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveAnonymousSubComponentBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveAnonymousSubComponentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;

import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart;

public class CompartmentPrimitiveAnonymousSubComponentBodyCustomEditPart extends
		PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart {

	public CompartmentPrimitiveAnonymousSubComponentBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentPrimitiveAnonymousSubComponentCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentPrimitiveAnonymousSubComponentBodyCustomCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}
	
}
