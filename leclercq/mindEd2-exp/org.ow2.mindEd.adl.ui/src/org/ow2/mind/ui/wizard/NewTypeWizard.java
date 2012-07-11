
package org.ow2.mind.ui.wizard;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.util.StringInputStream;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.Definition;
import org.ow2.minded.project.properties.MindPackage;

import com.google.inject.Inject;

public class NewTypeWizard extends NewDefinitionWizard {

  @Inject
  NewTypeWizardPage newAdlPage;

  public NewTypeWizard() {
    setWindowTitle("New Type ADL");
  }

  protected ADLContent generateContent(String name) {
    StringBuilder sb = new StringBuilder();
    generateImports(sb);
    sb.append("type ").append(name);
    generateExtends(sb);
    sb.append(" {\n  ");
    int offset = sb.length();
    sb.append("\n}");
    return new ADLContent(sb.toString(), offset);
  }

  static final class ADLContent {
    final String content;
    final int selectOffSet;

    ADLContent(String content, int selectOffSet) {
      this.content = content;
      this.selectOffSet = selectOffSet;
    }
  }
  
  @Override
  protected NewDefinitionWizardPage createPage() {
    return newAdlPage;
  }
}
