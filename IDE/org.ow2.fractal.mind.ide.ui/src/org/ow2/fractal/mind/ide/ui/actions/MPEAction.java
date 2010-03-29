/**
 * 
 */
package org.ow2.fractal.mind.ide.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.ui.properties.MpeMindPathModel;

/**
 * Default class for MPE action.
 *
 */
public class MPEAction extends Action {
	protected Shell _shell;
	protected MindProject _p;
	protected MpeMindPathModel _model;

	public MPEAction(String text, ImageDescriptor image, Shell shell, MindProject p, MpeMindPathModel model) {
		super(text, image);
		_shell = shell;
		_p = p;
		_model = model;
	}
	
	protected Shell getShell() {
		return _shell;
	}
}