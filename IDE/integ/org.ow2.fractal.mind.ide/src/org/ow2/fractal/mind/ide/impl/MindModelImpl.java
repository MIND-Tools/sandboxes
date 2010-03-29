package org.ow2.fractal.mind.ide.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.IDeclaration;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.ow2.fractal.mind.ide.MindActivator;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.MindNature;
import org.ow2.fractal.mind.ide.RepoTypeAdapter;
import org.ow2.fractal.mind.ide.UtilMindIde;
import org.ow2.fratal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fratal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindFile;
import org.ow2.fratal.mind.ide.emf.mindide.MindObject;
import org.ow2.fratal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fratal.mind.ide.emf.mindide.MindideFactory;
import org.ow2.fratal.mind.ide.emf.mindide.MindidePackage;

public class MindModelImpl implements MindModel {
	private final class MindPathListener extends EContentAdapter {

		public MindPathListener() {
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification); // not remove
			Object obj = notification.getNotifier();
			if (!(obj instanceof MindObject)) {
				return;
			}
			Object f = notification.getFeature();
			if (f == MindidePackage.Literals.MIND_PACKAGE__FILES) {
				notifyChangedMindPackage_Files(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_PATH_ENTRY__RESOLVED_BY) {
				notifyChangedMindPathEntry_ResolvedBy(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_PROJECT__ALLSRC) {
				notifyChangedMindProject_Allsrc(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_PROJECT__MINDPATHENTRIES) {
				notifyChangedMindProject_Mindpathentries(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_PROJECT__ROOTSRCS) {
				notifyChangedMindRepo_Rootsrcs(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_REPO__MINDPROJECTS) {
				notifyChangedMindRepo_MindProjects(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_REPO__ROOTSRCS) {
				notifyChangedMindRepo_Rootsrcs(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_ROOT_SRC__DEPENDENCIES) {
				notifyChangedMindRootSrc_Dependencies(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_ROOT_SRC__PACKAGES) {
				notifyChangedMindRootSrc_Packages(notification);
				return;
			}
		}

	}

	static RepoTypeAdapter[] _repoType = { new WSRepoTypeAdapter() };

	/* debugging flag to enable tracing */
	public static final boolean TRACING = "true".equalsIgnoreCase(Platform.getDebugOption("org.ow2.fractal.mind.ide/traceModel")); //$NON-NLS-1$ //$NON-NLS-2$

	public static final String WS = "ws";

	private static MindRootSrc createRootSrc(MindProject mindp, MindRepo repo,
			IFolder f, String srcRootName) {
		MindRootSrc srcRoot;
		srcRoot = MindideFactory.eINSTANCE.createMindRootSrc();
		srcRoot.setName(srcRootName);
		srcRoot.setMindId(repo.getMindId() + "/" + srcRoot.getName());
		srcRoot.setFullpath(f.getFullPath().toPortableString());
		repo.getRootsrcs().add(srcRoot);
		mindp.getRootsrcs().add(srcRoot);
		return srcRoot;
	}
	
	Map<String, List<MindPackage>> _packages;

	private Map<String, MindProject> _projects;

	MindAllRepo _repos;

	private MindIdeWorkspaceChangeListener _wsListener;

	private MindRepo _wsMindRoot;

	public MindModelImpl() {
	}

	private void addPackage(MindPackage p) {
		if (_packages == null)
			getAllPackages();
		String pn = p.getName();
		List<MindPackage> l = _packages.get(pn);
		if (l == null) {
			l = new ArrayList<MindPackage>();
			_packages.put(pn, l);
		}
		l.add(p);
	}

	public void dispose() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.removeResourceChangeListener(_wsListener);

	}

	public MindProject findEmfMindProject(MindRepo repo, IProject project) {
		MindProject ret = UtilMindIde.find(repo.getMindprojects(), project
				.getName());
		return ret;
	}

	@Override
	public MindPackage findOrCreatePackage(MindRootSrc rootSrc,
			String packageName) {
		IResource p = MindIdeCore.getResource(rootSrc).getFolder(
				new Path(packageName.replace('.', '/')));
		return UtilMindIde.findOrCreatePackage(rootSrc, packageName, p, true);
	}

	@Override
	public MindRootSrc findOrCreateRootSrc(IContainer container) {
		MindProject mp = get(container.getProject());
		if (mp == null)
			return null;
		IPath containerPath = container.getFullPath();
		for (MindRootSrc s : mp.getRootsrcs()) {
			Path p = new Path(s.getFullpath());
			if (containerPath.equals(p))
				return s;

		}
		MindRootSrc ret = findOrCreateRootSrc(mp, (IFolder) container, false);
		mp.getMindpathentries().add(
				MindIdeCore.newMPESource((IFolder) container));
		return ret;
	}

	public MindRootSrc findOrCreateRootSrc(MindProject mindp, IFolder f,
			boolean sync) {
		return findOrCreateRootSrc(mindp, mindp.getRepo(), f, sync);
	}

	public MindRootSrc findOrCreateRootSrc(MindProject mindp, MindRepo repo,
			IFolder f) {
		MindRootSrc srcRoot;
		String srcRootName = f.getFullPath().toPortableString();
		srcRoot = UtilMindIde.find(repo.getRootsrcs(), srcRootName);
		if (srcRoot == null) {
			srcRoot = createRootSrc(mindp, repo, f, srcRootName);
		} else {
			Assert.isTrue(mindp == srcRoot.getProject());
		}
		return srcRoot;
	}

	public MindRootSrc findOrCreateRootSrc(MindProject mindp, MindRepo repo,
			IFolder f, boolean sync) {
		MindRootSrc srcRoot = findOrCreateRootSrc(mindp, repo, f);
		if (sync && f.exists()) {
			try {
				HashMap<IResource, MindObject> mapResourceToMind = new HashMap<IResource, MindObject>();
				mapResourceToMind.put(f, srcRoot);
				f.accept(_wsListener);
			} catch (CoreException e) {
				MindIdeCore.log(e, "sync src folder " + f);
			}
		}
		return srcRoot;
	}

	public MindPackage findPackage(MindPathEntry mpe) {
		MindProject prj = mpe.getOwnerProject();
		Map<String, List<MindPackage>> packages = getAllPackages();
		List<MindPackage> refPackages = packages.get(mpe.getName());
		if (refPackages == null || refPackages.size() == 0)
			return null;
		for (MindPackage mindPackage : refPackages) {
			if (mindPackage.getRootsrc().getProject() == prj)
				return mindPackage;
		}

		EList<MindProject> usedPackage = getUsedPackage(prj);
		for (MindPackage mindPackage : refPackages) {
			if (usedPackage.contains(mindPackage.getRootsrc().getProject()))
				return mindPackage;
		}
		return refPackages.get(0);
	}

	public MindProject findProject(MindPathEntry mpe) {
		Path p = new Path(mpe.getName());
		String projectName = p.segment(0);
		for (MindRepo r : _repos.getRepos()) {
			for (MindProject prj : r.getMindprojects()) {
				if (prj.getName().equals(projectName))
					return prj;
			}
		}
		return null;
	}

	@Override
	public MindRootSrc findRootSrc(IContainer container) {
		MindProject mp = get(container.getProject());
		if (mp == null)
			return null;
		IPath containerPath = container.getFullPath();
		for (MindRootSrc s : mp.getRootsrcs()) {
			Path p = new Path(s.getFullpath());
			if (containerPath.equals(p))
				return s;

		}
		return null;
	}

	@Override
	public MindProject get(IProject p) {
		return getMindProject(p);
	}

	@Override
	public Collection<? extends MindAdl> getAllComponents() {
		ArrayList<MindAdl> collect = new ArrayList<MindAdl>();
		for (MindRepo r : _repos.getRepos()) {
			for (MindRootSrc s : r.getRootsrcs()) {
				for (MindPackage p : s.getPackages()) {
					for (MindFile f : p.getFiles()) {
						if (f instanceof MindAdl)
							collect.add((MindAdl) f);
					}
				}
			}
		}
		return collect;
	}

	@Override
	public Collection<? extends MindAdl> getAllComponents(
			MindProject mindProject) {
		return ResolveImpl.findComponent(mindProject,
				MindidePackage.Literals.MIND_ADL);
	}

	public Map<String, List<MindPackage>> getAllPackages() {
		if (_packages == null) {
			_packages = new HashMap<String, List<MindPackage>>();
			for (MindRepo mr : _repos.getRepos()) {
				for (MindRootSrc mRootSrc : mr.getRootsrcs()) {
					for (MindPackage p : mRootSrc.getPackages()) {
						addPackage(p);
					}
				}
			}
		}
		return _packages;
	}

	@Override
	public List<MindProject> getAllProject() {
		return new ArrayList<MindProject>(_projects.values());
	}

	public MindProject getMindProject(IProject p) {
		if (_projects == null) {
			_projects = new HashMap<String, MindProject>();
		}
		MindProject ret = _projects.get(p.getName());
		if (ret != null)
			return ret;
		ret = UtilMindIde.find(_wsMindRoot.getMindprojects(), p.getName());
		if (ret != null) {
			_projects.put(p.getName(), ret);
			return ret;
		}
		return null;
	}

	@Override
	public MindAllRepo getMindRepository() {
		return _repos;
	}

	public EList<MindPathEntry> getResolvedMindpath(
			MindProjectImpl mindProjectImpl, boolean ignoreUnresolvedEntry) {
		BasicEList<MindPathEntry> ret = new BasicEList<MindPathEntry>();

		if (ignoreUnresolvedEntry) {
			for (MindPathEntry mindPathEntry : mindProjectImpl
					.getMindpathentries()) {
				if (mindPathEntry.getResolvedBy() != null)
					ret.add(mindPathEntry);
			}
		} else
			ret.addAll(mindProjectImpl.getMindpathentries());
		return ret;
	}

	private EList<MindProject> getUsedPackage(MindProject prj) {
		EList<MindProject> ret = new BasicEList<MindProject>();
		if (prj != null)
			getUsedPackage(prj, ret);
		return ret;
	}

	private void getUsedPackage(MindProject prj, EList<MindProject> ret) {
		for (MindProject mindProject : prj.getUses()) {
			if (ret.contains(mindProject))
				continue;
			ret.add(mindProject);
			getUsedPackage(mindProject, ret);
		}
	}

	@Override
	public MindRepo getWSRepo() {
		return _wsMindRoot;
	}

	public void init() {
		MindPathListener l = new MindPathListener();

		_repos = MindideFactory.eINSTANCE.createMindAllRepo();
		_repos.eAdapters().add(l);

		_wsMindRoot = UtilMindIde.findOrCreateRepo(this, MindModelImpl.WS);
		_wsListener = new MindIdeWorkspaceChangeListener(this, _wsMindRoot,
				null);

		for (RepoTypeAdapter rt : _repoType) {
			rt.initRepo(this);
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(_wsListener);
	}

	@Override
	public MindProject init(IProject p) throws CoreException, IOException {
		return init(p, true, true);
	}

	/**
	 * Find or create a mind project And initialize
	 * 
	 * @param p
	 *            a project from
	 * @param create
	 *            tell if it must create MindProject
	 * @param sync
	 *            tell if it must synchronize project
	 * @return a MindProject corresponding to Project p or null if not found, if
	 *         not open
	 * @throws CoreException
	 * @throws IOException
	 */

	public MindProject init(IProject p, boolean create, boolean sync)
			throws CoreException, IOException {
		MindProject ret;
		ret = getMindProject(p);
		if (ret != null) {
			return ret;
		}
		if (!create)
			return null;

		if (!p.isOpen() || !p.hasNature(MindNature.NATURE_ID)) {
			return null;
		}
		ret = new MindProjectImpl(p, this);
		ret.setName(p.getName());
		ret.setMindId(_wsMindRoot.getMindId() + "/" + p.getName());
		_wsMindRoot.getMindprojects().add(ret);
		ret.getMindpathentries().addAll(
				(MindProjectImpl.readFileEntriesWithException(p)));
		_projects.put(p.getName(), ret);

		syncMindPath(p, ret, _wsMindRoot, sync);
		return ret;
	}

	protected void notifyChangedMindPackage_Files(Notification notification) {
		MindPackage mp = (MindPackage) notification.getNotifier();
		MindRootSrc src = mp.getRootsrc();
		if (src == null) return;
		MindProjectImpl mindProject = (MindProjectImpl) src.getProject();
		if (mindProject == null) return;
		mindProject.changeMINDCOMP();
	}
	
	protected void notifyChangedMindPathEntry_ResolvedBy(
			Notification notification) {
		MindPathEntry mpe = (MindPathEntry) notification.getNotifier();
		switch (notification.getEventType()) {
		case Notification.UNSET:

			break;
		case Notification.SET:
			MindObject oldRs = (MindObject) notification.getOldValue();
			MindObject newRs = (MindObject) notification.getNewValue();

			if (newRs == null) {
				if (oldRs != null) {
					if (TRACING)
						System.out.println("UNSET RESOLVED BY " + mpe
								+ "<>" + oldRs);
					if (mpe.getEntryKind() == MindPathKind.SOURCE) {
						IFolder folder = MindIdeCore
								.getResource((MindRootSrc) oldRs);
						try {
							CDTUtil.removeCSourceFolder(folder);
						} catch (CoreException e) {
							MindIdeCore.log(e,
									"remove c source folder " + folder);
						}
					}
					if (mpe.getOwnerProject() != null) {
						((MindProjectImpl) mpe.getOwnerProject())
								.unresolveMPE(mpe);
					}
				} else {
					if (TRACING)
						System.out.println("UNSET/SET? RESOLVED BY "
								+ mpe);

				}
			} else {
				if (TRACING)
					System.out.println("SET RESOLVED BY " + mpe + ":="
							+ newRs);
				if (mpe.getEntryKind() == MindPathKind.SOURCE) {
					IFolder folder = MindIdeCore
							.getResource((MindRootSrc) newRs);
//					TODO : why call this method. What is the context. In load context, do not call this method.
					//try {
//						CDTUtil.createCSourceFolder(folder);
//					} catch (CoreException e) {
//						MindIdeCore.log(e, "create c source folder "
//								+ folder);
//					}
				}
				if (mpe.getOwnerProject() != null) {
					((MindProjectImpl) mpe.getOwnerProject())
							.resolveMPE(mpe);
				}
			}
			break;
		}
	}

	protected void notifyChangedMindProject_Allsrc(Notification notification) {
		MindProjectImpl mp = (MindProjectImpl) notification.getNotifier();
		switch (notification.getEventType()) {
		case Notification.ADD:
			BasicEList<MindRootSrc> l = new BasicEList<MindRootSrc>();
			l.add((MindRootSrc) notification.getNewValue());
			for (MindPathEntry mpe : mp.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mp || mpe_project == null) {
					continue;
				}
				mpe_project.addSrcDep(l);
			}
			break;
		case Notification.ADD_MANY:
			l = new BasicEList<MindRootSrc>();
			l.addAll((Collection<? extends MindRootSrc>) notification
					.getNewValue());
			for (MindPathEntry mpe : mp.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mp || mpe_project == null) {
					continue;
				}
				mpe_project.addSrcDep(l);
			}
			break;
		case Notification.REMOVE:
			l = new BasicEList<MindRootSrc>();
			l.add((MindRootSrc) notification.getOldValue());
			for (MindPathEntry mpe : mp.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mp || mpe_project == null) {
					continue;
				}
				mpe_project.removeSrcDep(l);
			}
			break;
		case Notification.REMOVE_MANY:
			l = new BasicEList<MindRootSrc>();
			l.addAll((Collection<? extends MindRootSrc>) notification
					.getOldValue());
			for (MindPathEntry mpe : mp.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mp || mpe_project == null) {
					continue;
				}
				mpe_project.removeSrcDep(l);
			}
			break;
		}
		mp.changeMINDSRC();
	}

	protected void notifyChangedMindProject_Mindpathentries(
			Notification notification) {
		MindProjectImpl mindProject = (MindProjectImpl) notification.getNotifier();
	
		switch (notification.getEventType()) {
		case Notification.ADD:
			resolve(mindProject, (MindPathEntry) notification.getNewValue());
			((MindProjectImpl) notification.getNotifier()).saveMPE();
			break;
		case Notification.ADD_MANY:
			for (MindPathEntry mpe : ((Collection<MindPathEntry>) notification
					.getNewValue())) {
				resolve(mindProject, mpe);
			}
			((MindProjectImpl) notification.getNotifier()).saveMPE();
			break;
		case Notification.REMOVE:
			unresolve(mindProject, (MindPathEntry) notification
					.getOldValue());
			break;
		case Notification.REMOVE_MANY:
			for (MindPathEntry mpe : ((Collection<MindPathEntry>) notification
					.getOldValue())) {
				unresolve(mindProject, mpe);
			}
			break;

		}
	}

	protected void notifyChangedMindRepo_MindProjects(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			MindModelImpl.this.resolve((MindProject) notification
					.getNewValue());
			break;
		case Notification.ADD_MANY:
			for (MindProject p : ((Collection<MindProject>) notification
					.getNewValue())) {
				MindModelImpl.this.resolve(p);
			}
			break;
		case Notification.REMOVE:
			unresolve((MindProject) notification.getOldValue());
			break;
		case Notification.REMOVE_MANY:
			for (MindProject p : ((Collection<MindProject>) notification
					.getOldValue())) {
				unresolve(p);
			}
			break;

		}
	}

	protected void notifyChangedMindRepo_Rootsrcs(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			MindModelImpl.this.resolve((MindRootSrc) notification
					.getNewValue());
			break;
		case Notification.ADD_MANY:
			for (MindRootSrc p : ((Collection<MindRootSrc>) notification
					.getNewValue())) {
				MindModelImpl.this.resolve(p);
			}
			break;
		case Notification.REMOVE:
			remove((MindRootSrc) notification.getOldValue());
			break;
		case Notification.REMOVE_MANY:
			for (MindRootSrc p : ((Collection<MindRootSrc>) notification
					.getOldValue())) {
				remove(p);
			}
			break;

		}
	}

