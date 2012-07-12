/**
 * 
 */
package org.ow2.mindEd.ide.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.ui.Activator;
import org.ow2.mindEd.ide.ui.properties.MpeMindPathModel;

/**
 * It's an action which delete a mind path entry.
 *
 */
public class MPERemoveAction extends Action  {

	private MindPathEntry _selectedobj;
	protected MpeMindPathModel _model;

	public MPERemoveAction(MpeMindPathModel model, MindPathEntry selectedobj) {
		super("Remove source entry");
		setDescription("Removes the selected entry from classpath");

		ISharedImages workbenchImages = Activator.getDefault().getWorkbench().getSharedImages();
		setDisabledImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_ELCL_REMOVE_DISABLED));
		setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_ELCL_REMOVE));
		setHoverImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_ELCL_REMOVE));
		_model = model;
		_selectedobj = selectedobj;
	}
	
	@Override
	public void run() {
		MindPathEntry mpe = _selectedobj;
		if (mpe != null)
			_model.mpeRemoved(mpe);
	}


}