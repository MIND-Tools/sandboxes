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

package org.ow2.mind.adl.subComponent;

import static org.testng.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;

import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Loader;
import org.objectweb.fractal.adl.NodeFactoryImpl;
import org.objectweb.fractal.adl.merger.NodeMerger;
import org.objectweb.fractal.adl.merger.NodeMergerImpl;
import org.objectweb.fractal.adl.xml.XMLNodeFactoryImpl;
import org.ow2.mind.adl.ASTChecker;
import org.ow2.mind.adl.BasicADLLocator;
import org.ow2.mind.adl.BasicDefinitionReferenceResolver;
import org.ow2.mind.adl.CacheLoader;
import org.ow2.mind.adl.CachingDefinitionReferenceResolver;
import org.ow2.mind.adl.ErrorLoader;
import org.ow2.mind.adl.ExtendsLoader;
import org.ow2.mind.adl.SubComponentNormalizerLoader;
import org.ow2.mind.adl.SubComponentResolverLoader;
import org.ow2.mind.adl.anonymous.AnonymousDefinitionExtractorImpl;
import org.ow2.mind.adl.anonymous.AnonymousDefinitionLoader;
import org.ow2.mind.adl.imports.ImportDefinitionReferenceResolver;
import org.ow2.mind.adl.parser.ADLParser;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.error.ErrorManagerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSubComponent {

  Loader              loader;

  Map<Object, Object> context;

  ASTChecker          checker;

  @BeforeMethod(alwaysRun = true)
  protected void setUp() throws Exception {
    final ErrorManager errorManager = ErrorManagerFactory
        .newSimpleErrorManager();
    // Loader chain components
    final ADLParser adlLoader = new ADLParser();
    final AnonymousDefinitionLoader adl = new AnonymousDefinitionLoader();
    final SubComponentNormalizerLoader scnl = new SubComponentNormalizerLoader();
    final SubComponentResolverLoader scrl = new SubComponentResolverLoader();
    final ExtendsLoader el = new ExtendsLoader();
    final CacheLoader cl = new CacheLoader();
    final ErrorLoader errl = new ErrorLoader();

    loader = errl;
    errl.clientLoader = cl;
    cl.clientLoader = el;
    el.clientLoader = scrl;
    scrl.clientLoader = scnl;
    scnl.clientLoader = adl;
    adl.clientLoader = adlLoader;

    adlLoader.errorManagerItf = errorManager;
    adl.errorManagerItf = errorManager;
    scnl.errorManagerItf = errorManager;
    scrl.errorManagerItf = errorManager;
    el.errorManagerItf = errorManager;
    errl.errorManagerItf = errorManager;

    // definition reference resolver chain
    final BasicDefinitionReferenceResolver bdrr = new BasicDefinitionReferenceResolver();
    final ImportDefinitionReferenceResolver idrr = new ImportDefinitionReferenceResolver();
    final CachingDefinitionReferenceResolver cdrr = new CachingDefinitionReferenceResolver();

    cdrr.clientResolverItf = idrr;
    idrr.clientResolverItf = bdrr;
    bdrr.loaderItf = cl;
    cdrr.loaderItf = cl;
    scrl.definitionReferenceResolverItf = cdrr;
    el.definitionReferenceResolverItf = cdrr;

    bdrr.errorManagerItf = errorManager;

    // anonymous definition extractor chain
    final AnonymousDefinitionExtractorImpl adei = new AnonymousDefinitionExtractorImpl();

    adl.anonymousDefinitionExtractorItf = adei;

    // additional components
    final NodeMerger nodeMerger = new NodeMergerImpl();
    final BasicADLLocator adlLocator = new BasicADLLocator();
    final XMLNodeFactoryImpl xmlNodeFactory = new XMLNodeFactoryImpl();
    final NodeFactoryImpl nodeFactory = new NodeFactoryImpl();

    el.nodeMergerItf = nodeMerger;
    idrr.adlLocatorItf = adlLocator;
    adlLoader.adlLocatorItf = adlLocator;
    adlLoader.nodeFactoryItf = xmlNodeFactory;
    bdrr.nodeFactoryItf = nodeFactory;
    adei.nodeFactoryItf = nodeFactory;

    context = new HashMap<Object, Object>();

    checker = new ASTChecker();
  }

  @Test(groups = {"functional"})
  public void testComposite1() throws Exception {
    final Definition d = loader.load("pkg1.subComponent.Composite1", context);
    final ASTChecker checker = new ASTChecker();
    checker.assertDefinition(d).containsComponents("subComp1", "subComp2")
        .whereFirst().isAnInstanceOf("pkg1.pkg2.Primitive1").andNext()
        .isAnInstanceOf("pkg1.pkg2.Primitive1");
  }

  @Test(groups = {"functional"})
  public void testComposite2() throws Exception {
    final Definition d = loader.load("pkg1.subComponent.Composite2", context);
    final ASTChecker checker = new ASTChecker();
    final Definition def1 = checker.assertDefinition(d)
        .containsComponent("subComp1")
        .isAnInstanceOf("pkg1.subComponent.Composite2$0").def;
    final Definition def2 = checker.assertDefinition(d)
        .containsComponent("subComp2")
        .isAnInstanceOf("pkg1.subComponent.Composite2$0").def;
    assertSame(def2, def1);
  }
}
