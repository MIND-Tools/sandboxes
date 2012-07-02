package org.ow2.mindEd.adl.custom.adapters.factory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.BindingDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.ComponentTypeDefinition;
import org.ow2.mindEd.adl.CompositeComponentDefinition;
import org.ow2.mindEd.adl.CompositeReferenceDefinition;
import org.ow2.mindEd.adl.PrimitiveComponentDefinition;
import org.ow2.mindEd.adl.PrimitiveReferenceDefinition;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.TypeReferenceDefinition;
import org.ow2.mindEd.adl.custom.helpers.AdlDefinitionHelper;
import org.ow2.mindEd.adl.custom.helpers.ArchitectureDefinitionHelper;
import org.ow2.mindEd.adl.custom.helpers.BindingDefinitionHelper;
import org.ow2.mindEd.adl.custom.helpers.ComponentReferenceHelper;
import org.ow2.mindEd.adl.custom.helpers.CompositeComponentHelper;
import org.ow2.mindEd.adl.custom.helpers.DefaultHelper;
import org.ow2.mindEd.adl.custom.helpers.HelperAdapter;
import org.ow2.mindEd.adl.custom.helpers.IHelper;
import org.ow2.mindEd.adl.util.AdlAdapterFactory;
import org.ow2.mindEd.adl.util.AdlSwitch;

/**
 * <b>Class</b> <i>AdlAdapterHelperFactory</i>
 * <p>
 * This class creates defined helper in modelswitch for given class.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.util.adapters.factory.AdlAdapterHelperFactory# <em></em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends
 */
public class AdlAdapterHelperFactory extends AdlAdapterFactory {

	@Override
	public Adapter createAdapter(Notifier target) {
		Adapter adapter = modelSwitch.doSwitch((EObject) target);
		if (adapter != null && !target.eAdapters().contains(adapter)) {
			target.eAdapters().add(adapter);
		}
		return adapter;
	}

	/**
	 * Instantiates a new helper adapter factory.
	 */
	private AdlAdapterHelperFactory() {
	}

	/**
	 * Gets the single instance of HelperAdapterFactory.
	 * 
	 * @return single instance of HelperAdapterFactory
	 */
	public static AdlAdapterHelperFactory getInstance() {
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

	public BindingDefinitionHelper createBindingDefinitionHelper(BindingDefinition binding) {
		return new BindingDefinitionHelper(binding);
	}

	public AdlDefinitionHelper createAdlDefinitionHelper(AdlDefinition definition) {
		return new AdlDefinitionHelper(definition);
	}
	
	private HelperAdapter<?> createDefaultCase(EObject object) {
		return new DefaultHelper(object);
	}

	/**
	 * Get the helper associated to the eObject. If the eObject doesn't have a helper yet, a new one is created if it is possible.
	 * 
	 * @param eObject
	 *            the e object
	 * 
	 * @return the helper<?>
	 */
	public IHelper<?> adapt(EObject eObject) {
		IHelper<?> adapter = modelSwitch.doSwitch((EObject) eObject);
		return adapter;
	}

	/** The model switch. */
	protected AdlSwitch<HelperAdapter<?>> modelSwitch = new AdlSwitch<HelperAdapter<?>>() {

		public HelperAdapter<?> caseArchitectureDefinition(ArchitectureDefinition object) {
			return createArchitectureDefinitionHelper(object);
		}

		public HelperAdapter<?> caseCompositeComponentDefinition(CompositeComponentDefinition object) {
			return createArchitectureDefinitionHelper(object);
		}

		public HelperAdapter<?> casePrimitiveComponentDefinition(PrimitiveComponentDefinition object) {
			return createArchitectureDefinitionHelper(object);
		}

		public HelperAdapter<?> caseSubComponentDefinition(SubComponentDefinition object) {
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

		public HelperAdapter<?> caseBindingDefinition(BindingDefinition object) {
			return createBindingDefinitionHelper(object);
		}

		public HelperAdapter<?> caseAdlDefinition(AdlDefinition object) {
			return createAdlDefinitionHelper(object);
		}

		public HelperAdapter<?> defaultCase(EObject object) {
			return createDefaultCase(object);
		}
		
	};
}
