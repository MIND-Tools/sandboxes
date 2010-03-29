/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Repo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindRepoImpl#getRootsrcs <em>Rootsrcs</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindRepoImpl#getMindprojects <em>Mindprojects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindRepoImpl extends MindObjectImpl implements MindRepo {
	/**
	 * The cached value of the '{@link #getRootsrcs() <em>Rootsrcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootsrcs()
	 * @generated
	 * @ordered
	 */
	protected EList<MindRootSrc> rootsrcs;
	/**
	 * The cached value of the '{@link #getMindprojects() <em>Mindprojects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindprojects()
	 * @generated
	 * @ordered
	 */
	protected EList<MindProject> mindprojects;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindRepoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_REPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindRootSrc> getRootsrcs() {
		if (rootsrcs == null) {
			rootsrcs = new EObjectContainmentWithInverseEList<MindRootSrc>(MindRootSrc.class, this, MindidePackage.MIND_REPO__ROOTSRCS, MindidePackage.MIND_ROOT_SRC__REPO);
		}
		return rootsrcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindProject> getMindprojects() {
		if (mindprojects == null) {
			mindprojects = new EObjectContainmentWithInverseEList<MindProject>(MindProject.class, this, MindidePackage.MIND_REPO__MINDPROJECTS, MindidePackage.MIND_PROJECT__REPO);
		}
		return mindprojects;
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
			case MindidePackage.MIND_REPO__ROOTSRCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRootsrcs()).basicAdd(otherEnd, msgs);
			case MindidePackage.MIND_REPO__MINDPROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMindprojects()).basicAdd(otherEnd, msgs);
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
			case MindidePackage.MIND_REPO__ROOTSRCS:
				return ((InternalEList<?>)getRootsrcs()).basicRemove(otherEnd, msgs);
			case MindidePackage.MIND_REPO__MINDPROJECTS:
				return ((InternalEList<?>)getMindprojects()).basicRemove(otherEnd, msgs);
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
			case MindidePackage.MIND_REPO__ROOTSRCS:
				return getRootsrcs();
			case MindidePackage.MIND_REPO__MINDPROJECTS:
				return getMindprojects();
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
			case MindidePackage.MIND_REPO__ROOTSRCS:
				getRootsrcs().clear();
				getRootsrcs().addAll((Collection<? extends MindRootSrc>)newValue);
				return;
			case MindidePackage.MIND_REPO__MINDPROJECTS:
				getMindprojects().clear();
				getMindprojects().addAll((Collection<? extends MindProject>)newValue);
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
			case MindidePackage.MIND_REPO__ROOTSRCS:
				getRootsrcs().clear();
				return;
			case MindidePackage.MIND_REPO__MINDPROJECTS:
				getMindprojects().clear();
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
			case MindidePackage.MIND_REPO__ROOTSRCS:
				return rootsrcs != null && !rootsrcs.isEmpty();
			case MindidePackage.MIND_REPO__MINDPROJECTS:
				return mindprojects != null && !mindprojects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MindRepoImpl
