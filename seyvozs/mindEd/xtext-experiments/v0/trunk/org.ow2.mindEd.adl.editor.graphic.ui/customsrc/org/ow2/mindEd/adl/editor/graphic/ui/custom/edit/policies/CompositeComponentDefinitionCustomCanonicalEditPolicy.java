package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.CompositeComponentDefinitionCanonicalEditPolicy;

public class CompositeComponentDefinitionCustomCanonicalEditPolicy extends
		CompositeComponentDefinitionCanonicalEditPolicy {
	
	
	
	/**
	 * Deletes a list of views.  The views will be deleted if their semantic
	 * element has also been deleted.
	 * @param views an iterator on a list of views.
	 * @return <tt>true</tt> if the host editpart should be refreshed; either one one of the supplied
	 * views was deleted or has been reparented.
	 */
	protected boolean customDeleteViews( Iterator<View> views ) {
		if ( !isEnabled() ) {
			return false;
		}
		final CompoundCommand cc = new CompoundCommand(DiagramUIMessages.DeleteCommand_Label);
		while (views.hasNext()) {
			View view = (View)views.next();
			if ( shouldDeleteView(view) ) {
				cc.add(getDeleteViewCommand(view));
			}
			if (view.getElement() instanceof Body) {
				Command cmd = new Command("Delete interfaces figures") {
					@SuppressWarnings("unchecked")
					@Override
					public void execute() {
				        	IFigure borderItemContainer = ((AbstractBorderedShapeEditPart)getHost()).getBorderedFigure().getBorderItemContainer();
				        	List<IFigure> borderItems = borderItemContainer.getChildren();
				        	Iterator<IFigure> iter = borderItems.listIterator();
				        	while (iter.hasNext()) {
				        		iter.next();
				        		iter.remove();
				        	}
					}
		        };
		        cc.add(cmd);
			}
		} 
		
		boolean doDelete = !cc.isEmpty() && cc.canExecute();
		if ( doDelete ) {
			executeCommand(cc);
		}
		return doDelete;
	}
	
	
	
}
