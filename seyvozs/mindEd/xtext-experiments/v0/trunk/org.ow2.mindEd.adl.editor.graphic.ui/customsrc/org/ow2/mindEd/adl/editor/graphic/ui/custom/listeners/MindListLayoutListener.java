package org.ow2.mindEd.adl.editor.graphic.ui.custom.listeners;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindListProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AdlDefinitionEditPart;

public class MindListLayoutListener implements LayoutListener {
	
	GraphicalEditPart owner;

	public MindListLayoutListener(GraphicalEditPart part) {
		owner = part;
	}
	
	@Override
	public void invalidate(IFigure container) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean layout(IFigure container) {
		return false;
	}
	
	@Override
	public void postLayout(IFigure container) {
		owner.getContentPane().getLayoutManager().layout(owner.getContentPane());
		owner.refresh();
		if (getParentList() != null)
			getParentList().refresh();
	}
	
	public GraphicalEditPart getParentList() {
		EditPart parentList = owner;
		while (!(MindProxyFactory.INSTANCE.getMindProxyFor(parentList) instanceof MindListProxy)) {
			parentList = parentList.getParent();
			if (parentList == null || parentList instanceof AdlDefinitionEditPart)
				return null;
		}
		if (parentList instanceof GraphicalEditPart)
			return (GraphicalEditPart) parentList;
		return null;
	}

	@Override
	public void remove(IFigure child) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setConstraint(IFigure child, Object constraint) {
		// TODO Auto-generated method stub

	}

}
