/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.dse.dsl.model.Constraint;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends DseProblemComponentImpl implements Constraint {
	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.CONSTRAINT__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.CONSTRAINT__CONSTRAINT_NAME:
				return getConstraintName();
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
			case DseexecutionmodelPackage.CONSTRAINT__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
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
			case DseexecutionmodelPackage.CONSTRAINT__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
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
			case DseexecutionmodelPackage.CONSTRAINT__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
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
		result.append(" (constraintName: ");
		result.append(constraintName);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
