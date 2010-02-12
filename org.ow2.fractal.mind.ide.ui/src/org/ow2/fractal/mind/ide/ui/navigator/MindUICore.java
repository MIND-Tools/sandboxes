package org.ow2.fractal.mind.ide.ui.navigator;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindideItemProviderCustomAdapterFactory;

public class MindUICore {

	private static Object lock = new Object();
	
	private static MindEditingDomain domain ;

	private static ComposedAdapterFactory _mindViewAdapterFactory;

	private static ComposedAdapterFactory _explorerProjectAdapterFactory;
	
	public static ComposedAdapterFactory explorerProjectAdapterFactory() {
		
		synchronized (lock) {
			if (_explorerProjectAdapterFactory != null)
				return _explorerProjectAdapterFactory;
			_explorerProjectAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			_explorerProjectAdapterFactory
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			_explorerProjectAdapterFactory
					.addAdapterFactory(new MindideItemProviderCustomAdapterFactory());
			_explorerProjectAdapterFactory
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			return _explorerProjectAdapterFactory;
		}
	}
	
	public static ComposedAdapterFactory mindViewAdapterFactory() {
		
		synchronized (lock) {
			if (_mindViewAdapterFactory != null)
				return _mindViewAdapterFactory;
			_mindViewAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			_mindViewAdapterFactory
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			_mindViewAdapterFactory
					.addAdapterFactory(new MindideItemProviderCustomAdapterFactory());
			_mindViewAdapterFactory
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			return _mindViewAdapterFactory;
		}
	}
	
	
//	public static EditingDomain getEditingDomain() {
//		
//		synchronized (lock) {
//			if (domain != null) {
//				return domain;
//			}
//			domain = new MindEditingDomain(newAdapterFactory());
//			return domain;
//		}
//	}


	
}
