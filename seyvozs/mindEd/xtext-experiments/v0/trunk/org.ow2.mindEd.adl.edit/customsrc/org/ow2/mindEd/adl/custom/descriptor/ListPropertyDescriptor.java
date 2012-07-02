package org.ow2.mindEd.adl.custom.descriptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;

public class ListPropertyDescriptor extends ItemPropertyDescriptor {


	protected int range = 0;
	
	
	@Override
	public Collection<?> getChoiceOfValues(Object object)
	{
		if (feature.equals(AdlPackage.eINSTANCE.getAdlDefinition_Imports()))
			return getSuggestedImports(object);
		else if (feature.equals(AdlPackage.eINSTANCE.getInterfaceDefinition_Signature())) {
			return getSuggestedSignatures(object);
		}
		else 
			return new ArrayList<Object>();
	}
	
	
	@SuppressWarnings("unchecked")
	protected Collection<ImportDefinition> getSuggestedImports(Object object) {		
		Collection<ImportDefinition> oldImports = 
			(Collection<ImportDefinition>) super.getChoiceOfValues(object);
		
		Collection<String> oldDefinitions = new ArrayList<String>();
		for (ImportDefinition importDefinition : oldImports) {
			oldDefinitions.add(importDefinition.getImportName());
		}		
		
		Collection<ImportDefinition> suggestedImports = new ArrayList <ImportDefinition> ();
		
		// Find the list of files in the project to suggest imports
		List<String> definitions = getFilesInProject();
		switch (range) {
			// TODO check range to return different values
			// see https://minalogic.net/tracker/?func=detail&aid=1285&atid=190&group_id=123
		}
		
		// Remove the current definition
		// TODO
		definitions.remove(ModelToProjectUtil.INSTANCE.getCurrentFQN());
		// Remove definitions already added
		definitions.removeAll(oldDefinitions);
		
		for(String definition : definitions) {
			ImportDefinition newImport = 
				AdlPackage.eINSTANCE.getAdlFactory().createImportDefinition();
			newImport.setImportName(definition);
			suggestedImports.add(newImport);
		}
		
		return suggestedImports;
	}
	
	
	protected Collection<String> getSuggestedSignatures(Object object) {
		// Get all .itf in project and MindPath
		List<String> suggestedSignatures = getInterfacesInProject();
		
		// Get imports list
		if (object instanceof EObject) {
			EObject parent = (EObject) object;
			while (parent != null &&
					!(parent instanceof AdlDefinition)) {
				parent = parent.eContainer();
			}
			if (parent != null) {
				// To avoid concurrent modifications
				List<String> toRemove = new ArrayList<String>();
				List<String> toAdd = new ArrayList<String>();
				
				EList<ImportDefinition> imports = ((AdlDefinition)parent).getImports();
				// We can use simple name for all .itf already imported
				// And add it at the beggining of the list
				for (ImportDefinition imp : imports) {
					String name = imp.getImportName();
					for (String signature : suggestedSignatures) {
						if (name.startsWith(signature)) {
							toRemove.add(signature);
							signature = name.substring(name.lastIndexOf(".")+1);
							toAdd.add(0,signature);
						}
					}
				}
				suggestedSignatures.removeAll(toRemove);
				suggestedSignatures.addAll(0, toAdd);
			}
		}
		
		return suggestedSignatures;
	}
	
	protected List<String> getFilesInProject() {
		return ModelToProjectUtil.INSTANCE.getAllFQNAdlInProject();
	}
	
	protected List<String> getInterfacesInProject() {
		return ModelToProjectUtil.INSTANCE.getAllFQNItfInProject();
	}
	
	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, displayName, description, feature);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences) {
		super(adapterFactory, displayName, description, parentReferences);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				category);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable, category);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				category, filterFlags);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable, category, filterFlags);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category, filterFlags);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category, filterFlags);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category, filterFlags);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
	}

	public ListPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}
	
	
	

}
