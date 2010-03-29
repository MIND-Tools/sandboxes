package adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;

public class DefinitionLoaderUtil {
	protected ComposedAdapterFactory adapterFactory;
	protected static AdlPackage adlPackage = AdlPackage.eINSTANCE;
	protected static AdlFactory adlFactory = adlPackage.getAdlFactory();
	private static ResourceSet rs= new ResourceSetImpl();
	
	private HashMap loadedDefinitions = new HashMap();
	
	public DefinitionLoaderUtil(EObject objectToGetDomain) {
	}

	public ArchitectureDefinition loadDefinition(String definitionCall, ArrayList<String> importsList) 
	{
		definitionCall = definitionCall.trim();
		if(definitionCall==null || definitionCall=="") return null;
		String definitionCallName;
		ArchitectureDefinition definition = null;
		definitionCallName = definitionCall;

		for (Resource resource : rs.getResources())
		{
			definition = getResourceDefinition(resource);
			if(definition!=null)
			{
				if(definitionCallName.equalsIgnoreCase(definition.getName()))
				return definition;
			}
		}
		
		URI resourceURI = getResourcePath(definitionCall, importsList);
		Resource resource = null;
		if(resourceURI!=null)
		{
			try
			{
				resource=rs.getResource(resourceURI, true);
			}
			catch(RuntimeException exception)
			{
				System.err.format("Impossible to find resource " + resourceURI.path() + ". Please, check imports.\n");
				unloadDefinition(definitionCall);
				exception = null;
				return null;
			}
			finally{}
			EObject toto;
			definition = getResourceDefinition(resource);
		}
		return definition;

	}
	
	public void unloadDefinition (String definitionCall)
	{
		if(definitionCall!=null && definitionCall!="")
		{
			URI resourceURI = getLoadedDefinitionURI(definitionCall);
			for(Resource res : rs.getResources())  
			{
				if(res.getURI() == resourceURI)
				{
					res.getErrors().clear();
					rs.getResources().remove(res);
					removeLoadedDefinition(definitionCall);
					return;
				}
			}
		}
	}
	
	private URI getResourcePath(String definitionCall, ArrayList<String> importsList) 
	{
		URI resourceURI = ModelToProjectUtil.resolveAdl(definitionCall, importsList);
		if (resourceURI != null) {
			addLoadedDefinition(definitionCall, resourceURI);
		}
		return resourceURI;
	}
	
	private URI getLoadedDefinitionURI (String definitionName) {
		return (URI) loadedDefinitions.get(definitionName); 		
	}
	
	private void addLoadedDefinition (String definitionName, URI definitionURI) {
		 loadedDefinitions.put(definitionName, definitionURI);
	}
	
	private void removeLoadedDefinition (String definitionName) {
		loadedDefinitions.remove(definitionName);
	}
	
	
	private ArchitectureDefinition getResourceDefinition(Resource resource) {
		for(EObject object : resource.getContents())
		{
			if(object instanceof AdlDefinition)
			{
				AdlDefinition adldefinition = (AdlDefinition)object;
				for(ArchitectureDefinition definition : adldefinition.getArchitecturedefinition())
				{
					return definition;
				}
			}
		}
		return null;
	}
}
