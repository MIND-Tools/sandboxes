package org.ow2.mindEd.adl.textual.ui.navigation;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.util.ITextRegion;
import org.ow2.mindEd.adl.textual.fractal.impl.FileCImpl;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindPackage;
import org.eclipse.xtext.resource.ILocationInFileProvider;

import com.google.inject.Inject;

public class FractalHyperlink extends HyperlinkHelper {

	// Reference on the project model
	private MindModelManager mindModel = MindModelManager.getMindModelManager();

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private ILocationInFileProvider ILocationInFileProvider;

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,
            IHyperlinkAcceptor acceptor) {

		super.createHyperlinksByOffset(resource, offset, acceptor);

		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		ITextRegion loc = ILocationInFileProvider.getSignificantTextRegion(eObject);


		URI uri = null;
		
		if (eObject instanceof FileCImpl) {
        	// SSZ
        	// Inspired from the OpenDefinitionEditPolicy class, getOpenCommand method in the
        	// org.ow2.mindEd.adl.editor.graphic.ui subproject, custom sources
        	
        	FileCImpl fileC = (FileCImpl) eObject;
        	String fileName = fileC.getName();
        	String directory = fileC.getDirectory();
        	IFile file = null;
			
        	if (directory == null || directory.equals("")){
        		// Find the file according to the host component package        		
        		MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage();
				if (pack != null) {
					IFolder f = MindIdeCore.getResource(pack);
					file = f.getFile(fileName);
				}
        	} else {
        		// handle host definition path for resource resolution
        		
        		File f = new File(directory, fileName);
        		// removed the "f.isAbsolute() test as it wouldn't work on Windows
        		
				if (directory.startsWith("/")) {
					uri = URI.createPlatformResourceURI(f.getPath(), true);
					MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(uri);
					IFolder f2 = MindIdeCore.getResource(pack);
					file = f2.getFile(fileName);
				} else {
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
// SSZ: TODO: handle errors
        			return; // warn/error ?
//					MindDiagramEditorPlugin.getInstance().logError("File not found : "+directory+"/"+fileName);
//					return null;
				}
				
				IEditorInput cdtEditorInput = new FileEditorInput(file);
				
								
				// Now try to open the editors
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();
				page.openEditor(cdtEditorInput, "org.eclipse.cdt.ui.editor.CEditor");
				
			} catch (PartInitException e) {
				// SSZ: TODO: handle errors
    			return;
				//MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			} catch (NullPointerException e) {
				// SSZ: TODO: handle errors
    			return;
				//MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			} catch (Exception e) {
				// SSZ: TODO: handle errors
    			return;
				//MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			}
        	
        }            
        
        if (uri != null ){
        	// here we create the link
        	
        	XtextHyperlink hyperlink = getHyperlinkProvider().get();
        	hyperlink.setURI(uri);
        	hyperlink.setHyperlinkRegion(new Region(loc.getOffset(), loc.getLength()));
        	
        	acceptor.accept(hyperlink);
        }        

	}

}
