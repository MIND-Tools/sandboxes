package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.beans.EventHandler;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.RectilinearRouter;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.ow2.fractal.mind.diagram.custom.figures.BindingCustomFigure;
import org.ow2.fractal.mind.diagram.custom.layouts.BindingConnectionCustomAnchorSource;
import org.ow2.fractal.mind.diagram.custom.layouts.BindingConnectionCustomAnchorTarget;

import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.impl.CompositeComponentDefinitionImpl;

public class BindingDefinitionCustomEditPart extends BindingDefinitionEditPart {

	public BindingDefinitionCustomEditPart(View view) {
		super(view);
		
	}
	/**
	 * Create a rectilinear binding with avoid obstruction algorithm
	 * This is just the default behavior
	 */
	@Override
	protected Connection createConnectionFigure() {
		BindingCustomFigure figure = new BindingCustomFigure();
		return figure;
	}
		
	@Override
	public void activateFigure() {
		RoutingStyle style = (RoutingStyle) ((View) getModel())
	     .getStyle(NotationPackage.Literals.ROUTING_STYLE);
		
				
		// set routing command
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getEditingDomain(), "setRouting");
		
		// set router to rectilinear
		SetCommand setRoutingCmd = new SetCommand(
				getEditingDomain(), style,
				style.eClass().getEStructuralFeature(NotationPackage.CONNECTOR__ROUTING),
				Routing.RECTILINEAR_LITERAL);
		EMFCommandOperation setRoutingOperation = new EMFCommandOperation(getEditingDomain(),setRoutingCmd);
		cc.add(setRoutingOperation);
		
		// setRoundedBendpointsRadius
		SetCommand setRadiusCmd = new SetCommand(
				getEditingDomain(), style,
				style.eClass().getEStructuralFeature(NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS),
				((BindingCustomFigure) getFigure()).getRoundedBendpointsRadius());		
		EMFCommandOperation setRadiusOperation = new EMFCommandOperation(getEditingDomain(),setRadiusCmd);
		cc.add(setRadiusOperation);

		ICommandProxy finalCmd = new ICommandProxy(cc);
		
		try {
			finalCmd.execute();
		}
		catch (Exception e) {
			// TODO error handling
		}
		super.activateFigure();
	}
	
	
	/**
	 * Custom anchor source to bind the binding on the image
	 */
	@Override
	protected ConnectionAnchor getSourceConnectionAnchor() {
		return new BindingConnectionCustomAnchorSource(this);
	}

	/**
	 * Custom anchor target to bind the binding on the image
	 */
	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		return new BindingConnectionCustomAnchorTarget(this);
	}
	
}
