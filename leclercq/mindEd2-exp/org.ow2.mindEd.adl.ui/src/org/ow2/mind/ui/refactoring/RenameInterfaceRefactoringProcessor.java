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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Binding;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.ui.refactoring.RenameRefactoringProcessor.CrossRef;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class RenameInterfaceRefactoringProcessor
    extends
      RenameRefactoringProcessor {

  public static final String ID = "org.ow2.mind.ui.action.refactoring.RenameInterface";

  @Override
  protected EAttribute getNameFeature() {
    return AdlPackage.eINSTANCE.getInterface_Name();
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
    return "Interface rename processor";
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

    // check that the file is a modifiable file.
    IFile declaringFile = getFile(declaringResource.getURI());
    if (declaringFile == null) {
      status.addFatalError("Can't find declaration file"
          + declaringResource.getURI().path());
    } else {
      modifiedFiles.add(declaringFile);
    }

    // check name clashes in declaration.
    Interface itfDecl = (Interface) element;
    AbstractDefinition d = (AbstractDefinition) itfDecl.eContainer();
    Set<AbstractDefinition> impactedDefs = new HashSet<AbstractDefinition>();
    impactedDefs.add(d);
    impactedDefs.addAll(helper.getAllSubDefinitions(d));

    for (AbstractDefinition impactedDef : impactedDefs) {
      for (Interface itf : AdlModelHelper.getAllInterfaces(impactedDef, true)) {
        if (itf.getName().equals(newName)) {
          // name clash found.
          IFile file = getFile(itf.eResource().getURI());
          FileStatusContext ctx;
          if (file != null) {
            CompositeNode node = NodeUtil.getNode(itf);
            ctx = new FileStatusContext(file, new Region(node.getOffset(),
                node.getLength()));
          } else {
            ctx = null;
          }
          status.addError("An interface with this name is already declared",
              ctx);
        }
      }
    }

    // search references to the interface
    references = new HashMap<IResourceDescription, List<CrossRef>>();

    final URI elementURI = elementDescription.getEObjectURI();

    // for each resource
    for (IResourceDescription resourceDescription : resourceDescriptions
        .getAllResourceDescriptions()) {
      // find references to the subComponentURI.
      Iterable<IReferenceDescription> referenceDescriptors = Iterables.filter(
          resourceDescription.getReferenceDescriptions(),
          new Predicate<IReferenceDescription>() {
            public boolean apply(IReferenceDescription input) {
              return elementURI.equals(input.getTargetEObjectUri());
            }
          });

      // if the resource contains no references, pass it.
      if (!referenceDescriptors.iterator().hasNext()) continue;

      // the resource contains references to subComponent.
      IFile file = getFile(resourceDescription.getURI());
      if (file == null) {
        status.addWarning("Can't find file : "
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
          if (binding.getFromItf() != null
              && binding.getFromItf().getName().equals(initialName)) {
            refs.add(new CrossRef(binding, AdlPackage.eINSTANCE
                .getBinding_FromItf(), file,
                "Update 'from' interface in binding"));
          } else if (binding.getToItf() != null
              && binding.getToItf().getName().equals(initialName)) {
            refs.add(new CrossRef(binding, AdlPackage.eINSTANCE
                .getBinding_ToItf(), file, "Update 'to' interface in binding"));
          }
        }
      }
    }

    impactedFiles = modifiedFiles.toArray(new IFile[modifiedFiles.size()]);
    status
        .merge(ResourceChangeChecker.checkFilesToBeChanged(impactedFiles, pm));
    return status;
  }

}
