/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.CompositeComponentDefinition;
import adl.CompositeDefinitionElement;
import adl.CompositeReferencesList;
import adl.FormalArgumentsList;
import adl.TemplateSpecifiersList;

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
 * An implementation of the model object '<em><b>Composite Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.CompositeComponentDefinitionImpl#getTemplateSpecifiersList <em>Template Specifiers List</em>}</li>
 *   <li>{@link adl.impl.CompositeComponentDefinitionImpl#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeComponentDefinitionImpl extends ArchitectureDefinitionImpl implements CompositeComponentDefinition {
	/**
	 * The cached value of the '{@link #getTemplateSpecifiersList() <em>Template Specifiers List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateSpecifiersList()
	 * @generated
	 * @ordered
	 */
	protected TemplateSpecifiersList templateSpecifiersList;

	/**
	 * The cached value of the '{@link #getCompositeFormalArgumentsList() <em>Composite Formal Arguments List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeFormalArgumentsList()
	 * @generated
	 * @ordered
	 */
	protected FormalArgumentsList compositeFormalArgumentsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.COMPOSITE_COMPONENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecifiersList getTemplateSpecifiersList() {
		return templateSpecifiersList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateSpecifiersList(TemplateSpecifiersList newTemplateSpecifiersList, NotificationChain msgs) {
		TemplateSpecifiersList oldTemplateSpecifiersList = templateSpecifiersList;
		templateSpecifiersList = newTemplateSpecifiersList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST, oldTemplateSpecifiersList, newTemplateSpecifiersList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateSpecifiersList(TemplateSpecifiersList newTemplateSpecifiersList) {
		if (newTemplateSpecifiersList != templateSpecifiersList) {
			NotificationChain msgs = null;
			if (templateSpecifiersList != null)
				msgs = ((InternalEObject)templateSpecifiersList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST, null, msgs);
			if (newTemplateSpecifiersList != null)
				msgs = ((InternalEObject)newTemplateSpecifiersList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST, null, msgs);
			msgs = basicSetTemplateSpecifiersList(newTemplateSpecifiersList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST, newTemplateSpecifiersList, newTemplateSpecifiersList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalArgumentsList getCompositeFormalArgumentsList() {
		return compositeFormalArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeFormalArgumentsList(FormalArgumentsList newCompositeFormalArgumentsList, NotificationChain msgs) {
		FormalArgumentsList oldCompositeFormalArgumentsList = compositeFormalArgumentsList;
		compositeFormalArgumentsList = newCompositeFormalArgumentsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, oldCompositeFormalArgumentsList, newCompositeFormalArgumentsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeFormalArgumentsList(FormalArgumentsList newCompositeFormalArgumentsList) {
		if (newCompositeFormalArgumentsList != compositeFormalArgumentsList) {
			NotificationChain msgs = null;
			if (compositeFormalArgumentsList != null)
				msgs = ((InternalEObject)compositeFormalArgumentsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
			if (newCompositeFormalArgumentsList != null)
				msgs = ((InternalEObject)newCompositeFormalArgumentsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
			msgs = basicSetCompositeFormalArgumentsList(newCompositeFormalArgumentsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, newCompositeFormalArgumentsList, newCompositeFormalArgumentsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
				return basicSetTemplateSpecifiersList(null, msgs);
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
				return basicSetCompositeFormalArgumentsList(null, msgs);
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
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
				return getTemplateSpecifiersList();
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
				return getCompositeFormalArgumentsList();
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
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
				setTemplateSpecifiersList((TemplateSpecifiersList)newValue);
				return;
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
				setCompositeFormalArgumentsList((FormalArgumentsList)newValue);
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
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
				setTemplateSpecifiersList((TemplateSpecifiersList)null);
				return;
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
				setCompositeFormalArgumentsList((FormalArgumentsList)null);
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
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
				return templateSpecifiersList != null;
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
				return compositeFormalArgumentsList != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeComponentDefinitionImpl
