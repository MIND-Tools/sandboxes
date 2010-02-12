/**
 * 
 */
package org.ow2.fractal.mind.ide.ui.actions;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.widgets.Shell;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.provider.MindIDEEditPlugin;
import org.ow2.fractal.mind.ide.ui.properties.MindMPETreeViewer;
import org.ow2.fractal.mind.ide.ui.properties.MpeMindPathModel;

/**
 * It's an action which create a mind path entry of kind application.
 */
public final class MPENewApplicationAction extends MPEAction {
	
	public MPENewApplicationAction(Shell shell, MindProject p, MpeMindPathModel model) {
		super("New application", ExtendedImageRegistry.getInstance().getImageDescriptor(
				MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindApplication-mpe")), shell, p, model);
	}

	@Override
	public void run() {
		MindMPETreeViewer.createOrEditApplication(getShell(), _p, null, _model);
	}
}