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

package org.ow2.mind.ui.wizard;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IPageChangeProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.util.StringInputStream;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.ui.wizard.NewTypeWizard.ADLContent;
import org.ow2.minded.project.builder.MindNature;

public abstract class NewDefinitionWizard extends Wizard implements INewWizard {

  IFile                   contextFile;
  NewDefinitionWizardPage page;

  protected abstract NewDefinitionWizardPage createPage();

  public void init(IWorkbench workbench, IStructuredSelection selection) {

    Object element = selection.getFirstElement();
    if (element instanceof IFile) {
      contextFile = (IFile) element;
    }
  }

  @Override
  public void addPages() {
    page = createPage();
    addPage(page);
  }

  @Override
  public boolean performFinish() {
    IFolder sourceFolder = page.getSourceFolder();
    if (sourceFolder == null) return false;
    String name = page.getFQN();
    IFile adlFile = sourceFolder.getFile(name.replace('.', '/') + ".adl");
    if (adlFile.exists()) return false;

    ADLContent content = generateContent(name);
    try {
      adlFile.create(new StringInputStream(content.content), 0, null);
    } catch (CoreException e) {
      e.printStackTrace();
      return false;
    }

    try {
      IEditorPart openEditor = IDE.openEditor(PlatformUI.getWorkbench()
          .getActiveWorkbenchWindow().getActivePage(), adlFile);
      if (openEditor instanceof ITextEditor) {
        ((ITextEditor) openEditor).selectAndReveal(content.selectOffSet, 0);
      }
    } catch (PartInitException e) {
      e.printStackTrace();
      return false;
    }

    return true;
  }

  protected abstract ADLContent generateContent(String name);

  protected void generateImports(StringBuilder sb) {
    if (!page.extendedDefs.isEmpty()) {
      // generate imports for extended defs
      for (Definition extendedDef : page.extendedDefs) {
        sb.append("import ").append(extendedDef.getName()).append(";\n");
      }
      sb.append("\n");
    }
  }
  protected void generateExtends(StringBuilder sb) {
    if (!page.extendedDefs.isEmpty()) {
      sb.append(" extends");
      Iterator<Definition> iter = page.extendedDefs.iterator();
      while (iter.hasNext()) {
        Definition extendedDef = iter.next();
        sb.append(" ").append(
            AdlModelHelper.getSimpleName(extendedDef.getName()));
        if (iter.hasNext()) {
          sb.append(",");
        }
      }
    }
  }


  public void setContainer(IWizardContainer wizardContainer) {
    super.setContainer(wizardContainer);
    if (wizardContainer instanceof IPageChangeProvider) {
      ((IPageChangeProvider) wizardContainer)
          .addPageChangedListener(new IPageChangedListener() {

            public void pageChanged(PageChangedEvent event) {
              if (event.getSelectedPage() == page) {
                page.nameText.forceFocus();
              }
            }
          });
    }

  };

  IFolder getContextSourceFolder() throws CoreException {
    if (contextFile == null) return null;
    for (IFolder srcFolder : MindNature.getNature(contextFile.getProject())
        .getConfiguration().getSourceFolders()) {
      if (srcFolder.contains(contextFile)) {
        return srcFolder;
      }
    }
    return null;
  }

  String getContextPackageName() throws CoreException {
    IFolder srcFolder = getContextSourceFolder();
    if (srcFolder == null) {
      return null;
    }

    IPath relativePath = contextFile.getParent().getFullPath()
        .makeRelativeTo(srcFolder.getFullPath());
    return relativePath.toString().replace('/', '.');
  }

}