package adl.custom.presentation;

import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.IEditorPart;

import adl.AdlPackage;
import adl.custom.provider.AdlItemProviderAdapterCustomFactory;
import adl.presentation.AdlEditor;
import adl.provider.AdlDefinitionItemProvider;
import adl.provider.AdlItemProviderAdapterFactory;

public class AdlCustomEditor extends AdlEditor {

	public AdlCustomEditor() {
		super();
	}
	
	protected void initializeEditingDomain() {
		super.initializeEditingDomain();
		// Replace the item provider adapter factory
		adapterFactory.removeAdapterFactory(
				adapterFactory.getFactoryForType(
						AdlPackage.eINSTANCE
						)
				);
		adapterFactory.addAdapterFactory(new AdlItemProviderAdapterCustomFactory());
	}

}
