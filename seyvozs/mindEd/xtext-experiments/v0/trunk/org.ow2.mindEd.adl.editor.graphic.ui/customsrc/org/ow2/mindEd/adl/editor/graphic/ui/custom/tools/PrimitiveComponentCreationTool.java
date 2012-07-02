package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.eclipse.core.commands.ExecutionException;
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
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.ImplementationDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveBodyCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentPrimitiveBodyCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.MindDiagramUpdateAllCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.PrimitiveComponentInformation;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.PrimitiveCreationWizard;
import org.ow2.mindEd.adl.impl.FileCImpl;
import org.ow2.mindEd.adl.impl.InlineCodeCImpl;
import org.ow2.mindEd.adl.impl.PrimitiveReferencesListImpl;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindC;
import org.ow2.mindEd.ide.model.MindFile;

public class PrimitiveComponentCreationTool extends UnspecifiedTypeCreationTool{

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
			PrimitiveCreationWizard wizWizard = new PrimitiveCreationWizard(isSubComponent); 
	        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
	        wizWizard.setWizardDialog(wizDialog);
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
						
						PrimitiveComponentInformation primitiveInformation = wizWizard.getPrimitiveComponentInformation();
						
						
						TransactionImpl transaction = new TransactionImpl(request.getEditingDomain(), false);
						try {
							transaction.start();
							MindFile mindFile = null;
/*							if(!primitiveInformation.isAnonymous())
							{
								URI uri = URI.createPlatformResourceURI(primitiveInformation.getExtendPath(), true);
								mindFile = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
							}
*/							if (element instanceof SubComponentDefinitionCustomImpl)
							{
								((SubComponentDefinitionCustomImpl)element).setName(primitiveInformation.getPrimitiveName());
								
								if(!primitiveInformation.isAnonymous())
								{
									URI uri = URI.createPlatformResourceURI(primitiveInformation.getExtendPath(), true);
									mindFile = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
									
									CompositeReferenceDefinitionCustomImpl newReferenceDefinition = new CompositeReferenceDefinitionCustomImpl();
									newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
									((SubComponentDefinitionCustomImpl)element).setReferenceDefinition(newReferenceDefinition);
								}
								if((primitiveInformation.getListImplementation() != null)
										&& (primitiveInformation.getListImplementation().size()!= 0))
								{
									ArrayList<String> listImpl = primitiveInformation.getListImplementation();
									for(String impl : listImpl)
									{
										SubComponentPrimitiveBodyCustomImpl body = (SubComponentPrimitiveBodyCustomImpl) ((SubComponentDefinitionCustomImpl)element).getBody();
										List<Element> elementList = body.getElements();
										
										if(impl.startsWith("{{") && impl.endsWith("}}"))
										{
											InlineCodeCImpl inlineCode = new InlineCodeCImpl();
											inlineCode.setCodeC(impl);
											
											ImplementationDefinitionCustomImpl newImpl = new ImplementationDefinitionCustomImpl();
											newImpl.setInlineCcode(inlineCode);
											elementList.add(newImpl);
										}
										else
										{
											MindFile mindFileC = null;
											URI uri = URI.createPlatformResourceURI(impl, true);
											mindFileC = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
											if(mindFileC instanceof MindC)
											{
												FileCImpl fileC = new FileCImpl();
												fileC.setFileName(mindFileC.getQualifiedName());
												
												ImplementationDefinitionCustomImpl newImpl = new ImplementationDefinitionCustomImpl();
												newImpl.setFileC(fileC);
												elementList.add(newImpl);
											}
										}
									}
								}
									
							}
							else if (element instanceof PrimitiveComponentDefinitionCustomImpl)
							{
								((PrimitiveComponentDefinitionCustomImpl)element).setName(primitiveInformation.getPrimitiveName());
								
								if(!primitiveInformation.isAnonymous())
								{
									ArrayList<String> listExtends = primitiveInformation.getListExtends();
									
									PrimitiveReferencesListImpl referenceList = new PrimitiveReferencesListImpl();
									
									for(String extendPath : listExtends)
									{
										URI uri = URI.createPlatformResourceURI(extendPath, true);
										mindFile = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
										
										PrimitiveReferenceDefinitionCustomImpl newReferenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
										newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
										((PrimitiveComponentDefinitionCustomImpl)element).setReferencesList(referenceList);
										newReferenceDefinition.setParentReferencesList(referenceList);
									}
								}
								if((primitiveInformation.getListImplementation()!= null) 
										&& (primitiveInformation.getListImplementation().size()!= 0))
								{
									ArrayList<String> listImpl = primitiveInformation.getListImplementation();
									for(String impl : listImpl)
									{
										PrimitiveBodyCustomImpl body = (PrimitiveBodyCustomImpl) ((PrimitiveComponentDefinitionCustomImpl)element).getBody();
										List<Element> elementList = body.getElements();
										
										if(impl.startsWith("{{") && impl.endsWith("}}"))
										{
											InlineCodeCImpl inlineCode = new InlineCodeCImpl();
											inlineCode.setCodeC(impl);
											
											ImplementationDefinitionCustomImpl newImpl = new ImplementationDefinitionCustomImpl();
											newImpl.setInlineCcode(inlineCode);
											elementList.add(newImpl);
										}
										else
										{											
											MindFile mindFileC = null;
											URI uri = URI.createPlatformResourceURI(impl, true);
											mindFileC = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
											if(mindFileC instanceof MindC)
											{
												FileCImpl fileC = new FileCImpl();
												fileC.setFileName(mindFileC.getQualifiedName());
												
												ImplementationDefinitionCustomImpl newImpl = new ImplementationDefinitionCustomImpl();
												newImpl.setFileC(fileC);
												elementList.add(newImpl);
											}
										}
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
			//Refresh
			MindDiagramUpdateAllCommand update = new MindDiagramUpdateAllCommand(true);
			try {
				update.execute(null);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		antiScroll = false;
	}

	public PrimitiveComponentCreationTool(List<?> connectionTypes) {
		super(connectionTypes);
		// TODO Auto-generated constructor stub
	}
	
}
