package org.ow2.fractal.mind.ide.ui.navigator;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindideItemProviderCustomAdapterFactory;

public class MindUICore {

	private static Object lock = new Object();
	private static ComposedAdapterFactory adapterFactory;

	private static MindEditingDomain domain ;
	
	public static ComposedAdapterFactory getAdapterFactory() {
		
		synchronized (lock) {
			if (adapterFactory != null) {
				return adapterFactory;
			}
			adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			adapterFactory
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new MindideItemProviderCustomAdapterFactory());
			adapterFactory
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			return adapterFactory;
		}
	}
	
	
	public static EditingDomain getEditingDomain() {
		
		synchronized (lock) {
			if (domain != null) {
				return domain;
			}
			domain = new MindEditingDomain(getAdapterFactory());
			return domain;
		}
	}
}
