package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.runtime.IPath;

@SuppressWarnings("restriction")
public class ExistingFolder extends Folder{

	public ExistingFolder(IPath path, Workspace container) {
		super(path, container);
	}
}
