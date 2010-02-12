package adl.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.Annotation;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.ArgumentDefinition;
import adl.BindingDefinition;
import adl.ComponentReference;
import adl.ComponentTypeDefinition;
import adl.CompositeAnonymousSubComponent;
import adl.CompositeComponentDefinition;
import adl.CompositeReferenceDefinition;
import adl.CompositeReferencesList;
import adl.CompositeSubComponent;
import adl.DataDefinition;
import adl.Element;
import adl.FileC;
import adl.FormalArgument;
import adl.FormalArgumentsList;
import adl.ImplementationDefinition;
import adl.InlineCodeC;
import adl.InterfaceDefinition;
import adl.PrimitiveAnonymousSubComponent;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveReferenceDefinition;
import adl.PrimitiveReferencesList;
import adl.PrimitiveSubComponent;
import adl.ReferencesList;
import adl.TemplateDefinition;
import adl.TemplateSpecifier;
import adl.TemplateSpecifiersList;
import adl.TemplateSubComponent;
import adl.TypeReferencesList;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.AnnotationEditPart;
import adl.diagram.edit.parts.AnnotationsListCompartmentAnnotationsAreaEditPart;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.edit.parts.ArgumentDefinition3EditPart;
import adl.diagram.edit.parts.ArgumentDefinition4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.edit.parts.CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.DataDefinitionCompartmentDataDefinitionBodyAreaEditPart;
import adl.diagram.edit.parts.DataDefinitionEditPart;
import adl.diagram.edit.parts.FileCEditPart;
import adl.diagram.edit.parts.FormalArgumentEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsListEditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionCompartmentImplementationBodyAreaEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionEditPart;
import adl.diagram.edit.parts.InlineCodeCEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;
import adl.diagram.edit.parts.TemplateDefinition2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionEditPart;
import adl.diagram.edit.parts.TemplateSpecifierEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.TypeReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.TypeReferencesListEditPart;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class MindDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return getCompositeComponentDefinition_2001SemanticChildren(view);
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinition_2002SemanticChildren(view);
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return getComponentTypeDefinition_2003SemanticChildren(view);
		case TemplateSubComponentEditPart.VISUAL_ID:
			return getTemplateSubComponent_3024SemanticChildren(view);
		case CompositeSubComponentEditPart.VISUAL_ID:
			return getCompositeSubComponent_3013SemanticChildren(view);
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponent_3012SemanticChildren(view);
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return getPrimitiveSubComponent_3023SemanticChildren(view);
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3043SemanticChildren(view);
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponent_3014SemanticChildren(view);
		case CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID:
			return getCompositeComponentDefinitionCompartmentCompositeComponentDefinitionBody_7001SemanticChildren(view);
		case TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID:
			return getTemplateSpecifiersListCompartmentTemplateSpecifierList_7002SemanticChildren(view);
		case FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID:
			return getFormalArgumentsListCompartmentFormalArgumentsList_7003SemanticChildren(view);
		case CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			return getCompositeReferencesListCompartmentReferencesListArea_7022SemanticChildren(view);
		case CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
			return getCompositeReferenceDefinitionCompartmentComponentReferenceDefinitionArea_7023SemanticChildren(view);
		case AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID:
			return getAnnotationsListCompartmentAnnotationsArea_7006SemanticChildren(view);
		case CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID:
			return getCompositeSubComponentCompartmentCompositeSubComponentBody_7008SemanticChildren(view);
		case CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBody_7007SemanticChildren(view);
		case PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID:
			return getPrimitiveSubComponentCompartmentPrimitiveSubComponentBody_7014SemanticChildren(view);
		case ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID:
			return getImplementationDefinitionCompartmentImplementationBodyArea_7011SemanticChildren(view);
		case DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID:
			return getDataDefinitionCompartmentDataDefinitionBodyArea_7012SemanticChildren(view);
		case PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBody_7009SemanticChildren(view);
		case CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
			return getCompositeReferenceDefinitionCompartmentReferenceDefinitionArea_7032SemanticChildren(view);
		case PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBody_7017SemanticChildren(view);
		case FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID:
			return getFormalArgumentsListCompartmentFormalArgumentsList_7010SemanticChildren(view);
		case PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			return getPrimitiveReferencesListCompartmentReferencesListArea_7024SemanticChildren(view);
		case PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionArea_7025SemanticChildren(view);
		case TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
			return getTypeReferencesListCompartmentReferencesListArea_7026SemanticChildren(view);
		case AdlDefinitionEditPart.VISUAL_ID:
			return getAdlDefinition_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeComponentDefinition_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeComponentDefinition modelElement = (CompositeComponentDefinition) view
				.getElement();
		List result = new LinkedList();
		{
			TemplateSpecifiersList childElement = modelElement
					.getTemplateSpecifiersList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateSpecifiersListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		{
			FormalArgumentsList childElement = modelElement
					.getCompositeFormalArgumentsList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormalArgumentsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		{
			ReferencesList childElement = modelElement.getReferencesList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeReferencesListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveComponentDefinition_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveComponentDefinition modelElement = (PrimitiveComponentDefinition) view
				.getElement();
		List result = new LinkedList();
		{
			FormalArgumentsList childElement = modelElement
					.getPrimitiveFormalArgumentsList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormalArgumentsList2EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			ReferencesList childElement = modelElement.getReferencesList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimitiveReferencesListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComponentTypeDefinition_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ComponentTypeDefinition modelElement = (ComponentTypeDefinition) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			ReferencesList childElement = modelElement.getReferencesList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeReferencesListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAnonymousSubComponent_3012SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeAnonymousSubComponent modelElement = (CompositeAnonymousSubComponent) view
				.getElement();
		List result = new LinkedList();
		{
			TemplateSpecifiersList childElement = modelElement
					.getTemplateSpecifiersList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateSpecifiersListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			CompositeReferenceDefinition childElement = modelElement
					.getReferenceDefinition();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeReferenceDefinition2EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeSubComponent_3013SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeSubComponent modelElement = (CompositeSubComponent) view
				.getElement();
		List result = new LinkedList();
		{
			TemplateSpecifiersList childElement = modelElement
					.getTemplateSpecifiersList();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateSpecifiersListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			CompositeReferenceDefinition childElement = modelElement
					.getReferenceDefinition();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeReferenceDefinition2EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveAnonymousSubComponent_3014SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveAnonymousSubComponent modelElement = (PrimitiveAnonymousSubComponent) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AttributeDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PrimitiveReferenceDefinition childElement = modelElement
					.getReferenceDefinition();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimitiveReferenceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveSubComponent_3023SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveSubComponent modelElement = (PrimitiveSubComponent) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AttributeDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PrimitiveReferenceDefinition childElement = modelElement
					.getReferenceDefinition();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimitiveReferenceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3043SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveReferenceDefinition modelElement = (PrimitiveReferenceDefinition) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArgumentsList().iterator(); it
				.hasNext();) {
			ArgumentDefinition childElement = (ArgumentDefinition) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArgumentDefinition2EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSubComponent_3024SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TemplateSubComponent modelElement = (TemplateSubComponent) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnnotationsListEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemplateSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeComponentDefinitionCompartmentCompositeComponentDefinitionBody_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeComponentDefinition modelElement = (CompositeComponentDefinition) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeAnonymousSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveAnonymousSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifiersListCompartmentTemplateSpecifierList_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TemplateSpecifiersList modelElement = (TemplateSpecifiersList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTemplateSpecifiers().iterator(); it
				.hasNext();) {
			TemplateSpecifier childElement = (TemplateSpecifier) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateSpecifierEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsListCompartmentFormalArgumentsList_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FormalArgumentsList modelElement = (FormalArgumentsList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFormalArguments().iterator(); it
				.hasNext();) {
			FormalArgument childElement = (FormalArgument) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormalArgumentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferencesListCompartmentReferencesListArea_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeReferencesList modelElement = (CompositeReferencesList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getReferences().iterator(); it
				.hasNext();) {
			ComponentReference childElement = (ComponentReference) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeReferenceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinitionCompartmentComponentReferenceDefinitionArea_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeReferenceDefinition modelElement = (CompositeReferenceDefinition) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArgumentsList().iterator(); it
				.hasNext();) {
			ArgumentDefinition childElement = (ArgumentDefinition) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArgumentDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getTemplatesList().iterator(); it
				.hasNext();) {
			TemplateDefinition childElement = (TemplateDefinition) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnnotationsListCompartmentAnnotationsArea_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnnotationsList modelElement = (AnnotationsList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AnnotationEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBody_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeAnonymousSubComponent modelElement = (CompositeAnonymousSubComponent) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeAnonymousSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveAnonymousSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemplateSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeSubComponentCompartmentCompositeSubComponentBody_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeSubComponent modelElement = (CompositeSubComponent) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeAnonymousSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveAnonymousSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemplateSubComponentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBody_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveAnonymousSubComponent modelElement = (PrimitiveAnonymousSubComponent) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ImplementationDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinitionCompartmentReferenceDefinitionArea_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeReferenceDefinition modelElement = (CompositeReferenceDefinition) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArgumentsList().iterator(); it
				.hasNext();) {
			ArgumentDefinition childElement = (ArgumentDefinition) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArgumentDefinition3EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getTemplatesList().iterator(); it
				.hasNext();) {
			TemplateDefinition childElement = (TemplateDefinition) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateDefinition2EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsListCompartmentFormalArgumentsList_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FormalArgumentsList modelElement = (FormalArgumentsList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFormalArguments().iterator(); it
				.hasNext();) {
			FormalArgument childElement = (FormalArgument) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormalArgumentEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getImplementationDefinitionCompartmentImplementationBodyArea_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ImplementationDefinition modelElement = (ImplementationDefinition) containerView
				.getElement();
		List result = new LinkedList();
		{
			FileC childElement = modelElement.getFileC();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FileCEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		{
			InlineCodeC childElement = modelElement.getInlineCcode();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InlineCodeCEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataDefinitionCompartmentDataDefinitionBodyArea_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DataDefinition modelElement = (DataDefinition) containerView
				.getElement();
		List result = new LinkedList();
		{
			FileC childElement = modelElement.getFileC();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FileCEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		{
			InlineCodeC childElement = modelElement.getInlineCcode();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InlineCodeCEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveSubComponentCompartmentPrimitiveSubComponentBody_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveSubComponent modelElement = (PrimitiveSubComponent) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ImplementationDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBody_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveComponentDefinition modelElement = (PrimitiveComponentDefinition) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ImplementationDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferencesListCompartmentReferencesListArea_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveReferencesList modelElement = (PrimitiveReferencesList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getReferences().iterator(); it
				.hasNext();) {
			ComponentReference childElement = (ComponentReference) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimitiveReferenceDefinition2EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionArea_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PrimitiveReferenceDefinition modelElement = (PrimitiveReferenceDefinition) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArgumentsList().iterator(); it
				.hasNext();) {
			ArgumentDefinition childElement = (ArgumentDefinition) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArgumentDefinition4EditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferencesListCompartmentReferencesListArea_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TypeReferencesList modelElement = (TypeReferencesList) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getReferences().iterator(); it
				.hasNext();) {
			ComponentReference childElement = (ComponentReference) it.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeReferenceDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdlDefinition_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AdlDefinition modelElement = (AdlDefinition) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArchitecturedefinition().iterator(); it
				.hasNext();) {
			ArchitectureDefinition childElement = (ArchitectureDefinition) it
					.next();
			int visualID = MindVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeComponentDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveComponentDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComponentTypeDefinitionEditPart.VISUAL_ID) {
				result.add(new MindNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case AdlDefinitionEditPart.VISUAL_ID:
			return getAdlDefinition_1000ContainedLinks(view);
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return getCompositeComponentDefinition_2001ContainedLinks(view);
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinition_2002ContainedLinks(view);
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return getComponentTypeDefinition_2003ContainedLinks(view);
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return getTemplateSpecifiersList_3001ContainedLinks(view);
		case TemplateSpecifierEditPart.VISUAL_ID:
			return getTemplateSpecifier_3002ContainedLinks(view);
		case FormalArgumentsListEditPart.VISUAL_ID:
			return getFormalArgumentsList_3003ContainedLinks(view);
		case FormalArgumentEditPart.VISUAL_ID:
			return getFormalArgument_3004ContainedLinks(view);
		case CompositeReferencesListEditPart.VISUAL_ID:
			return getCompositeReferencesList_3033ContainedLinks(view);
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3034ContainedLinks(view);
		case ArgumentDefinitionEditPart.VISUAL_ID:
			return getArgumentDefinition_3007ContainedLinks(view);
		case TemplateDefinitionEditPart.VISUAL_ID:
			return getTemplateDefinition_3008ContainedLinks(view);
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return getInterfaceDefinition_3009ContainedLinks(view);
		case TemplateSubComponentEditPart.VISUAL_ID:
			return getTemplateSubComponent_3024ContainedLinks(view);
		case AnnotationsListEditPart.VISUAL_ID:
			return getAnnotationsList_3010ContainedLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3011ContainedLinks(view);
		case CompositeSubComponentEditPart.VISUAL_ID:
			return getCompositeSubComponent_3013ContainedLinks(view);
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponent_3012ContainedLinks(view);
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return getPrimitiveSubComponent_3023ContainedLinks(view);
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return getImplementationDefinition_3016ContainedLinks(view);
		case FileCEditPart.VISUAL_ID:
			return getFileC_3017ContainedLinks(view);
		case InlineCodeCEditPart.VISUAL_ID:
			return getInlineCodeC_3018ContainedLinks(view);
		case DataDefinitionEditPart.VISUAL_ID:
			return getDataDefinition_3019ContainedLinks(view);
		case AttributeDefinitionEditPart.VISUAL_ID:
			return getAttributeDefinition_3020ContainedLinks(view);
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3043ContainedLinks(view);
		case ArgumentDefinition2EditPart.VISUAL_ID:
			return getArgumentDefinition_3022ContainedLinks(view);
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponent_3014ContainedLinks(view);
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3044ContainedLinks(view);
		case ArgumentDefinition3EditPart.VISUAL_ID:
			return getArgumentDefinition_3026ContainedLinks(view);
		case TemplateDefinition2EditPart.VISUAL_ID:
			return getTemplateDefinition_3027ContainedLinks(view);
		case FormalArgumentsList2EditPart.VISUAL_ID:
			return getFormalArgumentsList_3015ContainedLinks(view);
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			return getPrimitiveReferencesList_3035ContainedLinks(view);
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3036ContainedLinks(view);
		case ArgumentDefinition4EditPart.VISUAL_ID:
			return getArgumentDefinition_3030ContainedLinks(view);
		case TypeReferencesListEditPart.VISUAL_ID:
			return getTypeReferencesList_3037ContainedLinks(view);
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			return getTypeReferenceDefinition_3038ContainedLinks(view);
		case BindingDefinitionEditPart.VISUAL_ID:
			return getBindingDefinition_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return getCompositeComponentDefinition_2001IncomingLinks(view);
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinition_2002IncomingLinks(view);
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return getComponentTypeDefinition_2003IncomingLinks(view);
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return getTemplateSpecifiersList_3001IncomingLinks(view);
		case TemplateSpecifierEditPart.VISUAL_ID:
			return getTemplateSpecifier_3002IncomingLinks(view);
		case FormalArgumentsListEditPart.VISUAL_ID:
			return getFormalArgumentsList_3003IncomingLinks(view);
		case FormalArgumentEditPart.VISUAL_ID:
			return getFormalArgument_3004IncomingLinks(view);
		case CompositeReferencesListEditPart.VISUAL_ID:
			return getCompositeReferencesList_3033IncomingLinks(view);
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3034IncomingLinks(view);
		case ArgumentDefinitionEditPart.VISUAL_ID:
			return getArgumentDefinition_3007IncomingLinks(view);
		case TemplateDefinitionEditPart.VISUAL_ID:
			return getTemplateDefinition_3008IncomingLinks(view);
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return getInterfaceDefinition_3009IncomingLinks(view);
		case TemplateSubComponentEditPart.VISUAL_ID:
			return getTemplateSubComponent_3024IncomingLinks(view);
		case AnnotationsListEditPart.VISUAL_ID:
			return getAnnotationsList_3010IncomingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3011IncomingLinks(view);
		case CompositeSubComponentEditPart.VISUAL_ID:
			return getCompositeSubComponent_3013IncomingLinks(view);
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponent_3012IncomingLinks(view);
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return getPrimitiveSubComponent_3023IncomingLinks(view);
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return getImplementationDefinition_3016IncomingLinks(view);
		case FileCEditPart.VISUAL_ID:
			return getFileC_3017IncomingLinks(view);
		case InlineCodeCEditPart.VISUAL_ID:
			return getInlineCodeC_3018IncomingLinks(view);
		case DataDefinitionEditPart.VISUAL_ID:
			return getDataDefinition_3019IncomingLinks(view);
		case AttributeDefinitionEditPart.VISUAL_ID:
			return getAttributeDefinition_3020IncomingLinks(view);
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3043IncomingLinks(view);
		case ArgumentDefinition2EditPart.VISUAL_ID:
			return getArgumentDefinition_3022IncomingLinks(view);
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponent_3014IncomingLinks(view);
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3044IncomingLinks(view);
		case ArgumentDefinition3EditPart.VISUAL_ID:
			return getArgumentDefinition_3026IncomingLinks(view);
		case TemplateDefinition2EditPart.VISUAL_ID:
			return getTemplateDefinition_3027IncomingLinks(view);
		case FormalArgumentsList2EditPart.VISUAL_ID:
			return getFormalArgumentsList_3015IncomingLinks(view);
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			return getPrimitiveReferencesList_3035IncomingLinks(view);
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3036IncomingLinks(view);
		case ArgumentDefinition4EditPart.VISUAL_ID:
			return getArgumentDefinition_3030IncomingLinks(view);
		case TypeReferencesListEditPart.VISUAL_ID:
			return getTypeReferencesList_3037IncomingLinks(view);
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			return getTypeReferenceDefinition_3038IncomingLinks(view);
		case BindingDefinitionEditPart.VISUAL_ID:
			return getBindingDefinition_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return getCompositeComponentDefinition_2001OutgoingLinks(view);
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinition_2002OutgoingLinks(view);
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return getComponentTypeDefinition_2003OutgoingLinks(view);
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return getTemplateSpecifiersList_3001OutgoingLinks(view);
		case TemplateSpecifierEditPart.VISUAL_ID:
			return getTemplateSpecifier_3002OutgoingLinks(view);
		case FormalArgumentsListEditPart.VISUAL_ID:
			return getFormalArgumentsList_3003OutgoingLinks(view);
		case FormalArgumentEditPart.VISUAL_ID:
			return getFormalArgument_3004OutgoingLinks(view);
		case CompositeReferencesListEditPart.VISUAL_ID:
			return getCompositeReferencesList_3033OutgoingLinks(view);
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3034OutgoingLinks(view);
		case ArgumentDefinitionEditPart.VISUAL_ID:
			return getArgumentDefinition_3007OutgoingLinks(view);
		case TemplateDefinitionEditPart.VISUAL_ID:
			return getTemplateDefinition_3008OutgoingLinks(view);
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return getInterfaceDefinition_3009OutgoingLinks(view);
		case TemplateSubComponentEditPart.VISUAL_ID:
			return getTemplateSubComponent_3024OutgoingLinks(view);
		case AnnotationsListEditPart.VISUAL_ID:
			return getAnnotationsList_3010OutgoingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3011OutgoingLinks(view);
		case CompositeSubComponentEditPart.VISUAL_ID:
			return getCompositeSubComponent_3013OutgoingLinks(view);
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponent_3012OutgoingLinks(view);
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return getPrimitiveSubComponent_3023OutgoingLinks(view);
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return getImplementationDefinition_3016OutgoingLinks(view);
		case FileCEditPart.VISUAL_ID:
			return getFileC_3017OutgoingLinks(view);
		case InlineCodeCEditPart.VISUAL_ID:
			return getInlineCodeC_3018OutgoingLinks(view);
		case DataDefinitionEditPart.VISUAL_ID:
			return getDataDefinition_3019OutgoingLinks(view);
		case AttributeDefinitionEditPart.VISUAL_ID:
			return getAttributeDefinition_3020OutgoingLinks(view);
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3043OutgoingLinks(view);
		case ArgumentDefinition2EditPart.VISUAL_ID:
			return getArgumentDefinition_3022OutgoingLinks(view);
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponent_3014OutgoingLinks(view);
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3044OutgoingLinks(view);
		case ArgumentDefinition3EditPart.VISUAL_ID:
			return getArgumentDefinition_3026OutgoingLinks(view);
		case TemplateDefinition2EditPart.VISUAL_ID:
			return getTemplateDefinition_3027OutgoingLinks(view);
		case FormalArgumentsList2EditPart.VISUAL_ID:
			return getFormalArgumentsList_3015OutgoingLinks(view);
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			return getPrimitiveReferencesList_3035OutgoingLinks(view);
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3036OutgoingLinks(view);
		case ArgumentDefinition4EditPart.VISUAL_ID:
			return getArgumentDefinition_3030OutgoingLinks(view);
		case TypeReferencesListEditPart.VISUAL_ID:
			return getTypeReferencesList_3037OutgoingLinks(view);
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			return getTypeReferenceDefinition_3038OutgoingLinks(view);
		case BindingDefinitionEditPart.VISUAL_ID:
			return getBindingDefinition_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAdlDefinition_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeComponentDefinition_2001ContainedLinks(
			View view) {
		CompositeComponentDefinition modelElement = (CompositeComponentDefinition) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveComponentDefinition_2002ContainedLinks(
			View view) {
		PrimitiveComponentDefinition modelElement = (PrimitiveComponentDefinition) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComponentTypeDefinition_2003ContainedLinks(View view) {
		ComponentTypeDefinition modelElement = (ComponentTypeDefinition) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifiersList_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifier_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsList_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgument_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferencesList_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinition_3034ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateDefinition_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceDefinition_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnnotationsList_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnnotation_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAnonymousSubComponent_3012ContainedLinks(
			View view) {
		CompositeAnonymousSubComponent modelElement = (CompositeAnonymousSubComponent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeSubComponent_3013ContainedLinks(View view) {
		CompositeSubComponent modelElement = (CompositeSubComponent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveAnonymousSubComponent_3014ContainedLinks(
			View view) {
		PrimitiveAnonymousSubComponent modelElement = (PrimitiveAnonymousSubComponent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinition_3044ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsList_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplementationDefinition_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFileC_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInlineCodeC_3018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataDefinition_3019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAttributeDefinition_3020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3043ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveSubComponent_3023ContainedLinks(View view) {
		PrimitiveSubComponent modelElement = (PrimitiveSubComponent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSubComponent_3024ContainedLinks(View view) {
		TemplateSubComponent modelElement = (TemplateSubComponent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateDefinition_3027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferencesList_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3036ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferencesList_3037ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferenceDefinition_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBindingDefinition_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeComponentDefinition_2001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveComponentDefinition_2002IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentTypeDefinition_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifiersList_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifier_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsList_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgument_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferencesList_3033IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinition_3034IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateDefinition_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceDefinition_3009IncomingLinks(View view) {
		InterfaceDefinition modelElement = (InterfaceDefinition) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_BindingDefinition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnnotationsList_3010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnnotation_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAnonymousSubComponent_3012IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeSubComponent_3013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveAnonymousSubComponent_3014IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinition_3044IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsList_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplementationDefinition_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFileC_3017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInlineCodeC_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataDefinition_3019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAttributeDefinition_3020IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3043IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveSubComponent_3023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSubComponent_3024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateDefinition_3027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferencesList_3035IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3036IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferencesList_3037IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferenceDefinition_3038IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBindingDefinition_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeComponentDefinition_2001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveComponentDefinition_2002OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentTypeDefinition_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifiersList_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSpecifier_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsList_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgument_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferencesList_3033OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinition_3034OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateDefinition_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceDefinition_3009OutgoingLinks(View view) {
		InterfaceDefinition modelElement = (InterfaceDefinition) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_BindingDefinition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnnotationsList_3010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnnotation_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAnonymousSubComponent_3012OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeSubComponent_3013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveAnonymousSubComponent_3014OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeReferenceDefinition_3044OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFormalArgumentsList_3015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getImplementationDefinition_3016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFileC_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInlineCodeC_3018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataDefinition_3019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAttributeDefinition_3020OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3043OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveSubComponent_3023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateSubComponent_3024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateDefinition_3027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferencesList_3035OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveReferenceDefinition_3036OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArgumentDefinition_3030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferencesList_3037OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTypeReferenceDefinition_3038OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBindingDefinition_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BindingDefinition_4001(
			ArchitectureDefinition container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof BindingDefinition) {
				continue;
			}
			BindingDefinition link = (BindingDefinition) linkObject;
			if (BindingDefinitionEditPart.VISUAL_ID != MindVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InterfaceDefinition dst = link.getInterfaceTarget();
			InterfaceDefinition src = link.getInterfaceSource();
			result.add(new MindLinkDescriptor(src, dst, link,
					MindElementTypes.BindingDefinition_4001,
					BindingDefinitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BindingDefinition_4001(
			InterfaceDefinition target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != AdlPackage.eINSTANCE
					.getBindingDefinition_InterfaceTarget()
					|| false == setting.getEObject() instanceof BindingDefinition) {
				continue;
			}
			BindingDefinition link = (BindingDefinition) setting.getEObject();
			if (BindingDefinitionEditPart.VISUAL_ID != MindVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InterfaceDefinition src = link.getInterfaceSource();
			result.add(new MindLinkDescriptor(src, target, link,
					MindElementTypes.BindingDefinition_4001,
					BindingDefinitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BindingDefinition_4001(
			InterfaceDefinition source) {
		ArchitectureDefinition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ArchitectureDefinition) {
				container = (ArchitectureDefinition) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof BindingDefinition) {
				continue;
			}
			BindingDefinition link = (BindingDefinition) linkObject;
			if (BindingDefinitionEditPart.VISUAL_ID != MindVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InterfaceDefinition dst = link.getInterfaceTarget();
			InterfaceDefinition src = link.getInterfaceSource();
			if (src != source) {
				continue;
			}
			result.add(new MindLinkDescriptor(src, dst, link,
					MindElementTypes.BindingDefinition_4001,
					BindingDefinitionEditPart.VISUAL_ID));
		}
		return result;
	}

}
