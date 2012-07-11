
package org.ow2.minded.project.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.jface.util.SafeRunnable;
import org.ow2.minded.project.Activator;
import org.ow2.minded.project.properties.IMindProjectChangeListener;
import org.ow2.minded.project.properties.MindProjectConfiguration;
import org.ow2.minded.project.properties.ProjectPropertiesConstants;

public class MindNature implements IProjectNature {

  /**
   * ID of this project nature
   */
  public static final String              NATURE_ID              = "org.ow2.mindEd.project.MindNature";

  private static final Logger             log                    = Logger
                                                                     .getLogger(MindNature.class);

  private IProject                        project;
  private MindProjectConfiguration        config;
  private static List<IMindProjectChangeListener> projectChangeListeners = new ArrayList<IMindProjectChangeListener>();

  public static MindNature getNature(IProject project) throws CoreException {
    return (MindNature) project.getNature(NATURE_ID);
  }

  public static boolean hasNature(IProject project) {
    try {
      if (project.isAccessible()) {
        return project.hasNature(NATURE_ID);
      }
    } catch (CoreException e) {
      log.error(e.getMessage(), e);
    }
    return false;
  }

  public static void addMindProjectChangeListener(IMindProjectChangeListener listener) {
    projectChangeListeners.add(listener);
  }
  
  public static void removeProjectChangeListener(IMindProjectChangeListener listener) {
    projectChangeListeners.add(listener);
  }
  
  public static void notifyConfigurationChanged(final MindProjectConfiguration configuration) {
    for (final IMindProjectChangeListener listener : projectChangeListeners) {
      SafeRunnable.run(new ISafeRunnable() {
        
        @Override
        public void run() throws Exception {
          listener.configurationChanged(configuration);
        }
        
        @Override
        public void handleException(Throwable exception) {
          // nothing todo
        }
      });
    }
  }
  
  public MindProjectConfiguration getConfiguration() throws CoreException {
    if (config == null) {
      config = new MindProjectConfiguration(project);
    }
    return config;
  }

  public IEclipsePreferences getProjectSepcificPreferences() {
    IScopeContext projectScope = new ProjectScope(project);
    return projectScope.getNode(Activator.PLUGIN_ID);
  }

  public List<IContainer> getSourceFolders() throws CoreException {
	return new ArrayList<IContainer>(getConfiguration().getSourceFolders());
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.core.resources.IProjectNature#configure()
   */
  public void configure() throws CoreException {
    IProjectDescription desc = project.getDescription();
    ICommand[] commands = desc.getBuildSpec();

    for (int i = 0; i < commands.length; ++i) {
      if (commands[i].getBuilderName().equals(MindcBuilder.BUILDER_ID)) {
        return;
      }
    }

    ICommand[] newCommands = new ICommand[commands.length + 1];
    System.arraycopy(commands, 0, newCommands, 0, commands.length);
    ICommand command = desc.newCommand();
    command.setBuilderName(MindcBuilder.BUILDER_ID);
    newCommands[newCommands.length - 1] = command;
    desc.setBuildSpec(newCommands);
    project.setDescription(desc, null);
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.core.resources.IProjectNature#deconfigure()
   */
  public void deconfigure() throws CoreException {
    IProjectDescription description = getProject().getDescription();
    ICommand[] commands = description.getBuildSpec();
    for (int i = 0; i < commands.length; ++i) {
      if (commands[i].getBuilderName().equals(MindcBuilder.BUILDER_ID)) {
        ICommand[] newCommands = new ICommand[commands.length - 1];
        System.arraycopy(commands, 0, newCommands, 0, i);
        System.arraycopy(commands, i + 1, newCommands, i, commands.length - i
            - 1);
        description.setBuildSpec(newCommands);
        project.setDescription(description, null);
        return;
      }
    }
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.core.resources.IProjectNature#getProject()
   */
  public IProject getProject() {
    return project;
  }

  /*
   * (non-Javadoc)
   * @see
   * org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources
   * .IProject)
   */
  public void setProject(IProject project) {
    this.project = project;
  }

}
