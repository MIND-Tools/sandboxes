package adl.diagram.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import adl.AdlPackage;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.AnnotationEditPart;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.edit.parts.ArgumentDefinition3EditPart;
import adl.diagram.edit.parts.ArgumentDefinition4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.DataDefinitionEditPart;
import adl.diagram.edit.parts.FileCEditPart;
import adl.diagram.edit.parts.FormalArgumentEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionEditPart;
import adl.diagram.edit.parts.InlineCodeCEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;
import adl.diagram.edit.parts.TemplateDefinition2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionEditPart;
import adl.diagram.edit.parts.TemplateSpecifierEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.TypeReferencesListEditPart;
import adl.diagram.part.MindDiagramUpdater;
import adl.diagram.part.MindLinkDescriptor;
import adl.diagram.part.MindNodeDescriptor;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class AdlDefinitionCanonicalEditPolicy extends
		CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = MindDiagramUpdater
				.getAdlDefinition_1000SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((MindNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = MindVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(AdlPackage.eINSTANCE
					.getAdlDefinition_Architecturedefinition());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Map domain2NotationMap = new HashMap();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = MindVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
					.hasNext();) {
				MindLinkDescriptor nextLinkDescriptor = (MindLinkDescriptor) linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view, Map domain2NotationMap) {
		if (!AdlDefinitionEditPart.MODEL_ID.equals(MindVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case AdlDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getAdlDefinition_1000ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CompositeComponentDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getCompositeComponentDefinition_2001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getPrimitiveComponentDefinition_2002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ComponentTypeDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getComponentTypeDefinition_2003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TemplateSpecifiersListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTemplateSpecifiersList_3001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TemplateSpecifierEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTemplateSpecifier_3002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FormalArgumentsListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getFormalArgumentsList_3003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FormalArgumentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getFormalArgument_3004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CompositeReferencesListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getCompositeReferencesList_3033ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CompositeReferenceDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getCompositeReferenceDefinition_3034ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ArgumentDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getArgumentDefinition_3007ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TemplateDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTemplateDefinition_3008ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case InterfaceDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getInterfaceDefinition_3009ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TemplateSubComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTemplateSubComponent_3024ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AnnotationsListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getAnnotationsList_3010ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AnnotationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getAnnotation_3011ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CompositeSubComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getCompositeSubComponent_3013ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getCompositeAnonymousSubComponent_3012ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrimitiveSubComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getPrimitiveSubComponent_3023ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ImplementationDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getImplementationDefinition_3016ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FileCEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getFileC_3017ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case InlineCodeCEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getInlineCodeC_3018ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DataDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getDataDefinition_3019ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AttributeDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getAttributeDefinition_3020ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getPrimitiveReferenceDefinition_3043ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ArgumentDefinition2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getArgumentDefinition_3022ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getPrimitiveAnonymousSubComponent_3014ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CompositeReferenceDefinition2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getCompositeReferenceDefinition_3044ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ArgumentDefinition3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getArgumentDefinition_3026ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TemplateDefinition2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTemplateDefinition_3027ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FormalArgumentsList2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getFormalArgumentsList_3015ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrimitiveReferencesListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getPrimitiveReferencesList_3035ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(MindDiagramUpdater
								.getPrimitiveReferenceDefinition_3036ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ArgumentDefinition4EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getArgumentDefinition_3030ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TypeReferencesListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTypeReferencesList_3037ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TypeReferenceDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getTypeReferenceDefinition_3038ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BindingDefinitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindDiagramUpdater
						.getBindingDefinition_4001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors,
			Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final MindLinkDescriptor nextLinkDescriptor = (MindLinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor
					.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor
					.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), String
							.valueOf(nextLinkDescriptor.getVisualID()),
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}
}
