package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyDelegatingOperation;

import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.part.ValidateAction;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindMarkerNavigationProvider;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindValidationProvider;

/**
 * This action extends generated ValidateAction to keep track of the validation result.
 * @author maroto
 *
 */
public class CustomValidateAction extends ValidateAction {

	
	private IWorkbenchPage page;
	private IEditorInput input;
	
	public CustomValidateAction(IWorkbenchPage initPage, IEditorInput initInput) {
		super(initPage);
		page = initPage;
		input = initInput;
	}
	
	/**
	 * The result is kept here
	 */
	public boolean result = false;

	/**
	 * Allows to pass a progress monitor to the command.
	 * Use a NullProgressMonitor if you don't need it.
	 * @param monitor
	 */
	public void run(IProgressMonitor monitor) {
		IWorkbenchPart workbenchPart = page.getActivePart();
		IEditorPart[] editors = page.getDirtyEditors();
		for (IEditorPart editor : editors) {
			if (editor.getEditorInput() == input)
				workbenchPart = editor;
		}
		if (workbenchPart instanceof IDiagramWorkbenchPart) {
			final IDiagramWorkbenchPart part = (IDiagramWorkbenchPart) workbenchPart;
			try {
				new WorkspaceModifyDelegatingOperation(
						new IRunnableWithProgress() {

							public void run(IProgressMonitor monitor)
									throws InterruptedException,
									InvocationTargetException {
								runValidationWithResult(part.getDiagramEditPart(), part
										.getDiagram());
							}
							
						}).run(monitor);
			} catch (Exception e) {
				MindDiagramEditorPlugin.getInstance().logError(
						"Validation action failed", e); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Created only to call runValidationWithResult instead of runValidation
	 * @param view
	 */
	public void runValidationWithResult(View view) {
		// Initialize result to true
		result = true;
		try {
			if (MindDiagramEditorUtil.openDiagram(view.eResource())) {
				IEditorPart editorPart = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage()
						.getActiveEditor();
				if (editorPart instanceof IDiagramWorkbenchPart) {
					runValidationWithResult(((IDiagramWorkbenchPart) editorPart)
							.getDiagramEditPart(), view);
				} else {
					runNonUIValidationWithResult(view);
				}
			}
		} catch (Exception e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Validation action failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * Overrides runNonUIValidation
	 */
	@SuppressWarnings("deprecation")
	public void runNonUIValidationWithResult(View view) {
		result = true;
		DiagramEditPart diagramEditPart = OffscreenEditPartFactory
				.getInstance().createDiagramEditPart(view.getDiagram());
		runValidation(diagramEditPart, view);
	}

	/**
	 * Replaces runValidation to call validateWithResult
	 */
	public void runValidationWithResult(DiagramEditPart diagramEditPart, View view) {
		// Reset result
		result = true;
		final DiagramEditPart fpart = diagramEditPart;
		final View fview = view;
		TransactionalEditingDomain txDomain = TransactionUtil
				.getEditingDomain(view);
		MindValidationProvider.runWithConstraints(txDomain, new Runnable() {

			public void run() {
				validateWithResult(fpart, fview);
			}
		});
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static Diagnostic runEMFValidator(View target) {
		if (target.isSetElement() && target.getElement() != null) {
			return new Diagnostician() {

				public String getObjectLabel(EObject eObject) {
					return EMFCoreUtil.getQualifiedName(eObject, true);
				}
			}.validate(target.getElement());
		}
		return Diagnostic.OK_INSTANCE;
	}

	/**
	 * Overrides validate to keep track of the result
	 */
	private void validateWithResult(DiagramEditPart diagramEditPart, View view) {
		IFile target = view.eResource() != null ? WorkspaceSynchronizer
				.getFile(view.eResource()) : null;
		if (target != null) {
			MindMarkerNavigationProvider.deleteMarkers(target);
		}
		Diagnostic diagnostic = runEMFValidator(view);
		createMarkers(target, diagnostic, diagramEditPart);
		IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		if (view.isSetElement() && view.getElement() != null) {
			IStatus status = validator.validate(view.getElement());
			// Keep track of the result
			if (!status.isOK()) {
				result = false;
			}
			createMarkers(target, status, diagramEditPart);
		}
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static void createMarkers(IFile target, IStatus validationStatus,
			DiagramEditPart diagramEditPart) {
		if (validationStatus.isOK()) {
			return;
		}
		final IStatus rootStatus = validationStatus;
		List<IStatus> allStatuses = new ArrayList<IStatus>();
		MindDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new MindDiagramEditorUtil.LazyElement2ViewMap(
				diagramEditPart.getDiagramView(), collectTargetElements(
						rootStatus, new HashSet<EObject>(), allStatuses));
		for (Iterator<IStatus> it = allStatuses.iterator(); it.hasNext();) {
			IConstraintStatus nextStatus = (IConstraintStatus) it.next();
			View view = MindDiagramEditorUtil.findView(diagramEditPart,
					nextStatus.getTarget(), element2ViewMap);
			addMarker(diagramEditPart.getViewer(), target, view.eResource()
					.getURIFragment(view), EMFCoreUtil.getQualifiedName(
					nextStatus.getTarget(), true), nextStatus.getMessage(),
					nextStatus.getSeverity());
		}
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static void createMarkers(IFile target,
			Diagnostic emfValidationStatus, DiagramEditPart diagramEditPart) {
		if (emfValidationStatus.getSeverity() == Diagnostic.OK) {
			return;
		}
		final Diagnostic rootStatus = emfValidationStatus;
		List<Diagnostic> allDiagnostics = new ArrayList<Diagnostic>();
		MindDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new MindDiagramEditorUtil.LazyElement2ViewMap(
				diagramEditPart.getDiagramView(), collectTargetElements(
						rootStatus, new HashSet<EObject>(), allDiagnostics));
		for (Iterator<?> it = emfValidationStatus.getChildren().iterator(); it
				.hasNext();) {
			Diagnostic nextDiagnostic = (Diagnostic) it.next();
			List<?> data = nextDiagnostic.getData();
			if (data != null && !data.isEmpty()
					&& data.get(0) instanceof EObject) {
				EObject element = (EObject) data.get(0);
				View view = MindDiagramEditorUtil.findView(diagramEditPart,
						element, element2ViewMap);
				addMarker(
						diagramEditPart.getViewer(),
						target,
						view.eResource().getURIFragment(view),
						EMFCoreUtil.getQualifiedName(element, true),
						nextDiagnostic.getMessage(),
						diagnosticToStatusSeverity(nextDiagnostic.getSeverity()));
			}
		}
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static void addMarker(EditPartViewer viewer, IFile target,
			String elementId, String location, String message,
			int statusSeverity) {
		if (target == null) {
			return;
		}
		MindMarkerNavigationProvider.addMarker(target, elementId, location,
				message, statusSeverity);
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static int diagnosticToStatusSeverity(int diagnosticSeverity) {
		if (diagnosticSeverity == Diagnostic.OK) {
			return IStatus.OK;
		} else if (diagnosticSeverity == Diagnostic.INFO) {
			return IStatus.INFO;
		} else if (diagnosticSeverity == Diagnostic.WARNING) {
			return IStatus.WARNING;
		} else if (diagnosticSeverity == Diagnostic.ERROR
				|| diagnosticSeverity == Diagnostic.CANCEL) {
			return IStatus.ERROR;
		}
		return IStatus.INFO;
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static Set<EObject> collectTargetElements(IStatus status,
			Set<EObject> targetElementCollector, List<IStatus> allConstraintStatuses) {
		if (status instanceof IConstraintStatus) {
			targetElementCollector
					.add(((IConstraintStatus) status).getTarget());
			allConstraintStatuses.add(status);
		}
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			for (int i = 0; i < children.length; i++) {
				collectTargetElements(children[i], targetElementCollector,
						allConstraintStatuses);
			}
		}
		return targetElementCollector;
	}

	/**
	 * No changes, only here because it is private in the superclass
	 * @param target
	 * @return
	 */
	private static Set<EObject> collectTargetElements(Diagnostic diagnostic,
			Set<EObject> targetElementCollector, List<Diagnostic> allDiagnostics) {
		List<?> data = diagnostic.getData();
		EObject target = null;
		if (data != null && !data.isEmpty() && data.get(0) instanceof EObject) {
			target = (EObject) data.get(0);
			targetElementCollector.add(target);
			allDiagnostics.add(diagnostic);
		}
		if (diagnostic.getChildren() != null
				&& !diagnostic.getChildren().isEmpty()) {
			for (Iterator<?> it = diagnostic.getChildren().iterator(); it
					.hasNext();) {
				collectTargetElements((Diagnostic) it.next(),
						targetElementCollector, allDiagnostics);
			}
		}
		return targetElementCollector;
	}
	

}
