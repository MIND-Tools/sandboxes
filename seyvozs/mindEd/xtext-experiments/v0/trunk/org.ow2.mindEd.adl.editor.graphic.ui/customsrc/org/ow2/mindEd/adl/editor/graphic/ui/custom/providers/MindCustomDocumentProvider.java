package org.ow2.mindEd.adl.editor.graphic.ui.custom.providers;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.views.markers.ProblemsView;
import org.eclipse.ui.part.FileEditorInput;
import org.ow2.mindEd.adl.custom.helpers.AdlDefinitionHelper;
import org.ow2.mindEd.adl.custom.impl.AdlDefinitionCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.MindDiagramUpdateAllCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers.SaveUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.CustomValidateAction;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

import org.ow2.mindEd.adl.editor.graphic.ui.part.Messages;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramUpdateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDocumentProvider;

/**
 * Custom provider to get extended save features : <p>
 * - automatic validation on save<p>
 * - don't save if validation failed<p>
 * - don't save merged elements (delete then restore them)
 * @author maroto
 *
 */
@SuppressWarnings("restriction")
public class MindCustomDocumentProvider extends MindDocumentProvider {
	
	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		
		try {
			// Automatic validation with result
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			CustomValidateAction action = new CustomValidateAction(page, (IEditorInput) element);
			monitor.setTaskName("Validation");
			action.run(monitor);
			if (!action.result) {
				// If validation failed, do not save
				ProblemsView problem = (ProblemsView) page.findView("org.eclipse.ui.views.ProblemView");
				page.activate(problem);
				monitor.setCanceled(true);
				return;
			}
		}
		catch(Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Problems occured during validation", e);
			return;
		}
		
		MindProxy mindRoot = MindProxyFactory.INSTANCE.getRootProxy();
		HashMap<String,Rectangle> boundsMemory = new HashMap<String,Rectangle>();
		HashMap<String,Bendpoints> bendpointsMemory = new HashMap<String,Bendpoints>();
		if (mindRoot != null) {
			SaveUtil.saveBounds(mindRoot.getEditPart(), boundsMemory, bendpointsMemory);
		}
		
