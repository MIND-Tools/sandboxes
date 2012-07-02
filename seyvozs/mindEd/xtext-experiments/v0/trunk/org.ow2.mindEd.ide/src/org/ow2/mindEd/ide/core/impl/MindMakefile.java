/**
 * 
 */
package org.ow2.mindEd.ide.core.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.cdt.make.core.makefile.IDirective;
import org.eclipse.cdt.make.core.makefile.IMakefile;
import org.eclipse.cdt.make.core.makefile.IMakefileReaderProvider;
import org.eclipse.cdt.make.core.makefile.IParent;
import org.eclipse.cdt.make.core.makefile.ITargetRule;
import org.eclipse.cdt.make.core.makefile.gnu.IGNUMakefile;
import org.eclipse.cdt.make.core.makefile.gnu.IVariableDefinition;
import org.eclipse.cdt.make.internal.core.makefile.gnu.GNUMakefile;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

public class MindMakefile {
	static class Change {
		public static int ADD = 0;
		public static int CHANGE = 1;
		public static int REMOVE = 2;

		String[] lines;
		int start;
		int end;
		int kind; // add, change, remove
		Change next;

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();

			toString(sb);
			return sb.toString();
		}

		private void toString(StringBuilder sb) {
			sb.append("[").append(
					kind == ADD ? "add" : kind == CHANGE ? "change" : "remove")
					.append(" ");
			sb.append(start).append(":").append(end);
			sb.append("]");
			if (next != null)
				next.toString(sb);

		}
	}

	static public final String MAKEFILE = "Makefile";
	static public final String MIND_SRC = "MIND_SRC";
	static public final String MIND_COMPONENTS = "MIND_COMPONENTS";

	private IGNUMakefile _makefile;
	private IFile _file;
	private String[] _lines;
	private Change[] _changes;

	public MindMakefile(IProject p) {
		_file = p.getFile(MAKEFILE);
	}

	private String[] readLines() throws IOException, CoreException {
		LineNumberReader r = new LineNumberReader(new InputStreamReader(EFS
				.getStore(_file.getLocationURI()).openInputStream(EFS.NONE,
						null)));
		ArrayList<String> linesArray = new ArrayList<String>();
		while (true) {
			String l = r.readLine();
			if (l == null)
				break;
			linesArray.add(l);
		}
		return (String[]) linesArray.toArray(new String[linesArray.size()]);
	}
	
	public IGNUMakefile readMakeFile() {
		URI fileURI = _file.getLocationURI();
		GNUMakefile gnu = new GNUMakefile();
		if (fileURI == null)
			return gnu;
		
		ArrayList includeList = new ArrayList();
		includeList.add(new Path(fileURI.getPath()).removeLastSegments(1).toString());
		includeList.addAll(Arrays.asList(gnu.getIncludeDirectories()));
		String[] includes = (String[]) includeList.toArray(new String[includeList.size()]);
		gnu.setIncludeDirectories(includes);
		if (_file.exists())
			try {
				IMakefileReaderProvider makefileReaderProvider = null;
				gnu.parse(fileURI, makefileReaderProvider);
			} catch (IOException e) {
			}
		return gnu;
	}

	public void setMIND_SRC(String value) throws CoreException, IOException {
		setMakefileVariable(MIND_SRC, value);
	}

	public IVariableDefinition setMakefileVariable(String nameVar, String value)
			throws CoreException, IOException {
		if (_makefile == null)
			_makefile = readMakeFile();

		for (IDirective d : _makefile.getDirectives()) {
			if (d instanceof IVariableDefinition) {
				IVariableDefinition v = (IVariableDefinition) d;
				if (v.getName().equals(nameVar)) {
					v.getValue().setLength(0);
					v.getValue().append(value);
					changeLines(v);
					return v;
				}
			}
		}
		return null;
	}

	public IMakefile getMakefile() {
		if (_makefile == null)
			_makefile = readMakeFile();
		return _makefile;
	}

	public void addExt(int line, String... arglines) throws IOException,
			CoreException {
		if (_lines == null)
			_lines = readLines();
		if (_changes == null)
			_changes = new Change[_lines.length];
		Change c = new Change();
		c.start = line;
		c.end = line;
		c.lines = arglines;
		c.kind = Change.ADD;

		c.next = _changes[line - 1];
		_changes[line - 1] = c;
	}

	public ITargetRule findTarget(String name) {
		if (_makefile == null)
			_makefile = readMakeFile();
		ITargetRule[] trules = _makefile.getTargetRules();
		for (int i = 0; i < trules.length; i++) {
			if (trules[i].getTarget().toString().equals(name)) {
				return trules[i];
			}
		}
		return null;
	}

	public String getMakefileVariable(String nameVar) throws CoreException,
			IOException {
		if (_makefile == null)
			_makefile = readMakeFile();
		for (IDirective d : _makefile.getDirectives()) {
			if (d instanceof IVariableDefinition) {
				IVariableDefinition v = (IVariableDefinition) d;
				if (v.getName().equals(nameVar)) {
					return v.getValue().toString();
				}
			}
		}
		return "";
	}

	public String getMIND_SRC() throws CoreException, IOException {
		return getMakefileVariable(MIND_SRC);
	}

	public void write() throws CoreException {
		if (_lines == null)
			return;

		StringBuilder sb = new StringBuilder();

		Change current = null;
		for (int i = 0; i < _lines.length; i++) {
			if (current != null)
				if (current.end < i)
					current = null;
				else
					continue;
			if (_changes != null) {
				Change cl = _changes[i];
				for (; cl != null; cl = cl.next) {
					if (cl.kind == Change.ADD) {
						for (String l : cl.lines) {
							sb.append(l).append("\n");
						}
					}
				}
				cl = _changes[i];
				for (; cl != null; cl = cl.next) {
					if (cl.kind == Change.ADD)
						continue;
					if (cl.kind == Change.CHANGE) {
						for (String l : cl.lines) {
							sb.append(l).append("\n");
						}
					}
					current = cl;
					break;
				}
			}
			if (current == null)
				sb.append(_lines[i]).append("\n");
		}
		_file.setContents(new ByteArrayInputStream(sb.toString().getBytes()),
				true, true, null);
		_makefile = null;
		_lines = null;
		_changes = null;
	}

	private void changeLines(IVariableDefinition v) throws IOException,
			CoreException {
		if (_lines == null)
			_lines = readLines();
		if (_changes == null)
			_changes = new Change[_lines.length];
		Change c = new Change();
		c.start = v.getStartLine();
		c.end = v.getEndLine();
		c.lines = new String[] { v.toString() };
		c.kind = Change.CHANGE;
		if (exist(c))
			throw new IOException("cannot operate change " + c);
		c.next = _changes[v.getStartLine() - 1];
		_changes[v.getStartLine() - 1] = c;
	}

	private boolean exist(Change c) {
		if (_changes == null)
			return false;
		for (int i = 0; i < c.end; i++) {
			Change cl = _changes[i];
			for (; cl != null; cl = cl.next) {
				if (cl.kind == Change.ADD)
					continue;
				if (cl.end >= c.start || c.end >= cl.start)
					return true;
			}
		}
		return false;
	}

	private void toString(StringBuilder sb, String tab, IParent m) {
		for (IDirective d : m.getDirectives()) {
			sb.append(tab).append(d.toString());
			if (d instanceof IParent)
				toString(sb, tab + " ", (IParent) d);
		}
	}
	
/**
 * Set a new value to variable <code>varName</code>. If var is found and current value equals new value, do nothing.
 * If var is not found insert var before target <code>targetBefore</code>.
 * Save make file if changed.
 * @param varName  the name of variable
 * @param newValue the new value
 * @param targetBefore the name of the target before which insert var if need.
 * @throws CoreException
 * @throws IOException
 */
	public void setVarAndSave(String varName, String newValue,
			String targetBefore) throws CoreException, IOException {
		String currentVar = getMakefileVariable(varName);
		if (currentVar != null && currentVar.equals(newValue))
			return;
		if (setMakefileVariable(varName, newValue) == null) {
			ITargetRule t = findTarget(targetBefore);
			if (t != null) {
				addExt(t.getStartLine(), varName + "=" + newValue, "");
			}
		}
		write();
	}
}