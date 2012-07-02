package org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;

import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.MergedObject;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.MergedComponentEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.MergedInterfaceSemanticEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.MergedItemSemanticEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentNameWrappingLabel;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.ComponentBorder;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.InterfaceDefinitionShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.ComponentLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.CustomDragEditPartsTracker;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.InterfaceDefinitionEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindVisualIDRegistry;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;

/**
 * Helper providing static methods for components
 * @author maroto
 *
 */
public class ComponentHelper implements IFractalShape {
	
	/**
	 * Helper to get merge attributes from domain model
	 * @param element
	 * @return true if element is merged and not overridden, false otherwise
	 */
	public static Boolean isMerged (GraphicalEditPart element) {
		// Get the model element
		View view = (View)element.getModel();
		if (view == null) return false;
		EObject model = view.getElement();
		if (model == null) return false;
		// Check the merged property
		if (model instanceof MergedObject && ((MergedObject)model).isMerged()
				&& !((MergedObject)model).isOverride()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Set the color of the component and all children to gray.
	 * Installs a semantic edit policy preventing from manual creation
	 * @param element the element to edit
	 */
	public static void handleMergedElement(GraphicalEditPart element) {
		
		MindProxy mindProxy = MindProxyFactory.INSTANCE.getMindProxyFor(element);
		if (mindProxy != null)
			mindProxy.setMerged(true);
		
		IFigure figure = element.getFigure();
		if (figure != null) {
			// Set the color to gray for the figure and the border
			handleMergedComponentFigure(figure);
		}
		
		// Prevent override
		// Get the model element
		View view = (View)element.getModel();
		if (view != null) {
			while (!(view instanceof ShapeImpl)) {
				view = (View) view.eContainer();
			}	
			int visualID = MindVisualIDRegistry.getVisualID(view);
			IElementType type = MindElementTypes.getElementType(visualID);
			
			// Replaced because the component can't be moved. Maybe it can be fixed ?
//			if (element instanceof GraphicalEditPart) {
//				((GraphicalEditPart)element).disableEditMode();
//			}
			// This edit policy does not allow create commands
			if (element instanceof InterfaceDefinitionEditPart) {
				element.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MergedInterfaceSemanticEditPolicy());
			} 
			else if (!(element instanceof Body)) {
				element.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MergedItemSemanticEditPolicy(type));
			}
			element.installEditPolicy(EditPolicy.COMPONENT_ROLE, new MergedComponentEditPolicy());
			
		}
		
		// Do it for children too
//		List<GraphicalEditPart> children = element.getChildren();
//		for (GraphicalEditPart child : children) {
//			if (isMerged(child)) {
//				handleMergedElement(child);
//			}
//		}
	}
	
	@SuppressWarnings("unchecked")
	public static void handleMergedComponentFigure(IFigure figure) {
		figure.setBackgroundColor(LIGHT_GREY);
		Border border = figure.getBorder();
		if (border != null) { 
			if (border instanceof ComponentBorder) {
				((ComponentBorder)border).setColor(GREY);
			}
		}
		
		// If the element is a component label, prevents it from being renamed
		if (figure instanceof AbstractComponentNameWrappingLabel) {
			((AbstractComponentNameWrappingLabel)figure).setEditable(false);
		}
		
		// If the element is an interface, prevents it from being renamed
		if (figure instanceof InterfaceDefinitionShape) {
			((InterfaceDefinitionShape)figure).setEditable(false);
		}
		
		// Do it for children too
		List<IFigure> children = figure.getChildren();
		for (IFigure child : children) {
			handleMergedComponentFigure(child);
		}
	}	
	
	
	/**
	 * Calls the layout() method of the layout for all the sub figures
	 * @param fig
	 */
	@SuppressWarnings("rawtypes")
	public static void layoutAllChildren(IFigure fig) {
		if (fig == null) return;
		LayoutManager manager = fig.getLayoutManager();
		if (manager != null) {
			manager.layout(fig);
		}
		List children = fig.getChildren();
		for (Iterator iterator = children.iterator(); iterator.hasNext();) {
			IFigure child = (IFigure) iterator.next();
			if (child != null) {
				layoutAllChildren(child);
			}
		}
	}
	
}
