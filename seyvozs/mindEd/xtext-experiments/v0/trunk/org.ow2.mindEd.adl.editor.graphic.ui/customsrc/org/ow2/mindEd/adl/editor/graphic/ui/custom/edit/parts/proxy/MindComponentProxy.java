package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.ComponentLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.CustomDragEditPartsTracker;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.*;

public class MindComponentProxy extends MindProxy {

	/**
	 * The edit part if it is a BorderedShapeEditPart
	 * May be null.
	 */
	AbstractBorderedShapeEditPart borderedEditPart;
	
	public MindComponentProxy (GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPONENT);
		if (editPart instanceof AbstractBorderedShapeEditPart)
			borderedEditPart = (AbstractBorderedShapeEditPart) editPart;
	}
	
	public MindComponentProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
		if (editPart instanceof AbstractBorderedShapeEditPart)
			borderedEditPart = (AbstractBorderedShapeEditPart) editPart;
	}
	
	@Override
	public void createDefaultEditPolicies(){
		super.createDefaultEditPolicies();
		
		editPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		
		editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ComponentLayoutEditPolicy());
		
	};
	
	
	public DragTracker getDragTracker(Request request) {
		return new CustomDragEditPartsTracker(editPart);
	}
	
	
	/**
	 * Call this instead of generated setupContentPane to implement our custom layout
	 * @param nodeShape
	 * @return
	 */
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// Custom Layout
			ComponentLayout layout = new ComponentLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean removeFixedChild(EditPart childEditPart) {
		if (getMindType(childEditPart) == TYPE_BODY) {
			if (!MindProxyFactory.INSTANCE.getMindProxyFor((GraphicalEditPart)childEditPart).isMerged()) {
				// Remove interfaces' figures from border
	        	List<IFigure> borderItems = borderedEditPart.getBorderedFigure().getBorderItemContainer().getChildren();
	        	Iterator<IFigure> iter = borderItems.listIterator();
	        	while (iter.hasNext()) {
	        		iter.next();
	        		iter.remove();
	        	}
			}
			// continue remove
			return false;
		}
		return false;
	}
	
	/**
	 * Call this for compartment edit parts instead of generated setupContentPane, to keep
	 * the default layout but without the annoying 5 pixels spacing
	 * @param body
	 * @return
	 */
	public IFigure setupCompartment(IFigure compartment) {
		if (compartment.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout() ;
			compartment.setLayoutManager(layout);
		}
		return compartment; // use compartment itself as contentPane
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
	
	public int getComponentType() {
		if (editPart instanceof CompositeComponentDefinitionEditPart)
			return COMPONENT_COMPOSITE;
		if (editPart instanceof CompositeSubComponentEditPart)
			return COMPONENT_SUB_COMPOSITE;
		if (editPart instanceof PrimitiveComponentDefinitionEditPart)
			return COMPONENT_PRIMITIVE;
		if (editPart instanceof PrimitiveSubComponentEditPart)
			return COMPONENT_SUB_PRIMITIVE;
		if (editPart instanceof UndefinedSubComponentEditPart)
			return COMPONENT_SUB_UNDEFINED;
		if (editPart instanceof ComponentTypeDefinitionEditPart)
			return COMPONENT_TYPE;
		return COMPONENT_UNDEFINED;
	}
	
	
	public Color getMindBorderColor() {
		// Color from the extension point
		Color extColor = super.getMindBorderColor();
		if ( extColor != null)
			return extColor;
		// Normal color
		switch(getComponentType()) {
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
		switch(getComponentType()) {
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
	
	public Dimension getMindPreferredSize() {
		switch(getComponentType()) {
		case COMPONENT_COMPOSITE:
		case COMPONENT_PRIMITIVE:
		case COMPONENT_TYPE:
			return new Dimension(500,500);
		case COMPONENT_SUB_COMPOSITE:
		case COMPONENT_SUB_PRIMITIVE:
		case COMPONENT_SUB_UNDEFINED:
			return new Dimension(200,200);
		default :
			return super.getMindPreferredSize();	
		}
	}
	
	@Override
	public void activate() {
		super.activate();
		editPart.refresh();
	}
	
}
