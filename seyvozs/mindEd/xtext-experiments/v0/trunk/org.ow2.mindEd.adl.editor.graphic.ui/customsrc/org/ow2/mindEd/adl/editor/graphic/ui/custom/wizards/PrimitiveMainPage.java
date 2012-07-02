package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import java.util.ArrayList;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.ide.model.ComponentKind;

public class PrimitiveMainPage extends WizardPage{

	public String getPrimitiveName() {
		return primitiveName.getText();
	}

	public boolean isExtend() {
		return extendsButton.getSelection();
	}

	public boolean isOverride() {
		return overrideButton.getSelection();
	}

	public boolean isAnonymous() {
		return anonymousButton.getSelection();
	}
	
	public String getExtendPath(){
		return uriField.getText();
	}

	Composite topLevel;
	Composite extendsComposite; 
	
	boolean isSubComponent = false;
	
	Text primitiveName;
	
	Button extendsButton;
	Button overrideButton;
	Button anonymousButton;
	
	Button addButton;
	Button modifyButton;
	Button removeButton;
	
	List listBox;
	
	TreeViewer treeViewer;
	private int style = SWT.BORDER | SWT.SINGLE;
	protected Text uriField;
	
	protected final int HEIGHT_DATA = 200;
	protected final int WIDTH_DATA = 200;
	
	PrimitiveCreationWizard wizParent;
	
	protected PrimitiveMainPage(String pageName, PrimitiveCreationWizard parent, boolean subComponent) {
		super(pageName);
		isSubComponent = subComponent;
		setTitle(ResourcesWizard.PRIMITIVE_PAGE_TITLE);
		setDescription(ResourcesWizard.PRIMITIVE_PAGE_DESCRIPTION);
		wizParent = parent;
	}

