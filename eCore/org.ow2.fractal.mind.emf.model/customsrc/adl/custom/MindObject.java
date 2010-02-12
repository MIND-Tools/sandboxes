package adl.custom;

import org.eclipse.emf.ecore.EObject;

import adl.helpers.IHelper;

/** <b>Interface</b> <i>MindObject</i><p>
 * This interface describe common specific Mind objects. 
 * All contained features are available for Mind Object from root AdlDefinition.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.custom.MindObject#getAdapter <em>getAdapter</em>}</li>
 * </ul>
 * </p>
 * @author proustr
 * @model kind="interface"
 * @extends EObject
 */

public interface MindObject extends EObject {
	
	Object getAdapter(Class adapter);
}
