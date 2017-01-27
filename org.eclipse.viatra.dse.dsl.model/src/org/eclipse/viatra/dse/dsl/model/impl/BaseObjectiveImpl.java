/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.dse.dsl.model.BaseObjective;
import org.eclipse.viatra.dse.dsl.model.Comparators;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl#getFitnessConstraint <em>Fitness Constraint</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.BaseObjectiveImpl#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseObjectiveImpl extends DseProblemComponentImpl implements BaseObjective {
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
	 * The default value of the '{@link #getFitnessConstraint() <em>Fitness Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitnessConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final double FITNESS_CONSTRAINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFitnessConstraint() <em>Fitness Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitnessConstraint()
	 * @generated
	 * @ordered
	 */
	protected double fitnessConstraint = FITNESS_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final Comparators COMPARATOR_EDEFAULT = Comparators.HIGHER_IS_BETTER;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected Comparators comparator = COMPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.BASE_OBJECTIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.BASE_OBJECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFitnessConstraint() {
		return fitnessConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitnessConstraint(double newFitnessConstraint) {
		double oldFitnessConstraint = fitnessConstraint;
		fitnessConstraint = newFitnessConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.BASE_OBJECTIVE__FITNESS_CONSTRAINT, oldFitnessConstraint, fitnessConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparators getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(Comparators newComparator) {
		Comparators oldComparator = comparator;
		comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.BASE_OBJECTIVE__COMPARATOR, oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.BASE_OBJECTIVE__NAME:
				return getName();
			case DseexecutionmodelPackage.BASE_OBJECTIVE__FITNESS_CONSTRAINT:
				return getFitnessConstraint();
			case DseexecutionmodelPackage.BASE_OBJECTIVE__COMPARATOR:
				return getComparator();
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
			case DseexecutionmodelPackage.BASE_OBJECTIVE__NAME:
				setName((String)newValue);
				return;
			case DseexecutionmodelPackage.BASE_OBJECTIVE__FITNESS_CONSTRAINT:
				setFitnessConstraint((Double)newValue);
				return;
			case DseexecutionmodelPackage.BASE_OBJECTIVE__COMPARATOR:
				setComparator((Comparators)newValue);
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
			case DseexecutionmodelPackage.BASE_OBJECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DseexecutionmodelPackage.BASE_OBJECTIVE__FITNESS_CONSTRAINT:
				setFitnessConstraint(FITNESS_CONSTRAINT_EDEFAULT);
				return;
			case DseexecutionmodelPackage.BASE_OBJECTIVE__COMPARATOR:
				setComparator(COMPARATOR_EDEFAULT);
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
			case DseexecutionmodelPackage.BASE_OBJECTIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DseexecutionmodelPackage.BASE_OBJECTIVE__FITNESS_CONSTRAINT:
				return fitnessConstraint != FITNESS_CONSTRAINT_EDEFAULT;
			case DseexecutionmodelPackage.BASE_OBJECTIVE__COMPARATOR:
				return comparator != COMPARATOR_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fitnessConstraint: ");
		result.append(fitnessConstraint);
		result.append(", comparator: ");
		result.append(comparator);
		result.append(')');
		return result.toString();
	}

} //BaseObjectiveImpl
