package adl.custom.util.adapters.factory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ComponentTypeDefinition;
import adl.CompositeAnonymousSubComponent;
import adl.CompositeComponentDefinition;
import adl.CompositeReferenceDefinition;
import adl.CompositeSubComponent;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveReferenceDefinition;
import adl.PrimitiveSubComponent;
import adl.SubComponentDefinition;
import adl.TypeReferenceDefinition;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.ComponentReferenceHelper;
import adl.helpers.CompositeComponentHelper;
import adl.helpers.HelperAdapter;
import adl.helpers.IHelper;
import adl.util.AdlAdapterFactory;
import adl.util.AdlSwitch;

public class AdlAdapterHelperFactory extends AdlAdapterFactory {

	@Override
	public Adapter createAdapter(Notifier target) {
		Adapter adapter = modelSwitch.doSwitch((EObject)target);
		if(adapter != null && !target.eAdapters().contains(adapter)){
			target.eAdapters().add(adapter);
		}
		return adapter;
	}

	/**
	 * Instantiates a new helper adapter factory.
	 */
	private AdlAdapterHelperFactory(){	
	}
	
	/**
	 * Gets the single instance of HelperAdapterFactory.
	 * 
	 * @return single instance of HelperAdapterFactory
	 */
	public static AdlAdapterHelperFactory getInstance(){
		return SingletonHolder.instance;
	}
	
	/**
	 * The Class SingletonHolder.
	 */
	private static class SingletonHolder {
		
		/** The instance. */
		private static AdlAdapterHelperFactory instance = new AdlAdapterHelperFactory();
	}
	
	
	public ComponentReferenceHelper createComponentReferenceHelper(ComponentReference reference) {
		return new ComponentReferenceHelper(reference);
	}

	public ArchitectureDefinitionHelper createArchitectureDefinitionHelper(ArchitectureDefinition definition) {
		return new ArchitectureDefinitionHelper(definition);
	}
	
	public CompositeComponentHelper createCompositeComponentHelper(ArchitectureDefinition definition) {
		return new CompositeComponentHelper(definition);
	}
	
	public CompositeComponentHelper createCompositeSubComponentHelper(ArchitectureDefinition definition) {
		return new CompositeComponentHelper(definition);
	}
	
	
	/**
	 * Get the helper associated to the eObject.
	 * If the eObject doesn't have a helper yet, a new one is created 
	 * if it is possible.
	 * 
	 * @param eObject the e object
	 * 
	 * @return the helper<?>
	 */
	public IHelper<?> adapt(EObject eObject)
	{
/*		int id = eObject.eClass().getClassifierID();
		Adapter adapter = null;
		
		switch(id){
			case AdlPackage.ADL_DEFINITION:
				adapter = adapt(eObject,IHelper.class);
				break;
		}
		
		if(adapter == null){
			return null;	
		} 
		
		return (IHelper<?>)adapter; */
		return null;
	}

	/** The model switch. */
	protected AdlSwitch<HelperAdapter<?>> modelSwitch =
		new AdlSwitch<HelperAdapter<?>>() {
			
			public HelperAdapter<?> caseArchitectureDefinition(ArchitectureDefinition object) {
				return createArchitectureDefinitionHelper(object);
			}
			
			public HelperAdapter<?> caseCompositeComponentDefinition(CompositeComponentDefinition object) {
				return createArchitectureDefinitionHelper(object);
			}
			
			public HelperAdapter<?> casePrimitiveComponentDefinition(PrimitiveComponentDefinition object) {
				return createArchitectureDefinitionHelper(object);
			}

			public HelperAdapter<?> caseCompositeSubComponent(CompositeSubComponent object) {
				return createArchitectureDefinitionHelper(object);
			}
			
			public HelperAdapter<?> caseCompositeAnonymousSubComponent(CompositeAnonymousSubComponent object) {
				return createArchitectureDefinitionHelper(object);
			}
			
			public HelperAdapter<?> casePrimitiveSubComponent(PrimitiveSubComponent object) {
				return createArchitectureDefinitionHelper(object);
			}
			
			public HelperAdapter<?> caseComponentTypeDefinition(ComponentTypeDefinition object) {
				return createArchitectureDefinitionHelper(object);
			}

			public HelperAdapter<?> casePrimitiveReferenceDefinition(PrimitiveReferenceDefinition object) {
				return createComponentReferenceHelper(object);
			}

			public HelperAdapter<?> caseCompositeReferenceDefinition(CompositeReferenceDefinition object) {
				return createComponentReferenceHelper(object);
			}

			public HelperAdapter<?> caseTypeReferenceDefinition(TypeReferenceDefinition object) {
				return createComponentReferenceHelper(object);
			}

			public HelperAdapter<?> caseComponentReference(ComponentReference object) {
				return createComponentReferenceHelper(object);
			}
	};
}
