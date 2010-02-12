/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.AnnotationElement;
import adl.ElementValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.ElementValueImpl#getParentAnnotationElement <em>Parent Annotation Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementValueImpl extends EObjectImpl implements ElementValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.ELEMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationElement getParentAnnotationElement() {
		if (eContainerFeatureID() != AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT) return null;
		return (AnnotationElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAnnotationElement(AnnotationElement newParentAnnotationElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentAnnotationElement, AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAnnotationElement(AnnotationElement newParentAnnotationElement) {
		if (newParentAnnotationElement != eInternalContainer() || (eContainerFeatureID() != AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT && newParentAnnotationElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentAnnotationElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAnnotationElement != null)
				msgs = ((InternalEObject)newParentAnnotationElement).eInverseAdd(this, AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, AnnotationElement.class, msgs);
			msgs = basicSetParentAnnotationElement(newParentAnnotationElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT, newParentAnnotationElement, newParentAnnotationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAnnotationElement((AnnotationElement)otherEnd, msgs);
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
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				return basicSetParentAnnotationElement(null, msgs);
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
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, AnnotationElement.class, msgs);
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
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				return getParentAnnotationElement();
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
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				setParentAnnotationElement((AnnotationElement)newValue);
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
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				setParentAnnotationElement((AnnotationElement)null);
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
			case AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT:
				return getParentAnnotationElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementValueImpl
