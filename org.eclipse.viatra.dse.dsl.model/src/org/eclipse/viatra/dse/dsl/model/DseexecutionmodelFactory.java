/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage
 * @generated
 */
public interface DseexecutionmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DseexecutionmodelFactory eINSTANCE = org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dse Execution Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dse Execution Model</em>'.
	 * @generated
	 */
	DseExecutionModel createDseExecutionModel();

	/**
	 * Returns a new object of class '<em>Dse Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dse Problem</em>'.
	 * @generated
	 */
	DseProblem createDseProblem();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy</em>'.
	 * @generated
	 */
	Strategy createStrategy();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Initial Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Model</em>'.
	 * @generated
	 */
	InitialModel createInitialModel();

	/**
	 * Returns a new object of class '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model</em>'.
	 * @generated
	 */
	MetaModel createMetaModel();

	/**
	 * Returns a new object of class '<em>Base Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Objective</em>'.
	 * @generated
	 */
	BaseObjective createBaseObjective();

	/**
	 * Returns a new object of class '<em>Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Rule</em>'.
	 * @generated
	 */
	TransformationRule createTransformationRule();

	/**
	 * Returns a new object of class '<em>State Coder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Coder</em>'.
	 * @generated
	 */
	StateCoder createStateCoder();

	/**
	 * Returns a new object of class '<em>Constraints Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraints Objective</em>'.
	 * @generated
	 */
	ConstraintsObjective createConstraintsObjective();

	/**
	 * Returns a new object of class '<em>Query Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Constraint</em>'.
	 * @generated
	 */
	QueryConstraint createQueryConstraint();

	/**
	 * Returns a new object of class '<em>Solution Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Store</em>'.
	 * @generated
	 */
	SolutionStore createSolutionStore();

	/**
	 * Returns a new object of class '<em>Dse Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dse Import</em>'.
	 * @generated
	 */
	DseImport createDseImport();

	/**
	 * Returns a new object of class '<em>Evolutionary Strategy Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evolutionary Strategy Builder</em>'.
	 * @generated
	 */
	EvolutionaryStrategyBuilder createEvolutionaryStrategyBuilder();

	/**
	 * Returns a new object of class '<em>IMutation Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IMutation Rate</em>'.
	 * @generated
	 */
	IMutationRate createIMutationRate();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DseexecutionmodelPackage getDseexecutionmodelPackage();

} //DseexecutionmodelFactory
