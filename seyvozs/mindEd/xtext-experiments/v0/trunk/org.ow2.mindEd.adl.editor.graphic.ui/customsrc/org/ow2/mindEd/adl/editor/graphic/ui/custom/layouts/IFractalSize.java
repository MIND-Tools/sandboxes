package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import org.eclipse.draw2d.geometry.Dimension;

/**
 * Interface pour les constantes de taille, utile surtout pour les layouts
 * @author maroto
 *
 */
public interface IFractalSize {
	// The default size of a list
	public static int MAX_LIST_HEIGHT = 200;
	
	public static int DEFAULT_LABEL_HEIGHT = 16;
	
	public static int ITEM_HEIGHT = DEFAULT_LABEL_HEIGHT;
	
	// The default size of a title label
	public static int TITLE_HEIGHT = 20;
	
	public static int TEMPLATE_HEIGHT = DEFAULT_LABEL_HEIGHT;
	public static int ARGUMENT_HEIGHT = DEFAULT_LABEL_HEIGHT;
	public static int ATTRIBUTE_HEIGHT = TITLE_HEIGHT;
	
	// Component titles maximumSize
	public static Dimension TITLE_MAX_SIZE = new Dimension(5000, TITLE_HEIGHT);
}
