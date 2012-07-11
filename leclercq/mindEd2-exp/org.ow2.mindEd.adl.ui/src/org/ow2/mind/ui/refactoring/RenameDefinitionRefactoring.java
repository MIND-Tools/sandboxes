
package org.ow2.mind.ui.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.Implementation;

public class RenameDefinitionRefactoring extends RenameRefactoring {

  protected List<SourceRename> sourceRenames;

  public RenameDefinitionRefactoring(
      final RenameDefinitionRefactoringProcessor processor) {
    super(processor);
  }

  @Override
  public RenameDefinitionRefactoringProcessor getProcessor() {
    return (RenameDefinitionRefactoringProcessor) super.getProcessor();
  }

  public List<SourceRename> getSourceRenames() {
    return sourceRenames;
  }

  public void setSourceRenames(final List<SourceRename> sourceRename) {
    this.sourceRenames = sourceRename;
  }

  protected static class SourceRename {
    protected Implementation source;
    protected String         newName;

    protected SourceRename(final Implementation source, final String newName) {
      this.source = source;
      this.newName = newName;
    }
  }

  public List<SourceRename> initializeSourceRenames(final String newName) {
    // TODO handle case of composite definitions that contain anonymous
    // primitive definition
    final List<Implementation> implems = AdlModelHelper
        .getLocalImplementations((AbstractDefinition) getProcessor()
            .getElement());
    final List<SourceRename> result = new ArrayList<SourceRename>(
        implems.size());

    final String initialPackageName = AdlModelHelper
        .getPackageName(getInitialName());
    final String initialSimpleName = AdlModelHelper
        .getSimpleName(getInitialName());
    final IPath initialPackagePath = new Path("/"
        + ((initialPackageName == null) ? "" : initialPackageName.replace('.',
            '/')));

    final String newPackageName = AdlModelHelper.getPackageName(newName);
    final String newSimpleName = AdlModelHelper.getSimpleName(newName);
    final IPath newPackagePath = new Path("/"
        + newPackageName.replace('.', '/'));

    for (final Implementation implem : implems) {
      final String initialPath = implem.getPath();
      if (initialPath == null) continue;

      IPath path = new Path(initialPath);
      final String initialFileName = path.segment(path.segmentCount() - 1);
      if (path.isAbsolute()
          && path.matchingFirstSegments(initialPackagePath) == initialPackagePath
              .segmentCount()) {
        // the path of the source file is absolute but it matches the package
        // name. The package path should be updated
        path = newPackagePath.append(initialFileName);
      }

      // if the source file name contains the simple name of the definition
      // (ignoring case), update it
      final String initialFileNameLC = initialFileName.toLowerCase();
      final String initialSimpleNameLC = initialSimpleName.toLowerCase();
      final int i = initialFileNameLC.indexOf(initialSimpleNameLC);
      if (i >= 0) {
        String newFileName;
        if (Character.isUpperCase(initialSimpleName.charAt(0))
            && Character.isLowerCase(initialFileName.charAt(i))) {

          newFileName = initialFileName.substring(0, i)
              + Character.toLowerCase(newSimpleName.charAt(0))
              + newSimpleName.substring(1);
        } else {
          newFileName = initialFileName.substring(0, i) + newSimpleName;
        }
        if (initialFileName.length() > i + initialSimpleName.length()) {
          newFileName += initialFileName.substring(i
              + initialSimpleName.length());
        }
        path = path.removeLastSegments(1).append(newFileName);
      }

      String newPath = path.toString();
      if (initialPath.startsWith("./")) newPath = "./" + newPath;
      result.add(new SourceRename(implem, newPath));
    }

    return result;
  }
}
