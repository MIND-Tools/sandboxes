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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.ltk.core.refactoring.FileStatusContext;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Binding;
import org.ow2.mind.adl.SubComponent;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class RenameSubComponentRefactoringProcessor
    extends
      RenameRefactoringProcessor {

  public static final String ID = "org.ow2.mind.ui.action.refactoring.RenameSubComponent";

  @Override
  protected EAttribute getNameFeature() {
    return AdlPackage.eINSTANCE.getSubComponent_Name();
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
    return "Sub-component rename processor";
  }

  // TODO should add error status check on current file or workspace.
  @Override
  public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
      throws CoreException, OperationCanceledException {
    RefactoringStatus status = new RefactoringStatus();

    return status;
  }

  @Override
  public RefactoringStatus checkFinalConditions(IProgressMonitor pm,
      CheckConditionsContext context) throws CoreException,
      OperationCanceledException {
    RefactoringStatus status = new RefactoringStatus();
    List<IFile> modifiedFiles = new ArrayList<IFile>();

    String newName = checkNewName(status);

    // check that the file that declares the sub-component is a modifiable file.
    IFile declaringFile = getFile(declaringResource.getURI());
    if (declaringFile == null) {
      status.addFatalError("Modification in un-modifiable file : "
          + declaringResource.getURI().path());
    } else {
      modifiedFiles.add(declaringFile);

    }

    // check name clashes in declaration.
    SubComponent subComponent = (SubComponent) element;
    AbstractDefinition d = (AbstractDefinition) subComponent.eContainer();
    List<SubComponent> subComponents = AdlModelHelper.getAllSubComponents(d,
        true);
    for (SubComponent subComp : subComponents) {
      if (subComp.getName().equals(newName)) {
        // name clash found.
        IFile file = getFile(subComp.eResource().getURI());
        FileStatusContext ctx;
        if (file != null) {
          CompositeNode node = NodeUtil.getNode(subComp);
          ctx = new FileStatusContext(file, new Region(node.getOffset(),
              node.getLength()));
        } else {
          ctx = null;
        }
        status.addError("A sub-component with this name is already declared",
            ctx);
      }
    }

    // search references to the subComponent
    references = new HashMap<IResourceDescription, List<CrossRef>>();

    final URI subComponentURI = elementDescription.getEObjectURI();

    // for each resource
    for (IResourceDescription resourceDescription : resourceDescriptions
        .getAllResourceDescriptions()) {
      // find references to the subComponentURI.
      Iterable<IReferenceDescription> referenceDescriptors = Iterables.filter(
          resourceDescription.getReferenceDescriptions(),
          new Predicate<IReferenceDescription>() {
            public boolean apply(IReferenceDescription input) {
              return subComponentURI.equals(input.getTargetEObjectUri());
            }
          });

      // if the resource contains no references, pass it.
      if (!referenceDescriptors.iterator().hasNext()) continue;

      // the resource contains references to subComponent.
      IFile file = getFile(resourceDescription.getURI());
      if (file == null) {
        status.addWarning("Modification in un-modifiable file : "
            + declaringResource.getURI().path());
        continue;
      } else {
        modifiedFiles.add(file);
      }

      XtextResource resource = (XtextResource) resourceSet.getResource(
          resourceDescription.getURI(), true);
      List<CrossRef> refs = new ArrayList<CrossRef>();
      references.put(resourceDescription, refs);
      for (IReferenceDescription refDesc : referenceDescriptors) {
        EObject refObject = resource.getEObject(refDesc.getSourceEObjectUri()
            .fragment());
        if (refObject instanceof Binding) {
          Binding binding = (Binding) refObject;
          if (binding.getFromSubComp() != null
              && binding.getFromSubComp().getName().equals(initialName)) {
            refs.add(new CrossRef(binding, AdlPackage.eINSTANCE
                .getBinding_FromSubComp(), file,
                "Update 'from' component in binding"));
          } else if (binding.getToSubComp() != null
              && binding.getToSubComp().getName().equals(initialName)) {
            refs.add(new CrossRef(binding, AdlPackage.eINSTANCE
                .getBinding_ToSubComp(), file,
                "Update 'to' component in binding"));
          }
        }
      }
    }

    impactedFiles = modifiedFiles.toArray(new IFile[modifiedFiles.size()]);
    status
        .merge(ResourceChangeChecker.checkFilesToBeChanged(impactedFiles, pm));
    return status;
  }

  @Override
  public RefactoringParticipant[] loadParticipants(RefactoringStatus status,
      SharableParticipants sharedParticipants) throws CoreException {
    return null;
  }

}
