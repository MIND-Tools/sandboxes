package org.ow2.mindEd.ide.core.impl;

import java.util.ArrayList;

import org.eclipse.cdt.core.settings.model.CExternalSetting;
import org.eclipse.cdt.core.settings.model.CMacroEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.extension.CExternalSettingProvider;
import org.eclipse.core.resources.IProject;

/**
 * This class is a provider provider of include/macro/library settings for a CDT project. 
 * 
 * A CDT project can be configured to use a dynamic setting provider to automate project 
 * configuration.
 *  
 */
public class CPLMacroSettings extends CExternalSettingProvider {

    /** The ID of this ExternalSettingProvider as specified in the plugin XML */
    public static final String ID = "mind.cpl.settings"; //$NON-NLS-1$
    
    /** {@inheritDoc} */
    public CExternalSetting[] getSettings( final IProject pr_Project, final ICConfigurationDescription pr_Config ) {
  
        //supply macro entries for CPL 
    	
        ArrayList<ICSettingEntry> pathEntries = new ArrayList<ICSettingEntry>();
        pathEntries.add(new CMacroEntry("METH(interface,method ...)", "method##interface", 0));
        pathEntries.add(new CMacroEntry("IS_BOUND(interface)", "(interface!=0)", 0));
        pathEntries.add(new CMacroEntry("GET_COLLECTION_SIZE(interface)", "0", 0));
        pathEntries.add(new CMacroEntry("CALL(interface,method ...)", "method##interface", 0));
        pathEntries.add(new CMacroEntry("PRIVATE", "__private__", 0));
        pathEntries.add(new CMacroEntry("ATTR(attribute)", "attribute", 0));
        pathEntries.add(new CMacroEntry("CONSTRUCTOR()", "void _constructor_()", 0));
        pathEntries.add(new CMacroEntry("DESTRUCTOR()", "void _destructor_()", 0));
        pathEntries.add(new CMacroEntry("GET_MY_INTERFACE(interface)", "interface", 0));
        pathEntries.add(new CMacroEntry("IS_BOUND_PTR(intertface_pointer)", "(intertface_pointer!=0)", 0));
        pathEntries.add(new CMacroEntry("CALL_PTR(interface,method ...)", "method##interface", 0));
        pathEntries.add(new CMacroEntry("METH_PTR(methodPointer)", "methodPointer", 0));
        
        ICSettingEntry[] settings = (ICSettingEntry[]) pathEntries.toArray(new ICSettingEntry[pathEntries.size()]);
        return new CExternalSetting[]{new CExternalSetting(null, null, null, settings)};
    }
}
