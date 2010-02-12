/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ReferencesList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.ReferencesListImpl#getReferences <em>References</em>}</li>
 *   <li>{@link adl.impl.ReferencesListImpl#getParentComponentDefinition <em>Parent Component Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencesListImpl extends EObjectImpl implements ReferencesList {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentReference> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.REFERENCES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<ComponentReference>(ComponentReference.class, this, AdlPackage.REFERENCES_LIST__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition getParentComponentDefinition() {
		if (eContainerFeatureID() != AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION) return null;
		return (ArchitectureDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponentDefinition(ArchitectureDefinition newParentComponentDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponentDefinition, AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponentDefinition(ArchitectureDefinition newParentComponentDefinition) {
		if (newParentComponentDefinition != eInternalContainer() || (eContainerFeatureID() != AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION && newParentComponentDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponentDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponentDefinition != null)
				msgs = ((InternalEObject)newParentComponentDefinition).eInverseAdd(this, AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST, ArchitectureDefinition.class, msgs);
			msgs = basicSetParentComponentDefinition(newParentComponentDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION, newParentComponentDefinition, newParentComponentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponentDefinition((ArchitectureDefinition)otherEnd, msgs);
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
			case AdlPackage.REFERENCES_LIST__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				return basicSetParentComponentDefinition(null, msgs);
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
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST, ArchitectureDefinition.class, msgs);
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
			case AdlPackage.REFERENCES_LIST__REFERENCES:
				return getReferences();
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				return getParentComponentDefinition();
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
			case AdlPackage.REFERENCES_LIST__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends ComponentReference>)newValue);
				return;
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				setParentComponentDefinition((ArchitectureDefinition)newValue);
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
			case AdlPackage.REFERENCES_LIST__REFERENCES:
				getReferences().clear();
				return;
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				setParentComponentDefinition((ArchitectureDefinition)null);
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
			case AdlPackage.REFERENCES_LIST__REFERENCES:
				return references != null && !references.isEmpty();
			case AdlPackage.REFERENCES_LIST__PARENT_COMPONENT_DEFINITION:
				return getParentComponentDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferencesListImpl
