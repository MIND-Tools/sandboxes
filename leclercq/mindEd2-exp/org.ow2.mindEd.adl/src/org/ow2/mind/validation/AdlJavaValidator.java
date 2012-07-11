
package org.ow2.mind.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Annotation;
import org.ow2.mind.adl.AnnotationField;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionOrTemplate;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Parameter;
import org.ow2.mind.adl.ParameterAssignment;
import org.ow2.mind.adl.ParameterDecl;
import org.ow2.mind.adl.PrimitiveDefinition;
import org.ow2.mind.adl.TemplateParameterDecl;
import org.ow2.mind.annotation.AnnotationDescriptor;
import org.ow2.mind.annotation.AnnotationFieldDescriptor;
import org.ow2.mind.annotation.AnnotationRegistry;
import org.ow2.minded.project.builder.MindNature;

import com.google.inject.Inject;

public class AdlJavaValidator extends AbstractAdlJavaValidator {

  public static final String  MISSING_PARAMETERS_ERROR_ID = "reference missing parameters";

  private final static Logger log                         = Logger
                                                              .getLogger(AdlJavaValidator.class);

  @Inject
  private IWorkspace          workspace;

  @Check
  public void checkDefinitionName(Definition definition) {
    String name = definition.getName();
    String fileName = name.replace('.', '/') + ".adl";
    final IFile file = getWorkspaceRoot().getFile(
        new Path(definition.eResource().getURI().toPlatformString(true)));
    IProject project = file.getProject();
    try {
      MindNature nature = MindNature.getNature(project);
      if (nature != null) {
        List<IContainer> sourceFolders = nature.getSourceFolders();
        for (IContainer sourceFolder : sourceFolders) {
          if (sourceFolder.contains(file)) {
            IPath relativePath = file.getFullPath().makeRelativeTo(
                sourceFolder.getFullPath());
            if (!fileName.equals(relativePath.toString())) {
              error("Invalid definition name", definition,
                  AdlPackage.DEFINITION__NAME);
            }
          }
        }
      }
    } catch (CoreException e) {
      log.error(e.getMessage(), e);
    }
  }

  @Check
  public void checkDefinitionParametersUnicity(Definition definition) {
    List<ParameterDecl> parameters = AdlModelHelper.getParameters(definition);
    if (parameters != null) {
      Set<String> names = new HashSet<String>(parameters.size());
      for (ParameterDecl parameter : parameters) {
        if (!names.add(parameter.getName()))
          error("Duplicate parameter declaration", definition,
              (definition instanceof PrimitiveDefinition)
                  ? AdlPackage.PRIMITIVE_DEFINITION__PARAMETERS
                  : AdlPackage.COMPOSITE_DEFINITION__PARAMETERS);

      }
    }
  }

  @Check
  public void checkDefinitionReferenceParameter(
      DefinitionReference reference) {
    
    DefinitionOrTemplate defOrTmpl = reference.getDefinition();
    if (! (defOrTmpl instanceof Definition)) return;
    
    Definition referencedDefinition = (Definition) defOrTmpl;

    List<ParameterDecl> formalParameters = AdlModelHelper
        .getParameters(referencedDefinition);
    List<Parameter> paramValues = reference.getParameters();
    if (formalParameters == null || formalParameters.size() == 0) {
      // No formal parameter
      if (paramValues != null && paramValues.size() > 0) {
        error("Definition does not have parameters", reference,
            AdlPackage.DEFINITION_REFERENCE__PARAMETERS);
      }
    } else {
      // referenced definition have formal parameters
      if (paramValues == null || paramValues.size() == 0) {
        error("Parameter values must be specified", reference,
            AdlPackage.DEFINITION_REFERENCE__PARAMETERS,
            MISSING_PARAMETERS_ERROR_ID, referencedDefinition.getName());
      } else {
        if ((paramValues.get(0) instanceof ParameterAssignment)) {
          // named parameters
          Set<String> parameterNames = new HashSet<String>(
              formalParameters.size());
          for (ParameterDecl parameterDecl : formalParameters) {
            parameterNames.add(parameterDecl.getName());
          }
          for (Parameter parameter : paramValues) {
            if (!(parameter instanceof ParameterAssignment)) {
              error("Cannot mix named and un-named parameters", parameter,
                  AdlPackage.PARAMETER);
            } else {
              String paramName = ((ParameterAssignment) parameter).getName();
              if (!parameterNames.remove(paramName)) {
                error("Duplicate parameter value", parameter,
                    AdlPackage.PARAMETER_ASSIGNMENT__NAME);
              }
            }
            // TODO check types (how ?)
          }
          if (!parameterNames.isEmpty()) {
            error("Missing parameter value", reference,
                AdlPackage.DEFINITION_REFERENCE__PARAMETERS);
          }
        } else {
          // ordinal parameters
          if (paramValues.size() < formalParameters.size()) {
            error("Missing parameter value", reference,
                AdlPackage.DEFINITION_REFERENCE__PARAMETERS);
          } else if (paramValues.size() > formalParameters.size()) {
            error("Too many parameter value", reference,
                AdlPackage.DEFINITION_REFERENCE__PARAMETERS);
          } else {
            // TODO check types (how ?)
          }
        }
        for (Parameter paramValue : paramValues) {
          if ((paramValues.get(0) instanceof ParameterAssignment) != (paramValue instanceof ParameterAssignment)) {
            error("Cannot mix named and un-named parameters", paramValue,
                AdlPackage.PARAMETER_ASSIGNMENT);
          }
        }
      }
    }
  }

