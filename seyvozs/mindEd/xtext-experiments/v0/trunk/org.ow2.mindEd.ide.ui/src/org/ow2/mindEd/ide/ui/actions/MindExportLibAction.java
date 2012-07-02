package org.ow2.mindEd.ide.ui.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionListenerAction;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.model.MindProject;

public class MindExportLibAction extends SelectionListenerAction {
	MindProject _mp;
	
	
	public MindExportLibAction() {
        super("Export lib in local repository.");
        setId("org.ow2.mindEd.ide.ui.exportlib");
    }
	
	public void run() {
        try {
			MindIdeCore.getModel().createMindLibFromProject(_mp, _mp.getName(), null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	
	
	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		Object a = selection.getFirstElement();
		_mp = null;
		if (a instanceof MindProject)
			_mp = (MindProject) a;
		if (a instanceof IProject) {
			_mp = MindIdeCore.get((IProject)a);
		}
		return _mp != null;
	}
	
	

}
