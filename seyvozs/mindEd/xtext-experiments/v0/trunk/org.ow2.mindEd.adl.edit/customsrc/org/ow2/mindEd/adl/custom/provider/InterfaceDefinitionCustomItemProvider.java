package org.ow2.mindEd.adl.custom.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.ow2.mindEd.adl.custom.descriptor.ListPropertyDescriptor;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.provider.InterfaceDefinitionItemProvider;

public class InterfaceDefinitionCustomItemProvider extends
		InterfaceDefinitionItemProvider {

	public InterfaceDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	protected void addSignaturePropertyDescriptor(Object object) {
		// Add a ListPropertyDescriptor to get a combobox with a selection of Signature
		itemPropertyDescriptors.add
			(new ListPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceDefinition_signature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceDefinition_signature_feature", "_UI_InterfaceDefinition_type"),
				 AdlPackage.Literals.INTERFACE_DEFINITION__SIGNATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

}
