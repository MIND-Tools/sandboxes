package adl.custom.provider;

import org.eclipse.emf.common.notify.Adapter;

import adl.provider.AdlItemProviderAdapterFactory;

public class AdlItemProviderAdapterCustomFactory extends
		AdlItemProviderAdapterFactory {
	
	public AdlItemProviderAdapterCustomFactory() {
		super();
	}

	@Override
	public Adapter createAdlDefinitionAdapter() {
		if (adlDefinitionItemProvider == null) {
			adlDefinitionItemProvider = new AdlDefinitionCustomItemProvider(this);
		}

		return adlDefinitionItemProvider;
	}

}
