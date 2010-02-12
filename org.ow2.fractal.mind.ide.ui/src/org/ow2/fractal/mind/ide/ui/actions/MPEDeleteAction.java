/**
 * 
 */
package org.ow2.fractal.mind.ide.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.ui.Activator;
import org.ow2.fractal.mind.ide.ui.properties.MpeMindPathModel;

/**
 * It's an action which delete a mind path entry.
 *
 */
public class MPEDeleteAction extends Action  {

	private MindPathEntry _selectedobj;
	protected MpeMindPathModel _model;

	public MPEDeleteAction(MpeMindPathModel model, MindPathEntry selectedobj) {
		super("Delete");
		setDescription("Deletes the selected entry");

		ISharedImages workbenchImages = Activator.getDefault().getWorkbench().getSharedImages();
		setDisabledImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
		setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		setHoverImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
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