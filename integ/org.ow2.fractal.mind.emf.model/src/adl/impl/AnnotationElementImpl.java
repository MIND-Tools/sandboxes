/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.Annotation;
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
 * An implementation of the model object '<em><b>Annotation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.AnnotationElementImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link adl.impl.AnnotationElementImpl#getElementValue <em>Element Value</em>}</li>
 *   <li>{@link adl.impl.AnnotationElementImpl#getParentAnnotation <em>Parent Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationElementImpl extends EObjectImpl implements AnnotationElement {
	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = "element_Name";

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementValue() <em>Element Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementValue()
	 * @generated
	 * @ordered
	 */
	protected ElementValue elementValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.ANNOTATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION_ELEMENT__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementValue getElementValue() {
		return elementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementValue(ElementValue newElementValue, NotificationChain msgs) {
		ElementValue oldElementValue = elementValue;
		elementValue = newElementValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, oldElementValue, newElementValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementValue(ElementValue newElementValue) {
		if (newElementValue != elementValue) {
			NotificationChain msgs = null;
			if (elementValue != null)
				msgs = ((InternalEObject)elementValue).eInverseRemove(this, AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT, ElementValue.class, msgs);
			if (newElementValue != null)
				msgs = ((InternalEObject)newElementValue).eInverseAdd(this, AdlPackage.ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT, ElementValue.class, msgs);
			msgs = basicSetElementValue(newElementValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, newElementValue, newElementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getParentAnnotation() {
		if (eContainerFeatureID() != AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION) return null;
		return (Annotation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAnnotation(Annotation newParentAnnotation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentAnnotation, AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAnnotation(Annotation newParentAnnotation) {
		if (newParentAnnotation != eInternalContainer() || (eContainerFeatureID() != AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION && newParentAnnotation != null)) {
			if (EcoreUtil.isAncestor(this, newParentAnnotation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAnnotation != null)
				msgs = ((InternalEObject)newParentAnnotation).eInverseAdd(this, AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS, Annotation.class, msgs);
			msgs = basicSetParentAnnotation(newParentAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION, newParentAnnotation, newParentAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
				if (elementValue != null)
					msgs = ((InternalEObject)elementValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, null, msgs);
				return basicSetElementValue((ElementValue)otherEnd, msgs);
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAnnotation((Annotation)otherEnd, msgs);
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
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
				return basicSetElementValue(null, msgs);
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				return basicSetParentAnnotation(null, msgs);
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
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS, Annotation.class, msgs);
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
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
				return getElementName();
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
				return getElementValue();
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				return getParentAnnotation();
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
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
				setElementValue((ElementValue)newValue);
				return;
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				setParentAnnotation((Annotation)newValue);
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
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
				setElementValue((ElementValue)null);
				return;
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				setParentAnnotation((Annotation)null);
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
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case AdlPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
				return elementValue != null;
			case AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION:
				return getParentAnnotation() != null;
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
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //AnnotationElementImpl
