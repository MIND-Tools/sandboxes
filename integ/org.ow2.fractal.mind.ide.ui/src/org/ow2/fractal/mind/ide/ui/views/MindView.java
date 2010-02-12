package org.ow2.fractal.mind.ide.ui.views;


import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindideItemProviderCustomAdapterFactory;
import org.ow2.fractal.mind.ide.ui.navigator.MindUICore;
import org.ow2.fratal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fratal.mind.ide.emf.mindide.provider.MindideItemProviderAdapterFactory;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class MindView extends CommonNavigator {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.ow2.fractal.mind.build.ui.views.MindView";

	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public MindView() {
		
	}

	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		
		
		// Create the help context id for the viewer's control
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.ow2.fractal.mind.build.ui.viewer");
		makeActions();
		hookDoubleClickAction();
		contributeToActionBars();
	}
	
	@Override
	protected CommonViewer createCommonViewer(Composite aParent) {
		// TODO Auto-generated method stub
		CommonViewer createCommonViewer = super.createCommonViewer(aParent);
		createCommonViewer.setContentProvider(new ListAndAdapterFactoryContentProvider(MindUICore.getAdapterFactory()));
		createCommonViewer.setLabelProvider(new AdapterFactoryLabelProvider(MindUICore.getAdapterFactory()));
		createCommonViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
		return createCommonViewer;
	}
	
	@Override
	protected CommonViewer createCommonViewerObject(Composite aParent) {
		return super.createCommonViewerObject(aParent);
	}
	
	@Override
	protected Object getInitialInput() {
		MindAllRepo repos = MindModelManager.getMindModelManager().getMindModel().getMindRepository();
		return repos.getRepos();
	}

	

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		//drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		//drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		action1 = new Action() {
			@Override
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			@Override
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			@Override
			public void run() {
				ISelection selection = getCommonViewer().getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			getCommonViewer().getControl().getShell(),
			"Mind View",
			message);
	}
}