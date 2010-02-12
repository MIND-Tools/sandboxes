package adl.custom.provider;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import adl.custom.descriptor.ImportsPropertyDescriptor;
import adl.provider.AdlDefinitionItemProvider;


public class AdlDefinitionCustomItemProvider extends AdlDefinitionItemProvider {

	public AdlDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			for (int i = 0; i < itemPropertyDescriptors.size(); i++) {
				IItemPropertyDescriptor descriptor = itemPropertyDescriptors.get(i);
				if (descriptor.getDisplayName(object) == getString("_UI_AdlDefinition_imports_feature"))
				itemPropertyDescriptors.remove(i);
			}
			
			addImportsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	   * Creates an instance that uses a resource locator; indicates whether to be multi-line and to sort choices; specifies
	   * a  static image, a category, and filter flags; and determines the cell editor from the type of the structural feature. 
	   * If the property is the imports list, returns the custom descriptor.
	   */
	  protected ItemPropertyDescriptor createItemPropertyDescriptor(
	    AdapterFactory adapterFactory,
	    ResourceLocator resourceLocator,
	    String displayName,
	    String description,
	    EStructuralFeature feature,
	    boolean isSettable,
	    boolean multiLine,
	    boolean sortChoices,
	    Object staticImage,
	    String category,
	    String[] filterFlags)
	  {
		  if (displayName == getString("_UI_AdlDefinition_imports_feature")) {
			  return new ImportsPropertyDescriptor(
				      adapterFactory,
				      resourceLocator,
				      displayName,
				      description,
				      feature,
				      isSettable,
				      multiLine,
				      sortChoices,
				      staticImage,
				      category,
				      filterFlags);
		  }
		  else {
			  return new ItemPropertyDescriptor(
				      adapterFactory,
				      resourceLocator,
				      displayName,
				      description,
				      feature,
				      isSettable,
				      multiLine,
				      sortChoices,
				      staticImage,
				      category,
				      filterFlags);
		  }
	    
	  }
	

}
