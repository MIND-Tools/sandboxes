/**
 * Copyright (C) 2012 Schneider-Electric
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
 * Contact: mind@ow2.org, sseyvoz@assystem.com
 *
 * Authors: Stephane Seyvoz, Assystem (for Schneider-Electric)
 * Contributors: 
 */

package org.ow2.mind;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.ow2.mind.adl.annotation.predefined.Compile;
import org.ow2.mind.adl.annotation.predefined.CompileDef;
import org.ow2.mind.adl.annotation.predefined.GarbageUnusedInternals;
import org.ow2.mind.adl.annotation.predefined.Run;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationHelper;
import org.ow2.mind.unit.UnitTestDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.ow2.mind.adl.annotation.predefined.StaticBindings;

public class OptimizationsTest extends AbstractOptimizationTest {

	protected static Logger logger = FractalADLLogManager.getLogger("optimizations-test");

	private static Object[][] data;

	@Override
	protected void initPath() {
		initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
				"common", SRC_ROOT);
	}

	/* 
	 * Data providing inspired from the following tutorial/blog (in french) :
	 * http://blog.paumard.org/2011/09/11/testng-et-ses-dataprovider/
	 */
	@DataProvider(name = "complex-optimizations-test")
	protected Object[][] complexDataProvider() throws Exception {

		final Object[][] ADLs = UnitTestDataProvider.listADLs(SRC_ROOT);

		ArrayList<Object[]> tmpList = new ArrayList<Object[]>();

		// Force the use of "setup" because it's usually automatically by TestNG AFTER the DataProvider
		// creation !
		setup();

		List<String> flags = new ArrayList<String>();
		flags.add("-D__MIND_NO_FACTORY");

		// GarbageUnusedInternals <=> GUI, StaticBindings <=> SB, r = recursive
		String annotationCombinations[] = { "", "GUI", "GUIr", "S", "SB", "SBGUI", "SBGUIr", "SBr", "SBrGUI", "SBrGUIr"} ;

		for (int i = 0; i < ADLs.length; i++) {
			for (String annoCombo : annotationCombinations) {

				// ADLs[i][0] = rootDir, ADLs[i][1] = adlName (Standard row of the classic tests)
				String rootDir = (String) ADLs[i][0];
				String adlName = (String) ADLs[i][1];

				initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
						"common", rootDir);

				final Definition d = runner.load(adlName);
				final Run runAnno = AnnotationHelper.getAnnotation(d, Run.class);
				if (runAnno != null)
					tmpList.add(new Object[] { new TestCase(rootDir, adlName, annoCombo, flags) });
			}
		}

		return tmpList.toArray(new Object[tmpList.size()][1]);
	}


	@Test(dataProvider = "complex-optimizations-test", groups = {"optimizations"})
	public void optimizationsComplexDataTest(TestCase testCase)
			throws Exception {
		initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
				"common", testCase.rootDir);

		// Note : "true" forces to clean and rebuild completely
		initContext(true);

		List<String> cFlags = testCase.flags;
		String adlName = testCase.adlName;

		final Definition d = runner.load(adlName);
		final Run runAnno = AnnotationHelper.getAnnotation(d, Run.class);
		if (runAnno != null) {

			if ((cFlags != null) && (!cFlags.isEmpty()))
				runner.addCFlags(cFlags);

			final String adl;
			adl = (runAnno.addBootstrap)
					? "GenericApplication" + testCase.optimCombo + "<" + adlName + ">"
							: adlName;

			if (logger.isLoggable(Level.FINE)) {

				String cFlagsString = ", without flag.";
				if ((cFlags != null) && (!cFlags.isEmpty()))
					cFlagsString = ", with flag : " + cFlags + ".";

				logger.log(Level.FINE, "Testing Combination " + adl + cFlagsString);
			}

			File exeFile = runner.compile(adl, runAnno.executableName);
			final int r = runner.run(exeFile, null);

			assertEquals(r, 0, "Unexpected return value");

		} else {
			if (logger.isLoggable(Level.FINE))
				logger.log(Level.FINE, "Skipped test on ADL " + adlName + " : no @Run annotation was found.");
		}

	}

	//	@DataProvider(name = "simple-optimizations-test")
	//	protected Object[][] simpleDataProvider() throws Exception {
	//		return UnitTestDataProvider.listADLs(SRC_ROOT);
	//	}

	//	@Test(dataProvider = "simple-optimizations-test", groups = {"optimizations"})
	//	public void optimizationsSimpleDataTest(final String rootDir, final String adlName)
	//			throws Exception {
	//		initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
	//				"common", rootDir);
	//
	//		final Definition d = runner.load(adlName);
	//		final Run runAnno = AnnotationHelper.getAnnotation(d, Run.class);
	//		if (runAnno != null) {
	//
	//			Collection<Annotation> optimAnnotations = new HashSet<Annotation>();
	//			List<String> flags = new ArrayList<String>();
	//			flags.add("-D__MIND_NO_FACTORY");
	//
	//			StaticBindings simpleSBAnno = new StaticBindings();
	//			StaticBindings recursiveSBAnno = new StaticBindings();
	//			simpleSBAnno.recursive = false;
	//			recursiveSBAnno.recursive = true;
	//
	//			GarbageUnusedInternals simpleGUIAnno = new GarbageUnusedInternals();
	//			GarbageUnusedInternals recursiveGUIAnno = new GarbageUnusedInternals();
	//			simpleGUIAnno.recursive = false;
	//			recursiveGUIAnno.recursive = true;
	//
	//			StaticBindings sbCases[] = {null, simpleSBAnno, recursiveSBAnno};
	//			GarbageUnusedInternals guiCases[] = {null, simpleGUIAnno, recursiveGUIAnno};
	//
	//			for (StaticBindings sbAnno : sbCases){
	//				for (GarbageUnusedInternals guiAnno : guiCases) {
	//					if (sbAnno != null)
	//						optimAnnotations.add(sbAnno);
	//					if (guiAnno != null)
	//						optimAnnotations.add(guiAnno);
	//
	//					// Note : every call to processOptimizationsTest has its compilation context reinitialized
	//					//processOptimizationsTest(adlName, runAnno, optimAnnotations, null);
	//					processOptimizationsTest(adlName, runAnno, optimAnnotations, flags);
	//
	//					if (sbAnno != null)
	//						optimAnnotations.remove(sbAnno);
	//					if (guiAnno != null)
	//						optimAnnotations.remove(guiAnno);
	//				}
	//			}
	//
	//		} else {
	//			if (logger.isLoggable(Level.FINE))
	//				logger.log(Level.FINE, "Skipped test on ADL " + adlName + " : no @Run annotation was found.");
	//		}
	//
	//	}

	protected class TestCase {

		public String rootDir;
		public String adlName;
		public String optimCombo;
		public List<String> flags ;

		public TestCase(String rootDir,
				String adlName,
				String optimCombo,
				List<String> flags) {
			this.rootDir 		= rootDir;
			this.adlName 		= adlName;
			this.optimCombo 	= optimCombo ;
			this.flags 			= flags ;
		}

		public String toString(){
			String result;
			String flagsStr;
			String optimStr;

			if ((flags != null) && (!flags.isEmpty()))
				flagsStr = ", flags=" + flags;
			else flagsStr = ", no flag";

			if ((optimCombo != null) && (!optimCombo.equals("")))
				optimStr = ", optimCombo=" + optimCombo;
			else optimStr = ", no optim";

			return "[TestCase] " + rootDir + "/" + adlName + optimStr + flagsStr;
		}

	}

	//////////////////////////////////////////////////////////////////////////
	//-------------------------- OLD SIMPLE TEST ---------------------------//
	//////////////////////////////////////////////////////////////////////////

	@Test(groups = {"optimizations"})
	public void basicHelloworldTest()
			throws Exception {
		initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
				"common", "optimizations");

		initContext(true);
		String adlName = "helloworld.Helloworld";

		List<String> flags = new ArrayList<String>();
		flags.add("-D__MIND_NO_FACTORY");

		final Definition d = runner.load(adlName);
		final Run runAnno = AnnotationHelper.getAnnotation(d, Run.class);
		if (runAnno != null) {
			runner.addCFlags(flags);

			final String adl;
			adl = (runAnno.addBootstrap)
					? "GenericApplication" + "SBrGUIr" + "<" + adlName + ">"
							: adlName;

			File exeFile = runner.compile(adl, runAnno.executableName);
			final int r = runner.run(exeFile, null);

			assertEquals(r, 0, "Unexpected return value");

		} else {
			if (logger.isLoggable(Level.FINE))
				logger.log(Level.FINE, "Skipped test on ADL " + adlName + " : no @Run annotation was found.");
		}

	}

	/*
	 * Alternate @StaticBindings optimization/no optimization/optimization.
	 * No useless internal data garbaging (empty structs remain and no optimization propagation done).
	 */
	@Test(groups = {"optimizations"})
	public void partialAlternateOptimizationsTest()
			throws Exception {
		initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
				"common", "optimizations");

		initContext(true);
		String adlName = "partial.HelloworldApplicationSB_HWnoSB_sHWSB";

		List<String> flags = new ArrayList<String>();
		flags.add("-D__MIND_NO_FACTORY");

		runner.addCFlags(flags);

		File exeFile = runner.compile(adlName, null);
		final int r = runner.run(exeFile, null);

		assertEquals(r, 0, "Unexpected return value");
	}
	
	/*
	 * Same as previously but with useless internal data garbaging (recursively on the whole architecture).
	 */
	@Test(groups = {"optimizations"})
	public void partialAlternateOptimizationsTestWithGUIr()
			throws Exception {
		initSourcePath(getDepsDir("fractal/api/Component.itf").getAbsolutePath(),
				"common", "optimizations");

		initContext(true);
		String adlName = "partial.HelloworldApplicationSBGUIr_HWnoSB_sHWSB";

		List<String> flags = new ArrayList<String>();
		flags.add("-D__MIND_NO_FACTORY");

		runner.addCFlags(flags);

		File exeFile = runner.compile(adlName, null);
		final int r = runner.run(exeFile, null);

		assertEquals(r, 0, "Unexpected return value");
	}
}

