package org.ow2.mindEd.adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.custom.util.AdlMergeUtilTrace.MessageTypes;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
/**
 * <b>Class</b> <i>DefinitionLoaderUtil</i>
 * <p>
 * This class util is used to managed loads of definition from a definition name.
 * 
 * @author proustr
 * @model kind="Loader util"
 */
public class DefinitionLoaderUtil {
	protected final static AdlPackage adlPackage = AdlPackage.eINSTANCE;
	protected final static AdlFactory adlFactory = adlPackage.getAdlFactory();
	private static ResourceSet rs = new ResourceSetImpl();
	private HashMap<String, URI> loadedDefinitions = new HashMap<String, URI>();
	private AdlMergeUtilTrace logger = AdlMergeUtilTrace.getInstance();

	protected DefinitionLoaderUtil() {
	}

	/**
	 * <b>Method</b> <i>loadDefinition</i>
	 * <p>
	 * This method loads a definition in a new resource for class resourceSet.
	 * 
	 * @param definitionCall
	 *            : Definition name to load.
	 * @param importsList
	 *            : Imports to use to load definition.
	 * @return the loaded definition.
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinition loadDefinition(String definitionCall, ArrayList<String> importsList) {
		definitionCall = definitionCall.trim();
		if (definitionCall == null || definitionCall == "") return null;
		logger.log(definitionCall, "Loading request", MessageTypes.LOADER, false, true, false, false);
		ArchitectureDefinition definition = null;

		definition = alreadyLoaded(definitionCall);
		if (definition == null) {
			URI resourceURI = getResourcePath(definitionCall, importsList);
			if (resourceURI != null) {
				addLoadedDefinition(definitionCall, resourceURI);
			}
			Resource resource = null;
			if (resourceURI != null) {
				try {
					resource = rs.getResource(resourceURI, true);
					resource.eSetDeliver(false);
					definition = getResourceDefinition(resource);
				}
				catch (Exception exception) {
					logger.log(definitionCall, "Impossible to find resource " + resourceURI.path()
							+ ". Please, check imports.", MessageTypes.LOADER, true, false, true, false);
					unloadDefinition(definitionCall);
					exception = null;
					return null;
				}
				if (definition == null) {
					logger.log(definitionCall, "Impossible to find resource " + resourceURI.path()
							+ ". Please, check imports.", MessageTypes.LOADER, true, false, true, false);
					unloadDefinition(definitionCall);
				}
				else
					logger.log(definitionCall, "Load successfully done : " + definition.getName(),
							MessageTypes.SUCCESS, false, false, true, false);
			}
			else
				logger.log(definitionCall, "Load failed, no resource URI found.", MessageTypes.ERROR, false, false,
						true, false);
		}
		return definition;
	}

	public void computeEditorInput(String definitionCall, ArrayList<String> importsList)
	{
		URI resourceURI = getResourcePath(definitionCall, importsList);
		if (resourceURI != null) {
			IFile fileDef = ModelToProjectUtil.INSTANCE.getIFile(resourceURI);
			if(fileDef!=null)
			{
				IEditorInput fileInput = new FileEditorInput(fileDef);
				if(fileInput!=null)
				{
					ModelToProjectUtil.INSTANCE.setEditorInput(fileInput);
				}
			}
		}
	}
	
	/**
	 * <b>Method</b> <i>unloadDefinition</i>
	 * <p>
	 * Unload a definition from given definition name.
	 * 
	 * @param definitionCall
	 *            : definition name to unload.
	 * 
	 * @author proustr
	 */
	public void unloadDefinition(String definitionCall) {
		if (definitionCall != null && definitionCall != "") {
			logger.log(definitionCall, "Unloading request : " + definitionCall, MessageTypes.LOADER, false, true,
					false, false);
			URI resourceURI = getLoadedDefinitionURI(definitionCall);
			for (Resource res : rs.getResources()) {
				if (res.getURI() == resourceURI) {
					res.getErrors().clear();
					rs.getResources().remove(res);
					removeLoadedDefinition(definitionCall);
					logger.log(definitionCall, "Resource successfully unloaded", MessageTypes.SUCCESS, false, false,
							true, false);
					return;
				}
			}
			logger.log(definitionCall, "Resource to unload not found", MessageTypes.ERROR, false, false, true, false);
		}
	}
	
