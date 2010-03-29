package adl.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import adl.AdlPackage;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.part.MindDiagramUpdater;
import adl.diagram.part.MindNodeDescriptor;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class PrimitiveAnonymousSubComponentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = MindDiagramUpdater
				.getPrimitiveAnonymousSubComponent_3014SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((MindNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = MindVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case InterfaceDefinitionEditPart.VISUAL_ID:
		case AttributeDefinitionEditPart.VISUAL_ID:
		case AnnotationsListEditPart.VISUAL_ID:
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(AdlPackage.eINSTANCE
					.getArchitectureDefinition_Elements());
			myFeaturesToSynchronize.add(AdlPackage.eINSTANCE
					.getPrimitiveAnonymousSubComponent_ReferenceDefinition());
		}
		return myFeaturesToSynchronize;
	}

}