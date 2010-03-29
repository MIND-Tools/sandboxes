/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.TemplateSpecifier;
import adl.TemplateSpecifiersList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.TemplateSpecifierImpl#getParentTemplateSpecifierList <em>Parent Template Specifier List</em>}</li>
 *   <li>{@link adl.impl.TemplateSpecifierImpl#getComponentTypeName <em>Component Type Name</em>}</li>
 *   <li>{@link adl.impl.TemplateSpecifierImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSpecifierImpl extends EObjectImpl implements TemplateSpecifier {
	/**
	 * The default value of the '{@link #getComponentTypeName() <em>Component Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_TYPE_NAME_EDEFAULT = "component_Type_Name";

	/**
	 * The cached value of the '{@link #getComponentTypeName() <em>Component Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypeName()
	 * @generated
	 * @ordered
	 */
	protected String componentTypeName = COMPONENT_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "template_name";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSpecifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.TEMPLATE_SPECIFIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_SPECIFIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecifiersList getParentTemplateSpecifierList() {
		if (eContainerFeatureID() != AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST) return null;
		return (TemplateSpecifiersList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentTemplateSpecifierList(TemplateSpecifiersList newParentTemplateSpecifierList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentTemplateSpecifierList, AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTemplateSpecifierList(TemplateSpecifiersList newParentTemplateSpecifierList) {
		if (newParentTemplateSpecifierList != eInternalContainer() || (eContainerFeatureID() != AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST && newParentTemplateSpecifierList != null)) {
			if (EcoreUtil.isAncestor(this, newParentTemplateSpecifierList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentTemplateSpecifierList != null)
				msgs = ((InternalEObject)newParentTemplateSpecifierList).eInverseAdd(this, AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS, TemplateSpecifiersList.class, msgs);
			msgs = basicSetParentTemplateSpecifierList(newParentTemplateSpecifierList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST, newParentTemplateSpecifierList, newParentTemplateSpecifierList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentTypeName() {
		return componentTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentTypeName(String newComponentTypeName) {
		String oldComponentTypeName = componentTypeName;
		componentTypeName = newComponentTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME, oldComponentTypeName, componentTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentTemplateSpecifierList((TemplateSpecifiersList)otherEnd, msgs);
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
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				return basicSetParentTemplateSpecifierList(null, msgs);
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
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				return eInternalContainer().eInverseRemove(this, AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS, TemplateSpecifiersList.class, msgs);
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
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				return getParentTemplateSpecifierList();
			case AdlPackage.TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME:
				return getComponentTypeName();
			case AdlPackage.TEMPLATE_SPECIFIER__NAME:
				return getName();
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
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				setParentTemplateSpecifierList((TemplateSpecifiersList)newValue);
				return;
			case AdlPackage.TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME:
				setComponentTypeName((String)newValue);
				return;
			case AdlPackage.TEMPLATE_SPECIFIER__NAME:
				setName((String)newValue);
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
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				setParentTemplateSpecifierList((TemplateSpecifiersList)null);
				return;
			case AdlPackage.TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME:
				setComponentTypeName(COMPONENT_TYPE_NAME_EDEFAULT);
				return;
			case AdlPackage.TEMPLATE_SPECIFIER__NAME:
				setName(NAME_EDEFAULT);
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
			case AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST:
				return getParentTemplateSpecifierList() != null;
			case AdlPackage.TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME:
				return COMPONENT_TYPE_NAME_EDEFAULT == null ? componentTypeName != null : !COMPONENT_TYPE_NAME_EDEFAULT.equals(componentTypeName);
			case AdlPackage.TEMPLATE_SPECIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (componentTypeName: ");
		result.append(componentTypeName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TemplateSpecifierImpl
