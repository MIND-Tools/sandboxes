package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Polyline;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.jface.preference.IPreferenceStore;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorSource;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorTarget;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.preferences.CustomGeneralPreferencePage;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public class MindBindingProxy extends AbstractMindProxy {
		
	public MindBindingProxy(ConnectionEditPart realEditPart, int vID) {
		super(realEditPart, vID);
	}
	
	public ConnectionEditPart getConnectionEditPart() {
		if (editPart instanceof ConnectionEditPart)
			return (ConnectionEditPart) editPart;
		else
			throw new IllegalArgumentException();
	}
	
	public Connection createConnectionFigure(Connection figure) {
		
		IPreferenceStore store = MindDiagramEditorPlugin.getInstance().getPreferenceStore();
		int width = store.getInt(CustomGeneralPreferencePage.PREF_LINE_WIDTH);
		
		if (figure instanceof Polyline) {
			((Polyline) figure).setLineWidth(width);
		}
		return figure;
	}
	

	
	/**
	 * Custom anchor source to bind the binding on the image instead of the label
	 */
	public ConnectionAnchor getSourceConnectionAnchor() {
		return new BindingConnectionCustomAnchorSource(getConnectionEditPart());
	}

	/**
	 * Custom anchor target to bind the binding on the image instead of the label
	 */
	public ConnectionAnchor getTargetConnectionAnchor() {
		return new BindingConnectionCustomAnchorTarget(getConnectionEditPart());
	}

	public void activateFigure() {
		
	}

	public boolean installRouter() {
		return false;
	}
	

}
