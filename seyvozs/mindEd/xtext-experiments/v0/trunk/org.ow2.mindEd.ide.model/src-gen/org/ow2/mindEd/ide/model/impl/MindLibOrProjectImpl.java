/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindRepo;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Lib Or Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindLibOrProjectImpl#getMindpathentries <em>Mindpathentries</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindLibOrProjectImpl#getRepoFromLibOrProject <em>Repo From Lib Or Project</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindLibOrProjectImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindLibOrProjectImpl#getRootsrcs <em>Rootsrcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MindLibOrProjectImpl extends MindObjectImpl implements MindLibOrProject {
	/**
	 * The cached value of the '{@link #getMindpathentries() <em>Mindpathentries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindpathentries()
	 * @generated
	 * @ordered
	 */
	protected EList<MindPathEntry> mindpathentries;

	/**
	 * The cached value of the '{@link #getRootsrcs() <em>Rootsrcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootsrcs()
	 * @generated
	 * @ordered
	 */
	protected EList<MindRootSrc> rootsrcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindLibOrProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_LIB_OR_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPathEntry> getMindpathentries() {
		if (mindpathentries == null) {
			mindpathentries = new EObjectContainmentWithInverseEList<MindPathEntry>(MindPathEntry.class, this, MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES, MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT);
		}
		return mindpathentries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindRepo getRepoFromLibOrProject() {
		if (eContainerFeatureID() != MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT) return null;
		return (MindRepo)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepoFromLibOrProject(MindRepo newRepoFromLibOrProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepoFromLibOrProject, MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepoFromLibOrProject(MindRepo newRepoFromLibOrProject) {
		if (newRepoFromLibOrProject != eInternalContainer() || (eContainerFeatureID() != MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT && newRepoFromLibOrProject != null)) {
			if (EcoreUtil.isAncestor(this, newRepoFromLibOrProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepoFromLibOrProject != null)
				msgs = ((InternalEObject)newRepoFromLibOrProject).eInverseAdd(this, MindidePackage.MIND_REPO__MIND_LIB_OR_PROJECTS, MindRepo.class, msgs);
			msgs = basicSetRepoFromLibOrProject(newRepoFromLibOrProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT, newRepoFromLibOrProject, newRepoFromLibOrProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindLibOrProject> getUses() {
		// TODO: implement this method to return the 'Uses' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindRootSrc> getRootsrcs() {
		if (rootsrcs == null) {
			rootsrcs = new EObjectWithInverseResolvingEList<MindRootSrc>(MindRootSrc.class, this, MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS, MindidePackage.MIND_ROOT_SRC__PROJECT);
		}
		return rootsrcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPathEntry> getRawMinpath() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPathEntry> getResolvedMindpath(boolean ignoreUnresolvedEntry) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindAdl resolveAdl(String componentName, String defaultPackage, EList<String> imports) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindAdl> resolvePossibleAdlInMindPath(String componentName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindAdl> resolvePossibleAdlInPackage(String packageName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindAdl> resolvePossibleAdlInWorkspace(String componentName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindItf resolveItf(String componentName, String defaultPackage, EList<String> imports) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindItf> resolvePossibleItfInMindPath(String componentName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindItf> resolvePossibleItfInPackage(String packageName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindItf> resolvePossibleItfInWorkspace(String componentName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindAdl findQualifiedComponent(String cn) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindFile> getAllFiles() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindFile findMindFile(String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exists(MindFile obj) {
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
			case MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMindpathentries()).basicAdd(otherEnd, msgs);
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepoFromLibOrProject((MindRepo)otherEnd, msgs);
			case MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRootsrcs()).basicAdd(otherEnd, msgs);
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
			case MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES:
				return ((InternalEList<?>)getMindpathentries()).basicRemove(otherEnd, msgs);
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				return basicSetRepoFromLibOrProject(null, msgs);
			case MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS:
				return ((InternalEList<?>)getRootsrcs()).basicRemove(otherEnd, msgs);
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
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				return eInternalContainer().eInverseRemove(this, MindidePackage.MIND_REPO__MIND_LIB_OR_PROJECTS, MindRepo.class, msgs);
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
			case MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES:
				return getMindpathentries();
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				return getRepoFromLibOrProject();
			case MindidePackage.MIND_LIB_OR_PROJECT__USES:
				return getUses();
			case MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS:
				return getRootsrcs();
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
			case MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES:
				getMindpathentries().clear();
				getMindpathentries().addAll((Collection<? extends MindPathEntry>)newValue);
				return;
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				setRepoFromLibOrProject((MindRepo)newValue);
				return;
			case MindidePackage.MIND_LIB_OR_PROJECT__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends MindLibOrProject>)newValue);
				return;
			case MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS:
				getRootsrcs().clear();
				getRootsrcs().addAll((Collection<? extends MindRootSrc>)newValue);
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
			case MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES:
				getMindpathentries().clear();
				return;
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				setRepoFromLibOrProject((MindRepo)null);
				return;
			case MindidePackage.MIND_LIB_OR_PROJECT__USES:
				getUses().clear();
				return;
			case MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS:
				getRootsrcs().clear();
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
			case MindidePackage.MIND_LIB_OR_PROJECT__MINDPATHENTRIES:
				return mindpathentries != null && !mindpathentries.isEmpty();
			case MindidePackage.MIND_LIB_OR_PROJECT__REPO_FROM_LIB_OR_PROJECT:
				return getRepoFromLibOrProject() != null;
			case MindidePackage.MIND_LIB_OR_PROJECT__USES:
				return !getUses().isEmpty();
			case MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS:
				return rootsrcs != null && !rootsrcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MindLibOrProjectImpl
