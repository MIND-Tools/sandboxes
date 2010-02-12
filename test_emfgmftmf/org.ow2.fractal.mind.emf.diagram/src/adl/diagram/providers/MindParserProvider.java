package adl.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import adl.AdlPackage;
import adl.diagram.edit.parts.AnnotationNameEditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal2EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal3EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentValEditPart;
import adl.diagram.edit.parts.AttributeDefinitionTypeAttributeNameValueEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionNameEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionNameEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.CompositeSubComponentNameEditPart;
import adl.diagram.edit.parts.FileCDirectoryFileNameEditPart;
import adl.diagram.edit.parts.FormalArgumentNameEditPart;
import adl.diagram.edit.parts.InlineCodeCCodeCEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionNameEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionNameEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentNameEditPart;
import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateVal2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateValEditPart;
import adl.diagram.edit.parts.TemplateSpecifierNameComponentTypeNameEditPart;
import adl.diagram.edit.parts.TemplateSubComponentNameEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.parsers.MessageFormatParser;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class MindParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeComponentDefinitionName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeComponentDefinitionName_5022Parser() {
		if (compositeComponentDefinitionName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeComponentDefinitionName_5022Parser = parser;
		}
		return compositeComponentDefinitionName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveComponentDefinitionName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveComponentDefinitionName_5026Parser() {
		if (primitiveComponentDefinitionName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveComponentDefinitionName_5026Parser = parser;
		}
		return primitiveComponentDefinitionName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentTypeDefinitionName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getComponentTypeDefinitionName_5028Parser() {
		if (componentTypeDefinitionName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentTypeDefinitionName_5028Parser = parser;
		}
		return componentTypeDefinitionName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateSpecifierNameComponentTypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateSpecifierNameComponentTypeName_5001Parser() {
		if (templateSpecifierNameComponentTypeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getTemplateSpecifier_Name(),
					AdlPackage.eINSTANCE
							.getTemplateSpecifier_ComponentTypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} conformsto {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} conformsto {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} conformsto {1}"); //$NON-NLS-1$
			templateSpecifierNameComponentTypeName_5001Parser = parser;
		}
		return templateSpecifierNameComponentTypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser formalArgumentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getFormalArgumentName_5002Parser() {
		if (formalArgumentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getFormalArgument_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formalArgumentName_5002Parser = parser;
		}
		return formalArgumentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeReferenceDefinitionReferenceName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeReferenceDefinitionReferenceName_5029Parser() {
		if (compositeReferenceDefinitionReferenceName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getComponentReference_ReferenceName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("extends {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			compositeReferenceDefinitionReferenceName_5029Parser = parser;
		}
		return compositeReferenceDefinitionReferenceName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentDefinitionArgumentNameArgumentValue_5003Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentDefinitionArgumentNameArgumentValue_5003Parser() {
		if (argumentDefinitionArgumentNameArgumentValue_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentName(),
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentValue() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}={1}"); //$NON-NLS-1$
			argumentDefinitionArgumentNameArgumentValue_5003Parser = parser;
		}
		return argumentDefinitionArgumentNameArgumentValue_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateDefinitionTemplateNameTemplateValue_5004Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateDefinitionTemplateNameTemplateValue_5004Parser() {
		if (templateDefinitionTemplateNameTemplateValue_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getTemplateDefinition_TemplateName(),
					AdlPackage.eINSTANCE.getTemplateDefinition_TemplateValue() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<{0}={1}>"); //$NON-NLS-1$
			parser.setEditorPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}={1}"); //$NON-NLS-1$
			templateDefinitionTemplateNameTemplateValue_5004Parser = parser;
		}
		return templateDefinitionTemplateNameTemplateValue_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceDefinitionName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceDefinitionName_5006Parser() {
		if (interfaceDefinitionName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getInterfaceDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceDefinitionName_5006Parser = parser;
		}
		return interfaceDefinitionName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateSubComponentName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateSubComponentName_5016Parser() {
		if (templateSubComponentName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			templateSubComponentName_5016Parser = parser;
		}
		return templateSubComponentName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationName_5007Parser() {
		if (annotationName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getAnnotation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("@{0}"); //$NON-NLS-1$
			parser.setEditorPattern("@{0}"); //$NON-NLS-1$
			parser.setEditPattern("@{0}"); //$NON-NLS-1$
			annotationName_5007Parser = parser;
		}
		return annotationName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeSubComponentName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeSubComponentName_5020Parser() {
		if (compositeSubComponentName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeSubComponentName_5020Parser = parser;
		}
		return compositeSubComponentName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeAnonymousSubComponentName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeAnonymousSubComponentName_5021Parser() {
		if (compositeAnonymousSubComponentName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeAnonymousSubComponentName_5021Parser = parser;
		}
		return compositeAnonymousSubComponentName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveSubComponentName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveSubComponentName_5015Parser() {
		if (primitiveSubComponentName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveSubComponentName_5015Parser = parser;
		}
		return primitiveSubComponentName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser fileCDirectoryFileName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getFileCDirectoryFileName_5008Parser() {
		if (fileCDirectoryFileName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getFileC_Directory(),
					AdlPackage.eINSTANCE.getFileC_FileName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{1}"); //$NON-NLS-1$
			parser.setEditPattern("{1}"); //$NON-NLS-1$
			fileCDirectoryFileName_5008Parser = parser;
		}
		return fileCDirectoryFileName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser inlineCodeCCodeC_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInlineCodeCCodeC_5009Parser() {
		if (inlineCodeCCodeC_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getInlineCodeC_CodeC() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inlineCodeCCodeC_5009Parser = parser;
		}
		return inlineCodeCCodeC_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeDefinitionTypeAttributeNameValue_5011Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeDefinitionTypeAttributeNameValue_5011Parser() {
		if (attributeDefinitionTypeAttributeNameValue_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getAttributeDefinition_Type(),
					AdlPackage.eINSTANCE.getAttributeDefinition_AttributeName(),
					AdlPackage.eINSTANCE.getAttributeDefinition_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0}) {1} = {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1} = {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1} = {2}"); //$NON-NLS-1$
			attributeDefinitionTypeAttributeNameValue_5011Parser = parser;
		}
		return attributeDefinitionTypeAttributeNameValue_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveReferenceDefinitionReferenceName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveReferenceDefinitionReferenceName_5037Parser() {
		if (primitiveReferenceDefinitionReferenceName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getComponentReference_ReferenceName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("inherits from {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			primitiveReferenceDefinitionReferenceName_5037Parser = parser;
		}
		return primitiveReferenceDefinitionReferenceName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentDefinitionArgumentNameArgumentValue_5012Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentDefinitionArgumentNameArgumentValue_5012Parser() {
		if (argumentDefinitionArgumentNameArgumentValue_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentName(),
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentValue() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}={1}"); //$NON-NLS-1$
			argumentDefinitionArgumentNameArgumentValue_5012Parser = parser;
		}
		return argumentDefinitionArgumentNameArgumentValue_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveAnonymousSubComponentName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveAnonymousSubComponentName_5014Parser() {
		if (primitiveAnonymousSubComponentName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getArchitectureDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveAnonymousSubComponentName_5014Parser = parser;
		}
		return primitiveAnonymousSubComponentName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeReferenceDefinitionReferenceName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeReferenceDefinitionReferenceName_5038Parser() {
		if (compositeReferenceDefinitionReferenceName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getComponentReference_ReferenceName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("inherits from {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			compositeReferenceDefinitionReferenceName_5038Parser = parser;
		}
		return compositeReferenceDefinitionReferenceName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentDefinitionArgumentNameArgumentValue_5017Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentDefinitionArgumentNameArgumentValue_5017Parser() {
		if (argumentDefinitionArgumentNameArgumentValue_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentName(),
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentValue() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}={1}"); //$NON-NLS-1$
			argumentDefinitionArgumentNameArgumentValue_5017Parser = parser;
		}
		return argumentDefinitionArgumentNameArgumentValue_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateDefinitionTemplateNameTemplateValue_5018Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateDefinitionTemplateNameTemplateValue_5018Parser() {
		if (templateDefinitionTemplateNameTemplateValue_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getTemplateDefinition_TemplateName(),
					AdlPackage.eINSTANCE.getTemplateDefinition_TemplateValue() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<{0}={1}>"); //$NON-NLS-1$
			parser.setEditorPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}={1}"); //$NON-NLS-1$
			templateDefinitionTemplateNameTemplateValue_5018Parser = parser;
		}
		return templateDefinitionTemplateNameTemplateValue_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveReferenceDefinitionReferenceName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveReferenceDefinitionReferenceName_5030Parser() {
		if (primitiveReferenceDefinitionReferenceName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getComponentReference_ReferenceName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("extends {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			primitiveReferenceDefinitionReferenceName_5030Parser = parser;
		}
		return primitiveReferenceDefinitionReferenceName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentDefinitionArgumentNameArgumentValue_5023Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentDefinitionArgumentNameArgumentValue_5023Parser() {
		if (argumentDefinitionArgumentNameArgumentValue_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentName(),
					AdlPackage.eINSTANCE.getArgumentDefinition_ArgumentValue() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}={1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}={1}"); //$NON-NLS-1$
			argumentDefinitionArgumentNameArgumentValue_5023Parser = parser;
		}
		return argumentDefinitionArgumentNameArgumentValue_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeReferenceDefinitionReferenceName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getTypeReferenceDefinitionReferenceName_5032Parser() {
		if (typeReferenceDefinitionReferenceName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { AdlPackage.eINSTANCE
					.getComponentReference_ReferenceName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeReferenceDefinitionReferenceName_5032Parser = parser;
		}
		return typeReferenceDefinitionReferenceName_5032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeComponentDefinitionNameEditPart.VISUAL_ID:
			return getCompositeComponentDefinitionName_5022Parser();
		case PrimitiveComponentDefinitionNameEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinitionName_5026Parser();
		case ComponentTypeDefinitionNameEditPart.VISUAL_ID:
			return getComponentTypeDefinitionName_5028Parser();
		case TemplateSpecifierNameComponentTypeNameEditPart.VISUAL_ID:
			return getTemplateSpecifierNameComponentTypeName_5001Parser();
		case FormalArgumentNameEditPart.VISUAL_ID:
			return getFormalArgumentName_5002Parser();
		case CompositeReferenceDefinitionReferenceNameEditPart.VISUAL_ID:
			return getCompositeReferenceDefinitionReferenceName_5029Parser();
		case ArgumentDefinitionArgumentNameArgumentValEditPart.VISUAL_ID:
			return getArgumentDefinitionArgumentNameArgumentValue_5003Parser();
		case TemplateDefinitionTemplateNameTemplateValEditPart.VISUAL_ID:
			return getTemplateDefinitionTemplateNameTemplateValue_5004Parser();
		case InterfaceDefinitionNameEditPart.VISUAL_ID:
			return getInterfaceDefinitionName_5006Parser();
		case TemplateSubComponentNameEditPart.VISUAL_ID:
			return getTemplateSubComponentName_5016Parser();
		case AnnotationNameEditPart.VISUAL_ID:
			return getAnnotationName_5007Parser();
		case CompositeSubComponentNameEditPart.VISUAL_ID:
			return getCompositeSubComponentName_5020Parser();
		case CompositeAnonymousSubComponentNameEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponentName_5021Parser();
		case PrimitiveSubComponentNameEditPart.VISUAL_ID:
			return getPrimitiveSubComponentName_5015Parser();
		case FileCDirectoryFileNameEditPart.VISUAL_ID:
			return getFileCDirectoryFileName_5008Parser();
		case InlineCodeCCodeCEditPart.VISUAL_ID:
			return getInlineCodeCCodeC_5009Parser();
		case AttributeDefinitionTypeAttributeNameValueEditPart.VISUAL_ID:
			return getAttributeDefinitionTypeAttributeNameValue_5011Parser();
		case PrimitiveReferenceDefinitionReferenceNameEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinitionReferenceName_5037Parser();
		case ArgumentDefinitionArgumentNameArgumentVal2EditPart.VISUAL_ID:
			return getArgumentDefinitionArgumentNameArgumentValue_5012Parser();
		case PrimitiveAnonymousSubComponentNameEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponentName_5014Parser();
		case CompositeReferenceDefinitionReferenceName2EditPart.VISUAL_ID:
			return getCompositeReferenceDefinitionReferenceName_5038Parser();
		case ArgumentDefinitionArgumentNameArgumentVal3EditPart.VISUAL_ID:
			return getArgumentDefinitionArgumentNameArgumentValue_5017Parser();
		case TemplateDefinitionTemplateNameTemplateVal2EditPart.VISUAL_ID:
			return getTemplateDefinitionTemplateNameTemplateValue_5018Parser();
		case PrimitiveReferenceDefinitionReferenceName2EditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinitionReferenceName_5030Parser();
		case ArgumentDefinitionArgumentNameArgumentVal4EditPart.VISUAL_ID:
			return getArgumentDefinitionArgumentNameArgumentValue_5023Parser();
		case TypeReferenceDefinitionReferenceNameEditPart.VISUAL_ID:
			return getTypeReferenceDefinitionReferenceName_5032Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MindVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MindVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MindElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
