/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.viatra.dse.dsl.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DseexecutionmodelFactoryImpl extends EFactoryImpl implements DseexecutionmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DseexecutionmodelFactory init() {
		try {
			DseexecutionmodelFactory theDseexecutionmodelFactory = (DseexecutionmodelFactory)EPackage.Registry.INSTANCE.getEFactory(DseexecutionmodelPackage.eNS_URI);
			if (theDseexecutionmodelFactory != null) {
				return theDseexecutionmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DseexecutionmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseexecutionmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL: return createDseExecutionModel();
			case DseexecutionmodelPackage.DSE_PROBLEM: return createDseProblem();
			case DseexecutionmodelPackage.CONFIGURATION: return createConfiguration();
			case DseexecutionmodelPackage.STRATEGY: return createStrategy();
			case DseexecutionmodelPackage.CONSTRAINT: return createConstraint();
			case DseexecutionmodelPackage.INITIAL_MODEL: return createInitialModel();
			case DseexecutionmodelPackage.META_MODEL: return createMetaModel();
			case DseexecutionmodelPackage.BASE_OBJECTIVE: return createBaseObjective();
			case DseexecutionmodelPackage.TRANSFORMATION_RULE: return createTransformationRule();
			case DseexecutionmodelPackage.STATE_CODER: return createStateCoder();
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE: return createConstraintsObjective();
			case DseexecutionmodelPackage.QUERY_CONSTRAINT: return createQueryConstraint();
			case DseexecutionmodelPackage.SOLUTION_STORE: return createSolutionStore();
			case DseexecutionmodelPackage.DSE_IMPORT: return createDseImport();
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER: return createEvolutionaryStrategyBuilder();
			case DseexecutionmodelPackage.IMUTATION_RATE: return createIMutationRate();
			case DseexecutionmodelPackage.TYPE: return createType();
			case DseexecutionmodelPackage.DOMAIN_MODEL: return createDomainModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DseexecutionmodelPackage.MODEL_QUERY_TYPE:
				return createModelQueryTypeFromString(eDataType, initialValue);
			case DseexecutionmodelPackage.COMPARATORS:
				return createComparatorsFromString(eDataType, initialValue);
			case DseexecutionmodelPackage.STRATEGY_TYPE:
				return createStrategyTypeFromString(eDataType, initialValue);
			case DseexecutionmodelPackage.EVOLUTION_STRATEGY_TYPE:
				return createEvolutionStrategyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DseexecutionmodelPackage.MODEL_QUERY_TYPE:
				return convertModelQueryTypeToString(eDataType, instanceValue);
			case DseexecutionmodelPackage.COMPARATORS:
				return convertComparatorsToString(eDataType, instanceValue);
			case DseexecutionmodelPackage.STRATEGY_TYPE:
				return convertStrategyTypeToString(eDataType, instanceValue);
			case DseexecutionmodelPackage.EVOLUTION_STRATEGY_TYPE:
				return convertEvolutionStrategyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseExecutionModel createDseExecutionModel() {
		DseExecutionModelImpl dseExecutionModel = new DseExecutionModelImpl();
		return dseExecutionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseProblem createDseProblem() {
		DseProblemImpl dseProblem = new DseProblemImpl();
		return dseProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialModel createInitialModel() {
		InitialModelImpl initialModel = new InitialModelImpl();
		return initialModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel createMetaModel() {
		MetaModelImpl metaModel = new MetaModelImpl();
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseObjective createBaseObjective() {
		BaseObjectiveImpl baseObjective = new BaseObjectiveImpl();
		return baseObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule createTransformationRule() {
		TransformationRuleImpl transformationRule = new TransformationRuleImpl();
		return transformationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateCoder createStateCoder() {
		StateCoderImpl stateCoder = new StateCoderImpl();
		return stateCoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsObjective createConstraintsObjective() {
		ConstraintsObjectiveImpl constraintsObjective = new ConstraintsObjectiveImpl();
		return constraintsObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryConstraint createQueryConstraint() {
		QueryConstraintImpl queryConstraint = new QueryConstraintImpl();
		return queryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionStore createSolutionStore() {
		SolutionStoreImpl solutionStore = new SolutionStoreImpl();
		return solutionStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseImport createDseImport() {
		DseImportImpl dseImport = new DseImportImpl();
		return dseImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolutionaryStrategyBuilder createEvolutionaryStrategyBuilder() {
		EvolutionaryStrategyBuilderImpl evolutionaryStrategyBuilder = new EvolutionaryStrategyBuilderImpl();
		return evolutionaryStrategyBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMutationRate createIMutationRate() {
		IMutationRateImpl iMutationRate = new IMutationRateImpl();
		return iMutationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQueryType createModelQueryTypeFromString(EDataType eDataType, String initialValue) {
		ModelQueryType result = ModelQueryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelQueryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparators createComparatorsFromString(EDataType eDataType, String initialValue) {
		Comparators result = Comparators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyType createStrategyTypeFromString(EDataType eDataType, String initialValue) {
		StrategyType result = StrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolutionStrategyType createEvolutionStrategyTypeFromString(EDataType eDataType, String initialValue) {
		EvolutionStrategyType result = EvolutionStrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvolutionStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseexecutionmodelPackage getDseexecutionmodelPackage() {
		return (DseexecutionmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DseexecutionmodelPackage getPackage() {
		return DseexecutionmodelPackage.eINSTANCE;
	}

} //DseexecutionmodelFactoryImpl
