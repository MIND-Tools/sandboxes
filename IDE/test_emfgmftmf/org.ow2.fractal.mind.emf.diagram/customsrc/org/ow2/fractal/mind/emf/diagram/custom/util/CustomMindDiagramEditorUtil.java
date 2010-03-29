package org.ow2.fractal.mind.emf.diagram.custom.util;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.ArchitectureDefinition;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.part.Messages;
import adl.diagram.part.MindDiagramEditor;
import adl.diagram.part.MindDiagramEditorPlugin;
import adl.diagram.part.MindDiagramEditorUtil;

public class CustomMindDiagramEditorUtil extends MindDiagramEditorUtil {

	
	/**
	 * This method should be called within a workspace modify operation since it creates resources.
	 * @generated
	 */
	public static Resource initDiagram(URI diagramURI, URI modelURI, IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.MindDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		// -- Get existing diagram
		final Resource modelResource = editingDomain.getResourceSet().
				getResource(modelURI, true);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.MindDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				// -- Get existing model
				AdlDefinition model = (AdlDefinition) modelResource.getContents().get(0);			
//				attachModelToResource(model, modelResource);

				Diagram diagram = ViewService.createDiagram(model,
						AdlDefinitionEditPart.MODEL_ID,
						MindDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					modelResource.save(adl.diagram.part.MindDiagramEditorUtil
							.getSaveOptions());
					diagramResource.save(adl.diagram.part.MindDiagramEditorUtil
							.getSaveOptions());
				} catch (IOException e) {

					MindDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(modelResource));
		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		
		return diagramResource;
	}
	
	/**
	 * Create a new instance of domain element associated with canvas.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static AdlDefinition createInitialComponent(String kind, String name) {
		AdlDefinition adl = AdlFactory.eINSTANCE.createAdlDefinition();
		EList<ArchitectureDefinition> architecture = adl.getArchitecturedefinition();
		if (kind == "COMPOSITE") {
			ArchitectureDefinition composite = AdlFactory.eINSTANCE.createCompositeComponentDefinition();
			composite.setName(name);
			architecture.add(composite);
		}
		if (kind == "PRIMITIVE") {
			architecture.add(AdlFactory.eINSTANCE.createPrimitiveComponentDefinition());
		}
		if (kind == "COMPONENT_TYPE") {
			architecture.add(AdlFactory.eINSTANCE.createComponentTypeDefinition());
		}
		return adl;
	}
	
	/**
	 * Store model element in the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static void attachModelToResource(AdlDefinition model,
			Resource resource) {
		resource.getContents().add(model);
	}
	
	
	
}
