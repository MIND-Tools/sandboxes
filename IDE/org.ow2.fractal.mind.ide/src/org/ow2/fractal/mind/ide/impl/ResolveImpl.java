package org.ow2.fractal.mind.ide.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;


public class ResolveImpl {
	
	
	static public EList<MindPackage> findPackages(MindProject mindProject) {
		BasicEList<MindPackage> foundPackages = new BasicEList<MindPackage> ();
		for (MindRootSrc s : mindProject.getRootsrcs()) {
			foundPackages.addAll(s.getPackages());
		}
		return foundPackages;
	}

	
	static public Map<String, EList<MindPackage>> findPackagesInMindPath(MindProject mindProject) {
		Map<String, EList<MindPackage>> ret = new HashMap<String, EList<MindPackage>>();
		EList<MindPackage> foundPackages = findPackages(mindProject);
		addPackagesInMap(ret, foundPackages);
		Collection<MindObject> referencedProjects = foundRefProjects(mindProject);
		for (MindObject p : referencedProjects) {
			switch (p.eClass().getClassifierID()) {
				case MindidePackage.MIND_PACKAGE:
					MindPackage packageM = (MindPackage) p;
					if (packageM.getRootsrc().getProject() == mindProject) continue;
					addPackageInMap(ret, packageM);
					break;
				case MindidePackage.MIND_PROJECT:
					if (p == mindProject) continue;
					addPackagesInMap(ret, findPackages((MindProject) p));
					break;
				case MindidePackage.MIND_ROOT_SRC:
					MindRootSrc rootSrc = (MindRootSrc)p;
					if (rootSrc.getProject() == mindProject) continue;
					addPackagesInMap(ret, rootSrc.getPackages());
					break;
				case MindidePackage.MIND_REPO:
					for (MindRootSrc s : ((MindRepo)p).getRootsrcs()) {
						if (s.getProject() == mindProject) continue;
						addPackagesInMap(ret, s.getPackages());
					}
					break;
			}
		}		
		return ret;
	}

	private static void addPackagesInMap(Map<String, EList<MindPackage>> ret,
			EList<MindPackage> foundPackages) {
		for (MindPackage mindPackage : foundPackages) {
			addPackageInMap(ret, mindPackage);
		}
	}

	private static void addPackageInMap(Map<String, EList<MindPackage>> ret,
			MindPackage mindPackage) {
		EList<MindPackage> l = ret.get(mindPackage.getName());
		if (l == null) {
			l = new BasicEList<MindPackage>();
			ret.put(mindPackage.getName(), l);
		}
		l.add(mindPackage);
	}
	
	static public EList<MindPackage> findPackagesInWorkspace() {
		EList<MindPackage> foundPackages = new BasicEList<MindPackage>();
		MindModel model = MindModelManager.getMindModelManager().getMindModel();
		for(MindRepo r : model.getMindRepository().getRepos()) {
			for (MindRootSrc s : r.getRootsrcs()) {
				foundPackages.addAll(s.getPackages());
			}
		}
		return foundPackages;
	}
	
	
	
	public static Collection<MindObject> foundRefProjects(MindProject mindProject) {
		ArrayList<MindObject> visitedItem = new ArrayList<MindObject>();
		ArrayList<MindProject> toVisitesItem = new ArrayList<MindProject>();
		toVisitesItem.add(mindProject);
		while (!toVisitesItem.isEmpty()) {
			MindProject p = toVisitesItem.remove(0);
			visitedItem.add(p);
			EList<MindPathEntry> refPs = mindProject.getMindpathentries();
			for (MindPathEntry rp : refPs) {
				if (rp.getResolvedBy() == null) continue;
				MindObject mo = rp.getResolvedBy();
				if (visitedItem.contains(mo)) continue;
				if (mo instanceof MindProject) {
					toVisitesItem.add((MindProject) mo);
				} else {
					visitedItem.add(mo);
				}
			}
		}
		return visitedItem;
	}

	/**
	 * Gets the package and class name.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the package and class name
	 */
	public static String getPackageName(String value) {
		int index = value.lastIndexOf('.');
		if (index == -1) return "";
		return value.substring(0, index);
	}
	
	
	/**
	 * Gets the lastclass name.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the lastclass name
	 */
	public static String getlastclassName(String value) {
		int index = value.lastIndexOf('.');
		if (index == -1) return value;
		return value.substring(index+1);
	}
	
