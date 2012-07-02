package org.ow2.mindEd.adl.custom.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.ow2.mindEd.adl.provider.BindingDefinitionItemProvider;

public class BindingDefinitionCustomItemProvider extends
		BindingDefinitionItemProvider {

	public BindingDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			final List<IItemPropertyDescriptor> descriptorsList = super.getPropertyDescriptors(object);
			List<IItemPropertyDescriptor> descriptorsToRemove = new ArrayList<IItemPropertyDescriptor>();
			
			//interfaceSourceName and interfaceTargetName are derived attributes
			//We don't want them to appear in the property view
			//So remove them from the itemPropertyDescriptors
			for (IItemPropertyDescriptor descriptor : descriptorsList) {
				EStructuralFeatureImpl feature = (EStructuralFeatureImpl) descriptor.getFeature(object);
				if (feature.getName() == "interfaceSourceName" ||
						feature.getName() == "interfaceTargetName") {
					//Removing here generate a conflict
					//Remember the object to remove it later
					descriptorsToRemove.add(descriptor);
				}
			}
			
			//Remove found descriptors from the property view
			for (IItemPropertyDescriptor descriptor : descriptorsToRemove) {
				itemPropertyDescriptors.remove(descriptor);
			}
			
		}
		return itemPropertyDescriptors;
	}

}
