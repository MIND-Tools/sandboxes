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

package org.ow2.mind.adl.annotation.predefined;

import org.ow2.mind.adl.StaticBindingsAnnotationProcessor;
import org.ow2.mind.adl.annotation.ADLAnnotationTarget;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.ADLLoaderProcessor;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationElement;
import org.ow2.mind.annotation.AnnotationTarget;

/*
 * Doing the same as in Singleton as we target the same entities : Check if it's ok.
 */
@ADLLoaderProcessor(processor = StaticBindingsAnnotationProcessor.class, phases = {
	ADLLoaderPhase.AFTER_CHECKING, ADLLoaderPhase.AFTER_TEMPLATE_INSTANTIATE})
public class StaticBindings implements Annotation {

	/**
	 * Default ID stuff
	 */
	private static final long serialVersionUID = -4758786136256690293L;

	/**
	 * The Static annotation is used to specify that a given binding will be optimized
	 * and it's CALLs in the CPL are replaced by direct function calls to the server (no more "this" context
	 * pointer and function pointer dereferencing).
	 * 
	 * Doing the same as Singleton, but maybe this is an error. Actuel target is Definition but
	 * could (should ?) be Component ?
	 */
	private static final AnnotationTarget[] ANNOTATION_TARGETS = {ADLAnnotationTarget.DEFINITION, ADLAnnotationTarget.COMPONENT};
	
	public static final String VALUE = "@StaticBindings";
	
	/*
	 * We want the user to be able to specify if the annotation is propagated recursively on sub-composites
	 * or not. Default is : no propagation. "@StaticBindings(recursive=true)" will enable propagation. 
	 */
	@AnnotationElement(hasDefaultValue=true)
	public boolean recursive = false;
	
	public AnnotationTarget[] getAnnotationTargets() {
		return ANNOTATION_TARGETS;
	}

	public boolean isInherited() {
		return true;
	}
	
	public String toString()
	{
		return VALUE + "(recursive=" + recursive + ")";
	}

}
