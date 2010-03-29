package org.ow2.fractal.mind.ide.ui.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.views.properties.PropertySheet;
import org.ow2.fractal.mind.ide.ui.Activator;

public class MindEditActionProvider extends CommonActionProvider {

	/**
	 * This is the action used to implement delete.
	 */
	protected DeleteAction deleteAction;

	/**
	 * This is the action used to implement cut.
	 */
	protected CutAction cutAction;

	/**
	 * This is the action used to implement copy.
	 */
	protected CopyAction copyAction;

	/**
	 * This is the action used to implement paste.
	 */
	protected PasteAction pasteAction;

	/**
	 * This is the action used to implement undo.
	 */
	protected UndoAction undoAction;

	/**
	 * This is the action used to implement redo.
	 */
	protected RedoAction redoAction;

	/**
	 * This style bit indicates that the "additions" separator should come after
	 * the "edit" separator.
	 */
	public static final int ADDITIONS_LAST_STYLE = 0x1;

	/**
	 * This is used to encode the style bits.
	 */
	protected int style;

	/**
	 * This creates an instance of the contributor.
	 */
	public MindEditActionProvider() {
		super();
	}
	/**
	 * Open a file
	 * 
	 * @param jf
	 */
	
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		ISharedImages sharedImages = PlatformUI.getWorkbench()
				.getSharedImages();
		EditingDomain domain = new MindEditingDomain((MindUICore.mindViewAdapterFactory()));
		deleteAction = new DeleteAction(domain, removeAllReferencesOnDelete());
		deleteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));

		cutAction = new CutAction(domain);
		cutAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));

		copyAction = new CopyAction(domain);
		copyAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));

		pasteAction = new PasteAction(domain);
		pasteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));

		undoAction = new UndoAction(domain);
		undoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));

		redoAction = new RedoAction(domain);
		redoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		

		aSite.getStructuredViewer().addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				StructuredSelection ss = (StructuredSelection) event.getSelection();
				Object obj = ss.getFirstElement();
				if (obj != null) {
					if (!(obj instanceof IFile) && obj instanceof IAdaptable) {
						obj = ((IAdaptable)obj).getAdapter(IFile.class);
					} else {
						obj = Platform.getAdapterManager().getAdapter(obj, IFile.class);
					}
					if (obj instanceof IFile) {
						Activator.openFile((IFile) obj);
					}
				}				
			}
		});
	}

	/**
	 * This determines whether or not the delete action should clean up all
	 * references to the deleted objects. It is false by default, to provide the
	 * same beahviour, by default, as in EMF 2.1 and before. You should probably
	 * override this method to return true, in order to get the new, more useful
	 * beahviour.
	 * 
	 * @since 2.2
	 */
	protected boolean removeAllReferencesOnDelete() {
		return false;
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		{
			actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
					deleteAction);
			actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
					cutAction);
			actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
					copyAction);
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
					pasteAction);
		}
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
				undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
				redoAction);
	}

	public void setActiveView(IViewPart part) {
		IActionBars actionBars = part.getViewSite().getActionBars();
		if (!(part instanceof PropertySheet)) {
			actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
					deleteAction);
			actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
					cutAction);
			actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
					copyAction);
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
					pasteAction);
		}
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
				undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
				redoAction);

		actionBars.updateActionBars();
	}

	@Override
	public void setContext(ActionContext context) {
		super.setContext(context);
		if (context != null) {
			ISelection selection = context.getSelection();
			IStructuredSelection structuredSelection = selection instanceof IStructuredSelection ? (IStructuredSelection) selection
					: StructuredSelection.EMPTY;
			deleteAction.updateSelection(structuredSelection);
			cutAction.updateSelection(structuredSelection);
			copyAction.updateSelection(structuredSelection);
			pasteAction.updateSelection(structuredSelection);
			undoAction.update();
			redoAction.update();
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menuManager) {
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new ActionContributionItem(undoAction));
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new ActionContributionItem(redoAction));
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new Separator());
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new ActionContributionItem(cutAction));
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new ActionContributionItem(copyAction));
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new ActionContributionItem(pasteAction));
		
		IStructuredSelection selection = (IStructuredSelection) getContext()
		.getSelection();

		boolean anyResourceSelected = !selection.isEmpty();
		if (anyResourceSelected) {
			deleteAction.selectionChanged(selection);
			menuManager.appendToGroup(ICommonMenuConstants.GROUP_EDIT, new ActionContributionItem(deleteAction));
		}
	}
}
