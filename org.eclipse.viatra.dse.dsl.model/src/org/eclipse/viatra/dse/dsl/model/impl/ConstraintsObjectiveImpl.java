/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.dse.dsl.model.ConstraintsObjective;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.QueryConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintsObjectiveImpl#getSoftConstraints <em>Soft Constraints</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConstraintsObjectiveImpl#getHardConstraints <em>Hard Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsObjectiveImpl extends BaseObjectiveImpl implements ConstraintsObjective {
	/**
	 * The cached value of the '{@link #getSoftConstraints() <em>Soft Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryConstraint> softConstraints;

	/**
	 * The cached value of the '{@link #getHardConstraints() <em>Hard Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryConstraint> hardConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.CONSTRAINTS_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryConstraint> getSoftConstraints() {
		if (softConstraints == null) {
			softConstraints = new EObjectContainmentEList<QueryConstraint>(QueryConstraint.class, this, DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS);
		}
		return softConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryConstraint> getHardConstraints() {
		if (hardConstraints == null) {
			hardConstraints = new EObjectContainmentEList<QueryConstraint>(QueryConstraint.class, this, DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS);
		}
		return hardConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS:
				return ((InternalEList<?>)getSoftConstraints()).basicRemove(otherEnd, msgs);
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS:
				return ((InternalEList<?>)getHardConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS:
				return getSoftConstraints();
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS:
				return getHardConstraints();
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
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS:
				getSoftConstraints().clear();
				getSoftConstraints().addAll((Collection<? extends QueryConstraint>)newValue);
				return;
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS:
				getHardConstraints().clear();
				getHardConstraints().addAll((Collection<? extends QueryConstraint>)newValue);
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
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS:
				getSoftConstraints().clear();
				return;
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS:
				getHardConstraints().clear();
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
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__SOFT_CONSTRAINTS:
				return softConstraints != null && !softConstraints.isEmpty();
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE__HARD_CONSTRAINTS:
				return hardConstraints != null && !hardConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintsObjectiveImpl
