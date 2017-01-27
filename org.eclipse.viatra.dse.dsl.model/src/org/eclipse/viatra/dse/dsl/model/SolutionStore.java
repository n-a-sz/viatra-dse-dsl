/**
 */
package org.eclipse.viatra.dse.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#getFoundSolutions <em>Found Solutions</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isAcceptAnySolutions <em>Accept Any Solutions</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isStoreBestSolutionsOnly <em>Store Best Solutions Only</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isLogSolutionsWhenFound <em>Log Solutions When Found</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isRegisterSolutionFoundHandler <em>Register Solution Found Handler</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore()
 * @model
 * @generated
 */
public interface SolutionStore extends DseProblemComponent {
	/**
	 * Returns the value of the '<em><b>Found Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Found Solutions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Found Solutions</em>' attribute.
	 * @see #setFoundSolutions(int)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore_FoundSolutions()
	 * @model
	 * @generated
	 */
	int getFoundSolutions();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#getFoundSolutions <em>Found Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Found Solutions</em>' attribute.
	 * @see #getFoundSolutions()
	 * @generated
	 */
	void setFoundSolutions(int value);

	/**
	 * Returns the value of the '<em><b>Accept Any Solutions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Any Solutions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Any Solutions</em>' attribute.
	 * @see #setAcceptAnySolutions(boolean)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore_AcceptAnySolutions()
	 * @model default="false"
	 * @generated
	 */
	boolean isAcceptAnySolutions();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isAcceptAnySolutions <em>Accept Any Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Any Solutions</em>' attribute.
	 * @see #isAcceptAnySolutions()
	 * @generated
	 */
	void setAcceptAnySolutions(boolean value);

	/**
	 * Returns the value of the '<em><b>Store Best Solutions Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Best Solutions Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Best Solutions Only</em>' attribute.
	 * @see #setStoreBestSolutionsOnly(boolean)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore_StoreBestSolutionsOnly()
	 * @model default="false"
	 * @generated
	 */
	boolean isStoreBestSolutionsOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isStoreBestSolutionsOnly <em>Store Best Solutions Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Best Solutions Only</em>' attribute.
	 * @see #isStoreBestSolutionsOnly()
	 * @generated
	 */
	void setStoreBestSolutionsOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Log Solutions When Found</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Solutions When Found</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Solutions When Found</em>' attribute.
	 * @see #setLogSolutionsWhenFound(boolean)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore_LogSolutionsWhenFound()
	 * @model default="false"
	 * @generated
	 */
	boolean isLogSolutionsWhenFound();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isLogSolutionsWhenFound <em>Log Solutions When Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Solutions When Found</em>' attribute.
	 * @see #isLogSolutionsWhenFound()
	 * @generated
	 */
	void setLogSolutionsWhenFound(boolean value);

	/**
	 * Returns the value of the '<em><b>Register Solution Found Handler</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Solution Found Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Solution Found Handler</em>' attribute.
	 * @see #setRegisterSolutionFoundHandler(boolean)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore_RegisterSolutionFoundHandler()
	 * @model default="false"
	 * @generated
	 */
	boolean isRegisterSolutionFoundHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isRegisterSolutionFoundHandler <em>Register Solution Found Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Solution Found Handler</em>' attribute.
	 * @see #isRegisterSolutionFoundHandler()
	 * @generated
	 */
	void setRegisterSolutionFoundHandler(boolean value);

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
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getSolutionStore_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SolutionStore
