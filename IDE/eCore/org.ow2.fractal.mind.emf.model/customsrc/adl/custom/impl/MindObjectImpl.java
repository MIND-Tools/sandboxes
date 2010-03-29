package adl.custom.impl;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.IHelper;

/**
 * <b>Class</b> <i>MindObjectImpl</i>
 * <p>
 * This class implement common methods for all Mind EObjects
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.MindObjectImpl#getAdapter <em>getAdapter</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="implementation"
 * @extends EObject
 */

public class MindObjectImpl extends EObjectImpl {
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		Object object = null;

		if (adapter == IHelper.class || adapter == ArchitectureDefinitionHelper.class) {
			object = AdlAdapterHelperFactory.getInstance().adapt(this);
		}

		return object;
	}

}
