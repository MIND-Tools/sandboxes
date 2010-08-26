/**
 * Copyright (C) 2010 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.antlr.runtime.RecognitionException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.DirectoryScanner;
import org.ow2.mind.yatl.ParseException;
import org.ow2.mind.yatl.YATL2JavaCompiler;

/**
 * @goal yatlc
 * @phase generate-sources
 */
public class YATLCMojo extends AbstractMojo {
  /**
   * The current Maven project.
   * 
   * @parameter default-value="${project}"
   * @readonly
   * @required
   */
  private MavenProject project;

  /**
   * Location of the output dir.
   * 
   * @parameter expression="${project.build.directory}/generated-sources/yatl"
   * @required
   */
  protected File       outputDirectory;

  /**
   * Location of the yatl sources
   * 
   * @parameter expression="${basedir}/src/main/yatl"
   * @required
   */
  protected File       sourceDirectory;

  /**
   * A set of Ant-like inclusion patterns used to select files from the source
   * directory for processing. By default, the patterns
   * <code>**&#47;*.tmpl</code> is used to select template files.
   * 
   * @parameter
   */
  private String[]     includes;

  /**
   * A set of Ant-like exclusion patterns used to prevent certain files from
   * being processed. By default, this set is empty such that no files are
   * excluded.
   * 
   * @parameter
   */
  private String[]     excludes;

  public void execute() throws MojoExecutionException {
    if (!outputDirectory.exists()) {
      outputDirectory.mkdirs();
    }

    String[] inputFileNames = getInputFiles();
    int nbBuild = 0;
    boolean inError = false;
    for (String inputFileName : inputFileNames) {
      File inputFile = new File(sourceDirectory, inputFileName);
     
      String outputFileName;
      int i = inputFileName.lastIndexOf('.');
      if (i < 0) {
        outputFileName = inputFileName + ".java";
      } else {
        outputFileName = inputFileName.substring(0, i) + ".java";
      }
      
      File outputFile = new File(outputDirectory, outputFileName);

      if (!rebuild(inputFile, outputFile)) {
        continue;
      }

      getLog().debug("Compile template '" + inputFileName + "'.");

      YATL2JavaCompiler compiler = new YATL2JavaCompiler();
      String javaCode;
      try {
        javaCode = compiler.yatl2Java(inputFile);
      } catch (ParseException e) {
        getLog().error(
            "Parse error in template " + inputFileName + ": ");
        for (String msg : e.getMessages()) {
          getLog().error(msg);
        }
        
        inError = true;
        continue;
      } catch (IOException e) {
        throw new MojoExecutionException(
            "Can't read template " + inputFileName, e);
      } finally {
      }
      
      outputFile.getParentFile().mkdirs();
      PrintStream outputStream;
      try {
        outputStream = new PrintStream(outputFile);
      } catch (FileNotFoundException e) {
        throw new MojoExecutionException("Can't write output file", e);
      }
      outputStream.print(javaCode);
      outputStream.close();
      nbBuild ++;
    }

    if (inError) {
      throw new MojoExecutionException("Template compilation fails");
    }
    if (nbBuild == 0) {
      getLog().info("Skipping - all templates are up to date");
    } else {
      getLog().info(
          "Compiled " + nbBuild + " template" + ((nbBuild == 1) ? "" : "s"));
    }

    if (this.project != null) {
      getLog().debug("Adding compile source root: " + outputDirectory);
      this.project.addCompileSourceRoot(outputDirectory.getAbsolutePath());
    }
  }

  protected boolean rebuild(File inputFile, File outputFile) {
    return inputFile.lastModified() > outputFile.lastModified();
  }

  protected String[] getIncludes() {
    if (this.includes != null) {
      return this.includes;
    } else {
      return new String[]{"**/*.tmpl"};
    }
  }

  protected String[] getExcludes() {
    return this.excludes;
  }

  public String[] getInputFiles() {
    if (!sourceDirectory.isDirectory()) {
      return new String[0];
    }
    DirectoryScanner scanner = new DirectoryScanner();
    scanner.setBasedir(sourceDirectory);
    scanner.setIncludes(getIncludes());
    scanner.setExcludes(getExcludes());
    scanner.scan();

    return scanner.getIncludedFiles();
  }
}
