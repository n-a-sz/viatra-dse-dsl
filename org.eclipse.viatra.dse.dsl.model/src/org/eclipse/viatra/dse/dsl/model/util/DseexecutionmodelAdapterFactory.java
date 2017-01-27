/**
 */
package org.eclipse.viatra.dse.dsl.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.viatra.dse.dsl.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage
 * @generated
 */
public class DseexecutionmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DseexecutionmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseexecutionmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DseexecutionmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DseexecutionmodelSwitch<Adapter> modelSwitch =
		new DseexecutionmodelSwitch<Adapter>() {
			@Override
			public Adapter caseDseExecutionModel(DseExecutionModel object) {
				return createDseExecutionModelAdapter();
			}
			@Override
			public Adapter caseDseProblem(DseProblem object) {
				return createDseProblemAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseInitialModel(InitialModel object) {
				return createInitialModelAdapter();
			}
			@Override
			public Adapter caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			@Override
			public Adapter caseBaseObjective(BaseObjective object) {
				return createBaseObjectiveAdapter();
			}
			@Override
			public Adapter caseTransformationRule(TransformationRule object) {
				return createTransformationRuleAdapter();
			}
			@Override
			public Adapter caseDseProblemComponent(DseProblemComponent object) {
				return createDseProblemComponentAdapter();
			}
			@Override
			public Adapter caseStateCoder(StateCoder object) {
				return createStateCoderAdapter();
			}
			@Override
			public Adapter caseConstraintsObjective(ConstraintsObjective object) {
				return createConstraintsObjectiveAdapter();
			}
			@Override
			public Adapter caseQueryConstraint(QueryConstraint object) {
				return createQueryConstraintAdapter();
			}
			@Override
			public Adapter caseSolutionStore(SolutionStore object) {
				return createSolutionStoreAdapter();
			}
			@Override
			public Adapter caseDseImport(DseImport object) {
				return createDseImportAdapter();
			}
			@Override
			public Adapter caseEvolutionaryStrategyBuilder(EvolutionaryStrategyBuilder object) {
				return createEvolutionaryStrategyBuilderAdapter();
			}
			@Override
			public Adapter caseIMutationRate(IMutationRate object) {
				return createIMutationRateAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseBaseStrategy(BaseStrategy object) {
				return createBaseStrategyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel <em>Dse Execution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel
	 * @generated
	 */
	public Adapter createDseExecutionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.DseProblem <em>Dse Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem
	 * @generated
	 */
	public Adapter createDseProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.InitialModel <em>Initial Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.InitialModel
	 * @generated
	 */
	public Adapter createInitialModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective <em>Base Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseObjective
	 * @generated
	 */
	public Adapter createBaseObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.TransformationRule <em>Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.TransformationRule
	 * @generated
	 */
	public Adapter createTransformationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.DseProblemComponent <em>Dse Problem Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblemComponent
	 * @generated
	 */
	public Adapter createDseProblemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.StateCoder <em>State Coder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.StateCoder
	 * @generated
	 */
	public Adapter createStateCoderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.ConstraintsObjective <em>Constraints Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.ConstraintsObjective
	 * @generated
	 */
	public Adapter createConstraintsObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint <em>Query Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.QueryConstraint
	 * @generated
	 */
	public Adapter createQueryConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore <em>Solution Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore
	 * @generated
	 */
	public Adapter createSolutionStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.DseImport <em>Dse Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.DseImport
	 * @generated
	 */
	public Adapter createDseImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder <em>Evolutionary Strategy Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder
	 * @generated
	 */
	public Adapter createEvolutionaryStrategyBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.IMutationRate <em>IMutation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.IMutationRate
	 * @generated
	 */
	public Adapter createIMutationRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.dse.dsl.model.BaseStrategy <em>Base Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseStrategy
	 * @generated
	 */
	public Adapter createBaseStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DseexecutionmodelAdapterFactory
