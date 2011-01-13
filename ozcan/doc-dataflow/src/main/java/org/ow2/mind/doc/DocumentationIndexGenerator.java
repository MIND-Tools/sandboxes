/**
 * Copyright (C) 2009 STMicroelectronics
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
 * Authors: michel.metzger@st.com
 * Contributors: 
 */
package org.ow2.mind.doc;

import static org.ow2.mind.PathHelper.packageNameToDirName;
import static org.ow2.mind.doc.HTMLDocumentationHelper.getDefinitionName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.antlr.stringtemplate.PathGroupLoader;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateErrorListener;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplateGroupLoader;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.ow2.mind.PathHelper;
import org.ow2.mind.doc.HTMLDocumentationHelper.SourceKind;
import org.ow2.mind.doc.comments.CommentTagProcessor;


public class DocumentationIndexGenerator {
  private static final String ALL_DEF_FRAME_TEMPLATE = "st/frames/all_def_frame";
  private static final String OVERVIEW_FRAME_TEMPLATE = "st/frames/overview-frame";
  private static final String OVERVIEW_SUMMARY_TEMPLATE = "st/summaries/overview-summary";
  private static final String PACKAGE_FRAME_TEMPLATE = "st/frames/package-frame";
  private static final String PACKAGE_SUMMARY_TEMPLATE = "st/summaries/package-summary";

  private static final String ALL_DEF_FRAME_HTML    = "all-def-frame.html";
  private static final String OVERVIEW_FRAME_HTML   = "overview-frame.html";
  private static final String OVERVIEW_SUMMARY_HTML = "overview-summary.html";
  private static final String PACKAGE_FRAME_HTML    = "package-frame.html";
  private static final String PACKAGE_SUMMARY_HTML  = "package-summary.html";

  private static final String PACKAGE_DOC_HTML = "package.html";

  private static enum EntryKind {
    ADL,
    ITF,
    PACKAGE,
  }

  public static class IndexEntry {

    public String name;
    public String frameHtmlFileName;
    public String summaryHtmlFileName;

    public EntryKind kind;

    /**
     * Points to the file or directory corresponding to this entry.
     */
    public File file;

    public List<IndexEntry> adl;

    public List<IndexEntry> itf;

    private IndexEntry(final EntryKind kind, final String name, final String frameHtmlFileName, final String summaryHtmlFileName, final File file) {
      this(kind, name, frameHtmlFileName, summaryHtmlFileName, file, null, null);
    }

    private IndexEntry(final EntryKind kind, final String name,
        final String frameHtmlFileName, final String summaryHtmlFileName,
        final File file, final List<IndexEntry> adl, final List<IndexEntry> itf) {
      this.name = name;
      this.frameHtmlFileName = frameHtmlFileName;
      this.summaryHtmlFileName = summaryHtmlFileName;
      this.file = file;
      this.adl = adl;
      this.itf = itf;
      this.kind = kind;
    }

    /*create entries of different kind for itf and adl*/

    public static IndexEntry createADLEntry(final File rootDirectory, final File file) throws IOException {
      final String definitionName = getDefinitionName(rootDirectory.getCanonicalPath(), file.getCanonicalPath());
      String summaryHtmlFileName = HTMLDocumentationHelper.getPathToADL(definitionName);
      if(summaryHtmlFileName.startsWith(File.separator)) {
        summaryHtmlFileName = summaryHtmlFileName.substring(1);
      }
      return new IndexEntry(EntryKind.ADL, definitionName, null, summaryHtmlFileName, file);
    }

    public static IndexEntry createITFEntry(final File rootDirectory, final File file) throws IOException {
      final String definitionName = getDefinitionName(rootDirectory.getCanonicalPath(), file.getCanonicalPath());
      String summaryHtmlFileName = HTMLDocumentationHelper.getPathToITF(definitionName);
      if(summaryHtmlFileName.startsWith(File.separator)) {
        summaryHtmlFileName = summaryHtmlFileName.substring(1);
      }
      return new IndexEntry(EntryKind.ITF, definitionName, null, summaryHtmlFileName, file);
    }

    public static IndexEntry createPackageEntry(
        final File rootDirectory,
        final File directory,
        final List<IndexEntry> adl,
        final List<IndexEntry> itf) throws IOException {
        final String packageName = getDefinitionName(rootDirectory.getCanonicalPath(), directory.getCanonicalPath());

        String frameHtmlFileName = packageNameToDirName(packageName) + File.separatorChar + PACKAGE_FRAME_HTML;
        String summaryHtmlFileName = packageNameToDirName(packageName) + File.separatorChar + PACKAGE_SUMMARY_HTML;

        if(frameHtmlFileName.startsWith(File.separator)) {
          frameHtmlFileName = frameHtmlFileName.substring(1);
        }

        if(summaryHtmlFileName.startsWith(File.separator)) {
          summaryHtmlFileName = summaryHtmlFileName.substring(1);
        }
        return new IndexEntry(EntryKind.PACKAGE, packageName, frameHtmlFileName, summaryHtmlFileName, directory, adl, itf);
    }

