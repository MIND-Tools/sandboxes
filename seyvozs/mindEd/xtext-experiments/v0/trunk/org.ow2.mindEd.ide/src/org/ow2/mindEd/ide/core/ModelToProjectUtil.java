package org.ow2.mindEd.ide.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindidePackage;



public class ModelToProjectUtil {
	
	/**
	 * The instance singleton
	 */
	public static final ModelToProjectUtil INSTANCE = new ModelToProjectUtil();
	
	
	
	private ModelToProjectUtil () {
	}
	
	
	
	/**
	 * @param project the IProject
	 * @return the MindProject associated with given IProject or null if the project is not of Mind nature
	 */
	public MindProject getMindProject(IProject project) {
		return MindIdeCore.get(project);
	}
	
	/**
	 * 
	 * @param uri the URI of the wanted file
	 * <pre>
   *   platform:/resource/project-name/path
   *   file:/absFile...
   *   </pre>
	 * @return the IFile or null
	 * 
	 */
	public IFile getIFile(URI uri) {
		if (uri != null) {
			// platform:/resource/project-name/path
			IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
			if (uri.isPlatformResource()) {
				String wsRelatifPath = uri.toPlatformString(true);
				IResource r = workspace.getRoot().findMember(wsRelatifPath);
				if (r instanceof IFile) {
					return ((IFile)r);
				}
				return null;
			}
			
			// file:/absolute-path
			if (uri.isFile() && !uri.isRelative()) {
				String fullPath = uri.path();
				return workspace.getRoot().getFileForLocation(new Path(fullPath));
			}
			throw new UnsupportedOperationException("URI scheme is unsupported: "+uri);
		}
		return null;
	}
	
	/**
	 * Seeks a component with the given name.
	 * @param componentName the name of the component to resolve
	 * @param imports the list of imports name in the definition
	 * @return the URI of the resolved component or null
	 * <pre>
   *   platform:/resource/project-name/path</pre>
	 * @see {@link MindProject#resolveAdl(String, String, EList)}
	 */
	public URI resolveAdl(URI adlURI, String componentName, ArrayList<String> imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		return resolveAdl(adlURI, componentName, importsEList);
	}
	
	/**
	 * Seeks a component with the given name.
	 * @param componentName the name of the component to resolve
	 * @param imports the list of imports name in the definition
	 * @return the URI of the resolved component or null 
	 * <pre>
   *   platform:/resource/project-name/path</pre>
	 * @see {@link MindProject#resolveAdl(String, String, EList)}
	 */
	public URI resolveAdl(URI adlURI, String componentName, EList<String> imports) {
		// Resolve and return the URI
		MindAdl adl = resolveMindAdl(adlURI, componentName, imports);
		if (adl == null) return null;
		
		return URI.createPlatformResourceURI(adl.getFullpath(), true);
	}
	
	public IFile resolveItf(URI adlURI, String itfName, EList<String> imports) {
		// Resolve and return the URI
		MindItf itf = getMindItf(adlURI, itfName, imports);
		if (itf == null) return null;
		
		return MindIdeCore.getResource(itf);
	}	

	public String getNameFQN(URI adlURI, String componentName, ArrayList<String>  imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		
		MindAdl adl = resolveMindAdl(adlURI, componentName, importsEList);
		if (adl == null) return null;
		
		return adl.getQualifiedName();
	}

	public MindAdl resolveMindAdl(URI adlURI, String componentName, EList<String> importsEList) {
		// This is the current project
		MindProject project = getMindProject(adlURI);
		if (project == null) {
			return null;
		}
		
		// This is the current package
		MindPackage defaultPackageObj = getCurrentPackage(adlURI);
		if (defaultPackageObj == null) {
			return null;
		}
		
		// Resolve and return the URI
		MindAdl adl = project.resolveAdl(componentName, defaultPackageObj.getName(), importsEList);
		return adl;
	}
	
	private MindItf getMindItf(URI adlURI, String itfName, EList<String> imports) {
		// This is the current project
		MindProject project = getMindProject(adlURI);
		if (project == null) {
			return null;
		}
		
		// This is the current package
		MindPackage defaultPackageObj = getCurrentPackage(adlURI);
		if (defaultPackageObj == null) {
			return null;
		}
		
		// Resolve and return the URI
		MindItf itf = project.resolveItf(itfName, defaultPackageObj.getName(), imports);
		return itf;
	}
	
