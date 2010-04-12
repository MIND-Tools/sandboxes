package org.ow2.fractal.mind.xtext.ui.quickfix;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.ui.util.FileUtil;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.quickfix.AbstractDeclarativeQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.validation.*;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.xtext.validation.FractalJavaValidator;

import adl.ArchitectureDefinition;
import adl.FormalArgument;
import adl.ImportDefinition;
import adl.InterfaceDefinition;
import adl.TemplateSpecifier;

/**
 * Provides quick fix for mind adl textual editor
 * 
 * @author Rémi Mélisson
 * @contributor Damien Fournier
 * 
 */
public class OldFractalQuickfixProvider extends
		AbstractDeclarativeQuickfixProvider {

	/**
	 * fix unknown import : delete it
	 * 
	 * @param importDefinition
	 * @param issueContext
	 */

	@Fix(code = FractalJavaValidator.UNKNOWN_IMPORT, label = "Remove unknown import.", description = "Remove this unavailable package.")
	public void fixImport(ImportDefinition importDefinition,
			IssueContext issueContext) {
		EcoreUtil.delete(importDefinition);
		return;
	}

	/**
	 * fix unknown template specifier type: delete it
	 * 
	 * @param importDefinition
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE, label = "Remove unknown template specifier type.", description = "Remove this unavailable template specifier.")
	public void fixTemplateSpecifierType(TemplateSpecifier templateSpecifier,
			IssueContext issueContext) {
		EcoreUtil.delete(templateSpecifier);
		return;
	}

	/**
	 * fix duplicate component name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_COMPONENT_NAME, label = "Rename component", description = "Change this name in order to make it unique.")
	public void fixDuplicateName(ArchitectureDefinition adl,
			IssueContext issueContext) {
		adl.setName(adl.getName() + "1");
		return;
	}

	/**
	 * fix duplicate template specifier name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_TEMPLATE_SPECIFIER_NAME, label = "Rename template specifier", description = "Change this name in order to make it unique.")
	public void fixDuplicateTemplateSpecifierName(
			TemplateSpecifier templateSpecifier, IssueContext issueContext) {
		templateSpecifier.setName(templateSpecifier.getName() + "1");
		return;
	}

	/**
	 * fix duplicate formal argument name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_FORMAL_ARGUMENT_NAME, label = "Rename formal argument", description = "Change this name in order to make it unique.")
	public void fixDuplicateFormalArgumentName(FormalArgument formalArgument,
			IssueContext issueContext) {
		formalArgument.setName(formalArgument.getName() + "1");
		return;
	}

	/**
	 * fix duplicate interface name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_INTERFACE_NAME, label = "Rename interface", description = "Change this name in order to make it unique.")
	public void fixDuplicateInterfaceName(
			InterfaceDefinition interfaceDefinition, IssueContext issueContext) {
		interfaceDefinition.setName(interfaceDefinition.getName() + "1");
		return;
	}

	/**
	 * fix unknown interface
	 * 
	 * @param adl
	 * @param issueContext
	 * @throws IOException
	 */
	@Fix(code = FractalJavaValidator.UNKNOWN_INTERFACE, label = "Create signature", description = "Create interface signature.")
	public void fixUnknownInterface(InterfaceDefinition interfaceDefinition,
			IssueContext issueContext) throws IOException {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IEditorInput editorInput = window.getActivePage().getActiveEditor()
				.getEditorInput();

		if (editorInput instanceof FileEditorInput) {
			IPath path = ((FileEditorInput) editorInput).getPath();
			
			String base = path.toOSString().substring(0,
					path.toOSString().length() - path.lastSegment().length());
			
			File f = new File(base, interfaceDefinition.getSignature()+".itf");
			f.createNewFile();
			
			FileOutputStream output = new FileOutputStream(f);
			
			String fileContent = "interface "+ interfaceDefinition.getSignature() +" {\n\n}";
			
			output.write(fileContent.getBytes());
			output.flush();
			output.close();
			
			// TODO : refresh files
			// TODO : call editor validation
			
		}

		return;
	}
}