    @Override
    public String toString() {
      return String.format("[%s,%s]", name, frameHtmlFileName);
    }

  }

  private class IndexEntryComparator implements Comparator<IndexEntry>{
    public int compare(final IndexEntry o1, final IndexEntry o2) {
      return o1.name.compareTo(o2.name);
    }
  }

  private class IndexEntryComparatorNoPackage implements Comparator<IndexEntry>{
    public int compare(final IndexEntry o1, final IndexEntry o2) {
      final String name1 = HTMLDocumentationHelper.getShortName(o1.name);
      final String name2 = HTMLDocumentationHelper.getShortName(o2.name);
      return name1.compareTo(name2);
    }
  }

  private final File[] sourceDirectories;

  private final List<IndexEntry> adlDefinitionEntries = new LinkedList<IndexEntry>();
  private final List<IndexEntry> itfDefinitionEntries = new LinkedList<IndexEntry>();
  private final List<IndexEntry> packages = new LinkedList<IndexEntry>();
  private final StringTemplateGroupLoader groupLoader;

  private final StringTemplate allDefinitionTemplate;
  private final StringTemplate overviewFrameTemplate;
  private final StringTemplate overviewSummaryTemplate;
  private final StringTemplate packageFrameTemplate;
  private final StringTemplate packageSummaryTemplate;
  private final File overviewFile;
  private final String docTitle;


  public DocumentationIndexGenerator(final File[] sourceDirectories, final File resourceDirectory, final String docTitle, final File overviewFile) throws IOException {
    this.sourceDirectories = sourceDirectories;
    this.overviewFile = overviewFile;
    this.docTitle = docTitle;

    groupLoader = new PathGroupLoader(resourceDirectory.getAbsolutePath(), new StringTemplateErrorListener() {
      public void warning(final String msg) {
        System.out.println("String template: " + msg);
      }

      public void error(final String msg, final Throwable e) {
        System.out.println("String template error: " + msg);
        e.printStackTrace(new PrintStream(System.err));
      }
    });

    StringTemplateGroup group = new StringTemplateGroup("indexGroup");
    group.registerRenderer(String.class, new HTMLRenderer());

    overviewFrameTemplate = group.getInstanceOf(OVERVIEW_FRAME_TEMPLATE);
    overviewSummaryTemplate = group.getInstanceOf(OVERVIEW_SUMMARY_TEMPLATE);
    packageFrameTemplate = group.getInstanceOf(PACKAGE_FRAME_TEMPLATE);
    packageSummaryTemplate = group.getInstanceOf(PACKAGE_SUMMARY_TEMPLATE);

    group = groupLoader.loadGroup(ALL_DEF_FRAME_TEMPLATE, DefaultTemplateLexer.class, null);
    group.registerRenderer(String.class, new HTMLRenderer());
    allDefinitionTemplate = group.getInstanceOf("frame");

    generateIndexLists();
  }

  public void generateIndexPages(final File targetDirectory) throws IOException {
    generateOverviewFrame(targetDirectory);
    generateOverviewSummary(targetDirectory);
    generatePackageFrame(targetDirectory);
    generatePackageSummary(targetDirectory);
    generateAllDefinitionFrame(targetDirectory);
  }

  protected void generateIndexLists() throws IOException {
    for (final File directory : sourceDirectories) {
      exploreDirectory(directory.getCanonicalFile(), directory.getCanonicalFile());
    }
    Collections.sort(adlDefinitionEntries, new IndexEntryComparatorNoPackage());
    Collections.sort(itfDefinitionEntries, new IndexEntryComparatorNoPackage());
    Collections.sort(packages, new IndexEntryComparator());
  }

  private void exploreDirectory(final File rootDirectory, final File directory) throws IOException {
    if(directory.isHidden()) return;

    final List<IndexEntry> packageADLDefinition = new LinkedList<IndexEntry>();
    final List<IndexEntry> packageITFDefinition = new LinkedList<IndexEntry>();

    for (final File file : directory.listFiles((FileFilter)FileFilterUtils.suffixFileFilter(".adl"))) {
      final IndexEntry entry = IndexEntry.createADLEntry(rootDirectory, file);
      adlDefinitionEntries.add(entry);
      packageADLDefinition.add(entry);
    }

    for (final File file : directory.listFiles((FileFilter)FileFilterUtils.suffixFileFilter(".itf"))) {
      final IndexEntry entry = IndexEntry.createITFEntry(rootDirectory, file);
      itfDefinitionEntries.add(entry);
      packageITFDefinition.add(entry);
    }

    if(!packageADLDefinition.isEmpty() || !packageITFDefinition.isEmpty()) {
      packages.add(IndexEntry.createPackageEntry(rootDirectory, directory, packageADLDefinition, packageITFDefinition));
      Collections.sort(packageADLDefinition, new IndexEntryComparatorNoPackage());
      Collections.sort(packageITFDefinition, new IndexEntryComparatorNoPackage());
    }

    for (final File subDirectory: directory.listFiles(new FileFilter() {

      public boolean accept(final File pathname) {
        return pathname.isDirectory();
      }
    })) {
      exploreDirectory(rootDirectory, subDirectory);
    }
  }

