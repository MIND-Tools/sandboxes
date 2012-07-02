package org.ow2.mindEd.adl.editor.graphic.ui.custom.providers;

import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.MindDecorator;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditor;

public class AnnotationIconsProvider extends AbstractProvider implements
IDecoratorProvider {

	@Override
	public boolean provides(IOperation operation) {
		if (!(operation instanceof CreateDecoratorsOperation)) {
			return false;
		}
		IDecoratorTarget decoratorTarget = ((CreateDecoratorsOperation) operation)
				.getDecoratorTarget();
		View view = (View) decoratorTarget.getAdapter(View.class);
		return view != null
				&& org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AdlDefinitionEditPart.MODEL_ID
						.equals(org.ow2.mindEd.adl.editor.graphic.ui.part.MindVisualIDRegistry
								.getModelID(view));
	}

	@Override
	public void createDecorators(IDecoratorTarget decoratorTarget) {
		EditPart editPart = (EditPart) decoratorTarget.getAdapter(EditPart.class);
		if (editPart instanceof GraphicalEditPart
				|| editPart instanceof AbstractConnectionEditPart) {
			Object model = editPart.getModel();
			if ((model instanceof View)) {
				View view = (View) model;
				if (!(view instanceof Edge) && !view.isSetElement()) {
					return;
				}
			}
			EditDomain ed = editPart.getViewer().getEditDomain();
			if (!(ed instanceof DiagramEditDomain)) {
				return;
			}
			
			if (((DiagramEditDomain) ed).getEditorPart() instanceof MindDiagramEditor) {
				decoratorTarget.installDecorator("ANNOTATION_EXTENSION",
			  			new MindDecorator(decoratorTarget));
			}
		}
	}
	

}
