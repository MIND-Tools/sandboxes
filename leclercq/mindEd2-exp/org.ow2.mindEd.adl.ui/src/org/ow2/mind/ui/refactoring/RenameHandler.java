
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
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.Pair;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.ParameterDecl;
import org.ow2.mind.adl.SubComponent;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class RenameHandler extends AbstractHandler {

  @Inject
  IResourceDescriptions                            resourceDescriptions;

  @Inject
  Provider<RenameInterfaceRefactoringProcessor>    itfRenameProvider;

  @Inject
  Provider<RenameSubComponentRefactoringProcessor> subCompRenameProvider;

  @Inject
  Provider<RenameDefinitionRefactoringProcessor>   definitionRenameProvider;

  @Inject
  Provider<RenameParameterRefactoringProcessor>    parameterRenameProvider;

  public Object execute(final ExecutionEvent event) throws ExecutionException {
    System.out.println("In RenameHandler");

    final XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
    if (editor != null) {

      final ITextSelection selection = (ITextSelection) editor
          .getSelectionProvider().getSelection();

      final Pair<EObject, IEObjectDescription> eObjectDescription = editor
          .getDocument().readOnly(
              new EObjectResolver(selection, resourceDescriptions));

      if (eObjectDescription == null) return null;

      RenameRefactoringWizard wizard = null;

      final EObject eObject = eObjectDescription.getFirst();
      if (eObject instanceof SubComponent) {
        final RenameSubComponentRefactoringProcessor subCompRename = subCompRenameProvider
            .get();
        subCompRename.setEditor(editor);
        final RenameRefactoring refactoring = new RenameRefactoring(
            subCompRename);

        wizard = new RenameRefactoringWizard(refactoring,
            RefactoringWizard.DIALOG_BASED_USER_INTERFACE
                | RefactoringWizard.PREVIEW_EXPAND_FIRST_NODE);

      } else if (eObject instanceof Interface) {
        final RenameInterfaceRefactoringProcessor itfRename = itfRenameProvider
            .get();
        itfRename.setEditor(editor);
        final RenameRefactoring refactoring = new RenameRefactoring(itfRename);

        wizard = new RenameRefactoringWizard(refactoring,
            RefactoringWizard.DIALOG_BASED_USER_INTERFACE
                | RefactoringWizard.PREVIEW_EXPAND_FIRST_NODE);

      } else if (eObject instanceof Definition) {
        final RenameDefinitionRefactoringProcessor defRename = definitionRenameProvider
            .get();
        defRename.setEditor(editor);
        final RenameDefinitionRefactoring refactoring = new RenameDefinitionRefactoring(
            defRename);

        wizard = new RenameDefinitionRefactoringWizard(refactoring,
            RefactoringWizard.PREVIEW_EXPAND_FIRST_NODE);

      } else if (eObject instanceof ParameterDecl) {
        final RenameParameterRefactoringProcessor paramRename = parameterRenameProvider
            .get();
        paramRename.setEditor(editor);
        final RenameRefactoring refactoring = new RenameRefactoring(paramRename);

        wizard = new RenameRefactoringWizard(refactoring,
            RefactoringWizard.DIALOG_BASED_USER_INTERFACE
                | RefactoringWizard.PREVIEW_EXPAND_FIRST_NODE);
      }

      if (wizard != null) {
        final RefactoringWizardOpenOperation openOperation = new RefactoringWizardOpenOperation(
            wizard);

        try {
          openOperation.run(Display.getCurrent().getActiveShell(),
              "Refactoring not possible!");
        } catch (final InterruptedException e) {
          throw new ExecutionException("Fail to execute refactoring", e);
        }
      }
    }

    return null;

  }

}
