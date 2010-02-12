/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.TemplateSpecifier;
import adl.TemplateSpecifiersList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Specifiers List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.TemplateSpecifiersListImpl#getTemplateSpecifiers <em>Template Specifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSpecifiersListImpl extends EObjectImpl implements TemplateSpecifiersList {
	/**
	 * The cached value of the '{@link #getTemplateSpecifiers() <em>Template Specifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateSpecifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateSpecifier> templateSpecifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSpecifiersListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.TEMPLATE_SPECIFIERS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateSpecifier> getTemplateSpecifiers() {
		if (templateSpecifiers == null) {
			templateSpecifiers = new EObjectContainmentWithInverseEList<TemplateSpecifier>(TemplateSpecifier.class, this, AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS, AdlPackage.TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST);
		}
		return templateSpecifiers;
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
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateSpecifiers()).basicAdd(otherEnd, msgs);
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
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
				return ((InternalEList<?>)getTemplateSpecifiers()).basicRemove(otherEnd, msgs);
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
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
				return getTemplateSpecifiers();
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
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
				getTemplateSpecifiers().clear();
				getTemplateSpecifiers().addAll((Collection<? extends TemplateSpecifier>)newValue);
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
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
				getTemplateSpecifiers().clear();
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
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
				return templateSpecifiers != null && !templateSpecifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateSpecifiersListImpl
