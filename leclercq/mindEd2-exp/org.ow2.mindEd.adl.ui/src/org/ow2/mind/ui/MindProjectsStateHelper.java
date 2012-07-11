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

package org.ow2.mind.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.containers.AbstractStorage2UriMapperClient;
import org.ow2.minded.project.builder.MindNature;
import org.ow2.minded.project.properties.MindProjectConfiguration;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class MindProjectsStateHelper extends AbstractStorage2UriMapperClient {

  private final static Logger log = Logger
                                      .getLogger(MindProjectsStateHelper.class);

  @Inject
  private IWorkspace          workspace;

  public String initHandle(final URI uri) {
    if (uri.isPlatform()) {
      final IFolder sourceFolder = getSourceFolder(uri);
      if (sourceFolder == null) return null;
      return getHandle(sourceFolder);
    } else {
      // TODO not yet supported
      return null;
    }
  }

  public Collection<URI> initContainedURIs(final String containerHandle) {
    try {
      if (isWorkspaceHandle(containerHandle)) {
        final IContainer sourceFolder = (IFolder) getFileOrIFolder(containerHandle);
        if (sourceFolder != null
            && isAccessibleMindProject(sourceFolder.getProject())) {
          final List<URI> uris = Lists.newArrayList();
          try {
            sourceFolder.accept(new IResourceVisitor() {
              public boolean visit(final IResource resource)
                  throws CoreException {
                if (resource instanceof IStorage) {
                  final URI uri = getUri((IStorage) resource);
                  if (uri != null) {
                    uris.add(uri);
                  }
                  return false;
                }
                return true;
              }
            });
            return uris;
          } catch (final CoreException e) {
            log.error(e.getMessage(), e);
          }
        }
      } else {
        // TODO Not yet supported
      }
    } catch (final IllegalArgumentException e) {
      if (log.isDebugEnabled())
        log.debug("Cannot init contained URIs for containerHandle '"
            + containerHandle + "'", e);
    }
    return Collections.emptyList();
  }

  public List<String> initVisibleHandles(final String handle) {
    try {
      if (isWorkspaceHandle(handle)) {
        final IContainer sourceFolder = (IContainer) getFileOrIFolder(handle);
        if (sourceFolder != null) {
          final IProject project = sourceFolder.getProject();
          if (isAccessibleMindProject(project)) {
            try {
              final MindProjectConfiguration configuration = MindNature
                  .getNature(project).getConfiguration();
              final List<String> result = new ArrayList<String>();

              // Add local handles of current project.
              addHandles(configuration, result);

              // Add handles of referenced projects.
              final List<IProject> usedProjects = configuration
                  .getUsedProjects();
              for (final IProject usedProject : usedProjects) {
                if (isAccessibleMindProject(usedProject)) {
                  final MindProjectConfiguration usedConfiguration = MindNature
                      .getNature(usedProject).getConfiguration();

                  addHandles(usedConfiguration, result);
                }
              }

              return result;
            } catch (final CoreException e) {
              log.error(e.getMessage(), e);
            }
          }
        }
      } else {
        // TODO handle external folders
      }
    } catch (final IllegalArgumentException e) {
      if (log.isDebugEnabled())
        log.debug("Cannot init visible handles for containerHandle '" + handle
            + "'", e);
    }
    return Collections.emptyList();
  }

  private void addHandles(final MindProjectConfiguration configuration,
      final List<String> result) {
    // add visible source folders
    final List<IFolder> sourceFolders = configuration.getSourceFolders();
    for (final IFolder sourceFolder1 : sourceFolders) {
      result.add(getHandle(sourceFolder1));
    }

    final List<File> externalFolders = configuration.getExternalFolders();
    for (final File externalFolder : externalFolders) {
      result.add(getHandle(externalFolder));
    }
  }

  protected String getHandle(final IFolder srcFolder) {
    return "S" + srcFolder.getFullPath().toString();
  }

  protected String getHandle(final File extFolder) {
    return "E" + extFolder.getAbsolutePath();
  }

  protected Object getFileOrIFolder(final String handle) {
    if (handle.length() == 0) return null;
    if (isWorkspaceHandle(handle)) {
      // return IFolder
      return getWorkspaceRoot().getFolder(new Path(handle.substring(1)));
    } else if (isExternalHandle(handle)) {
      // return File
      return new File(handle.substring(1));
    } else {
      return null;
    }
  }

  protected boolean isExternalHandle(final String handle) {
    return handle.charAt(0) == 'E';
  }

  protected boolean isWorkspaceHandle(final String handle) {
    return handle.charAt(0) == 'S';
  }

  public IFolder getSourceFolder(final URI uri) {
    if (!uri.isPlatform()) return null;
    final IFile file = getWorkspaceRoot().getFile(
        new Path(uri.toPlatformString(true)));
    if (file == null) {
      return null;
    }
    final IFolder sourceFolder = getSourceFolder(file);
    return sourceFolder;
  }

  public IFolder getSourceFolder(final IFile f) {
    List<IFolder> sourceFolders;
    MindProjectConfiguration configuration;
    try {
      final MindNature nature = MindNature.getNature(f.getProject());
      if (nature == null) return null;
      configuration = nature.getConfiguration();
      sourceFolders = configuration.getSourceFolders();
    } catch (final CoreException e) {
      log.error(e.getMessage(), e);
      return null;
    }
    for (final IFolder sourceFolder : sourceFolders) {
      if (sourceFolder.contains(f)) return sourceFolder;
    }
    // TODO check external directories
    return null;
  }

  protected boolean isAccessibleMindProject(final IProject p) {
    return p != null && XtextProjectHelper.hasNature(p)
        && MindNature.hasNature(p);
  }

  protected IWorkspaceRoot getWorkspaceRoot() {
    return workspace.getRoot();
  }

  public void setWorkspace(final IWorkspace workspace) {
    this.workspace = workspace;
  }
}
