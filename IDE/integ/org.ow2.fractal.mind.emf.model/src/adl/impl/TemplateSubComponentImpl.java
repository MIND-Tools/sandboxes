/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.CompositeComponentDefinition;
import adl.CompositeDefinitionElement;
import adl.Element;
import adl.SubComponentDefinition;
import adl.TemplateSpecifier;
import adl.TemplateSubComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Sub Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.TemplateSubComponentImpl#getLinkedAnnotationsList <em>Linked Annotations List</em>}</li>
 *   <li>{@link adl.impl.TemplateSubComponentImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link adl.impl.TemplateSubComponentImpl#getTemplateReference <em>Template Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSubComponentImpl extends ComponentTypeDefinitionImpl implements TemplateSubComponent {
	/**
	 * The cached value of the '{@link #getLinkedAnnotationsList() <em>Linked Annotations List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAnnotationsList()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsList linkedAnnotationsList;
	/**
	 * The cached value of the '{@link #getTemplateReference() <em>Template Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateReference()
	 * @generated
	 * @ordered
	 */
	protected TemplateSpecifier templateReference;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSubComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.TEMPLATE_SUB_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList getLinkedAnnotationsList() {
		if (linkedAnnotationsList != null && linkedAnnotationsList.eIsProxy()) {
			InternalEObject oldLinkedAnnotationsList = (InternalEObject)linkedAnnotationsList;
			linkedAnnotationsList = (AnnotationsList)eResolveProxy(oldLinkedAnnotationsList);
			if (linkedAnnotationsList != oldLinkedAnnotationsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST, oldLinkedAnnotationsList, linkedAnnotationsList));
			}
		}
		return linkedAnnotationsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList basicGetLinkedAnnotationsList() {
		return linkedAnnotationsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedAnnotationsList(AnnotationsList newLinkedAnnotationsList) {
		AnnotationsList oldLinkedAnnotationsList = linkedAnnotationsList;
		linkedAnnotationsList = newLinkedAnnotationsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST, oldLinkedAnnotationsList, linkedAnnotationsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition getParentComponent() {
		if (eContainerFeatureID() != AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT) return null;
		return (ArchitectureDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponent(ArchitectureDefinition newParentComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponent, AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(ArchitectureDefinition newParentComponent) {
		if (newParentComponent != eInternalContainer() || (eContainerFeatureID() != AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT && newParentComponent != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponent != null)
				msgs = ((InternalEObject)newParentComponent).eInverseAdd(this, AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS, ArchitectureDefinition.class, msgs);
			msgs = basicSetParentComponent(newParentComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT, newParentComponent, newParentComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecifier getTemplateReference() {
		if (templateReference != null && templateReference.eIsProxy()) {
			InternalEObject oldTemplateReference = (InternalEObject)templateReference;
			templateReference = (TemplateSpecifier)eResolveProxy(oldTemplateReference);
			if (templateReference != oldTemplateReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE, oldTemplateReference, templateReference));
			}
		}
		return templateReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecifier basicGetTemplateReference() {
		return templateReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateReference(TemplateSpecifier newTemplateReference) {
		TemplateSpecifier oldTemplateReference = templateReference;
		templateReference = newTemplateReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE, oldTemplateReference, templateReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponent((ArchitectureDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				return basicSetParentComponent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS, ArchitectureDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				if (resolve) return getLinkedAnnotationsList();
				return basicGetLinkedAnnotationsList();
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				return getParentComponent();
			case AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE:
				if (resolve) return getTemplateReference();
				return basicGetTemplateReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				setLinkedAnnotationsList((AnnotationsList)newValue);
				return;
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				setParentComponent((ArchitectureDefinition)newValue);
				return;
			case AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE:
				setTemplateReference((TemplateSpecifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				setLinkedAnnotationsList((AnnotationsList)null);
				return;
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				setParentComponent((ArchitectureDefinition)null);
				return;
			case AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE:
				setTemplateReference((TemplateSpecifier)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				return linkedAnnotationsList != null;
			case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT:
				return getParentComponent() != null;
			case AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE:
				return templateReference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST: return AdlPackage.ELEMENT__LINKED_ANNOTATIONS_LIST;
				case AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT: return AdlPackage.ELEMENT__PARENT_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == CompositeDefinitionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubComponentDefinition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case AdlPackage.ELEMENT__LINKED_ANNOTATIONS_LIST: return AdlPackage.TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST;
				case AdlPackage.ELEMENT__PARENT_COMPONENT: return AdlPackage.TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == CompositeDefinitionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubComponentDefinition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TemplateSubComponentImpl
