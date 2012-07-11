
package org.ow2.mind.ui.refactoring;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.SubComponent;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class MoveHandler extends AbstractHandler {

  @Inject
  IResourceDescriptions      resourceDescriptions;

  @Inject
  IStorage2UriMapper         uriMapper;

  @Inject
  Provider<XtextResourceSet> resourceSetProvider;

  public Object execute(ExecutionEvent event) throws ExecutionException {
    System.out.println("In MoveHandler");
//
//    XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
//    if (editor != null) {
//
//      final ITextSelection selection = (ITextSelection) editor
//          .getSelectionProvider().getSelection();
//
//      final Pair<EObject, IEObjectDescription> eObjectDescription = editor
//          .getDocument().readOnly(
//              new EObjectResolver(selection, resourceDescriptions));
//
//      if (eObjectDescription == null) return null;
//
//      RenameRefactoringWizzard wizard = null;
//      
//      if (eObjectDescription.getFirst() instanceof SubComponent) {
//
//        RenameRefactoring refactoring = new RenameRefactoring(
//            new RenameSubComponentRefactoringProcessor(editor,
//                resourceDescriptions, uriMapper, resourceSetProvider.get()));
//
//        wizard = new RenameRefactoringWizzard(
//            refactoring, RefactoringWizard.DIALOG_BASED_USER_INTERFACE
//                | RefactoringWizard.PREVIEW_EXPAND_FIRST_NODE);
//      } else if (eObjectDescription.getFirst() instanceof Interface) {
//        RenameRefactoring refactoring = new RenameRefactoring(
//            new RenameInterfaceRefactoringProcessor(editor,
//                resourceDescriptions, uriMapper, resourceSetProvider.get()));
//
//        wizard = new RenameRefactoringWizzard(
//            refactoring, RefactoringWizard.DIALOG_BASED_USER_INTERFACE
//                | RefactoringWizard.PREVIEW_EXPAND_FIRST_NODE);
//      }
//      
//      if (wizard != null) {
//      RefactoringWizardOpenOperation openOperation = new RefactoringWizardOpenOperation(
//          wizard);
//      
//      try {
//        openOperation.run(Display.getCurrent().getActiveShell(),
//        "Refactoring not possible!");
//      } catch (InterruptedException e) {
//        throw new ExecutionException("Fail to execute refactoring", e);
//      }
//      }
//    }

    return null;

  }

}
