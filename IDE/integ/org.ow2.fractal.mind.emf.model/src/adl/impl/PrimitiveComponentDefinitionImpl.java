/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.FormalArgumentsList;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveDefinitionElement;
import adl.PrimitiveReferencesList;

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
 * An implementation of the model object '<em><b>Primitive Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.PrimitiveComponentDefinitionImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link adl.impl.PrimitiveComponentDefinitionImpl#getPrimitiveFormalArgumentsList <em>Primitive Formal Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveComponentDefinitionImpl extends ArchitectureDefinitionImpl implements PrimitiveComponentDefinition {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimitiveFormalArgumentsList() <em>Primitive Formal Arguments List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveFormalArgumentsList()
	 * @generated
	 * @ordered
	 */
	protected FormalArgumentsList primitiveFormalArgumentsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.PRIMITIVE_COMPONENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalArgumentsList getPrimitiveFormalArgumentsList() {
		return primitiveFormalArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveFormalArgumentsList(FormalArgumentsList newPrimitiveFormalArgumentsList, NotificationChain msgs) {
		FormalArgumentsList oldPrimitiveFormalArgumentsList = primitiveFormalArgumentsList;
		primitiveFormalArgumentsList = newPrimitiveFormalArgumentsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST, oldPrimitiveFormalArgumentsList, newPrimitiveFormalArgumentsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveFormalArgumentsList(FormalArgumentsList newPrimitiveFormalArgumentsList) {
		if (newPrimitiveFormalArgumentsList != primitiveFormalArgumentsList) {
			NotificationChain msgs = null;
			if (primitiveFormalArgumentsList != null)
				msgs = ((InternalEObject)primitiveFormalArgumentsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST, null, msgs);
			if (newPrimitiveFormalArgumentsList != null)
				msgs = ((InternalEObject)newPrimitiveFormalArgumentsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST, null, msgs);
			msgs = basicSetPrimitiveFormalArgumentsList(newPrimitiveFormalArgumentsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST, newPrimitiveFormalArgumentsList, newPrimitiveFormalArgumentsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST:
				return basicSetPrimitiveFormalArgumentsList(null, msgs);
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
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT:
				return isAbstract();
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST:
				return getPrimitiveFormalArgumentsList();
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
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST:
				setPrimitiveFormalArgumentsList((FormalArgumentsList)newValue);
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
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST:
				setPrimitiveFormalArgumentsList((FormalArgumentsList)null);
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
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST:
				return primitiveFormalArgumentsList != null;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //PrimitiveComponentDefinitionImpl
