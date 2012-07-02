package org.ow2.mindEd.adl.editor.graphic.ui.custom.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;
import org.ow2.mindEd.adl.editor.graphic.ui.preferences.DiagramConnectionsPreferencePage;

public class CustomDiagramConnectionsPreferencePage extends
		DiagramConnectionsPreferencePage {
	
	/**
	 * Initializes the default preference values for this preference store.
	 * 
	 * @param preferenceStore
	 *            the preference store
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE,
			Routing.RECTILINEAR);
	}

}
