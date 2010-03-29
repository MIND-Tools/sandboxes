/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.FormalArgument;
import adl.FormalArgumentsList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.FormalArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link adl.impl.FormalArgumentImpl#getParentFormalArgumentsList <em>Parent Formal Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalArgumentImpl extends EObjectImpl implements FormalArgument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "argument_name";

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
	 * The cached value of the '{@link #getParentFormalArgumentsList() <em>Parent Formal Arguments List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFormalArgumentsList()
	 * @generated
	 * @ordered
	 */
	protected FormalArgumentsList parentFormalArgumentsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.FORMAL_ARGUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.FORMAL_ARGUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalArgumentsList getParentFormalArgumentsList() {
		if (parentFormalArgumentsList != null && parentFormalArgumentsList.eIsProxy()) {
			InternalEObject oldParentFormalArgumentsList = (InternalEObject)parentFormalArgumentsList;
			parentFormalArgumentsList = (FormalArgumentsList)eResolveProxy(oldParentFormalArgumentsList);
			if (parentFormalArgumentsList != oldParentFormalArgumentsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST, oldParentFormalArgumentsList, parentFormalArgumentsList));
			}
		}
		return parentFormalArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalArgumentsList basicGetParentFormalArgumentsList() {
		return parentFormalArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFormalArgumentsList(FormalArgumentsList newParentFormalArgumentsList) {
		FormalArgumentsList oldParentFormalArgumentsList = parentFormalArgumentsList;
		parentFormalArgumentsList = newParentFormalArgumentsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST, oldParentFormalArgumentsList, parentFormalArgumentsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.FORMAL_ARGUMENT__NAME:
				return getName();
			case AdlPackage.FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST:
				if (resolve) return getParentFormalArgumentsList();
				return basicGetParentFormalArgumentsList();
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
			case AdlPackage.FORMAL_ARGUMENT__NAME:
				setName((String)newValue);
				return;
			case AdlPackage.FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST:
				setParentFormalArgumentsList((FormalArgumentsList)newValue);
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
			case AdlPackage.FORMAL_ARGUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdlPackage.FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST:
				setParentFormalArgumentsList((FormalArgumentsList)null);
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
			case AdlPackage.FORMAL_ARGUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdlPackage.FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST:
				return parentFormalArgumentsList != null;
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

} //FormalArgumentImpl
