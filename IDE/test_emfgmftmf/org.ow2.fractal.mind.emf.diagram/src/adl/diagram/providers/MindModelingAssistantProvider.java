package adl.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.DataDefinitionEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.edit.parts.TypeReferencesListEditPart;
import adl.diagram.part.Messages;
import adl.diagram.part.MindDiagramEditorPlugin;

/**
 * @generated
 */
public class MindModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof CompositeComponentDefinitionEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(MindElementTypes.TemplateSpecifiersList_3001);
			types.add(MindElementTypes.FormalArgumentsList_3003);
			types.add(MindElementTypes.CompositeReferencesList_3033);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			types.add(MindElementTypes.AnnotationsList_3010);
			return types;
		}
		if (editPart instanceof PrimitiveComponentDefinitionEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(MindElementTypes.FormalArgumentsList_3015);
			types.add(MindElementTypes.AttributeDefinition_3020);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.PrimitiveReferencesList_3035);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			return types;
		}
		if (editPart instanceof ComponentTypeDefinitionEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.TypeReferencesList_3037);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			return types;
		}
		if (editPart instanceof TemplateSpecifiersListEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.TemplateSpecifier_3002);
			return types;
		}
		if (editPart instanceof FormalArgumentsListEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.FormalArgument_3004);
			return types;
		}
		if (editPart instanceof CompositeReferenceDefinitionEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.ArgumentDefinition_3007);
			types.add(MindElementTypes.TemplateDefinition_3008);
			return types;
		}
		if (editPart instanceof TemplateSubComponentEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.TemplateSubComponent_3024);
			return types;
		}
		if (editPart instanceof AnnotationsListEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.Annotation_3011);
			return types;
		}
		if (editPart instanceof CompositeSubComponentEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(MindElementTypes.TemplateSpecifiersList_3001);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.CompositeReferenceDefinition_3044);
			return types;
		}
		if (editPart instanceof CompositeAnonymousSubComponentEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(MindElementTypes.TemplateSpecifiersList_3001);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.CompositeReferenceDefinition_3044);
			return types;
		}
		if (editPart instanceof PrimitiveSubComponentEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			types.add(MindElementTypes.AttributeDefinition_3020);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.PrimitiveReferenceDefinition_3043);
			return types;
		}
		if (editPart instanceof ImplementationDefinitionEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.FileC_3017);
			types.add(MindElementTypes.InlineCodeC_3018);
			return types;
		}
		if (editPart instanceof DataDefinitionEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.FileC_3017);
			types.add(MindElementTypes.InlineCodeC_3018);
			return types;
		}
		if (editPart instanceof PrimitiveReferenceDefinitionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.ArgumentDefinition_3022);
			return types;
		}
		if (editPart instanceof PrimitiveAnonymousSubComponentEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(MindElementTypes.InterfaceDefinition_3009);
			types.add(MindElementTypes.AttributeDefinition_3020);
			types.add(MindElementTypes.AnnotationsList_3010);
			types.add(MindElementTypes.PrimitiveReferenceDefinition_3043);
			return types;
		}
		if (editPart instanceof CompositeReferenceDefinition2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.ArgumentDefinition_3026);
			types.add(MindElementTypes.TemplateDefinition_3027);
			return types;
		}
		if (editPart instanceof FormalArgumentsList2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.FormalArgument_3004);
			return types;
		}
		if (editPart instanceof PrimitiveReferenceDefinition2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.ArgumentDefinition_3030);
			return types;
		}
		if (editPart instanceof TypeReferencesListEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.TypeReferenceDefinition_3038);
			return types;
		}
		if (editPart instanceof CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(MindElementTypes.TemplateSubComponent_3024);
			types.add(MindElementTypes.CompositeSubComponent_3013);
			types.add(MindElementTypes.CompositeAnonymousSubComponent_3012);
			types.add(MindElementTypes.PrimitiveSubComponent_3023);
			types.add(MindElementTypes.PrimitiveAnonymousSubComponent_3014);
			return types;
		}
		if (editPart instanceof CompositeReferencesListCompartmentReferencesListAreaEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.CompositeReferenceDefinition_3034);
			return types;
		}
		if (editPart instanceof CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(MindElementTypes.CompositeSubComponent_3013);
			types.add(MindElementTypes.CompositeAnonymousSubComponent_3012);
			types.add(MindElementTypes.PrimitiveSubComponent_3023);
			types.add(MindElementTypes.PrimitiveAnonymousSubComponent_3014);
			types.add(MindElementTypes.TemplateSubComponent_3024);
			return types;
		}
		if (editPart instanceof CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(MindElementTypes.CompositeSubComponent_3013);
			types.add(MindElementTypes.CompositeAnonymousSubComponent_3012);
			types.add(MindElementTypes.PrimitiveSubComponent_3023);
			types.add(MindElementTypes.PrimitiveAnonymousSubComponent_3014);
			types.add(MindElementTypes.TemplateSubComponent_3024);
			return types;
		}
		if (editPart instanceof PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.ImplementationDefinition_3016);
			types.add(MindElementTypes.DataDefinition_3019);
			return types;
		}
		if (editPart instanceof PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.ImplementationDefinition_3016);
			types.add(MindElementTypes.DataDefinition_3019);
			return types;
		}
		if (editPart instanceof PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MindElementTypes.ImplementationDefinition_3016);
			types.add(MindElementTypes.DataDefinition_3019);
			return types;
		}
		if (editPart instanceof PrimitiveReferencesListCompartmentReferencesListAreaEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(MindElementTypes.PrimitiveReferenceDefinition_3036);
			return types;
		}
		if (editPart instanceof AdlDefinitionEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(MindElementTypes.CompositeComponentDefinition_2001);
			types.add(MindElementTypes.PrimitiveComponentDefinition_2002);
			types.add(MindElementTypes.ComponentTypeDefinition_2003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InterfaceDefinitionEditPart) {
			return ((InterfaceDefinitionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceDefinitionEditPart) {
			return ((InterfaceDefinitionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InterfaceDefinitionEditPart) {
			return ((InterfaceDefinitionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceDefinitionEditPart) {
			return ((InterfaceDefinitionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InterfaceDefinitionEditPart) {
			return ((InterfaceDefinitionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				MindDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.MindModelingAssistantProviderMessage);
		dialog.setTitle(Messages.MindModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
