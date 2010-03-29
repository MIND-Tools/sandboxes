package org.ow2.fractal.mind.ide.ui.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.provider.MindIDEEditPlugin;
import org.ow2.fractal.mind.ide.ui.help.MindHelpContextIds;

public class SourceEntryDialog extends MultipleFolderSelectionDialog  {

	private MindPathEntry _mpe;

	public SourceEntryDialog(Shell shell, MindProject project, MindPathEntry mpe, List<MindPathEntry> model) {
		super(shell, new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		_mpe = mpe;
		
		Class<?>[] acceptedClasses= new Class[] { IProject.class, IFolder.class };
		List<IResource> existingContainers= getExistingContainers(model);

		IProject[] allProjects= ResourcesPlugin.getWorkspace().getRoot().getProjects();
		ArrayList<IProject> rejectedElements= new ArrayList<IProject>(allProjects.length);
		IProject currProject= project.getProject();
		for (int i= 0; i < allProjects.length; i++) {
			if (!allProjects[i].equals(currProject)) {
				rejectedElements.add(allProjects[i]);
			}
		}
		ViewerFilter filter= new TypedViewerFilter(acceptedClasses, rejectedElements.toArray());

		setTitle("Source entry");
		setImage(ExtendedImageRegistry.getInstance().getImage(
				MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindRootSrc")));
		setExisting(existingContainers.toArray());
		addFilter(filter);
		setInput(project.getProject().getParent());
		setInitialFocus(project.getProject());
	}
	
	private List<IResource> getExistingContainers(List<MindPathEntry> model) {
		List<IResource> res= new ArrayList<IResource>();
		IWorkspaceRoot root= ResourcesPlugin.getWorkspace().getRoot();
		for (int i= 0; i < model.size(); i++) {
			MindPathEntry mpe = model.get(i);
			if (_mpe == mpe) continue;
			
			if (mpe.getEntryKind() != MindPathKind.SOURCE) continue;
			IResource resource= root.findMember(mpe.getName());
			if (resource instanceof IContainer) {
				res.add(resource);
			}
		}
		return res;
	}
	
	@Override
	protected void computeResult() {
		super.computeResult();
		if (getResult() == null) {
			setMessage("Select a folder");
			return;
		}
		if (getResult().length != 1) {
			setMessage("Select only one folder");
			return;
		}
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, MindHelpContextIds.BP_CHOOSE_EXISTING_FOLDER_TO_MAKE_SOURCE_FOLDER);
		return super.createDialogArea(parent);
	}
	


}
