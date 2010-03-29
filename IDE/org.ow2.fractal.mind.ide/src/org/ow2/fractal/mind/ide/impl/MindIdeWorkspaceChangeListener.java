package org.ow2.fractal.mind.ide.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.stub.java.rmi._Remote_Stub;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;

public class MindIdeWorkspaceChangeListener implements IResourceVisitor, IResourceDeltaVisitor, IResourceChangeListener {
	private MindRepo _mindRepo;
	Map<IResource, MindObject> _mapResourceToMind;
	MindModelImpl _model;
	
	public MindIdeWorkspaceChangeListener(MindModelImpl model, MindRepo repo, Map<IResource, MindObject> mapResourceToMind) {
		_mindRepo = repo;
		_model = model;
		_mapResourceToMind = mapResourceToMind;
		if (mapResourceToMind == null) {
			_mapResourceToMind = new HashMap<IResource, MindObject>();
		}
	}

	@Override
	public boolean visit(IResource resource) throws CoreException {
		return visit(IResourceDelta.ADDED, resource);
	}
	
	public boolean visit(int kind, final IResource resource) throws CoreException {
		if (resource.getType() == IResource.PROJECT) {
			MindProject mp;
			try {
				IProject p = (IProject) resource;
				mp = _model.init(p, kind != IResourceDelta.REMOVED || !p.isOpen(), false);
				if (mp != null) {
					if (kind == IResourceDelta.REMOVED) {
						if(MindModelImpl.TRACING)
							System.out.println("REMOVE PROJECT "+p);

						_model.remove(mp);
						return false;
					}
					_mapResourceToMind.put(resource, mp);
					return true;
				}
				
			} catch (IOException e) {
				MindIdeCore.log(e, "sync project "+resource);
			}
			return false;
		}
		if (resource.getType() == IResource.FOLDER) {
			IProject p = resource.getProject();
			MindProject mp = (MindProject) _mapResourceToMind.get(p);
			if (mp == null) {
				mp = _model.get(p);
				if (mp == null)
					return false;
				_mapResourceToMind.put(p, mp);
			}
			for (MindPathEntry mpe : mp.getMindpathentries()) {
				if (mpe.getEntryKind() == MindPathKind.SOURCE) {
					if (resource.getFullPath().toPortableString().equals(mpe.getName())) {
						MindRootSrc findRootSrc = (MindRootSrc) mpe.getResolvedBy();
						if (findRootSrc == null)
							findRootSrc = (MindRootSrc) _mapResourceToMind.get(resource);
						if (findRootSrc == null) {
							findRootSrc = UtilMindIde.findRootSrc(_mindRepo, resource.getFullPath());
						}
						if (findRootSrc != null) {
							if (kind == IResourceDelta.REMOVED) {
								_model.remove(findRootSrc);
								return false;
							} else {
								_mapResourceToMind.put(resource, findRootSrc);
								return true;
							}
						} else {
							if (kind == IResourceDelta.ADDED) { 
								findRootSrc = _model.findOrCreateRootSrc(mp, (IFolder) resource, false);
								_mapResourceToMind.put(resource, findRootSrc);
								return true;
							}
						}
							
					}
				}
			}
			
			if (kind == IResourceDelta.REMOVED) {
				MindPackage packageFound = findOrCreateMindPackage(resource, false);
				if (packageFound!= null)
					_model.remove(packageFound, true);
				return false;
			}
			if (hasFile((IFolder) resource)) {
				MindPackage packageFound = findOrCreateMindPackage(resource, true);
				if (packageFound == null)
					return false;
				
				if (packageFound.getName().length() !=0)
					_mapResourceToMind.put(resource, packageFound);
				return true;
			}
		}
		
		if (resource.getType() == IResource.FILE) {
			if (resource.getFullPath().segmentCount() == 2 || resource.getFullPath().segment(1).equals(".cproject")) {
				if (kind == IResourceDelta.CHANGED)
					_model.syncCSourceFolder(resource.getProject());
				return false;
			}
			MindFile mf = findOrCreateFile(resource, kind != IResourceDelta.REMOVED);
			if (mf != null) {
				if (kind == IResourceDelta.REMOVED) {
					_model.remove(mf);
					if (resource.getParent().getType() == IResource.FOLDER) {
						if (!MindIdeWorkspaceChangeListener.hasFile((IFolder) resource.getParent())) {
							MindPackage mPackage = findOrCreateMindPackage(resource.getParent(), false);
							if (mPackage != null)
								_model.remove(mPackage, true);
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	

	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		if (delta.getResource().getType() == IResource.PROJECT) {
			if ((delta.getFlags() & IResourceDelta.OPEN) != 0) {
				IProject p = (IProject) delta.getResource();
				if (p.isOpen()) {
					if(MindModelImpl.TRACING)
						System.out.println("OPEN PROJECT "+p);
					try {
						_model.init(p);
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				} else {
					if(MindModelImpl.TRACING)
						System.out.println("CLOSE PROJECT "+p);
					MindProject mp = _model.get(p);
					if (mp != null)
						_model.remove(mp);
				}
				return true;
			}
		}
		return visit(delta.getKind(), delta.getResource());
	}
	
	

	
	public MindFile findOrCreateFile(IResource resource, boolean create) {
		EClass cc = UtilMindIde.getEClassFile(resource.getName());
		if (cc != null) {
			String nameFile = removeSuffix(resource.getName());
			MindPackage p = findOrCreateMindPackage(resource.getParent(), create);
			if (p == null) return null;
			MindFile mf = UtilMindIde.findFile(p.getFiles(), nameFile, cc);
			if (mf == null && create) {
				mf = createMindFile(resource, cc, nameFile, p);
			}
			return mf;
		}
		return null;
	}

	/**
	 * Create a Mind file form given resource
	 * @param resource
	 * @param cc
	 * @param nameFile
	 * @param p
	 * @return
	 */
	private MindFile createMindFile(IResource resource, EClass cc, String nameFile,
			MindPackage p) {
		MindFile mf;
		mf = (MindFile)  EcoreUtil.create(cc);
		mf.setName(nameFile);
		mf.setFullpath(resource.getFullPath().toPortableString());
		mf.setMindId(p.getMindId()+"/"+resource.getName());
		mf.setQualifiedName(p.getName()+"."+nameFile);
		p.getFiles().add(mf);
		return mf;
	}
	
	/**
	 * Find or create if need and asked a MindPackage from given resource.
	 * @param resource the resource
	 * @param create ask to create if need
	 * @return a MindPackage or null if mindRoot source not found or if package not found and given create is false.
	 */
	private MindPackage findOrCreateMindPackage(IResource resource, boolean create) {
		//found package in cache
		MindObject packageFound = (MindObject) _mapResourceToMind.get(resource);
		if (packageFound != null && packageFound instanceof MindPackage)
			return (MindPackage) packageFound;
		
		if (packageFound != null && packageFound instanceof MindRootSrc)
			return UtilMindIde.findOrCreatePackage((MindRootSrc) packageFound, "", resource, create);
		
		//find root source
		IFolder rootSrcResource = null;
		MindRootSrc rootSrc = null;
		IContainer p = (IContainer) resource;
		while (true) {
			p = p.getParent();
			if (p == null)
				return null; // not found
			if (p.getType()!= IResource.FOLDER) 
				return null; // not found
			MindObject mobj = _mapResourceToMind.get(p);
			if (mobj == null) continue;
			if (mobj instanceof MindPackage) {
				MindPackage mindPack = (MindPackage) mobj;
				rootSrc = mindPack.getRootsrc();
				if (rootSrc == null) {
					continue;
				}
				rootSrcResource = MindIdeCore.getResource(rootSrc);
				break;
			}
			if (mobj instanceof MindRootSrc) {
				rootSrc = (MindRootSrc) mobj;
				rootSrcResource = (IFolder) p;
				break;
			}
		}
		if (rootSrcResource == null)
			return null;
		// root source found
		IPath rootSrcPath = rootSrcResource.getFullPath();
		String pn = 
			resource.getFullPath().removeFirstSegments(rootSrcPath.segmentCount()).makeRelative().toPortableString().replace('/', '.');
		// found or create if asked the MindPackage
		packageFound = UtilMindIde.findOrCreatePackage(rootSrc, pn, resource, create);
		return (MindPackage) packageFound;
	}

	private String removeSuffix(String name) {
		int i = name.lastIndexOf('.');
		return name.substring(0, i);
	}

	/**
	 * must create package model element.
	 * @param f a folder
	 * @return true if has file or is a sheet element
	 */
	public static boolean hasFile(IFolder f) {
		try {
			IResource[] members = f.members();
			if (members.length == 0)
				return true;
			for (IResource iResource : members) {
				if (iResource.getType() == IResource.FILE && UtilMindIde.getEClassFile(iResource.getName()) != null)
					return true;
			}
		} catch (CoreException e) {
			return false;
		}
		return false;
	}
	
	
	private void syncDelete() {
		for (MindRootSrc rs : new ArrayList<MindRootSrc>(_mindRepo.getRootsrcs())) {
			IResource r = MindIdeCore.getResource(rs);
			if (r == null || !r.exists()) {
				_model.remove(rs);
				continue;
			}
			_mapResourceToMind.put(r, rs);
			for (MindPackage p : new ArrayList<MindPackage>(rs.getPackages())) {
				r = MindIdeCore.getResource(p);
				if (r == null || !r.exists() || !MindIdeWorkspaceChangeListener.hasFile((IFolder) r)) {
					p.getRootsrc().getPackages().remove(p);
					continue;
				}
				_mapResourceToMind.put(r, p);
				for (MindFile mf : new ArrayList<MindFile>(p.getFiles())) {
					r = MindIdeCore.getResource(mf);
					if (r == null || !r.exists()) {
						mf.getPackage().getFiles().remove(mf);
						continue;
					}
					_mapResourceToMind.put(r, mf);
				}
			}
		}
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDelta delta = event.getDelta();
		if (delta != null)
			try {
				delta.accept(this);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		else {
			syncDelete();		
		}
		_mapResourceToMind.clear();
	}

}
