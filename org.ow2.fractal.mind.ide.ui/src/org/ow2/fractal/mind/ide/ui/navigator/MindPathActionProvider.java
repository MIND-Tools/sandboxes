package org.ow2.fractal.mind.ide.ui.navigator;

import java.util.List;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindPathItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.ui.actions.MPEActionGroup;
import org.ow2.fractal.mind.ide.ui.properties.MpeMindPathModel;

public class MindPathActionProvider extends CommonActionProvider {

	public MindPathActionProvider() {
	}
	
	@Override
	public void fillContextMenu(IMenuManager menu) {
		final MindProject p = getMindProject();
		if (p == null) return;
		
		MpeMindPathModel model = new MpeMindPathModel() {
			public void mpeRemoved(MindPathEntry mpe) {
				p.getMindpathentries().remove(mpe);
			}
			
			public void mpeChanged(MindPathEntry mpe) {
			}
			
			public void mpeAdded(MindPathEntry mpe) {
				p.getMindpathentries().add(mpe);
			}
			
			public List<MindPathEntry> getEntries() {
				return p.getMindpathentries();
			}
		};
		MPEActionGroup actionGroup = new MPEActionGroup(getActionSite().getViewSite().getShell(), p, model);
		actionGroup.setContext(getContext());
		actionGroup.fillContextMenu(menu);
		
	}
	
	MindProject getMindProject() {
		IStructuredSelection sel = (IStructuredSelection) getContext().getSelection();
		if (sel.size() == 1) {
			Object obj = sel.getFirstElement();
			if (obj instanceof MindProject) {
				return (MindProject) obj;
			}
			if (obj instanceof MindPathItemProvider) {
				return ((MindPathItemProvider)obj).getMindProject();
			}
			if (obj instanceof MindPathEntry) {
				return ((MindPathEntry)obj).getOwnerProject();
			}
		}
		return null;
	}

}
