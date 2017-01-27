/**
 */
package org.eclipse.viatra.dse.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMutation Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.IMutationRate#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.IMutationRate#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getIMutationRate()
 * @model
 * @generated
 */
public interface IMutationRate extends Type {
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
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getIMutationRate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.IMutationRate#getName <em>Name</em>}' attribute.
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
	 * @see #setWeight(int)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getIMutationRate_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.IMutationRate#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

} // IMutationRate
