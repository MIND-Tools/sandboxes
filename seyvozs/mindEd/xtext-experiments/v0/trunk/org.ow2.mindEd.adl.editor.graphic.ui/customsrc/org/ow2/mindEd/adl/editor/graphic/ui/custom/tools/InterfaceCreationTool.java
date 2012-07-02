package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.MindDiagramUpdateAllCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.InterfaceInformation;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.InterfaceCreationWizard;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindFile;

public class InterfaceCreationTool extends UnspecifiedTypeCreationTool{

	@Override
	protected void performCreation(int button) {
		antiScroll = true;
		
		EditPartViewer viewer = getCurrentViewer();
		Command c = getCurrentCommand();
		
		selectAddedObject(viewer, DiagramCommandStack.getReturnValues(c));
		if(c != null)
		{
			InterfaceCreationWizard wizWizard = new InterfaceCreationWizard(null); 
	        
	        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
	        wizDialog.setBlockOnOpen(true);
	        if(wizDialog.open() == WizardDialog.OK)
	        {
	        	executeCurrentCommand();
	        	InterfaceInformation interfaceInformation = wizWizard.getNewInterfaceInformation();
	        	
	        	Collection<?> commandReturnValue = DiagramCommandStack.getReturnValues(c);
				
				for(Object elementRequest : commandReturnValue)
				{
	
					if(elementRequest instanceof CreateElementRequestAdapter)
					{
						CreateElementRequest request = (CreateElementRequest) ((CreateElementRequestAdapter)elementRequest).getAdapter(CreateElementRequest.class);
						Object element = request.getNewElement();
						
						MindFile mindFile = null;
						URI uri = URI.createPlatformResourceURI(interfaceInformation.getPath(), true);
						// Test if file existing
						IFile file = ModelToProjectUtil.INSTANCE.getIFile(uri);
						
						TransactionImpl transaction = new TransactionImpl(request.getEditingDomain(), false);
						try {
							transaction.start();
							if (element instanceof InterfaceDefinition)
							{
								if(file != null)
								{
									mindFile = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
									((InterfaceDefinitionCustomImpl)element).setSignature(mindFile.getQualifiedName());
								}
								((InterfaceDefinitionCustomImpl)element).setName(interfaceInformation.getName());
								((InterfaceDefinitionCustomImpl)element).setOptional(interfaceInformation.isOptional());
								((InterfaceDefinitionCustomImpl)element).setCollection(interfaceInformation.isCollection());
								((InterfaceDefinitionCustomImpl)element).setCollectionsize(interfaceInformation.getCollectionSize());
							}
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
		antiScroll = false;
	}

	public InterfaceCreationTool(List<?> connectionTypes) {
		super(connectionTypes);
	}
}
