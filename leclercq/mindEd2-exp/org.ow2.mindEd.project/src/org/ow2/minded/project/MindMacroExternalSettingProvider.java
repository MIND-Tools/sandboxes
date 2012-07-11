
package org.ow2.minded.project;

import java.util.ArrayList;

import org.eclipse.cdt.core.settings.model.CExternalSetting;
import org.eclipse.cdt.core.settings.model.CMacroEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.extension.CExternalSettingProvider;
import org.eclipse.core.resources.IProject;

public class MindMacroExternalSettingProvider extends CExternalSettingProvider {

  public static final String ID = "org.ow2.mindEd.project.mindMacros";
  
  @Override
  public CExternalSetting[] getSettings(IProject project,
      ICConfigurationDescription cfg) {
    System.out.println("In MindMacroExternalSettingProvider.getSettings");
    // supply macro entries for CPL

    ArrayList<ICSettingEntry> pathEntries = new ArrayList<ICSettingEntry>();
    pathEntries.add(new CMacroEntry("METH(interface,method ...)",
        "method##interface", 0));
    pathEntries
        .add(new CMacroEntry("IS_BOUND(interface)", "(interface!=0)", 0));
    pathEntries.add(new CMacroEntry("GET_COLLECTION_SIZE(interface)", "0", 0));
    pathEntries.add(new CMacroEntry("CALL(interface,method ...)",
        "method##interface", 0));
    pathEntries.add(new CMacroEntry("PRIVATE", "__private__", 0));
    pathEntries.add(new CMacroEntry("ATTR(attribute)", "attribute", 0));
    pathEntries
        .add(new CMacroEntry("CONSTRUCTOR()", "void _constructor_()", 0));
    pathEntries.add(new CMacroEntry("DESTRUCTOR()", "void _destructor_()", 0));
    pathEntries.add(new CMacroEntry("GET_MY_INTERFACE(interface)", "interface",
        0));
    pathEntries.add(new CMacroEntry("IS_BOUND_PTR(intertface_pointer)",
        "(intertface_pointer!=0)", 0));
    pathEntries.add(new CMacroEntry("CALL_PTR(interface,method ...)",
        "method##interface", 0));
    pathEntries.add(new CMacroEntry("METH_PTR(methodPointer)", "methodPointer",
        0));

    ICSettingEntry[] settings = (ICSettingEntry[]) pathEntries
        .toArray(new ICSettingEntry[pathEntries.size()]);
    return new CExternalSetting[]{new CExternalSetting(null, null, null,
        settings)};
  }

}
