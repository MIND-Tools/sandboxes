/*
* generated by Xtext
*/
package org.ow2.mindEd.adl.textual.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;

public class FractalParser extends AbstractContentAssistParser {
	
	@Inject
	private FractalGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal.InternalFractalParser createParser() {
		org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal.InternalFractalParser result = new org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal.InternalFractalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getArchitectureDefinitionAccess().getAlternatives(), "rule__ArchitectureDefinition__Alternatives");
					put(grammarAccess.getCompositeDefinitionAccess().getElementsAlternatives_7_0(), "rule__CompositeDefinition__ElementsAlternatives_7_0");
					put(grammarAccess.getPrimitiveDefinitionAccess().getElementsAlternatives_7_0(), "rule__PrimitiveDefinition__ElementsAlternatives_7_0");
					put(grammarAccess.getTypeDefinitionAccess().getElementsAlternatives_5_0(), "rule__TypeDefinition__ElementsAlternatives_5_0");
					put(grammarAccess.getHostedInterfaceDefinitionAccess().getAlternatives(), "rule__HostedInterfaceDefinition__Alternatives");
					put(grammarAccess.getSubComponentBodyAccess().getAlternatives(), "rule__SubComponentBody__Alternatives");
					put(grammarAccess.getSubComponentCompositeBodyAccess().getElementsAlternatives_2_0(), "rule__SubComponentCompositeBody__ElementsAlternatives_2_0");
					put(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAlternatives_2_0(), "rule__SubComponentPrimitiveBody__ElementsAlternatives_2_0");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getCompositeElementAccess().getAlternatives(), "rule__CompositeElement__Alternatives");
					put(grammarAccess.getPrimitiveElementAccess().getAlternatives(), "rule__PrimitiveElement__Alternatives");
					put(grammarAccess.getBindingDefinitionAccess().getAlternatives_2(), "rule__BindingDefinition__Alternatives_2");
					put(grammarAccess.getBindingDefinitionAccess().getAlternatives_7(), "rule__BindingDefinition__Alternatives_7");
					put(grammarAccess.getAttributeTypeAccess().getAlternatives(), "rule__AttributeType__Alternatives");
					put(grammarAccess.getSignedINTAccess().getAlternatives_0(), "rule__SignedINT__Alternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getImplementationDefinitionAccess().getAlternatives_2(), "rule__ImplementationDefinition__Alternatives_2");
					put(grammarAccess.getDataDefinitionAccess().getAlternatives_2(), "rule__DataDefinition__Alternatives_2");
					put(grammarAccess.getPathAccess().getAlternatives_0(), "rule__Path__Alternatives_0");
					put(grammarAccess.getPathAccess().getAlternatives_1_1(), "rule__Path__Alternatives_1_1");
					put(grammarAccess.getAnnotationAccess().getNameAlternatives_1_0(), "rule__Annotation__NameAlternatives_1_0");
					put(grammarAccess.getElementValueAccess().getAlternatives(), "rule__ElementValue__Alternatives");
					put(grammarAccess.getConstantFormatAccess().getAlternatives(), "rule__ConstantFormat__Alternatives");
					put(grammarAccess.getAdlDefinitionAccess().getGroup(), "rule__AdlDefinition__Group__0");
					put(grammarAccess.getImportDefinitionAccess().getGroup(), "rule__ImportDefinition__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getCompositeDefinitionAccess().getGroup(), "rule__CompositeDefinition__Group__0");
					put(grammarAccess.getCompositeDefinitionAccess().getGroup_5(), "rule__CompositeDefinition__Group_5__0");
					put(grammarAccess.getPrimitiveDefinitionAccess().getGroup(), "rule__PrimitiveDefinition__Group__0");
					put(grammarAccess.getPrimitiveDefinitionAccess().getGroup_5(), "rule__PrimitiveDefinition__Group_5__0");
					put(grammarAccess.getTypeDefinitionAccess().getGroup(), "rule__TypeDefinition__Group__0");
					put(grammarAccess.getTypeDefinitionAccess().getGroup_3(), "rule__TypeDefinition__Group_3__0");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getGroup(), "rule__ProvidedInterfaceDefinition__Group__0");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getGroup_5(), "rule__ProvidedInterfaceDefinition__Group_5__0");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getGroup(), "rule__RequiredInterfaceDefinition__Group__0");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getGroup_6(), "rule__RequiredInterfaceDefinition__Group_6__0");
					put(grammarAccess.getSubComponentDefinitionAccess().getGroup(), "rule__SubComponentDefinition__Group__0");
					put(grammarAccess.getSubComponentDefinitionAccess().getGroup_3(), "rule__SubComponentDefinition__Group_3__0");
					put(grammarAccess.getSubComponentDefinitionAccess().getGroup_3_2(), "rule__SubComponentDefinition__Group_3_2__0");
					put(grammarAccess.getSubComponentDefinitionAccess().getGroup_4(), "rule__SubComponentDefinition__Group_4__0");
					put(grammarAccess.getSubComponentDefinitionAccess().getGroup_4_2(), "rule__SubComponentDefinition__Group_4_2__0");
					put(grammarAccess.getSubComponentCompositeBodyAccess().getGroup(), "rule__SubComponentCompositeBody__Group__0");
					put(grammarAccess.getSubComponentPrimitiveBodyAccess().getGroup(), "rule__SubComponentPrimitiveBody__Group__0");
					put(grammarAccess.getBindingDefinitionAccess().getGroup(), "rule__BindingDefinition__Group__0");
					put(grammarAccess.getBindingDefinitionAccess().getGroup_5(), "rule__BindingDefinition__Group_5__0");
					put(grammarAccess.getBindingDefinitionAccess().getGroup_10(), "rule__BindingDefinition__Group_10__0");
					put(grammarAccess.getFormalArgumentsListAccess().getGroup(), "rule__FormalArgumentsList__Group__0");
					put(grammarAccess.getFormalArgumentsListAccess().getGroup_2(), "rule__FormalArgumentsList__Group_2__0");
					put(grammarAccess.getTemplateSpecifierAccess().getGroup(), "rule__TemplateSpecifier__Group__0");
					put(grammarAccess.getTemplateSpecifiersListAccess().getGroup(), "rule__TemplateSpecifiersList__Group__0");
					put(grammarAccess.getTemplateSpecifiersListAccess().getGroup_1(), "rule__TemplateSpecifiersList__Group_1__0");
					put(grammarAccess.getTemplateSpecifiersListAccess().getGroup_1_1(), "rule__TemplateSpecifiersList__Group_1_1__0");
					put(grammarAccess.getSignedINTAccess().getGroup(), "rule__SignedINT__Group__0");
					put(grammarAccess.getHexadecimalTypeAccess().getGroup(), "rule__HexadecimalType__Group__0");
					put(grammarAccess.getTemplateDefinitionAccess().getGroup(), "rule__TemplateDefinition__Group__0");
					put(grammarAccess.getTemplateDefinitionAccess().getGroup_0(), "rule__TemplateDefinition__Group_0__0");
					put(grammarAccess.getArgumentDefinitionAccess().getGroup(), "rule__ArgumentDefinition__Group__0");
					put(grammarAccess.getArgumentDefinitionAccess().getGroup_0(), "rule__ArgumentDefinition__Group_0__0");
					put(grammarAccess.getAttributeDefinitionAccess().getGroup(), "rule__AttributeDefinition__Group__0");
					put(grammarAccess.getAttributeDefinitionAccess().getGroup_4(), "rule__AttributeDefinition__Group_4__0");
					put(grammarAccess.getImplementationDefinitionAccess().getGroup(), "rule__ImplementationDefinition__Group__0");
					put(grammarAccess.getDataDefinitionAccess().getGroup(), "rule__DataDefinition__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getFileCAccess().getGroup(), "rule__FileC__Group__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
					put(grammarAccess.getPathAccess().getGroup_1_1_0(), "rule__Path__Group_1_1_0__0");
					put(grammarAccess.getFileNameAccess().getGroup(), "rule__FileName__Group__0");
					put(grammarAccess.getFileNameAccess().getGroup_1(), "rule__FileName__Group_1__0");
					put(grammarAccess.getAnnotationsListAccess().getGroup(), "rule__AnnotationsList__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2_2(), "rule__Annotation__Group_2_2__0");
					put(grammarAccess.getAnnotationElementAccess().getGroup(), "rule__AnnotationElement__Group__0");
					put(grammarAccess.getAnnotationElementAccess().getGroup_0(), "rule__AnnotationElement__Group_0__0");
					put(grammarAccess.getElementValueArrayInitializerAccess().getGroup(), "rule__ElementValueArrayInitializer__Group__0");
					put(grammarAccess.getElementValueArrayInitializerAccess().getGroup_2(), "rule__ElementValueArrayInitializer__Group_2__0");
					put(grammarAccess.getAdlDefinitionAccess().getImportsAssignment_0(), "rule__AdlDefinition__ImportsAssignment_0");
					put(grammarAccess.getAdlDefinitionAccess().getArchitectureDefinitionAssignment_1(), "rule__AdlDefinition__ArchitectureDefinitionAssignment_1");
					put(grammarAccess.getImportDefinitionAccess().getAnnotationsListAssignment_0(), "rule__ImportDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getImportDefinitionAccess().getImportedNamespaceAssignment_2(), "rule__ImportDefinition__ImportedNamespaceAssignment_2");
					put(grammarAccess.getCompositeDefinitionAccess().getAnnotationsListAssignment_0(), "rule__CompositeDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getCompositeDefinitionAccess().getNameAssignment_2(), "rule__CompositeDefinition__NameAssignment_2");
					put(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersListAssignment_3(), "rule__CompositeDefinition__TemplateSpecifiersListAssignment_3");
					put(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListAssignment_4(), "rule__CompositeDefinition__CompositeFormalArgumentsListAssignment_4");
					put(grammarAccess.getCompositeDefinitionAccess().getSuperTypeAssignment_5_1(), "rule__CompositeDefinition__SuperTypeAssignment_5_1");
					put(grammarAccess.getCompositeDefinitionAccess().getElementsAssignment_7(), "rule__CompositeDefinition__ElementsAssignment_7");
					put(grammarAccess.getPrimitiveDefinitionAccess().getAnnotationsListAssignment_0(), "rule__PrimitiveDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getPrimitiveDefinitionAccess().getAbstractAssignment_1(), "rule__PrimitiveDefinition__AbstractAssignment_1");
					put(grammarAccess.getPrimitiveDefinitionAccess().getNameAssignment_3(), "rule__PrimitiveDefinition__NameAssignment_3");
					put(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListAssignment_4(), "rule__PrimitiveDefinition__CompositeFormalArgumentsListAssignment_4");
					put(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypeAssignment_5_1(), "rule__PrimitiveDefinition__SuperTypeAssignment_5_1");
					put(grammarAccess.getPrimitiveDefinitionAccess().getElementsAssignment_7(), "rule__PrimitiveDefinition__ElementsAssignment_7");
					put(grammarAccess.getTypeDefinitionAccess().getAnnotationsListAssignment_0(), "rule__TypeDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getTypeDefinitionAccess().getNameAssignment_2(), "rule__TypeDefinition__NameAssignment_2");
					put(grammarAccess.getTypeDefinitionAccess().getSuperTypeAssignment_3_1(), "rule__TypeDefinition__SuperTypeAssignment_3_1");
					put(grammarAccess.getTypeDefinitionAccess().getElementsAssignment_5(), "rule__TypeDefinition__ElementsAssignment_5");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAssignment_0(), "rule__ProvidedInterfaceDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getRoleAssignment_1(), "rule__ProvidedInterfaceDefinition__RoleAssignment_1");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getSignatureAssignment_2(), "rule__ProvidedInterfaceDefinition__SignatureAssignment_2");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getNameAssignment_4(), "rule__ProvidedInterfaceDefinition__NameAssignment_4");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionAssignment_5_0(), "rule__ProvidedInterfaceDefinition__CollectionAssignment_5_0");
					put(grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionsizeAssignment_5_1(), "rule__ProvidedInterfaceDefinition__CollectionsizeAssignment_5_1");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAssignment_0(), "rule__RequiredInterfaceDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getRoleAssignment_1(), "rule__RequiredInterfaceDefinition__RoleAssignment_1");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getOptionalAssignment_2(), "rule__RequiredInterfaceDefinition__OptionalAssignment_2");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getSignatureAssignment_3(), "rule__RequiredInterfaceDefinition__SignatureAssignment_3");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getNameAssignment_5(), "rule__RequiredInterfaceDefinition__NameAssignment_5");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionAssignment_6_0(), "rule__RequiredInterfaceDefinition__CollectionAssignment_6_0");
					put(grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionsizeAssignment_6_1(), "rule__RequiredInterfaceDefinition__CollectionsizeAssignment_6_1");
					put(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAssignment_0(), "rule__SubComponentDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getSubComponentDefinitionAccess().getTypeAssignment_2(), "rule__SubComponentDefinition__TypeAssignment_2");
					put(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListAssignment_3_1(), "rule__SubComponentDefinition__TemplatesListAssignment_3_1");
					put(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListAssignment_3_2_1(), "rule__SubComponentDefinition__TemplatesListAssignment_3_2_1");
					put(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListAssignment_4_1(), "rule__SubComponentDefinition__ArgumentsListAssignment_4_1");
					put(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListAssignment_4_2_1(), "rule__SubComponentDefinition__ArgumentsListAssignment_4_2_1");
					put(grammarAccess.getSubComponentDefinitionAccess().getNameAssignment_6(), "rule__SubComponentDefinition__NameAssignment_6");
					put(grammarAccess.getSubComponentDefinitionAccess().getBodyAssignment_7(), "rule__SubComponentDefinition__BodyAssignment_7");
					put(grammarAccess.getSubComponentCompositeBodyAccess().getAnonymousAssignment_0(), "rule__SubComponentCompositeBody__AnonymousAssignment_0");
					put(grammarAccess.getSubComponentCompositeBodyAccess().getElementsAssignment_2(), "rule__SubComponentCompositeBody__ElementsAssignment_2");
					put(grammarAccess.getSubComponentPrimitiveBodyAccess().getAnonymousAssignment_0(), "rule__SubComponentPrimitiveBody__AnonymousAssignment_0");
					put(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAssignment_2(), "rule__SubComponentPrimitiveBody__ElementsAssignment_2");
					put(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAssignment_0(), "rule__BindingDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getBindingDefinitionAccess().getSourceParentAssignment_2_1(), "rule__BindingDefinition__SourceParentAssignment_2_1");
					put(grammarAccess.getBindingDefinitionAccess().getSourceInterfaceAssignment_4(), "rule__BindingDefinition__SourceInterfaceAssignment_4");
					put(grammarAccess.getBindingDefinitionAccess().getSourceIndexAssignment_5_1(), "rule__BindingDefinition__SourceIndexAssignment_5_1");
					put(grammarAccess.getBindingDefinitionAccess().getTargetParentAssignment_7_1(), "rule__BindingDefinition__TargetParentAssignment_7_1");
					put(grammarAccess.getBindingDefinitionAccess().getTargetInterfaceAssignment_9(), "rule__BindingDefinition__TargetInterfaceAssignment_9");
					put(grammarAccess.getBindingDefinitionAccess().getTargetIndexAssignment_10_1(), "rule__BindingDefinition__TargetIndexAssignment_10_1");
					put(grammarAccess.getFormalArgumentAccess().getNameAssignment(), "rule__FormalArgument__NameAssignment");
					put(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsAssignment_1(), "rule__FormalArgumentsList__FormalArgumentsAssignment_1");
					put(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsAssignment_2_1(), "rule__FormalArgumentsList__FormalArgumentsAssignment_2_1");
					put(grammarAccess.getTemplateSpecifierAccess().getNameAssignment_0(), "rule__TemplateSpecifier__NameAssignment_0");
					put(grammarAccess.getTemplateSpecifierAccess().getReferenceAssignment_2(), "rule__TemplateSpecifier__ReferenceAssignment_2");
					put(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersAssignment_1_0(), "rule__TemplateSpecifiersList__TemplateSpecifiersAssignment_1_0");
					put(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersAssignment_1_1_1(), "rule__TemplateSpecifiersList__TemplateSpecifiersAssignment_1_1_1");
					put(grammarAccess.getTemplateDefinitionAccess().getNameAssignment_0_0(), "rule__TemplateDefinition__NameAssignment_0_0");
					put(grammarAccess.getTemplateDefinitionAccess().getReferenceAssignment_1(), "rule__TemplateDefinition__ReferenceAssignment_1");
					put(grammarAccess.getArgumentDefinitionAccess().getArgumentNameAssignment_0_0(), "rule__ArgumentDefinition__ArgumentNameAssignment_0_0");
					put(grammarAccess.getArgumentDefinitionAccess().getArgumentValueAssignment_1(), "rule__ArgumentDefinition__ArgumentValueAssignment_1");
					put(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAssignment_0(), "rule__AttributeDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2(), "rule__AttributeDefinition__TypeAssignment_2");
					put(grammarAccess.getAttributeDefinitionAccess().getAttributeNameAssignment_3(), "rule__AttributeDefinition__AttributeNameAssignment_3");
					put(grammarAccess.getAttributeDefinitionAccess().getValueAssignment_4_1(), "rule__AttributeDefinition__ValueAssignment_4_1");
					put(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAssignment_0(), "rule__ImplementationDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getImplementationDefinitionAccess().getFileCAssignment_2_0(), "rule__ImplementationDefinition__FileCAssignment_2_0");
					put(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeAssignment_2_1(), "rule__ImplementationDefinition__InlineCcodeAssignment_2_1");
					put(grammarAccess.getDataDefinitionAccess().getAnnotationsListAssignment_0(), "rule__DataDefinition__AnnotationsListAssignment_0");
					put(grammarAccess.getDataDefinitionAccess().getFileCAssignment_2_0(), "rule__DataDefinition__FileCAssignment_2_0");
					put(grammarAccess.getDataDefinitionAccess().getInlineCcodeAssignment_2_1(), "rule__DataDefinition__InlineCcodeAssignment_2_1");
					put(grammarAccess.getFileCAccess().getDirectoryAssignment_0(), "rule__FileC__DirectoryAssignment_0");
					put(grammarAccess.getFileCAccess().getNameAssignment_1(), "rule__FileC__NameAssignment_1");
					put(grammarAccess.getInlineCodeCAccess().getCodeCAssignment(), "rule__InlineCodeC__CodeCAssignment");
					put(grammarAccess.getAnnotationsListAccess().getAnnotationsAssignment_0(), "rule__AnnotationsList__AnnotationsAssignment_0");
					put(grammarAccess.getAnnotationsListAccess().getAnnotationsAssignment_1(), "rule__AnnotationsList__AnnotationsAssignment_1");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getAnnotationElementsAssignment_2_1(), "rule__Annotation__AnnotationElementsAssignment_2_1");
					put(grammarAccess.getAnnotationAccess().getAnnotationElementsAssignment_2_2_1(), "rule__Annotation__AnnotationElementsAssignment_2_2_1");
					put(grammarAccess.getAnnotationElementAccess().getElementNameAssignment_0_0(), "rule__AnnotationElement__ElementNameAssignment_0_0");
					put(grammarAccess.getAnnotationElementAccess().getElementValueAssignment_1(), "rule__AnnotationElement__ElementValueAssignment_1");
					put(grammarAccess.getElementValueArrayInitializerAccess().getValuesAssignment_1(), "rule__ElementValueArrayInitializer__ValuesAssignment_1");
					put(grammarAccess.getElementValueArrayInitializerAccess().getValuesAssignment_2_1(), "rule__ElementValueArrayInitializer__ValuesAssignment_2_1");
					put(grammarAccess.getConstantValueAccess().getValueAssignment(), "rule__ConstantValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal.InternalFractalParser typedParser = (org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal.InternalFractalParser) parser;
			typedParser.entryRuleAdlDefinition();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FractalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FractalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
