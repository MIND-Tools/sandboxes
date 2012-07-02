package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindBindingProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.BindingDefinitionEditPart;

/**
 * Bindings between interfaces
 * @author maroto
 *
 */
public class BindingDefinitionCustomEditPart extends BindingDefinitionEditPart {

	protected MindBindingProxy mindProxy = MindProxyFactory.INSTANCE.createMindProxy (this, VISUAL_ID);
	
	public BindingDefinitionCustomEditPart(View view) {
		super(view);
	}
		
	
	@Override
	public void activateFigure() {
		super.activateFigure();
		mindProxy.activateFigure();
	}
	
	@Override
	protected Connection createConnectionFigure() {
		Connection figure = super.createConnectionFigure();
		return mindProxy.createConnectionFigure(figure);
	}
	
	
	@Override
	protected ConnectionAnchor getSourceConnectionAnchor() {
		return mindProxy.getSourceConnectionAnchor();
	}

	
	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		return mindProxy.getTargetConnectionAnchor();
	}
	
	@Override
	protected void installRouter() {
		if (!mindProxy.installRouter())
			super.installRouter();
	}
	
	
	
}
