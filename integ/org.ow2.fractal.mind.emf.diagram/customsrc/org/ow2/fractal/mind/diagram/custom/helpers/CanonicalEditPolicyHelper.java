package org.ow2.fractal.mind.diagram.custom.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.DiagramUIPlugin;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.osgi.util.NLS;

import adl.diagram.part.MindVisualIDRegistry;

public class CanonicalEditPolicyHelper {
	
	public static String getDefaultFactoryHint(CanonicalEditPolicy policy) {
//		return ((View)policy.getHost().getModel()).getType();
		return null;
	}
	
	

}
