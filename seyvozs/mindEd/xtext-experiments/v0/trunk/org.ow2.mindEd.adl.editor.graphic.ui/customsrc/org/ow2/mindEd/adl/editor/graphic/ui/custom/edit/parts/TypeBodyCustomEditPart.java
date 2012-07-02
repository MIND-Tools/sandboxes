package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindBodyProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.TypeBodyEditPart;

public class TypeBodyCustomEditPart extends TypeBodyEditPart {

	public TypeBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(getMindProxy().addChildVisual(childEditPart, index))
			return;
		super.addChildVisual(childEditPart, index);
	}
	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (getMindProxy().removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
	
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		IFigure fig = ((MindBodyProxy)getMindProxy()).getContentPaneFor(editPart);
		if (fig != null)
			return fig;
		else
			return super.getContentPaneFor(editPart);
	}
	
}
