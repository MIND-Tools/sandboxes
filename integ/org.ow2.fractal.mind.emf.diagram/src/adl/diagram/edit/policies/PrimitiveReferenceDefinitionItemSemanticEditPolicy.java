package adl.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.commands.ArgumentDefinition2CreateCommand;
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.part.MindVisualIDRegistry;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class PrimitiveReferenceDefinitionItemSemanticEditPolicy extends
		MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimitiveReferenceDefinitionItemSemanticEditPolicy() {
		super(MindElementTypes.PrimitiveReferenceDefinition_3043);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.ArgumentDefinition_3022 == req.getElementType()) {
			return getGEFWrapper(new ArgumentDefinition2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (MindVisualIDRegistry.getVisualID(node)) {
			case ArgumentDefinition2EditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (MindVisualIDRegistry.getVisualID(cnode)) {
					}
				}
				break;
			}
		}
	}

}
