package org.ow2.fractal.mind.ide.ui.properties;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;

public class UtilResource {

	static public  boolean hasFolders(IProject p, IContainer container, List<MindPathEntry> sourcesEntries) {

		try {
			IResource[] members= container.members();
			for (int i= 0; i < members.length; i++) {
				if (members[i] instanceof IContainer) {
					return true;
				}
			}
		} catch (CoreException e) {
			// ignore
		}

		if (sourcesEntries.size() > 1)
			return true;

		if (sourcesEntries.size() == 0)
			return false;

		MindPathEntry single = sourcesEntries.get(0);
		if (single.getName().equals(p.getFullPath().toPortableString()))
			return false;

		return true;
	}
}
