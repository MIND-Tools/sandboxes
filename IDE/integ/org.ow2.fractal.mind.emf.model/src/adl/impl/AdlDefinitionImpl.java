/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.ImportDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.AdlDefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link adl.impl.AdlDefinitionImpl#getDefinitionAnnotationsList <em>Definition Annotations List</em>}</li>
 *   <li>{@link adl.impl.AdlDefinitionImpl#getArchitecturedefinition <em>Architecturedefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdlDefinitionImpl extends EObjectImpl implements AdlDefinition {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDefinition> imports;

	/**
	 * The cached value of the '{@link #getDefinitionAnnotationsList() <em>Definition Annotations List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionAnnotationsList()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsList definitionAnnotationsList;

	/**
	 * The cached value of the '{@link #getArchitecturedefinition() <em>Architecturedefinition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturedefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureDefinition> architecturedefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdlDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.ADL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDefinition> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<ImportDefinition>(ImportDefinition.class, this, AdlPackage.ADL_DEFINITION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList getDefinitionAnnotationsList() {
		return definitionAnnotationsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionAnnotationsList(AnnotationsList newDefinitionAnnotationsList, NotificationChain msgs) {
		AnnotationsList oldDefinitionAnnotationsList = definitionAnnotationsList;
		definitionAnnotationsList = newDefinitionAnnotationsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST, oldDefinitionAnnotationsList, newDefinitionAnnotationsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionAnnotationsList(AnnotationsList newDefinitionAnnotationsList) {
		if (newDefinitionAnnotationsList != definitionAnnotationsList) {
			NotificationChain msgs = null;
			if (definitionAnnotationsList != null)
				msgs = ((InternalEObject)definitionAnnotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST, null, msgs);
			if (newDefinitionAnnotationsList != null)
				msgs = ((InternalEObject)newDefinitionAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST, null, msgs);
			msgs = basicSetDefinitionAnnotationsList(newDefinitionAnnotationsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST, newDefinitionAnnotationsList, newDefinitionAnnotationsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureDefinition> getArchitecturedefinition() {
		if (architecturedefinition == null) {
			architecturedefinition = new EObjectContainmentWithInverseEList<ArchitectureDefinition>(ArchitectureDefinition.class, this, AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION, AdlPackage.ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION);
		}
		return architecturedefinition;
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
			case AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArchitecturedefinition()).basicAdd(otherEnd, msgs);
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
			case AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST:
				return basicSetDefinitionAnnotationsList(null, msgs);
			case AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION:
				return ((InternalEList<?>)getArchitecturedefinition()).basicRemove(otherEnd, msgs);
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
			case AdlPackage.ADL_DEFINITION__IMPORTS:
				return getImports();
			case AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST:
				return getDefinitionAnnotationsList();
			case AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION:
				return getArchitecturedefinition();
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
			case AdlPackage.ADL_DEFINITION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDefinition>)newValue);
				return;
			case AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST:
				setDefinitionAnnotationsList((AnnotationsList)newValue);
				return;
			case AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION:
				getArchitecturedefinition().clear();
				getArchitecturedefinition().addAll((Collection<? extends ArchitectureDefinition>)newValue);
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
			case AdlPackage.ADL_DEFINITION__IMPORTS:
				getImports().clear();
				return;
			case AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST:
				setDefinitionAnnotationsList((AnnotationsList)null);
				return;
			case AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION:
				getArchitecturedefinition().clear();
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
			case AdlPackage.ADL_DEFINITION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case AdlPackage.ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST:
				return definitionAnnotationsList != null;
			case AdlPackage.ADL_DEFINITION__ARCHITECTUREDEFINITION:
				return architecturedefinition != null && !architecturedefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdlDefinitionImpl
