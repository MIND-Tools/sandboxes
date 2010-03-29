package adl.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class MindNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7034;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MindNavigatorItem) {
			MindNavigatorItem item = (MindNavigatorItem) element;
			return MindVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
