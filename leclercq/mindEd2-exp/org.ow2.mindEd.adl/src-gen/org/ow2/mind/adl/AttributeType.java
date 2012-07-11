/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ow2.mind.adl.AdlPackage#getAttributeType()
 * @model
 * @generated
 */
public enum AttributeType implements Enumerator
{
  /**
   * The '<em><b>Int</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(0, "int", "int"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(1, "string", "string"),

  /**
   * The '<em><b>Int8 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT8_T_VALUE
   * @generated
   * @ordered
   */
  INT8_T(2, "int8_t", "int8_t"),

  /**
   * The '<em><b>Uint8 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT8_T_VALUE
   * @generated
   * @ordered
   */
  UINT8_T(3, "uint8_t", "uint8_t"),

  /**
   * The '<em><b>Int16 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT16_T_VALUE
   * @generated
   * @ordered
   */
  INT16_T(4, "int16_t", "int16_t"),

  /**
   * The '<em><b>Uint16 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT16_T_VALUE
   * @generated
   * @ordered
   */
  UINT16_T(5, "uint16_t", "uint16_t"),

  /**
   * The '<em><b>Int32 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT32_T_VALUE
   * @generated
   * @ordered
   */
  INT32_T(6, "int32_t", "int32_t"),

  /**
   * The '<em><b>Uint32 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT32_T_VALUE
   * @generated
   * @ordered
   */
  UINT32_T(7, "uint32_t", "uint32_t"),

  /**
   * The '<em><b>Intptr t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTPTR_T_VALUE
   * @generated
   * @ordered
   */
  INTPTR_T(8, "intptr_t", "intptr_t"),

  /**
   * The '<em><b>Uintptr t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINTPTR_T_VALUE
   * @generated
   * @ordered
   */
  UINTPTR_T(9, "uintptr_t", "uintptr_t");

  /**
   * The '<em><b>Int</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT
   * @model name="int"
   * @generated
   * @ordered
   */
  public static final int INT_VALUE = 0;

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 1;

  /**
   * The '<em><b>Int8 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int8 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT8_T
   * @model name="int8_t"
   * @generated
   * @ordered
   */
  public static final int INT8_T_VALUE = 2;

  /**
   * The '<em><b>Uint8 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uint8 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT8_T
   * @model name="uint8_t"
   * @generated
   * @ordered
   */
  public static final int UINT8_T_VALUE = 3;

  /**
   * The '<em><b>Int16 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int16 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT16_T
   * @model name="int16_t"
   * @generated
   * @ordered
   */
  public static final int INT16_T_VALUE = 4;

  /**
   * The '<em><b>Uint16 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uint16 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT16_T
   * @model name="uint16_t"
   * @generated
   * @ordered
   */
  public static final int UINT16_T_VALUE = 5;

  /**
   * The '<em><b>Int32 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int32 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT32_T
   * @model name="int32_t"
   * @generated
   * @ordered
   */
  public static final int INT32_T_VALUE = 6;

  /**
   * The '<em><b>Uint32 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uint32 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT32_T
   * @model name="uint32_t"
   * @generated
   * @ordered
   */
  public static final int UINT32_T_VALUE = 7;

  /**
   * The '<em><b>Intptr t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Intptr t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTPTR_T
   * @model name="intptr_t"
   * @generated
   * @ordered
   */
  public static final int INTPTR_T_VALUE = 8;

  /**
   * The '<em><b>Uintptr t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uintptr t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINTPTR_T
   * @model name="uintptr_t"
   * @generated
   * @ordered
   */
  public static final int UINTPTR_T_VALUE = 9;

  /**
   * An array of all the '<em><b>Attribute Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributeType[] VALUES_ARRAY =
    new AttributeType[]
    {
      INT,
      STRING,
      INT8_T,
      UINT8_T,
      INT16_T,
      UINT16_T,
      INT32_T,
      UINT32_T,
      INTPTR_T,
      UINTPTR_T,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeType get(int value)
  {
    switch (value)
    {
      case INT_VALUE: return INT;
      case STRING_VALUE: return STRING;
      case INT8_T_VALUE: return INT8_T;
      case UINT8_T_VALUE: return UINT8_T;
      case INT16_T_VALUE: return INT16_T;
      case UINT16_T_VALUE: return UINT16_T;
      case INT32_T_VALUE: return INT32_T;
      case UINT32_T_VALUE: return UINT32_T;
      case INTPTR_T_VALUE: return INTPTR_T;
      case UINTPTR_T_VALUE: return UINTPTR_T;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private AttributeType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //AttributeType
