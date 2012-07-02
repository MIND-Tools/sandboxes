package org.ow2.mindEd.ide.ui.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.OpenFileAction;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;
import org.ow2.mindEd.ide.ui.Activator;

public class MindOpenFileAction extends OpenFileAction {

	/**
     * The editor to open.
     */
    private IEditorDescriptor editorDescriptor;
	
	public MindOpenFileAction(IWorkbenchPage page) {
		super(page);
	}
	
	public MindOpenFileAction(IWorkbenchPage page, IEditorDescriptor descriptor) {
        super(page);
        setText(descriptor == null ? IDEWorkbenchMessages.OpenFileAction_text : descriptor.getLabel());
        PlatformUI.getWorkbench().getHelpSystem().setHelp(this,
				IIDEHelpContextIds.OPEN_FILE_ACTION);
        setToolTipText(IDEWorkbenchMessages.OpenFileAction_toolTip);
        setId(ID);
        this.editorDescriptor = descriptor;
    }
	
	public void run() {
        Iterator itr = getSelectedResources().iterator();
        while (itr.hasNext()) {
            IResource resource = (IResource) itr.next();
            if (resource instanceof IFile) {
				openFile((IFile) resource);
			}
        }
    }
	
	/**
     * Opens an editor on the given file resource.<p>
     * overridden to use the activator's method, modified to open the right
     * file if the editor is the diagram editor
     * @param file the file resource
     */
    void openFile(IFile file) {
    	Activator.openFile(file);
    }

}
