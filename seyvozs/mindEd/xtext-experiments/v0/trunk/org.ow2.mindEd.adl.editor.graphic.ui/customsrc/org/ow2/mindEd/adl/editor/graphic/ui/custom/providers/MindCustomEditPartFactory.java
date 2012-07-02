package org.ow2.mindEd.adl.editor.graphic.ui.custom.providers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.MindEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindVisualIDRegistry;

/**
 * The custom factory for the custom edit parts<p>
 * This class needs to be maintained in case of a new custom class creation<p>
 * To use the custom factory, you need to adress the custom provider in plugin.xml (in case you deleted it) :
 * extensions > editpartProviders > org.ow2.mindEd.adl.editor.graphic.ui.custom.providers.MindEditPartCustomProvider
 * @author maroto
 *
 */
public class MindCustomEditPartFactory extends MindEditPartFactory {
	
	
	public String CUSTOMEDITPARTS_PACKAGE = "org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.";
	
	
	/**
	 * Overrides createEditPart to return custom edit parts instead of generated edit parts.
	 * Add an entry here to implement a new custom edit part.<p>
	 * Please follow alphabetical order.
	 */
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {

			View view = (View) model;
					
			
			switch (MindVisualIDRegistry.getVisualID(view)) {
			// Here you can implement custom edit parts with
			// names different from [element]CustomEditPart template
			
			// -- Example
//			case AnnotationsListEditPart.VISUAL_ID:
//				return new AnnotationsListCustomEditPart(view);
			}
			
			// Create default edit part
			EditPart generatedEditPart = super.createEditPart(context, model);
			// Using default edit part's name, try to fetch a custom edit part
			// Replace EditPart by CustomEditPart and see in custom edit parts' package
			String simpleName = 
				generatedEditPart.getClass().getSimpleName().replace("EditPart", "CustomEditPart");
			String customPartName = CUSTOMEDITPARTS_PACKAGE.concat(simpleName);
			EditPart customPart = getCustomEditPart(customPartName,view);
			EditPart part;
			
			if (customPart != null) {
				part = customPart;
			}
			else {
				part =  generatedEditPart;
			}
			
			return part;
		}
		// Not an instance of view, return default implementation
		return super.createEditPart(context, model);
	}
	
	
	/**
	 * Fetch the custom editpart with the right constructor (View)
	 * @param className
	 * @return a new instance of the edit policy
	 */
	@SuppressWarnings("unchecked")
	protected EditPart getCustomEditPart (String className, View view) {
		Class<? extends EditPart> customEditPartClass = null;
		try {
			
			customEditPartClass = (Class<? extends EditPart>) Class.forName(className);
			Constructor<? extends EditPart> constructor = customEditPartClass.getConstructor(View.class);
			EditPart customEditPart = constructor.newInstance(view);
			return customEditPart;
			
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
			MindDiagramEditorPlugin.getInstance().logError("CustomEditPart instantiation error", e);
		} catch (IllegalAccessException e) {
			MindDiagramEditorPlugin.getInstance().logError("Illegal access instantiating CustomEditPart", e);
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not an edit part", e);
		} catch (IllegalArgumentException e) {
			MindDiagramEditorPlugin.getInstance().logError("CustomEditPart instantiation error", e);
		} catch (InvocationTargetException e) {
			MindDiagramEditorPlugin.getInstance().logError("CustomEditPart instantiation error", e);
		} catch (SecurityException e) {
			MindDiagramEditorPlugin.getInstance().logError("CustomEditPart instantiation error", e);
		} catch (NoSuchMethodException e) {
			MindDiagramEditorPlugin.getInstance().logError("Constructor not found", e);
		}
				
		return null;
	}
	
	


}
