package org.ow2.fractal.mind.ide;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.common.ui.util.FileUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;



public class ModelToProjectUtil {
	
	
	public static final ModelToProjectUtil INSTANCE = new ModelToProjectUtil();
	
	private IEditorInput editorInput;
	
	private ModelToProjectUtil () {
		refreshEditorInput();
	}
	
	public URI resolveAdl(String componentName, ArrayList<String> imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		return resolveAdl(componentName, importsEList);
	}
	
	public URI resolveAdl(String componentName, EList<String> imports) {
		MindProject project = getMindProject();
		String defaultPackage = getPackage(project).getName();
		MindAdl adl = project.resolveAdl(componentName, defaultPackage, imports);
		URI resourceURI = null;
		if (adl != null) {
			resourceURI = URI.createURI(adl.getFullpath());
		}
		return resourceURI;
	}
	
	public List<String> getDefinitionsInProject() {
		List<String> definitions = new ArrayList<String>();
		MindProject project = getMindProject();
		EList<MindFile> files = null;
		if (project != null) {
			files = project.getAllFiles();
		}
		else {
			return new ArrayList<String>();
		}
		for (MindFile file : files) {
			if (file instanceof MindAdl) {
				definitions.add(file.getQualifiedName());
			}
		}
		return definitions;
	}
	
	public void setEditorInput(IEditorInput input) {
		editorInput = input;
	}
	
	private void refreshEditorInput () {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(window==null) return;
		IWorkbenchPage page = window.getActivePage();
		if(page==null) return;
		IEditorPart editor = page.getActiveEditor();
		if (editor == null) return;
		editorInput = editor.getEditorInput();
	}
	
	public MindProject getMindProject() {
		return getMindProject(getIProject());
	}
	
	public MindProject getMindProject(IProject project) {
		return MindIdeCore.get(project);
	}
	
	public String getCurrentDefinition() {
		// TODO		
		return new String(" ");
	}
	
	public IFile getIFile(URI uri) {
		if (uri != null) {
			IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
			IProject project = workspace.getRoot().getProject(uri.segment(0));
			if (project == null) return null;
			String path = FileUtil.getRelativePath(uri.path(),project.getFullPath().toString());
			if (!(path.length() > 0)) return null;
			return project.getFile(path);
		}
		return null;
	}
	
	/**
	 * 
	 * @return the IProject associated with the editorInput
	 */
	public IProject getIProject() {
		IProject project = null;
		refreshEditorInput();
		
		if(editorInput instanceof FileEditorInput){
			URI resourceURI = URI.createPlatformResourceURI(((FileEditorInput)editorInput).getURI().toString(),true);
			try{
				String relativePath = FileUtil.getRelativePath(((FileEditorInput)editorInput).getPath().toString(), Platform.getLocation().toString());
				//Replace \ with #
				String convertedRelativePath = convertToGenericPath(relativePath);
				URI relativeURI = URI.createURI(convertedRelativePath);
				
				if (relativeURI.segmentCount() > 1) {
					IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
					project = workspace.getRoot().getProject(relativeURI.segment(0));
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return project;
	}
	
	/**
	 * 
	 * @return the IProject associated with the editorInput
	 */
	public MindPackage getPackage(MindProject project) {
		refreshEditorInput();
		
		if(editorInput instanceof FileEditorInput){
			URI resourceURI = URI.createPlatformResourceURI(((FileEditorInput)editorInput).getURI().toString(),true);
			try{
				String relativePath = FileUtil.getRelativePath(((FileEditorInput)editorInput).getPath().toString(), Platform.getLocation().toString());
				//Replace \ with #
				String convertedRelativePath = '/' + convertToGenericPath(relativePath);
				URI relativeURI = URI.createURI(convertedRelativePath);
				
				if (relativeURI.segmentCount() > 1) {
					EList<MindRootSrc> roots = project.getRootsrcs();
					for (MindRootSrc rootSrc : roots) {
						String rootPath = rootSrc.getFullpath();
						if (convertedRelativePath.contains(rootPath)) {
							EList<MindPackage> packages = rootSrc.getPackages();
							for (MindPackage mindPackage : packages) {
								String packagePath = mindPackage.getFullpath();
								if (convertedRelativePath.contains(packagePath)) {
									return mindPackage;
								}
							}
						}
						
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	/**
	 * Used to convert a windows path ( \\ )
	 * to a unix path ( / )
	 * @param oldPath
	 * @return
	 */
	static String convertToGenericPath(String oldPath){	
		String convertedPath = oldPath.replace('\\', '/');
		return convertedPath;
	}
	
	
//	
//	
//	public static IJavaProject getJavaProject(){
//		IJavaProject result = null;
//		
//		refreshEditorInput();
//		
//		if(editorInput instanceof JarEntryEditorInput){
//			JarEntryEditorInput jarEditor = (JarEntryEditorInput)editorInput;
//			if(jarEditor.getStorage() instanceof JarEntryFile){
//				IPackageFragmentRoot packageFragmentRoot = ((JarEntryFile)((JarEntryEditorInput)editorInput).getStorage()).getPackageFragmentRoot();
//				result = packageFragmentRoot.getJavaProject();
//			}
//		}else if(editorInput instanceof FileEditorInput){
//			URI resourceURI = URI.createPlatformResourceURI(((FileEditorInput)editorInput).getURI().toString(),true);
//			try{
//				String absolutePath =((FileEditorInput)editorInput).getPath().toOSString();
//				String relativePath = FileUtil.getRelativePath(((FileEditorInput)editorInput).getPath().toString(), Platform.getLocation().toString());
//				//Replace \ with #
//				String convertedRelativePath = convertToGenericPath(relativePath);
//				URI relativeURI = URI.createURI(convertedRelativePath);
//				
//				if (relativeURI.segmentCount() > 1) {
//					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(relativeURI.segment(0));
//					try{
//						result = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
//						
//					}catch(Exception e){
//						e.printStackTrace();
//					}
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//			
//		}
//		return result;
//	}
//	
//	
//	
//	/* (non-Javadoc)
//	 * @see org.ow2.fractal.f4e.fractal.util.IDefinitionLocatorHelper#getLocations(org.eclipse.emf.common.util.URI)
//	 */
//	public Collection<String> getLocations(URI resourceURI){
//		List<String> locations = new ArrayList<String>();
//		String projectName = null;
//		
//		refreshEditorInput();
//
//		if(editorInput instanceof JarEntryEditorInput){
//			JarEntryEditorInput jarEditor = (JarEntryEditorInput)editorInput;
//			if(jarEditor.getStorage() instanceof JarEntryFile){
//				IPackageFragmentRoot packageFragmentRoot = ((JarEntryFile)((JarEntryEditorInput)editorInput).getStorage()).getPackageFragmentRoot();
//				projectName = packageFragmentRoot.getJavaProject().getElementName();
//			}
//		}else if(editorInput instanceof FileEditorInput){
//			if(resourceURI.isArchive()){
//				URI editorInputFileURI = URI.createURI(((FileEditorInput)editorInput).getURI().getPath().replace(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), ""));
//				projectName = editorInputFileURI.segment(0);
//			}else{
//				if (resourceURI.segmentCount() > 1) {
//					projectName = resourceURI.segment(1);
//				}
//			}
//		}
//		
//		if(projectName != null){
//			locations.addAll(getProjectLocations(projectName));
//			if(resourceURI.isArchive()){
//				String jarArchivePath = resourceURI.toString().replaceFirst(resourceURI.path() + '$',"/"); 
//				if(locations.contains(jarArchivePath)){
//					locations.remove(jarArchivePath);
//					locations.add(0, jarArchivePath);
//				}
//				
//			}
//		}
//
//		return locations;
//	}
//	
//	
//	static class EnumerationIterator<T>  {
//		interface EnumerationIterable<T> extends Iterator<T>, Iterable<T>{};
//		
//	     static public <T> EnumerationIterable<T> iterator(final Enumeration<T> enum_) {
//	       return new EnumerationIterable<T> () {
//	         public boolean hasNext() {
//	           return enum_.hasMoreElements();
//	         }
//
//	         public T next() {
//	           return enum_.nextElement();
//	         }
//
//	         public void remove() {
//	           throw new UnsupportedOperationException();
//	         }
//
//			public Iterator<T> iterator() {
//				return this;
//			}
//	         
//	       };
//	     }
//	};
//
//	     
//	protected static List<URI> getAllFractalDefinitions(IJarEntryResource jarEntryResource){
//		List<URI> definitions = new ArrayList<URI>();
//		if(jarEntryResource instanceof JarEntryDirectory){
//			IJarEntryResource children[] = jarEntryResource.getChildren();
//			if(children != null ){
//				for(int i=0; i<children.length;i++){
//					if(children[i] != null){
//						definitions.addAll(getAllFractalDefinitions(children[i]));
//					}
//				}
//			}
//		}else if(jarEntryResource != null && jarEntryResource.getName() != null && jarEntryResource.getName().endsWith(".adl")){
//			definitions.add(URI.createURI("jar:file://" +  ((JarFile)jarEntryResource.getParent()).getName() + "!/" + jarEntryResource.getName()));
//		}
//		return definitions;
//	}
//	     
//	protected static List<URI> getAllFractalDefinitions(JarFile jarFile){
//		List<URI> definitions = new ArrayList<URI>();
//		for(JarEntry entry: EnumerationIterator.iterator(jarFile.entries())){
//			if(entry.isDirectory()){
//				JarEntryDirectory jarDirectory = new JarEntryDirectory(entry.getName());
//				jarDirectory.setParent(jarFile);
//				definitions.addAll(getAllFractalDefinitions(jarDirectory));
//			}else{
//				if(entry != null && entry.getName()!=null){
//					JarEntryFile jarEntryFile = new JarEntryFile(entry.getName());
//					jarEntryFile.setParent(jarFile);
//					definitions.addAll(getAllFractalDefinitions(jarEntryFile));
//				}
//			}
//		}
//		return definitions;
//	}
//	
//	
//	protected static List<URI> getAllFractalDefinitions(File directory){
//		List<URI> definitions = new ArrayList<URI>();
//		for(File file: Arrays.asList(directory.listFiles())){
//			if(file.isDirectory()){
//				definitions.addAll(getAllFractalDefinitions(file));
//			}else{
//				if(file != null && file.getName()!=null && file.getName().endsWith(".adl")){
//					String prefix = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
//					String filename =  file.getAbsolutePath().toString();
//					if(filename.startsWith(prefix)){
//						definitions.add(URI.createPlatformResourceURI(filename.substring(prefix.length(), filename.length()),true));
//					}else{
//						definitions.add(URI.createFileURI(file.getAbsolutePath().toString()));
//					}
//					
//				}
//			}
//		}
//		return definitions;
//	}
//	
//	public static List<URI> getAllFractalDefinitions(){
//		List<URI> definitions = new ArrayList<URI>();
//		
//		javaProject = getJavaProject();
//		
//		try{
//		if (javaProject != null) {
//			File file;
//			
//			IClasspathEntry[] classpaths = javaProject.getResolvedClasspath(true);
//									
//			for (int i = 0; i < classpaths.length; i++) {
//				IClasspathEntry classpath = classpaths[i];
//				if (classpath.combineAccessRules() == false) {
//					if (classpath.getPath().getFileExtension() != null
//							&& classpath.getPath().getFileExtension()
//									.equals("jar")) {
//						IClasspathEntry classpathEntry = JavaCore
//								.getResolvedClasspathEntry(classpaths[i]);
//						if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
//							
//							file = new File(classpathEntry.getPath().makeAbsolute().toString());
//							// May be it is a platform relative path
//							if(!file.exists()){
//								file = new File(Platform.getLocation() + classpathEntry.getPath().makeAbsolute().toString());
//								if(!file.exists()){
//									file = null;
//								}
//							}
//							JarFile jarFile = new JarFile(file);
//							
//							//JavaCore.get
//							if(file != null){
//								definitions.addAll(getAllFractalDefinitions(jarFile));
//								//definitions.add("jar:file://" + file.getAbsolutePath() + "!/");
//							}
//						}
//					}
//				}
//				
//				// We add source folder as Fractal search location
//				if (classpaths[i].getEntryKind() == IClasspathEntry.CPE_SOURCE) {
//					String path = ResourcesPlugin.getWorkspace().getRoot().findMember(classpaths[i].getPath().toString()).getLocation().toOSString();
//					file = new File( path);
//					if(file.isDirectory()){
//						definitions.addAll(getAllFractalDefinitions(file));
//					}
//				}
//				
//				// add fractal file contained in the output location (generally the .bin folder) to the search location 
//				// spoonJDT generates by default fractal files in the output location)
////				IPath binPath = javaProject.getOutputLocation();
////				file = new File(Platform.getLocation() + binPath.toOSString());
////				definitions.addAll(getAllFractalDefinitions(file));
//			
//				file = new File("D:\\test\\test.jar");
//				JarFile jarFile = new JarFile(file);
//				definitions.addAll(getAllFractalDefinitions(jarFile));
//				
//				// We add Fractal search locations of referenced Java projects
//				String requiredProjects[] = javaProject.getRequiredProjectNames();
//				for(int j=0; j< requiredProjects.length;j++){
//					//definitions.addAll(getProjectLocations(requiredProjects[j]));
//				}
//			}
//		}
//	}catch (Exception e){
//		e.printStackTrace();
//	} 
//	
//	return definitions;
//	}
//	
//	/**
//	 * @param projectName the Java project name
//	 * @return list of absolute path locations where Fractal files must be search in 
//	 */
//	protected Collection<String> getProjectLocations(String projectName){
//		List<String> locations = new ArrayList<String>();
//	
//		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
//		if(!project.exists()){
//			//TODO error message
//			//FractalPlugin.getDefault().getLog().log(new Status(IStatus.WARNING,FractalPlugin.PLUGIN_ID,"The project '" + project.getName() + "' doesn't exist"));
//			return locations;
//		}
//		
//		try {
//			IProjectNature projectNature = project.getNature(JavaCore.NATURE_ID);
//			
//			if(projectNature == null){
//				//TODO error message
//				//FractalPlugin.getDefault().getLog().log(new Status(IStatus.WARNING,FractalPlugin.PLUGIN_ID,"The project '" + project.getName() + "' is not a Java project"));
//				return locations;
//			}
//			
//			IJavaProject javaProject = (IJavaProject)projectNature;
//			if (javaProject != null) {
//				File file;
//				
//				IClasspathEntry[] classpaths = javaProject.getResolvedClasspath(true);
//				
//				for (int i = 0; i < classpaths.length; i++) {
//					IClasspathEntry classpath = classpaths[i];
//					if (classpath.combineAccessRules() == false) {
//						if (classpath.getPath().getFileExtension() != null
//								&& classpath.getPath().getFileExtension()
//										.equals("jar")) {
//							IClasspathEntry classpathEntry = JavaCore
//									.getResolvedClasspathEntry(classpaths[i]);
//							if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
//								file = new File(classpathEntry.getPath().makeAbsolute().toString());
//								// May be it is a platform relative path
//								if(!file.exists()){
//									file = new File(Platform.getLocation() + classpathEntry.getPath().makeAbsolute().toString());
//									if(!file.exists()){
//										file = null;
//									}
//								}
//								if(file != null){
//									locations.add(
//												"jar:file://" + file.getAbsolutePath() + "!/");
//								}
//							}
//						}
//					}
//					
//					// We add source folder as Fractal search location
//					if (classpaths[i].getEntryKind() == IClasspathEntry.CPE_SOURCE) {
//						locations.add(
//								URI.createPlatformResourceURI(
//										classpath.getPath().makeAbsolute()
//												.toString()
//												+ "/", false).toString());
//					}
//					
//					// Add the default output location of the JavaPorject (generatly the bin directory) to
//					// the search location
//					IPath binPath = javaProject.getOutputLocation();
//					file = new File(Platform.getLocation() + binPath.toOSString());
//					if(file != null && file.exists()){
//						locations.add(URI.createPlatformResourceURI(binPath.toOSString() + "/", false).toString());
//					}
//					
//					
//					// We add Fractal search locations of referenced Java projects
//					String requiredProjects[] = javaProject.getRequiredProjectNames();
//					for(int j=0; j< requiredProjects.length;j++){
//						locations.addAll(getProjectLocations(requiredProjects[j]));
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		
//		return locations;
//	}
}
