package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.dnd.TransferDropTargetListener;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.DiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.actions.SelectWorkingSetsAction;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.navigator.LocalSelectionTransfer;
import org.ow2.mindEd.adl.custom.impl.BindingDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.CompositeBodyCustomImpl;
import org.ow2.mindEd.adl.custom.impl.MindObjectImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.MindDiagramUpdateAllCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.AdlDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeBodyCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeComponentDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveComponentDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.CustomConnectionLayerEx;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.providers.MindCustomDocumentProvider;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.DragAndDrop;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditor;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

@SuppressWarnings("deprecation")
public class CustomMindDiagramEditor extends MindDiagramEditor {


	IWorkbenchPart selectedPart = null;

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		
		super.selectionChanged(part, selection);
		
		if(part instanceof CustomMindDiagramEditor)
		{
			if(selectedPart == null)
				selectedPart = part;
			else
			{
				if(selectedPart != part)
				{
					if(!((CustomMindDiagramEditor)selectedPart).isDirty())
					{
						try {
							((CustomMindDiagramEditor)selectedPart).releaseInput();
						} catch (Throwable e) {
							e.printStackTrace();
						}
					}
					selectedPart = part;
					
					if(this.equals(part))
					{
						if(!this.isDirty())
						{
//							((CustomMindDiagramEditor)part).initializeGraphicalViewer();
//							((CustomMindDiagramEditor)part).initializeGraphicalViewerContents();
							try {
								((CustomMindDiagramEditor)part).init(getEditorSite(), getEditorInput());
							} catch (PartInitException e1) {
								e1.printStackTrace();
							}
							
							try {
								((CustomMindDiagramEditor)part).getDocumentProvider().resetDocument(((CustomMindDiagramEditor)part).getEditorInput());
								((CustomMindDiagramEditor)part).getDocumentProvider().synchronize(((CustomMindDiagramEditor)part).getEditorInput());
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
						else
						{
							((CustomMindDiagramEditor)part).initializeGraphicalViewer();
							((CustomMindDiagramEditor)part).initializeGraphicalViewerContents();
							refreshComponentEditPart();
						}						
					}
				}
			}
		}
	}

	private void refreshComponentEditPart() {
		Object diagramEditPart = this.getDiagramEditPart();
		if (diagramEditPart instanceof AdlDefinitionCustomEditPart) {
			AdlDefinitionCustomEditPart adlDef = (AdlDefinitionCustomEditPart) diagramEditPart;
			for (Object children : adlDef.getChildren()) {
				if ((children instanceof CompositeComponentDefinitionCustomEditPart)
						|| (children instanceof PrimitiveComponentDefinitionCustomEditPart)) {
					GraphicalEditPart componentDel = null;
					if (children instanceof CompositeComponentDefinitionCustomEditPart)
						componentDel = (CompositeComponentDefinitionCustomEditPart) children;
					if (children instanceof PrimitiveComponentDefinitionCustomEditPart)
						componentDel = (PrimitiveComponentDefinitionCustomEditPart) children;

					MindDiagramUpdateAllCommand refreshCommand = new MindDiagramUpdateAllCommand(
							true);
					TransactionImpl transaction = new TransactionImpl(
							getEditingDomain(), false);

					try {
						transaction.start();
						EObject root = ((View) componentDel.getModel())
								.getElement();
						refreshCommand.refreshMerge((MindObjectImpl) root);
						transaction.commit();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} catch (RollbackException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Override
	protected void updateState(IEditorInput input) {

		super.updateState(input);
	}

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		getDiagramGraphicalViewer().addDropTargetListener(
				(TransferDropTargetListener) new DiagramDropTargetListener(
						getDiagramGraphicalViewer(), CustomPluginTransfer
								.getInstance()) {

					@Override
					protected void handleDragOver() {
						super.handleDragOver();

						boolean commandIsValid = true;
						List<Command> listCommand = DragAndDrop.getListCommand(
								getObjectsBeingDropped(), getTargetEditPart(),
								new Point(getCurrentEvent().x,
										getCurrentEvent().y));
						if (listCommand != null) {
							if (listCommand.size() != 0) {
								for (Command command : listCommand) {
									if (!command.canExecute()) {
										commandIsValid = commandIsValid & false;
									}
								}
							} else {
								commandIsValid = false;
							}
						}

						if (!commandIsValid) {
							getCurrentEvent().detail = DND.DROP_NONE;
						} else {
							getCurrentEvent().detail = DND.DROP_COPY;
						}
					}

					protected List<Object> getObjectsBeingDropped() {
						TransferData[] data = getCurrentEvent().dataTypes;
						List<Object> ret = new ArrayList<Object>();
						for (int i = 0; i < data.length; i++) {
							boolean cond = CustomPluginTransfer.getInstance()
									.isSupportedType(data[i]);
							if (cond) {
								IStructuredSelection selection = (IStructuredSelection) LocalSelectionTransfer
										.getTransfer().getSelection();
								for (Iterator<?> it = selection.iterator(); it
										.hasNext();) {
									Object object = (Object) it.next();
									ret.add(object);
								}
							}
						}
						return ret;
					}

					public boolean isEnabled(DropTargetEvent event) {
						System.out.println("MindDiagramEditor.isEnabled");
						boolean ret = true;
						System.out.println("MindDiagramEditor.isEnabled ret : "
								+ ret);
						return ret;
					}

					@Override
					protected void handleDrop() {
						super.handleDrop();

						DragAndDrop.executeDrop(getObjectsBeingDropped(),
								getTargetEditPart(), this.getDropLocation());

					}

				});
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		return super.createPaletteRoot(existingPaletteRoot);
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		// Get a custom connection layer to install a custom connection router
		setupCustomConnectionLayerEx();
	}

	/**
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#initializeGraphicalViewer()
	 */
	protected void initializeGraphicalViewerContents() {
		super.initializeGraphicalViewerContents();
		// Now that things are initialized, we should refresh
		refreshAll(getDiagramEditPart());
	}

	/**
	 * Refresh all edit parts
	 * 
	 * @param editPart
	 */
	public void refreshAll(EditPart editPart) {
		editPart.refresh();
		for (Object child : editPart.getChildren()) {
			if (child instanceof EditPart)
				refreshAll((EditPart) child);
		}
	}

	protected IDocumentProvider provider;

	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (provider == null)
			setDocumentProvider(input);
		return provider;
	}

	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			provider = new MindCustomDocumentProvider();
			setDocumentProvider(provider);
		} else {
			super.setDocumentProvider(input);
		}
	}

	@Override
	public void setInput(IEditorInput input) {
		if (input instanceof FileEditorInput) {
			FileEditorInput fei = (FileEditorInput) input;
			if (fei.getFile().getFileExtension().equals("adl")) {
				input = new FileEditorInput(fei
						.getFile()
						.getParent()
						.getFile(
								new org.eclipse.core.runtime.Path(fei.getName()
										+ "_diagram")));
			}
		}
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		MindProxyFactory.INSTANCE.setEditorInput(input);
		super.setInput(input);
	}

	@Override
	public void dispose() {
		try {
			super.dispose();
		} catch (Exception e) {
			// Workaround for a bug in DiagramDocumentEditor
		}
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class type) {
		if (type == IContentOutlinePage.class) {
			return null;
		}
		return super.getAdapter(type);
	}

	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels";

	/**
	 * @author Yann Davin
	 */
	public void setupCustomConnectionLayerEx() {
		DiagramRootEditPart root = (DiagramRootEditPart) getDiagramGraphicalViewer()
				.getRootEditPart();
		LayeredPane printableLayers = (LayeredPane) root
				.getLayer(LayerConstants.PRINTABLE_LAYERS);
		Layer connlayer = printableLayers
				.getLayer(LayerConstants.CONNECTION_LAYER);
		if (connlayer == null || connlayer instanceof CustomConnectionLayerEx) {
			return;
		}

		printableLayers.removeLayer(LayerConstants.CONNECTION_LAYER);
		Layer decorationLayer = printableLayers
				.getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
		printableLayers
				.removeLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
		printableLayers.addLayerBefore(new CustomConnectionLayerEx(),
				LayerConstants.CONNECTION_LAYER,
				printableLayers.getLayer(LayerConstants.PRIMARY_LAYER));
		printableLayers.addLayerBefore(decorationLayer,
				DiagramRootEditPart.DECORATION_PRINTABLE_LAYER,
				printableLayers.getLayer(LayerConstants.CONNECTION_LAYER));

		FreeformLayer extLabelsLayer = new FreeformLayer();
		extLabelsLayer.setLayoutManager(new DelegatingLayout());
		printableLayers.addLayerAfter(extLabelsLayer,
				EXTERNAL_NODE_LABELS_LAYER, LayerConstants.PRIMARY_LAYER);
		LayeredPane scalableLayers = (LayeredPane) root
				.getLayer(LayerConstants.SCALABLE_LAYERS);
		FreeformLayer scaledFeedbackLayer = new FreeformLayer();
		scaledFeedbackLayer.setEnabled(false);
		scalableLayers.addLayerAfter(scaledFeedbackLayer,
				LayerConstants.SCALED_FEEDBACK_LAYER,
				DiagramRootEditPart.DECORATION_UNPRINTABLE_LAYER);
	}

}
