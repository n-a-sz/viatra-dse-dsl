/**
 */
package org.eclipse.viatra.dse.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.Constraint#getConstraintName <em>Constraint Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends DseProblemComponent {
	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConstraint_ConstraintName()
	 * @model
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.Constraint#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

} // Constraint
