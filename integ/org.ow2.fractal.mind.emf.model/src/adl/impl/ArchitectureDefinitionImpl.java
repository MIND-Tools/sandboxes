/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.Element;
import adl.ReferencesList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.ArchitectureDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link adl.impl.ArchitectureDefinitionImpl#getParentAdlDefinition <em>Parent Adl Definition</em>}</li>
 *   <li>{@link adl.impl.ArchitectureDefinitionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link adl.impl.ArchitectureDefinitionImpl#getReferencesList <em>References List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureDefinitionImpl extends EObjectImpl implements ArchitectureDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "default_Name";

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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getReferencesList() <em>References List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesList()
	 * @generated
	 * @ordered
	 */
	protected ReferencesList referencesList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.ARCHITECTURE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ARCHITECTURE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdlDefinition getParentAdlDefinition() {
		if (eContainerFeatureID() != AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION) return null;
		return (AdlDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAdlDefinition(AdlDefinition newParentAdlDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentAdlDefinition, AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdlDefinition(AdlDefinition newParentAdlDefinition) {
		if (newParentAdlDefinition != eInternalContainer() || (eContainerFeatureID() != AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION && newParentAdlDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newParentAdlDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAdlDefinition != null)
				msgs = ((InternalEObject)newParentAdlDefinition).eInverseAdd(this, AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION, AdlDefinition.class, msgs);
			msgs = basicSetParentAdlDefinition(newParentAdlDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION, newParentAdlDefinition, newParentAdlDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS, AdlPackage.ELEMENT__PARENT_COMPONENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesList getReferencesList() {
		return referencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesList(ReferencesList newReferencesList, NotificationChain msgs) {
		ReferencesList oldReferencesList = referencesList;
		referencesList = newReferencesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST, oldReferencesList, newReferencesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesList(ReferencesList newReferencesList) {
		if (newReferencesList != referencesList) {
			NotificationChain msgs = null;
			if (referencesList != null)
				msgs = ((InternalEObject)referencesList).eInverseRemove(this, AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION, ReferencesList.class, msgs);
			if (newReferencesList != null)
				msgs = ((InternalEObject)newReferencesList).eInverseAdd(this, AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION, ReferencesList.class, msgs);
			msgs = basicSetReferencesList(newReferencesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST, newReferencesList, newReferencesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAdlDefinition((AdlDefinition)otherEnd, msgs);
			case AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST:
				if (referencesList != null)
					msgs = ((InternalEObject)referencesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST, null, msgs);
				return basicSetReferencesList((ReferencesList)otherEnd, msgs);
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
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				return basicSetParentAdlDefinition(null, msgs);
			case AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST:
				return basicSetReferencesList(null, msgs);
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
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION, AdlDefinition.class, msgs);
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
			case AdlPackage.ARCHITECTURE_DEFINITION__NAME:
				return getName();
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				return getParentAdlDefinition();
			case AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS:
				return getElements();
			case AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST:
				return getReferencesList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdlPackage.ARCHITECTURE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				setParentAdlDefinition((AdlDefinition)newValue);
				return;
			case AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST:
				setReferencesList((ReferencesList)newValue);
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
			case AdlPackage.ARCHITECTURE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				setParentAdlDefinition((AdlDefinition)null);
				return;
			case AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS:
				getElements().clear();
				return;
			case AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST:
				setReferencesList((ReferencesList)null);
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
			case AdlPackage.ARCHITECTURE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION:
				return getParentAdlDefinition() != null;
			case AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST:
				return referencesList != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArchitectureDefinitionImpl
