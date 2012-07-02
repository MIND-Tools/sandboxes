package org.ow2.mindEd.ide.ui.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.preferences.PreferenceConstants;

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
		addField(new StringFieldEditor(PreferenceConstants.P_MINDC_MAIN_CLASS, 
				"&Mindc main class:", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}