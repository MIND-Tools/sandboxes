/**
 * (c) Copyright Mirasol Op'nWorks Inc. 2002, 2003. 
 * http://www.opnworks.com
 * Created on Apr 2, 2003 by lgauthier@opnworks.com
 */

package org.ow2.mindEd.ide.ui.properties;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.ow2.mindEd.ide.edit.provider.MindIDEEditPlugin;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindProject;


/**
 * Label provider for the mind path entry
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
			return adl.getQualifiedName();
		}
		if (element instanceof MindLibOrProject) {
			MindLibOrProject mindProject = (MindLibOrProject) element;
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
