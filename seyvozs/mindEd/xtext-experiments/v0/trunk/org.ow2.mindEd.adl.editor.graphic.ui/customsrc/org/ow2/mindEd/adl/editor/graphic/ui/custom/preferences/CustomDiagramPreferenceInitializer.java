package org.ow2.mindEd.adl.editor.graphic.ui.custom.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.ow2.mindEd.adl.editor.graphic.ui.preferences.DiagramAppearancePreferencePage;
import org.ow2.mindEd.adl.editor.graphic.ui.preferences.DiagramPreferenceInitializer;
import org.ow2.mindEd.adl.editor.graphic.ui.preferences.DiagramPrintingPreferencePage;
import org.ow2.mindEd.adl.editor.graphic.ui.preferences.DiagramRulersAndGridPreferencePage;

/**
 * To implement custom preference pages
 * @author maroto
 *
 */
public class CustomDiagramPreferenceInitializer extends
		DiagramPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		// Custom general preference page
		CustomGeneralPreferencePage.initDefaults(store);
		DiagramAppearancePreferencePage.initDefaults(store);
		CustomDiagramConnectionsPreferencePage.initDefaults(store);
		DiagramPrintingPreferencePage.initDefaults(store);
		DiagramRulersAndGridPreferencePage.initDefaults(store);
	}

}
