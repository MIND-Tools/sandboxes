/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.TemplateDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.TemplateDefinitionImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link adl.impl.TemplateDefinitionImpl#getTemplateValue <em>Template Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateDefinitionImpl extends EObjectImpl implements TemplateDefinition {
	/**
	 * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_NAME_EDEFAULT = "template_Name";

	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String templateName = TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateValue() <em>Template Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateValue() <em>Template Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateValue()
	 * @generated
	 * @ordered
	 */
	protected String templateValue = TEMPLATE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.TEMPLATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(String newTemplateName) {
		String oldTemplateName = templateName;
		templateName = newTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME, oldTemplateName, templateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateValue() {
		return templateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateValue(String newTemplateValue) {
		String oldTemplateValue = templateValue;
		templateValue = newTemplateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE, oldTemplateValue, templateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return getTemplateName();
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				return getTemplateValue();
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
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				setTemplateName((String)newValue);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				setTemplateValue((String)newValue);
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
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				setTemplateName(TEMPLATE_NAME_EDEFAULT);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				setTemplateValue(TEMPLATE_VALUE_EDEFAULT);
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
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				return TEMPLATE_VALUE_EDEFAULT == null ? templateValue != null : !TEMPLATE_VALUE_EDEFAULT.equals(templateValue);
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
		result.append(" (templateName: ");
		result.append(templateName);
		result.append(", templateValue: ");
		result.append(templateValue);
		result.append(')');
		return result.toString();
	}

} //TemplateDefinitionImpl
