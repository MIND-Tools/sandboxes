package org.ow2.mindEd.ide.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.ActionGroup;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.ui.properties.MpeMindPathModel;

/**
 * The group of mpe action.
 */
public class MPEActionGroup extends ActionGroup {
	protected Shell _shell;
	protected MindProject _p;
	protected MpeMindPathModel _model;
	private IAction _newPackageAction ;
	private IAction _newProjectAction;
	private IAction _newApplicationAction;
	private IAction _newSourceEntryAction;
	private IAction _newLibraryEntryAction;
	private MPEDeleteAction _delete;
	
	public MPEActionGroup(Shell shell, MindProject p, MpeMindPathModel model) {
		_shell = shell;
		_p = p;
		_model = model;
	}
	
	@Override
	public void fillContextMenu(IMenuManager menu) {
		_newApplicationAction = new MPENewApplicationAction(_shell,_p,_model);
		_newPackageAction = new MPENewImportPackageAction(_shell,_p,_model);
		_newProjectAction = new MPENewReferenceProject(_shell,_p,_model);
		_newSourceEntryAction =  new MPENewSourceAction(_shell,_p,_model);
		_newLibraryEntryAction = new MPENewLibrary(_shell, _p, _model);
		
		menu.add(_newSourceEntryAction);
		menu.add(_newPackageAction);
		menu.add(_newProjectAction);
		menu.add(_newApplicationAction);
		menu.add(_newLibraryEntryAction);
		
		MindPathEntry mpe = getSelection((IStructuredSelection) getContext().getSelection());
		if (mpe != null) {
			menu.add(new Separator());
			_delete = new MPEDeleteAction(_model, mpe);
			menu.add(_delete);
		}
		super.fillContextMenu(menu);
	}
	
	public MindPathEntry getSelection(IStructuredSelection sel) {
		Object obj = sel.getFirstElement();
		if (obj instanceof MindPathEntry)
			return (MindPathEntry) obj;
		return  null;
	}
}

