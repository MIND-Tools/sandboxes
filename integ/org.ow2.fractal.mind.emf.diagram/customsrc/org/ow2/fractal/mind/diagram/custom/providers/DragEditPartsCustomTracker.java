package org.ow2.fractal.mind.diagram.custom.providers;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.tools.DragEditPartsTracker;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomReorientCommand;
import org.ow2.fractal.mind.diagram.custom.edit.parts.BindingDefinitionCustomEditPart;

import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.impl.BindingDefinitionImpl;
import adl.impl.InterfaceDefinitionImpl;

public class DragEditPartsCustomTracker extends DragEditPartsTrackerEx implements DragTracker {

	public DragEditPartsCustomTracker(EditPart sourceEditPart) {
		super(sourceEditPart);
	}
	
	@Override
	public void performDrag() {
		super.performDrag();
		
		if (getSourceEditPart().getParent() == null) {
		// This means the edit part was dragged to another component
		// So we must recalculate the binding's container
			
			//TODO optimisation de l'algo
			
			//Seeking interfaces
			List<EditPart> ComponentChildrenList = getSourceEditPart().getChildren();
			EditPart componentChild = ComponentChildrenList.get(0);
			for (int i=0; i < ComponentChildrenList.size(); i++) {
			componentChild = ComponentChildrenList.get(i);
				if (componentChild instanceof InterfaceDefinitionEditPart) {
					//Seeking related bindings in source connections
					List<EditPart> interfaceSourcesList = ((InterfaceDefinitionEditPart) componentChild).getSourceConnections();
					
					for (int j = 0; j < interfaceSourcesList.size(); j++) {
						EditPart interfaceSource = interfaceSourcesList.get(j);
						if (interfaceSource instanceof BindingDefinitionCustomEditPart) {
							//And execute a reorient command to reset the container
							//if the binding is not being deleted
							BindingDefinitionImpl connectorImpl = (BindingDefinitionImpl)((ConnectorImpl)interfaceSource.getModel()).getElement();
							InterfaceDefinitionImpl interfaceImpl = (InterfaceDefinitionImpl)((ShapeImpl)componentChild.getModel()).getElement();
							if (connectorImpl != null && interfaceImpl != null) {
								ReorientRelationshipRequest reorientRequest = new ReorientRelationshipRequest(connectorImpl,interfaceImpl,interfaceImpl,1);
								BindingDefinitionCustomReorientCommand reorientCommand = new BindingDefinitionCustomReorientCommand(reorientRequest);
								if (reorientCommand.canExecute()) {
									try {
										reorientCommand.execute(null, null);
									} catch (ExecutionException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								interfaceSource.refresh();	
							}
						}
					}
					//Seeking related bindings in target connections				
					List<EditPart> InterfaceTargetsList = ((InterfaceDefinitionEditPart) componentChild).getTargetConnections();
					
					for (int h = 0; h < InterfaceTargetsList.size(); h++) {			
						EditPart interfaceTarget = InterfaceTargetsList.get(h);
						if (interfaceTarget instanceof BindingDefinitionCustomEditPart) {
							//And execute a reorient command to reset the container
							//if the binding is not being deleted
							BindingDefinitionImpl connectorImpl = (BindingDefinitionImpl)((ConnectorImpl)interfaceTarget.getModel()).getElement();
							InterfaceDefinitionImpl interfaceImpl = (InterfaceDefinitionImpl)((ShapeImpl)componentChild.getModel()).getElement();
							if (connectorImpl != null && interfaceImpl != null) {
								ReorientRelationshipRequest reorientRequest = new ReorientRelationshipRequest(connectorImpl,interfaceImpl,interfaceImpl,1);
								BindingDefinitionCustomReorientCommand reorientCommand = new BindingDefinitionCustomReorientCommand(reorientRequest);
								if (reorientCommand.canExecute()) {
									try {
										reorientCommand.execute(null, null);
									} catch (ExecutionException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								interfaceTarget.refresh();
							}
						}
					}
				}
			}
		
		}
		
	}
}