	static public MindPackage findPackage(MindRootSrc sourceCadse, String pn) {
		return UtilMindIde.find(sourceCadse.getPackages(), pn);
	}

	
	
	
	public static MindFile resolve(MindProject mindProject, EClass typeElement, String name,
			String defaultPackage, List<String> imports) {
		
		HashMap<String, String> typeToPackage = new HashMap<String, String>();
		ArrayList<String> importsEtoile = new ArrayList<String>();
		Map<String, EList<MindPackage>> map = findPackagesInMindPath(mindProject);
		
		for (String i : imports) {
			String pn = getPackageName(i);
			String n = getlastclassName(i);
			if (!"*".equals(n)) {
				typeToPackage.put(n, pn);
			} else {
				importsEtoile.add(pn);
			}
		}
		
			
		String resolvedPackage = null;
		MindFile foundElement = null;
		if (name == null) return null;
		if (name.contains(".")) {
			//found with qualified name
			resolvedPackage = getPackageName(name);
			name = getlastclassName(name);
			return findQualifiedElement(typeElement, map, resolvedPackage, name);
		} else {
			resolvedPackage = typeToPackage.get(name);
			if (resolvedPackage == null) {
				// found in import with '.*'
				for (String pn : importsEtoile) {
					foundElement = findQualifiedElement(typeElement, map, pn, name);
					if (foundElement != null)
						return foundElement;
				}
				// found in current package
				foundElement = findQualifiedElement(typeElement, map, defaultPackage, name);
				if (foundElement != null) {
					return foundElement;
				}
				// fond in default package
				return findQualifiedElement(typeElement, map, "", name);
			} else {
				// found package in imports
				return findQualifiedElement(typeElement, map, resolvedPackage, name);
			}
		}

	}

	
	private static MindFile findQualifiedElement(EClass typeElement, Map<String, EList<MindPackage>> map, String pn,
			String name) {
		List<MindPackage> packagesList = map.get(pn);
		if (packagesList == null) {
			return null;
		}
		for (MindPackage p : packagesList) {
			MindFile idl = UtilMindIde.findFile(p.getFiles(), name, typeElement);
			if (idl != null)
				return idl;
		}
		return null;
	}

	public static <T extends MindFile> EList<T> resolve(MindProject mindProject,
			EClass typeElement, String name) {
		BasicEList<T> ret = new BasicEList<T>();
		for (Entry<String, EList<MindPackage>> p : findPackagesInMindPath(mindProject).entrySet()) {
			for(MindPackage pp : p.getValue()) {
				T idl = (T) UtilMindIde.findFile(pp.getFiles(), name, typeElement);
				if (idl != null)
					ret.add(idl);
			}
		}
		return ret;
	}
	
	public static EList<MindFile> getAllFiles(MindProject mindProject) {
		BasicEList<MindFile> ret = new BasicEList<MindFile>();
		for (Entry<String, EList<MindPackage>> p : findPackagesInMindPath(mindProject).entrySet()) {
			for(MindPackage pp : p.getValue()) {
				ret.addAll(pp.getFiles());
			}
		}
		return ret;
	}
	
	public static <T extends MindFile> EList<T> findComponent(MindProject mindProject,
			EClass typeElement) {
		BasicEList<T> ret = new BasicEList<T>();
		for (Entry<String, EList<MindPackage>> p : findPackagesInMindPath(mindProject).entrySet()) {
			for(MindPackage pp : p.getValue()) {
				for (MindFile f : pp.getFiles()) {
					if (f.eClass() == typeElement)
						ret.add((T) f);
				}
			}
		}
		return ret;
	}

	public static <T extends MindFile> EList<T> resolveP(MindProject mindProject,
			EClass typeElement, String packageName) {
		BasicEList<T> ret = new BasicEList<T>();
		EList<MindPackage> foundPackages = findPackagesInMindPath(mindProject).get(packageName);
		if (foundPackages == null)
			return ret;
		
		for (MindPackage p : foundPackages) {
			ret.addAll((Collection<? extends T>) p.getFiles());
		}
		return ret;
	}

	public static <T extends MindFile> EList<T> resolveInWorkspace(EClass typeElement, String name) {
		BasicEList<T> ret = new BasicEList<T>();
		for (MindPackage p : findPackagesInWorkspace()) {
			T idl = (T) UtilMindIde.findFile(p.getFiles(), name, typeElement);
			if (idl != null)
				ret.add(idl);
		}
		return ret;
	}
}
