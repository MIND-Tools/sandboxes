package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import adl.AdlPackage;
import adl.ImportDefinition;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.AdlDefinitionHelper;
import adl.impl.AdlDefinitionImpl;

/**
 * <b>Class</b> <i>AdlDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class AdlDefinition to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.AdlDefinitionCustomImpl#getHelper <em>getHelper </em>}</li>
 * <li>{@link adl.custom.impl.AdlDefinitionCustomImpl#getImports <em>getImports </em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends AdlDefinitionImpl
 */
public class AdlDefinitionCustomImpl extends AdlDefinitionImpl {

	public AdlDefinitionCustomImpl() {
		super();
		// set the containment to true, for the properties view
		// to properly show imports
		EReference imports = (EReference) eClass().getEStructuralFeature("imports");
		imports.setContainment(true);
		imports.setResolveProxies(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.AdlDefinitionImpl#getImports()
	 */
	@Override
	public EList<ImportDefinition> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ImportDefinition>(ImportDefinition.class, this,
					AdlPackage.ADL_DEFINITION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return BindingDefinitionHelper
	 * 
	 * @author proustr
	 */
	public AdlDefinitionHelper getHelper() {
		AdlDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, AdlDefinitionHelper.class);
		if (helper != null) {
			result = (AdlDefinitionHelper) helper;
		}
		return result;
	}

}
