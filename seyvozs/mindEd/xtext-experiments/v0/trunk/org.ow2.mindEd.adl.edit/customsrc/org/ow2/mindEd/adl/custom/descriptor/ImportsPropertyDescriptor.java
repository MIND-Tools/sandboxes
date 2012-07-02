package org.ow2.mindEd.adl.custom.descriptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ImportDefinition;

public class ImportsPropertyDescriptor extends ItemPropertyDescriptor {


	protected int range = 0;
	
	
	@Override
	public Collection<ImportDefinition> getChoiceOfValues(Object object)
	{		
		switch (range) {
		case 0 :
			return getFilesInProject(object);
		default :
			return getFilesInProject(object);
			// TODO other modes
		}
	}
	
	@SuppressWarnings("unchecked")
	protected Collection<ImportDefinition> getFilesInProject(Object object) {
		Collection<ImportDefinition> oldImports = 
			(Collection<ImportDefinition>) super.getChoiceOfValues(object);
		
		Collection<String> oldDefinitions = new ArrayList<String>();
		for (ImportDefinition importDefinition : oldImports) {
			oldDefinitions.add(importDefinition.getImportName());
		}		
		
		Collection<ImportDefinition> suggestedImports = new ArrayList <ImportDefinition> ();
		
		// Find the list of files in the project to suggest imports
		List<String> definitions = ModelToProjectUtil.INSTANCE.getAllFQNAdlInProject();
		
		// Remove the current definition (TODO)
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
	
	
	
	
	
	
	
	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, displayName, description, feature);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences) {
		super(adapterFactory, displayName, description, parentReferences);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				category);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable, category);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				category, filterFlags);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable, category, filterFlags);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category, filterFlags);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category, filterFlags);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category, filterFlags);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
	}

	public ImportsPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}
	
	
	

}
