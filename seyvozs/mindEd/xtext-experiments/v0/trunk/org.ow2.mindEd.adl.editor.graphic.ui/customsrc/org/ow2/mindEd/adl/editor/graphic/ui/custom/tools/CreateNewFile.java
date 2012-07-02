package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.runtime.IPath;

@SuppressWarnings("restriction")
public class CreateNewFile extends File{

	public CreateNewFile(IPath path, Workspace container) {
		super(path, container);
	}
}
