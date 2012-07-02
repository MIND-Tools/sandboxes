/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.impl;

import java.net.URI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRepo;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Root Src</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindRootSrcImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindRootSrcImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindRootSrcImpl#getRepoFromRootSrc <em>Repo From Root Src</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindRootSrcImpl#getFullpath <em>Fullpath</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindRootSrcImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindRootSrcImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindRootSrcImpl extends MindObjectImpl implements MindRootSrc {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MindPackage> packages;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected MindLibOrProject project;

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
	 * The default value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected static final URI FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected URI folder = FOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<MindRootSrc> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindRootSrcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_ROOT_SRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<MindPackage>(MindPackage.class, this, MindidePackage.MIND_ROOT_SRC__PACKAGES, MindidePackage.MIND_PACKAGE__ROOTSRC);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindLibOrProject getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (MindLibOrProject)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MindidePackage.MIND_ROOT_SRC__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindLibOrProject basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(MindLibOrProject newProject, NotificationChain msgs) {
		MindLibOrProject oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_ROOT_SRC__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(MindLibOrProject newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS, MindLibOrProject.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS, MindLibOrProject.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_ROOT_SRC__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindRepo getRepoFromRootSrc() {
		if (eContainerFeatureID() != MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC) return null;
		return (MindRepo)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepoFromRootSrc(MindRepo newRepoFromRootSrc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepoFromRootSrc, MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepoFromRootSrc(MindRepo newRepoFromRootSrc) {
		if (newRepoFromRootSrc != eInternalContainer() || (eContainerFeatureID() != MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC && newRepoFromRootSrc != null)) {
			if (EcoreUtil.isAncestor(this, newRepoFromRootSrc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepoFromRootSrc != null)
				msgs = ((InternalEObject)newRepoFromRootSrc).eInverseAdd(this, MindidePackage.MIND_REPO__ROOTSRCS, MindRepo.class, msgs);
			msgs = basicSetRepoFromRootSrc(newRepoFromRootSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC, newRepoFromRootSrc, newRepoFromRootSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_ROOT_SRC__FULLPATH, oldFullpath, fullpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getFolder() {
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(URI newFolder) {
		URI oldFolder = folder;
		folder = newFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_ROOT_SRC__FOLDER, oldFolder, folder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindRootSrc> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<MindRootSrc>(MindRootSrc.class, this, MindidePackage.MIND_ROOT_SRC__DEPENDENCIES);
		}
		return dependencies;
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
			case MindidePackage.MIND_ROOT_SRC__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
			case MindidePackage.MIND_ROOT_SRC__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, MindidePackage.MIND_LIB_OR_PROJECT__ROOTSRCS, MindLibOrProject.class, msgs);
				return basicSetProject((MindLibOrProject)otherEnd, msgs);
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepoFromRootSrc((MindRepo)otherEnd, msgs);
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
			case MindidePackage.MIND_ROOT_SRC__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case MindidePackage.MIND_ROOT_SRC__PROJECT:
				return basicSetProject(null, msgs);
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				return basicSetRepoFromRootSrc(null, msgs);
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
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				return eInternalContainer().eInverseRemove(this, MindidePackage.MIND_REPO__ROOTSRCS, MindRepo.class, msgs);
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
			case MindidePackage.MIND_ROOT_SRC__PACKAGES:
				return getPackages();
			case MindidePackage.MIND_ROOT_SRC__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				return getRepoFromRootSrc();
			case MindidePackage.MIND_ROOT_SRC__FULLPATH:
				return getFullpath();
			case MindidePackage.MIND_ROOT_SRC__FOLDER:
				return getFolder();
			case MindidePackage.MIND_ROOT_SRC__DEPENDENCIES:
				return getDependencies();
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
			case MindidePackage.MIND_ROOT_SRC__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends MindPackage>)newValue);
				return;
			case MindidePackage.MIND_ROOT_SRC__PROJECT:
				setProject((MindLibOrProject)newValue);
				return;
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				setRepoFromRootSrc((MindRepo)newValue);
				return;
			case MindidePackage.MIND_ROOT_SRC__FULLPATH:
				setFullpath((String)newValue);
				return;
			case MindidePackage.MIND_ROOT_SRC__FOLDER:
				setFolder((URI)newValue);
				return;
			case MindidePackage.MIND_ROOT_SRC__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends MindRootSrc>)newValue);
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
			case MindidePackage.MIND_ROOT_SRC__PACKAGES:
				getPackages().clear();
				return;
			case MindidePackage.MIND_ROOT_SRC__PROJECT:
				setProject((MindLibOrProject)null);
				return;
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				setRepoFromRootSrc((MindRepo)null);
				return;
			case MindidePackage.MIND_ROOT_SRC__FULLPATH:
				setFullpath(FULLPATH_EDEFAULT);
				return;
			case MindidePackage.MIND_ROOT_SRC__FOLDER:
				setFolder(FOLDER_EDEFAULT);
				return;
			case MindidePackage.MIND_ROOT_SRC__DEPENDENCIES:
				getDependencies().clear();
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
			case MindidePackage.MIND_ROOT_SRC__PACKAGES:
				return packages != null && !packages.isEmpty();
			case MindidePackage.MIND_ROOT_SRC__PROJECT:
				return project != null;
			case MindidePackage.MIND_ROOT_SRC__REPO_FROM_ROOT_SRC:
				return getRepoFromRootSrc() != null;
			case MindidePackage.MIND_ROOT_SRC__FULLPATH:
				return FULLPATH_EDEFAULT == null ? fullpath != null : !FULLPATH_EDEFAULT.equals(fullpath);
			case MindidePackage.MIND_ROOT_SRC__FOLDER:
				return FOLDER_EDEFAULT == null ? folder != null : !FOLDER_EDEFAULT.equals(folder);
			case MindidePackage.MIND_ROOT_SRC__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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
		result.append(", folder: ");
		result.append(folder);
		result.append(')');
		return result.toString();
	}

} //MindRootSrcImpl
