package adl.helpers;

import org.eclipse.emf.common.util.URI;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;

import adl.ComponentReference;
import adl.custom.util.AdlMergeUtil;

/** <b>Class</b> <i>ComponentReferenceHelper</i><p>
 * A helper class to associate with component references. Provides specific methods for component references objects.
 * 
 * @author proustr
 * @model kind="Helper"
 * @extends HelperAdapter
 */
public class ComponentReferenceHelper extends HelperAdapter<ComponentReference> {
	/**
	 * AdlMergeUtil mergeUtil : Instantiation of a MergeUtil used to recover imports
	 * 
	 */
	private AdlMergeUtil mergeUtil = AdlMergeUtil.getInstance();

	public ComponentReferenceHelper(ComponentReference t) {
		super(t);
	}

	/**
	 * <b>Method</b> <i>getNameFQN</i>
	 * <p>
	 * This method returns the fully qualified name of the current reference.
	 * 
	 * @return Fully qualified name of reference associated to this helper.
	 * 
	 * @author proustr
	 */
	public String getNameFQN() {
		URI tmpName = null;
		tmpName = ModelToProjectUtil.INSTANCE.resolveAdl(getObject().getReferenceName(), mergeUtil
				.recoverImports(getObject()));
		String tmpString = ModelToProjectUtil.INSTANCE.getFQNFromURI(tmpName);
		if (tmpName == null) return getObject().getReferenceName();
		else
			return tmpString;
	}

}
