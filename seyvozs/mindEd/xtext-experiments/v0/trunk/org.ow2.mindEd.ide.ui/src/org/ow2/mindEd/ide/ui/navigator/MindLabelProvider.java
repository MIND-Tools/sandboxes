package org.ow2.mindEd.ide.ui.navigator;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.ui.Activator;

public class MindLabelProvider extends AdapterFactoryLabelProvider implements
		ILabelProvider, org.eclipse.ui.navigator.ICommonLabelProvider, IStyledLabelProvider, IResourceChangeListener {

	public MindLabelProvider() {
		super(MindUICore.mindViewAdapterFactory());
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	@Override
	public void dispose() {
		super.dispose();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}
	
	private void changeMarkerDelta(IMarkerDelta iMarkerDelta, HashSet<MindObject> changedObject) {
		IResource r = iMarkerDelta.getResource();
		if (r == null) return;
		MindObject mo = MindIdeCore.get(r);
		if (mo == null) return;
		changedObject.add(mo);
		EObject eo = mo.eContainer();
		while (eo != null && eo instanceof MindObject) {
			changedObject.add((MindObject) eo);
			if (eo instanceof MindRootSrc) {
				MindLibOrProject p = ((MindRootSrc)eo).getProject();
				if (p != null)
					changedObject.add(p);
			}
			eo = eo.eContainer();
		}
	}
	
	public void resourceChanged(IResourceChangeEvent event) {
		
		final HashSet<MindObject> changedObject = new HashSet<MindObject>();
		try {
			if (event.getDelta() != null) {
				event.getDelta().accept(new IResourceDeltaVisitor() {
					public boolean visit(IResourceDelta delta) throws CoreException {
						
						for (IMarkerDelta iMarkerDelta : delta.getMarkerDeltas()) {
							changeMarkerDelta(iMarkerDelta, changedObject);
						}	
						return true;
					}
				});
			} else {
				IMarkerDelta[] markerDelta = event.findMarkerDeltas(null, true);
				
				for (IMarkerDelta iMarkerDelta : markerDelta) {
					changeMarkerDelta(iMarkerDelta, changedObject);
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if (changedObject.size() != 0) {
			
			Display currentDisplay = Display.getDefault();
			if (currentDisplay != null)
				currentDisplay.asyncExec(new Runnable() {				
				public void run() {
					fireLabelProviderChanged(new LabelProviderChangedEvent(MindLabelProvider.this, (MindObject[]) changedObject.toArray(new MindObject[changedObject.size()])));
				}
			});
		}
			
	}
	
	public void fireLabelProviderChanged(LabelProviderChangedEvent e)
	  {
	    for (ILabelProviderListener labelProviderListener : labelProviderListeners)
	    {
	      labelProviderListener.labelProviderChanged(e);
	    }
	  }
	
	public void init(ICommonContentExtensionSite aConfig) {
	}
	

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}

	public String getDescription(Object anElement) {
		return getText(anElement);
	}

	public StyledString getStyledText(Object element) {
		String name = null;
		if (element instanceof IResource) {
			IResource r = (IResource) element;
			name = r.getName();
			element = MindIdeCore.get(r);
		}
		if (element instanceof MindObject) {
			name = getText(element);
		}
		if (name == null)
			name = getText(element);
		StyledString ss = new StyledString(name);
		//ss.setStyle(0, name.length(), );
		return ss;
	}
	
	@Override
	public Image getImage(Object object) {
		if (object instanceof MindFile) {
			MindFile mf = (MindFile) object;
			if (mf.getIcon() != null) {
				ImageDescriptor image;
				try {
					image = Activator.getImageDescriptorURI(mf.getIcon());
					if (image == null)
						return image.createImage();
				} catch (MalformedURLException e) {
				}
			}
		}
		return super.getImage(object);
	}

}
