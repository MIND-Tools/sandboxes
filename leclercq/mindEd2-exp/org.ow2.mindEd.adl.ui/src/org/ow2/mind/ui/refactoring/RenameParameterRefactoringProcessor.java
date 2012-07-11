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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.Region;
import org.eclipse.ltk.core.refactoring.FileStatusContext;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.util.TextLocation;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.AttributeValue;
import org.ow2.mind.adl.ParameterDecl;
import org.ow2.mind.adl.ParameterValue;
import org.ow2.mind.adl.ParametricDefinition;

public class RenameParameterRefactoringProcessor
    extends
      RenameRefactoringProcessor {

  public static final String ID = "org.ow2.mind.ui.action.refactoring.RenameParameter";

  @Override
  protected EAttribute getNameFeature() {
    return AdlPackage.eINSTANCE.getParameterDecl_Name();
  }

  @Override
  public Pattern getNamePattern() {
    return AdlModelHelper.ID_PATTERN;
  }

  @Override
  public String getIdentifier() {
    return ID;
  }

  @Override
  public String getProcessorName() {
    return "Attribute rename processor";
  }

  // TODO should add error status check on current file or workspace.
  @Override
  public RefactoringStatus checkInitialConditions(final IProgressMonitor pm)
      throws CoreException, OperationCanceledException {
    final RefactoringStatus status = new RefactoringStatus();

    return status;
  }

  @Override
  public RefactoringStatus checkFinalConditions(final IProgressMonitor pm,
      final CheckConditionsContext context) throws CoreException,
      OperationCanceledException {
    final RefactoringStatus status = new RefactoringStatus();
    final List<IFile> modifiedFiles = new ArrayList<IFile>();

    final String newName = checkNewName(status);

    // check that the file is a modifiable file.
    final IFile declaringFile = getFile(declaringResource.getURI());
    if (declaringFile == null) {
      status.addFatalError("Can't find declaration file"
          + declaringResource.getURI().path());
      return status;
    } else {
      modifiedFiles.add(declaringFile);
    }

    // check name clashes in declaration.
    final ParameterDecl paramDecl = (ParameterDecl) element;
    final ParametricDefinition d = (ParametricDefinition) paramDecl
        .eContainer();
    for (final ParameterDecl p : d.getParameters()) {
      if (p.getName().equals(newName)) {
        // name clash found.
        final TextLocation location = RefactoringHelper.getLocation(p,
            AdlPackage.eINSTANCE.getParameterDecl_Name());
        status.addError(
            "A parameter with this name is already declared",
            new FileStatusContext(declaringFile, new Region(location
                .getOffset(), location.getLength())));
      }
    }

    // search references to the interface
    references = new HashMap<IResourceDescription, List<CrossRef>>();

    List<CrossRef> crossRefs = references.get(declaringResource);
    if (crossRefs == null) {
      crossRefs = new ArrayList<CrossRef>();
    }

    // iterate on each objects and search for ParameterValue or AttributeValue.
    final TreeIterator<Object> iter = EcoreUtil.getAllContents(d, true);
    while (iter.hasNext()) {
      final Object object = iter.next();
      if (object instanceof AttributeValue
          && ((AttributeValue) object).getRef() != null
          && ((AttributeValue) object).getRef().getName().equals(initialName)) {
        crossRefs.add(new CrossRef((AttributeValue) object,
            AdlPackage.eINSTANCE.getAttributeValue_Ref(), declaringFile,
            "Update reference"));
      } else if (object instanceof ParameterValue
          && ((ParameterValue) object).getRef() != null
          && ((ParameterValue) object).getRef().getName().equals(initialName)) {
        crossRefs.add(new CrossRef((ParameterValue) object,
            AdlPackage.eINSTANCE.getParameterValue_Ref(), declaringFile,
            "Update reference"));
      }
    }

    if (!crossRefs.isEmpty()) {
      references.put(declaringResource, crossRefs);
    }

    impactedFiles = modifiedFiles.toArray(new IFile[modifiedFiles.size()]);
    status
        .merge(ResourceChangeChecker.checkFilesToBeChanged(impactedFiles, pm));
    return status;
  }

}
