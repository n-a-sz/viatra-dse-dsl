/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.DseExecutionModel;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.DseProblemComponent;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dse Execution Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl#getDseproblems <em>Dseproblems</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl#getDseproblemcomponents <em>Dseproblemcomponents</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseExecutionModelImpl#getNumberOfRuns <em>Number Of Runs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DseExecutionModelImpl extends TypeImpl implements DseExecutionModel {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getDseproblems() <em>Dseproblems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDseproblems()
	 * @generated
	 * @ordered
	 */
	protected EList<DseProblem> dseproblems;

	/**
	 * The cached value of the '{@link #getDseproblemcomponents() <em>Dseproblemcomponents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDseproblemcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<DseProblemComponent> dseproblemcomponents;

	/**
	 * The default value of the '{@link #getNumberOfRuns() <em>Number Of Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRuns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_RUNS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfRuns() <em>Number Of Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRuns()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRuns = NUMBER_OF_RUNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DseExecutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.DSE_EXECUTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_EXECUTION_MODEL__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectResolvingEList<Configuration>(Configuration.class, this, DseexecutionmodelPackage.DSE_EXECUTION_MODEL__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DseProblem> getDseproblems() {
		if (dseproblems == null) {
			dseproblems = new EObjectResolvingEList<DseProblem>(DseProblem.class, this, DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMS);
		}
		return dseproblems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DseProblemComponent> getDseproblemcomponents() {
		if (dseproblemcomponents == null) {
			dseproblemcomponents = new EObjectResolvingEList<DseProblemComponent>(DseProblemComponent.class, this, DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS);
		}
		return dseproblemcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRuns() {
		return numberOfRuns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRuns(int newNumberOfRuns) {
		int oldNumberOfRuns = numberOfRuns;
		numberOfRuns = newNumberOfRuns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NUMBER_OF_RUNS, oldNumberOfRuns, numberOfRuns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__PACKAGE_NAME:
				return getPackageName();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NAME:
				return getName();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__CONFIGURATIONS:
				return getConfigurations();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMS:
				return getDseproblems();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS:
				return getDseproblemcomponents();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NUMBER_OF_RUNS:
				return getNumberOfRuns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NAME:
				setName((String)newValue);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMS:
				getDseproblems().clear();
				getDseproblems().addAll((Collection<? extends DseProblem>)newValue);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS:
				getDseproblemcomponents().clear();
				getDseproblemcomponents().addAll((Collection<? extends DseProblemComponent>)newValue);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NUMBER_OF_RUNS:
				setNumberOfRuns((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMS:
				getDseproblems().clear();
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS:
				getDseproblemcomponents().clear();
				return;
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NUMBER_OF_RUNS:
				setNumberOfRuns(NUMBER_OF_RUNS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMS:
				return dseproblems != null && !dseproblems.isEmpty();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__DSEPROBLEMCOMPONENTS:
				return dseproblemcomponents != null && !dseproblemcomponents.isEmpty();
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL__NUMBER_OF_RUNS:
				return numberOfRuns != NUMBER_OF_RUNS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", name: ");
		result.append(name);
		result.append(", numberOfRuns: ");
		result.append(numberOfRuns);
		result.append(')');
		return result.toString();
	}

} //DseExecutionModelImpl
