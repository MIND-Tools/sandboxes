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

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.ParticipantManager;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.RenameArguments;
import org.eclipse.ltk.core.refactoring.participants.RenameProcessor;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;
import org.eclipse.ltk.internal.core.refactoring.resource.ResourceProcessors;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEditGroup;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.TextLocation;
import org.eclipse.xtext.util.Triple;
import org.ow2.mind.ui.AdlUIHelper;

import com.google.inject.Inject;

public abstract class RenameRefactoringProcessor extends RenameProcessor {

  @Inject
  protected IResourceDescriptions                     resourceDescriptions;

  @Inject
  protected IStorage2UriMapper                        uriMapper;

  @Inject
  protected XtextResourceSet                          resourceSet;

  @Inject
  protected AdlUIHelper                               helper;

  protected IEObjectDescription                       elementDescription;
  protected EObject                                   element;
  protected String                                    initialName;
  protected TextLocation                              declarationLocation;
  protected IResourceDescription                      declaringResource;
  protected Map<IResourceDescription, List<CrossRef>> references;
  protected IFile[]                                   impactedFiles;

  protected abstract EAttribute getNameFeature();

  public abstract Pattern getNamePattern();

  public void setEditor(final XtextEditor editor) {
    final ITextSelection selection = (ITextSelection) editor
        .getSelectionProvider().getSelection();

    final Triple<EObject, IEObjectDescription, IResourceDescription> object = editor
        .getDocument().readOnly(
            new EObjectResolver(selection, resourceDescriptions));

    if (object != null) {
      elementDescription = object.getSecond();
      element = object.getFirst();

      declarationLocation = RefactoringHelper.getLocation(element,
          getNameFeature());
      initialName = (String) element.eGet(getNameFeature());
      declaringResource = object.getThird();
    }
  }

  @Override
  public RenameRefactoring getRefactoring() {
    return (RenameRefactoring) super.getRefactoring();
  }

  @Override
  public Object[] getElements() {
    return new Object[]{element};
  }

  public EObject getElement() {
    return element;
  }

  public String getInitialName() {
    return initialName;
  }

  @Override
  public boolean isApplicable() throws CoreException {
    return elementDescription != null;
  }

  @Override
  public CompositeChange createChange(final IProgressMonitor pm)
      throws CoreException, OperationCanceledException {
    pm.beginTask("Rename Refactoring", IProgressMonitor.UNKNOWN);

    final String newText = getRefactoring().getNewName();

    IFile file = getFile(declaringResource.getURI());

    final CompositeChange globalChange = new CompositeChange("ADL changes");
    globalChange.markAsSynthetic();

    // changes in declaration file.
    TextFileChange documentChange = new TextFileChange("Update - "
        + file.getName(), file);
    globalChange.add(documentChange);

    // DocumentChange documentChange = new DocumentChange(
    // "Sub-component renaming - " + file.getName(), editor
    // .getDocument());

    MultiTextEdit multiEdit = new MultiTextEdit();
    documentChange.setEdit(multiEdit);

    ReplaceEdit replaceEdit = new ReplaceEdit(declarationLocation.getOffset(),
        declarationLocation.getLength(), newText);
    multiEdit.addChild(replaceEdit);
    documentChange.addTextEditGroup(new TextEditGroup("Declaration update",
        replaceEdit));
    pm.worked(1);

    if (getRefactoring().isUpdateReferences()) {
      // add reference changes in declaration file.

      final List<CrossRef> declCrossRefs = references.get(declaringResource);
      if (declCrossRefs != null) {
        for (final CrossRef crossRef : declCrossRefs) {
          replaceEdit = crossRef.createReplaceEdit();
          documentChange.addTextEditGroup(new TextEditGroup(crossRef.name,
              replaceEdit));
          multiEdit.addChild(replaceEdit);
          pm.worked(1);
        }
      }

      for (final Entry<IResourceDescription, List<CrossRef>> crossRefs : references
          .entrySet()) {
        if (crossRefs.getKey() == declaringResource) continue;

        file = getFile(crossRefs.getKey().getURI());
        documentChange = new TextFileChange("Update - " + file.getName(), file);
        globalChange.add(documentChange);
        multiEdit = new MultiTextEdit();
        documentChange.setEdit(multiEdit);

        for (final CrossRef crossRef : crossRefs.getValue()) {
          replaceEdit = crossRef.createReplaceEdit();
          documentChange.addTextEditGroup(new TextEditGroup(crossRef.name,
              replaceEdit));
          multiEdit.addChild(replaceEdit);
          pm.worked(1);
        }
      }

    }
    return globalChange;

  }

  @Override
  public RefactoringParticipant[] loadParticipants(
      final RefactoringStatus status,
      final SharableParticipants sharedParticipants) throws CoreException {
    final String[] affectedNatures = ResourceProcessors
        .computeAffectedNatures(impactedFiles);
    final RenameArguments renameArgs = new RenameArguments(getRefactoring()
        .getNewName(), getRefactoring().isUpdateReferences());

    return ParticipantManager.loadRenameParticipants(status, this, element,
        renameArgs, affectedNatures, sharedParticipants);
  }

  protected IFile getFile(final URI uri) {
    final Iterable<IStorage> storages = uriMapper.getStorages(uri);
    if (storages == null) return null;

    for (final IStorage iStorage : storages) {
      if (iStorage instanceof IFile) return (IFile) iStorage;
    }
    return null;
  }

  protected String checkNewName(final RefactoringStatus status) {
    final String newName = getRefactoring().getNewName();
    if (initialName.equals(newName)) {
      status.addFatalError("Name unchanged!");
    } else if (newName.length() <= 0) {
      status.addFatalError("name must not be empty!");
    } else if (!getNamePattern().matcher(newName).matches()) {
      status.addFatalError("Invalid new name");
    }
    return newName;
  }

  protected class CrossRef {
    final String name;
    final String newText;
    final IFile  file;
    final int    offset;
    final int    length;

    protected CrossRef(final EObject eObject, final EStructuralFeature feature,
        final IFile file, final String name) {
      this(eObject, feature, file, name, null);
    }

    protected CrossRef(final EObject eObject, final EStructuralFeature feature,
        final IFile file, final String name, final String newText) {
      this.file = file;
      this.name = name;
      this.newText = (newText == null)
          ? getRefactoring().getNewName()
          : newText;
      final List<AbstractNode> nodes = NodeUtil.findNodesForFeature(eObject,
          feature);
      Assert.isTrue(nodes.size() == 1);
      offset = nodes.get(0).getOffset();
      length = nodes.get(0).getLength();
    }

    protected CrossRef(final int offset, final int length, final IFile file,
        final String name) {
      this(offset, length, file, name, null);
    }

    protected CrossRef(final int offset, final int length, final IFile file,
        final String name, final String newText) {
      this.file = file;
      this.name = name;
      this.newText = (newText == null)
          ? getRefactoring().getNewName()
          : newText;
      this.offset = offset;
      this.length = length;
    }

    ReplaceEdit createReplaceEdit() {
      return new ReplaceEdit(offset, length, newText);
    }
  }
}