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

package org.ow2.mind.ui.refactoring;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.ChangeDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourceChange;
import org.eclipse.ltk.core.refactoring.resource.ResourceChange;

public class MoveFileChange extends ResourceChange {

  protected final IFile    fSource;
  protected final IFile    fTarget;
  protected final Change   fRestoreSourceChange;

  private ChangeDescriptor fDescriptor;

  public MoveFileChange(final IFile source, final IFile target) {
    this(source, target, null);
  }

  protected MoveFileChange(final IFile source, final IFile target,
      final Change restoreSourceChange) {
    fSource = source;
    fTarget = target;
    fRestoreSourceChange = restoreSourceChange;

    setValidationMethod(SAVE_IF_DIRTY);
  }

  @Override
  public ChangeDescriptor getDescriptor() {
    return fDescriptor;
  }

  public void setDescriptor(final ChangeDescriptor descriptor) {
    fDescriptor = descriptor;
  }

  @Override
  public final Change perform(IProgressMonitor monitor) throws CoreException,
      OperationCanceledException {
    try {
      if (monitor == null) monitor = new NullProgressMonitor();

      monitor.beginTask(getName(), 4);

      Change createDestFolderUndo = null;

      // create destination folder if required
      final IContainer parentTarget = fTarget.getParent();
      if (!parentTarget.exists()) {
        createDestFolderUndo = performCreateDestinationFolder(parentTarget,
            new SubProgressMonitor(monitor, 1));
      } else {
        monitor.worked(1);
      }

      // move resource
      final IPath destinationPath = fTarget.getFullPath();
      fSource.move(destinationPath, IResource.KEEP_HISTORY | IResource.SHALLOW,
          new SubProgressMonitor(monitor, 2));

      // restore file at source
      if (fRestoreSourceChange != null) {
        performSourceRestore(new SubProgressMonitor(monitor, 1));
      } else {
        monitor.worked(1);
      }
      return new MoveFileChange(fTarget, fSource, createDestFolderUndo);
    } finally {
      monitor.done();
    }
  }

  protected MoveFileChange createUndoChange(
      final Change createDestFolderUndo) {
    return new MoveFileChange(fTarget, fSource, createDestFolderUndo);
  }

  private Change performCreateDestinationFolder(final IContainer newResource,
      final IProgressMonitor monitor) throws CoreException {
    monitor.beginTask("Create destination folder", 2);
    try {
      final IFolder folder = ResourcesPlugin.getWorkspace().getRoot()
          .getFolder(newResource.getFullPath());
      folder.create(true, true, new SubProgressMonitor(monitor, 1));
      final DeleteResourceChange deleteChange = new DeleteResourceChange(
          newResource.getFullPath(), true);
      monitor.worked(1);
      return deleteChange;
    } finally {
      monitor.done();
    }
  }

  private void performSourceRestore(final IProgressMonitor monitor)
      throws CoreException {
    monitor.beginTask("Remove previous destination folder", 3);
    try {
      fRestoreSourceChange.initializeValidationData(new SubProgressMonitor(
          monitor, 1));
      final RefactoringStatus restoreStatus = fRestoreSourceChange
          .isValid(new SubProgressMonitor(monitor, 1));
      if (!restoreStatus.hasFatalError()) {
        fRestoreSourceChange.perform(new SubProgressMonitor(monitor, 1));
      }
    } finally {
      monitor.done();
    }
  }

  @Override
  protected IResource getModifiedResource() {
    return fSource;
  }

  @Override
  public String getName() {
    return "Rename " + fSource.getProjectRelativePath() + " -> "
        + fTarget.getProjectRelativePath();
  }

}
