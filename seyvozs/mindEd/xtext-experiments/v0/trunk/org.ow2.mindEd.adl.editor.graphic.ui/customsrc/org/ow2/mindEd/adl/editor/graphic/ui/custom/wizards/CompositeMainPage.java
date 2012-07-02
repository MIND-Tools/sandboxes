package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import java.util.ArrayList;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.ide.model.ComponentKind;

public class CompositeMainPage extends WizardPage{

	boolean isSubComponent = false;
	
	Composite topLevel;
	Composite extendsComposite;
	
	Text compositeName;
	
	Button addButton;
	Button modifyButton;
	Button removeButton;
	
	List listBox;
	
	private int style = SWT.BORDER | SWT.SINGLE;
	protected Text uriField;
	
	protected final int HEIGHT_DATA = 200;
	protected final int WIDTH_DATA = 200;
	
	
	protected CompositeMainPage(String pageName, boolean subComponent) {
		super(pageName);
		
		isSubComponent = subComponent;
		
		this.setTitle("Creation Composite Component");
		this.setDescription("Assistant to create a new Composite Component.");
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
		
		new Label(topLevel,SWT.NONE).setText("Name");
        compositeName = new Text(topLevel,SWT.BORDER);
        {
        	compositeName.setFont(parent.getFont());
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 2;
        	compositeName.setLayoutData(constraint);
        	compositeName.setFont(parent.getFont());
        }
        
        Label labelExtends = new Label (topLevel,SWT.NONE);
        labelExtends.setText("Extends");
        {
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 3;
        	labelExtends.setLayoutData(constraint);
        }
        
        if(!isSubComponent)
        {
        	createExtendsButton();
            createButtonListener();
        }
        else
        {
        	createTreeComposite(topLevel);
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
	
	

	private void createButtonListener() {

		addButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				AddElementWizard elementWizard = new AddElementWizard(null, AddElementWizard.TYPES.EXTENDS, ComponentKind.COMPOSITE);
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
						AddElementWizard elementWizard = new AddElementWizard(listBox.getItem(i),AddElementWizard.TYPES.EXTENDS, ComponentKind.COMPOSITE);
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

	private void createExtendsButton() {
		
		addButton = new Button(topLevel, SWT.NONE);
		addButton.setText("Add");
		
		modifyButton = new Button(topLevel, SWT.NONE);
		modifyButton.setText("Modify");
		
		removeButton = new Button(topLevel, SWT.NONE);
		removeButton.setText("Remove");
		
		extendsComposite = new Composite(topLevel, SWT.NONE);
		{
			GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	extendsComposite.setLayoutData(constraint);
			
			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			extendsComposite.setLayout(layout);
			extendsComposite.setFont(topLevel.getFont());
		}
		
		listBox = new List(extendsComposite, SWT.BORDER | SWT.WRAP);
        listBox.setLayoutData(extendsComposite.getLayoutData());
	}
	
	public String getCompositeComponentName(){
		return compositeName.getText();
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
	
	public String getExtendPath(){
		return uriField.getText();
	}

}
