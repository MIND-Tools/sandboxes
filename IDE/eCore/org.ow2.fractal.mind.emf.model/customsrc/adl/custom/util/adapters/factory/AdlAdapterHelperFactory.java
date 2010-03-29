package adl.custom.util.adapters.factory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import adl.AdlDefinition;
import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.ComponentReference;
import adl.ComponentTypeDefinition;
import adl.CompositeComponentDefinition;
import adl.CompositeReferenceDefinition;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveReferenceDefinition;
import adl.SubComponentDefinition;
import adl.TypeReferenceDefinition;
import adl.helpers.AdlDefinitionHelper;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.BindingDefinitionHelper;
import adl.helpers.ComponentReferenceHelper;
import adl.helpers.CompositeComponentHelper;
import adl.helpers.HelperAdapter;
import adl.helpers.IHelper;
import adl.util.AdlAdapterFactory;
import adl.util.AdlSwitch;

/**
 * <b>Class</b> <i>AdlAdapterHelperFactory</i>
 * <p>
 * This class creates defined helper in modelswitch for given class.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.util.adapters.factory.AdlAdapterHelperFactory# <em></em>}</li>
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

	/**
	 * Get the helper associated to the eObject. If the eObject doesn't have a helper yet, a new one is created if it is possible.
	 * 
	 * @param eObject
	 *            the e object
	 * 
	 * @return the helper<?>
	 */
	public IHelper<?> adapt(EObject eObject) {
		return null;
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

	};
}
