
package org.ow2.minded.project.properties;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;

public class ProjectPropertiesConstants {

  public static final String SOURCE_PATH           = "sourcePath";
  public static final String DEFAULT_SOURCE_PATH   = "src";

  public static final String EXTERNAL_PATH         = "externalPath";
  public static final String DEFAULT_EXTERNAL_PATH = "";

  public static final String USED_PROJECT          = "usedProject";
  public static final String DEFAULT_USED_PROJECT  = "";

  public static String encodeSrcPath(List<IFolder> srcPath) {
    String s = "";
    for (Iterator<IFolder> iter = srcPath.iterator(); iter.hasNext();) {
      IFolder path = iter.next();
      s += path.getProjectRelativePath().toString();
      if (iter.hasNext()) s += ";";
    }
    return s;
  }

  public static List<IFolder> decodeSrcPath(String srcPath, IProject project) {
    String[] paths = srcPath.split(";");
    List<IFolder> l = new ArrayList<IFolder>(paths.length);
    for (int i = 0; i < paths.length; i++) {
      l.add(project.getFolder(new Path(paths[i])));
    }
    return l;
  }

  public static String encodeExtPath(List<File> extPath) {
    String s = "";
    for (Iterator<File> iter = extPath.iterator(); iter.hasNext();) {
      File path = iter.next();
      s += path.getAbsolutePath();
      if (iter.hasNext()) s += ";";
    }
    return s;
  }

  public static List<File> decodeExtPath(String extPath) {
    if (extPath == null || extPath.length() == 0 ) {
      return new ArrayList<File>();
    }
    String[] paths = extPath.split(";");
    List<File> l = new ArrayList<File>(paths.length);
    for (int i = 0; i < paths.length; i++) {
      l.add(new File(paths[i]));
    }
    return l;
  }

  public static String encodeUsedProjects(List<IProject> usedProject) {
    String s = "";
    for (Iterator<IProject> iter = usedProject.iterator(); iter.hasNext();) {
      IProject path = iter.next();
      s += path.getName();
      if (iter.hasNext()) s += ";";
    }
    return s;
  }

  public static List<IProject> decodeUsedProjects(String usedProjects, IProject project) {
    if (usedProjects == null || usedProjects.length() == 0 ) {
      return new ArrayList<IProject>();
    }
    String[] paths = usedProjects.split(";");
    List<IProject> l = new ArrayList<IProject>(paths.length);
    for (int i = 0; i < paths.length; i++) {
      l.add(project.getWorkspace().getRoot().getProject(paths[i]));
    }
    return l;
  }
}
