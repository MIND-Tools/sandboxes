package org.ow2.mindEd.itf.editor.textual.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl;
import org.ow2.mindEd.itf.editor.textual.validation.FractalItfJavaValidator;

public class FractalItfQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(FractalItfJavaValidator.WRONG_NAME)
	public void renameInterface(final Issue issue,
			IssueResolutionAcceptor acceptor) {

		acceptor.accept(
				issue, 
				"Rename", 
				"Change interface name", 
				null, 
				new ISemanticModification() {
					public void apply(EObject element,
							IModificationContext context) throws Exception {
						
						if (element instanceof InterfaceDefinitionImpl) {
							
							InterfaceDefinitionImpl interfaceDefinitionImpl = (InterfaceDefinitionImpl) element;							
							String expectedName = FractalItfJavaValidator.getExpectedInterfaceName(interfaceDefinitionImpl);							
							interfaceDefinitionImpl.setFqn(expectedName);
						}
						
					}
				});
	}

}
