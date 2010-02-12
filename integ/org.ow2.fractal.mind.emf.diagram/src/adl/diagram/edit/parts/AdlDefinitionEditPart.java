package adl.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.policies.AdlDefinitionCanonicalEditPolicy;
import adl.diagram.edit.policies.AdlDefinitionItemSemanticEditPolicy;

/**
 * @generated
 */
public class AdlDefinitionEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Mind"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public AdlDefinitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AdlDefinitionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AdlDefinitionCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
