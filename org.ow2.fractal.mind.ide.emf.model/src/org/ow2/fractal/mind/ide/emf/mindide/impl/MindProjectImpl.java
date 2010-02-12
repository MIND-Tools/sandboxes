/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide.impl;

import java.util.Collection;

import org.eclipse.core.resources.IProject;

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

import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindItf;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl#getRootsrcs <em>Rootsrcs</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl#getRepo <em>Repo</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl#getMindpathentries <em>Mindpathentries</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl#getAllsrc <em>Allsrc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindProjectImpl extends MindObjectImpl implements MindProject {
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
	 * The cached value of the '{@link #getMindpathentries() <em>Mindpathentries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindpathentries()
	 * @generated
	 * @ordered
	 */
	protected EList<MindPathEntry> mindpathentries;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected IProject project = PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindRootSrc> getRootsrcs() {
		if (rootsrcs == null) {
			rootsrcs = new EObjectWithInverseResolvingEList<MindRootSrc>(MindRootSrc.class, this, MindidePackage.MIND_PROJECT__ROOTSRCS, MindidePackage.MIND_ROOT_SRC__PROJECT);
		}
		return rootsrcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindRepo getRepo() {
		if (eContainerFeatureID() != MindidePackage.MIND_PROJECT__REPO) return null;
		return (MindRepo)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepo(MindRepo newRepo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepo, MindidePackage.MIND_PROJECT__REPO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepo(MindRepo newRepo) {
		if (newRepo != eInternalContainer() || (eContainerFeatureID() != MindidePackage.MIND_PROJECT__REPO && newRepo != null)) {
			if (EcoreUtil.isAncestor(this, newRepo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepo != null)
				msgs = ((InternalEObject)newRepo).eInverseAdd(this, MindidePackage.MIND_REPO__MINDPROJECTS, MindRepo.class, msgs);
			msgs = basicSetRepo(newRepo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PROJECT__REPO, newRepo, newRepo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindProject> getUses() {
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
	public EList<MindPathEntry> getMindpathentries() {
		if (mindpathentries == null) {
			mindpathentries = new EObjectContainmentWithInverseEList<MindPathEntry>(MindPathEntry.class, this, MindidePackage.MIND_PROJECT__MINDPATHENTRIES, MindidePackage.MIND_PATH_ENTRY__OWNER_PROJECT);
		}
		return mindpathentries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(IProject newProject) {
		IProject oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_PROJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindRootSrc> getAllsrc() {
		// TODO: implement this method to return the 'Allsrc' reference list
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
	public void setMindpath(EList<MindPathEntry> mindpath) {
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
	public MindItf resolveIdl(String componentName, String defaultPackage, EList<String> imports) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindItf> resolvePossibleIdlInMindPath(String componentName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindItf> resolvePossibleIdlInPackage(String packageName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindItf> resolvePossibleIdlInWorkspace(String componentName) {
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
	public MindPathEntry addMindPathProjectReferenceFromFile(MindFile file) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindPathEntry addMindPathImportPackageFromFile(MindFile file) {
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
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRootsrcs()).basicAdd(otherEnd, msgs);
			case MindidePackage.MIND_PROJECT__REPO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepo((MindRepo)otherEnd, msgs);
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMindpathentries()).basicAdd(otherEnd, msgs);
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
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				return ((InternalEList<?>)getRootsrcs()).basicRemove(otherEnd, msgs);
			case MindidePackage.MIND_PROJECT__REPO:
				return basicSetRepo(null, msgs);
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				return ((InternalEList<?>)getMindpathentries()).basicRemove(otherEnd, msgs);
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
			case MindidePackage.MIND_PROJECT__REPO:
				return eInternalContainer().eInverseRemove(this, MindidePackage.MIND_REPO__MINDPROJECTS, MindRepo.class, msgs);
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
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				return getRootsrcs();
			case MindidePackage.MIND_PROJECT__REPO:
				return getRepo();
			case MindidePackage.MIND_PROJECT__USES:
				return getUses();
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				return getMindpathentries();
			case MindidePackage.MIND_PROJECT__PROJECT:
				return getProject();
			case MindidePackage.MIND_PROJECT__ALLSRC:
				return getAllsrc();
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
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				getRootsrcs().clear();
				getRootsrcs().addAll((Collection<? extends MindRootSrc>)newValue);
				return;
			case MindidePackage.MIND_PROJECT__REPO:
				setRepo((MindRepo)newValue);
				return;
			case MindidePackage.MIND_PROJECT__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends MindProject>)newValue);
				return;
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				getMindpathentries().clear();
				getMindpathentries().addAll((Collection<? extends MindPathEntry>)newValue);
				return;
			case MindidePackage.MIND_PROJECT__PROJECT:
				setProject((IProject)newValue);
				return;
			case MindidePackage.MIND_PROJECT__ALLSRC:
				getAllsrc().clear();
				getAllsrc().addAll((Collection<? extends MindRootSrc>)newValue);
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
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				getRootsrcs().clear();
				return;
			case MindidePackage.MIND_PROJECT__REPO:
				setRepo((MindRepo)null);
				return;
			case MindidePackage.MIND_PROJECT__USES:
				getUses().clear();
				return;
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				getMindpathentries().clear();
				return;
			case MindidePackage.MIND_PROJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case MindidePackage.MIND_PROJECT__ALLSRC:
				getAllsrc().clear();
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
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				return rootsrcs != null && !rootsrcs.isEmpty();
			case MindidePackage.MIND_PROJECT__REPO:
				return getRepo() != null;
			case MindidePackage.MIND_PROJECT__USES:
				return !getUses().isEmpty();
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				return mindpathentries != null && !mindpathentries.isEmpty();
			case MindidePackage.MIND_PROJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case MindidePackage.MIND_PROJECT__ALLSRC:
				return !getAllsrc().isEmpty();
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
		result.append(" (project: ");
		result.append(project);
		result.append(')');
		return result.toString();
	}

} //MindProjectImpl
