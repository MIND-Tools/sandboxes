package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.swt.graphics.Color;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ParentCreationEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.InterfaceBorderItemLocator;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.NoDragTracker;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.InterfaceDefinitionEditPart;

public class MindBodyProxy extends MindProxy {
	
	protected MindComponentProxy parentComponent;

	public MindBodyProxy(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_BODY);
		setParentComponent();
	}
	
	public MindBodyProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
		setParentComponent();
	}
	
	protected void setParentComponent() {
		MindProxy parent = getMindProxyFor((GraphicalEditPart) editPart.getParent());
		if (parent instanceof MindComponentProxy)
			parentComponent = (MindComponentProxy) parent;
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		editPart.installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new ParentCreationEditPolicy());
		setCreationMode(CREATION_MODE_PARENT);
		editPart.removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		editPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return new NoDragTracker(editPart);
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		if (getMindProxyFor((GraphicalEditPart) childEditPart) instanceof MindCompartmentProxy) {
			IFigure compartment = getCompartmentFigure();
			if (compartment == null) return false;
			// Set the layout
			setupContentPane(compartment);
			compartment.add(((GraphicalEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if(getMindProxyFor((GraphicalEditPart) childEditPart) instanceof MindInterfaceProxy)
		{
			//Make interfaces stick to the component's border
			//Use InterfaceBorderItemLocator
			if (getParentComponent() == null) return false;
			AbstractBorderedShapeEditPart parentBorderedEditPart = parentComponent.borderedEditPart;
			if (parentBorderedEditPart == null) return false;
			InterfaceBorderItemLocator locator = new InterfaceBorderItemLocator(
					parentBorderedEditPart.getMainFigure());
			parentBorderedEditPart.getBorderedFigure().getBorderItemContainer().add(
					((InterfaceDefinitionEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}
	
	
	public boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InterfaceDefinitionEditPart) {
			if (getParentComponent() == null) return false;
			AbstractBorderedShapeEditPart parentBorderedEditPart = parentComponent.borderedEditPart;
			if (parentBorderedEditPart == null) return false;
			parentBorderedEditPart.getBorderedFigure().getBorderItemContainer().remove(
					((InterfaceDefinitionEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}
	
	
	public IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof InterfaceDefinitionEditPart) {
			return parentComponent.borderedEditPart.getBorderedFigure().getBorderItemContainer();
		} else {
			return null;
		}
	}
	
	
	public IFigure getCompartmentFigure() {
		try {
			
			Method meth = editPart.getClass().getMethod("getPrimaryShape", (Class<?>[]) null);
			AbstractComponentShape result = (AbstractComponentShape) meth.invoke(editPart, (Object[]) null);
			return result.getCompartment();
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
	
	/**
	 * Call this for compartment edit parts instead of generated setupContentPane, to keep
	 * the default layout but without the annoying 5 pixels spacing
	 * @param body
	 * @return
	 */
	public IFigure setupContentPane(IFigure compartment) {
		if (compartment.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout() ;
			compartment.setLayoutManager(layout);
		}
		return compartment; // use compartment itself as contentPane
	}
	
	public MindComponentProxy getParentComponent() {
		if (parentComponent == null) {
			MindProxy parent = getMindProxyFor((GraphicalEditPart) editPart.getParent());
			if (parent instanceof MindComponentProxy)
				parentComponent = (MindComponentProxy) parent;
		}
		return parentComponent;
	}

	public Color getMindBorderColor() {
		// Color from the extension point
		Color extColor = super.getMindBorderColor();
		if ( extColor != null)
			return extColor;
		// Normal color
		if (getParentComponent() == null)
			return IFractalShape.GREY;
		switch(getParentComponent().getComponentType()) {
		case COMPONENT_COMPOSITE:
			return IFractalShape.BLUE;
		case COMPONENT_SUB_COMPOSITE:
			return IFractalShape.PURPLE;
		case COMPONENT_PRIMITIVE:
			return IFractalShape.RED;
		case COMPONENT_SUB_PRIMITIVE:
			return IFractalShape.ORANGE;
		case COMPONENT_TYPE:
			return IFractalShape.GREY;
		}
		return IFractalShape.GREY;
	}
	
	public Color getMindBackgroundColor() {
		// Color from the extension point
		Color extColor = super.getMindBackgroundColor();
		if ( extColor != null)
			return extColor;
		// Normal color
		if (getParentComponent() == null)
			return IFractalShape.GREY;
		switch(getParentComponent().getComponentType()) {
		case COMPONENT_COMPOSITE:
			return IFractalShape.LIGHT_BLUE;
		case COMPONENT_SUB_COMPOSITE:
			return IFractalShape.LIGHT_PURPLE;
		case COMPONENT_PRIMITIVE:
			return IFractalShape.LIGHT_RED;
		case COMPONENT_SUB_PRIMITIVE:
			return IFractalShape.LIGHT_ORANGE;
		case COMPONENT_TYPE:
			return IFractalShape.LIGHT_GREY;
		}
		return IFractalShape.LIGHT_GREY;
	}
	
}
