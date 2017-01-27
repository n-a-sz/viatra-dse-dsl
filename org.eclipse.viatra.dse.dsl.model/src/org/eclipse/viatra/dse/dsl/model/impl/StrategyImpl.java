/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.Strategy;
import org.eclipse.viatra.dse.dsl.model.StrategyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.StrategyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends BaseStrategyImpl implements Strategy {
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
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StrategyType TYPE_EDEFAULT = StrategyType.DFS_STRATEGY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StrategyType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.STRATEGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.STRATEGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.STRATEGY__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StrategyType newType) {
		StrategyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.STRATEGY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.STRATEGY__NAME:
				return getName();
			case DseexecutionmodelPackage.STRATEGY__DEPTH:
				return getDepth();
			case DseexecutionmodelPackage.STRATEGY__TYPE:
				return getType();
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
			case DseexecutionmodelPackage.STRATEGY__NAME:
				setName((String)newValue);
				return;
			case DseexecutionmodelPackage.STRATEGY__DEPTH:
				setDepth((Integer)newValue);
				return;
			case DseexecutionmodelPackage.STRATEGY__TYPE:
				setType((StrategyType)newValue);
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
			case DseexecutionmodelPackage.STRATEGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DseexecutionmodelPackage.STRATEGY__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case DseexecutionmodelPackage.STRATEGY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DseexecutionmodelPackage.STRATEGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DseexecutionmodelPackage.STRATEGY__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case DseexecutionmodelPackage.STRATEGY__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", depth: ");
		result.append(depth);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