	/**
	 * <b>Method</b> <i>getResourcePath</i>
	 * <p>
	 * This method recovers the URI of a definition from its name.
	 * 
	 * @param definitionCall
	 *            : definition name
	 * @param importsList
	 *            : Imports list
	 * @return the URI of associated definition file
	 * <pre>
   *   platform:/resource/project-name/path</pre>
	 * @author proustr
	 */
	public URI getResourcePath(String definitionCall, ArrayList<String> importsList) {
		URI resourceURI = ModelToProjectUtil.INSTANCE.resolveAdl(definitionCall, importsList);
		return resourceURI;
	}

	public URI getLoadedDefinitionURI(String definitionName) {
		return (URI) loadedDefinitions.get(definitionName);
	}

	/**
	 * <b>Method</b> <i>addLoadedDefinition</i>
	 * <p>
	 * Register a definition name and its associated URI to the map loadedDefinitions
	 * 
	 * @param definitionName
	 *            : loaded definition name
	 * @param definitionURI
	 *            : URI of loaded definition
	 * 
	 * @author proustr
	 */
	protected void addLoadedDefinition(String definitionName, URI definitionURI) {
		loadedDefinitions.put(definitionName, definitionURI);
	}

	/**
	 * <b>Method</b> <i>removeLoadedDefinition</i>
	 * <p>
	 * Remove a definition from the registering map loadedDefinitions with its name.
	 * 
	 * @param definitionName
	 *            : Name of the definition to remove from the map.
	 * 
	 * @author proustr
	 */
	protected void removeLoadedDefinition(String definitionName) {
		loadedDefinitions.remove(definitionName);
	}

	/**
	 * <b>Method</b> <i>getResourceDefinition</i>
	 * <p>
	 * This method returns the main definition of a given resource.
	 * 
	 * @param resource
	 *            : resource to extract main definition from.
	 * @return
	 * 
	 * @author proustr
	 */
	protected ArchitectureDefinition getResourceDefinition(Resource resource) {
		if (resource == null) return null;
		for (EObject object : resource.getContents()) {
			if (object instanceof AdlDefinition) {
				AdlDefinition adldefinition = (AdlDefinition) object;
				return adldefinition.getArchitecturedefinition();
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>alreadyLoaded</i>
	 * <p>
	 * Checks if the definition has already been loaded then returns it, else return null.
	 * 
	 * @param definitionCall
	 *            : name of the searched definition.
	 * @return definition corresponding to given definitioncall if found, else null.
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinition alreadyLoaded(String definitionCall) {
		if (definitionCall == null || definitionCall == ""
				|| definitionCall == adlPackage.getComponentReference_ReferenceName().getDefaultValue()) return null;
		definitionCall = definitionCall.trim();
		ArchitectureDefinition definition = null;
		for (Resource resource : rs.getResources()) {
			definition = getResourceDefinition(resource);
			if (definition != null) {
				if (definitionCall.equalsIgnoreCase(definition.getName())) {
					logger.log(definitionCall, "Definition already loaded", MessageTypes.LOADER, false, false, false,
							false);
					return definition;
				}
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>unloadDefinitionAll</i>
	 * <p>
	 * Unloading all registered definitions.
	 * 
	 * @author proustr
	 */
	public void unloadDefinitionAll() {
		Iterator<Resource> iterator = rs.getResources().iterator();
		while (iterator.hasNext()) {
			Resource res = iterator.next();
			if (loadedDefinitions.containsValue(res.getURI())) {
				res.getErrors().clear();
				iterator.remove();
			}
		}
		loadedDefinitions.clear();
	}

	/**
	 * <b>Method</b> <i>getCurrentDefinition</i>
	 * <p>
	 * This method gets the current main definition in editing domain.
	 * 
	 * @return The main de finition of the first resource in resourceset.
	 * 
	 * @author proustr
	 */
	public AdlDefinition getCurrentDefinition() {
		if (rs != null && !rs.getResources().isEmpty()) return (AdlDefinition) rs.getResources().get(0);
		else
			return null;
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * This class provides static access.
	 * 
	 * @author proustr
	 * @model kind="custom implementation"
	 */
	private static class SingletonHolder {
		private static DefinitionLoaderUtil instance = new DefinitionLoaderUtil();
	}

	public static DefinitionLoaderUtil getInstance() {
		return SingletonHolder.instance;
	}
}
