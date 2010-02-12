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
import adl.CompositeDefinitionElement;
import adl.ComponentTypeDefinition;
import adl.Contingency;
import adl.Element;
import adl.InterfaceDefinition;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveDefinitionElement;
import adl.Role;
import adl.TypeDefinitionElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getLinkedAnnotationsList <em>Linked Annotations List</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getCollectionsize <em>Collectionsize</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getContingency <em>Contingency</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link adl.impl.InterfaceDefinitionImpl#isCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceDefinitionImpl extends MergedObjectImpl implements InterfaceDefinition {
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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.PROVIDES;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionsize() <em>Collectionsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionsize()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLECTIONSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCollectionsize() <em>Collectionsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionsize()
	 * @generated
	 * @ordered
	 */
	protected int collectionsize = COLLECTIONSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContingency() <em>Contingency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingency()
	 * @generated
	 * @ordered
	 */
	protected static final Contingency CONTINGENCY_EDEFAULT = Contingency.OPTIONAL;

	/**
	 * The cached value of the '{@link #getContingency() <em>Contingency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingency()
	 * @generated
	 * @ordered
	 */
	protected Contingency contingency = CONTINGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "interface_name";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean collection = COLLECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.INTERFACE_DEFINITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST, oldLinkedAnnotationsList, linkedAnnotationsList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST, oldLinkedAnnotationsList, linkedAnnotationsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition getParentComponent() {
		if (eContainerFeatureID() != AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT) return null;
		return (ArchitectureDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponent(ArchitectureDefinition newParentComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponent, AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(ArchitectureDefinition newParentComponent) {
		if (newParentComponent != eInternalContainer() || (eContainerFeatureID() != AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT && newParentComponent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT, newParentComponent, newParentComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCollectionsize() {
		return collectionsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionsize(int newCollectionsize) {
		int oldCollectionsize = collectionsize;
		collectionsize = newCollectionsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__COLLECTIONSIZE, oldCollectionsize, collectionsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency getContingency() {
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContingency(Contingency newContingency) {
		Contingency oldContingency = contingency;
		contingency = newContingency == null ? CONTINGENCY_EDEFAULT : newContingency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__CONTINGENCY, oldContingency, contingency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(boolean newCollection) {
		boolean oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.INTERFACE_DEFINITION__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
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
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
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
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
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
			case AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST:
				if (resolve) return getLinkedAnnotationsList();
				return basicGetLinkedAnnotationsList();
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
				return getParentComponent();
			case AdlPackage.INTERFACE_DEFINITION__ROLE:
				return getRole();
			case AdlPackage.INTERFACE_DEFINITION__SIGNATURE:
				return getSignature();
			case AdlPackage.INTERFACE_DEFINITION__COLLECTIONSIZE:
				return getCollectionsize();
			case AdlPackage.INTERFACE_DEFINITION__CONTINGENCY:
				return getContingency();
			case AdlPackage.INTERFACE_DEFINITION__NAME:
				return getName();
			case AdlPackage.INTERFACE_DEFINITION__COLLECTION:
				return isCollection();
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
			case AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST:
				setLinkedAnnotationsList((AnnotationsList)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
				setParentComponent((ArchitectureDefinition)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__ROLE:
				setRole((Role)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__SIGNATURE:
				setSignature((String)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__COLLECTIONSIZE:
				setCollectionsize((Integer)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__CONTINGENCY:
				setContingency((Contingency)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case AdlPackage.INTERFACE_DEFINITION__COLLECTION:
				setCollection((Boolean)newValue);
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
			case AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST:
				setLinkedAnnotationsList((AnnotationsList)null);
				return;
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
				setParentComponent((ArchitectureDefinition)null);
				return;
			case AdlPackage.INTERFACE_DEFINITION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case AdlPackage.INTERFACE_DEFINITION__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case AdlPackage.INTERFACE_DEFINITION__COLLECTIONSIZE:
				setCollectionsize(COLLECTIONSIZE_EDEFAULT);
				return;
			case AdlPackage.INTERFACE_DEFINITION__CONTINGENCY:
				setContingency(CONTINGENCY_EDEFAULT);
				return;
			case AdlPackage.INTERFACE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdlPackage.INTERFACE_DEFINITION__COLLECTION:
				setCollection(COLLECTION_EDEFAULT);
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
			case AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST:
				return linkedAnnotationsList != null;
			case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT:
				return getParentComponent() != null;
			case AdlPackage.INTERFACE_DEFINITION__ROLE:
				return role != ROLE_EDEFAULT;
			case AdlPackage.INTERFACE_DEFINITION__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case AdlPackage.INTERFACE_DEFINITION__COLLECTIONSIZE:
				return collectionsize != COLLECTIONSIZE_EDEFAULT;
			case AdlPackage.INTERFACE_DEFINITION__CONTINGENCY:
				return contingency != CONTINGENCY_EDEFAULT;
			case AdlPackage.INTERFACE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdlPackage.INTERFACE_DEFINITION__COLLECTION:
				return collection != COLLECTION_EDEFAULT;
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
				case AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST: return AdlPackage.ELEMENT__LINKED_ANNOTATIONS_LIST;
				case AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT: return AdlPackage.ELEMENT__PARENT_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == CompositeDefinitionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimitiveDefinitionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeDefinitionElement.class) {
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
				case AdlPackage.ELEMENT__LINKED_ANNOTATIONS_LIST: return AdlPackage.INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST;
				case AdlPackage.ELEMENT__PARENT_COMPONENT: return AdlPackage.INTERFACE_DEFINITION__PARENT_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == CompositeDefinitionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimitiveDefinitionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeDefinitionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(", signature: ");
		result.append(signature);
		result.append(", collectionsize: ");
		result.append(collectionsize);
		result.append(", contingency: ");
		result.append(contingency);
		result.append(", name: ");
		result.append(name);
		result.append(", collection: ");
		result.append(collection);
		result.append(')');
		return result.toString();
	}

} //InterfaceDefinitionImpl
