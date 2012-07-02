/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.impl;

import org.eclipse.core.resources.IResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Path Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindPathEntryImpl#getOwnerProject <em>Owner Project</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindPathEntryImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindPathEntryImpl#getEntryKind <em>Entry Kind</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindPathEntryImpl#getTargetFilter <em>Target Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindPathEntryImpl extends MindObjectImpl implements MindPathEntry {
	/**
	 * The cached value of the '{@link #getResolvedBy() <em>Resolved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedBy()
	 * @generated
	 * @ordered
	 */
	protected MindObject resolvedBy;

	/**
	 * The default value of the '{@link #getEntryKind() <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryKind()
	 * @generated
	 * @ordered
	 */
	protected static final MindPathKind ENTRY_KIND_EDEFAULT = MindPathKind.LIBRARY;

	/**
	 * The cached value of the '{@link #getEntryKind() <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryKind()
	 * @generated
	 * @ordered
	 */
	protected MindPathKind entryKind = ENTRY_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFilter() <em>Target Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFilter() <em>Target Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFilter()
	 * @generated
	 * @ordered
	 */
	protected String targetFilter = TARGET_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindPathEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_PATH_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public MindLibOrProject getOwnerProject() {
		if (eContainerFeatureID() != MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT) return null;
		return (MindLibOrProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerProject(MindLibOrProject newOwnerProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerProject, MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerProject(MindLibOrProject newOwnerProject) {
		if (newOwnerProject != eInternalContainer() || (eContainerFeatureID() != MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT && newOwnerProject != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerProject != null)
				msgs = ((InternalEObject)newOwnerProject).eInverseAdd(this, MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES, MindLibOrProject.class, msgs);
			msgs = basicSetOwnerProject(newOwnerProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT, newOwnerProject, newOwnerProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindObject getResolvedBy() {
		if (resolvedBy != null && resolvedBy.eIsProxy()) {
			InternalEObject oldResolvedBy = (InternalEObject)resolvedBy;
			resolvedBy = (MindObject)eResolveProxy(oldResolvedBy);
			if (resolvedBy != oldResolvedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY, oldResolvedBy, resolvedBy));
			}
		}
		return resolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindObject basicGetResolvedBy() {
		return resolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolvedBy(MindObject newResolvedBy, NotificationChain msgs) {
		MindObject oldResolvedBy = resolvedBy;
		resolvedBy = newResolvedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY, oldResolvedBy, newResolvedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedBy(MindObject newResolvedBy) {
		if (newResolvedBy != resolvedBy) {
			NotificationChain msgs = null;
			if (resolvedBy != null)
				msgs = ((InternalEObject)resolvedBy).eInverseRemove(this, MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES, MindObject.class, msgs);
			if (newResolvedBy != null)
				msgs = ((InternalEObject)newResolvedBy).eInverseAdd(this, MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES, MindObject.class, msgs);
			msgs = basicSetResolvedBy(newResolvedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY, newResolvedBy, newResolvedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindPathKind getEntryKind() {
		return entryKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryKind(MindPathKind newEntryKind) {
		MindPathKind oldEntryKind = entryKind;
		entryKind = newEntryKind == null ? ENTRY_KIND_EDEFAULT : newEntryKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PATH_ENTRY__ENTRY_KIND, oldEntryKind, entryKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFilter() {
		return targetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFilter(String newTargetFilter) {
		String oldTargetFilter = targetFilter;
		targetFilter = newTargetFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PATH_ENTRY__TARGET_FILTER, oldTargetFilter, targetFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource getResource() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerProject((MindLibOrProject)otherEnd, msgs);
			case MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY:
				if (resolvedBy != null)
					msgs = ((InternalEObject)resolvedBy).eInverseRemove(this, MindidePackage.MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES, MindObject.class, msgs);
				return basicSetResolvedBy((MindObject)otherEnd, msgs);
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				return basicSetOwnerProject(null, msgs);
			case MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY:
				return basicSetResolvedBy(null, msgs);
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				return eInternalContainer().eInverseRemove(this, MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES, MindLibOrProject.class, msgs);
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				return getOwnerProject();
			case MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY:
				if (resolve) return getResolvedBy();
				return basicGetResolvedBy();
			case MindidePackage.MIND_PATH_ENTRY__ENTRY_KIND:
				return getEntryKind();
			case MindidePackage.MIND_PATH_ENTRY__TARGET_FILTER:
				return getTargetFilter();
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				setOwnerProject((MindLibOrProject)newValue);
				return;
			case MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY:
				setResolvedBy((MindObject)newValue);
				return;
			case MindidePackage.MIND_PATH_ENTRY__ENTRY_KIND:
				setEntryKind((MindPathKind)newValue);
				return;
			case MindidePackage.MIND_PATH_ENTRY__TARGET_FILTER:
				setTargetFilter((String)newValue);
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				setOwnerProject((MindLibOrProject)null);
				return;
			case MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY:
				setResolvedBy((MindObject)null);
				return;
			case MindidePackage.MIND_PATH_ENTRY__ENTRY_KIND:
				setEntryKind(ENTRY_KIND_EDEFAULT);
				return;
			case MindidePackage.MIND_PATH_ENTRY__TARGET_FILTER:
				setTargetFilter(TARGET_FILTER_EDEFAULT);
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
			case MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT:
				return getOwnerProject() != null;
			case MindidePackage.MIND_PATH_ENTRY__RESOLVED_BY:
				return resolvedBy != null;
			case MindidePackage.MIND_PATH_ENTRY__ENTRY_KIND:
				return entryKind != ENTRY_KIND_EDEFAULT;
			case MindidePackage.MIND_PATH_ENTRY__TARGET_FILTER:
				return TARGET_FILTER_EDEFAULT == null ? targetFilter != null : !TARGET_FILTER_EDEFAULT.equals(targetFilter);
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
		result.append(" (entryKind: ");
		result.append(entryKind);
		result.append(", targetFilter: ");
		result.append(targetFilter);
		result.append(')');
		return result.toString();
	}

} //MindPathEntryImpl
