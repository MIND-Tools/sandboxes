package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.AnnotationCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class AnnotationsListCompartmentAnnotationsAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AnnotationsListCompartmentAnnotationsAreaItemSemanticEditPolicy() {
		super(MindElementTypes.AnnotationsList_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.Annotation_3011 == req.getElementType()) {
			return getGEFWrapper(new AnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
