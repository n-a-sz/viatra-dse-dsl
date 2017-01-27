/**
 */
package org.eclipse.viatra.dse.dsl.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Query Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getModelQueryType()
 * @model
 * @generated
 */
public enum ModelQueryType implements Enumerator {
	/**
	 * The '<em><b>MUST HAVE MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_HAVE_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MUST_HAVE_MATCH(0, "MUST_HAVE_MATCH", "MUST_HAVE_MATCH"),

	/**
	 * The '<em><b>NO MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	NO_MATCH(1, "NO_MATCH", "NO_MATCH");

	/**
	 * The '<em><b>MUST HAVE MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MUST HAVE MATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUST_HAVE_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUST_HAVE_MATCH_VALUE = 0;

	/**
	 * The '<em><b>NO MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO MATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_MATCH_VALUE = 1;

	/**
	 * An array of all the '<em><b>Model Query Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelQueryType[] VALUES_ARRAY =
		new ModelQueryType[] {
			MUST_HAVE_MATCH,
			NO_MATCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Query Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelQueryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Query Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelQueryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelQueryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Query Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelQueryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelQueryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Query Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelQueryType get(int value) {
		switch (value) {
			case MUST_HAVE_MATCH_VALUE: return MUST_HAVE_MATCH;
			case NO_MATCH_VALUE: return NO_MATCH;
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
	private ModelQueryType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModelQueryType
