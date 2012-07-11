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

package org.ow2.minded.project.properties;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.osgi.service.prefs.BackingStoreException;
import org.ow2.minded.project.builder.MindNature;

public class MindProjectConfiguration {

  private static final Logger log = Logger
                                      .getLogger(MindProjectConfiguration.class);

  protected final IProject    project;

  protected List<IFolder>     srcFolders;
  protected List<File>        extFolders;
  protected List<IProject>    usedProjects;

  public MindProjectConfiguration(IProject project) throws CoreException {
    this.project = project;

    // fill-in config from project preferences
    MindNature nature;
    nature = MindNature.getNature(project);
    Assert.isNotNull(nature);
    IEclipsePreferences projectSepcificPreferences = nature
        .getProjectSepcificPreferences();
    String srcPath = projectSepcificPreferences.get(
        ProjectPropertiesConstants.SOURCE_PATH, null);
    if (srcPath == null || srcPath.length() == 0) {
      projectSepcificPreferences.put(ProjectPropertiesConstants.SOURCE_PATH,
          ProjectPropertiesConstants.DEFAULT_SOURCE_PATH);
      srcPath = ProjectPropertiesConstants.DEFAULT_SOURCE_PATH;
    }
    srcFolders = ProjectPropertiesConstants.decodeSrcPath(srcPath, project);

    String extPath = projectSepcificPreferences.get(
        ProjectPropertiesConstants.EXTERNAL_PATH, null);
    if (extPath == null || extPath.length() == 0) {
      extFolders = new ArrayList<File>();
    } else {
      extFolders = ProjectPropertiesConstants.decodeExtPath(extPath);
    }

    String usedPrj = projectSepcificPreferences.get(
        ProjectPropertiesConstants.USED_PROJECT, null);
    if (usedPrj == null || usedPrj.length() == 0) {
      usedProjects = new ArrayList<IProject>();
    } else {
      usedProjects = ProjectPropertiesConstants.decodeUsedProjects(usedPrj,
          project);
    }
  }

  public void updateConfig(List<IFolder> srcFolders, List<File> extFolders,
      List<IProject> usedProjects, IProgressMonitor monitor)
      throws CoreException, BackingStoreException {
    this.srcFolders = srcFolders;
    this.extFolders = extFolders;
    this.usedProjects = usedProjects;

    MindNature nature;
    nature = MindNature.getNature(project);
    Assert.isNotNull(nature);
    IEclipsePreferences preferences = nature.getProjectSepcificPreferences();
    preferences.put(ProjectPropertiesConstants.SOURCE_PATH,
        ProjectPropertiesConstants.encodeSrcPath(srcFolders));
    preferences.put(ProjectPropertiesConstants.EXTERNAL_PATH,
        ProjectPropertiesConstants.encodeExtPath(extFolders));
    preferences.put(ProjectPropertiesConstants.USED_PROJECT,
        ProjectPropertiesConstants.encodeUsedProjects(usedProjects));
    preferences.flush();

    MindNature.notifyConfigurationChanged(this);
    project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
  }

  public IProject getProject() {
    return project;
  }

  public List<IFolder> getSourceFolders() {
    return Collections.unmodifiableList(srcFolders);
  }

  public List<File> getExternalFolders() {
    return Collections.unmodifiableList(extFolders);
  }

  public List<IProject> getUsedProjects() {
    return Collections.unmodifiableList(usedProjects);
  }

  public List<MindPackage> getPackages(final IFolder sourceFolder)
      throws CoreException {
    final List<MindPackage> result = new ArrayList<MindPackage>();
    sourceFolder.accept(new IResourceVisitor() {

      @Override
      public boolean visit(IResource resource) throws CoreException {
        if (resource instanceof IFolder) {
          result.add(new MindPackage((IFolder) resource, resource.getFullPath()
              .makeRelativeTo(sourceFolder.getFullPath()).toString()
              .replace('/', '.')));
          return true;
        }
        return false;
      }
    });
    return result;
  }

  public List<IFile> getAllAccessibleADLs() throws CoreException {
    final List<IFile> adlFiles = new ArrayList<IFile>();
    getAllAccessibleADLs(adlFiles);
    return adlFiles;
  }

  protected void getAllAccessibleADLs(List<IFile> adlFiles)
      throws CoreException {
    for (IFolder srcFolder : getSourceFolders()) {
      getADLs(adlFiles, srcFolder);
    }
    for (IProject prj : getUsedProjects()) {
      MindNature.getNature(prj).getConfiguration()
          .getAllAccessibleADLs(adlFiles);
    }

  }

  public List<IFile> getADLs(IFolder srcFolder) throws CoreException {
    final List<IFile> adlFiles = new ArrayList<IFile>();
    getADLs(adlFiles, srcFolder);
    return adlFiles;
  }

  /**
   * @param adlFiles
   * @param srcFolder
   * @throws CoreException
   */
  protected void getADLs(final List<IFile> adlFiles, IFolder srcFolder)
      throws CoreException {
    srcFolder.accept(new IResourceVisitor() {

      @Override
      public boolean visit(IResource resource) throws CoreException {
        if (resource instanceof IFile
            && "adl".equals(resource.getFileExtension())) {
          adlFiles.add((IFile) resource);
          return false;
        } else {
          return true;
        }
      }
    });
  }
}
