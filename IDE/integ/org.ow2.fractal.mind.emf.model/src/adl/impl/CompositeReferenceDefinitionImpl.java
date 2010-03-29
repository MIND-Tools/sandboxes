/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.ArgumentDefinition;
import adl.CompositeReferenceDefinition;
import adl.TemplateDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Reference Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.CompositeReferenceDefinitionImpl#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link adl.impl.CompositeReferenceDefinitionImpl#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeReferenceDefinitionImpl extends ComponentReferenceImpl implements CompositeReferenceDefinition {
	/**
	 * The cached value of the '{@link #getTemplatesList() <em>Templates List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatesList()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateDefinition> templatesList;

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
	protected CompositeReferenceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.COMPOSITE_REFERENCE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateDefinition> getTemplatesList() {
		if (templatesList == null) {
			templatesList = new EObjectContainmentEList<TemplateDefinition>(TemplateDefinition.class, this, AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST);
		}
		return templatesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentDefinition> getArgumentsList() {
		if (argumentsList == null) {
			argumentsList = new EObjectContainmentEList<ArgumentDefinition>(ArgumentDefinition.class, this, AdlPackage.COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST);
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
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST:
				return ((InternalEList<?>)getTemplatesList()).basicRemove(otherEnd, msgs);
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
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
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST:
				return getTemplatesList();
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
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
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST:
				getTemplatesList().clear();
				getTemplatesList().addAll((Collection<? extends TemplateDefinition>)newValue);
				return;
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
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
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST:
				getTemplatesList().clear();
				return;
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
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
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST:
				return templatesList != null && !templatesList.isEmpty();
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST:
				return argumentsList != null && !argumentsList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeReferenceDefinitionImpl
