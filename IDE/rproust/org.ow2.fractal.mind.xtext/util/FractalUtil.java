package org.ow2.fractal.mind.xtext.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;

import adl.AdlDefinition;
import adl.ArchitectureDefinition;
import adl.ImportDefinition;
import adl.custom.impl.ComponentTypeDefinitionCustomImpl;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import adl.custom.util.AdlMergeUtil;
import adl.impl.AdlDefinitionImpl;

/**
 * Utility class for mind adl textual editor
 * 
 * @author Damien Fournier
 * @contributor Rémi Mélisson
 * 
 */

public class FractalUtil {

	/**
	 * Clean import name
	 * 
	 * @param importDefinition
	 * @return
	 */

	public static String getImportPackageName(ImportDefinition importDefinition) {

		String packageName = importDefinition.getImportName();

		if (importDefinition.getImportName().endsWith(".*"))
			packageName = packageName.substring(0, packageName.length() - 2);

		return packageName;

	}
	

	/**
	 * Get the list of component simple names included into a package
	 * 
	 * @param packageName : name of the package we are looking into
	 * @param componentNames : list of all components name
	 * @return simple names of components
	 * 
	 */

	public static ArrayList<String> getComponentNamesFromPackage(
			String packageName, Collection<? extends MindAdl> components) {

		ArrayList<String> list = new ArrayList<String>();
		
		// + 1 because of the last dot before component name
		int packageLength = packageName.length() + 1;

		String componentName;
		for (MindAdl mindAdl : components) {
			componentName = mindAdl.getQualifiedName();
			if (componentName.startsWith(packageName))
				list.add(componentName.substring(packageLength, componentName
						.length()));
		}

		return list;
	}
	
	/**
	 * Filter components according to AdlMergeUtil.isValidDefinitionForMerge  
	 * 
	 * @param architectureDefinition
	 * @param components
	 * @return
	 */
	public static Collection<? extends MindAdl> filterAccordingToExtendValidity(ArchitectureDefinition architectureDefinition, Collection<? extends MindAdl> components){
		Collection<MindAdl> list = new ArrayList<MindAdl>();
		AdlMergeUtil adlMergeUtil = AdlMergeUtil.getInstance();
		
		
		for (MindAdl mindAdl : components) {
			if (adlMergeUtil.isValidDefinitionForMerge(architectureDefinition, mindAdl.getQualifiedName()))
				list.add(mindAdl);	
		}
		
		return list;
	}
	
	
	/**
	 * Extract the package name from a component FQN
	 * 
	 * @param fQN represent the component fully qualified name
	 * @return the name of the package
	 */
	
	public static String getPackageNameFromFQN(String fQN){		
		int index = fQN.lastIndexOf('.');		
		return fQN.substring(0, index);
	}
	
	public static String getSimpleNameFromFQN(String fQN){
		int index = fQN.lastIndexOf('.');
		return fQN.substring(index + 1);
	}
	
	/**
	 * 
	 * Convert prefixed component names to simple name according to imports
	 * 
	 * @param list of components we want to convert
	 * @param list of imports 
	 * @return list of components no more prefixed with package name
	 */
	public static HashSet<String> convertFQNToSimpleNamesAccordingToImports(Collection<? extends MindAdl> components, HashSet<String> imports){
		HashSet<String> list = new HashSet<String>();
		
		String componentName;
		String packageName;
				
		for (MindAdl mindAdl : components){
			componentName = mindAdl.getQualifiedName();
			packageName = FractalUtil.getPackageNameFromFQN(componentName);

			// if component or package has been imported 
			if (imports.contains(packageName) || imports.contains(componentName)){
				// we add the reduced proposition
				list.add(FractalUtil.getSimpleNameFromFQN(componentName));
			}
			// else we add the entire name
			else {
				list.add(componentName);
			}
		}
		
		return list;
	}
	
	/**
	 * 
	 * Get fully qualified name from AdlDefinitionCustomImpl
	 * 
	 * @deprecated
	 */
	public static String getFQNFromAdlDefinition(AdlDefinitionImpl adlDefinitionImpl){
				
		URI uri = adlDefinitionImpl.eDirectResource().getURI();
		
		// it does'nt work at that time for sub packages
		//String s = ModelToProjectUtil.INSTANCE.getFQNFromURI(uri);
		
		// FIXME -- TEMP 
		// we try to catch the keywords from which package directories are beginning		
				
		String src_folder = "src";
		String extension = ".adl";
		int i = 0;
		String fQN = "";
		for (String segment : uri.segments()){
			i++;
			if (segment.equals(src_folder))
				break;
		}
				
		for (int j = i; j <= (uri.segmentCount()-1); j++){			
			if (j != (uri.segmentCount()-1)){
				fQN += uri.segment(j) + ".";
			} else {
				fQN += uri.segment(j).substring(0, uri.segment(j).length() - extension.length());
			}
		}		
		// --
		
		return fQN;
		
	}
	
	/**
	 * 
	 * @param architectureDefinition
	 * @param partialName
	 * @return null if unknown component, else FQN
	 */
	public static String getFQNFromPartialName(ArchitectureDefinition architectureDefinition, String partialName){
		
		String FQN = null;
		
		// -- Retrieve all components declared into mind project
		Collection<? extends MindAdl> components = MindModelManager.getMindModelManager()
				.getMindModel().getAllComponents();
		
		HashSet<String> componentNames = new HashSet<String>();
		for (MindAdl component : components)
			componentNames.add(component.getQualifiedName());
		// -- 
		
		// if already a FQN, so simple...
		if (componentNames.contains(partialName)){
			FQN = partialName;
		} 
		// else trying to find a concatenation with an import
		else {		
			// Imports
			Collection<String> imports = FractalUtil.getDeclaredImports((AdlDefinition) architectureDefinition.eContainer());
			//adding package name of architecture
			imports.add(FractalUtil.getPackageNameFromFQN(architectureDefinition.getName()));
			
			for (String iImport : imports){
				// when component is directly import
				if (iImport.endsWith(partialName))
					FQN = iImport;
				// when 'import package' + 'partial name' exist into component list
				if (componentNames.contains(iImport + "." + partialName))
					FQN = iImport + "." + partialName;
			}
		}
		
		
		return FQN;
	}

	/**
	 * Get list of imports declared for an Adl definition
	 * 
	 * @param definition
	 *            - Adl definition with declared imports
	 * @return imports list for this definition
	 */

	public static Collection<String> getDeclaredImports(AdlDefinition definition) {

		ArrayList<String> list = new ArrayList<String>();
		
		// Add imports names to the returned list
		for (ImportDefinition importDefinition : definition.getImports()) {
			list.add(FractalUtil.getImportPackageName(importDefinition));
		}

		return list;

	}
	
	/**
	 * 
	 * Get the architecture definition from a child
	 * 
	 * @param eObject
	 * @return
	 */
	public static ArchitectureDefinition getArchitecureDefinitionFromChild(EObject eObject){
		// -- We get the architecture definition component in order to use isValidDefinitionForMerge
		while (! ( 
					(eObject instanceof CompositeComponentDefinitionCustomImpl) ||
					(eObject instanceof PrimitiveComponentDefinitionCustomImpl) || 
					(eObject instanceof ComponentTypeDefinitionCustomImpl)
			) ){
			try {
				eObject = eObject.eContainer();
			} catch (Exception e) {
				// shouldn't occur so
				// nothing to do here
				return null;
			}			
		}		
		ArchitectureDefinition architectureDefinition = (ArchitectureDefinition) eObject;
		// --
		
		return architectureDefinition;
	}
}
