/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.SolutionStore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl#getFoundSolutions <em>Found Solutions</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl#isAcceptAnySolutions <em>Accept Any Solutions</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl#isStoreBestSolutionsOnly <em>Store Best Solutions Only</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl#isLogSolutionsWhenFound <em>Log Solutions When Found</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl#isRegisterSolutionFoundHandler <em>Register Solution Found Handler</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.SolutionStoreImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionStoreImpl extends DseProblemComponentImpl implements SolutionStore {
	/**
	 * The default value of the '{@link #getFoundSolutions() <em>Found Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundSolutions()
	 * @generated
	 * @ordered
	 */
	protected static final int FOUND_SOLUTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFoundSolutions() <em>Found Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundSolutions()
	 * @generated
	 * @ordered
	 */
	protected int foundSolutions = FOUND_SOLUTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAcceptAnySolutions() <em>Accept Any Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptAnySolutions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPT_ANY_SOLUTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAcceptAnySolutions() <em>Accept Any Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptAnySolutions()
	 * @generated
	 * @ordered
	 */
	protected boolean acceptAnySolutions = ACCEPT_ANY_SOLUTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isStoreBestSolutionsOnly() <em>Store Best Solutions Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStoreBestSolutionsOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STORE_BEST_SOLUTIONS_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStoreBestSolutionsOnly() <em>Store Best Solutions Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStoreBestSolutionsOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean storeBestSolutionsOnly = STORE_BEST_SOLUTIONS_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogSolutionsWhenFound() <em>Log Solutions When Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogSolutionsWhenFound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_SOLUTIONS_WHEN_FOUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogSolutionsWhenFound() <em>Log Solutions When Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogSolutionsWhenFound()
	 * @generated
	 * @ordered
	 */
	protected boolean logSolutionsWhenFound = LOG_SOLUTIONS_WHEN_FOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegisterSolutionFoundHandler() <em>Register Solution Found Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisterSolutionFoundHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGISTER_SOLUTION_FOUND_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegisterSolutionFoundHandler() <em>Register Solution Found Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisterSolutionFoundHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean registerSolutionFoundHandler = REGISTER_SOLUTION_FOUND_HANDLER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.SOLUTION_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFoundSolutions() {
		return foundSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoundSolutions(int newFoundSolutions) {
		int oldFoundSolutions = foundSolutions;
		foundSolutions = newFoundSolutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.SOLUTION_STORE__FOUND_SOLUTIONS, oldFoundSolutions, foundSolutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAcceptAnySolutions() {
		return acceptAnySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptAnySolutions(boolean newAcceptAnySolutions) {
		boolean oldAcceptAnySolutions = acceptAnySolutions;
		acceptAnySolutions = newAcceptAnySolutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS, oldAcceptAnySolutions, acceptAnySolutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStoreBestSolutionsOnly() {
		return storeBestSolutionsOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreBestSolutionsOnly(boolean newStoreBestSolutionsOnly) {
		boolean oldStoreBestSolutionsOnly = storeBestSolutionsOnly;
		storeBestSolutionsOnly = newStoreBestSolutionsOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY, oldStoreBestSolutionsOnly, storeBestSolutionsOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogSolutionsWhenFound() {
		return logSolutionsWhenFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogSolutionsWhenFound(boolean newLogSolutionsWhenFound) {
		boolean oldLogSolutionsWhenFound = logSolutionsWhenFound;
		logSolutionsWhenFound = newLogSolutionsWhenFound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND, oldLogSolutionsWhenFound, logSolutionsWhenFound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegisterSolutionFoundHandler() {
		return registerSolutionFoundHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterSolutionFoundHandler(boolean newRegisterSolutionFoundHandler) {
		boolean oldRegisterSolutionFoundHandler = registerSolutionFoundHandler;
		registerSolutionFoundHandler = newRegisterSolutionFoundHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER, oldRegisterSolutionFoundHandler, registerSolutionFoundHandler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.SOLUTION_STORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.SOLUTION_STORE__FOUND_SOLUTIONS:
				return getFoundSolutions();
			case DseexecutionmodelPackage.SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS:
				return isAcceptAnySolutions();
			case DseexecutionmodelPackage.SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY:
				return isStoreBestSolutionsOnly();
			case DseexecutionmodelPackage.SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND:
				return isLogSolutionsWhenFound();
			case DseexecutionmodelPackage.SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER:
				return isRegisterSolutionFoundHandler();
			case DseexecutionmodelPackage.SOLUTION_STORE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DseexecutionmodelPackage.SOLUTION_STORE__FOUND_SOLUTIONS:
				setFoundSolutions((Integer)newValue);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS:
				setAcceptAnySolutions((Boolean)newValue);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY:
				setStoreBestSolutionsOnly((Boolean)newValue);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND:
				setLogSolutionsWhenFound((Boolean)newValue);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER:
				setRegisterSolutionFoundHandler((Boolean)newValue);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__NAME:
				setName((String)newValue);
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
			case DseexecutionmodelPackage.SOLUTION_STORE__FOUND_SOLUTIONS:
				setFoundSolutions(FOUND_SOLUTIONS_EDEFAULT);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS:
				setAcceptAnySolutions(ACCEPT_ANY_SOLUTIONS_EDEFAULT);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY:
				setStoreBestSolutionsOnly(STORE_BEST_SOLUTIONS_ONLY_EDEFAULT);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND:
				setLogSolutionsWhenFound(LOG_SOLUTIONS_WHEN_FOUND_EDEFAULT);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER:
				setRegisterSolutionFoundHandler(REGISTER_SOLUTION_FOUND_HANDLER_EDEFAULT);
				return;
			case DseexecutionmodelPackage.SOLUTION_STORE__NAME:
				setName(NAME_EDEFAULT);
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
			case DseexecutionmodelPackage.SOLUTION_STORE__FOUND_SOLUTIONS:
				return foundSolutions != FOUND_SOLUTIONS_EDEFAULT;
			case DseexecutionmodelPackage.SOLUTION_STORE__ACCEPT_ANY_SOLUTIONS:
				return acceptAnySolutions != ACCEPT_ANY_SOLUTIONS_EDEFAULT;
			case DseexecutionmodelPackage.SOLUTION_STORE__STORE_BEST_SOLUTIONS_ONLY:
				return storeBestSolutionsOnly != STORE_BEST_SOLUTIONS_ONLY_EDEFAULT;
			case DseexecutionmodelPackage.SOLUTION_STORE__LOG_SOLUTIONS_WHEN_FOUND:
				return logSolutionsWhenFound != LOG_SOLUTIONS_WHEN_FOUND_EDEFAULT;
			case DseexecutionmodelPackage.SOLUTION_STORE__REGISTER_SOLUTION_FOUND_HANDLER:
				return registerSolutionFoundHandler != REGISTER_SOLUTION_FOUND_HANDLER_EDEFAULT;
			case DseexecutionmodelPackage.SOLUTION_STORE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (foundSolutions: ");
		result.append(foundSolutions);
		result.append(", acceptAnySolutions: ");
		result.append(acceptAnySolutions);
		result.append(", storeBestSolutionsOnly: ");
		result.append(storeBestSolutionsOnly);
		result.append(", logSolutionsWhenFound: ");
		result.append(logSolutionsWhenFound);
		result.append(", registerSolutionFoundHandler: ");
		result.append(registerSolutionFoundHandler);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SolutionStoreImpl
