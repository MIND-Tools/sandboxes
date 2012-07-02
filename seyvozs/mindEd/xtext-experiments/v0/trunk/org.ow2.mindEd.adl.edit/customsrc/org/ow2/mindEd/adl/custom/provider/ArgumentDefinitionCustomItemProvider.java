package org.ow2.mindEd.adl.custom.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.ow2.mindEd.adl.provider.ArgumentDefinitionItemProvider;

public class ArgumentDefinitionCustomItemProvider extends
		ArgumentDefinitionItemProvider {

	public ArgumentDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {

			final List<IItemPropertyDescriptor> descriptorsList = super.getPropertyDescriptors(object);
			List<IItemPropertyDescriptor> descriptorsToRemove = new ArrayList<IItemPropertyDescriptor>();
			
			//ArgumentName is a derived attribute
			//We don't want it to show in the property view
			//So remove it from the itemPropertyDescriptors
			for (IItemPropertyDescriptor descriptor : descriptorsList) {
				EStructuralFeatureImpl feature = (EStructuralFeatureImpl) descriptor.getFeature(object);
				if (feature.getName() == "argumentName") {
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
