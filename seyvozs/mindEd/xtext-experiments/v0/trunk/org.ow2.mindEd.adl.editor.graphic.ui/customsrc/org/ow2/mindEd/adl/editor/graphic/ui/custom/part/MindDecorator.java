package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers.MindExtensionHelper;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.ide.ui.Activator;

public class MindDecorator implements IDecorator {

	private IDecoratorTarget target;
	private EditPart editPart;
	private IDecoration decoration = null;
	private EObject semanticElement;
	
	public MindDecorator(IDecoratorTarget decoratorTarget) {
		target = decoratorTarget;
		editPart = (EditPart) decoratorTarget.getAdapter(EditPart.class);
		semanticElement = ((View) editPart.getModel()).getElement();
	}

	@Override
	public void activate() {
		URL icon = MindExtensionHelper.getExtensionIconURL(semanticElement);
		if (icon == null)
			return;

		Image image = null;
		try {
			ImageDescriptor desc = Activator.getImageDescriptorURI(icon);
			image = desc.createImage();
		}catch (Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Annotation extension icon not found", e);
		}
		if (image == null)
			return;
		
		if (editPart instanceof GraphicalEditPart) {
			if (decoration != null)
				deactivate();
			decoration = target.addShapeDecoration(image, Direction.NORTH_EAST, -5, false);
		}
		if (editPart instanceof ConnectionEditPart) {
			if (decoration != null)
				deactivate();
			decoration = target.addConnectionDecoration(image, 50, false);
		}
	}

	@Override
	public void deactivate() {
		if (decoration != null) {
			target.removeDecoration(decoration);
			decoration = null;
		}
	}

	@Override
	public void refresh() {
		deactivate();
		activate();
	}

}
