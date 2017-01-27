/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dse Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getInitialmodel <em>Initialmodel</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getTransformationrules <em>Transformationrules</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getStatecoder <em>Statecoder</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getSolutionstore <em>Solutionstore</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem()
 * @model
 * @generated
 */
public interface DseProblem extends DseImport {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getDseproblems <em>Dseproblems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference.
	 * @see #setConfigurations(Configuration)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Configurations()
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration#getDseproblems
	 * @model opposite="dseproblems" required="true"
	 * @generated
	 */
	Configuration getConfigurations();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getConfigurations <em>Configurations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(Configuration value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Constraints()
	 * @model
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Initialmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialmodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialmodel</em>' reference.
	 * @see #setInitialmodel(InitialModel)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Initialmodel()
	 * @model required="true"
	 * @generated
	 */
	InitialModel getInitialmodel();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getInitialmodel <em>Initialmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialmodel</em>' reference.
	 * @see #getInitialmodel()
	 * @generated
	 */
	void setInitialmodel(InitialModel value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(MetaModel)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	MetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetaModel value);

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.BaseObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Objectives()
	 * @model required="true"
	 * @generated
	 */
	EList<BaseObjective> getObjectives();

	/**
	 * Returns the value of the '<em><b>Transformationrules</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.TransformationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformationrules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformationrules</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Transformationrules()
	 * @model required="true"
	 * @generated
	 */
	EList<TransformationRule> getTransformationrules();

	/**
	 * Returns the value of the '<em><b>Statecoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statecoder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statecoder</em>' reference.
	 * @see #setStatecoder(StateCoder)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Statecoder()
	 * @model
	 * @generated
	 */
	StateCoder getStatecoder();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getStatecoder <em>Statecoder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statecoder</em>' reference.
	 * @see #getStatecoder()
	 * @generated
	 */
	void setStatecoder(StateCoder value);

	/**
	 * Returns the value of the '<em><b>Solutionstore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutionstore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutionstore</em>' reference.
	 * @see #setSolutionstore(SolutionStore)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Solutionstore()
	 * @model
	 * @generated
	 */
	SolutionStore getSolutionstore();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getSolutionstore <em>Solutionstore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solutionstore</em>' reference.
	 * @see #getSolutionstore()
	 * @generated
	 */
	void setSolutionstore(SolutionStore value);

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
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseProblem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DseProblem
