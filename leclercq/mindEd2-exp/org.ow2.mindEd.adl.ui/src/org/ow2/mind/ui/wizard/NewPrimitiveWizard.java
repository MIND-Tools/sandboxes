
package org.ow2.mind.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.INewWizard;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.util.StringInputStream;
import org.ow2.mind.ui.wizard.NewTypeWizard.ADLContent;
import org.ow2.minded.project.properties.MindPackage;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class NewPrimitiveWizard extends NewDefinitionWizard {

  @Inject
  NewPrimitiveWizardPage newAdlPage;

  public NewPrimitiveWizard() {
    setWindowTitle("New Primitive ADL");
  }

  @Override
  public boolean performFinish() {
    if (super.performFinish()) {
      if (newAdlPage.genDataButton.getSelection()
          && !newAdlPage.inlineDataButton.getSelection()) {

        MindPackage pkg = page.getPackage();
        IFile dataFile = pkg.getFolder().getFile(
            newAdlPage.dataNameText.getText());
        String dataContent = generateData(page.getFQN());
        try {
          dataFile.create(new StringInputStream(dataContent), 0, null);
        } catch (CoreException e) {
          e.printStackTrace();
          return false;
        }
      }

      if (newAdlPage.genSrcButton.getSelection()) {

        MindPackage pkg = page.getPackage();
        IFile srcFile = pkg.getFolder().getFile(
            newAdlPage.srcNameText.getText());
        String srcContent = generateSource();
        try {
          srcFile.create(new StringInputStream(srcContent), 0, null);
        } catch (CoreException e) {
          e.printStackTrace();
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }

  protected String generateData(String name) {
    StringBuilder sb = new StringBuilder();

    String gard = name.replace('.', '_').toUpperCase();
    sb.append("#ifndef __").append(gard).append("\n#define __").append(gard)
        .append("\n");
    sb.append("\nstruct {\n  \n} PRIVATE;\n");
    sb.append("\n#endif /* ").append(gard).append(" */");
    return sb.toString();
  }

  protected String generateSource() {
    return "\n\n";
  }

  protected ADLContent generateContent(String name) {
    StringBuilder sb = new StringBuilder();
    generateImports(sb);

    if (newAdlPage.singletonButton.getSelection()) {
      sb.append("@Singleton\n");
    }
    if (newAdlPage.ctrlButton.getSelection()) {
      sb.append("@controller.StdControllers\n");
    }
    if (newAdlPage.lccButton.getSelection()) {
      sb.append("@controller.LifeCycleController\n");
    }
    sb.append("primitive ").append(name);
    generateExtends(sb);
    sb.append(" {\n  ");
    int offset = sb.length();
    if (newAdlPage.genDataButton.getSelection()) {
      // generate data
      sb.append("\n  data ");
      if (newAdlPage.inlineDataButton.getSelection()) {
        sb.append("{{ \n    struct {\n      \n    } PRIVATE;\n  }}");
      } else {
        sb.append(newAdlPage.dataNameText.getText());
      }
      sb.append(";");
    }
    if (newAdlPage.genSrcButton.getSelection()) {
      // generate data
      sb.append("\n  source ").append(newAdlPage.srcNameText.getText())
          .append(";");
    }
    sb.append("\n}");
    return new ADLContent(sb.toString(), offset);
  }

  @Override
  protected NewDefinitionWizardPage createPage() {
    return newAdlPage;
  }
}
