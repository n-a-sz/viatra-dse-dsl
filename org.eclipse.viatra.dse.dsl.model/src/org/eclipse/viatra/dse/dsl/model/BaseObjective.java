/**
 */
package org.eclipse.viatra.dse.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getFitnessConstraint <em>Fitness Constraint</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getBaseObjective()
 * @model
 * @generated
 */
public interface BaseObjective extends DseProblemComponent {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getBaseObjective_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fitness Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fitness Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fitness Constraint</em>' attribute.
	 * @see #setFitnessConstraint(double)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getBaseObjective_FitnessConstraint()
	 * @model
	 * @generated
	 */
	double getFitnessConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getFitnessConstraint <em>Fitness Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fitness Constraint</em>' attribute.
	 * @see #getFitnessConstraint()
	 * @generated
	 */
	void setFitnessConstraint(double value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The default value is <code>"HIGHER_IS_BETTER"</code>.
	 * The literals are from the enumeration {@link org.eclipse.viatra.dse.dsl.model.Comparators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see org.eclipse.viatra.dse.dsl.model.Comparators
	 * @see #setComparator(Comparators)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getBaseObjective_Comparator()
	 * @model default="HIGHER_IS_BETTER"
	 * @generated
	 */
	Comparators getComparator();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see org.eclipse.viatra.dse.dsl.model.Comparators
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Comparators value);

} // BaseObjective
