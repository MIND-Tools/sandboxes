package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeSubComponentEditPart;

/**
 * Extends CompositeSubComponentEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class CompositeSubComponentCustomEditPart extends
	CompositeSubComponentEditPart {

	

	public CompositeSubComponentCustomEditPart(View view) {
		super(view);
	}
	

	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (getMindProxy().removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
	
	
	@Override
	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		CanonicalEditPolicy ep = (CanonicalEditPolicy) getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		if (ep != null);
			ep.refresh();
	}
	
	
	@Override
	protected void removeChild(EditPart child) {
		super.removeChild(child);
		CanonicalEditPolicy ep = (CanonicalEditPolicy) getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		if (ep != null);
			ep.refresh();
	}
	
	
	
}
