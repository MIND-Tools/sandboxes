package org.ow2.fractal.mind.ide.ui.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.ow2.fractal.mind.ide.MindActivator;
import org.ow2.fractal.mind.ide.preferences.PreferenceConstants;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. It's allow setting MIND_ROOT variable.
 */

public class MindcPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	private ScopedPreferenceStore corepreferenceStore;

	public MindcPreferencePage() {
		super(GRID);
		setPreferenceStore(getPreferenceStore());
		setDescription("Choose the mindc location");
	}
	
	@Override
	public IPreferenceStore getPreferenceStore() {
        // Create the preference store lazily.
        if (corepreferenceStore == null) {
        	corepreferenceStore = new ScopedPreferenceStore(new InstanceScope(),MindActivator.ID);

        }
        return corepreferenceStore;
    }
	/**
	 * Creates the field editors.
	 */
	@Override
	public void createFieldEditors() {
		addField(new DirectoryFieldEditor(PreferenceConstants.P_MINDC_LOCATION, 
				"&Mindc location:", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}