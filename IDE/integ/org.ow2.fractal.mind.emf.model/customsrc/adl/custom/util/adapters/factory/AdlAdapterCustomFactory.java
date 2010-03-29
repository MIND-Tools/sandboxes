package adl.custom.util.adapters.factory;

import adl.custom.util.adapters.AdlDefinitionAdapter;
import adl.custom.util.adapters.ArchitectureDefinitionAdapter;
import adl.custom.util.adapters.ComponentReferenceAdapter;
import adl.custom.util.adapters.CompositeSubComponentAdapter;
import adl.custom.util.adapters.PrimitiveSubComponentAdapter;
import adl.custom.util.adapters.ReferencesListAdapter;
import adl.util.AdlAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;


public class AdlAdapterCustomFactory extends AdlAdapterFactory{

	@Override
	public Adapter createAdapter(Notifier target) {
		Adapter adapter = modelSwitch.doSwitch((EObject)target);
		if(adapter != null && !target.eAdapters().contains(adapter)){
			target.eAdapters().add(adapter);
		}
		return adapter;
	}

	/**
	 * Gets the single instance of AdapterFactory.
	 * 
	 * @return single instance of AdapterFactory
	 */
	public static AdlAdapterCustomFactory getInstance(){
		return SingletonHolder.instance;
	}
	
	/**
	 * The Class SingletonHolder.
	 */
	private static class SingletonHolder {
		
		/** The instance. */
		private static AdlAdapterCustomFactory instance = new AdlAdapterCustomFactory();
	}

	@Override
	public Adapter createArchitectureDefinitionAdapter() {
		return ArchitectureDefinitionAdapter.getInstance();
	}

	@Override
	public Adapter createAdlDefinitionAdapter() {
		return AdlDefinitionAdapter.getInstance();
	}
	
	@Override
	public Adapter createCompositeComponentDefinitionAdapter() {
		return ArchitectureDefinitionAdapter.getInstance();
	}
	
	@Override
	public Adapter createPrimitiveComponentDefinitionAdapter() {
		return ArchitectureDefinitionAdapter.getInstance();
	}
	
	@Override
	public Adapter createComponentTypeDefinitionAdapter() {
		return ArchitectureDefinitionAdapter.getInstance();
	}

	@Override
	public Adapter createReferencesListAdapter() {
		return ReferencesListAdapter.getInstance();
	}

	@Override
	public Adapter createPrimitiveReferencesListAdapter() {
		return ReferencesListAdapter.getInstance();
	}
	
	@Override
	public Adapter createCompositeReferencesListAdapter() {
		return ReferencesListAdapter.getInstance();
	}
	
	@Override
	public Adapter createTypeReferencesListAdapter() {
		return ReferencesListAdapter.getInstance();
	}
	
	@Override
	public Adapter createCompositeReferenceDefinitionAdapter() {
		return ComponentReferenceAdapter.getInstance();
	}

	@Override
	public Adapter createPrimitiveReferenceDefinitionAdapter() {
		return ComponentReferenceAdapter.getInstance();
	}

	@Override
	public Adapter createTypeReferenceDefinitionAdapter() {
		return ComponentReferenceAdapter.getInstance();
	}	
	
	@Override
	public Adapter createCompositeSubComponentAdapter() {
		return CompositeSubComponentAdapter.getInstance();
	}
	
	@Override
	public Adapter createCompositeAnonymousSubComponentAdapter() {
		return CompositeSubComponentAdapter.getInstance();
	}

	@Override
	public Adapter createPrimitiveSubComponentAdapter() {
		return CompositeSubComponentAdapter.getInstance();
	}
	
	@Override
	public Adapter createPrimitiveAnonymousSubComponentAdapter() {
		return CompositeSubComponentAdapter.getInstance();
	}
	
/*	@Override
	public Adapter createComponentReferenceAdapter() {
		return null;
	}


	@Override
	public Adapter createPrimitiveReferenceDefinitionAdapter() {
		return PrimitiveComponentReferenceAdapter.getInstance();
	}

	@Override
	public Adapter createTypeReferenceDefinitionAdapter() {
		return null;
	}*/
	
	
}