  public static final String UNKNOWN_ANNOTATION_TYPE = "Unknown annotation type ";

  @Check
  public void checkAnnotationName(Annotation annotation) {
    String name = annotation.getName();
    AnnotationDescriptor descriptor = AnnotationRegistry
        .getAnnotationDescriptor(name);
    if (descriptor == null) {
      error(UNKNOWN_ANNOTATION_TYPE + name, annotation,
          AdlPackage.ANNOTATION__NAME, UNKNOWN_ANNOTATION_TYPE, name);
    }
  }

  public static final String MISSING_ANNOTATION_FIELD_NAME   = "Missing annotation field name";
  public static final String MISSING_ANNOTATION_FIELD_VALUE  = "Missing annotation field values: ";
  public static final String UNDEFINED_ANNOTATION_FIELD_NAME = "Undefined annotation field ";

  // TODO check types
  // TODO check annotation target
  @Check
  public void checkAnnotationParams(Annotation annotation) {
    String name = annotation.getName();
    AnnotationDescriptor descriptor = AnnotationRegistry
        .getAnnotationDescriptor(name);
    if (descriptor == null) {
      return;
    }
    EList<AnnotationField> parameters = annotation.getParameters();
    if (parameters.size() == 0) {
      // No parameter specified
      List<String> mandatoryFieldNames = null;
      for (AnnotationFieldDescriptor fieldDescriptor : descriptor.getFields()
          .values()) {
        if (!fieldDescriptor.isOptional()) {
          if (mandatoryFieldNames == null)
            mandatoryFieldNames = new ArrayList<String>();
          mandatoryFieldNames.add(fieldDescriptor.getName());
        }
      }
      if (mandatoryFieldNames != null) {
        // Annotation has mandatory fields.
        String errorMsg = MISSING_ANNOTATION_FIELD_VALUE;
        for (String mandatoryFieldName : mandatoryFieldNames) {
          errorMsg += mandatoryFieldName + " ";
        }
        error(errorMsg, annotation, AdlPackage.ANNOTATION__PARAMETERS,
            MISSING_ANNOTATION_FIELD_VALUE,
            mandatoryFieldNames.toArray(new String[mandatoryFieldNames.size()]));
      }
    } else if (parameters.size() == 1) {
      // One parameter specified
      AnnotationField field = parameters.get(0);
      AnnotationFieldDescriptor fieldDescriptor;
      if (field.getName() == null) {
        fieldDescriptor = descriptor
            .getField(AnnotationFieldDescriptor.DEFAULT_FIELD_NAME);
        if (fieldDescriptor == null) {
          Set<String> fieldNames = descriptor.getFieldNames();
          error(MISSING_ANNOTATION_FIELD_NAME,
              AdlPackage.ANNOTATION_FIELD__NAME, MISSING_ANNOTATION_FIELD_NAME,
              fieldNames.toArray(new String[fieldNames.size()]));
          return;
        }
      } else {
        fieldDescriptor = descriptor.getField(field.getName());
        if (fieldDescriptor == null) {
          Set<String> fieldNames = descriptor.getFieldNames();
          error(UNDEFINED_ANNOTATION_FIELD_NAME + field.getName(), field,
              AdlPackage.ANNOTATION_FIELD__NAME,
              UNDEFINED_ANNOTATION_FIELD_NAME,
              fieldNames.toArray(new String[fieldNames.size()]));
          return;
        }
      }
    } else {
      // Several parameter specified.
      Map<String, AnnotationFieldDescriptor> fieldDescriptors = new HashMap<String, AnnotationFieldDescriptor>(
          descriptor.getFields());
      for (AnnotationField field : parameters) {
        AnnotationFieldDescriptor fieldDescriptor = fieldDescriptors
            .remove(field.getName());
        if (fieldDescriptor == null) {
          Set<String> fieldNames = descriptor.getFieldNames();
          error(UNDEFINED_ANNOTATION_FIELD_NAME + field.getName(), field,
              AdlPackage.ANNOTATION_FIELD__NAME,
              UNDEFINED_ANNOTATION_FIELD_NAME,
              fieldNames.toArray(new String[fieldNames.size()]));
        }
      }
      if (!fieldDescriptors.isEmpty()) {
        // No parameter specified
        List<String> mandatoryFieldNames = null;
        for (AnnotationFieldDescriptor fieldDescriptor : fieldDescriptors
            .values()) {
          if (!fieldDescriptor.isOptional()) {
            if (mandatoryFieldNames == null)
              mandatoryFieldNames = new ArrayList<String>();
            mandatoryFieldNames.add(fieldDescriptor.getName());
          }
        }
        if (mandatoryFieldNames != null) {
          // Annotation has mandatory fields.
          String errorMsg = MISSING_ANNOTATION_FIELD_VALUE;
          for (String mandatoryFieldName : mandatoryFieldNames) {
            errorMsg += mandatoryFieldName + " ";
          }
          error(
              errorMsg,
              annotation,
              AdlPackage.ANNOTATION__PARAMETERS,
              MISSING_ANNOTATION_FIELD_VALUE,
              mandatoryFieldNames.toArray(new String[mandatoryFieldNames.size()]));
        }
      }

    }
  }

  protected IWorkspaceRoot getWorkspaceRoot() {
    return workspace.getRoot();
  }

  public void setWorkspace(IWorkspace workspace) {
    this.workspace = workspace;
  }
}