	protected void notifyChangedMindRootSrc_Dependencies(
			Notification notification) {
		MindObject mindObject = (MindObject) notification.getNotifier();
		switch (notification.getEventType()) {
		case Notification.ADD:
			BasicEList<MindRootSrc> l = new BasicEList<MindRootSrc>();
			l.add((MindRootSrc) notification.getNewValue());
			for (MindPathEntry mpe : mindObject.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mindObject || mpe_project == null) {
					continue;
				}
				mpe_project.addSrcDep(l);
			}
			break;
		case Notification.ADD_MANY:
			l = new BasicEList<MindRootSrc>();
			l.addAll((Collection<? extends MindRootSrc>) notification
					.getNewValue());
			for (MindPathEntry mpe : mindObject.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mindObject || mpe_project == null) {
					continue;
				}
				mpe_project.addSrcDep(l);
			}
			break;
		case Notification.REMOVE:
			l = new BasicEList<MindRootSrc>();
			l.add((MindRootSrc) notification.getOldValue());
			for (MindPathEntry mpe : mindObject.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mindObject || mpe_project == null) {
					continue;
				}
				mpe_project.removeSrcDep(l);
			}
			break;
		case Notification.REMOVE_MANY:
			l = new BasicEList<MindRootSrc>();
			l.addAll((Collection<? extends MindRootSrc>) notification
					.getOldValue());
			for (MindPathEntry mpe : mindObject.getResolvedMindPathEntries()) {
				MindProjectImpl mpe_project = (MindProjectImpl) mpe
						.getOwnerProject();
				if (mpe_project == mindObject || mpe_project == null) {
					continue;
				}
				mpe_project.removeSrcDep(l);
			}
			break;

		}
	}

	protected void notifyChangedMindRootSrc_Packages(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			MindModelImpl.this.resolve((MindPackage) notification
					.getNewValue());
			break;
		case Notification.ADD_MANY:
			for (MindPackage p : ((Collection<MindPackage>) notification
					.getNewValue())) {
				MindModelImpl.this.resolve(p);
			}
			break;
		case Notification.REMOVE:
			remove((MindPackage) notification.getOldValue(), true);
			break;
		case Notification.REMOVE_MANY:
			for (MindPackage p : ((Collection<MindPackage>) notification
					.getOldValue())) {
				remove(p, true);
			}
			break;

		}
	}

	public void remove(MindFile mf) {
		mf.getPackage().getFiles().remove(mf);
	}

	public void remove(MindPackage mindPackage, boolean removeSubPackage) {
		List<MindPackage> list = _packages.get(mindPackage.getName());
		if (list != null)
			list.remove(mindPackage);
		mindPackage.getFiles().clear();
		mindPackage.getResolvedMindPathEntries().clear();

		// allready removed
		if (mindPackage.getRootsrc() == null)
			return;

		if (removeSubPackage) {
			IFolder f = MindIdeCore.getResource(mindPackage);
			String fullpath = f.getFullPath().toPortableString();
			if (!MindIdeCore.exists(f)) {
				MindRootSrc rs = mindPackage.getRootsrc();
				for (MindPackage subPackage : new ArrayList<MindPackage>(rs
						.getPackages())) {
					if (subPackage.getFullpath().startsWith(fullpath))
						remove(subPackage, false);
				}
			}
		}
		mindPackage.getRootsrc().getPackages().remove(mindPackage);
	}

	public void remove(MindProject mp) {
		if (MindModelImpl.TRACING)
			System.out.println("REMOVING MIND PROJECT " + mp.getProject());

		_projects.remove(mp.getName());
		ArrayList<MindRootSrc> rootSrcs = new ArrayList<MindRootSrc>(mp
				.getRootsrcs());
		mp.getRootsrcs().clear();
		for (MindRootSrc s : rootSrcs) {
			remove(s);
		}
		mp.getResolvedMindPathEntries().clear();
		if (MindModelImpl.TRACING)
			System.out.println("DONE REMOVE MIND PROJECT " + mp.getProject());
		if (mp.getRepo() == null)
			return;

		mp.getRepo().getMindprojects().remove(mp);
		if (MindModelImpl.TRACING)
			System.out.println("DONE2 REMOVE MIND PROJECT " + mp.getProject());

	}

	public void remove(MindRootSrc mindRootsrc) {
		if (TRACING)
			System.out.println("REMOVE ROOTSRC " + mindRootsrc.getFullpath());
		if (mindRootsrc.getProject() != null)
			mindRootsrc.getProject().getRootsrcs().remove(mindRootsrc);

		mindRootsrc.getResolvedMindPathEntries().clear();
		mindRootsrc.getPackages().clear();

		if (mindRootsrc.getRepo() == null)
			return;

		mindRootsrc.getRepo().getRootsrcs().remove(mindRootsrc);

	}

	public void resolve(MindPackage newValue) {
		if (TRACING)
			System.out.println("ADD PACKAGE " + newValue.getName());
		addPackage(newValue);
		resolve(MindPathKind.IMPORT_PACKAGE, newValue.getName(), newValue);
	}

	protected void resolve(MindProjectImpl mindProject, MindPathEntry mpe) {
		if (mpe.getEntryKind() == MindPathKind.APPLI) {
			mindProject.changeMINDCOMP();
		}
		if (mpe.getResolvedBy() != null)
			return;
		;
		if (mpe.getEntryKind() == MindPathKind.PROJECT) {
			MindProject p = findProject(mpe);
			if (p != null)
				mpe.setResolvedBy(p);
			return;
		}
		if (mpe.getEntryKind() == MindPathKind.SOURCE) {
			MindProject prj = mpe.getOwnerProject();
			IFolder f = ResourcesPlugin.getWorkspace().getRoot().getFolder(
					new Path(mpe.getName()));
			MindRootSrc p = findOrCreateRootSrc(prj, f, true);
			if (p != null)
				mpe.setResolvedBy(p);
			return;
		}
		if (mpe.getEntryKind() == MindPathKind.IMPORT_PACKAGE) {
			MindPackage p = findPackage(mpe);
			if (p != null)
				mpe.setResolvedBy(p);
			return;
		}
	}

	public void resolve(MindPathKind k, String nameAttendu, MindObject r) {
		for (MindRepo mr : _repos.getRepos()) {
			for (MindProject prj : mr.getMindprojects()) {
				for (MindPathEntry mpe : prj.getMindpathentries()) {
					if (mpe.getEntryKind() == k && mpe.getResolvedBy() == null) {
						if (mpe.getName().equals(nameAttendu)) {
							if (TRACING)
								System.out.println("RESOLVE MPE " + mpe
										+ " -> " + r.eClass().getName() + ":"
										+ r.getName());
							mpe.setResolvedBy(r);
						}
					}
				}
			}
		}
	}

	public void resolve(MindProject p) {
		resolve(MindPathKind.PROJECT, p.getProject().getFullPath()
				.toPortableString(), p);
	}

	public void resolve(MindRootSrc mindRootsrc) {
		if (TRACING)
			System.out.println("RESOLVE ROOTSRC " + mindRootsrc.getFullpath());
		resolve(MindPathKind.SOURCE, mindRootsrc.getName(), mindRootsrc);
	}

	public void syncCSourceFolder(IProject project) {
		MindProject mp = getMindProject(project);
		if (mp == null)
			return;

		ICProjectDescriptionManager mgr = CoreModel.getDefault()
				.getProjectDescriptionManager();
		ICProjectDescription des = mgr.getProjectDescription(project, true);
		if (des == null) {
			return;
		}
		ICConfigurationDescription config = des
				.getConfigurationByName("Default");
		ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(Arrays
				.asList(config.getSourceEntries()));
		Map<IPath, MindPathEntry> pathToMpe = new HashMap<IPath, MindPathEntry>();
		for (MindPathEntry mpe : mp.getMindpathentries()) {
			if (mpe.getEntryKind() != MindPathKind.SOURCE) {
				continue;
			}
			pathToMpe.put(new Path(mpe.getName()), mpe);
		}
		for (ICSourceEntry icSourceEntry : srcs) {
			if (pathToMpe.containsKey(icSourceEntry.getFullPath()))
				continue;
			IPath p = icSourceEntry.getFullPath();
			if (p.segmentCount() <2) continue;
			IFolder f = ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
			if (!f.exists())
				continue;
			mp.getMindpathentries().add(MindIdeCore.newMPESource(f));
		}
	}

	void syncMindPath(IProject p, MindProject mindp, MindRepo repo, boolean sync) {
		EList<MindPathEntry> mindpath = mindp.getRawMinpath();
		for (MindPathEntry mindPathEntry : mindpath) {
			if (mindPathEntry.getEntryKind() == MindPathKind.SOURCE) {
				IPath pathE = new Path(mindPathEntry.getName());
				IFolder f = p.getFolder(pathE.removeFirstSegments(1));
				if (f.exists()) {
					findOrCreateRootSrc(mindp, repo, f, sync);
				}
			}
		}
	}

	protected void unresolve(MindProject mp) {
		_projects.remove(mp.getName());
		ArrayList<MindRootSrc> rootSrcs = new ArrayList<MindRootSrc>(mp
				.getRootsrcs());
		mp.getRootsrcs().clear();
		for (MindRootSrc s : rootSrcs) {
			s.getRepo().getRootsrcs().remove(s);
		}
		mp.getResolvedMindPathEntries().clear();
	}

	protected void unresolve(MindProjectImpl mindProject, MindPathEntry mpe) {
		if (mpe.getEntryKind() == MindPathKind.APPLI) {
			mindProject.changeMINDCOMP();
		}
		mpe.setResolvedBy(null);
		if (mpe.getEntryKind() == MindPathKind.SOURCE) {
			IFolder src = ResourcesPlugin.getWorkspace().getRoot().getFolder(
					new Path(mpe.getName()));
			try {
				CDTUtil.removeCSourceFolder(src);
			} catch (CoreException e) {
				MindIdeCore.log(e, "remove c source folder " + src);
			}
			MindRootSrc rs = UtilMindIde.findRootSrc(mindProject.getRepo(), src.getFullPath());
			if (rs != null)
				remove(rs);
		}
		((MindProjectImpl) mindProject).unresolveMPE(mpe);

	}

	@Override
	public IStatus validate(MindProject p, EList<MindPathEntry> mindpath) {
		MultiStatus ret = new MultiStatus(MindActivator.ID, 0, "", null);
		int index = -1;
		Set<IFolder> srcfolder = new HashSet<IFolder>();
		ONE: for (MindPathEntry mpe : mindpath) {
			index++;
			if (mpe.getEntryKind() == null || mpe.getName() == null) {
				ret.add(new Status(Status.ERROR, MindActivator.ID,
						"incomplete entry[" + index + "] " + mpe));
				continue;
			}
			String name = mpe.getName();
			switch (mpe.getEntryKind()) {
			case APPLI:
				int colonIndex = name.indexOf(":");
				if (colonIndex == -1) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry application is missing [" + index
									+ "] " + name));
					continue;
				}
				String cn = name.substring(0, colonIndex);
				MindAdl cnObj = p.findQualifiedComponent(cn);
				if (cnObj == null) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry compoent name not found ["
									+ index + "] " + cn));
					continue;
				}

				String appliname = name.substring(colonIndex + 1);
				if (appliname.length() == 0) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry application is missing [" + index
									+ "] " + name));
					continue;
				}

				break;
			case LIBRARY:
				break;
			case IMPORT_PACKAGE:
				if (!getAllPackages().containsKey(name)) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry import, cannot found package ["
									+ index + "] " + name));
					continue;
				}
				break;
			case PROJECT:
				Path path = new Path(name);
				if (path.segmentCount() != 1) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry project, cannot found project ["
									+ index + "] " + name));
					continue;
				}
				IProject refProject = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(name);
				if (!refProject.exists()) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry project, cannot found project ["
									+ index + "] " + name));
					continue;
				}
				break;
			case REPO:
				break;
			case SOURCE:
				path = new Path(name);
				if (path.segmentCount() <= 1) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry source, cannot found folder ["
									+ index + "] " + name));
					continue;
				}
				IFolder f = ResourcesPlugin.getWorkspace().getRoot().getFolder(
						new Path(name));
				if (f.getProject() != p.getProject()) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry source, not in same project ["
									+ index + "] " + name));
					continue;
				}
				if (!f.exists()) {
					ret.add(new Status(Status.ERROR, MindActivator.ID,
							"incomplete entry source, folder not exist ["
									+ index + "] " + name));
					continue;
				}
				IContainer c = f;
				while (true) {
					if (srcfolder.contains(c)) {
						if (c == f) {
							ret.add(new Status(Status.ERROR, MindActivator.ID,
									"duplicate entry source [" + index + "] "
											+ name));
							continue ONE;
						} else {
							ret.add(new Status(Status.ERROR, MindActivator.ID,
									"duplicate entry source ["
											+ index
											+ "] "
											+ c.getFullPath()
													.toPortableString()));
							continue ONE;
						}
					}
					c = c.getParent();
					if (c == null)
						break;
				}
				srcfolder.add(f);
				break;

			default:
				break;
			}
		}
		if (ret.isOK())
			return Status.OK_STATUS;
		return ret;
	}


}
