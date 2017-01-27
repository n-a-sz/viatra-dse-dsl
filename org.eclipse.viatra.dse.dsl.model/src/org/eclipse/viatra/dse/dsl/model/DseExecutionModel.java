/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dse Execution Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getDseproblems <em>Dseproblems</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getDseproblemcomponents <em>Dseproblemcomponents</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getNumberOfRuns <em>Number Of Runs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel()
 * @model
 * @generated
 */
public interface DseExecutionModel extends Type {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

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
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel_Configurations()
	 * @model
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Dseproblems</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.DseProblem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dseproblems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dseproblems</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel_Dseproblems()
	 * @model
	 * @generated
	 */
	EList<DseProblem> getDseproblems();

	/**
	 * Returns the value of the '<em><b>Dseproblemcomponents</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.DseProblemComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dseproblemcomponents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dseproblemcomponents</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel_Dseproblemcomponents()
	 * @model
	 * @generated
	 */
	EList<DseProblemComponent> getDseproblemcomponents();

	/**
	 * Returns the value of the '<em><b>Number Of Runs</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Runs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Runs</em>' attribute.
	 * @see #setNumberOfRuns(int)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseExecutionModel_NumberOfRuns()
	 * @model default="1"
	 * @generated
	 */
	int getNumberOfRuns();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getNumberOfRuns <em>Number Of Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Runs</em>' attribute.
	 * @see #getNumberOfRuns()
	 * @generated
	 */
	void setNumberOfRuns(int value);

} // DseExecutionModel
