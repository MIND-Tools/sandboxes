/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide.impl;

import java.util.Collection;

import org.eclipse.core.internal.runtime.AdapterManager;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl#getMindId <em>Mind Id</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl#getResolvedMindPathEntries <em>Resolved Mind Path Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindObjectImpl extends EObjectImpl implements MindObject {
	/**
	 * The default value of the '{@link #getMindId() <em>Mind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindId()
	 * @generated
	 * @ordered
	 */
	protected static final String MIND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMindId() <em>Mind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindId()
	 * @generated
	 * @ordered
	 */
	protected String mindId = MIND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getResolvedMindPathEntries() <em>Resolved Mind Path Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedMindPathEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MindPathEntry> resolvedMindPathEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMindId() {
		return mindId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMindId(String newMindId) {
		String oldMindId = mindId;
		mindId = newMindId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_OBJECT__MIND_ID, oldMindId, mindId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPathEntry> getResolvedMindPathEntries() {
		if (resolvedMindPathEntries == null) {
			resolvedMindPathEntries = new EObjectWithInverseResolvingEList<MindPathEntry>(MindPathEntry.class, this, MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES, MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY);
		}
		return resolvedMindPathEntries;
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
			case MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedMindPathEntries()).basicAdd(otherEnd, msgs);
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
			case MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES:
				return ((InternalEList<?>)getResolvedMindPathEntries()).basicRemove(otherEnd, msgs);
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
			case MindidePackage.MIND_OBJECT__MIND_ID:
				return getMindId();
			case MindidePackage.MIND_OBJECT__NAME:
				return getName();
			case MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES:
				return getResolvedMindPathEntries();
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
			case MindidePackage.MIND_OBJECT__MIND_ID:
				setMindId((String)newValue);
				return;
			case MindidePackage.MIND_OBJECT__NAME:
				setName((String)newValue);
				return;
			case MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES:
				getResolvedMindPathEntries().clear();
				getResolvedMindPathEntries().addAll((Collection<? extends MindPathEntry>)newValue);
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
			case MindidePackage.MIND_OBJECT__MIND_ID:
				setMindId(MIND_ID_EDEFAULT);
				return;
			case MindidePackage.MIND_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES:
				getResolvedMindPathEntries().clear();
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
			case MindidePackage.MIND_OBJECT__MIND_ID:
				return MIND_ID_EDEFAULT == null ? mindId != null : !MIND_ID_EDEFAULT.equals(mindId);
			case MindidePackage.MIND_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES:
				return resolvedMindPathEntries != null && !resolvedMindPathEntries.isEmpty();
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
		result.append(" (mindId: ");
		result.append(mindId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object getAdapter(Class adapter) {
		return AdapterManager.getDefault().getAdapter(this, adapter);
	}

} //MindObjectImpl
