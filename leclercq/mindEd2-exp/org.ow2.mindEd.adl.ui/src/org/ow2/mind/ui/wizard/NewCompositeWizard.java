package org.ow2.mind.ui.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.ow2.mind.ui.wizard.NewTypeWizard.ADLContent;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class NewCompositeWizard extends NewDefinitionWizard {

  @Inject
  NewCompositeWizardPage newAdlPage;
  
  public NewCompositeWizard() {
    setWindowTitle("New Composite ADL");
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
    sb.append("composite ").append(name);
    generateExtends(sb);
    sb.append(" {\n  ");
    int offset = sb.length();
    sb.append("\n}");
    return new ADLContent(sb.toString(), offset);
  }

  @Override
  protected NewDefinitionWizardPage createPage() {
    return newAdlPage;
  }
}
