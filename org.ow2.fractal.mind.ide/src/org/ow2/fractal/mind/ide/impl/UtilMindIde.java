package org.ow2.fractal.mind.ide.impl;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.ow2.fractal.mind.ide.MindActivator;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindideFactory;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

public class UtilMindIde {
	/**
	 * Return the eclass corresponding to file extension.
	 * 
	 * @param nameFile
	 *            a name file
	 * @return the eclass or null if not found.
	 */
	public static EClass getEClassFile(String nameFile) {
		if (nameFile.endsWith(".adl")) {
			return MindidePackage.Literals.MIND_ADL;
		}
		if (nameFile.endsWith(".c")) {
			return MindidePackage.Literals.MIND_C;
		}
		if (nameFile.endsWith(".h")) {
			return MindidePackage.Literals.MIND_H;
		}
		if (nameFile.endsWith(".itf")) {
			return MindidePackage.Literals.MIND_ITF;
		}
		if (nameFile.endsWith(".idf")) {
			return MindidePackage.Literals.MIND_IDF;
		}
		return null;
	}

	/**
	 * Find in a list an object which name equals the giving name
	 * @param l a list where find the object
	 * @param name the name of the object to find
	 * @return the found object or null
	 */
	public static <T extends MindObject> T find(EList<T> l, String name) {
		for (T t : l) {
			if (name.equals(t.getName()))
				return t;
		}
		return null;
	}

	/**
	 * Find a mind file in the giving list <code>files</code> which name equals the giving name and class equals cc.
	 * @param files the list of mindfile
	 * @param nameFile the name of the mind file to find
	 * @param cc the class to the mind file to find
	 * @return the found mind file or null
	 */
	public static MindFile findFile(EList<MindFile> files, String nameFile,
			EClass cc) {
		for (MindFile f : files) {
			if (f.eClass() == cc && f.getName().equals(nameFile))
				return f;
		}
		return null;
	}

	public static MindRepo findOrCreateRepo(MindModel mm, String name) {
		MindAllRepo mindRepository = mm.getMindRepository();
		MindRepo wsMindRoot = UtilMindIde.find(mindRepository.getRepos(), name);
		if (wsMindRoot == null) {
			wsMindRoot = MindideFactory.eINSTANCE.createMindRepo();
			wsMindRoot.setName(name);
			wsMindRoot.setMindId(mindRepository.eClass().getEPackage()
					.getNsPrefix()
					+ "/" + name);
			mindRepository.getRepos().add(wsMindRoot);

		}
		return wsMindRoot;
	}

	static public MindPackage findOrCreatePackage(MindRootSrc rs, String pn,
			IResource resrcPackage, boolean create) {
		MindPackage packageFound;
		packageFound = UtilMindIde.find(rs.getPackages(), pn);
		if (packageFound == null && create) {
			packageFound = createPackage(rs, pn, resrcPackage);
		}
		return packageFound;
	}

	public static MindPackage createPackage(MindRootSrc rs, String pn,
			IResource resrcPackage) {
		MindPackage packageFound;
		packageFound = MindideFactory.eINSTANCE.createMindPackage();
		packageFound.setName(pn);
		packageFound.setMindId(rs.getMindId() + "/" + pn);
		packageFound.setFullpath(resrcPackage.getFullPath().toPortableString());
		rs.getPackages().add(packageFound);
		return packageFound;
	}

	public static MindRootSrc findRootSrc(MindRepo mindRepo, IPath fullPath) {
		return UtilMindIde.find(mindRepo.getRootsrcs(), fullPath
				.toPortableString());
	}

	public static MindAdl findAdl(EList<MindFile> files, String nameFile) {
		return (MindAdl) findFile(files, nameFile,
				MindidePackage.Literals.MIND_ADL);
	}

	public static String[] appliInfo(String name) throws CoreException {
		String[] ret = new String[2];
		int colonIndex = name.indexOf(":");
		if (colonIndex == -1) {
			throw new CoreException(new Status(Status.ERROR, MindActivator.ID,
					"incomplete entry application is missing " + name));
		}
		ret[0] = name.substring(0, colonIndex);
		ret[1] = name.substring(colonIndex + 1);
		if (ret[1].length() == 0) {
			throw new CoreException(new Status(Status.ERROR, MindActivator.ID,
					"incomplete entry application is missing " + name));
		}
		return ret;
	}
}
