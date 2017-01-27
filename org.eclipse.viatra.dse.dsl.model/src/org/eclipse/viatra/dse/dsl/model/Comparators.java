/**
 */
package org.eclipse.viatra.dse.dsl.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparators</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getComparators()
 * @model
 * @generated
 */
public enum Comparators implements Enumerator {
	/**
	 * The '<em><b>HIGHER IS BETTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_IS_BETTER_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHER_IS_BETTER(0, "HIGHER_IS_BETTER", "HIGHER_IS_BETTER"),

	/**
	 * The '<em><b>LOWER IS BETTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_IS_BETTER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_IS_BETTER(1, "LOWER_IS_BETTER", "LOWER_IS_BETTER"),

	/**
	 * The '<em><b>DIFFERENCE TO ZERO IS BETTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCE_TO_ZERO_IS_BETTER_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENCE_TO_ZERO_IS_BETTER(2, "DIFFERENCE_TO_ZERO_IS_BETTER", "DIFFERENCE_TO_ZERO_IS_BETTER");

	/**
	 * The '<em><b>HIGHER IS BETTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHER IS BETTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHER_IS_BETTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHER_IS_BETTER_VALUE = 0;

	/**
	 * The '<em><b>LOWER IS BETTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER IS BETTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_IS_BETTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_IS_BETTER_VALUE = 1;

	/**
	 * The '<em><b>DIFFERENCE TO ZERO IS BETTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIFFERENCE TO ZERO IS BETTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCE_TO_ZERO_IS_BETTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENCE_TO_ZERO_IS_BETTER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Comparators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Comparators[] VALUES_ARRAY =
		new Comparators[] {
			HIGHER_IS_BETTER,
			LOWER_IS_BETTER,
			DIFFERENCE_TO_ZERO_IS_BETTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Comparators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparators</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparators</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparators</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparators get(int value) {
		switch (value) {
			case HIGHER_IS_BETTER_VALUE: return HIGHER_IS_BETTER;
			case LOWER_IS_BETTER_VALUE: return LOWER_IS_BETTER;
			case DIFFERENCE_TO_ZERO_IS_BETTER_VALUE: return DIFFERENCE_TO_ZERO_IS_BETTER;
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
	private Comparators(int value, String name, String literal) {
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
	
} //Comparators
