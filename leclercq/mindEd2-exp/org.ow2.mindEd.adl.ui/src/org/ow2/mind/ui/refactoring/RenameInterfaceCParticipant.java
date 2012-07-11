
package org.ow2.mind.ui.refactoring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.filebuffers.ITextFileBuffer;
import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.core.filebuffers.LocationKind;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEditGroup;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.CompositeDefinition;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.PrimitiveDefinition;
import org.ow2.mind.adl.Source;
import org.ow2.mind.ui.AdlUIHelper;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class RenameInterfaceCParticipant extends RenameParticipant {

  @Inject
  protected AdlUIHelper        helper;

  @Inject
  protected IStorage2UriMapper uriMapper;

  Interface                    renamedItf;
  IFile[]                      affectedSourceFiles;

  @Override
  protected boolean initialize(Object element) {
    if (!getArguments().getUpdateReferences()) return false;
    if (!(element instanceof Interface)) return false;

    renamedItf = (Interface) element;
    if (renamedItf.eContainer() instanceof CompositeDefinition) {
      // interface is not defined in a primitive or a type. it cannot impact
      // source code.
      return false;
    }

    return true;
  }

  @Override
  public String getName() {
    return "Interface rename participant for references in C source files";
  }

  // TODO handle renaming in ADL that extends the one that contains the
  // interface
  @Override
  public RefactoringStatus checkConditions(IProgressMonitor pm,
      CheckConditionsContext context) throws OperationCanceledException {
    RefactoringStatus status = new RefactoringStatus();

    List<IFile> srcFiles = new ArrayList<IFile>();

    EObject container = renamedItf.eContainer();
    Set<AbstractDefinition> impactedDefinitions = helper
        .getAllSubDefinitions((AbstractDefinition) container);
    impactedDefinitions.add((AbstractDefinition) container);
    for (AbstractDefinition def : impactedDefinitions) {
      List<Source> sources = AdlModelHelper.getLocalSources(def);
      for (Source source : sources) {
        if (source.getPath() != null) {
          IFile srcFile = helper.resolveImplementation(source);
          if (srcFile != null) {
            srcFiles.add(srcFile);
          }
        } else if (source.getInlinedCode() != null) {
          IFile adlFile = getFile(renamedItf.eResource().getURI());
          if (adlFile != null) {
            srcFiles.add(adlFile);
          }
        }
      }
    }

    affectedSourceFiles = srcFiles.toArray(new IFile[srcFiles.size()]);
    try {
      status.merge(ResourceChangeChecker.checkFilesToBeChanged(
          affectedSourceFiles, pm));
    } catch (CoreException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return status;
  }

  protected static final Pattern METH            = Pattern
                                                     .compile("METH\\s*\\((\\w+)\\s*,");
  protected static final int     METH_IDX        = 1;

  protected static final Pattern CALL            = Pattern
                                                     .compile("CALL\\s*\\((\\w+)\\s*,");
  protected static final int     CALL_IDX        = 1;

  protected static final Pattern GET_MY_ITF      = Pattern
                                                     .compile("GET_MY_INTERFACE\\s*\\((\\w+)");
  protected static final int     GET_MY_ITF_IDX  = 1;

  protected static final Pattern BIND_MY_ITF     = Pattern
                                                     .compile("BIND_MY_INTERFACE\\s*\\((\\w+)");
  protected static final int     BIND_MY_ITF_IDX = 1;

  protected static final Pattern IS_BOUND        = Pattern
                                                     .compile("IS_BOUND\\s*\\((\\w+)");
  protected static final int     IS_BOUND_IDX    = 1;

  protected static final Pattern GET_COLL        = Pattern
                                                     .compile("GET_COLLECTION_SIZE\\s*\\((\\w+)");
  protected static final int     GET_COLL_IDX    = 1;

  @Override
  public Change createChange(IProgressMonitor pm) throws CoreException,
      OperationCanceledException {

    ITextFileBufferManager manager = FileBuffers.getTextFileBufferManager();
    CompositeChange globalChange = new CompositeChange("C source changes");

    for (IFile file : affectedSourceFiles) {

      TextFileChange documentChange = new TextFileChange("Update - "
          + file.getName(), file);
      MultiTextEdit multiEdit = new MultiTextEdit();
      documentChange.setEdit(multiEdit);
      globalChange.add(documentChange);

      IPath path = file.getFullPath();
      manager.connect(path, LocationKind.IFILE, pm);
      try {
        ITextFileBuffer buffer = manager.getTextFileBuffer(path,
            LocationKind.IFILE);
        IDocument doc = buffer.getDocument();
        String source = doc.get();

        createReplaceEdit(documentChange, multiEdit, METH.matcher(source),
            METH_IDX, "METH update");

        createReplaceEdit(documentChange, multiEdit, CALL.matcher(source),
            CALL_IDX, "METH update");

        createReplaceEdit(documentChange, multiEdit,
            GET_MY_ITF.matcher(source), GET_MY_ITF_IDX, "METH update");

        createReplaceEdit(documentChange, multiEdit,
            BIND_MY_ITF.matcher(source), BIND_MY_ITF_IDX, "METH update");

        createReplaceEdit(documentChange, multiEdit, IS_BOUND.matcher(source),
            IS_BOUND_IDX, "METH update");

        createReplaceEdit(documentChange, multiEdit, GET_COLL.matcher(source),
            GET_COLL_IDX, "METH update");

      } finally {
        manager.disconnect(path, LocationKind.IFILE, pm);
      }
    }

    return globalChange;
  }

  protected void createReplaceEdit(TextFileChange documentChange,
      MultiTextEdit multiEdit, Matcher matcher, int groupIndex, String editName) {
    while (matcher.find()) {
      String itfName = matcher.group(groupIndex);
      if (itfName.equals(renamedItf.getName())) {
        ReplaceEdit replaceEdit = new ReplaceEdit(matcher.start(groupIndex),
            matcher.end(groupIndex) - matcher.start(groupIndex), getArguments()
                .getNewName());
        multiEdit.addChild(replaceEdit);
        documentChange
            .addTextEditGroup(new TextEditGroup(editName, replaceEdit));
      }
    }
  }

  protected IFile getFile(URI uri) {
    Iterable<IStorage> storages = uriMapper.getStorages(uri);
    if (storages == null) return null;

    for (IStorage iStorage : storages) {
      if (iStorage instanceof IFile) return (IFile) iStorage;
    }
    return null;
  }
}
