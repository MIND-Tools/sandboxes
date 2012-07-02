package org.ow2.mindEd.adl.textual.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

public class CustomXtextEditor extends XtextEditor {
	
	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		super.doSetInput(input);
	}

}