  public void generateOverviewFrame(final File targetDir) throws IOException {
    overviewFrameTemplate.reset();
    overviewFrameTemplate.setAttribute("packages", packages);
    overviewFrameTemplate.registerRenderer(String.class, new HTMLRenderer());

    final FileWriter writer = new FileWriter(new File(targetDir, OVERVIEW_FRAME_HTML));
    writer.append(overviewFrameTemplate.toString());
    writer.close();
  }

  public void generateOverviewSummary(final File targetDir) throws IOException {
    overviewSummaryTemplate.reset();
    overviewSummaryTemplate.setAttribute("packages", packages);
    overviewSummaryTemplate.setAttribute("docTitle", docTitle);
    overviewSummaryTemplate.registerRenderer(String.class, new HTMLRenderer());

    setPackageDocumentation("", overviewFile, overviewSummaryTemplate);

    final File targetFile = new File(targetDir, OVERVIEW_SUMMARY_HTML);
    final FileWriter writer = new FileWriter(targetFile);
    writer.append(overviewSummaryTemplate.toString());
    writer.close();
  }

  /**
   * generate the html frames for all packages.
   * @param targetDir destination directory. Each html page will be in a subdirectory corresponding to the package.
   * @throws IOException
   */
  public void generatePackageFrame(final File targetDir) throws IOException {
    for (final IndexEntry packageEntry : packages) {
      packageFrameTemplate.reset();
      packageFrameTemplate.setAttribute("name", packageEntry.name);
      packageFrameTemplate.setAttribute("summaryFileName", packageEntry.summaryHtmlFileName);
      packageFrameTemplate.setAttribute("pathToRoot", HTMLDocumentationHelper.getPackagePathToRoot(packageEntry.name));

      if(!packageEntry.adl.isEmpty())
        packageFrameTemplate.setAttribute("adl", packageEntry.adl);
      if(!packageEntry.itf.isEmpty())
        packageFrameTemplate.setAttribute("itf", packageEntry.itf);

      final File directory = new File(targetDir, PathHelper.packageNameToDirName(packageEntry.name));

      directory.mkdirs();
      final FileWriter writer = new FileWriter(new File(directory, PACKAGE_FRAME_HTML));
      writer.append(packageFrameTemplate.toString());
      writer.close();
    }
  }

  /**
   * generate the html frames for all packages.
   * @param targetDir destination directory. Each html page will be in a subdirectory corresponding to the package.
   * @throws IOException
   */
  public void generatePackageSummary(final File targetDir) throws IOException {
    for (final IndexEntry packageEntry : packages) {
      packageSummaryTemplate.reset();
      packageSummaryTemplate.setAttribute("name", packageEntry.name);
      packageSummaryTemplate.setAttribute("pathToRoot", HTMLDocumentationHelper.getPackagePathToRoot(packageEntry.name));
      packageSummaryTemplate.setAttribute("adl", packageEntry.adl);
      packageSummaryTemplate.setAttribute("itf", packageEntry.itf);
      packageSummaryTemplate.registerRenderer(String.class, new HTMLRenderer());

      final File directory = new File(targetDir, PathHelper.packageNameToDirName(packageEntry.name));

      setPackageDocumentation(packageEntry.name, new File(packageEntry.file, PACKAGE_DOC_HTML), packageSummaryTemplate);

      directory.mkdirs();
      final FileWriter writer = new FileWriter(new File(directory, PACKAGE_SUMMARY_HTML));
      writer.append(packageSummaryTemplate.toString());
      writer.close();
    }
  }

  private void setPackageDocumentation(final String packageName,
      final File packageDocumentationFile, final StringTemplate template)
      throws FileNotFoundException, IOException {
    if(packageDocumentationFile != null && packageDocumentationFile.canRead()) {
      final FileReader reader = new FileReader(packageDocumentationFile);
      final BufferedReader br = new BufferedReader(reader);
      final StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = br.readLine()) != null) {
        sb.append(line);
        sb.append('\n');
      }
      String documentation = sb.toString();

      final CommentTagProcessor tagProcessor = new CommentTagProcessor(packageName, documentation, SourceKind.PACKAGE);
      documentation = tagProcessor.replaceTagsInComment();

      String shortDocumentation = null;
      final int index = documentation.indexOf('.');
      if(index != -1) {
        shortDocumentation = documentation.substring(0, index);
      } else {
        shortDocumentation = documentation;
      }
      template.setAttribute("documentation", documentation);
      template.setAttribute("shortDocumentation", shortDocumentation);
    }
  }

  public void generateAllDefinitionFrame(final File targetDir) throws IOException {

    allDefinitionTemplate.reset();

    if(!adlDefinitionEntries.isEmpty())
      allDefinitionTemplate.setAttribute("adl", adlDefinitionEntries);
    if(!itfDefinitionEntries.isEmpty())
      allDefinitionTemplate.setAttribute("itf", itfDefinitionEntries);

    final FileWriter writer = new FileWriter(new File(targetDir, ALL_DEF_FRAME_HTML));
    writer.append(allDefinitionTemplate.toString());
    writer.close();

  }
}
