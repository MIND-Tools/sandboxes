package org.ow2.mindEd.adl.custom.provider;

import org.eclipse.emf.common.notify.Adapter;

import org.ow2.mindEd.adl.provider.AdlItemProviderAdapterFactory;

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
	
	@Override
	public Adapter createInterfaceDefinitionAdapter() {
		if (interfaceDefinitionItemProvider == null) {
			interfaceDefinitionItemProvider = new InterfaceDefinitionCustomItemProvider(this);
		}

		return interfaceDefinitionItemProvider;
	}

}
