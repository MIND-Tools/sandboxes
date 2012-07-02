/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.idt.editor.textual.fractalIdt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.idt.editor.textual.fractalIdt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIdtFactoryImpl extends EFactoryImpl implements FractalIdtFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FractalIdtFactory init()
  {
    try
    {
      FractalIdtFactory theFractalIdtFactory = (FractalIdtFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ow2.org/fractal/mind/idl/FractalIdt"); 
      if (theFractalIdtFactory != null)
      {
        return theFractalIdtFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FractalIdtFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIdtFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FractalIdtPackage.IDT_FILE: return createIdtFile();
      case FractalIdtPackage.CONSTANT_DEFINITION_BEGIN: return createConstantDefinitionBegin();
      case FractalIdtPackage.CONSTANT_DEFINITION_END: return createConstantDefinitionEnd();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdtFile createIdtFile()
  {
    IdtFileImpl idtFile = new IdtFileImpl();
    return idtFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinitionBegin createConstantDefinitionBegin()
  {
    ConstantDefinitionBeginImpl constantDefinitionBegin = new ConstantDefinitionBeginImpl();
    return constantDefinitionBegin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinitionEnd createConstantDefinitionEnd()
  {
    ConstantDefinitionEndImpl constantDefinitionEnd = new ConstantDefinitionEndImpl();
    return constantDefinitionEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIdtPackage getFractalIdtPackage()
  {
    return (FractalIdtPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FractalIdtPackage getPackage()
  {
    return FractalIdtPackage.eINSTANCE;
  }

} //FractalIdtFactoryImpl
