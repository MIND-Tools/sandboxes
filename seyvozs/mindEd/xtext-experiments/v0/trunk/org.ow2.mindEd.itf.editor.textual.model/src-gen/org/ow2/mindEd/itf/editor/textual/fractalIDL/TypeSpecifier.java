/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Specifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getTypeSpecifier()
 * @model
 * @generated
 */
public enum TypeSpecifier implements Enumerator
{
  /**
   * The '<em><b>Void</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOID_VALUE
   * @generated
   * @ordered
   */
  VOID(0, "void", "void"),

  /**
   * The '<em><b>Char</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHAR_VALUE
   * @generated
   * @ordered
   */
  CHAR(1, "char", "char"),

  /**
   * The '<em><b>Short</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHORT_VALUE
   * @generated
   * @ordered
   */
  SHORT(2, "short", "short"),

  /**
   * The '<em><b>Int</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(3, "int", "int"),

  /**
   * The '<em><b>Long</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_VALUE
   * @generated
   * @ordered
   */
  LONG(4, "long", "long"),

  /**
   * The '<em><b>Float</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(5, "float", "float"),

  /**
   * The '<em><b>Double</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(6, "double", "double"),

  /**
   * The '<em><b>Signed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGNED_VALUE
   * @generated
   * @ordered
   */
  SIGNED(7, "signed", "signed"),

  /**
   * The '<em><b>Unsigned</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSIGNED_VALUE
   * @generated
   * @ordered
   */
  UNSIGNED(8, "unsigned", "unsigned"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(9, "string", "string"),

  /**
   * The '<em><b>Int8 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT8_T_VALUE
   * @generated
   * @ordered
   */
  INT8_T(10, "int8_t", "int8_t"),

  /**
   * The '<em><b>Uint8 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT8_T_VALUE
   * @generated
   * @ordered
   */
  UINT8_T(11, "uint8_t", "uint8_t"),

  /**
   * The '<em><b>Int16 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT16_T_VALUE
   * @generated
   * @ordered
   */
  INT16_T(12, "int16_t", "int16_t"),

  /**
   * The '<em><b>Uint16 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT16_T_VALUE
   * @generated
   * @ordered
   */
  UINT16_T(13, "uint16_t", "uint16_t"),

  /**
   * The '<em><b>Int32 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT32_T_VALUE
   * @generated
   * @ordered
   */
  INT32_T(14, "int32_t", "int32_t"),

  /**
   * The '<em><b>Uint32 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT32_T_VALUE
   * @generated
   * @ordered
   */
  UINT32_T(15, "uint32_t", "uint32_t"),

  /**
   * The '<em><b>Int64 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT64_T_VALUE
   * @generated
   * @ordered
   */
  INT64_T(16, "int64_t", "int64_t"),

  /**
   * The '<em><b>Uint64 t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT64_T_VALUE
   * @generated
   * @ordered
   */
  UINT64_T(17, "uint64_t", "uint64_t"),

  /**
   * The '<em><b>Intptr t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTPTR_T_VALUE
   * @generated
   * @ordered
   */
  INTPTR_T(18, "intptr_t", "intptr_t"),

  /**
   * The '<em><b>Uintptr t</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINTPTR_T_VALUE
   * @generated
   * @ordered
   */
  UINTPTR_T(19, "uintptr_t", "uintptr_t");

  /**
   * The '<em><b>Void</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Void</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOID
   * @model name="void"
   * @generated
   * @ordered
   */
  public static final int VOID_VALUE = 0;

  /**
   * The '<em><b>Char</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHAR
   * @model name="char"
   * @generated
   * @ordered
   */
  public static final int CHAR_VALUE = 1;

  /**
   * The '<em><b>Short</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHORT
   * @model name="short"
   * @generated
   * @ordered
   */
  public static final int SHORT_VALUE = 2;

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
  public static final int INT_VALUE = 3;

  /**
   * The '<em><b>Long</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONG
   * @model name="long"
   * @generated
   * @ordered
   */
  public static final int LONG_VALUE = 4;

  /**
   * The '<em><b>Float</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model name="float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 5;

  /**
   * The '<em><b>Double</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model name="double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 6;

  /**
   * The '<em><b>Signed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Signed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGNED
   * @model name="signed"
   * @generated
   * @ordered
   */
  public static final int SIGNED_VALUE = 7;

  /**
   * The '<em><b>Unsigned</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unsigned</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNSIGNED
   * @model name="unsigned"
   * @generated
   * @ordered
   */
  public static final int UNSIGNED_VALUE = 8;

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
  public static final int STRING_VALUE = 9;

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
  public static final int INT8_T_VALUE = 10;

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
  public static final int UINT8_T_VALUE = 11;

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
  public static final int INT16_T_VALUE = 12;

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
  public static final int UINT16_T_VALUE = 13;

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
  public static final int INT32_T_VALUE = 14;

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
  public static final int UINT32_T_VALUE = 15;

  /**
   * The '<em><b>Int64 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int64 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT64_T
   * @model name="int64_t"
   * @generated
   * @ordered
   */
  public static final int INT64_T_VALUE = 16;

  /**
   * The '<em><b>Uint64 t</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uint64 t</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT64_T
   * @model name="uint64_t"
   * @generated
   * @ordered
   */
  public static final int UINT64_T_VALUE = 17;

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
  public static final int INTPTR_T_VALUE = 18;

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
  public static final int UINTPTR_T_VALUE = 19;

  /**
   * An array of all the '<em><b>Type Specifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeSpecifier[] VALUES_ARRAY =
    new TypeSpecifier[]
    {
      VOID,
      CHAR,
      SHORT,
      INT,
      LONG,
      FLOAT,
      DOUBLE,
      SIGNED,
      UNSIGNED,
      STRING,
      INT8_T,
      UINT8_T,
      INT16_T,
      UINT16_T,
      INT32_T,
      UINT32_T,
      INT64_T,
      UINT64_T,
      INTPTR_T,
      UINTPTR_T,
    };

  /**
   * A public read-only list of all the '<em><b>Type Specifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TypeSpecifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Specifier</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeSpecifier get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TypeSpecifier result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Specifier</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeSpecifier getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TypeSpecifier result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Specifier</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeSpecifier get(int value)
  {
    switch (value)
    {
      case VOID_VALUE: return VOID;
      case CHAR_VALUE: return CHAR;
      case SHORT_VALUE: return SHORT;
      case INT_VALUE: return INT;
      case LONG_VALUE: return LONG;
      case FLOAT_VALUE: return FLOAT;
      case DOUBLE_VALUE: return DOUBLE;
      case SIGNED_VALUE: return SIGNED;
      case UNSIGNED_VALUE: return UNSIGNED;
      case STRING_VALUE: return STRING;
      case INT8_T_VALUE: return INT8_T;
      case UINT8_T_VALUE: return UINT8_T;
      case INT16_T_VALUE: return INT16_T;
      case UINT16_T_VALUE: return UINT16_T;
      case INT32_T_VALUE: return INT32_T;
      case UINT32_T_VALUE: return UINT32_T;
      case INT64_T_VALUE: return INT64_T;
      case UINT64_T_VALUE: return UINT64_T;
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
  private TypeSpecifier(int value, String name, String literal)
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
  
} //TypeSpecifier
