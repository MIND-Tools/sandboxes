/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide.impl;

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
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl#getRootsrc <em>Rootsrc</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl#getFullpath <em>Fullpath</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindPackageImpl extends MindObjectImpl implements MindPackage {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<MindFile> files;

	/**
	 * The default value of the '{@link #getFullpath() <em>Fullpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullpath()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLPATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFullpath() <em>Fullpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullpath()
	 * @generated
	 * @ordered
	 */
	protected String fullpath = FULLPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentWithInverseEList<MindFile>(MindFile.class, this, MindidePackage.MIND_PACKAGE__FILES, MindidePackage.MIND_FILE__PACKAGE);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindRootSrc getRootsrc() {
		if (eContainerFeatureID() != MindidePackage.MIND_PACKAGE__ROOTSRC) return null;
		return (MindRootSrc)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootsrc(MindRootSrc newRootsrc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRootsrc, MindidePackage.MIND_PACKAGE__ROOTSRC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootsrc(MindRootSrc newRootsrc) {
		if (newRootsrc != eInternalContainer() || (eContainerFeatureID() != MindidePackage.MIND_PACKAGE__ROOTSRC && newRootsrc != null)) {
			if (EcoreUtil.isAncestor(this, newRootsrc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRootsrc != null)
				msgs = ((InternalEObject)newRootsrc).eInverseAdd(this, MindidePackage.MIND_ROOT_SRC__PACKAGES, MindRootSrc.class, msgs);
			msgs = basicSetRootsrc(newRootsrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PACKAGE__ROOTSRC, newRootsrc, newRootsrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullpath() {
		return fullpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullpath(String newFullpath) {
		String oldFullpath = fullpath;
		fullpath = newFullpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PACKAGE__FULLPATH, oldFullpath, fullpath));
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
			case MindidePackage.MIND_PACKAGE__FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiles()).basicAdd(otherEnd, msgs);
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRootsrc((MindRootSrc)otherEnd, msgs);
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
			case MindidePackage.MIND_PACKAGE__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				return basicSetRootsrc(null, msgs);
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
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				return eInternalContainer().eInverseRemove(this, MindidePackage.MIND_ROOT_SRC__PACKAGES, MindRootSrc.class, msgs);
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
			case MindidePackage.MIND_PACKAGE__FILES:
				return getFiles();
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				return getRootsrc();
			case MindidePackage.MIND_PACKAGE__FULLPATH:
				return getFullpath();
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
			case MindidePackage.MIND_PACKAGE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends MindFile>)newValue);
				return;
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				setRootsrc((MindRootSrc)newValue);
				return;
			case MindidePackage.MIND_PACKAGE__FULLPATH:
				setFullpath((String)newValue);
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
			case MindidePackage.MIND_PACKAGE__FILES:
				getFiles().clear();
				return;
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				setRootsrc((MindRootSrc)null);
				return;
			case MindidePackage.MIND_PACKAGE__FULLPATH:
				setFullpath(FULLPATH_EDEFAULT);
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
			case MindidePackage.MIND_PACKAGE__FILES:
				return files != null && !files.isEmpty();
			case MindidePackage.MIND_PACKAGE__ROOTSRC:
				return getRootsrc() != null;
			case MindidePackage.MIND_PACKAGE__FULLPATH:
				return FULLPATH_EDEFAULT == null ? fullpath != null : !FULLPATH_EDEFAULT.equals(fullpath);
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
		result.append(" (fullpath: ");
		result.append(fullpath);
		result.append(')');
		return result.toString();
	}

} //MindPackageImpl
