/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.ConstraintsObjective#getSoftConstraints <em>Soft Constraints</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.ConstraintsObjective#getHardConstraints <em>Hard Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConstraintsObjective()
 * @model
 * @generated
 */
public interface ConstraintsObjective extends BaseObjective {
	/**
	 * Returns the value of the '<em><b>Soft Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.QueryConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Constraints</em>' containment reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConstraintsObjective_SoftConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryConstraint> getSoftConstraints();

	/**
	 * Returns the value of the '<em><b>Hard Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.QueryConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Constraints</em>' containment reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConstraintsObjective_HardConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryConstraint> getHardConstraints();

} // ConstraintsObjective