	/**
	 * 
	 * @return a list of string containing all the definitions in the project, or an empty list
	 */
	public List<String> getAllFQNAdlInProject(URI adlURI) {
		return getAllFQNInProject(adlURI, MindidePackage.Literals.MIND_ADL);
	}
	
	private List<String> getAllFQNInProject(URI adlURI, EClass type) {
		MindProject mindProject = getMindProject(adlURI);
		if (mindProject == null) return Collections.emptyList();
		
		EList<MindFile> files = mindProject.getAllFiles();
		List<String> definitions = new ArrayList<String>();
		for (MindFile file : files) {
			if (type.isInstance(file)) {
				definitions.add(file.getQualifiedName());
			}
		}
		return definitions;
	}
	
	/**
	 * 
	 * @return a list of string containing all the .itf in the project, or an empty list
	 */
	public List<String> getAllFQNItfInProject(URI adlURI) {
		return getAllFQNInProject(adlURI, MindidePackage.Literals.MIND_ITF);
	}


	/**
	 * @return the current MindProject or null if project is not of Mind nature
	 */
	public MindProject getMindProject(URI adlURI) {
		return getMindProject(getIProject(adlURI));
	}
	
	
	/**
	 * @return the current IProject or null
	 */
	public IProject getIProject(URI adlURI) {
		IFile file = getIFile(adlURI);
		
		if (file == null)
			return null;
		return file.getProject();
	}
	
	/**
	 * @return the IProject associated with the editorInput
	 */
	public MindPackage getCurrentPackage(URI adlURI) {
		MindFile mo = getCurrentMindFile(adlURI);
		return mo == null ? null : mo.getPackage();
	}
	
	
	/**
	 * @return the IProject associated with the editorInput
	 */
	public MindFile getCurrentMindFile(URI adlURI) {
		IFile file = getIFile(adlURI);
		if (file.getName().endsWith(MindIdeCore.DIAGRAM_EXT)){
			String n = file.getName();
			file = file.getParent().getFile(new Path(n.substring(0, n.length()-MindIdeCore.DIAGRAM_EXT.length())));
		}
		MindObject mo = MindIdeCore.get(file);
		if (mo instanceof MindFile) {
			return (MindFile) mo;
		}
		
		throw new IllegalArgumentException(mo == null ? "not find":"bad type "+mo.eClass().getName());
	}
	
	public String getCurrentFQN(URI adlURI) {
		MindFile f = getCurrentMindFile(adlURI);
		return f == null ? "" : f.getQualifiedName();
	}
	
	/*******************************/
	
	/**
	 * The editor input associated with the editor opened.
	 * Needed to get the current project / package / definition
	 */
	@Deprecated
	private IEditorInput editorInput;
	
	/**
	 * Seeks a component with the given name.
	 * @param componentName the name of the component to resolve
	 * @param imports the list of imports name in the definition
	 * @return the URI of the resolved component or null
	 * <pre>
   *   platform:/resource/project-name/path</pre>
	 * @see {@link MindProject#resolveAdl(String, String, EList)}
	 */
	@Deprecated
	public URI resolveAdl(String componentName, ArrayList<String> imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		return resolveAdl(componentName, importsEList);
	}
	
	/**
	 * Seeks a component with the given name.
	 * @param componentName the name of the component to resolve
	 * @param imports the list of imports name in the definition
	 * @return the URI of the resolved component or null 
	 * <pre>
   *   platform:/resource/project-name/path</pre>
	 * @see {@link MindProject#resolveAdl(String, String, EList)}
	 */
	@Deprecated
	public URI resolveAdl(String componentName, EList<String> imports) {
		// Resolve and return the URI
		MindAdl adl = resolveMindAdl(componentName, imports);
		if (adl == null) return null;
		
		return URI.createPlatformResourceURI(adl.getFullpath(), true);
	}
	
	@Deprecated
	public IFile resolveItf(String itfName, EList<String> imports) {
		// Resolve and return the URI
		MindItf itf = getMindItf(itfName, imports);
		if (itf == null) return null;
		
		return MindIdeCore.getResource(itf);
	}	

