package org.ow2.mindEd.adl.textual.ui.quickfix;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
/*
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
*/
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.FormalArgument;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.TemplateSpecifier;
import org.ow2.mindEd.adl.impl.AdlDefinitionImpl;
import org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl;
import org.ow2.mindEd.adl.impl.InterfaceDefinitionImpl;
import org.ow2.mindEd.adl.textual.util.FractalUtil;
import org.ow2.mindEd.adl.textual.validation.FractalJavaValidator;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindcErrorCodes;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindPackage;

public class FractalQuickfixProvider extends DefaultQuickfixProvider {

	/*
	 * Renaming quickfixes
	 */
	
	@Fix(FractalJavaValidator.DUPLICATE_INTERFACE_NAME)
	public void renameInterface(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename this interface", null,
				new ISemanticModification() {
					public void apply(EObject element,
							IModificationContext context) throws Exception {

						if (element instanceof InterfaceDefinition) {
							InterfaceDefinition interfaceDefinition = (InterfaceDefinition) element;
							String name = interfaceDefinition.getName();
							
							interfaceDefinition.setName(rename(name));
						}

					}
				});
	}
	
	@Fix(FractalJavaValidator.DUPLICATE_FORMAL_ARGUMENT_NAME)
	public void renameArgument(final Issue issue, 
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename this duplicate argument.", null,
				new ISemanticModification() {

					public void apply(EObject element,
							IModificationContext context) throws Exception {
						
						if (element instanceof FormalArgument) {
							FormalArgument formalDefinition = (FormalArgument) element;
							String newName = rename(formalDefinition.getName());
							
							formalDefinition.setName(newName);
						}
					}
				});
	}
	
	@Fix(FractalJavaValidator.DUPLICATE_TEMPLATE_SPECIFIER_NAME)
	public void renameTemplateSpecifierName(final Issue issue, 
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename duplicate template specifier name.", null,
				new ISemanticModification() {

					public void apply(EObject element,
							IModificationContext context) throws Exception {
						
						if (element instanceof TemplateSpecifier) {
							TemplateSpecifier templateSpecifier= (TemplateSpecifier) element;
							String newName = rename(templateSpecifier.getName());
							
							templateSpecifier.setName(newName);
						}
					}
				});
	}
	
	/**
	 * Rename, for example : 
	 * 		toto -> toto1
	 * 		toto1 -> toto2
	 * @param name to refactor
	 * @return
	 */
	public static String rename(String name){
		
		String newName;
		
		if (Character.isDigit(name
				.charAt(name.length()-1))) {
			newName = name.substring(0, name.length() - 1);
			int nbr = Integer.parseInt(((name.substring(name.length()-1)))) + 1;
			newName = newName + nbr ;
			
		} else {
			newName = name + 1;
		}
		
		return newName;
	}
	
	/*
	 * Unknown element quickfixes 
	 */

	@Fix(FractalJavaValidator.UNKNOWN_IMPORT)
	public void fixUnkownImport(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove unknown import",
				"Remove this unavailable package.", null,
				new ISemanticModification() {

					public void apply(EObject element,
							IModificationContext context) throws Exception {
						if (element instanceof ImportDefinition)
							EcoreUtil.delete(element);
					}
				});
	}
	
	@Fix(FractalJavaValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE)
	public void fixUnknownTemplateSpecifierType(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove",
				"Remove unknown template specifier type", null,
				new ISemanticModification() {

					public void apply(EObject element,
							IModificationContext context) throws Exception {
						if (element instanceof TemplateSpecifier)
							EcoreUtil.delete(element);
					}
				});
	}	
	

	@Fix(FractalJavaValidator.UNKNOWN_INTERFACE)
	public void createInterface(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
				"Create interface " + issue.getData()[0],
				"Create a new interface definition file " 
					+ issue.getData()[0]
					+ " in package " 
					+ issue.getData()[1] 
					+ ".",
				null,
				new ISemanticModification() {
					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {

						if (element instanceof InterfaceDefinition){
							
							InterfaceDefinition itf = (InterfaceDefinitionImpl) element;
							AdlDefinitionImpl adlDefinition = (AdlDefinitionImpl) FractalUtil.getArchitecureDefinitionFromChild(itf).eContainer();
							
							URI uri = adlDefinition.eDirectResource().getURI();
							MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(uri);
							
							MindIdeCore.createITFTemplate(
									pack,
									itf.getSignature(),
									itf.getSignature(),
									null);
						}
					}
				});
	}

	
	// SSZ: Quick dirty fix migrating from 1.0 to 2.0 ; TODO: check what should be done !
	/*
	@Fix(MindcErrorCodes.CODE_KEY_ADL_3)
	public void removeTemplateParameter(final Issue issue, IssueResolutionAcceptor acceptor) {
		
			final int offset = issue.getOffset();
			final int length = issue.getLength();
			
			acceptor.accept(issue, "Mon quick fix xtext pour erreur mindc Invalid Template Parameter",
				"corriger erreur mindc en enlevant le parametre de template",null,
				new ISemanticModification() {

					public void apply(EObject adlDefinition,
							IModificationContext context) throws Exception {
					
					CompositeNode astRoot = NodeUtil.getRootNode(adlDefinition);
					
					AbstractNode astNode = NodeUtil.findLeafNodeAtOffset(astRoot, offset);
					EObject eObject = NodeUtil.getNearestSemanticObject(astNode);
					
					if (eObject != null && eObject instanceof ComponentReference) {
						ComponentReference reference = (ComponentReference) eObject;
						reference.unsetTemplatesList();
						//reference.setReferenceName("fixed");
					}

				}
			});
			

			acceptor.accept(issue, "Replace text",
					"replace text",null,
					new IModification() {
				
					public void apply(IModificationContext context) throws Exception {
						
						IXtextDocument document = context.getXtextDocument();
						document.replace(offset, length, "fixed text");					}
				});

	}*/

	@Fix(FractalJavaValidator.UNKNOWN_SOURCE_FILE)
	public void createSourceFile(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
				"Create source " + issue.getData()[0],
				"Create the associated source file " 
					+ issue.getData()[0] + ".",
				null,
				new ISemanticModification() {
					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {

						if (element instanceof ImplementationDefinition){
							
							ImplementationDefinition impl = (ImplementationDefinitionImpl) element;
							AdlDefinitionImpl adlDefinition = (AdlDefinitionImpl) FractalUtil.getArchitecureDefinitionFromChild(impl).eContainer();
							
							URI uri = adlDefinition.eDirectResource().getURI();
							MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(uri);
							
							// we remove the .c extension for being compliant with the MindIdeCore C template creator
							String sourceFileName = issue.getData()[0];
							int i = sourceFileName.lastIndexOf(".");
							sourceFileName = sourceFileName.substring(0, i);
							
							MindIdeCore.createCTemplate(
									pack,
									adlDefinition.getArchitecturedefinition().getNameFQN(),
									sourceFileName,
									null);
						}
					}
				});
	}
}
