/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.ArgumentDefinition;
import adl.PrimitiveReferenceDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Reference Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.PrimitiveReferenceDefinitionImpl#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveReferenceDefinitionImpl extends ComponentReferenceImpl implements PrimitiveReferenceDefinition {
	/**
	 * The cached value of the '{@link #getArgumentsList() <em>Arguments List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentsList()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentDefinition> argumentsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveReferenceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.PRIMITIVE_REFERENCE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentDefinition> getArgumentsList() {
		if (argumentsList == null) {
			argumentsList = new EObjectContainmentEList<ArgumentDefinition>(ArgumentDefinition.class, this, AdlPackage.PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST);
		}
		return argumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
				return ((InternalEList<?>)getArgumentsList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
				return getArgumentsList();
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
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
				getArgumentsList().clear();
				getArgumentsList().addAll((Collection<? extends ArgumentDefinition>)newValue);
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
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
				getArgumentsList().clear();
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
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
				return argumentsList != null && !argumentsList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveReferenceDefinitionImpl
