/**
 */
package org.eclipse.viatra.dse.dsl.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.viatra.dse.dsl.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage
 * @generated
 */
public class DseexecutionmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DseexecutionmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseexecutionmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = DseexecutionmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL: {
				DseExecutionModel dseExecutionModel = (DseExecutionModel)theEObject;
				T result = caseDseExecutionModel(dseExecutionModel);
				if (result == null) result = caseType(dseExecutionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.DSE_PROBLEM: {
				DseProblem dseProblem = (DseProblem)theEObject;
				T result = caseDseProblem(dseProblem);
				if (result == null) result = caseDseImport(dseProblem);
				if (result == null) result = caseType(dseProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseType(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseBaseStrategy(strategy);
				if (result == null) result = caseType(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseDseProblemComponent(constraint);
				if (result == null) result = caseType(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.INITIAL_MODEL: {
				InitialModel initialModel = (InitialModel)theEObject;
				T result = caseInitialModel(initialModel);
				if (result == null) result = caseDseProblemComponent(initialModel);
				if (result == null) result = caseType(initialModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.META_MODEL: {
				MetaModel metaModel = (MetaModel)theEObject;
				T result = caseMetaModel(metaModel);
				if (result == null) result = caseDseProblemComponent(metaModel);
				if (result == null) result = caseType(metaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.BASE_OBJECTIVE: {
				BaseObjective baseObjective = (BaseObjective)theEObject;
				T result = caseBaseObjective(baseObjective);
				if (result == null) result = caseDseProblemComponent(baseObjective);
				if (result == null) result = caseType(baseObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.TRANSFORMATION_RULE: {
				TransformationRule transformationRule = (TransformationRule)theEObject;
				T result = caseTransformationRule(transformationRule);
				if (result == null) result = caseDseProblemComponent(transformationRule);
				if (result == null) result = caseType(transformationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.DSE_PROBLEM_COMPONENT: {
				DseProblemComponent dseProblemComponent = (DseProblemComponent)theEObject;
				T result = caseDseProblemComponent(dseProblemComponent);
				if (result == null) result = caseType(dseProblemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.STATE_CODER: {
				StateCoder stateCoder = (StateCoder)theEObject;
				T result = caseStateCoder(stateCoder);
				if (result == null) result = caseDseProblemComponent(stateCoder);
				if (result == null) result = caseType(stateCoder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE: {
				ConstraintsObjective constraintsObjective = (ConstraintsObjective)theEObject;
				T result = caseConstraintsObjective(constraintsObjective);
				if (result == null) result = caseBaseObjective(constraintsObjective);
				if (result == null) result = caseDseProblemComponent(constraintsObjective);
				if (result == null) result = caseType(constraintsObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.QUERY_CONSTRAINT: {
				QueryConstraint queryConstraint = (QueryConstraint)theEObject;
				T result = caseQueryConstraint(queryConstraint);
				if (result == null) result = caseConstraint(queryConstraint);
				if (result == null) result = caseDseProblemComponent(queryConstraint);
				if (result == null) result = caseType(queryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.SOLUTION_STORE: {
				SolutionStore solutionStore = (SolutionStore)theEObject;
				T result = caseSolutionStore(solutionStore);
				if (result == null) result = caseDseProblemComponent(solutionStore);
				if (result == null) result = caseType(solutionStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.DSE_IMPORT: {
				DseImport dseImport = (DseImport)theEObject;
				T result = caseDseImport(dseImport);
				if (result == null) result = caseType(dseImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER: {
				EvolutionaryStrategyBuilder evolutionaryStrategyBuilder = (EvolutionaryStrategyBuilder)theEObject;
				T result = caseEvolutionaryStrategyBuilder(evolutionaryStrategyBuilder);
				if (result == null) result = caseBaseStrategy(evolutionaryStrategyBuilder);
				if (result == null) result = caseType(evolutionaryStrategyBuilder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.IMUTATION_RATE: {
				IMutationRate iMutationRate = (IMutationRate)theEObject;
				T result = caseIMutationRate(iMutationRate);
				if (result == null) result = caseType(iMutationRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseexecutionmodelPackage.BASE_STRATEGY: {
				BaseStrategy baseStrategy = (BaseStrategy)theEObject;
				T result = caseBaseStrategy(baseStrategy);
				if (result == null) result = caseType(baseStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dse Execution Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dse Execution Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDseExecutionModel(DseExecutionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dse Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dse Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDseProblem(DseProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialModel(InitialModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModel(MetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseObjective(BaseObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationRule(TransformationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dse Problem Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dse Problem Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDseProblemComponent(DseProblemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Coder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Coder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateCoder(StateCoder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsObjective(ConstraintsObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryConstraint(QueryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionStore(SolutionStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dse Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dse Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDseImport(DseImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evolutionary Strategy Builder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evolutionary Strategy Builder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvolutionaryStrategyBuilder(EvolutionaryStrategyBuilder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMutation Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMutation Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMutationRate(IMutationRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseStrategy(BaseStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DseexecutionmodelSwitch
