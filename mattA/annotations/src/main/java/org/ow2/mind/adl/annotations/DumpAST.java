/**
 * 
 */

package org.ow2.mind.adl.annotations;

import org.ow2.mind.adl.annotation.ADLAnnotationTarget;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.ADLLoaderProcessor;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationTarget;

/**
 * @author omaw7405
 */
@ADLLoaderProcessor(processor = DumpASTAnnotationProcessor.class, phases = {ADLLoaderPhase.AFTER_CHECKING})
public class DumpAST implements Annotation {

  private static final AnnotationTarget[] ANNOTATION_TARGETS = {ADLAnnotationTarget.DEFINITION};

  /*
   * (non-Javadoc)
   * @see org.ow2.mind.annotation.Annotation#getAnnotationTargets()
   */
  public AnnotationTarget[] getAnnotationTargets() {
    return ANNOTATION_TARGETS;
  }

  /*
   * (non-Javadoc)
   * @see org.ow2.mind.annotation.Annotation#isInherited()
   */
  public boolean isInherited() {
    return true;
  }

}
