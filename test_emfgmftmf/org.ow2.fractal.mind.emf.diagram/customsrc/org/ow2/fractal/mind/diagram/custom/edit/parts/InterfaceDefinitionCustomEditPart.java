package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DecorationNodeImpl;
import org.ow2.fractal.mind.diagram.custom.edit.policies.InterfaceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.figures.InterfaceDefinitionShape;
import adl.InterfaceDefinition;
import adl.Role;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionNameEditPart;


/**
* Description :
* This class extends InterfaceDefinitionEditPart to implement custom interfaces' 
* graphical behavior. Implemented functionnalities are :
* - Change figure color and position depending on Role value (serve ror client)
* - <to fill>
* 
* In the way to use this class and functionnalities, GMF generated code must
* be modified. In class adl.diagram.edit.parts.MindEditPartFactory.java, modify
* calls to InterfaceDefinitionEditPart with this class.
* 
* @author RPU
* @date 13/07/2009
* @Version 
*
*/


public class InterfaceDefinitionCustomEditPart extends
		InterfaceDefinitionEditPart {

	public InterfaceDefinitionCustomEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InterfaceDefinitionCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());		
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
	
	private InterfaceDefinitionShape interfaceDefinitionShape; 
	
	/**
	* Description :
	* F4E adapted function. Allows to initialize Figure depending 
	* on Role value by setting up the property role of 
	* InterfaceDefinitionShape class.
	*
	* Inputs :
	* Outputs :
	* - figure:NodeFigure – interface figure object.
	*
	* @author RPU
	* @date 13/07/2009
	* @Version 
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		interfaceDefinitionShape = (InterfaceDefinitionShape)createNodeShape();
		if(((View)getModel()).getElement() != null && ((View)getModel()).getElement() instanceof InterfaceDefinition){
			InterfaceDefinition interface_ = (InterfaceDefinition)((View)getModel()).getElement();
			if(interface_.getRole() == Role.PROVIDES){
				interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.PROVIDES);
			}
			else
			{
				interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.REQUIRES);
			}
		}
		figure.add(interfaceDefinitionShape);
		contentPane = setupContentPane(interfaceDefinitionShape);
		return figure;
	}

	/**
	* Description :
	* F4E adapted function. Allows to catch event notification when
	* role is modified on GMF eCore instance and so modify interface figure 
	* according to Role value. 
	*
	* Inputs :
	* - notification:Notification - EMF notification information object
	* Outputs :
	*
	* @author RPU
	* @date 13/07/2009
	* @Version 
	*/
	
	protected void handleNotificationEvent(Notification notification) {
		if(notification.getEventType() == Notification.SET 
				&& notification.getNotifier() instanceof InterfaceDefinition
				&& notification.getFeature() instanceof EAttribute 
				&& ((EAttribute)notification.getFeature()).getName().equals("role")){
			if(notification.getNewValue() instanceof Role && 
				((Role)notification.getNewValue()).equals(Role.PROVIDES) &&
				notification.getOldValue() instanceof Role && 
				((Role)notification.getOldValue()).equals(Role.REQUIRES)){
				if(interfaceDefinitionShape != null){
					interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.PROVIDES);
					interfaceDefinitionShape.revalidate();
					interfaceDefinitionShape.repaint();
				}
			}else if(notification.getNewValue() instanceof Role && 
					((Role)notification.getNewValue()).equals(Role.REQUIRES) &&
					notification.getOldValue() instanceof Role && 
					((Role)notification.getOldValue()).equals(Role.PROVIDES)){
				if(interfaceDefinitionShape != null){
					interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.REQUIRES);
					interfaceDefinitionShape.revalidate();
					interfaceDefinitionShape.repaint();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
	
}
