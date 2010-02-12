package org.ow2.fractal.mind.xtext.ui;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.xtext.ui.core.editor.XtextEditor;

import com.google.inject.Binding;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;

import org.ow2.fractal.mind.xtext.FractalRuntimeModule;
import org.ow2.fractal.mind.xtext.internal.FractalActivator;
import org.ow2.fractal.mind.xtext.ui.*;

public class XtextUtil {
	
	public static XtextEditor getEditor() {
		Injector injector = FractalActivator.getInstance().getInjector("org.ow2.fractal.mind.xtext.Fractal");
		injector.getProvider(XtextEditor.class);
		XtextEditor xTextEditor = injector.getInstance(XtextEditor.class);
		return xTextEditor;
	}

}
