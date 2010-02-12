package org.ow2.fractal.mind.ide.ui.emf.field;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.fieldassist.ContentAssistCommandAdapter;

public class BrowserField implements IContentProposalListener, IContentProposalProvider {
	EObject _obj;
	EReference _ref;
	
	String _label;
	String _buttonlabel = "...";
	int _styleText = SWT.BORDER | SWT.SINGLE;
	
	
	
	public BrowserField(EObject obj, EReference ref, String label) {
		super();
		_obj = obj;
		_ref = ref;
		_label = label;
		_selectMessage ="select an object of type "+_ref.getEType().getInstanceTypeName();
	}

	private Text _textControl;
	private Button _buttonBrowser;
	protected String _currentValueTextToSend;
	protected boolean _sendNotification = true;
	private Label _labelWidget;
	private AdapterFactory _adapterFactory;
	FieldResource _resource;
	private String _selectMessage;
	
	public void createControl(Composite composite, int hspan) {
		_labelWidget = new Label(composite, SWT.None);
		_labelWidget.setText(_label);
		TextContentAdapter proposer = getProposer();
		IContentProposalProvider contentProposalProvider = getContentProposalProvider();
		String commandId = getCommandId();
	
		if (!isTextEditable()) {
			_styleText |= SWT.READ_ONLY;
		}
		_textControl = new Text(composite, _styleText);
		if (isEditable() && proposer != null) {
			char[] autoChar = getAutoActivationCharacters();
			ContentAssistCommandAdapter _contentAssistField = 
				new ContentAssistCommandAdapter(_textControl, proposer, contentProposalProvider, commandId, autoChar ,
					true);
			_contentAssistField.setProposalAcceptanceStyle(getProposalAcceptanceStyle());
			_contentAssistField.addContentProposalListener(this);
		}
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = hspan - 1;
		_textControl.setLayoutData(gd);

		if (hasDeleteFunction()) {
			_textControl.addKeyListener(new KeyListener() {

				public void keyPressed(KeyEvent e) {
					if (e.keyCode == 8 || e.keyCode == 127) {
						deleteValue();
					}
				}

				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

				}

			});
		}
		_textControl.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (!_sendNotification ) {
					return;
				}
				_currentValueTextToSend = _textControl.getText();
				sendModificationIfNeed(_currentValueTextToSend, false);

			}
		});

		_textControl.addKeyListener(new KeyListener() {

			
			public void keyPressed(KeyEvent e) {
				if (e.character == '\u001b') { // Escape character
					cancelEditor();
				} else if (e.character == '\n' || e.character == '\r') {
					sendModificationIfNeed(_currentValueTextToSend, true);
				}
			}

			public void keyReleased(KeyEvent e) {
			}

		});

		_textControl.addFocusListener(new FocusListener() {
			private Object _currentValueTextToSend;

			public void focusGained(FocusEvent e) {
			}

			public void focusLost(FocusEvent e) {
				if (_currentValueTextToSend != null)
					sendModificationIfNeed(_currentValueTextToSend, true);
			}
		});

		_buttonBrowser = new Button(composite, SWT.PUSH);
		_buttonBrowser.setText(_buttonlabel);
		_buttonBrowser.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			SelectionEvent e) {
				handleSelect();
			}

			
		});
		
	}

	protected boolean isTextEditable() {
		return false;
	}

	protected void cancelEditor() {
	}

	protected void deleteValue() {
	}

	private boolean hasDeleteFunction() {
		return false;
	}

	protected void sendModificationIfNeed(Object currentValueTextToSend,
			boolean b) {
		
	}
	
	protected void handleSelect() {
		AdapterFactoryLabelProvider renderer = new AdapterFactoryLabelProvider(_adapterFactory);
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(_buttonBrowser.getShell(), renderer);
		dialog.setElements(_resource.findObject(_ref.getEReferenceType(), true).toArray());
		dialog.setMultipleSelection(false);
		dialog.setEmptyListMessage(_selectMessage);
		if (dialog.open() == Window.OK) {
			EObject v = (EObject) dialog.getFirstResult();
			_obj.eSet(_ref, v);
			_textControl.setText(renderer.getText(v));
		}
		
	}

	protected String getCommandId() {
		return org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS;
	}

	protected int getProposalAcceptanceStyle() {
		return ContentProposalAdapter.PROPOSAL_REPLACE;
	}
	
	protected char[] getAutoActivationCharacters() {
		return new char[0];
	}

	protected IContentProposalProvider getContentProposalProvider() {
		return this;
	}

	protected TextContentAdapter getProposer() {
		return null;
	}

	
	protected boolean isEditable() {
		return true;
	}

	public void proposalAccepted(IContentProposal proposal) {
		// TODO Auto-generated method stub
		
	}

	public IContentProposal[] getProposals(String contents, int position) {
		// TODO Auto-generated method stub
		return null;
	}
}
