/**
 * Copyright (C) 2010 France Telecom
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
 * Authors: Matthieu ANNE
 * Contributors:
 */

package org.ow2.mind.idl.annotations;

import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationElement;
import org.ow2.mind.annotation.AnnotationTarget;
import org.ow2.mind.idl.annotation.IDLAnnotationTarget;
import org.ow2.mind.idl.annotation.IDLLoaderPhase;
import org.ow2.mind.idl.annotation.IDLLoaderProcessor;

/**
 * @author Matthieu ANNE
 * 
 */
@IDLLoaderProcessor(processor = VarArgsDualAnnotationProcessor.class, phases = { IDLLoaderPhase.AFTER_PARSING })
public class VarArgsDual implements Annotation {

    @AnnotationElement
    public String dualMeth;

    private static final AnnotationTarget[] TARGETS = { IDLAnnotationTarget.METHOD };

    /*
     * (non-Javadoc)
     * 
     * @see org.ow2.mind.annotation.Annotation#getAnnotationTargets()
     */
    public AnnotationTarget[] getAnnotationTargets() {
	return TARGETS;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.ow2.mind.annotation.Annotation#isInherited()
     */
    public boolean isInherited() {
	return true;
    }

}
