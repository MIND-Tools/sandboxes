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
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.part.MindDiagramUpdater;
import adl.diagram.part.MindNodeDescriptor;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class PrimitiveReferenceDefinitionCanonicalEditPolicy extends
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
				.getPrimitiveReferenceDefinition_3043SemanticChildren(
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
		case ArgumentDefinition2EditPart.VISUAL_ID:
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
					.getPrimitiveReferenceDefinition_ArgumentsList());
		}
		return myFeaturesToSynchronize;
	}

}