	@Deprecated
	public String getNameFQN(String componentName, ArrayList<String>  imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		
		MindAdl adl = resolveMindAdl(componentName, importsEList);
		if (adl == null) return null;
		
		return adl.getQualifiedName();
	}

	@Deprecated
	public MindAdl resolveMindAdl(String componentName, EList<String> importsEList) {
		// This is the current project
		MindProject project = getMindProject();
		if (project == null) {
			return null;
		}
		
		// This is the current package
		MindPackage defaultPackageObj = getCurrentPackage();
		if (defaultPackageObj == null) {
			return null;
		}
		
		// Resolve and return the URI
		MindAdl adl = project.resolveAdl(componentName, defaultPackageObj.getName(), importsEList);
		return adl;
	}
	
	@Deprecated
	public MindItf getMindItf(String itfName, EList<String> imports) {
		// This is the current project
		MindProject project = getMindProject();
		if (project == null) {
			return null;
		}
		
		// This is the current package
		MindPackage defaultPackageObj = getCurrentPackage();
		if (defaultPackageObj == null) {
			return null;
		}
		
		// Resolve and return the URI
		MindItf itf = project.resolveItf(itfName, defaultPackageObj.getName(), imports);
		return itf;
	}
	
	/**
	 * 
	 * @return a list of string containing all the definitions in the project, or an empty list
	 */
	@Deprecated
	public List<String> getAllFQNAdlInProject() {
		return getAllFQNInProject(MindidePackage.Literals.MIND_ADL);
	}
	
	@Deprecated
	private List<String> getAllFQNInProject(EClass type) {
		MindProject mindProject = getMindProject();
		if (mindProject == null) return Collections.emptyList();
		
		EList<MindFile> files = mindProject.getAllFiles();
		List<String> definitions = new ArrayList<String>();
		for (MindFile file : files) {
			if (type.isInstance(file)) {
				definitions.add(file.getQualifiedName());
			}
		}
		return definitions;
	}
	
	/**
	 * 
	 * @return a list of string containing all the .itf in the project, or an empty list
	 */
	@Deprecated
	public List<String> getAllFQNItfInProject() {
		return getAllFQNInProject(MindidePackage.Literals.MIND_ITF);
	}
	
	
	@Deprecated
	public void setEditorInput(IEditorInput input) {
		editorInput = input;
	}
	
	@Deprecated
	public IEditorInput getEditorInput() {
		return editorInput;
	}	

	/**
	 * @return the current MindProject or null if project is not of Mind nature
	 */
	@Deprecated
	public MindProject getMindProject() {
		return getMindProject(getIProject());
	}
	
	/**
	 * @return the current IProject or null
	 */
	@Deprecated
	public IProject getIProject() {
		IProject project = null;

		if(editorInput instanceof FileEditorInput){
			FileEditorInput fileEditorInput = (FileEditorInput)editorInput;
			IFile file = fileEditorInput.getFile();
			if (file == null)
				return null;
			return file.getProject();
		}
		return project;
	}
	
	/**
	 * @return the IProject associated with the editorInput
	 */
	@Deprecated
	public MindPackage getCurrentPackage() {
		MindFile mo = getCurrentMindFile();
		return mo == null ? null : mo.getPackage();
	}
	
	
	/**
	 * @return the IProject associated with the editorInput
	 */
	@Deprecated
	public MindFile getCurrentMindFile() {
		
		if(editorInput instanceof FileEditorInput){
			FileEditorInput fileEditorInput = (FileEditorInput)editorInput;
			IFile file = fileEditorInput.getFile();
			if (file.getName().endsWith(MindIdeCore.DIAGRAM_EXT)){
				String n = file.getName();
				file = file.getParent().getFile(new Path(n.substring(0, n.length()-MindIdeCore.DIAGRAM_EXT.length())));
			}
			MindObject mo = MindIdeCore.get(file);
			if (mo instanceof MindFile) {
				return (MindFile) mo;
			}
			
			throw new IllegalArgumentException(mo == null ? "not find":"bad type "+mo.eClass().getName());
		}
		return null;
	}
	
	@Deprecated
	public String getCurrentFQN() {
		MindFile f = getCurrentMindFile();
		return f == null ? "" : f.getQualifiedName();
	}
}
