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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.Region;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.FileStatusContext;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.TextLocation;
import org.eclipse.xtext.util.Triple;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Data;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionOrTemplate;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Implementation;
import org.ow2.mind.adl.Import;
import org.ow2.mind.ui.AdlUIHelper;
import org.ow2.mind.ui.MindProjectsStateHelper;
import org.ow2.mind.ui.refactoring.RenameDefinitionRefactoring.SourceRename;

import com.google.inject.Inject;

public class RenameDefinitionRefactoringProcessor
    extends
      RenameRefactoringProcessor {

  public static final String      ID = "org.ow2.mind.ui.action.refactoring.RenameDefinition";

  @Inject
  private MindProjectsStateHelper projectHelper;

  private IFile                   srcFile;
  private IFile                   destFile;

  @Override
  protected EAttribute getNameFeature() {
    return AdlPackage.eINSTANCE.getDefinitionOrTemplate_Name();
  }

  @Override
  public Pattern getNamePattern() {
    return AdlModelHelper.IMPORT_PATTERN;
  }

  @Override
  public String getIdentifier() {
    return ID;
  }

  @Override
  public String getProcessorName() {
    return "Definition rename processor";
  }

  @Override
  public Definition getElement() {
    return (Definition) super.getElement();
  }

  @Override
  public RenameDefinitionRefactoring getRefactoring() {
    return (RenameDefinitionRefactoring) super.getRefactoring();
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
    srcFile = getFile(declaringResource.getURI());
    if (srcFile == null) {
      status.addFatalError("Can't find declaration file"
          + declaringResource.getURI().path());
      return status;
    } else {
      modifiedFiles.add(srcFile);
    }

    final String initialPackageName = AdlModelHelper
        .getPackageName(initialName);
    final String initialSimpleName = AdlModelHelper.getSimpleName(initialName);

    final String newPackageName = AdlModelHelper.getPackageName(newName);
    final String newSimpleName = AdlModelHelper.getSimpleName(newName);

    final List<SourceRename> sourceRenames = getRefactoring()
        .getSourceRenames();

    final IFolder sourceFolder = projectHelper
        .getSourceFolder(declaringResource.getURI());
    final IFolder newPackageFolder = (newPackageName == null)
        ? sourceFolder
        : sourceFolder.getFolder(newPackageName);
    destFile = newPackageFolder.getFile(newSimpleName + ".adl");

    final boolean updatedPackageName = !AdlModelHelper.equalsOrNulls(
        initialPackageName, newPackageName);

    references = new HashMap<IResourceDescription, List<CrossRef>>();

    final Definition renamedDefinition = getElement();
    if (updatedPackageName) {
      // Update imports and outgoing references in renamed definition
      List<CrossRef> crossRefs = references.get(declaringResource);
      if (crossRefs == null) {
        crossRefs = new ArrayList<CrossRef>();
      }

      // remove imports that points to definitions in the newPackage
      for (final Import imp : renamedDefinition.getImports()) {
        final String importedNamespace = imp.getImportedNamespace();
        if (importedNamespace == null) continue;

        final String importPackageName = AdlModelHelper
            .getPackageName(importedNamespace);
        if (AdlModelHelper.equalsOrNulls(importPackageName, newPackageName)) {
          // the import statement is no more useful since it point to the
          // package in which the definition will be moved.
          final CompositeNode impNode = NodeUtil.getNode(imp);
          crossRefs.add(new CrossRef(impNode.getOffset(), impNode.getLength(),
              srcFile, "Remove useless import", ""));
        }
      }

      // Add imports to definitions that stay in the initialPackage
      final TreeIterator<Object> iter = EcoreUtil.getAllContents(
          renamedDefinition, true);
      final Set<String> addedImports = new HashSet<String>();
      while (iter.hasNext()) {
        final Object object = iter.next();
        if (!(object instanceof DefinitionReference)) continue;

        final DefinitionReference defRef = (DefinitionReference) object;
        // if the defRef does not references a definition in the
        // initialPackage pass it.
        final DefinitionOrTemplate referencedDef = defRef.getDefinition();
        if (referencedDef == null
            || AdlModelHelper.getPackageName(referencedDef.getName()) == null
            || (!AdlModelHelper.getPackageName(referencedDef.getName()).equals(
                initialPackageName))) continue;

        // found a defRef that references a definition that is in the initial
        // package. Checks if it uses a simple name or a FQN
        final Triple<String, Integer, Integer> definitionReferenceName = AdlUIHelper
            .findDefinitionReferenceName(defRef);
        final String defRefName = definitionReferenceName.getFirst();
        if (AdlModelHelper.getPackageName(defRefName) == null
            && addedImports.add(referencedDef.getName())) {
          // the definition is referenced by its simple name and is defined in
          // the initial package. Must insert an Import statement.
          crossRefs.add(new CrossRef(0, 0, srcFile, "Add import", "import "
              + referencedDef.getName() + ";\n"));
        }
      }

      // Check sources
      if (sourceRenames == null) {
        for (final Implementation impl : AdlModelHelper
            .getLocalImplementations(renamedDefinition)) {
          if (impl.getPath() == null) continue;
          final IPath path = new Path(impl.getPath());
          if (!path.isAbsolute()) {
            final TextLocation location = RefactoringHelper.getLocation(impl,
                AdlPackage.eINSTANCE.getImplementation_Path());
            status
                .addWarning(
                    "ADL contains relative path to implementation file that will be transformed to absolute path",
                    new FileStatusContext(srcFile, new Region(location
                        .getOffset(), location.getLength())));
            final IFile implFile = helper.resolveImplementation(impl);
            final IFolder srcFolder = projectHelper.getSourceFolder(implFile);
            final IPath newPath = implFile.getFullPath().makeRelativeTo(
                srcFolder.getFullPath());
            crossRefs.add(new CrossRef(location.getOffset(), location
                .getLength(), srcFile, (impl instanceof Data)
                ? "Update data"
                : "Update source", "/" + newPath));
          }
        }
      }

      if (!crossRefs.isEmpty()) {
        references.put(declaringResource, crossRefs);
      }

    }

    // for each resource
    for (final IResourceDescription resourceDescription : resourceDescriptions
        .getAllResourceDescriptions()) {
      final IFile file = getFile(resourceDescription.getURI());
      if (file == null) {
        status.addError("Can't find file for definition: "
            + resourceDescription.getURI().path());
        continue;
      }
      final XtextResource resource = (XtextResource) resourceSet.getResource(
          resourceDescription.getURI(), true);

      final List<CrossRef> crossRefs = new ArrayList<CrossRef>();

      final EList<EObject> contents = resource.getContents();
      if (contents == null || contents.size() != 1) continue;
      final Definition def = (Definition) contents.get(0);
      if (def.getName().equals(newName)) {
        final TextLocation location = RefactoringHelper.getLocation(def,
            AdlPackage.eINSTANCE.getDefinitionOrTemplate_Name());
        status.addFatalError("A definition with the same name already exists",
            new FileStatusContext(file, new Region(location.getOffset(),
                location.getLength())));
      }

      // check for references in import
      boolean directImportFound = false;
      final Set<String> importedSimpleNames = new HashSet<String>();
      for (final Import imp : def.getImports()) {
        final String importedNamespace = imp.getImportedNamespace();
        if (importedNamespace == null) continue;

        if (importedNamespace.equals(initialName)) {
          // an import has been found.
          crossRefs.add(new CrossRef(imp, AdlPackage.eINSTANCE
              .getImport_ImportedNamespace(), file, "Update import", newName));
          directImportFound = true;
        } else if (AdlModelHelper.equalsOrNulls(newPackageName,
            AdlModelHelper.getPackageName(importedNamespace))) {
          directImportFound = true;
        } else {
          importedSimpleNames.add(AdlModelHelper
              .getSimpleName(importedNamespace));
        }
      }

      // the definition is in the same package as the newPackageName, so it has
      // an implicit direct import
      if (AdlModelHelper.equalsOrNulls(
          AdlModelHelper.getPackageName(def.getName()), newPackageName)) {
        directImportFound = true;
      }

      // iterate on each objects and search definition references.
      final TreeIterator<Object> iter = EcoreUtil.getAllContents(def, true);
      while (iter.hasNext()) {
        final Object object = iter.next();
        if (!(object instanceof DefinitionReference)) continue;

        final DefinitionReference defRef = (DefinitionReference) object;
        // if the defRef does not references the definition that is being
        // renamed, pass.
        if (defRef.getDefinition() == null
            || (!initialName.equals(defRef.getDefinition().getName())))
          continue;

        // found a defRef that references the renamed definition. Checks if it
        // uses a simple name or a FQN
        final Triple<String, Integer, Integer> definitionReferenceName = AdlUIHelper
            .findDefinitionReferenceName(defRef);
        final String defRefName = definitionReferenceName.getFirst();

        final String newDefRefName;
        if (defRefName.equals(initialName)) {
          if (initialPackageName == null && directImportFound
              && initialSimpleName.equals(newSimpleName)) {
            newDefRefName = null;
          } else {
            // defRef uses a FQN, replace it by the new FQN
            newDefRefName = newName;
          }
        } else {
          Assert.isTrue(defRefName.equals(initialSimpleName));
          // defRef uses a simple name.
          if (!updatedPackageName) {
            // the package of the definition has not been changed
            if (importedSimpleNames.contains(newSimpleName)) {
              // the new simpleName has a clash with import statements, must
              // insert the new FQN
              newDefRefName = newName;
            } else {
              // simply update the simpleName
              newDefRefName = newSimpleName;
            }
          } else {
            // the package of the definition has been changed.
            if (directImportFound) {
              // a direct import statement for the previous definition has
              // been found. This import statement will be updated, so we can
              // simply update the simple name.
              if (!newSimpleName.equals(initialSimpleName))
                newDefRefName = newSimpleName;
              else
                newDefRefName = null;
            } else {
              // replace the simple name by the FQN
              newDefRefName = newName;
            }
          }
        }
        if (newDefRefName != null) {
          crossRefs.add(new CrossRef(definitionReferenceName.getSecond(),
              definitionReferenceName.getThird(), file, "Update reference",
              newDefRefName));
        }
      }

      if (!crossRefs.isEmpty()) {
        references.put(resourceDescription, crossRefs);
      }
    }

    // add cross ref for updated source files
    if (sourceRenames != null) {
      List<CrossRef> crossRefs = references.get(declaringResource);
      if (crossRefs == null) {
        crossRefs = new ArrayList<CrossRef>();
      }

      for (final SourceRename sourceRename : sourceRenames) {
        crossRefs.add(new CrossRef(sourceRename.source, AdlPackage.eINSTANCE
            .getImplementation_Path(), srcFile,
            (sourceRename.source instanceof Data)
                ? "Update data"
                : "Update source", sourceRename.newName));
      }

      if (!crossRefs.isEmpty()) {
        references.put(declaringResource, crossRefs);
      }
    }

    impactedFiles = modifiedFiles.toArray(new IFile[modifiedFiles.size()]);
    status
        .merge(ResourceChangeChecker.checkFilesToBeChanged(impactedFiles, pm));
    return status;
  }

  @Override
  public CompositeChange createChange(final IProgressMonitor pm)
      throws CoreException, OperationCanceledException {
    final CompositeChange change = super.createChange(pm);
    change.add(new MoveFileChange(srcFile, destFile));
    final RenameDefinitionRefactoring refactoring = getRefactoring();
    final List<SourceRename> sourceRenames = refactoring.getSourceRenames();
    if (sourceRenames != null) {
      for (final SourceRename sourceRename : sourceRenames) {
        final IFile source = helper.resolveImplementation(sourceRename.source);
        final IFile target = helper.resolvePath(new Path(sourceRename.newName),
            destFile);
        if (!source.equals(target))
          change.add(new MoveFileChange(source, target));
      }
    }
    return change;
  }
}
