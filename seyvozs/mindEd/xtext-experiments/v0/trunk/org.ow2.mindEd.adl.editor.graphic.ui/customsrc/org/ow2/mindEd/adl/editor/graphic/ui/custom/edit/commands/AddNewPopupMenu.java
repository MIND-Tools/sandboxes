package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands;

import java.util.Collection;
import java.util.List;


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.PluginAction;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.InterfaceInformation;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.InterfaceCreationWizard;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;

@SuppressWarnings({ "restriction", "unused" })
public class AddNewPopupMenu extends AbstractPopupMenu implements IObjectActionDelegate{

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings({ "static-access" })
	@Override
	public void run(IAction action) {

		try {
        	
			ISelection selection = ((PluginAction)action).getSelection();
			List<?> elements =((StructuredSelection)selection).toList();
			for (Object element : elements)
			{
				PrimitiveBodyCompartmentEditPart bodyCompartementEditPart = (PrimitiveBodyCompartmentEditPart)element;
				PrimitiveBodyEditPart bodyEditPart = (PrimitiveBodyEditPart)bodyCompartementEditPart.getParent();
				
				CreateElementRequest req = new CreateElementRequest(bodyEditPart.getEditingDomain(), bodyEditPart.getNotationView().getElement() , MindElementTypes.InterfaceDefinition_3130);
				EditCommandRequestWrapper request = new EditCommandRequestWrapper(req);
				org.eclipse.gef.commands.Command command = bodyEditPart.getCommand(request);
				if(command.canExecute())
				{
					InterfaceCreationWizard wizWizard = new InterfaceCreationWizard(bodyEditPart); 
			        
			        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
			        wizDialog.setBlockOnOpen(true);
			        if(wizDialog.open() == wizDialog.OK)
			        {
			        	command.execute();
			        	InterfaceInformation interfaceInformation = wizWizard.getNewInterfaceInformation();
			        	
			        	Collection<?> temp = DiagramCommandStack.getReturnValues(command);
						
						for(Object newElement : temp)
						{
							if (newElement instanceof InterfaceDefinition)
							{
								TransactionImpl transaction = new TransactionImpl(req.getEditingDomain(), false);
								try {
									transaction.start();

									((InterfaceDefinitionCustomImpl)newElement).setSignature(interfaceInformation.getPath());
									((InterfaceDefinitionCustomImpl)newElement).setName(interfaceInformation.getName());
									((InterfaceDefinitionCustomImpl)newElement).setOptional(interfaceInformation.isOptional());
									((InterfaceDefinitionCustomImpl)newElement).setCollection(interfaceInformation.isCollection());
									((InterfaceDefinitionCustomImpl)newElement).setCollectionsize(interfaceInformation.getCollectionSize());
								
									transaction.commit();
								}catch (InterruptedException e) {
									e.printStackTrace();
								} catch (RollbackException e) {
									e.printStackTrace();
								}
								
								//Refresh
								MindDiagramUpdateAllCommand update = new MindDiagramUpdateAllCommand(true);
								try {
									update.execute(null);
								} catch (ExecutionException e) {
									e.printStackTrace();
								}

							}
						}
			        }
						
				}
			}
			
        } catch (Exception e) {
            WorkbenchPlugin.log(e);
        }
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	

}
