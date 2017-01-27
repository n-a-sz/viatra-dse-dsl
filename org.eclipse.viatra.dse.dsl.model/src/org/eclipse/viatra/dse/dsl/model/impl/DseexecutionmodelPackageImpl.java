/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.viatra.dse.dsl.model.BaseObjective;
import org.eclipse.viatra.dse.dsl.model.BaseStrategy;
import org.eclipse.viatra.dse.dsl.model.Comparators;
import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.Constraint;
import org.eclipse.viatra.dse.dsl.model.ConstraintsObjective;
import org.eclipse.viatra.dse.dsl.model.DomainModel;
import org.eclipse.viatra.dse.dsl.model.DseExecutionModel;
import org.eclipse.viatra.dse.dsl.model.DseImport;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.DseProblemComponent;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelFactory;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType;
import org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder;
import org.eclipse.viatra.dse.dsl.model.IMutationRate;
import org.eclipse.viatra.dse.dsl.model.InitialModel;
import org.eclipse.viatra.dse.dsl.model.MetaModel;
import org.eclipse.viatra.dse.dsl.model.ModelQueryType;
import org.eclipse.viatra.dse.dsl.model.QueryConstraint;
import org.eclipse.viatra.dse.dsl.model.SolutionStore;
import org.eclipse.viatra.dse.dsl.model.StateCoder;
import org.eclipse.viatra.dse.dsl.model.Strategy;
import org.eclipse.viatra.dse.dsl.model.StrategyType;
import org.eclipse.viatra.dse.dsl.model.TransformationRule;
import org.eclipse.viatra.dse.dsl.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DseexecutionmodelPackageImpl extends EPackageImpl implements DseexecutionmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseExecutionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProblemComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateCoderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolutionaryStrategyBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMutationRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelQueryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strategyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evolutionStrategyTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DseexecutionmodelPackageImpl() {
		super(eNS_URI, DseexecutionmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DseexecutionmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DseexecutionmodelPackage init() {
		if (isInited) return (DseexecutionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(DseexecutionmodelPackage.eNS_URI);

		// Obtain or create and register package
		DseexecutionmodelPackageImpl theDseexecutionmodelPackage = (DseexecutionmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DseexecutionmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DseexecutionmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDseexecutionmodelPackage.createPackageContents();

		// Initialize created meta-data
		theDseexecutionmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDseexecutionmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DseexecutionmodelPackage.eNS_URI, theDseexecutionmodelPackage);
		return theDseexecutionmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDseExecutionModel() {
		return dseExecutionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDseExecutionModel_PackageName() {
		return (EAttribute)dseExecutionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDseExecutionModel_Name() {
		return (EAttribute)dseExecutionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseExecutionModel_Configurations() {
		return (EReference)dseExecutionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseExecutionModel_Dseproblems() {
		return (EReference)dseExecutionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseExecutionModel_Dseproblemcomponents() {
		return (EReference)dseExecutionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDseExecutionModel_NumberOfRuns() {
		return (EAttribute)dseExecutionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDseProblem() {
		return dseProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Configurations() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Constraints() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Initialmodel() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Metamodel() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Objectives() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Transformationrules() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Statecoder() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDseProblem_Solutionstore() {
		return (EReference)dseProblemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDseProblem_Name() {
		return (EAttribute)dseProblemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Dseproblems() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_MaxNumberOfThreads() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Strategy() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Name() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Depth() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Type() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ConstraintName() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialModel() {
		return initialModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialModel_Name() {
		return (EAttribute)initialModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialModel_Path() {
		return (EAttribute)initialModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModel() {
		return metaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaModel_Name() {
		return (EAttribute)metaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObjective() {
		return baseObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObjective_Name() {
		return (EAttribute)baseObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObjective_FitnessConstraint() {
		return (EAttribute)baseObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObjective_Comparator() {
		return (EAttribute)baseObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationRule() {
		return transformationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationRule_ClassName() {
		return (EAttribute)transformationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationRule_MethodName() {
		return (EAttribute)transformationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationRule_Name() {
		return (EAttribute)transformationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDseProblemComponent() {
		return dseProblemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateCoder() {
		return stateCoderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateCoder_Name() {
		return (EAttribute)stateCoderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsObjective() {
		return constraintsObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsObjective_SoftConstraints() {
		return (EReference)constraintsObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsObjective_HardConstraints() {
		return (EReference)constraintsObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryConstraint() {
		return queryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryConstraint_Name() {
		return (EAttribute)queryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryConstraint_Weight() {
		return (EAttribute)queryConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryConstraint_Type() {
		return (EAttribute)queryConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionStore() {
		return solutionStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionStore_FoundSolutions() {
		return (EAttribute)solutionStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionStore_AcceptAnySolutions() {
		return (EAttribute)solutionStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionStore_StoreBestSolutionsOnly() {
		return (EAttribute)solutionStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionStore_LogSolutionsWhenFound() {
		return (EAttribute)solutionStoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionStore_RegisterSolutionFoundHandler() {
		return (EAttribute)solutionStoreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionStore_Name() {
		return (EAttribute)solutionStoreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDseImport() {
		return dseImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDseImport_Imports() {
		return (EAttribute)dseImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolutionaryStrategyBuilder() {
		return evolutionaryStrategyBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolutionaryStrategyBuilder_PopulationSize() {
		return (EAttribute)evolutionaryStrategyBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolutionaryStrategyBuilder_CrossOvers() {
		return (EAttribute)evolutionaryStrategyBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolutionaryStrategyBuilder_Type() {
		return (EAttribute)evolutionaryStrategyBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolutionaryStrategyBuilder_Name() {
		return (EAttribute)evolutionaryStrategyBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolutionaryStrategyBuilder_Mutations() {
		return (EReference)evolutionaryStrategyBuilderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMutationRate() {
		return iMutationRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMutationRate_Name() {
		return (EAttribute)iMutationRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMutationRate_Weight() {
		return (EAttribute)iMutationRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Type() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseStrategy() {
		return baseStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelQueryType() {
		return modelQueryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparators() {
		return comparatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrategyType() {
		return strategyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvolutionStrategyType() {
		return evolutionStrategyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseexecutionmodelFactory getDseexecutionmodelFactory() {
		return (DseexecutionmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dseExecutionModelEClass = createEClass(DSE_EXECUTION_MODEL);
		createEAttribute(dseExecutionModelEClass, DSE_EXECUTION_MODEL__PACKAGE_NAME);
		createEAttribute(dseExecutionModelEClass, DSE_EXECUTION_MODEL__NAME);
		createEReference(dseExecutionModelEClass, DSE_EXECUTION_MODEL__CONFIGURATIONS);
		createEReference(dseExecutionModelEClass, DSE_EXECUTION_MODEL__DSEPROBLEMS);
		createEReference(dseExecutionModelEClass, DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS);
		createEAttribute(dseExecutionModelEClass, DSE_EXECUTION_MODEL__NUMBER_OF_RUNS);

		dseProblemEClass = createEClass(DSE_PROBLEM);
		createEReference(dseProblemEClass, DSE_PROBLEM__CONFIGURATIONS);
		createEReference(dseProblemEClass, DSE_PROBLEM__CONSTRAINTS);
		createEReference(dseProblemEClass, DSE_PROBLEM__INITIALMODEL);
		createEReference(dseProblemEClass, DSE_PROBLEM__METAMODEL);
		createEReference(dseProblemEClass, DSE_PROBLEM__OBJECTIVES);
		createEReference(dseProblemEClass, DSE_PROBLEM__TRANSFORMATIONRULES);
		createEReference(dseProblemEClass, DSE_PROBLEM__STATECODER);
		createEReference(dseProblemEClass, DSE_PROBLEM__SOLUTIONSTORE);
		createEAttribute(dseProblemEClass, DSE_PROBLEM__NAME);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__DSEPROBLEMS);
		createEAttribute(configurationEClass, CONFIGURATION__MAX_NUMBER_OF_THREADS);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__STRATEGY);

		strategyEClass = createEClass(STRATEGY);
		createEAttribute(strategyEClass, STRATEGY__NAME);
		createEAttribute(strategyEClass, STRATEGY__DEPTH);
		createEAttribute(strategyEClass, STRATEGY__TYPE);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__CONSTRAINT_NAME);

		initialModelEClass = createEClass(INITIAL_MODEL);
		createEAttribute(initialModelEClass, INITIAL_MODEL__NAME);
		createEAttribute(initialModelEClass, INITIAL_MODEL__PATH);

		metaModelEClass = createEClass(META_MODEL);
		createEAttribute(metaModelEClass, META_MODEL__NAME);

		baseObjectiveEClass = createEClass(BASE_OBJECTIVE);
		createEAttribute(baseObjectiveEClass, BASE_OBJECTIVE__NAME);
		createEAttribute(baseObjectiveEClass, BASE_OBJECTIVE__FITNESS_CONSTRAINT);
		createEAttribute(baseObjectiveEClass, BASE_OBJECTIVE__COMPARATOR);

		transformationRuleEClass = createEClass(TRANSFORMATION_RULE);
		createEAttribute(transformationRuleEClass, TRANSFORMATION_RULE__CLASS_NAME);
		createEAttribute(transformationRuleEClass, TRANSFORMATION_RULE__METHOD_NAME);
		createEAttribute(transformationRuleEClass, TRANSFORMATION_RULE__NAME);

		dseProblemComponentEClass = createEClass(DSE_PROBLEM_COMPONENT);

		stateCoderEClass = createEClass(STATE_CODER);
		createEAttribute(stateCoderEClass, STATE_CODER__NAME);

		constraintsObjectiveEClass = createEClass(CONSTRAINTS_OBJECTIVE);
		createEReference(constraintsObjectiveEClass, CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS);
		createEReference(constraintsObjectiveEClass, CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS);

		queryConstraintEClass = createEClass(QUERY_CONSTRAINT);
		createEAttribute(queryConstraintEClass, QUERY_CONSTRAINT__NAME);
		createEAttribute(queryConstraintEClass, QUERY_CONSTRAINT__WEIGHT);
		createEAttribute(queryConstraintEClass, QUERY_CONSTRAINT__TYPE);

		solutionStoreEClass = createEClass(SOLUTION_STORE);
		createEAttribute(solutionStoreEClass, SOLUTION_STORE__FOUND_SOLUTIONS);
		createEAttribute(solutionStoreEClass, SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS);
		createEAttribute(solutionStoreEClass, SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY);
		createEAttribute(solutionStoreEClass, SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND);
		createEAttribute(solutionStoreEClass, SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER);
		createEAttribute(solutionStoreEClass, SOLUTION_STORE__NAME);

		dseImportEClass = createEClass(DSE_IMPORT);
		createEAttribute(dseImportEClass, DSE_IMPORT__IMPORTS);

		evolutionaryStrategyBuilderEClass = createEClass(EVOLUTIONARY_STRATEGY_BUILDER);
		createEAttribute(evolutionaryStrategyBuilderEClass, EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE);
		createEAttribute(evolutionaryStrategyBuilderEClass, EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS);
		createEAttribute(evolutionaryStrategyBuilderEClass, EVOLUTIONARY_STRATEGY_BUILDER__TYPE);
		createEAttribute(evolutionaryStrategyBuilderEClass, EVOLUTIONARY_STRATEGY_BUILDER__NAME);
		createEReference(evolutionaryStrategyBuilderEClass, EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS);

		iMutationRateEClass = createEClass(IMUTATION_RATE);
		createEAttribute(iMutationRateEClass, IMUTATION_RATE__NAME);
		createEAttribute(iMutationRateEClass, IMUTATION_RATE__WEIGHT);

		typeEClass = createEClass(TYPE);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__TYPE);

		baseStrategyEClass = createEClass(BASE_STRATEGY);

		// Create enums
		modelQueryTypeEEnum = createEEnum(MODEL_QUERY_TYPE);
		comparatorsEEnum = createEEnum(COMPARATORS);
		strategyTypeEEnum = createEEnum(STRATEGY_TYPE);
		evolutionStrategyTypeEEnum = createEEnum(EVOLUTION_STRATEGY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dseExecutionModelEClass.getESuperTypes().add(this.getType());
		dseProblemEClass.getESuperTypes().add(this.getDseImport());
		configurationEClass.getESuperTypes().add(this.getType());
		strategyEClass.getESuperTypes().add(this.getBaseStrategy());
		constraintEClass.getESuperTypes().add(this.getDseProblemComponent());
		initialModelEClass.getESuperTypes().add(this.getDseProblemComponent());
		metaModelEClass.getESuperTypes().add(this.getDseProblemComponent());
		baseObjectiveEClass.getESuperTypes().add(this.getDseProblemComponent());
		transformationRuleEClass.getESuperTypes().add(this.getDseProblemComponent());
		dseProblemComponentEClass.getESuperTypes().add(this.getType());
		stateCoderEClass.getESuperTypes().add(this.getDseProblemComponent());
		constraintsObjectiveEClass.getESuperTypes().add(this.getBaseObjective());
		queryConstraintEClass.getESuperTypes().add(this.getConstraint());
		solutionStoreEClass.getESuperTypes().add(this.getDseProblemComponent());
		dseImportEClass.getESuperTypes().add(this.getType());
		evolutionaryStrategyBuilderEClass.getESuperTypes().add(this.getBaseStrategy());
		iMutationRateEClass.getESuperTypes().add(this.getType());
		baseStrategyEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(dseExecutionModelEClass, DseExecutionModel.class, "DseExecutionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDseExecutionModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, DseExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDseExecutionModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DseExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseExecutionModel_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, DseExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseExecutionModel_Dseproblems(), this.getDseProblem(), null, "dseproblems", null, 0, -1, DseExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseExecutionModel_Dseproblemcomponents(), this.getDseProblemComponent(), null, "dseproblemcomponents", null, 0, -1, DseExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDseExecutionModel_NumberOfRuns(), ecorePackage.getEInt(), "numberOfRuns", "1", 0, 1, DseExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dseProblemEClass, DseProblem.class, "DseProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDseProblem_Configurations(), this.getConfiguration(), this.getConfiguration_Dseproblems(), "configurations", null, 1, 1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Initialmodel(), this.getInitialModel(), null, "initialmodel", null, 1, 1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Metamodel(), this.getMetaModel(), null, "metamodel", null, 1, 1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Objectives(), this.getBaseObjective(), null, "objectives", null, 1, -1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Transformationrules(), this.getTransformationRule(), null, "transformationrules", null, 1, -1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Statecoder(), this.getStateCoder(), null, "statecoder", null, 0, 1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDseProblem_Solutionstore(), this.getSolutionStore(), null, "solutionstore", null, 0, 1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDseProblem_Name(), ecorePackage.getEString(), "name", null, 0, 1, DseProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Dseproblems(), this.getDseProblem(), this.getDseProblem_Configurations(), "dseproblems", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_MaxNumberOfThreads(), ecorePackage.getEInt(), "maxNumberOfThreads", "1", 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Strategy(), this.getBaseStrategy(), null, "strategy", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Depth(), ecorePackage.getEInt(), "depth", "-1", 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Type(), this.getStrategyType(), "type", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_ConstraintName(), ecorePackage.getEString(), "constraintName", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialModelEClass, InitialModel.class, "InitialModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialModel_Path(), ecorePackage.getEString(), "path", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelEClass, MetaModel.class, "MetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseObjectiveEClass, BaseObjective.class, "BaseObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseObjective_FitnessConstraint(), ecorePackage.getEDouble(), "fitnessConstraint", null, 0, 1, BaseObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseObjective_Comparator(), this.getComparators(), "comparator", "HIGHER_IS_BETTER", 0, 1, BaseObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationRuleEClass, TransformationRule.class, "TransformationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationRule_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, TransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationRule_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, TransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dseProblemComponentEClass, DseProblemComponent.class, "DseProblemComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateCoderEClass, StateCoder.class, "StateCoder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateCoder_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateCoder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintsObjectiveEClass, ConstraintsObjective.class, "ConstraintsObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintsObjective_SoftConstraints(), this.getQueryConstraint(), null, "softConstraints", null, 0, -1, ConstraintsObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsObjective_HardConstraints(), this.getQueryConstraint(), null, "hardConstraints", null, 0, -1, ConstraintsObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryConstraintEClass, QueryConstraint.class, "QueryConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryConstraint_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, QueryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryConstraint_Type(), this.getModelQueryType(), "type", null, 0, 1, QueryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionStoreEClass, SolutionStore.class, "SolutionStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolutionStore_FoundSolutions(), ecorePackage.getEInt(), "foundSolutions", null, 0, 1, SolutionStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionStore_AcceptAnySolutions(), ecorePackage.getEBoolean(), "acceptAnySolutions", "false", 0, 1, SolutionStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionStore_StoreBestSolutionsOnly(), ecorePackage.getEBoolean(), "storeBestSolutionsOnly", "false", 0, 1, SolutionStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionStore_LogSolutionsWhenFound(), ecorePackage.getEBoolean(), "logSolutionsWhenFound", "false", 0, 1, SolutionStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionStore_RegisterSolutionFoundHandler(), ecorePackage.getEBoolean(), "registerSolutionFoundHandler", "false", 0, 1, SolutionStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionStore_Name(), ecorePackage.getEString(), "name", null, 0, 1, SolutionStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dseImportEClass, DseImport.class, "DseImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDseImport_Imports(), ecorePackage.getEString(), "imports", null, 0, -1, DseImport.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolutionaryStrategyBuilderEClass, EvolutionaryStrategyBuilder.class, "EvolutionaryStrategyBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolutionaryStrategyBuilder_PopulationSize(), ecorePackage.getEInt(), "populationSize", "0", 0, 1, EvolutionaryStrategyBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolutionaryStrategyBuilder_CrossOvers(), ecorePackage.getEString(), "crossOvers", null, 0, -1, EvolutionaryStrategyBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolutionaryStrategyBuilder_Type(), this.getEvolutionStrategyType(), "type", null, 0, 1, EvolutionaryStrategyBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolutionaryStrategyBuilder_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvolutionaryStrategyBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvolutionaryStrategyBuilder_Mutations(), this.getIMutationRate(), null, "mutations", null, 0, -1, EvolutionaryStrategyBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iMutationRateEClass, IMutationRate.class, "IMutationRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIMutationRate_Name(), ecorePackage.getEString(), "name", null, 0, 1, IMutationRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIMutationRate_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, IMutationRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_Type(), this.getType(), null, "type", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseStrategyEClass, BaseStrategy.class, "BaseStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(modelQueryTypeEEnum, ModelQueryType.class, "ModelQueryType");
		addEEnumLiteral(modelQueryTypeEEnum, ModelQueryType.MUST_HAVE_MATCH);
		addEEnumLiteral(modelQueryTypeEEnum, ModelQueryType.NO_MATCH);

		initEEnum(comparatorsEEnum, Comparators.class, "Comparators");
		addEEnumLiteral(comparatorsEEnum, Comparators.HIGHER_IS_BETTER);
		addEEnumLiteral(comparatorsEEnum, Comparators.LOWER_IS_BETTER);
		addEEnumLiteral(comparatorsEEnum, Comparators.DIFFERENCE_TO_ZERO_IS_BETTER);

		initEEnum(strategyTypeEEnum, StrategyType.class, "StrategyType");
		addEEnumLiteral(strategyTypeEEnum, StrategyType.DFS_STRATEGY);
		addEEnumLiteral(strategyTypeEEnum, StrategyType.BFS_STRATEGY);
		addEEnumLiteral(strategyTypeEEnum, StrategyType.FIXED_PRIORITY_STRATEGY);
		addEEnumLiteral(strategyTypeEEnum, StrategyType.HILL_CLIMBING_STRATEGY);

		initEEnum(evolutionStrategyTypeEEnum, EvolutionStrategyType.class, "EvolutionStrategyType");
		addEEnumLiteral(evolutionStrategyTypeEEnum, EvolutionStrategyType.NSGA2);
		addEEnumLiteral(evolutionStrategyTypeEEnum, EvolutionStrategyType.PESA);

		// Create resource
		createResource(eNS_URI);
	}

} //DseexecutionmodelPackageImpl
