package org.ow2.mindEd.ide.ui.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class TestIDEUIActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.ow2.mindEd.ide.ui.test";

	// The shared instance
	private static TestIDEUIActivator plugin;
	
	/**
	 * The constructor
	 */
	public TestIDEUIActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static TestIDEUIActivator getDefault() {
		return plugin;
	}

	public String[] getPath() {
		ArrayList<String> strings = new ArrayList<String>();
		computePath("/srcTest/", strings);
		return (String[]) strings.toArray(new String[strings.size()]);
	}
	
	public void computePath(String dirpath, ArrayList<String> strings) {
		Enumeration paths = getBundle().getEntryPaths(dirpath);
		while (paths != null && paths.hasMoreElements()) {
			String p = (String) paths.nextElement();
			if (p.endsWith("/")) {
				computePath(p, strings);
				continue;
			}
			IPath path = new Path(p);
			path = path.removeFirstSegments(1).makeRelative();
			if (path.isEmpty()) continue;
			strings.add(path.toPortableString());
		}
	}
	
	
	public String getText(String relPath) {
		URL url = getBundle().getEntry("/srcTest/" + relPath);
		if (url == null)
			return null;
		StringBuilder sb = new StringBuilder();
		BufferedReader in = null;
		try { // Create a URL for the desired page URL
				// Read all the text returned by the server
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			String str;
			while ((str = in.readLine()) != null) {
				// str is one line of text; readLine() strips the newline
				// character(s)
				sb.append(str);
				sb.append("\n");
			}
		} catch (MalformedURLException e) {
			return null;
		} catch (IOException e) {
			return null;
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
				}
		}
		return sb.toString();
	}

}
