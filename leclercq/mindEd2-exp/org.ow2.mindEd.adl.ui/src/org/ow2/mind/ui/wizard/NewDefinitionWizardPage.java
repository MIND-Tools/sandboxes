/**
 * Copyright (C) 2010 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.ui.wizard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.FilteredList;
import org.eclipse.ui.dialogs.FilteredList.FilterMatcher;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.label.AbstractLabelProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.ui.AdlUiModule;
import org.ow2.minded.project.builder.MindNature;
import org.ow2.minded.project.properties.MindPackage;
import org.ow2.minded.project.wizards.MindSourceFolderContentProvider;

import com.google.inject.Inject;

public abstract class NewDefinitionWizardPage extends WizardPage {

  Text                            sourceFolderText;
  Text                            packageText;
  Button                          packageBrowseButton;
  Text                            nameText;
  TableViewer                     extendsList;
  Button                          addExtendsButton;
  List<Definition>                extendedDefs;
  Button                          upButton;
  Button                          removeButton;
  Button                          downButton;

  @Inject
  private ILabelProvider          adlLabelProvider;

  @Inject
  private PackageLabelProvider    packageLabelProvider;

  @Inject
  protected IResourceDescriptions resourceDescriptions;

  @Inject
  private IStorage2UriMapper      mapper;

  @Inject
  protected XtextResourceSet      resourceSet;

  public NewDefinitionWizardPage(String pageName) {
    super(pageName);
  }
  
  @Override
  public NewDefinitionWizard getWizard() {
    return (NewDefinitionWizard) super.getWizard();
  }

  public IFolder getSourceFolder() {
    if (sourceFolderText.getText().length() == 0) return null;
    try {
      return ResourcesPlugin.getWorkspace().getRoot()
          .getFolder(new Path(sourceFolderText.getText()));
    } catch (IllegalArgumentException e) {
      return null;
    }
  }

  public MindPackage getPackage() {
    IFolder sourceFolder = getSourceFolder();
    if (sourceFolder == null) return null;

    String packagePath = packageText.getText().replace('.', '/');
    IFolder packageFolder = sourceFolder.getFolder(packagePath);
    return new MindPackage(packageFolder, packageText.getText());
  }

  public String getFQN() {
    String pkg = packageText.getText();
    return (pkg.length() == 0) ? nameText.getText() : pkg + '.' + nameText.getText();
  }
  
  public void createControl(Composite parent) {
    final Composite page = new Composite(parent, SWT.NONE);
    final GridLayout gridLayout = new GridLayout();
    page.setLayout(gridLayout);

    Composite composite = new Composite(page, SWT.NONE);
    composite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
        true));

    final GridLayout gridLayout_1 = new GridLayout();
    gridLayout_1.numColumns = 3;
    composite.setLayout(gridLayout_1);

    // -------------------------------------------------------------------------
    // Source folder line

    Label sourceFolder = new Label(composite, SWT.NONE);
    sourceFolder.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    sourceFolder.setText("Source folder:");

    sourceFolderText = new Text(composite, SWT.BORDER);
    sourceFolderText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
        true, false));
    
    try {
      IFolder contextSourceFolder = getWizard().getContextSourceFolder();
      if (contextSourceFolder != null) {
        sourceFolderText.setText(contextSourceFolder.getFullPath().toString());
      }
    } catch (CoreException e) {
      // ignore
      e.printStackTrace();
    }
    
    sourceFolderText.addModifyListener(new ModifyListener() {
      public void modifyText(final ModifyEvent e) {
        validate();
      }
    });

    Button srcFolderBrowseButton = new Button(composite, SWT.NONE);
    srcFolderBrowseButton.setLayoutData(new GridData(GridData.FILL,
        GridData.BEGINNING, false, false));
    srcFolderBrowseButton.setText("Browse...");
    srcFolderBrowseButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseSourceFolder();
      }
    });

    // -------------------------------------------------------------------------
    // Package line

    Label packageLabel = new Label(composite, SWT.NONE);
    packageLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    packageLabel.setText("Package:");

    packageText = new Text(composite, SWT.BORDER);
    packageText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
        true, false));
    
    try {
      String contextPackageName = getWizard().getContextPackageName();
      if (contextPackageName != null) {
        packageText.setText(contextPackageName);
      }
    } catch (CoreException e) {
      // ignore
      e.printStackTrace();
    }

    
    packageText.addModifyListener(new ModifyListener() {
      public void modifyText(final ModifyEvent e) {
        validate();
      }
    });

    packageBrowseButton = new Button(composite, SWT.NONE);
    packageBrowseButton.setLayoutData(new GridData(GridData.FILL,
        GridData.BEGINNING, false, false));
    packageBrowseButton.setText("&Browse...");
    packageBrowseButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browsePackage();
      }
    });

    Label separator = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
    separator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3,
        1));

    // -------------------------------------------------------------------------
    // Adl name line

    Label nameLabel = new Label(composite, SWT.NONE);
    nameLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    nameLabel.setText("Name:");

    nameText = new Text(composite, SWT.BORDER);
    nameText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
        false));
    nameText.addModifyListener(new ModifyListener() {
      public void modifyText(final ModifyEvent e) {
        validate();
      }
    });
    nameText.addFocusListener(new FocusListener() {
      
      public void focusLost(FocusEvent e) {
        System.out.println("nameText focus lost");
      }
      
      public void focusGained(FocusEvent e) {
        System.out.println("nameText focus gained");
      }
    });

    Label padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));

    // -------------------------------------------------------------------------
    // modifiers line

    createModifierLine(composite);

    // -------------------------------------------------------------------------
    // Extends line

    Label extendsLabel = new Label(composite, SWT.NONE);
    extendsLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    extendsLabel.setText("Extends:");

    extendsList = new TableViewer(composite, SWT.BORDER);
    extendsList.setLabelProvider(adlLabelProvider);
    extendsList.setContentProvider(new ArrayContentProvider());
    extendedDefs = new ArrayList<Definition>();
    extendsList.setInput(extendedDefs);
    Control extendsListControl = extendsList.getControl();
    extendsListControl.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
        true, true, 1, 4));
    extendsList.addSelectionChangedListener(new ISelectionChangedListener() {
      public void selectionChanged(SelectionChangedEvent event) {
        validate();
      }
    });

    addExtendsButton = new Button(composite, SWT.NONE);
    addExtendsButton.setLayoutData(new GridData(GridData.FILL,
        GridData.BEGINNING, false, false));
    addExtendsButton.setText("&Add...");
    addExtendsButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        addExtends();
      }
    });

    padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));

    removeButton = new Button(composite, SWT.NONE);
    removeButton.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING,
        false, false));
    removeButton.setText("&Removes");
    removeButton.setEnabled(!extendsList.getSelection().isEmpty());
    removeButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        removeExtends();
      }
    });

    padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));

    upButton = new Button(composite, SWT.NONE);
    GridData layoutData = new GridData(GridData.FILL, GridData.BEGINNING,
        false, false);
    layoutData.verticalIndent = 10;
    upButton.setLayoutData(layoutData);
    upButton.setText("&Up");
    upButton.setEnabled(!extendsList.getSelection().isEmpty());
    upButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        upExtends();
      }
    });

    padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));

    downButton = new Button(composite, SWT.NONE);
    downButton.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING,
        false, false));
    downButton.setText("&Down");
    downButton.setEnabled(!extendsList.getSelection().isEmpty());
    downButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        downExtends();
      }
    });
    
    // -------------------------------------------------------------------------
    // Extends line

    createEndLine(composite);

    setControl(page);
    validate();
    // do not show error message when the dialog appears.
    setErrorMessage(null);

    System.out.println("force focus");
    nameText.forceFocus();
  }

  protected abstract void createModifierLine(Composite composite);
  protected abstract void createEndLine(Composite composite);

  protected void browsePackage() {
    IFolder sourceFolder = getSourceFolder();
    if (!sourceFolder.exists()) return;
    List<MindPackage> packages;
    try {
      packages = MindNature.getNature(sourceFolder.getProject())
          .getConfiguration().getPackages(sourceFolder);
    } catch (CoreException e) {
      e.printStackTrace();
      return;
    }

    ElementListSelectionDialog dialog = new ElementListSelectionDialog(
        getShell(), packageLabelProvider);
    dialog.setTitle("Package Selection");
    dialog.setMessage("Choose a package");
    dialog.setMultipleSelection(false);
    dialog.setElements(packages.toArray());
    String currentPackage = packageText.getText();
    for (MindPackage pkg : packages) {
      if (pkg.getName().equals(currentPackage)) {
        dialog.setInitialSelections(new Object[]{pkg});
        break;
      }
    }
    int r = dialog.open();
    if (r == Window.OK) {
      Object[] result = dialog.getResult();
      if (result.length > 0) {
        packageText.setText(((MindPackage) result[0]).getName());
      }
    }
    validate();
  }

  protected void browseSourceFolder() {
    ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
        getShell(), new WorkbenchLabelProvider(),
        new MindSourceFolderContentProvider());
    dialog.setTitle("Source Folder Selection");
    dialog.setMessage("Choose a source folder");
    dialog.setAllowMultiple(false);
    dialog.setDoubleClickSelects(true);
    dialog.setValidator(new ISelectionStatusValidator() {

      public IStatus validate(Object[] selection) {
        if (selection.length == 0 || !(selection[0] instanceof IFolder)) {
          return new Status(IStatus.ERROR, AdlUiModule.ID,
              "Select a source folder");
        }
        return Status.OK_STATUS;
      }
    });
    dialog.setInput(ResourcesPlugin.getWorkspace());
    IFolder sourceFolder = getSourceFolder();
    if (sourceFolder != null && sourceFolder.exists()) {
      dialog.setInitialSelection(sourceFolder);
    }
    int r = dialog.open();
    if (r == Window.OK) {

      Object[] result = dialog.getResult();
      if (result.length > 0) {
        sourceFolderText
            .setText(((IFolder) result[0]).getFullPath().toString());
      }
    }
    validate();
  }

  protected void addExtends() {
    List<Definition> accessibleDefinitions = getAccessibleDefinitions();

    ElementListSelectionDialog dialog = new ElementListSelectionDialog(
        getShell(), adlLabelProvider) {
      @Override
      protected FilteredList createFilteredList(Composite parent) {
        FilteredList filteredList = super.createFilteredList(parent);
        filteredList.setFilterMatcher(new FilterMatcher() {
          String  pattern;
          boolean ignoreCase;

          public void setFilter(String pattern, boolean ignoreCase,
              boolean ignoreWildCards) {
            this.pattern = pattern;
            this.ignoreCase = ignoreCase;
          }

          public boolean match(Object element) {
            String text = adlLabelProvider.getText(element);
            if (ignoreCase) {
              return text.toLowerCase().contains(pattern.toLowerCase());
            } else {
              return text.contains(pattern);
            }
          }
        });
        return filteredList;
      }
    };
    dialog.setTitle("Extended ADL(s) Selection");
    dialog.setMessage("Choose extended ADL(s)");
    dialog.setMultipleSelection(true);
    dialog.setElements(accessibleDefinitions.toArray());

    int r = dialog.open();
    if (r == Window.OK) {
      Object[] result = dialog.getResult();
      for (Object d : result) {
        extendedDefs.add((Definition) d);
      }
    }
    extendsList.refresh();
    validate();
  }

  protected void removeExtends() {
    IStructuredSelection selection = (IStructuredSelection) extendsList
        .getSelection();
    for (Object d : selection.toArray()) {
      extendedDefs.remove(d);
    }
    extendsList.refresh();
    validate();
  }

  protected void downExtends() {
    IStructuredSelection selection = (IStructuredSelection) extendsList
        .getSelection();
    for (Object d : selection.toArray()) {
      for (int i = 0; i < extendedDefs.size() - 1; i++) {
        if (extendedDefs.get(i) == d) {
          extendedDefs.add(i + 1, extendedDefs.remove(i));
          break;
        }
      }
    }
    extendsList.refresh();
    validate();
  }

  protected void upExtends() {
    IStructuredSelection selection = (IStructuredSelection) extendsList
        .getSelection();
    for (Object d : selection.toArray()) {
      for (int i = 1; i < extendedDefs.size(); i++) {
        if (extendedDefs.get(i) == d) {
          extendedDefs.add(i - 1, extendedDefs.remove(i));
        }
      }
    }
    extendsList.refresh();
    validate();
  }

  protected void validate() {
    setErrorMessage(null);
    setMessage(null, WARNING);
    setPageComplete(true);

    IStructuredSelection selection = (IStructuredSelection) extendsList
        .getSelection();
    boolean enabled = !selection.isEmpty();
    removeButton.setEnabled(enabled);
    upButton.setEnabled(enabled
        && selection.getFirstElement() != extendedDefs.get(0));
    downButton
        .setEnabled(enabled
            && selection.getFirstElement() != extendedDefs.get(extendedDefs
                .size() - 1));

    // validate source folder
    IFolder sourceFolder = getSourceFolder();
    if (sourceFolder == null || !sourceFolder.exists()) {
      setErrorMessage("Source folder '" + sourceFolderText.getText()
          + "' does not exist.");
      packageBrowseButton.setEnabled(false);
      addExtendsButton.setEnabled(false);
      setPageComplete(false);
      return;
    }
    packageBrowseButton.setEnabled(true);
    addExtendsButton.setEnabled(true);

    // validate package
    String pkgName = packageText.getText();
    if (pkgName.length() > 0 && !AdlModelHelper.isValidFQN(pkgName)) {
      setErrorMessage("Invalid package name '" + pkgName + "'.");
      setPageComplete(false);
      return;
    }
    MindPackage pkg = getPackage();
    if (!pkg.getFolder().exists()) {
      setMessage("The package '" + pkgName
          + "' does not exist. It will be created", WARNING);
    }

    // validate name
    String name = nameText.getText();
    if (name.length() == 0) {
      setErrorMessage("ADL name is empty.");
      setPageComplete(false);
      return;
    }
    if (!AdlModelHelper.isValidIdentifier(name)) {
      setErrorMessage("Invalid ADL name '" + name + "'.");
      setPageComplete(false);
      return;
    }
    IFile adlFile = pkg.getFolder().getFile(new Path(name + ".adl"));
    if (adlFile.exists()) {
      setErrorMessage("ADL already exists.");
      setPageComplete(false);
      return;
    }

    validateComplement();
  }
  
  protected abstract void validateComplement();

  protected List<Definition> getAccessibleDefinitions() {
    IFolder sourceFolder = getSourceFolder();
    if (!sourceFolder.exists()) return Collections.emptyList();
    List<IFile> accessibleADLs;
    try {
      accessibleADLs = MindNature.getNature(sourceFolder.getProject())
          .getConfiguration().getAllAccessibleADLs();
    } catch (CoreException e) {
      e.printStackTrace();
      return Collections.emptyList();
    }

    Set<String> extendedDefNames = new HashSet<String>(extendedDefs.size());
    for (Definition d : extendedDefs) {
      extendedDefNames.add(d.getName());
    }

    List<Definition> result = new ArrayList<Definition>(accessibleADLs.size());
    for (IFile accessibleADL : accessibleADLs) {
      IResourceDescription resourceDescription = resourceDescriptions
          .getResourceDescription(mapper.getUri(accessibleADL));
      if (resourceDescription == null) continue;
      Iterator<IEObjectDescription> exportedDefs = resourceDescription
          .getExportedObjects(AdlPackage.eINSTANCE.getDefinition()).iterator();
      if (!exportedDefs.hasNext()) continue;
      IEObjectDescription exportedDef = exportedDefs.next();
      Definition def = (Definition) exportedDef.getEObjectOrProxy();
      if (def.eIsProxy()) {
        def = (Definition) EcoreUtil.resolve(def, resourceSet);
      }
      if (!extendedDefNames.contains(def.getName())
          && isValidSuperDefinition(def)) {
        result.add(def);
      }
    }
    return result;
  }

  protected abstract boolean isValidSuperDefinition(Definition def);

  private static final class PackageLabelProvider extends AbstractLabelProvider {
    @Override
    protected Object doGetImage(Object element) {
      if (element instanceof MindPackage) {
        return "small16/Package.png";
      } else {
        return super.doGetImage(element);
      }
    }

    @Override
    protected Object doGetText(Object element) {
      if (element instanceof MindPackage) {
        String name = ((MindPackage) element).getName();
        return (name.length() == 0) ? "(default package)" : name;
      } else {
        return super.doGetText(element);
      }
    }
  }
}
