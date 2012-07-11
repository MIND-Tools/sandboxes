/**
 * Copyright (C) 2010 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.minded.project.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IWorkbench;
import org.ow2.minded.project.builder.MindNature;
import org.ow2.minded.project.builder.MindcBuilder;
import org.ow2.minded.project.properties.MindProjectConfiguration;

public class MindSourceFolderContentProvider implements ITreeContentProvider {

  public void dispose() {
    // nothing todo
  }

  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    // nothing todo
  }

  public Object[] getElements(Object inputElement) {
    Assert.isTrue(inputElement instanceof IWorkspace);
    IWorkspaceRoot workspaceRoot = ((IWorkspace) inputElement).getRoot();
    List<IProject> mindProject = new ArrayList<IProject>();
    for (IProject project : workspaceRoot.getProjects()) {
      if (MindNature.hasNature(project)) {
        mindProject.add(project);
      }
    }
    return mindProject.toArray();
  }

  public Object[] getChildren(Object parentElement) {
    if (parentElement instanceof IProject) {
      try {
        return MindNature.getNature((IProject) parentElement).getConfiguration()
            .getSourceFolders().toArray();
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public Object getParent(Object element) {
    if (element instanceof IFolder) {
      return ((IFolder)element).getProject();
    } else if (element instanceof IProject) {
      return ((IProject) element).getWorkspace();
    }
    return null;
  }

  public boolean hasChildren(Object element) {
    return element instanceof IWorkspace || element instanceof IProject;
  }
}
