package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.FileCEditPart;


/** 
 * Extends FileCEditPart to implement custom behavior
 * - recognize child's custom edit part
 * @author maroto
 *
 */

public class FileCCustomEditPart extends
		FileCEditPart {
	
	public FileCCustomEditPart(View view) {
		super(view);
	}
	
	
	
	// Test, for future use
//	@Override
//	public void handleNotificationEvent(Notification event) {
//		super.handleNotificationEvent(event);
//		
//		Object shapeModel = getModel();
//		if (shapeModel instanceof ShapeImpl) {
//			EObject model = ((ShapeImpl) shapeModel).getElement();
//			if (model instanceof FileCImpl) {
//				String dir = ((FileCImpl)model).getDirectory();
//				String filename = ((FileCImpl)model).getFileName();
//				
//				IFile fileToEdit = null;
//				if (dir == null) {
//					if (filename != null) {
//						//dir par défaut
//						//TODO choper le path du projet
//						dir = "/test/src/";
//					}
//				}
//				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//				IPath path = new Path(dir+filename);
//				try {
//					fileToEdit = root.getFile(path);
//				}
//				catch (Exception e){
//					System.out.print("Cannot find file " + dir+filename);
//				}
//				
//				if (fileToEdit != null) {
//					IEditorInput editorInput = new FileEditorInput(fileToEdit);
//					IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//					IWorkbenchPage page = window.getActivePage();
//					try {
//						page.openEditor(editorInput, "org.eclipse.ui.DefaultTextEdtior");
//					} catch (PartInitException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		}
//	}

}
