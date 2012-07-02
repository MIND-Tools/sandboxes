package org.ow2.mindEd.adl.editor.graphic.ui.custom.providers;


import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindEditPartProvider;

public class MindCustomEditPartProvider extends MindEditPartProvider {

	/**
	 * Set a custom factory to reference all custom editparts
	 */
	public MindCustomEditPartProvider() {
		setFactory(new MindCustomEditPartFactory());
		setAllowCaching(true);
	}

}
