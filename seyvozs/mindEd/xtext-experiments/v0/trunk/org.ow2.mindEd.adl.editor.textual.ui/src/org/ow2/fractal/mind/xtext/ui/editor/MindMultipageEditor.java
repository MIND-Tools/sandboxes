package org.ow2.fractal.mind.xtext.ui.editor;

import java.util.HashMap;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.ow2.mindEd.adl.provider.AdlItemProviderAdapterFactory;
import org.ow2.mindEd.adl.textual.ui.CustomXtextEditor;
import org.ow2.mindEd.adl.textual.ui.internal.FractalActivator;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import com.google.inject.Injector;

public class MindMultipageEditor extends MultiPageEditorPart implements
		IResourceChangeListener, IEditingDomainProvider {

	private CustomXtextEditor xtextEditor;

	protected AdapterFactoryEditingDomain editingDomain;

	private TreeViewer emfTree;

	private ComposedAdapterFactory adapterFactory;

	public MindMultipageEditor() {
		super();
		init();
	}

	private void init() {

		// Create an adapter factory
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AdlItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the editing domain
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, null,
				new HashMap<Resource, Boolean>());

		// Create Guice injector for xtext services
		Injector injector = FractalActivator
				.getInstance()
				.getInjector("org.ow2.mindEd.adl.textual.Fractal");
		xtextEditor = injector.getInstance(CustomXtextEditor.class);

	}

	@Override
	public void createPages() {
		// Create model for emf view
		createModel();
		// Create Editor Pages
		createAdlPage();
		createEmfTreePage();
		// createGmfPage();
		
		setPartName(getEditorInput().getName());
	}

	private void createAdlPage() {
		try {
			xtextEditor.getDocument();
			int index = addPage(xtextEditor, getEditorInput());
			setPageText(index, "Text View");
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
		}
	}

	private void createEmfTreePage() {
		{
			ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
					MindMultipageEditor.this) {
				@Override
				public Viewer createViewer(Composite composite) {
					Tree tree = new Tree(composite, SWT.MULTI);
					TreeViewer newTreeViewer = new TreeViewer(tree);
					return newTreeViewer;
				}

			};
			viewerPane.createControl(getContainer());

			emfTree = (TreeViewer) viewerPane.getViewer();

			emfTree.setAutoExpandLevel(5);

			emfTree.setContentProvider(new AdapterFactoryContentProvider(
					adapterFactory));

			emfTree.setLabelProvider(new AdapterFactoryLabelProvider(
					adapterFactory));
			emfTree.setInput(editingDomain.getResourceSet());
			emfTree.setSelection(new StructuredSelection(editingDomain
					.getResourceSet().getResources().get(0)), true);
			viewerPane.setTitle(editingDomain.getResourceSet());

			new AdapterFactoryTreeEditor(emfTree.getTree(), adapterFactory);

			// createContextMenuFor(selectionViewer);
			int pageIndex = addPage(viewerPane.getControl());
			setPageText(pageIndex, "Tree View");
		}
	}

//	private void createGmfPage() {
//		try {
//			CustomMindDiagramEditor gmfEditor = new CustomMindDiagramEditor();
//			gmfEditor.setInput(getEditorInput());
//			int index = addPage(gmfEditor, getEditorInput());
//			setPageText(index, "View");
//		} catch (PartInitException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);

		// Unload/Reload resource for emf tree view
		editingDomain.getResourceSet().getResources().get(0).unload();
		createModel();
	}

	@Override
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPartName(editor.getTitle());

		editingDomain.getResourceSet().getResources().get(0).unload();
		editingDomain.getResourceSet().getResources().remove(0);

		setInput(editor.getEditorInput());
		createModel();

	}

	@Override
	public void setInput(IEditorInput input) {
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		super.setInput(input);

	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}


	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow()
							.getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) xtextEditor.getEditorInput())
								.getFile().getProject().equals(
										event.getResource())) {
							IEditorPart editorPart = pages[i]
									.findEditor(xtextEditor.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
		}
	}

	
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}
	}

}
