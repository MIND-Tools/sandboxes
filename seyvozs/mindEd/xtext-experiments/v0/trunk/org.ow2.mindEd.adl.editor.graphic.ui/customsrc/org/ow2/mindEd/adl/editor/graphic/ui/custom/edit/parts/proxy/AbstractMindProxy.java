package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers.MindExtensionHelper;

public abstract class AbstractMindProxy implements IMindTypes {
	
	protected int visualID;
	protected EditPart editPart;
	public int mindType = TYPE_UNDEFINED;
	
	public AbstractMindProxy(EditPart realEditPart, int vID) {
		if (realEditPart == null) throw new NullPointerException();
		editPart = realEditPart;
		visualID = vID;
	}
	
	public AbstractMindProxy(EditPart realEditPart, int vID, int type) {
		if (realEditPart == null) throw new NullPointerException();
		editPart = realEditPart;
		visualID = vID;
		mindType = type;
	}
	
	/**
	 * @param visualID the visualID of the element
	 * @return the type of the element
	 */
	public static int getMindType(int visualID) {
		return MindProxyFactory.getMindType(visualID);
	}
	
	/**
	 * @return the type of this proxy
	 */
	public int getMindType() {
		return mindType;
	}	
	
	/**
	 * @return the editpart associated with this proxy
	 */
	public EditPart getEditPart() {
		return editPart;
	}
	
	/**
	 * 
	 * @return the EObject associated with the editpart of this proxy
	 */
	public EObject resolveSemanticElement() {
		return ((View) getEditPart().getModel()).getElement();
	}

	
	public static AbstractMindProxy getAbstractMindProxyFor(EditPart editPart) {
		return MindProxyFactory.INSTANCE.getAbstractMindProxyFor(editPart);
	}
	
	public static MindProxy getMindProxyFor(GraphicalEditPart editPart) {
		return MindProxyFactory.INSTANCE.getMindProxyFor(editPart);
	}
	
	public static MindBindingProxy getMindProxyFor(ConnectionEditPart editPart) {
		return MindProxyFactory.INSTANCE.getMindProxyFor(editPart);
	}
	
	/**
	 * Should be removed
	 * @param editPart
	 * @return the MindProxy associated to editPart if it is a GraphicalEditPart
	 * @throws IllegalArgumentException if editPart is not a GraphicalEditPart
	 */
	@Deprecated
	public static MindProxy getMindProxyFor(EditPart editPart) {
		if (editPart instanceof GraphicalEditPart)
			return getMindProxyFor((GraphicalEditPart)editPart);
		else
			throw new IllegalArgumentException();
	}
	
	public Color getAnnotationExtensionColor() {
		return MindExtensionHelper.getAnnotationExtensionColor(resolveSemanticElement());
	}
	
	public Color getAnnotationExtensionColorLight() {
		return MindExtensionHelper.getAnnotationExtensionColorLight(resolveSemanticElement());
	}
	
}
