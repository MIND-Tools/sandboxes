package org.ow2.mindEd.ide.core.impl;

import java.io.File;
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
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.ow2.mindEd.ide.core.FamilyJobCST;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModel;
import org.ow2.mindEd.ide.core.MindNature;
import org.ow2.mindEd.ide.core.RepoTypeAdapter;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindAllRepo;
import org.ow2.mindEd.ide.model.MindC;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindH;
import org.ow2.mindEd.ide.model.MindIdf;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindLibrary;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRepo;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindideFactory;
import org.ow2.mindEd.ide.model.MindidePackage;

public class MindModelImpl implements MindModel {
	private static final class DeleteResourceJob extends Job {
		IResource _p;
		public DeleteResourceJob(IResource p) {
			super("delete resource "+p.getName());
			this._p = p;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				_p.delete(true, null);
			} catch (CoreException e) {
				MindIdeCore.log(e, "Cannot delete project "+_p.getName());
			}
			return Status.OK_STATUS;
		}
		
		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_REMOVE_PROJECT == family;
		}
	}
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
			if (f == MindidePackage.Literals.MIND_LIB_OR_PROJECT__MINDPATHENTRIES) {
				notifyChangedMindProject_Mindpathentries(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_LIB_OR_PROJECT__ROOTSRCS) {
				notifyChangedMindRepo_Rootsrcs(notification);
				return;
			}
			if (f == MindidePackage.Literals.MIND_REPO__MIND_LIB_OR_PROJECTS) {
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

	static RepoTypeAdapter[] _repoType = { new WSRepoTypeAdapter(), new LocalRepoTypeAdapter() };

	/* debugging flag to enable tracing */
	public static final boolean TRACING = "true".equalsIgnoreCase(Platform.getDebugOption("org.ow2.mindEd.ide.core.ide/traceModel")); //$NON-NLS-1$ //$NON-NLS-2$

	public static final String WS = "workspace";
	public static final String REPO = "local repository";

	private static MindRootSrc createRootSrc(MindProject mindp, MindRepo repo,
			IContainer f, String srcRootName) {
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
	private Map<String, MindLibrary> _libs;

	MindAllRepo _repos;

	private MindIdeWorkspaceChangeListener _wsListener;

	private MindRepo _wsMindRoot;

	private MindRepo _repoMindRoot;

	private IFolder _localRepoContainer;

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
		MindLibOrProject ret = UtilMindIde.find(repo.getMindLibOrProjects(), project
				.getName());
		return (MindProject) (ret instanceof MindProject ? ret : null);
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

	public MindRootSrc findOrCreateRootSrc(MindLibOrProject mindp, IFolder f,
			boolean sync) {
		return findOrCreateRootSrc(mindp, mindp.getRepoFromLibOrProject(), f, sync);
	}

	public MindRootSrc findOrCreateRootSrc(MindLibOrProject mindp, MindRepo repo,
			IContainer f) {
		MindRootSrc srcRoot;
		if (mindp instanceof MindLibrary) {
			return (MindLibrary) mindp;
		}
		String srcRootName = f.getFullPath().toPortableString();
		srcRoot = UtilMindIde.find(repo.getRootsrcs(), srcRootName);
		if (srcRoot == null) {
			srcRoot = createRootSrc((MindProject) mindp, repo, f, srcRootName);
		} else {
			Assert.isTrue(mindp == srcRoot.getProject());
		}
		return srcRoot;
	}

	public MindRootSrc findOrCreateRootSrc(MindLibOrProject mindp, MindRepo repo,
			IContainer f, boolean sync) {
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
		MindLibOrProject prj = mpe.getOwnerProject();
		Map<String, List<MindPackage>> packages = getAllPackages();
		List<MindPackage> refPackages = packages.get(mpe.getName());
		if (refPackages == null || refPackages.size() == 0)
			return null;
		for (MindPackage mindPackage : refPackages) {
			if (mindPackage.getRootsrc() == null) // error 
				continue;
			if (mindPackage.getRootsrc().getProject() == prj)
				return mindPackage;
		}

		EList<MindLibOrProject> usedPackage = getUsedPackage(prj);
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
			for (MindLibOrProject prj : r.getMindLibOrProjects()) {
				if (prj instanceof MindProject && prj.getName().equals(projectName))
					return (MindProject) prj;
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

	@Override
	public Map<String, MindPackage> getAllPackages(MindProject mp) {
		HashMap<String, MindPackage> retpackages = new HashMap<String, MindPackage>();
		for (MindRootSrc mRootSrc : mp.getRootsrcs()) {
			for (MindPackage p : mRootSrc.getPackages()) {
				retpackages.put(p.getName(),p);
			}
		}
		return retpackages;
	}
	
	public MindPackage getPackage(MindProject mp, String packageName) {
		for (MindRootSrc mRootSrc : mp.getRootsrcs()) {
			for (MindPackage p : mRootSrc.getPackages()) {
				if (p.getName().equals(packageName))
					return p;
			}
		}
		return null;
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
		if (_projects == null) {
			return Collections.emptyList();
		}
		return new ArrayList<MindProject>(_projects.values());
	}

	public MindProject getMindProject(IProject p) {
		if (_projects == null) {
			_projects = new HashMap<String, MindProject>();
		}
		MindLibOrProject ret = _projects.get(p.getName());
		if (ret != null)
			return (MindProject) ret;
		ret = UtilMindIde.find(_wsMindRoot.getMindLibOrProjects(), p.getName());
		if (ret instanceof MindProject && ret != null) {
			_projects.put(p.getName(), (MindProject) ret);
			return (MindProject) ret;
		}
		return null;
	}
	
	public MindLibrary getMindLib(IProject p) {
		if (_libs == null) {
			_libs = new HashMap<String, MindLibrary>();
		}
		MindLibOrProject ret = _libs.get(p.getName());
		if (ret != null)
			return (MindLibrary) ret;
		ret = UtilMindIde.find(_wsMindRoot.getMindLibOrProjects(), p.getName());
		if (ret instanceof MindLibrary && ret != null) {
			_libs.put(p.getName(), (MindLibrary) ret);
			return (MindLibrary) ret;
		}
		return null;
	}

	@Override
	public MindAdl getAdl(MindProject mp, String packageName, String componantName) {
		MindPackage p = getPackage(mp, packageName);
		if (p == null) return null;
		for (MindFile adl : p.getFiles()) {
			if (adl instanceof MindAdl && adl.getName().equalsIgnoreCase(componantName)) {
				return (MindAdl) adl;
			}
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

	private EList<MindLibOrProject> getUsedPackage(MindLibOrProject prj) {
		EList<MindLibOrProject> ret = new BasicEList<MindLibOrProject>();
		if (prj != null)
			getUsedPackage(prj, ret);
		return ret;
	}

	private void getUsedPackage(MindLibOrProject prj, EList<MindLibOrProject> ret) {
		for (MindLibOrProject mindProject : prj.getUses()) {
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
	
	@Override
	public MindRepo getLocalRepo() {
		return _repoMindRoot;
	}
	
	public IFolder getLocalRepoFolder() {
		return _localRepoContainer;
	};

	public void init() {
		MindPathListener l = new MindPathListener();

		_repos = MindideFactory.eINSTANCE.createMindAllRepo();
		_repos.eAdapters().add(l);

		_wsMindRoot = UtilMindIde.findOrCreateRepo(this, MindModelImpl.WS);
		
		
		File repoFile = new File( System.getProperty("user.home")+File.separator+".mind"+File.separator+"repository");
		if (!repoFile.exists())
			repoFile.mkdirs();
		
		try {
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IProject project = ws.getRoot().getProject(".localmindrepo");
			if (!project.exists())
			    project.create(null);
			if (!project.isOpen())
			    project.open(null);
			project.setHidden(false);
			IPath location = new Path(repoFile.getAbsolutePath());
			_localRepoContainer = project.getFolder(location.lastSegment());
			if (!_localRepoContainer.exists())
				_localRepoContainer.createLink(location, IResource.NONE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_wsListener = new MindIdeWorkspaceChangeListener(this,
				null);
		_repoMindRoot = UtilMindIde.findOrCreateRepo(this, MindModelImpl.REPO);


		for (RepoTypeAdapter rt : _repoType) {
			rt.initRepo(this);
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(_wsListener);	
	}

	@Override
	public MindLibOrProject init(IProject p) throws CoreException, IOException {
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

	public MindLibOrProject init(IProject p, boolean create, boolean sync)
			throws CoreException, IOException {
		MindLibOrProject ret;
		ret = getMindProject(p);
		if (ret != null) {
			return ret;
		}
		ret = getMindLib(p);
		if (ret != null) {
			return ret;
		}
		if (!create)
			return null;

		if (!p.isOpen() || !p.hasNature(MindNature.NATURE_ID)) {
			return null;
		}
		
		IFile f = p.getFile(MindProjectImpl.MINDLIB_FILENAME);
		if (f.exists()) {
			ret = new MindLibraryImpl(p,this);
			_libs.put(p.getName(), (MindLibrary) ret);
		} else {
			ret = new MindProjectImpl(p, this);
			_projects.put(p.getName(), (MindProject) ret);
		}
		ret.setName(p.getName());
		ret.setMindId(_wsMindRoot.getMindId() + "/" + p.getName());
		_wsMindRoot.getMindLibOrProjects().add(ret);
		
		MindProjectImpl.readFileEntriesWithException2(p, ret);
		
		syncMindPath(p, ret, _wsMindRoot, sync);
		return ret;
	}

	protected void notifyChangedMindPackage_Files(Notification notification) {
		MindPackage mp = (MindPackage) notification.getNotifier();
		MindRootSrc src = mp.getRootsrc();
		if (src == null) return; // le package est deja detruit
		if (notification.getEventType() == Notification.REMOVE) {
			MindFile f = (MindFile) notification.getOldValue();
			deleteAdlObject(f);
		} else if (notification.getEventType() == Notification.REMOVE_MANY) {
			List<MindFile> f = (List<MindFile>) notification.getOldValue();
			for (MindFile mindFile : f) {
				deleteAdlObject(mindFile);
			}
		}
		MindProjectImpl mindProject = (MindProjectImpl) src.getProject();
		if (mindProject == null) return;
		mindProject.changeMINDCOMP();
	}

	private void deleteAdlObject(MindFile f) {
		IFile file_adl = MindIdeCore.getResource(f);
		if (file_adl.exists()) {
			DeleteResourceJob j = new DeleteResourceJob(file_adl);
			j.setRule(file_adl.getProject());
			j.schedule();
		}
		IResource diag = file_adl.getParent().findMember(file_adl.getName()+MindIdeCore.DIAGRAM_EXT);
		if (diag != null && diag.exists()) {
			DeleteResourceJob j = new DeleteResourceJob(diag);
			j.setRule(diag.getProject());
			j.schedule();
		}
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
			((MindProjectImpl) notification.getNotifier()).saveMPE();
			break;
		case Notification.REMOVE_MANY:
			for (MindPathEntry mpe : ((Collection<MindPathEntry>) notification
					.getOldValue())) {
				unresolve(mindProject, mpe);
			}
			((MindProjectImpl) notification.getNotifier()).saveMPE();
			break;

		}
	}

	protected void notifyChangedMindRepo_MindProjects(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			MindModelImpl.this.resolve((MindLibOrProject) notification
					.getNewValue());
			break;
		case Notification.ADD_MANY:
			for (MindLibOrProject p : ((Collection<MindLibOrProject>) notification
					.getNewValue())) {
				MindModelImpl.this.resolve(p);
			}
			break;
		case Notification.REMOVE:
			unresolve((MindLibOrProject) notification.getOldValue());
			break;
		case Notification.REMOVE_MANY:
			for (MindLibOrProject p : ((Collection<MindLibOrProject>) notification
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
			remove((MindRootSrc) notification.getNotifier(), (MindPackage) notification.getOldValue(), true);
			break;
		case Notification.REMOVE_MANY:
			for (MindPackage p : ((Collection<MindPackage>) notification
					.getOldValue())) {
				remove((MindRootSrc) notification.getNotifier(), p, true);
			}
			break;
		}
	}

	public void remove(MindFile mp) {
		mp.getPackage().getFiles().remove(mp);
	}
	
	public void remove(MindPackage p) {
		remove(p.getRootsrc(), p, true);
	}

	public void remove(MindRootSrc rs, MindPackage mindPackage, boolean removeSubPackage) {
		List<MindPackage> list = _packages.get(mindPackage.getName());
		if (list != null)
			list.remove(mindPackage);
		if (isDefaultPackage(rs, mindPackage)) {
			for (MindFile f : mindPackage.getFiles()) {
				deleteAdlObject(f);
			}
		} 
		
		mindPackage.getFiles().clear();
		mindPackage.getResolvedMindPathEntries().clear();

		IFolder mapping_package = MindIdeCore.getResource(mindPackage);
		if (mapping_package.exists()) {
			if (isDefaultPackage(rs, mindPackage)) {
				// nothing
			} else {
				try {
					mapping_package.delete(true, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
			
		// allready removed
		if (mindPackage.getRootsrc() == null)
			return;
		
		if (removeSubPackage) {
			IFolder f = MindIdeCore.getResource(mindPackage);
			String fullpath = f.getFullPath().toPortableString();
			if (!MindIdeCore.exists(f)) {
				for (MindPackage subPackage : new ArrayList<MindPackage>(rs
						.getPackages())) {
					if (subPackage.getFullpath().startsWith(fullpath))
						remove(rs, subPackage, false);
				}
			}
		}
		if (mindPackage.getRootsrc() == null)
			return;
		mindPackage.getRootsrc().getPackages().remove(mindPackage);
	}

	private boolean isDefaultPackage(MindRootSrc rs, MindPackage mindPackage) {
		if (rs == null)
			return false;
		return rs.getFullpath().equals(mindPackage.getFullpath());
	}

	public void removeMO(MindObject mo) {
		switch (mo.eClass().getClassifierID()) {
		case MindidePackage.MIND_PROJECT:
			remove((MindProject)mo);
			break;
		case MindidePackage.MIND_ROOT_SRC:
			remove((MindRootSrc)mo);
			break;
		case MindidePackage.MIND_PACKAGE:
			//remove((MindPackage)mo);
			break;
		case MindidePackage.MIND_ADL:
			remove((MindAdl)mo);
			break;
		case MindidePackage.MIND_C:
			remove((MindC)mo);
			break;
		case MindidePackage.MIND_ITF:
			remove((MindItf)mo);
			break;
		case MindidePackage.MIND_IDF:
			remove((MindIdf)mo);
			break;
		case MindidePackage.MIND_H:
			remove((MindH)mo);
			break;
		case MindidePackage.MIND_LIBRARY:
			remove((MindLibrary)mo);
			break;

		
		default:
			break;
		}
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
		if (mp.getRepoFromLibOrProject() == null)
			return;

		mp.getRepoFromLibOrProject().getMindLibOrProjects().remove(mp);
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

		if (mindRootsrc.getRepoFromRootSrc() == null)
			return;

		mindRootsrc.getRepoFromRootSrc().getRootsrcs().remove(mindRootsrc);

	}

	public void resolve(MindPackage newValue) {
		if (TRACING)
			System.out.println("ADD PACKAGE " + newValue.getName());
		addPackage(newValue);
		resolve(MindPathKind.IMPORT_PACKAGE, newValue.getName(), newValue);
	}

	/**
	 * a new mind path entry is added. Try to resolve it.
	 * @param mindProject the mind project
	 * @param mpe the added mind path entry.
	 */
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
			MindLibOrProject prj = mpe.getOwnerProject();
			IFolder f = ResourcesPlugin.getWorkspace().getRoot().getFolder(
					new Path(mpe.getName()));
			
			try {
				CDTUtil.createCSourceFolder(f);
			} catch (CoreException e) {
				MindIdeCore.log(e, "Cannot create c source folder "+f);
			}
			
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
		if (mpe.getEntryKind() == MindPathKind.LIBRARY) {
			MindLibrary p = findLibrary(mpe);
			if (p != null)
				mpe.setResolvedBy(p);
			return;
		}
	}

	private MindLibrary findLibrary(MindPathEntry mpe) {
		return (MindLibraryImpl) _libs.get("repo/"+mpe.getName());
	}

	/** try to resolve project, source or import package.
	 * 
	 * @param k {@link MindPathKind#SOURCE}, {@link MindPathKind#PROJECT}, {@link MindPathKind#IMPORT_PACKAGE}
	 * @param nameAttendu parameter name to matches
	 * @param r the resolved object if match
	 */
	public void resolve(MindPathKind k, String nameAttendu, MindObject r) {
		for (MindRepo mr : _repos.getRepos()) {
			for (MindLibOrProject prj : mr.getMindLibOrProjects()) {
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

	/**
	 * A new project is added.
	 * @param p the added project.
	 */
	public void resolve(MindLibOrProject p) {
		
		if (p instanceof MindProject)
			resolve(MindPathKind.PROJECT, ((MindProject) p).getProject().getFullPath()
				.toPortableString(), p);
		else
			resolve(MindPathKind.LIBRARY, p.getName(), p);
	}

	/**
	 * A new root source is added
	 * @param mindRootsrc the added root source object.
	 */
	public void resolve(MindRootSrc mindRootsrc) {
		if (TRACING)
			System.out.println("RESOLVE ROOTSRC " + mindRootsrc.getFullpath());
		resolve(MindPathKind.SOURCE, mindRootsrc.getName(), mindRootsrc);
		
		IFolder f = MindIdeCore.getResource(mindRootsrc);
		
		try {
			CDTUtil.createCSourceFolder(f);
		} catch (CoreException e) {
			MindIdeCore.log(e, "Cannot create c source folder "+f);
		}
	}

	/**
	 * synchronize all c source folder, add in mind path if need. If the giving project is not a mind project, do nothing.
	 * 
	 * 
	 * @param project the project
	 */
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

	/**
	 * Try to recreate root source from mind path.
	 * @param p the project (IProject)
	 * @param mindp the mind project object
	 * @param repo the current repository where is the project
	 * @param sync true if synchronize into source folder
	 */
	void syncMindPath(IContainer p, MindLibOrProject mindp, MindRepo repo, boolean sync) {
		EList<MindPathEntry> mindpath = mindp.getRawMinpath();
		for (MindPathEntry mindPathEntry : mindpath) {
			if (mindPathEntry.getEntryKind() == MindPathKind.SOURCE) {
				String pathName = mindPathEntry.getName();
				IPath pathE = new Path(pathName);
				IContainer f ;
				if (pathName.equals("."))
					f = p;
				else
					f = p.getFolder(pathE.removeFirstSegments(1));
				if (f.exists()) {
					findOrCreateRootSrc(mindp, repo, f, sync);
				}
			}
		}
	}
	void unresolve(MindLibOrProject lop) {
		if (lop instanceof MindProject)
			unresolve((MindProject) lop);
	}

	/**
	 * Delete project
	 * 
	 * @param mp a mind project
	 */
	protected void unresolve(MindProject mp) {
		IProject p = mp.getProject();
		if (p.isOpen() && p.exists()) {
			DeleteResourceJob j = new DeleteResourceJob(p);
			j.setRule(p);
			j.schedule();
		}
		_projects.remove(mp.getName());
		ArrayList<MindRootSrc> rootSrcs = new ArrayList<MindRootSrc>(mp
				.getRootsrcs());
		mp.getRootsrcs().clear();
		for (MindRootSrc s : rootSrcs) {
			s.getRepoFromRootSrc().getRootsrcs().remove(s);
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
//			if (src.exists()) {
//				try {
//					src.delete(true, null);
//				} catch (CoreException e) {
//					MindIdeCore.log(e, "Cannot delete folder "+src);
//				}
//			}
			MindRootSrc rs = UtilMindIde.findRootSrc(mindProject.getRepoFromLibOrProject(), src.getFullPath());
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

	public MindLibrary findOrCreateLib(IFolder resource, String libname, MindRepo mindRepo, boolean sync) {
		MindLibraryImpl ret = (MindLibraryImpl) _libs.get("repo/"+resource.getName());
		if (ret == null) {
			ret = new MindLibraryImpl(resource,this);
			_libs.put("repo/"+libname, (MindLibrary) ret);
		
			ret.setName(libname);
			ret.setMindId(mindRepo.getMindId() + "/" + libname);
			ret.setFullpath(resource.getFullPath().toPortableString());
			mindRepo.getMindLibOrProjects().add(ret);
			//mindRepo.getRootsrcs().add(ret); pose un problme dans la vue.
		}
		
		if (sync)
			syncMindPath(resource, ret, mindRepo, true);
		return ret;
	}
	
	@Override
	public MindLibrary createMindLibFromProject(MindProject mp, String libName, IProgressMonitor monitor)  {
		List<CoreException> errors;
		IFolder r = null;
		MindLibrary lib = null;
		errors = new ArrayList<CoreException>();
		try {
			r = _localRepoContainer.getFolder(new Path(libName));
			if (!r.exists())
				r.create(true, true, monitor);
			lib = findOrCreateLib(r, libName, _repoMindRoot, false);
			final HashSet<IPath> pathsAdded = new HashSet<IPath>();
			for (MindRootSrc rs : mp.getRootsrcs()) {
				IFolder sourceFolder = MindIdeCore.getResource(rs);
				try {
					syncFolder(sourceFolder, Path.EMPTY, r, pathsAdded, monitor, errors);
				} catch (CoreException e) {
					errors.add(e);
				}
			}
			final int libSegmentCount = r.getFullPath().segmentCount();
			
			final HashSet<IResource> mustDelete = new HashSet<IResource>();
			// remove deleted file
			try {
				r.accept(new IResourceVisitor() {
					
					@Override
					public boolean visit(IResource resource) throws CoreException {
						IPath p = resource.getFullPath();
						if (resource.getType() == IResource.FILE) {
							p = p.removeFirstSegments(libSegmentCount);
							if (! pathsAdded.contains(p)) {
								mustDelete.add(resource);
							}						
						}
						return true;
					}
				});
			} catch (CoreException e1) {
				errors.add(e1);
			}
			for (IResource res : mustDelete) {
				try {
					setReadOnly((IFile) res, false);
					res.delete(true, monitor);
					MindFile f = (MindFile) MindIdeCore.get(res);
					if (f != null)
						remove(f);
				} catch (CoreException e) {
					errors.add(e);
				}
			}
			for (IResource res : mustDelete) {
				IContainer packageOrLib = res.getParent();
				if (packageOrLib == r || packageOrLib == null || !packageOrLib.exists()) continue;
				if (!UtilMindIde.hasFile(packageOrLib)) {
					try {
						packageOrLib.delete(true, monitor);
						MindPackage f = (MindPackage) MindIdeCore.get(res);
						if (f != null)
							remove(f);
					} catch (CoreException e) {
						errors.add(e);
					}
				}
			}
		} catch (CoreException e) {
			errors.add(e);
		}
			
		if (errors.size() > 0) {
			IStatus[] errrosStatus = new IStatus[errors.size()];
			for (int i = 0; i < errrosStatus.length; i++) {
				errrosStatus[i] = errors.get(i).getStatus();
			}
			IStatus s = new MultiStatus(MindActivator.ID, 0, errrosStatus, "Errors in sync "+libName, null);
			MindActivator.log(s);
		}
				
		syncMindPath(r, lib, _repoMindRoot, true);
		return lib;
	}

	private void syncFolder(IFolder sourceFolder, IPath p, IFolder r,
			HashSet<IPath> pathsAdded, IProgressMonitor monitor, List<CoreException> errors) throws CoreException {
		for (IResource resource : sourceFolder.members()) {
			if (resource.getType() == IResource.FILE) {
				if (pathsAdded.add(p.append(resource.getName()))) {
					copyFile((IFile) resource, r.getFile(resource.getName()), monitor, errors);
				}
			} else {
				if (resource.getType() == IResource.FOLDER) {
					IFolder rSubFolder = r.getFolder(resource.getName());
					if (!rSubFolder.exists())
						rSubFolder.create(true, true, monitor);
					syncFolder((IFolder) resource, p.append(resource.getName()), rSubFolder, pathsAdded, monitor, errors);
				}
			}
		}
	}

	private void copyFile(IFile resource, IFile destFile, IProgressMonitor monitor, List<CoreException> errors)  {
		try {
			if (destFile.exists()) {

				setReadOnly(destFile, false);
				destFile.delete(true, monitor);
			}
			resource.copy(destFile.getFullPath(), true, monitor);
			setReadOnly(destFile, true);
		} catch (CoreException e) {
			errors.add(e);
		}
	}
	
	/** (non-Javadoc)
	 * @see IResource#setReadOnly(boolean)
	 */
	public void setReadOnly(IFile destFile, boolean readonly) {
		ResourceAttributes attributes = destFile.getResourceAttributes();
		if (attributes == null)
			return;
		attributes.setReadOnly(readonly);
		attributes.setArchive(true);
		try {
			destFile.setResourceAttributes(attributes);
		} catch (CoreException e) {
			//failure is not an option
		}
	}
}
