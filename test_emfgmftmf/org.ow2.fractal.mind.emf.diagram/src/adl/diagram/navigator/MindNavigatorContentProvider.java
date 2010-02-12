package adl.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import adl.diagram.part.Messages;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class MindNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public MindNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for (Iterator it = myEditingDomain.getResourceSet().getResources()
				.iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), AdlDefinitionEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof MindNavigatorGroup) {
			MindNavigatorGroup group = (MindNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof MindNavigatorItem) {
			MindNavigatorItem navigatorItem = (MindNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (MindVisualIDRegistry.getVisualID(view)) {

		case AdlDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MindNavigatorGroup links = new MindNavigatorGroup(
					Messages.NavigatorGroupName_AdlDefinition_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(CompositeComponentDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveComponentDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(ComponentTypeDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(BindingDefinitionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CompositeComponentDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(TemplateSpecifiersListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(FormalArgumentsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferencesListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TemplateSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(CompositeSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveAnonymousSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PrimitiveComponentDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(FormalArgumentsList2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(ImplementationDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(DataDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AttributeDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveReferencesListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ComponentTypeDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(TypeReferencesListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TemplateSpecifiersListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TemplateSpecifierEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FormalArgumentsListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(FormalArgumentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositeReferencesListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositeReferenceDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(ArgumentDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TemplateDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case InterfaceDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MindNavigatorGroup incominglinks = new MindNavigatorGroup(
					Messages.NavigatorGroupName_InterfaceDefinition_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MindNavigatorGroup outgoinglinks = new MindNavigatorGroup(
					Messages.NavigatorGroupName_InterfaceDefinition_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(BindingDefinitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MindVisualIDRegistry
							.getType(BindingDefinitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TemplateSubComponentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(TemplateSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnnotationsListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry.getType(AnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositeSubComponentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(TemplateSpecifiersListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(CompositeSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveAnonymousSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TemplateSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositeAnonymousSubComponentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(TemplateSpecifiersListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(CompositeSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveAnonymousSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TemplateSubComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PrimitiveSubComponentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(ImplementationDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(DataDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AttributeDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveReferenceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ImplementationDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry.getType(FileCEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry.getType(InlineCodeCEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DataDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry.getType(FileCEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry.getType(InlineCodeCEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(ArgumentDefinition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(ImplementationDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(DataDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AttributeDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(AnnotationsListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveReferenceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositeReferenceDefinition2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(ArgumentDefinition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TemplateDefinition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FormalArgumentsList2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(FormalArgumentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PrimitiveReferencesListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MindVisualIDRegistry
							.getType(PrimitiveReferenceDefinition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(ArgumentDefinition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TypeReferencesListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MindVisualIDRegistry
							.getType(TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MindVisualIDRegistry
							.getType(TypeReferenceDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case BindingDefinitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MindNavigatorGroup target = new MindNavigatorGroup(
					Messages.NavigatorGroupName_BindingDefinition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MindNavigatorGroup source = new MindNavigatorGroup(
					Messages.NavigatorGroupName_BindingDefinition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MindVisualIDRegistry
					.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MindVisualIDRegistry
							.getType(InterfaceDefinitionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return AdlDefinitionEditPart.MODEL_ID.equals(MindVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result
					.add(new MindNavigatorItem((View) it.next(), parent,
							isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof MindAbstractNavigatorItem) {
			MindAbstractNavigatorItem abstractNavigatorItem = (MindAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
