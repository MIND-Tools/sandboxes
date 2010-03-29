/*******************************************************************************
 * Copyright (c) 2006, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 * Francis Upton IV, Oakland Software <francisu@ieee.org> - [common navigator] Drag Java object from Project Explorer to Package Explorer gets "assertion failed" - https://bugs.eclipse.org/bugs/show_bug.cgi?id=263751
 *******************************************************************************/
package org.ow2.fractal.mind.ide.ui.navigator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.internal.navigator.NavigatorContentService;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonDropAdapterAssistant;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindPathItemProvider;

@SuppressWarnings("restriction")
public class MindPathDropAdapterAssistant extends CommonDropAdapterAssistant {

	private EditingDomain _editingDomain;
	private EditingDomainViewerDropAdapter _editingDomainViewerDropAdapter;
	
	
	@Override
	protected void doInit() {
		super.doInit();
		_editingDomain = new AdapterFactoryEditingDomain(MindUICore.mindViewAdapterFactory(), new BasicCommandStack());
		Viewer viewer = ((NavigatorContentService)getContentService()).getViewer();
		_editingDomainViewerDropAdapter = new EditingDomainViewerDropAdapter(_editingDomain, viewer);
	}

	@Override
	public IStatus handleDrop(CommonDropAdapter dropAdapter, DropTargetEvent dropTargetEvent, Object target) {
		
		return Status.CANCEL_STATUS;
	}

	@Override
	public IStatus validateDrop(Object target, int operation, TransferData transferType) {
		if (LocalTransfer.getInstance().isSupportedType(transferType)) {
			target= getActualTarget(target);
			final Object data= LocalTransfer.getInstance().nativeToJava(transferType);
			
			if (data != null) return Status.OK_STATUS;
			
		} 
		return Status.CANCEL_STATUS;
	}

	@Override
	public boolean isSupportedType(TransferData transferType) {
		return super.isSupportedType(transferType) || FileTransfer.getInstance().isSupportedType(transferType);
	}

	private Object getActualTarget(Object target) {
		if (target instanceof MindPathItemProvider) {
			return ((MindPathItemProvider)target).getMindProject();
		}
		return target;
	}
	
}
