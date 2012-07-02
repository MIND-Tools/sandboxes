package org.ow2.mindEd.ide.ui.wizards;

import java.net.URI;

import org.eclipse.cdt.ui.CUIPlugin;
import org.eclipse.cdt.ui.newui.UIMessages;
import org.eclipse.cdt.ui.wizards.IWizardWithMemory;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * It's the default page for Fractal MIND Project Wizard.
 * It adds a validator that checks if the name and location are valid for a CDT project.
 * 
 */

public class MindProjectWizardPage extends WizardNewProjectCreationPage  {
  
    /**
     * Creates a new project creation wizard page.
     *
     * @param pageName the name of this page
     */
    public MindProjectWizardPage(String pageName) {
        super(pageName);
        setPageComplete(false);
    }

    /**
     * Returns whether this page's controls currently all contain valid 
     * values.
     *
     * @return <code>true</code> if all controls are valid, and
     *   <code>false</code> if at least one is invalid
     */
    @Override
	protected boolean validatePage() {
		setMessage(null);
    	if (!super.validatePage())
    		return false;

        if (getProjectName().indexOf('#') >= 0) {
            setErrorMessage(UIMessages.getString("CDTMainWizardPage.0"));	             //$NON-NLS-1$
            return false;
        }
        
        boolean bad = true; // should we treat existing project as error
        
        IProject handle = getProjectHandle();
        if (handle.exists()) {
        	if (getWizard() instanceof IWizardWithMemory) {
        		IWizardWithMemory w = (IWizardWithMemory)getWizard();
        		if (w.getLastProjectName() != null && w.getLastProjectName().equals(getProjectName()))
        			bad = false;
        	}
        	if (bad) { 
        		setErrorMessage(UIMessages.getString("CMainWizardPage.10")); //$NON-NLS-1$
        	    return false;
        	}
        }

        if (bad) { // skip this check if project already created 
        	try {
        		IFileStore fs;
	        	URI p = useDefaults() ? null : getLocationURI();
	        	if (p == null) {
	        		fs = EFS.getStore(ResourcesPlugin.getWorkspace().getRoot().getLocationURI());
	        		fs = fs.getChild(getProjectName());
	        	} else
	        		fs = EFS.getStore(p);
        		IFileInfo f = fs.fetchInfo();
	        	if (f.exists()) {
	        		if (f.isDirectory()) {
	        			setMessage(UIMessages.getString("CMainWizardPage.7"), IMessageProvider.WARNING); //$NON-NLS-1$
		        		return true;
	        		}
					setErrorMessage(UIMessages.getString("CMainWizardPage.6")); //$NON-NLS-1$
					return false;
	        	}
        	} catch (CoreException e) {
        		CUIPlugin.log(e.getStatus());
        	}
        }
        
        if (!useDefaults()) {
            IStatus locationStatus = ResourcesPlugin.getWorkspace().validateProjectLocationURI(handle,
            		getLocationURI());
            if (!locationStatus.isOK()) {
                setErrorMessage(locationStatus.getMessage());
                return false;
            }
        }
        
        setErrorMessage(null);
        return true;
    }
}