	@Override
	public void createControl(Composite parent) {
		topLevel = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 3;
			topLevel.setLayout(layout);
			topLevel.setFont(parent.getFont());
			setControl(topLevel);
		}
		
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.PRIMITIVE_NAME);
        primitiveName = new Text(topLevel,SWT.BORDER);
        {
        	primitiveName.setFont(parent.getFont());
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 2;
        	primitiveName.setLayoutData(constraint);
        	primitiveName.setFont(parent.getFont());
        }
        
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.PRIMITIVE_TYPE);
        
        
        extendsButton = new Button(topLevel, SWT.RADIO);
        {
        	GridData Constraint = new GridData();
            Constraint.horizontalAlignment = SWT.END;
            extendsButton.setLayoutData(Constraint);
        }
        Label extendsLabel = new Label(topLevel,SWT.NONE);
        extendsLabel.setText(ResourcesWizard.PRIMITIVE_EXTENDS);
        extendsLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				extendsButton.setSelection(true);
				overrideButton.setSelection(false);
				anonymousButton.setSelection(false);
				extendsComposite.setVisible(true);
				wizParent.disableSecondPage();
			}
			@Override
			public void mouseUp(MouseEvent e) {}
        });
        
        
        overrideButton = new Button(topLevel, SWT.RADIO);
        Label overrideLabel = new Label(topLevel,SWT.NONE);
        overrideLabel.setText(ResourcesWizard.PRIMITIVE_OVERRIDE);
        overrideLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				overrideButton.setSelection(true);
				anonymousButton.setSelection(false);
				extendsButton.setSelection(false);
				extendsComposite.setVisible(true);
				wizParent.enableSecondPage();
			}
			@Override
			public void mouseUp(MouseEvent e) {}
        });
        
        anonymousButton = new Button(topLevel, SWT.RADIO);
        Label anonymousLabel = new Label(topLevel,SWT.NONE);
        anonymousLabel.setText(ResourcesWizard.PRIMITIVE_ANONYMUS);
        anonymousLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				anonymousButton.setSelection(true);
				overrideButton.setSelection(false);
				extendsButton.setSelection(false);
				extendsComposite.setVisible(false);
				wizParent.enableSecondPage();
			}
			@Override
			public void mouseUp(MouseEvent e) {}
        });
        
        {
        	GridData constraint = new GridData();
            constraint.horizontalAlignment = SWT.END;
            constraint.horizontalSpan = 2;
            overrideButton.setLayoutData(constraint);
            anonymousButton.setLayoutData(constraint);
        }
        createRadioListener();
        
        if(!isSubComponent)
        {
        	createListBoxExtends(topLevel);
        	createButtonListener();
        }
        else
        {
        	createTreeComposite(topLevel);
        }
		
	}

	private void createListBoxExtends(Composite parent) {
		
		extendsComposite = new Composite(parent, SWT.NONE);
		{
			GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	extendsComposite.setLayoutData(constraint);
			
			GridLayout layout = new GridLayout ();
			layout.numColumns = 3;
			extendsComposite.setLayout(layout);
			extendsComposite.setFont(parent.getFont());
		}		
		
		addButton = new Button(extendsComposite, SWT.NONE);
		addButton.setText("Add");
		
		modifyButton = new Button(extendsComposite, SWT.NONE);
		modifyButton.setText("Modify");
		
		removeButton = new Button(extendsComposite, SWT.NONE);
		removeButton.setText("Remove");
		
		listBox = new List(extendsComposite, SWT.BORDER | SWT.WRAP);
		{
			GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	listBox.setLayoutData(constraint);
		}
        
	}

	private void createTreeComposite(Composite parent) {
		extendsComposite = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			extendsComposite.setLayout(layout);
        	extendsComposite.setVisible(true);
        	extendsComposite.setFont(parent.getFont());

        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	extendsComposite.setLayoutData(constraint);
        	
		}
		uriField = CreationTreeViewer.createTreeComposite(extendsComposite, style, HEIGHT_DATA, ".adl");
	}

	private void createRadioListener() {
		
		extendsButton.addSelectionListener(new SelectionListener()		
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(extendsButton.getSelection())
				{
					extendsComposite.setVisible(true);
					wizParent.disableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		overrideButton.addSelectionListener(new SelectionListener()		
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(overrideButton.getSelection())
				{
					extendsComposite.setVisible(true);
					wizParent.enableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		anonymousButton.addSelectionListener(new SelectionListener()		
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(anonymousButton.getSelection())
				{
					extendsComposite.setVisible(false);
					wizParent.enableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
	}
	
	private void createButtonListener() {

		addButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				AddElementWizard elementWizard = new AddElementWizard(null, AddElementWizard.TYPES.EXTENDS, ComponentKind.PRIMITIVE);
				WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), elementWizard);
				wizDialog.setBlockOnOpen(true);
				if(wizDialog.open() == WizardDialog.OK)
				{
					ImplementationInformation implInfotmation = elementWizard.getImplementationInformation();
					
					if(implInfotmation.isFile())
					{
						String[] tabImpl = listBox.getItems();
						ArrayList<String> listImpl = new ArrayList<String>();
							
						for(String impl : tabImpl)
						{
							listImpl.add(impl);
						}
						if(!listImpl.contains(implInfotmation.getFilePath()))
							listBox.add(implInfotmation.getFilePath());
					}
					else if(implInfotmation.isInline())
					{
						listBox.add(implInfotmation.getInlineText());
					}
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {}
		});
		
		removeButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				int listIndex[] = listBox.getSelectionIndices();
				if(listIndex.length != 0)
				{
					listBox.remove(listIndex);
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {
			}
		});
		
		modifyButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				int listIndex[] = listBox.getSelectionIndices();
				if(listIndex.length != 0)
				{
					for(int i : listIndex)
					{
						AddElementWizard elementWizard = new AddElementWizard(listBox.getItem(i),AddElementWizard.TYPES.EXTENDS, ComponentKind.PRIMITIVE);
						WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), elementWizard);
						wizDialog.setBlockOnOpen(true);
						if(wizDialog.open() == WizardDialog.OK)
						{
							listBox.remove(i);
							ImplementationInformation implInfotmation = elementWizard.getImplementationInformation();
							
							if(implInfotmation.isFile())
							{
								String[] tabImpl = listBox.getItems();
								ArrayList<String> listImpl = new ArrayList<String>();
									
								for(String impl : tabImpl)
								{
									listImpl.add(impl);
								}
								if(!listImpl.contains(implInfotmation.getFilePath()))
									listBox.add(implInfotmation.getFilePath());
							}
							else if(implInfotmation.isInline())
							{
								listBox.add(implInfotmation.getInlineText());
							}
						}
					}
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {
			}
		});

		
	}
	
	public ArrayList<String> getListExtends()
	{
		ArrayList<String> listImpl = new ArrayList<String>();
		if(listBox != null)
		{
			String listItem[] = listBox.getItems();
			for(String impl : listItem)
			{
				listImpl.add(impl);
			}
			
			return listImpl;
		}
		else return null;
	}
	

}
