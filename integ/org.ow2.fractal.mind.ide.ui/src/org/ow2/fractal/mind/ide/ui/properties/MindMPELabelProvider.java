/**
 * (c) Copyright Mirasol Op'nWorks Inc. 2002, 2003. 
 * http://www.opnworks.com
 * Created on Apr 2, 2003 by lgauthier@opnworks.com
 */

package org.ow2.fractal.mind.ide.ui.properties;

import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.ow2.fractal.mind.ide.emf.provider.MindIDEEditPlugin;
import org.ow2.fratal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fratal.mind.ide.emf.mindide.provider.MindRootSrcItemProvider;
import org.ow2.fratal.mind.ide.emf.mindide.provider.MindideItemProviderAdapterFactory;


/**
 * Label provider for the TableViewerExample
 * 
 * @see org.eclipse.jface.viewers.LabelProvider 
 */
public class MindMPELabelProvider 
	extends LabelProvider
 {

	@Override
	public String getText(Object element) {
		if (element instanceof MindPathEntry) {
			MindPathEntry mpe = (MindPathEntry) element;
			switch (mpe.getEntryKind()) {
			case PROJECT:
				return mpe.getName().substring(1);
			default:
				return mpe.getName();
			}
		}
		if (element instanceof MindAdl) {
			MindAdl adl = (MindAdl) element;
			return adl.getPackage().getName()+"."+adl.getName();
		}
		if (element instanceof MindProject) {
			MindProject mindProject = (MindProject) element;
			return mindProject.getName();
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof MindPathEntry) {
			MindPathEntry mpe = (MindPathEntry) element;
			switch (mpe.getEntryKind()) {
			case SOURCE:
				return getImageFromObject(MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindRootSrc"));
			case IMPORT_PACKAGE:
				return getImageFromObject(MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindPackage"));
			case APPLI:
				return getImageFromObject(MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindApplication"));
			case PROJECT:
				return getImageFromObject(MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindProject"));

			default:
				break;
			}
		}
		if (element instanceof MindProject) {
			return getImageFromObject(MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindProject"));
		}
		return super.getImage(element);
	}
	
	protected Image getImageFromObject(Object object)
	  {
	    return ExtendedImageRegistry.getInstance().getImage(object);
	  }

}
