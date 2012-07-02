package org.ow2.mindEd.ide.core.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.impl.MindLibraryImpl.LibMindPathEntryCustomImpl;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindidePackage;

public class MindLibraryImpl extends org.ow2.mindEd.ide.model.impl.MindLibraryImpl  {
	private MindModelImpl _model;
	private IContainer _eclipsecontainer;
	private LibMindPathEntryCustomImpl mindpath;
	
	public MindLibraryImpl(IContainer project, MindModelImpl model) {
		_eclipsecontainer = project;
		_model = model;
		name = _eclipsecontainer.getName();
		mindpath = new LibMindPathEntryCustomImpl(this);
	}
	
	
	
	@Override
	public EList<MindRootSrc> getRootsrcs() {
		return new BasicEList.UnmodifiableEList<MindRootSrc>(1, new Object[]{this});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPathEntry> getRawMinpath() {
		return new BasicEList.UnmodifiableEList<MindPathEntry>(1, new Object[]{mindpath});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindPathEntry> getResolvedMindpath(boolean ignoreUnresolvedEntry) {
		return getRawMinpath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public MindAdl resolveAdl(String componentName, String defaultPackage, EList<String> imports) {
		return (MindAdl) ResolveImpl.resolve(this, MindidePackage.Literals.MIND_ADL, componentName, defaultPackage, imports);
	}

	/**
	 * Return the first mindfile find in the packages. The resource exists at this moment.
	 * Return null if no mindfile found.
	 */
	@Override
	public MindFile findMindFile(String qualifiedName) {
		return ResolveImpl.findMindFile(this, qualifiedName);
	}

	
	
	@Override
	public MindItf resolveItf(String componentName, String defaultPackage,
			EList<String> imports) {
		return (MindItf) ResolveImpl.resolve(this, MindidePackage.Literals.MIND_ITF, componentName, defaultPackage, imports);
	}
	
	@Override
	public EList<MindAdl> resolvePossibleAdlInMindPath(String componentName) {
		return ResolveImpl.resolve(this, MindidePackage.Literals.MIND_ADL, componentName);
	}
	
	@Override
	public EList<MindItf> resolvePossibleItfInMindPath(String componentName) {
		return ResolveImpl.resolve(this, MindidePackage.Literals.MIND_ITF, componentName);
	}
	
	@Override
	public EList<MindAdl> resolvePossibleAdlInPackage(String packageName) {
		return ResolveImpl.resolveP(this, MindidePackage.Literals.MIND_ADL, packageName);
	}
	
	@Override
	public EList<MindItf> resolvePossibleItfInPackage(String packageName) {
		return ResolveImpl.resolveP(this, MindidePackage.Literals.MIND_ITF, packageName);
	}
	
	@Override
	public EList<MindAdl> resolvePossibleAdlInWorkspace(String componentName) {
		return ResolveImpl.resolveInWorkspace(MindidePackage.Literals.MIND_ADL, componentName);
	}
	
	@Override
	public EList<MindItf> resolvePossibleItfInWorkspace(String componentName) {
		return ResolveImpl.resolveInWorkspace(MindidePackage.Literals.MIND_ITF, componentName);
	}
	
	
	@Override
	public MindAdl findQualifiedComponent(String cn) {
		return resolveAdl(cn, "", new BasicEList<String>());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MindFile> getAllFiles() {
		return ResolveImpl.getAllFiles(this);
	}

	

	@Override
	public boolean exists(MindFile obj) {
		IResource r = MindIdeCore.getResource(obj);
		return r.exists();
	}

static class  LibMindPathEntryCustomImpl extends MindPathEntryCustomImpl {	

	public LibMindPathEntryCustomImpl(MindLibraryImpl lib) {
		resolvedBy = lib;
		name = ".";
		
	}


	@Override
	public void setOwnerProject(MindLibOrProject value) {
	}


	@Override
	public void setResolvedBy(MindObject value) {
	}



	@Override
	public MindPathKind getEntryKind() {
		return MindPathKind.SOURCE;
	}



	@Override
	public void setEntryKind(MindPathKind value) {
	}



	@Override
	public IResource getResource() {
		return MindIdeCore.getResource(getResolvedBy());
	}
}
}