		// Prepare the transaction that will prepare the main definition
		// All merged items are deleted because they must not be serialized
		TransactionalEditingDomain domain = getDiagramDocument(element).getEditingDomain();
		TransactionImpl transaction = new TransactionImpl(domain, false);
		EObject root = ((DiagramImpl)document.getContent()).getElement();
		
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			if (!overwrite && !info.isSynchronized()) {
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								MindDiagramEditorPlugin.ID,
								IResourceStatus.OUT_OF_SYNC_LOCAL,
								Messages.MindDocumentProvider_UnsynchronizedFileSaveError,
								null));
			}
			info.stopResourceListening();
			fireElementStateChanging(element);
			try {
				monitor.beginTask(
						Messages.MindDocumentProvider_SaveDiagramTask, info
								.getResourceSet().getResources().size() + 1); //"Saving diagram"
				
				
				LazyLinkingResource xtextResource = null;
				GMFResource gmfResource = null;
				
				for (Iterator/*<org.eclipse.emf.ecore.resource.Resource>*/<?>it = info
						.getLoadedResourcesIterator(); it.hasNext();) {
					Resource nextResource = (Resource) it.next();
					monitor.setTaskName(NLS.bind(
							Messages.MindDocumentProvider_SaveNextResourceTask,
							nextResource.getURI()));
					if (nextResource.isLoaded()
							&& !info.getEditingDomain()
									.isReadOnly(nextResource)) {
						if (nextResource instanceof LazyLinkingResource) {
							// Serialize later
							xtextResource = (LazyLinkingResource) nextResource;
						}
						else {
							// Save GMF
							try {
								if (nextResource instanceof GMFResource)
									gmfResource = (GMFResource) nextResource;
 								nextResource.save(MindDiagramEditorUtil
										.getSaveOptions());
							} catch (IOException e) {
								fireElementStateChangeFailed(element);
								throw new CoreException(new Status(IStatus.ERROR,
										MindDiagramEditorPlugin.ID,
										EditorStatusCodes.RESOURCE_FAILURE, e
												.getLocalizedMessage(), null));
							}
						}
					}
					monitor.worked(1);
				}
				
				// Delete merged elements from the model before saving
				if (root instanceof AdlDefinitionCustomImpl) {
					try {
						transaction.start();
						prepareMainDefinitionBeforeSave((AdlDefinitionCustomImpl) root);
						transaction.commit();
					} catch (InterruptedException e) {
						MindDiagramEditorPlugin.getInstance().logError("Clean merge failed", e);
					} catch (RollbackException e) {
						MindDiagramEditorPlugin.getInstance().logError("Clean merge failed", e);
						transaction.rollback();
					}
					finally{}
				}
				
				// Merged items are deleted, they will not to be serialized
				// We can save xtext resource
				try {
						xtextResource.save(MindDiagramEditorUtil
							.getSaveOptions());
				} catch (IOException e) {
					fireElementStateChangeFailed(element);
					throw new CoreException(new Status(IStatus.ERROR,
							MindDiagramEditorPlugin.ID,
							EditorStatusCodes.RESOURCE_FAILURE, e
									.getLocalizedMessage(), null));
				}
				
				// Restore merged elements
				if (root instanceof AdlDefinitionCustomImpl) {
					try {
						transaction.start();
						restoreMainDefinitionAfterSave((AdlDefinitionCustomImpl) root);
						transaction.commit();
					} catch (InterruptedException e) {
						MindDiagramEditorPlugin.getInstance().logError("Restore merge failed", e);
					} catch (RollbackException e) {
						e.printStackTrace();
						MindDiagramEditorPlugin.getInstance().logError("Restore merge failed", e);
						transaction.rollback();
					}finally{}
				}
				
				// Update diagram
				try {
					MindDiagramUpdateCommand update = new MindDiagramUpdateAllCommand(false);
					update.execute(new ExecutionEvent());
				}catch (ExecutionException e) {
					MindDiagramEditorPlugin.getInstance().logError("Update failed", e);
				}finally{}
				
				// Now that editParts have been recreated by the update,
				// we are able to restore the saved bounds
				if (mindRoot != null) {
					SaveUtil.restoreBounds(mindRoot.getEditPart(), boundsMemory, bendpointsMemory);
					boundsMemory.clear();
				}
				
				// DocumentProvider thinks resource is modified because of restoreMainDefinition
				// Set value to false
				gmfResource.setModified(false);
					
				monitor.done();
				info.setModificationStamp(computeModificationStamp(info));
			} catch (RuntimeException x) {
				fireElementStateChangeFailed(element);
				throw x;
			} finally {
				info.startResourceListening();
			}
		} else {
			URI newResoruceURI;
			List<IFile> affectedFiles = null;
			if (element instanceof FileEditorInput) {
				IFile newFile = ((FileEditorInput) element).getFile();
				affectedFiles = Collections.singletonList(newFile);
				newResoruceURI = URI.createPlatformResourceURI(newFile
						.getFullPath().toString(), true);
			} else if (element instanceof URIEditorInput) {
				newResoruceURI = ((URIEditorInput) element).getURI();
			} else {
				fireElementStateChangeFailed(element);
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								MindDiagramEditorPlugin.ID,
								0,
								NLS
										.bind(
												Messages.MindDocumentProvider_IncorrectInputError,
												new Object[] {
														element,
														"org.eclipse.ui.part.FileEditorInput", "org.eclipse.emf.common.ui.URIEditorInput" }), //$NON-NLS-1$ //$NON-NLS-2$ 
								null));
			}
			if (false == document instanceof IDiagramDocument) {
				fireElementStateChangeFailed(element);
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								MindDiagramEditorPlugin.ID,
								0,
								"Incorrect document used: " + document + " instead of org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument", null)); //$NON-NLS-1$ //$NON-NLS-2$
			}
			IDiagramDocument diagramDocument = (IDiagramDocument) document;
			final Resource newResource = diagramDocument.getEditingDomain()
					.getResourceSet().createResource(newResoruceURI);
			final Diagram diagramCopy = (Diagram) EcoreUtil
					.copy(diagramDocument.getDiagram());
			try {
				new AbstractTransactionalCommand(diagramDocument
						.getEditingDomain(), NLS.bind(
						Messages.MindDocumentProvider_SaveAsOperation,
						diagramCopy.getName()), affectedFiles) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor monitor, IAdaptable info)
							throws ExecutionException {
						newResource.getContents().add(diagramCopy);
						return CommandResult.newOKCommandResult();
					}
				}.execute(monitor, null);
				newResource.save(MindDiagramEditorUtil.getSaveOptions());
			} catch (ExecutionException e) {
				fireElementStateChangeFailed(element);
				throw new CoreException(new Status(IStatus.ERROR,
						MindDiagramEditorPlugin.ID, 0, e.getLocalizedMessage(),
						null));
			} catch (IOException e) {
				fireElementStateChangeFailed(element);
				throw new CoreException(new Status(IStatus.ERROR,
						MindDiagramEditorPlugin.ID, 0, e.getLocalizedMessage(),
						null));
			}
			newResource.unload();
		}
	}
	
	private long computeModificationStamp(ResourceSetInfo info) {
		int result = 0;
		for (Iterator<Resource> it = info.getLoadedResourcesIterator(); it
				.hasNext();) {
			Resource nextResource = it.next();
			IFile file = WorkspaceSynchronizer.getFile(nextResource);
			if (file != null) {
				if (file.getLocation() != null) {
					result += file.getLocation().toFile().lastModified();
				} else {
					result += file.getModificationStamp();
				}
			}
		}
		return result;
	}
	
	protected void restoreMainDefinitionAfterSave(AdlDefinitionCustomImpl root) {
		if (root != null)
			((AdlDefinitionHelper)root.getHelper()).restoreMainDefinition();
	}

	protected void prepareMainDefinitionBeforeSave(AdlDefinitionCustomImpl root) {
		if (root == null)
			return;
		((AdlDefinitionHelper)root.getHelper()).cleanMainDefinition();
	}
	
}
