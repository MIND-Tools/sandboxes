package org.ow2.mindEd.adl.custom.provider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.ow2.mindEd.adl.custom.descriptor.ListPropertyDescriptor;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.provider.AdlDefinitionItemProvider;


public class AdlDefinitionCustomItemProvider extends AdlDefinitionItemProvider {

	public AdlDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	
	@Override
	protected void addImportsPropertyDescriptor(Object object) {
		// Add a ListPropertyDescriptor to get a combobox with a selection of ImportDefinition
		itemPropertyDescriptors.add
			(new ListPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdlDefinition_imports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdlDefinition_imports_feature", "_UI_AdlDefinition_type"),
				 AdlPackage.Literals.ADL_DEFINITION__IMPORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	

}
