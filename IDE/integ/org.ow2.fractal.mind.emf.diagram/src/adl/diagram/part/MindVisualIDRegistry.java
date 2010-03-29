package adl.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.AnnotationEditPart;
import adl.diagram.edit.parts.AnnotationNameEditPart;
import adl.diagram.edit.parts.AnnotationsListCompartmentAnnotationsAreaEditPart;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.edit.parts.ArgumentDefinition3EditPart;
import adl.diagram.edit.parts.ArgumentDefinition4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal2EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal3EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentValEditPart;
import adl.diagram.edit.parts.ArgumentDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionTypeAttributeNameValueEditPart;
import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionNameEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionNameEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.CompositeReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.edit.parts.CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.CompositeSubComponentNameEditPart;
import adl.diagram.edit.parts.DataDefinitionCompartmentDataDefinitionBodyAreaEditPart;
import adl.diagram.edit.parts.DataDefinitionEditPart;
import adl.diagram.edit.parts.FileCDirectoryFileNameEditPart;
import adl.diagram.edit.parts.FileCEditPart;
import adl.diagram.edit.parts.FormalArgumentEditPart;
import adl.diagram.edit.parts.FormalArgumentNameEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsListEditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionCompartmentImplementationBodyAreaEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionEditPart;
import adl.diagram.edit.parts.InlineCodeCCodeCEditPart;
import adl.diagram.edit.parts.InlineCodeCEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionNameEditPart;
import adl.diagram.edit.parts.LabelDataDefinitionTitleEditPart;
import adl.diagram.edit.parts.LabelImplementationTitleEditPart;
import adl.diagram.edit.parts.LabelTitleReferencesListCustomEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionNameEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentNameEditPart;
import adl.diagram.edit.parts.TemplateDefinition2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionEditPart;
import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateVal2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateValEditPart;
import adl.diagram.edit.parts.TemplateSpecifierEditPart;
import adl.diagram.edit.parts.TemplateSpecifierNameComponentTypeNameEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.edit.parts.TemplateSubComponentCompartmentTemplateSubBodyEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.edit.parts.TemplateSubComponentNameEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.TypeReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.TypeReferencesListEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MindVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.ow2.fractal.mind.emf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (AdlDefinitionEditPart.MODEL_ID.equals(view.getType())) {
				return AdlDefinitionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return adl.diagram.part.MindVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MindDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AdlPackage.eINSTANCE.getAdlDefinition().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((AdlDefinition) domainElement)) {
			return AdlDefinitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = adl.diagram.part.MindVisualIDRegistry
				.getModelID(containerView);
		if (!AdlDefinitionEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (AdlDefinitionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = adl.diagram.part.MindVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AdlDefinitionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getTemplateSpecifiersList().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSpecifiersListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getFormalArgumentsList().isSuperTypeOf(
					domainElement.eClass())) {
				return FormalArgumentsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeReferencesList()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeReferencesListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getFormalArgumentsList().isSuperTypeOf(
					domainElement.eClass())) {
				return FormalArgumentsList2EditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAttributeDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveReferencesList()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveReferencesListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			break;
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getTypeReferencesList().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeReferencesListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			break;
		case TemplateSubComponentEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getTemplateSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSubComponentEditPart.VISUAL_ID;
			}
			break;
		case CompositeSubComponentEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getTemplateSpecifiersList().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSpecifiersListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeReferenceDefinition2EditPart.VISUAL_ID;
			}
			break;
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getTemplateSpecifiersList().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSpecifiersListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeReferenceDefinition2EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAttributeDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveReferenceDefinitionEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getArgumentDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentDefinition2EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getInterfaceDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAttributeDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getAnnotationsList().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationsListEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveReferenceDefinitionEditPart.VISUAL_ID;
			}
			break;
		case CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getTemplateSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeAnonymousSubComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeAnonymousSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveAnonymousSubComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveAnonymousSubComponentEditPart.VISUAL_ID;
			}
			break;
		case TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getTemplateSpecifier().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSpecifierEditPart.VISUAL_ID;
			}
			break;
		case FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getFormalArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return FormalArgumentEditPart.VISUAL_ID;
			}
			break;
		case CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getCompositeReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeReferenceDefinitionEditPart.VISUAL_ID;
			}
			break;
		case CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getArgumentDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getTemplateDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateDefinitionEditPart.VISUAL_ID;
			}
			break;
		case AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationEditPart.VISUAL_ID;
			}
			break;
		case CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getCompositeSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeAnonymousSubComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeAnonymousSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveAnonymousSubComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveAnonymousSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getTemplateSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSubComponentEditPart.VISUAL_ID;
			}
			break;
		case CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getCompositeSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getCompositeAnonymousSubComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeAnonymousSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveAnonymousSubComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveAnonymousSubComponentEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getTemplateSubComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateSubComponentEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getImplementationDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return ImplementationDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getDataDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return DataDefinitionEditPart.VISUAL_ID;
			}
			break;
		case ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getFileC().isSuperTypeOf(
					domainElement.eClass())) {
				return FileCEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInlineCodeC().isSuperTypeOf(
					domainElement.eClass())) {
				return InlineCodeCEditPart.VISUAL_ID;
			}
			break;
		case DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getFileC().isSuperTypeOf(
					domainElement.eClass())) {
				return FileCEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getInlineCodeC().isSuperTypeOf(
					domainElement.eClass())) {
				return InlineCodeCEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getImplementationDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return ImplementationDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getDataDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return DataDefinitionEditPart.VISUAL_ID;
			}
			break;
		case CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getArgumentDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentDefinition3EditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getTemplateDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateDefinition2EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getImplementationDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return ImplementationDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getDataDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return DataDefinitionEditPart.VISUAL_ID;
			}
			break;
		case FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getFormalArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return FormalArgumentEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveReferenceDefinition2EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getArgumentDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentDefinition4EditPart.VISUAL_ID;
			}
			break;
		case TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getTypeReferenceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return TypeReferenceDefinitionEditPart.VISUAL_ID;
			}
			break;
		case AdlDefinitionEditPart.VISUAL_ID:
			if (AdlPackage.eINSTANCE.getCompositeComponentDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeComponentDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getPrimitiveComponentDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveComponentDefinitionEditPart.VISUAL_ID;
			}
			if (AdlPackage.eINSTANCE.getComponentTypeDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComponentTypeDefinitionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = adl.diagram.part.MindVisualIDRegistry
				.getModelID(containerView);
		if (!AdlDefinitionEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (AdlDefinitionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = adl.diagram.part.MindVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AdlDefinitionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			if (CompositeComponentDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSpecifiersListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormalArgumentsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeReferencesListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			if (PrimitiveComponentDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormalArgumentsList2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveReferencesListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			if (ComponentTypeDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeReferencesListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			if (TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateSpecifierEditPart.VISUAL_ID:
			if (TemplateSpecifierNameComponentTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormalArgumentsListEditPart.VISUAL_ID:
			if (FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormalArgumentEditPart.VISUAL_ID:
			if (FormalArgumentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeReferencesListEditPart.VISUAL_ID:
			if (CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			if (CompositeReferenceDefinitionReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentDefinitionEditPart.VISUAL_ID:
			if (ArgumentDefinitionArgumentNameArgumentValEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateDefinitionEditPart.VISUAL_ID:
			if (TemplateDefinitionTemplateNameTemplateValEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceDefinitionEditPart.VISUAL_ID:
			if (InterfaceDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateSubComponentEditPart.VISUAL_ID:
			if (TemplateSubComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSubComponentCompartmentTemplateSubBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnnotationsListEditPart.VISUAL_ID:
			if (AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnnotationEditPart.VISUAL_ID:
			if (AnnotationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeSubComponentEditPart.VISUAL_ID:
			if (CompositeSubComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSpecifiersListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeReferenceDefinition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			if (CompositeAnonymousSubComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSpecifiersListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeReferenceDefinition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			if (PrimitiveSubComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveReferenceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImplementationDefinitionEditPart.VISUAL_ID:
			if (LabelImplementationTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileCEditPart.VISUAL_ID:
			if (FileCDirectoryFileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InlineCodeCEditPart.VISUAL_ID:
			if (InlineCodeCCodeCEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataDefinitionEditPart.VISUAL_ID:
			if (LabelDataDefinitionTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeDefinitionEditPart.VISUAL_ID:
			if (AttributeDefinitionTypeAttributeNameValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			if (PrimitiveReferenceDefinitionReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentDefinition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentDefinition2EditPart.VISUAL_ID:
			if (ArgumentDefinitionArgumentNameArgumentVal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			if (PrimitiveAnonymousSubComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationsListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveReferenceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			if (CompositeReferenceDefinitionReferenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentDefinition3EditPart.VISUAL_ID:
			if (ArgumentDefinitionArgumentNameArgumentVal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateDefinition2EditPart.VISUAL_ID:
			if (TemplateDefinitionTemplateNameTemplateVal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormalArgumentsList2EditPart.VISUAL_ID:
			if (FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			if (LabelTitleReferencesListCustomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			if (PrimitiveReferenceDefinitionReferenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentDefinition4EditPart.VISUAL_ID:
			if (ArgumentDefinitionArgumentNameArgumentVal4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeReferencesListEditPart.VISUAL_ID:
			if (TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			if (TypeReferenceDefinitionReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID:
			if (TemplateSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAnonymousSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveAnonymousSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID:
			if (TemplateSpecifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID:
			if (FormalArgumentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			if (CompositeReferenceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
			if (ArgumentDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID:
			if (AnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID:
			if (CompositeSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAnonymousSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveAnonymousSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID:
			if (CompositeSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAnonymousSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveAnonymousSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateSubComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID:
			if (ImplementationDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID:
			if (FileCEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InlineCodeCEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID:
			if (FileCEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InlineCodeCEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID:
			if (ImplementationDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
			if (ArgumentDefinition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateDefinition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID:
			if (ImplementationDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID:
			if (FormalArgumentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			if (PrimitiveReferenceDefinition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
			if (ArgumentDefinition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			if (TypeReferenceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdlDefinitionEditPart.VISUAL_ID:
			if (CompositeComponentDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveComponentDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentTypeDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AdlPackage.eINSTANCE.getBindingDefinition().isSuperTypeOf(
				domainElement.eClass())) {
			return BindingDefinitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(AdlDefinition element) {
		return true;
	}

}
