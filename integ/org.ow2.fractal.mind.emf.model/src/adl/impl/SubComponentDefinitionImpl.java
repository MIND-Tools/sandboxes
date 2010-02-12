/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.SubComponentDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SubComponentDefinitionImpl extends CompositeDefinitionElementImpl implements SubComponentDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.SUB_COMPONENT_DEFINITION;
	}

} //SubComponentDefinitionImpl
