/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DseexecutionmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.viatra.dse.dsl.dseexecutionmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DseexecutionmodelPackage eINSTANCE = org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.TypeImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl <em>Dse Execution Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseExecutionModel()
	 * @generated
	 */
	int DSE_EXECUTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL__PACKAGE_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL__NAME = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL__CONFIGURATIONS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dseproblems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL__DSEPROBLEMS = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dseproblemcomponents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Of Runs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL__NUMBER_OF_RUNS = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dse Execution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dse Execution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_EXECUTION_MODEL_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseImportImpl <em>Dse Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseImportImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseImport()
	 * @generated
	 */
	int DSE_IMPORT = 14;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_IMPORT__IMPORTS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dse Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_IMPORT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dse Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_IMPORT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl <em>Dse Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseProblem()
	 * @generated
	 */
	int DSE_PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__IMPORTS = DSE_IMPORT__IMPORTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__CONFIGURATIONS = DSE_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__CONSTRAINTS = DSE_IMPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initialmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__INITIALMODEL = DSE_IMPORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__METAMODEL = DSE_IMPORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__OBJECTIVES = DSE_IMPORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformationrules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__TRANSFORMATIONRULES = DSE_IMPORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Statecoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__STATECODER = DSE_IMPORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Solutionstore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__SOLUTIONSTORE = DSE_IMPORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__NAME = DSE_IMPORT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Dse Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_FEATURE_COUNT = DSE_IMPORT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Dse Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_OPERATION_COUNT = DSE_IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Dseproblems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DSEPROBLEMS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Number Of Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MAX_NUMBER_OF_THREADS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__STRATEGY = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.BaseStrategyImpl <em>Base Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.BaseStrategyImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getBaseStrategy()
	 * @generated
	 */
	int BASE_STRATEGY = 19;

	/**
	 * The number of structural features of the '<em>Base Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_STRATEGY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_STRATEGY_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = BASE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DEPTH = BASE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__TYPE = BASE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = BASE_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = BASE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemComponentImpl <em>Dse Problem Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseProblemComponentImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseProblemComponent()
	 * @generated
	 */
	int DSE_PROBLEM_COMPONENT = 9;

	/**
	 * The number of structural features of the '<em>Dse Problem Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_COMPONENT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dse Problem Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_COMPONENT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.ConstraintImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT_NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.InitialModelImpl <em>Initial Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.InitialModelImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getInitialModel()
	 * @generated
	 */
	int INITIAL_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__PATH = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Initial Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.MetaModelImpl <em>Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.MetaModelImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getMetaModel()
	 * @generated
	 */
	int META_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl <em>Base Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getBaseObjective()
	 * @generated
	 */
	int BASE_OBJECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECTIVE__NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fitness Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECTIVE__FITNESS_CONSTRAINT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECTIVE__COMPARATOR = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECTIVE_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Base Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECTIVE_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.TransformationRuleImpl <em>Transformation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.TransformationRuleImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getTransformationRule()
	 * @generated
	 */
	int TRANSFORMATION_RULE = 8;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__CLASS_NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__METHOD_NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.StateCoderImpl <em>State Coder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.StateCoderImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getStateCoder()
	 * @generated
	 */
	int STATE_CODER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CODER__NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Coder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CODER_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Coder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CODER_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintsObjectiveImpl <em>Constraints Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.ConstraintsObjectiveImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getConstraintsObjective()
	 * @generated
	 */
	int CONSTRAINTS_OBJECTIVE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE__NAME = BASE_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Fitness Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE__FITNESS_CONSTRAINT = BASE_OBJECTIVE__FITNESS_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE__COMPARATOR = BASE_OBJECTIVE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Soft Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS = BASE_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hard Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS = BASE_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraints Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE_FEATURE_COUNT = BASE_OBJECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraints Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OBJECTIVE_OPERATION_COUNT = BASE_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.QueryConstraintImpl <em>Query Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.QueryConstraintImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getQueryConstraint()
	 * @generated
	 */
	int QUERY_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONSTRAINT__CONSTRAINT_NAME = CONSTRAINT__CONSTRAINT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONSTRAINT__NAME = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONSTRAINT__WEIGHT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONSTRAINT__TYPE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Query Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl <em>Solution Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getSolutionStore()
	 * @generated
	 */
	int SOLUTION_STORE = 13;

	/**
	 * The feature id for the '<em><b>Found Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE__FOUND_SOLUTIONS = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accept Any Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Store Best Solutions Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Log Solutions When Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Register Solution Found Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE__NAME = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Solution Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE_FEATURE_COUNT = DSE_PROBLEM_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Solution Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_STORE_OPERATION_COUNT = DSE_PROBLEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl <em>Evolutionary Strategy Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getEvolutionaryStrategyBuilder()
	 * @generated
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER = 15;

	/**
	 * The feature id for the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE = BASE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cross Overs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS = BASE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER__TYPE = BASE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER__NAME = BASE_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mutations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS = BASE_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Evolutionary Strategy Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER_FEATURE_COUNT = BASE_STRATEGY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Evolutionary Strategy Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_STRATEGY_BUILDER_OPERATION_COUNT = BASE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.IMutationRateImpl <em>IMutation Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.IMutationRateImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getIMutationRate()
	 * @generated
	 */
	int IMUTATION_RATE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMUTATION_RATE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMUTATION_RATE__WEIGHT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IMutation Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMUTATION_RATE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IMutation Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMUTATION_RATE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DomainModelImpl
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.ModelQueryType <em>Model Query Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.ModelQueryType
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getModelQueryType()
	 * @generated
	 */
	int MODEL_QUERY_TYPE = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.Comparators <em>Comparators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.Comparators
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getComparators()
	 * @generated
	 */
	int COMPARATORS = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.StrategyType <em>Strategy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.StrategyType
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getStrategyType()
	 * @generated
	 */
	int STRATEGY_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType <em>Evolution Strategy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType
	 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getEvolutionStrategyType()
	 * @generated
	 */
	int EVOLUTION_STRATEGY_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel <em>Dse Execution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dse Execution Model</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel
	 * @generated
	 */
	EClass getDseExecutionModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getPackageName()
	 * @see #getDseExecutionModel()
	 * @generated
	 */
	EAttribute getDseExecutionModel_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getName()
	 * @see #getDseExecutionModel()
	 * @generated
	 */
	EAttribute getDseExecutionModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configurations</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getConfigurations()
	 * @see #getDseExecutionModel()
	 * @generated
	 */
	EReference getDseExecutionModel_Configurations();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getDseproblems <em>Dseproblems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dseproblems</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getDseproblems()
	 * @see #getDseExecutionModel()
	 * @generated
	 */
	EReference getDseExecutionModel_Dseproblems();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getDseproblemcomponents <em>Dseproblemcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dseproblemcomponents</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getDseproblemcomponents()
	 * @see #getDseExecutionModel()
	 * @generated
	 */
	EReference getDseExecutionModel_Dseproblemcomponents();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getNumberOfRuns <em>Number Of Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Runs</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseExecutionModel#getNumberOfRuns()
	 * @see #getDseExecutionModel()
	 * @generated
	 */
	EAttribute getDseExecutionModel_NumberOfRuns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.DseProblem <em>Dse Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dse Problem</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem
	 * @generated
	 */
	EClass getDseProblem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configurations</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getConfigurations()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Configurations();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getConstraints()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Constraints();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getInitialmodel <em>Initialmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialmodel</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getInitialmodel()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Initialmodel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getMetamodel()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Metamodel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objectives</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getObjectives()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Objectives();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getTransformationrules <em>Transformationrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformationrules</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getTransformationrules()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Transformationrules();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getStatecoder <em>Statecoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statecoder</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getStatecoder()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Statecoder();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getSolutionstore <em>Solutionstore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solutionstore</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getSolutionstore()
	 * @see #getDseProblem()
	 * @generated
	 */
	EReference getDseProblem_Solutionstore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.DseProblem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblem#getName()
	 * @see #getDseProblem()
	 * @generated
	 */
	EAttribute getDseProblem_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getDseproblems <em>Dseproblems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dseproblems</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration#getDseproblems()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Dseproblems();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getMaxNumberOfThreads <em>Max Number Of Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Threads</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration#getMaxNumberOfThreads()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_MaxNumberOfThreads();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.dse.dsl.model.Configuration#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Configuration#getStrategy()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Strategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.Strategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Strategy#getName()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.Strategy#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Strategy#getDepth()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Depth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.Strategy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Strategy#getType()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.Constraint#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Constraint#getConstraintName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ConstraintName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.InitialModel <em>Initial Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Model</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.InitialModel
	 * @generated
	 */
	EClass getInitialModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.InitialModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.InitialModel#getName()
	 * @see #getInitialModel()
	 * @generated
	 */
	EAttribute getInitialModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.InitialModel#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.InitialModel#getPath()
	 * @see #getInitialModel()
	 * @generated
	 */
	EAttribute getInitialModel_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.MetaModel
	 * @generated
	 */
	EClass getMetaModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.MetaModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.MetaModel#getName()
	 * @see #getMetaModel()
	 * @generated
	 */
	EAttribute getMetaModel_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective <em>Base Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Objective</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseObjective
	 * @generated
	 */
	EClass getBaseObjective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseObjective#getName()
	 * @see #getBaseObjective()
	 * @generated
	 */
	EAttribute getBaseObjective_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getFitnessConstraint <em>Fitness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fitness Constraint</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseObjective#getFitnessConstraint()
	 * @see #getBaseObjective()
	 * @generated
	 */
	EAttribute getBaseObjective_FitnessConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.BaseObjective#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseObjective#getComparator()
	 * @see #getBaseObjective()
	 * @generated
	 */
	EAttribute getBaseObjective_Comparator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.TransformationRule <em>Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Rule</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.TransformationRule
	 * @generated
	 */
	EClass getTransformationRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.TransformationRule#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.TransformationRule#getClassName()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.TransformationRule#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.TransformationRule#getMethodName()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.TransformationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.TransformationRule#getName()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.DseProblemComponent <em>Dse Problem Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dse Problem Component</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseProblemComponent
	 * @generated
	 */
	EClass getDseProblemComponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.StateCoder <em>State Coder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Coder</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.StateCoder
	 * @generated
	 */
	EClass getStateCoder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.StateCoder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.StateCoder#getName()
	 * @see #getStateCoder()
	 * @generated
	 */
	EAttribute getStateCoder_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.ConstraintsObjective <em>Constraints Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Objective</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.ConstraintsObjective
	 * @generated
	 */
	EClass getConstraintsObjective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.dse.dsl.model.ConstraintsObjective#getSoftConstraints <em>Soft Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Constraints</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.ConstraintsObjective#getSoftConstraints()
	 * @see #getConstraintsObjective()
	 * @generated
	 */
	EReference getConstraintsObjective_SoftConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.dse.dsl.model.ConstraintsObjective#getHardConstraints <em>Hard Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hard Constraints</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.ConstraintsObjective#getHardConstraints()
	 * @see #getConstraintsObjective()
	 * @generated
	 */
	EReference getConstraintsObjective_HardConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint <em>Query Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Constraint</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.QueryConstraint
	 * @generated
	 */
	EClass getQueryConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.QueryConstraint#getName()
	 * @see #getQueryConstraint()
	 * @generated
	 */
	EAttribute getQueryConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.QueryConstraint#getWeight()
	 * @see #getQueryConstraint()
	 * @generated
	 */
	EAttribute getQueryConstraint_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.QueryConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.QueryConstraint#getType()
	 * @see #getQueryConstraint()
	 * @generated
	 */
	EAttribute getQueryConstraint_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore <em>Solution Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Store</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore
	 * @generated
	 */
	EClass getSolutionStore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#getFoundSolutions <em>Found Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Found Solutions</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore#getFoundSolutions()
	 * @see #getSolutionStore()
	 * @generated
	 */
	EAttribute getSolutionStore_FoundSolutions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isAcceptAnySolutions <em>Accept Any Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Any Solutions</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore#isAcceptAnySolutions()
	 * @see #getSolutionStore()
	 * @generated
	 */
	EAttribute getSolutionStore_AcceptAnySolutions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isStoreBestSolutionsOnly <em>Store Best Solutions Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Best Solutions Only</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore#isStoreBestSolutionsOnly()
	 * @see #getSolutionStore()
	 * @generated
	 */
	EAttribute getSolutionStore_StoreBestSolutionsOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isLogSolutionsWhenFound <em>Log Solutions When Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Solutions When Found</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore#isLogSolutionsWhenFound()
	 * @see #getSolutionStore()
	 * @generated
	 */
	EAttribute getSolutionStore_LogSolutionsWhenFound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#isRegisterSolutionFoundHandler <em>Register Solution Found Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Solution Found Handler</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore#isRegisterSolutionFoundHandler()
	 * @see #getSolutionStore()
	 * @generated
	 */
	EAttribute getSolutionStore_RegisterSolutionFoundHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.SolutionStore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.SolutionStore#getName()
	 * @see #getSolutionStore()
	 * @generated
	 */
	EAttribute getSolutionStore_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.DseImport <em>Dse Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dse Import</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseImport
	 * @generated
	 */
	EClass getDseImport();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.viatra.dse.dsl.model.DseImport#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DseImport#getImports()
	 * @see #getDseImport()
	 * @generated
	 */
	EAttribute getDseImport_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder <em>Evolutionary Strategy Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolutionary Strategy Builder</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder
	 * @generated
	 */
	EClass getEvolutionaryStrategyBuilder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getPopulationSize <em>Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Size</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getPopulationSize()
	 * @see #getEvolutionaryStrategyBuilder()
	 * @generated
	 */
	EAttribute getEvolutionaryStrategyBuilder_PopulationSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getCrossOvers <em>Cross Overs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cross Overs</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getCrossOvers()
	 * @see #getEvolutionaryStrategyBuilder()
	 * @generated
	 */
	EAttribute getEvolutionaryStrategyBuilder_CrossOvers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getType()
	 * @see #getEvolutionaryStrategyBuilder()
	 * @generated
	 */
	EAttribute getEvolutionaryStrategyBuilder_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getName()
	 * @see #getEvolutionaryStrategyBuilder()
	 * @generated
	 */
	EAttribute getEvolutionaryStrategyBuilder_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getMutations <em>Mutations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mutations</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getMutations()
	 * @see #getEvolutionaryStrategyBuilder()
	 * @generated
	 */
	EReference getEvolutionaryStrategyBuilder_Mutations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.IMutationRate <em>IMutation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMutation Rate</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.IMutationRate
	 * @generated
	 */
	EClass getIMutationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.IMutationRate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.IMutationRate#getName()
	 * @see #getIMutationRate()
	 * @generated
	 */
	EAttribute getIMutationRate_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.dse.dsl.model.IMutationRate#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.IMutationRate#getWeight()
	 * @see #getIMutationRate()
	 * @generated
	 */
	EAttribute getIMutationRate_Weight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.dse.dsl.model.DomainModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.DomainModel#getType()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.dse.dsl.model.BaseStrategy <em>Base Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Strategy</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.BaseStrategy
	 * @generated
	 */
	EClass getBaseStrategy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.dse.dsl.model.ModelQueryType <em>Model Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Query Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.ModelQueryType
	 * @generated
	 */
	EEnum getModelQueryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.dse.dsl.model.Comparators <em>Comparators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparators</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.Comparators
	 * @generated
	 */
	EEnum getComparators();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.dse.dsl.model.StrategyType <em>Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strategy Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.StrategyType
	 * @generated
	 */
	EEnum getStrategyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType <em>Evolution Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evolution Strategy Type</em>'.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType
	 * @generated
	 */
	EEnum getEvolutionStrategyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DseexecutionmodelFactory getDseexecutionmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl <em>Dse Execution Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseExecutionModel()
		 * @generated
		 */
		EClass DSE_EXECUTION_MODEL = eINSTANCE.getDseExecutionModel();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_EXECUTION_MODEL__PACKAGE_NAME = eINSTANCE.getDseExecutionModel_PackageName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_EXECUTION_MODEL__NAME = eINSTANCE.getDseExecutionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_EXECUTION_MODEL__CONFIGURATIONS = eINSTANCE.getDseExecutionModel_Configurations();

		/**
		 * The meta object literal for the '<em><b>Dseproblems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_EXECUTION_MODEL__DSEPROBLEMS = eINSTANCE.getDseExecutionModel_Dseproblems();

		/**
		 * The meta object literal for the '<em><b>Dseproblemcomponents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS = eINSTANCE.getDseExecutionModel_Dseproblemcomponents();

		/**
		 * The meta object literal for the '<em><b>Number Of Runs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_EXECUTION_MODEL__NUMBER_OF_RUNS = eINSTANCE.getDseExecutionModel_NumberOfRuns();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl <em>Dse Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseProblem()
		 * @generated
		 */
		EClass DSE_PROBLEM = eINSTANCE.getDseProblem();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__CONFIGURATIONS = eINSTANCE.getDseProblem_Configurations();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__CONSTRAINTS = eINSTANCE.getDseProblem_Constraints();

		/**
		 * The meta object literal for the '<em><b>Initialmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__INITIALMODEL = eINSTANCE.getDseProblem_Initialmodel();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__METAMODEL = eINSTANCE.getDseProblem_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__OBJECTIVES = eINSTANCE.getDseProblem_Objectives();

		/**
		 * The meta object literal for the '<em><b>Transformationrules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__TRANSFORMATIONRULES = eINSTANCE.getDseProblem_Transformationrules();

		/**
		 * The meta object literal for the '<em><b>Statecoder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__STATECODER = eINSTANCE.getDseProblem_Statecoder();

		/**
		 * The meta object literal for the '<em><b>Solutionstore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_PROBLEM__SOLUTIONSTORE = eINSTANCE.getDseProblem_Solutionstore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_PROBLEM__NAME = eINSTANCE.getDseProblem_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Dseproblems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DSEPROBLEMS = eINSTANCE.getConfiguration_Dseproblems();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__MAX_NUMBER_OF_THREADS = eINSTANCE.getConfiguration_MaxNumberOfThreads();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__STRATEGY = eINSTANCE.getConfiguration_Strategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__NAME = eINSTANCE.getStrategy_Name();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__DEPTH = eINSTANCE.getStrategy_Depth();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__TYPE = eINSTANCE.getStrategy_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.ConstraintImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONSTRAINT_NAME = eINSTANCE.getConstraint_ConstraintName();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.InitialModelImpl <em>Initial Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.InitialModelImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getInitialModel()
		 * @generated
		 */
		EClass INITIAL_MODEL = eINSTANCE.getInitialModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_MODEL__NAME = eINSTANCE.getInitialModel_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_MODEL__PATH = eINSTANCE.getInitialModel_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.MetaModelImpl <em>Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.MetaModelImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getMetaModel()
		 * @generated
		 */
		EClass META_MODEL = eINSTANCE.getMetaModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL__NAME = eINSTANCE.getMetaModel_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl <em>Base Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getBaseObjective()
		 * @generated
		 */
		EClass BASE_OBJECTIVE = eINSTANCE.getBaseObjective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECTIVE__NAME = eINSTANCE.getBaseObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Fitness Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECTIVE__FITNESS_CONSTRAINT = eINSTANCE.getBaseObjective_FitnessConstraint();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECTIVE__COMPARATOR = eINSTANCE.getBaseObjective_Comparator();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.TransformationRuleImpl <em>Transformation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.TransformationRuleImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getTransformationRule()
		 * @generated
		 */
		EClass TRANSFORMATION_RULE = eINSTANCE.getTransformationRule();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__CLASS_NAME = eINSTANCE.getTransformationRule_ClassName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__METHOD_NAME = eINSTANCE.getTransformationRule_MethodName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__NAME = eINSTANCE.getTransformationRule_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemComponentImpl <em>Dse Problem Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseProblemComponentImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseProblemComponent()
		 * @generated
		 */
		EClass DSE_PROBLEM_COMPONENT = eINSTANCE.getDseProblemComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.StateCoderImpl <em>State Coder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.StateCoderImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getStateCoder()
		 * @generated
		 */
		EClass STATE_CODER = eINSTANCE.getStateCoder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CODER__NAME = eINSTANCE.getStateCoder_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintsObjectiveImpl <em>Constraints Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.ConstraintsObjectiveImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getConstraintsObjective()
		 * @generated
		 */
		EClass CONSTRAINTS_OBJECTIVE = eINSTANCE.getConstraintsObjective();

		/**
		 * The meta object literal for the '<em><b>Soft Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS = eINSTANCE.getConstraintsObjective_SoftConstraints();

		/**
		 * The meta object literal for the '<em><b>Hard Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS = eINSTANCE.getConstraintsObjective_HardConstraints();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.QueryConstraintImpl <em>Query Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.QueryConstraintImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getQueryConstraint()
		 * @generated
		 */
		EClass QUERY_CONSTRAINT = eINSTANCE.getQueryConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONSTRAINT__NAME = eINSTANCE.getQueryConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONSTRAINT__WEIGHT = eINSTANCE.getQueryConstraint_Weight();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONSTRAINT__TYPE = eINSTANCE.getQueryConstraint_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl <em>Solution Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getSolutionStore()
		 * @generated
		 */
		EClass SOLUTION_STORE = eINSTANCE.getSolutionStore();

		/**
		 * The meta object literal for the '<em><b>Found Solutions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_STORE__FOUND_SOLUTIONS = eINSTANCE.getSolutionStore_FoundSolutions();

		/**
		 * The meta object literal for the '<em><b>Accept Any Solutions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS = eINSTANCE.getSolutionStore_AcceptAnySolutions();

		/**
		 * The meta object literal for the '<em><b>Store Best Solutions Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY = eINSTANCE.getSolutionStore_StoreBestSolutionsOnly();

		/**
		 * The meta object literal for the '<em><b>Log Solutions When Found</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND = eINSTANCE.getSolutionStore_LogSolutionsWhenFound();

		/**
		 * The meta object literal for the '<em><b>Register Solution Found Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER = eINSTANCE.getSolutionStore_RegisterSolutionFoundHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_STORE__NAME = eINSTANCE.getSolutionStore_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DseImportImpl <em>Dse Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseImportImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDseImport()
		 * @generated
		 */
		EClass DSE_IMPORT = eINSTANCE.getDseImport();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_IMPORT__IMPORTS = eINSTANCE.getDseImport_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl <em>Evolutionary Strategy Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getEvolutionaryStrategyBuilder()
		 * @generated
		 */
		EClass EVOLUTIONARY_STRATEGY_BUILDER = eINSTANCE.getEvolutionaryStrategyBuilder();

		/**
		 * The meta object literal for the '<em><b>Population Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE = eINSTANCE.getEvolutionaryStrategyBuilder_PopulationSize();

		/**
		 * The meta object literal for the '<em><b>Cross Overs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS = eINSTANCE.getEvolutionaryStrategyBuilder_CrossOvers();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTIONARY_STRATEGY_BUILDER__TYPE = eINSTANCE.getEvolutionaryStrategyBuilder_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTIONARY_STRATEGY_BUILDER__NAME = eINSTANCE.getEvolutionaryStrategyBuilder_Name();

		/**
		 * The meta object literal for the '<em><b>Mutations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS = eINSTANCE.getEvolutionaryStrategyBuilder_Mutations();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.IMutationRateImpl <em>IMutation Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.IMutationRateImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getIMutationRate()
		 * @generated
		 */
		EClass IMUTATION_RATE = eINSTANCE.getIMutationRate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMUTATION_RATE__NAME = eINSTANCE.getIMutationRate_Name();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMUTATION_RATE__WEIGHT = eINSTANCE.getIMutationRate_Weight();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.TypeImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DomainModelImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__TYPE = eINSTANCE.getDomainModel_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.impl.BaseStrategyImpl <em>Base Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.impl.BaseStrategyImpl
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getBaseStrategy()
		 * @generated
		 */
		EClass BASE_STRATEGY = eINSTANCE.getBaseStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.ModelQueryType <em>Model Query Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.ModelQueryType
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getModelQueryType()
		 * @generated
		 */
		EEnum MODEL_QUERY_TYPE = eINSTANCE.getModelQueryType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.Comparators <em>Comparators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.Comparators
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getComparators()
		 * @generated
		 */
		EEnum COMPARATORS = eINSTANCE.getComparators();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.StrategyType <em>Strategy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.StrategyType
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getStrategyType()
		 * @generated
		 */
		EEnum STRATEGY_TYPE = eINSTANCE.getStrategyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType <em>Evolution Strategy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType
		 * @see org.eclipse.viatra.dse.dsl.model.impl.DseexecutionmodelPackageImpl#getEvolutionStrategyType()
		 * @generated
		 */
		EEnum EVOLUTION_STRATEGY_TYPE = eINSTANCE.getEvolutionStrategyType();

	}

} //DseexecutionmodelPackage
