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
 * It's an action which create a mind path entry of kind project reference.
 */
public final class MPENewReferenceProject extends MPEAction {
	public MPENewReferenceProject(Shell shell, MindProject p, MpeMindPathModel model) {
		super("New reference project", ExtendedImageRegistry.getInstance().getImageDescriptor(
				MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindProject-mpe")), shell, p, model);
	}

	@Override
	public void run() {
		MindMPETreeViewer.createOrEditProjectRefence(_shell, _p, null, _model);
	}
}