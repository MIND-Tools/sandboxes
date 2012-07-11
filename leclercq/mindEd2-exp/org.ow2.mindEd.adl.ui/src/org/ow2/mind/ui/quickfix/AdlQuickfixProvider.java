
package org.ow2.mind.ui.quickfix;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.ParameterDecl;
import org.ow2.mind.validation.AdlJavaValidator;

public class AdlQuickfixProvider extends DefaultQuickfixProvider {

  @Fix(AdlJavaValidator.MISSING_PARAMETERS_ERROR_ID)
  public void addParameters(final Issue issue, IssueResolutionAcceptor acceptor) {
    String[] issueData = issue.getData();
    acceptor.accept(issue, "Add parameters",
        "Add parameters to the reference of the definition " + issueData[0],
        null, new ISemanticModification() {

          public void apply(EObject element, IModificationContext context)
              throws Exception {
            // TODO how to provide a template that allows to easily iterate over
            // parameter values
            DefinitionReference reference = (DefinitionReference) element;
            Definition referencedDefinition = (Definition) reference.getDefinition();
            List<ParameterDecl> parameters = AdlModelHelper
                .getParameters(referencedDefinition);
            if (parameters != null && parameters.size() > 0) {
              IXtextDocument document = context.getXtextDocument();
              int offset = issue.getOffset() + issue.getLength();
              String paramString = "(";
              for (int i = 0; i < parameters.size() - 1; i++) {
                paramString += ", ";
              }
              paramString += ")";
              document.replace(offset, 0, paramString);
            }
          }

        });
  }

}
