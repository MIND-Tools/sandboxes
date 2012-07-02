package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.FileC;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;

import org.ow2.mindEd.adl.custom.util.DefinitionLoaderUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.CustomMindDiagramEditorUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindProject;

/**
 * Install this edit policy on a ComponentReference or a FileC to make it
 * open the referenced file (.adl or .c). If you want to install it on another edit part,
 * you may need to implement the open behaviour in getOpenCommand()
 * @author maroto
 *
 */
public class OpenDefinitionEditPolicy extends OpenEditPolicy {
	
	public static final QualifiedName EDITOR_KEY = new QualifiedName(
			"org.eclipse.ui.internal.registry.ResourceEditorRegistry", "EditorProperty");

	public OpenDefinitionEditPolicy() {
		super();
	}

	/**
	 * This method is called by a double-clic on the edit part which
	 * installed this edit policy.<p>
	 * This will open another page with the proper editor, depending on which item
	 * was clicked : <p>
	 * reference -> opens the definition in a diagram editor<p>
	 * FileC -> opens the file in the cdt editor (TODO)
	 */
	@Override
	protected Command getOpenCommand(Request request) {
		EObject model = ((View)getHost().getModel()).getElement();
		// TODO return an open command instead of opening right here
		
		// The item is a reference : try to open the definition in a diagram editor
		if (model instanceof ComponentReference) {
			// Get the referenced component
			String name = ((ComponentReference) model).getReferenceName();
			// Get imports to resolve the reference
			ArrayList<String> importsList = new ArrayList<String>();
			RootEditPart root = getHost().getRoot();
			if (root != null && root.getContents()!=null) {
				View rootView = (View)root.getContents().getModel();
				if (rootView != null) {
					EObject adl = rootView.getElement();
					if (adl != null && adl instanceof AdlDefinition) {
						EList<ImportDefinition> imports = ((AdlDefinition) adl).getImports();
						for (ImportDefinition temp : imports) {
							importsList.add(temp.getImportName());
						}
					}
				}
			}
			
			try {
				// Get the resource by resolving the reference
				//platform:/resource/project-name/path
				URI modelURI = DefinitionLoaderUtil.getInstance().getResourcePath(name,importsList);
				if (modelURI == null) {
					MindDiagramEditorPlugin.getInstance().logError("Reference not found, please check imports");
					return null;
				}
				IFile definition = ModelToProjectUtil.INSTANCE.getIFile(modelURI);
				if (definition == null || !definition.exists()) {
					MindDiagramEditorPlugin.getInstance().logError("Reference not found, please check imports");
					return null;
				}
				IEditorInput adlEditorInput = new FileEditorInput(definition);
				
				// Get the diagram resource
				IFile diagram = definition.getParent().getFile(new Path(definition.getName()+"_diagram"));
				IEditorInput diagramEditorInput = new FileEditorInput(diagram);
				
				// Diagram file doesn't exist, but adl file exists (else modelURI would be null)
				// So create the diagram
				if (!diagramEditorInput.exists()) {
					URI diagramURI = URI.createPlatformResourceURI(diagram.getFullPath().toPortableString(), true);
					CustomMindDiagramEditorUtil.initDiagram(diagramURI, modelURI, new NullProgressMonitor());
				}
				
				// Now try to open the editors
				IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();
				String editorID = definition.getPersistentProperty(EDITOR_KEY);
				if (editorID != null && editorID.equals("org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorID")) {
					page.openEditor(diagramEditorInput, editorID);
				}
				else {
					page.openEditor(adlEditorInput, "org.ow2.mindEd.adl.textual.Fractal");
				}
				
			} catch (PartInitException e) {
				e.printStackTrace();
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor");
			} catch (NullPointerException e) {
				e.printStackTrace();
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor");
			} catch (Exception e) {
				e.printStackTrace();
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor");
			}
		}
			
		if (model instanceof FileC) {
			String directory = ((FileC) model).getDirectory();
			IFile file = null;
			String fileName = ((FileC) model).getFileName();
			if (directory == null || directory == "") {
				
				IEditorInput temp = MindProxyFactory.INSTANCE.getEditorInput();
/*				if(temp instanceof FileEditorInput)
				{
					IFile fileEditor = ((FileEditorInput) temp).getFile();
					IPath path = fileEditor.getFullPath();
					IWorkspace WS = fileEditor.getWorkspace();
					URI uri = URI.createFileURI(bite);
					
					ArrayList<String> importsList = new ArrayList<String>();
					RootEditPart root = getHost().getRoot();
					if (root != null && root.getContents()!=null) {
						View rootView = (View)root.getContents().getModel();
						if (rootView != null) {
							EObject adl = rootView.getElement();
							if (adl != null && adl instanceof AdlDefinition) {
								EList<ImportDefinition> imports = ((AdlDefinition) adl).getImports();
								for (ImportDefinition importDef : imports) {
									importsList.add(importDef.getImportName());
								}
							}
						}
					}
					
					URI temp3 = ModelToProjectUtil.INSTANCE.resolveAdl(uri, "reretest_adl", importsList);
					
					int a = 1;
					a = a * 1;
				}
*/
				
				MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage();
				if (pack != null) {
					IFolder f = MindIdeCore.getResource(pack);
					file = f.getFile(fileName);
				}
			} else {
				File f = new File(directory, fileName);
				
				// SSZ: handle cases in Windows
				//if (f.isAbsolute()) {
				if (directory.startsWith("/")) {
					//IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
					//file = workspace.getRoot().getFileForLocation(new Path(f.getAbsolutePath()));
					URI uri = URI.createPlatformResourceURI(f.getPath(), true);
					MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(uri);
					IFolder f2 = MindIdeCore.getResource(pack);
					file = f2.getFile(fileName);
				} else {
					// SSZ
					// Find the file according to the host component package        		
	        		MindPackage hostComponentPackage = ModelToProjectUtil.INSTANCE.getCurrentPackage();
	        		if (hostComponentPackage != null) {
						IFolder compFolder = MindIdeCore.getResource(hostComponentPackage);
						
						// Don't forget we want to locate the complete folder "container" : add the "/"
						URI compFolderURI = URI.createPlatformResourceURI(compFolder.getFullPath().toString() + "/", true);
						
						URI currentRelativeURI = URI.createFileURI(f.getPath());
						URI resolvedFinalURI = currentRelativeURI.resolve(compFolderURI);
						
						file = ModelToProjectUtil.INSTANCE.getIFile(resolvedFinalURI);
	        		}
				}
			}
			
			try {
				// Get the file URI
				// Create the editor input
				if (file == null || !(file.exists())) {
					MindDiagramEditorPlugin.getInstance().logError("File not found : "+directory+"/"+fileName);
					return null;
				}
				
				IEditorInput cdtEditorInput = new FileEditorInput(file);
				
								
				// Now try to open the editors
				IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();
				page.openEditor(cdtEditorInput, "org.eclipse.cdt.ui.editor.CEditor");
				
			} catch (PartInitException e) {
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			} catch (NullPointerException e) {
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			} catch (Exception e) {
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			}
		}
		
		if (model instanceof InterfaceDefinition) {
			InterfaceDefinition itf = (InterfaceDefinition) model;
			String signature = itf.getSignature();
			
			try {

				EList<String> imports = new BasicEList<String>();
				//TODO complete imports object : add the list of imports
				// Create the editor input
				IFile file = ModelToProjectUtil.INSTANCE.resolveItf(itf.getSignature(), imports);
				
				if (file == null || !(file.exists())) {
					MindDiagramEditorPlugin.getInstance().logError("File not found : "+signature);
					return null;
				}
				
				IEditorInput itfEditorInput = new FileEditorInput(file);
				
								
				// Now try to open the editors
				IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();
				page.openEditor(itfEditorInput, "org.ow2.mindEd.itf.editor.textual.FractalItf");
			}
			catch (Exception e) {
				MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			}
		}
		
		
		return null;
	}

}
