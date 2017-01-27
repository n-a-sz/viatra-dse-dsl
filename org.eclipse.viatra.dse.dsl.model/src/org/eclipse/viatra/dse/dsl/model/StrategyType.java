/**
 */
package org.eclipse.viatra.dse.dsl.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strategy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getStrategyType()
 * @model
 * @generated
 */
public enum StrategyType implements Enumerator {
	/**
	 * The '<em><b>Dfs Strategy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DFS_STRATEGY_VALUE
	 * @generated
	 * @ordered
	 */
	DFS_STRATEGY(0, "DfsStrategy", "DfsStrategy"),

	/**
	 * The '<em><b>Bfs Strategy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BFS_STRATEGY_VALUE
	 * @generated
	 * @ordered
	 */
	BFS_STRATEGY(0, "BfsStrategy", "BfsStrategy"),

	/**
	 * The '<em><b>Fixed Priority Strategy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_STRATEGY_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_PRIORITY_STRATEGY(2, "FixedPriorityStrategy", "FixedPriorityStrategy"),

	/**
	 * The '<em><b>Hill Climbing Strategy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILL_CLIMBING_STRATEGY_VALUE
	 * @generated
	 * @ordered
	 */
	HILL_CLIMBING_STRATEGY(3, "HillClimbingStrategy", "HillClimbingStrategy");

	/**
	 * The '<em><b>Dfs Strategy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dfs Strategy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DFS_STRATEGY
	 * @model name="DfsStrategy"
	 * @generated
	 * @ordered
	 */
	public static final int DFS_STRATEGY_VALUE = 0;

	/**
	 * The '<em><b>Bfs Strategy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bfs Strategy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BFS_STRATEGY
	 * @model name="BfsStrategy"
	 * @generated
	 * @ordered
	 */
	public static final int BFS_STRATEGY_VALUE = 0;

	/**
	 * The '<em><b>Fixed Priority Strategy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed Priority Strategy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_STRATEGY
	 * @model name="FixedPriorityStrategy"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_PRIORITY_STRATEGY_VALUE = 2;

	/**
	 * The '<em><b>Hill Climbing Strategy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hill Climbing Strategy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HILL_CLIMBING_STRATEGY
	 * @model name="HillClimbingStrategy"
	 * @generated
	 * @ordered
	 */
	public static final int HILL_CLIMBING_STRATEGY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StrategyType[] VALUES_ARRAY =
		new StrategyType[] {
			DFS_STRATEGY,
			BFS_STRATEGY,
			FIXED_PRIORITY_STRATEGY,
			HILL_CLIMBING_STRATEGY,
		};

	/**
	 * A public read-only list of all the '<em><b>Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StrategyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Strategy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrategyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrategyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strategy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrategyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrategyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strategy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrategyType get(int value) {
		switch (value) {
			case DFS_STRATEGY_VALUE: return DFS_STRATEGY;
			case FIXED_PRIORITY_STRATEGY_VALUE: return FIXED_PRIORITY_STRATEGY;
			case HILL_CLIMBING_STRATEGY_VALUE: return HILL_CLIMBING_STRATEGY;
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
	private StrategyType(int value, String name, String literal) {
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
	
} //StrategyType
