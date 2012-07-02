package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.Collection;
import java.util.List;

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
import org.ow2.mindEd.adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.CompositeComponentInformation;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.CompositeCreationWizard;
import org.ow2.mindEd.adl.impl.CompositeReferencesListImpl;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindFile;

public class CompositeComponentCreationTool extends UnspecifiedTypeCreationTool{
	
	@Override
	protected void performCreation(int button) {
		
		antiScroll = true;
		
		EditPartViewer viewer = getCurrentViewer();
		Command c = getCurrentCommand();
		if(c != null)
		{
			boolean isSubComponent = false;
			if(c.getLabel().contains("Sub"))
				isSubComponent = true;
			
			selectAddedObject(viewer, DiagramCommandStack.getReturnValues(c));
			CompositeCreationWizard wizWizard = new CompositeCreationWizard(isSubComponent); 
	        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
//	        wizWizard.setWizardDialog(wizDialog);
			wizDialog.setBlockOnOpen(true);
			if(wizDialog.open() == WizardDialog.OK)
			{
				executeCurrentCommand();
				Collection<?> commandReturnValue = DiagramCommandStack.getReturnValues(c);
				
				for(Object elementRequest : commandReturnValue)
				{
					if(elementRequest instanceof CreateElementRequestAdapter)
					{
						CreateElementRequest request = (CreateElementRequest) ((CreateElementRequestAdapter)elementRequest).getAdapter(CreateElementRequest.class);
						Object element = request.getNewElement();
						
						TransactionImpl transaction = new TransactionImpl(request.getEditingDomain(), false);
						try {
							transaction.start();
							
							MindFile mindFile = null;
							
							CompositeComponentInformation compositeInformation = wizWizard.getCompositeInformation();
							if (element instanceof SubComponentDefinitionCustomImpl)
							{
								((SubComponentDefinitionCustomImpl)element).setName(compositeInformation.getCompositeName());
								
								if((compositeInformation.getExtendPath() != null)
									&& (compositeInformation.getExtendPath().length() != 0))
								{
									URI uri = URI.createPlatformResourceURI(compositeInformation.getExtendPath(), true);
									mindFile = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
									
									CompositeReferenceDefinitionCustomImpl newReferenceDefinition = new CompositeReferenceDefinitionCustomImpl();
									newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
									((SubComponentDefinitionCustomImpl)element).setReferenceDefinition(newReferenceDefinition);
								}
								
							}
							else if (element instanceof CompositeComponentDefinitionCustomImpl)
							{
								((CompositeComponentDefinitionCustomImpl)element).setName(compositeInformation.getCompositeName());
								
								if((compositeInformation.getListExtends() != null)
										&& (compositeInformation.getListExtends().size() != 0))
									{
									
										CompositeReferencesListImpl newReferencesList = new CompositeReferencesListImpl();
	
										((CompositeComponentDefinitionCustomImpl)element).setReferencesList(newReferencesList);
										
										for(String extendPath : compositeInformation.getListExtends())
										{
											URI uri = URI.createPlatformResourceURI(extendPath, true);
											mindFile = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
											
											CompositeReferenceDefinitionCustomImpl newReferenceDefinition = new CompositeReferenceDefinitionCustomImpl();
											newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
											((CompositeComponentDefinitionCustomImpl)element).setReferencesList(newReferencesList);
											newReferenceDefinition.setParentReferencesList(newReferencesList);
										}
									}
								
							}
							transaction.commit();
						}catch (InterruptedException e) {
							e.printStackTrace();
						} catch (RollbackException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public CompositeComponentCreationTool(List<?> connectionTypes) {
		super(connectionTypes);
	}
}
