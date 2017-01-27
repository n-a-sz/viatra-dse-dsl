/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.Configuration#getDseproblems <em>Dseproblems</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.Configuration#getMaxNumberOfThreads <em>Max Number Of Threads</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.Configuration#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Type {
	/**
	 * Returns the value of the '<em><b>Dseproblems</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.DseProblem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dseproblems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dseproblems</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConfiguration_Dseproblems()
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getConfigurations
	 * @model opposite="configurations"
	 * @generated
	 */
	EList<DseProblem> getDseproblems();

	/**
	 * Returns the value of the '<em><b>Max Number Of Threads</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Threads</em>' attribute.
	 * @see #setMaxNumberOfThreads(int)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConfiguration_MaxNumberOfThreads()
	 * @model default="1"
	 * @generated
	 */
	int getMaxNumberOfThreads();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getMaxNumberOfThreads <em>Max Number Of Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Threads</em>' attribute.
	 * @see #getMaxNumberOfThreads()
	 * @generated
	 */
	void setMaxNumberOfThreads(int value);

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
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see #setStrategy(BaseStrategy)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getConfiguration_Strategy()
	 * @model required="true"
	 * @generated
	 */
	BaseStrategy getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getStrategy <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(BaseStrategy value);

} // Configuration
