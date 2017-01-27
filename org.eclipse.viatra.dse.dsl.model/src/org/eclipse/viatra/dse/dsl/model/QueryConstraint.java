/**
 */
package org.eclipse.viatra.dse.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getQueryConstraint()
 * @model
 * @generated
 */
public interface QueryConstraint extends Constraint {
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
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getQueryConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getQueryConstraint_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.dse.dsl.model.ModelQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.viatra.dse.dsl.model.ModelQueryType
	 * @see #setType(ModelQueryType)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getQueryConstraint_Type()
	 * @model
	 * @generated
	 */
	ModelQueryType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.viatra.dse.dsl.model.ModelQueryType
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelQueryType value);

} // QueryConstraint
