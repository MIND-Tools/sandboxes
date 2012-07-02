package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.InterfaceDefinition;

/**
 * 
 * @author Yann Davin
 *
 */
public class InterfaceBorderItemSelectionCustomEditPolicy extends BorderItemSelectionEditPolicy{
	
	protected Command getMoveCommand(ChangeBoundsRequest request) {
		IBorderItemEditPart borderItemEP = (IBorderItemEditPart) getHost();
		IBorderItemLocator borderItemLocator = borderItemEP.getBorderItemLocator();
		request.setConstrainedMove(true);
			
			if (borderItemLocator != null) {
				PrecisionRectangle rect = new PrecisionRectangle(
					getInitialFeedbackBounds().getCopy());
				getHostFigure().translateToAbsolute(rect);
				rect.translate(request.getMoveDelta());
				rect.resize(request.getSizeDelta());

				getHostFigure().translateToRelative(rect);
				Rectangle realLocation = borderItemLocator.getValidLocation(rect
					.getCopy(), borderItemEP.getFigure());

				Point parentOrigin = borderItemEP.getFigure().getParent().getBounds().getTopLeft();
				Dimension d = realLocation.getTopLeft().getDifference(parentOrigin);
				Point location = new Point(borderItemEP.getFigure().getBounds().x, d.height);
				
				
				if(((View)borderItemEP.getModel()).getElement() instanceof InterfaceDefinition){
						ICommand moveCommand = new SetBoundsCommand(borderItemEP.getEditingDomain(),
								DiagramUIMessages.Commands_MoveElement, new EObjectAdapter(
										(View) getHost().getModel()), location);
						return new ICommandProxy(moveCommand);
				}
			}
			return null;

	}

}
