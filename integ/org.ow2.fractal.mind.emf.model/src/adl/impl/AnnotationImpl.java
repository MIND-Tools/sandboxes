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
import adl.AnnotationsList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.AnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link adl.impl.AnnotationImpl#getAnnotationElements <em>Annotation Elements</em>}</li>
 *   <li>{@link adl.impl.AnnotationImpl#getParentAnnotationList <em>Parent Annotation List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends ElementValueImpl implements Annotation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "annotationt_Name";

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
	 * The cached value of the '{@link #getAnnotationElements() <em>Annotation Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationElement> annotationElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.ANNOTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationElement> getAnnotationElements() {
		if (annotationElements == null) {
			annotationElements = new EObjectContainmentWithInverseEList<AnnotationElement>(AnnotationElement.class, this, AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS, AdlPackage.ANNOTATION_ELEMENT__PARENT_ANNOTATION);
		}
		return annotationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList getParentAnnotationList() {
		if (eContainerFeatureID() != AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST) return null;
		return (AnnotationsList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAnnotationList(AnnotationsList newParentAnnotationList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentAnnotationList, AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAnnotationList(AnnotationsList newParentAnnotationList) {
		if (newParentAnnotationList != eInternalContainer() || (eContainerFeatureID() != AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST && newParentAnnotationList != null)) {
			if (EcoreUtil.isAncestor(this, newParentAnnotationList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAnnotationList != null)
				msgs = ((InternalEObject)newParentAnnotationList).eInverseAdd(this, AdlPackage.ANNOTATIONS_LIST__ANNOTATIONS, AnnotationsList.class, msgs);
			msgs = basicSetParentAnnotationList(newParentAnnotationList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST, newParentAnnotationList, newParentAnnotationList));
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
			case AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotationElements()).basicAdd(otherEnd, msgs);
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAnnotationList((AnnotationsList)otherEnd, msgs);
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
			case AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS:
				return ((InternalEList<?>)getAnnotationElements()).basicRemove(otherEnd, msgs);
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				return basicSetParentAnnotationList(null, msgs);
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
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ANNOTATIONS_LIST__ANNOTATIONS, AnnotationsList.class, msgs);
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
			case AdlPackage.ANNOTATION__NAME:
				return getName();
			case AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS:
				return getAnnotationElements();
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				return getParentAnnotationList();
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
			case AdlPackage.ANNOTATION__NAME:
				setName((String)newValue);
				return;
			case AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS:
				getAnnotationElements().clear();
				getAnnotationElements().addAll((Collection<? extends AnnotationElement>)newValue);
				return;
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				setParentAnnotationList((AnnotationsList)newValue);
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
			case AdlPackage.ANNOTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS:
				getAnnotationElements().clear();
				return;
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				setParentAnnotationList((AnnotationsList)null);
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
			case AdlPackage.ANNOTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdlPackage.ANNOTATION__ANNOTATION_ELEMENTS:
				return annotationElements != null && !annotationElements.isEmpty();
			case AdlPackage.ANNOTATION__PARENT_ANNOTATION_LIST:
				return getParentAnnotationList() != null;
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

} //AnnotationImpl
