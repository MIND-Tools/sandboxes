package org.ow2.fractal.mind.diagram.custom.providers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.views.markers.ProblemsView;
import org.ow2.fractal.mind.diagram.custom.action.CustomValidateAction;

import adl.diagram.part.MindDocumentProvider;

public class MindCustomDocumentProvider extends MindDocumentProvider {

	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		
		View doc = (View) document.getContent();
		CustomValidateAction action = new CustomValidateAction(page);
		monitor.setTaskName("validation");
		action.run(monitor);
		if (!action.result) {
			ProblemsView problem = (ProblemsView) page.findView("org.eclipse.ui.views.ProblemView");
			page.activate(problem);
			monitor.setCanceled(true);
			return;
		}
	
		super.doSaveDocument(monitor, element, document, overwrite);
	}
	
}
