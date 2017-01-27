/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.dse.dsl.model.BaseStrategy;
import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl#getDseproblems <em>Dseproblems</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl#getMaxNumberOfThreads <em>Max Number Of Threads</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.ConfigurationImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends TypeImpl implements Configuration {
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
	 * The default value of the '{@link #getMaxNumberOfThreads() <em>Max Number Of Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_OF_THREADS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxNumberOfThreads() <em>Max Number Of Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfThreads()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberOfThreads = MAX_NUMBER_OF_THREADS_EDEFAULT;

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
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected BaseStrategy strategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DseProblem> getDseproblems() {
		if (dseproblems == null) {
			dseproblems = new EObjectWithInverseResolvingEList<DseProblem>(DseProblem.class, this, DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS, DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS);
		}
		return dseproblems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberOfThreads() {
		return maxNumberOfThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfThreads(int newMaxNumberOfThreads) {
		int oldMaxNumberOfThreads = maxNumberOfThreads;
		maxNumberOfThreads = newMaxNumberOfThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.CONFIGURATION__MAX_NUMBER_OF_THREADS, oldMaxNumberOfThreads, maxNumberOfThreads));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseStrategy getStrategy() {
		if (strategy != null && strategy.eIsProxy()) {
			InternalEObject oldStrategy = (InternalEObject)strategy;
			strategy = (BaseStrategy)eResolveProxy(oldStrategy);
			if (strategy != oldStrategy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DseexecutionmodelPackage.CONFIGURATION__STRATEGY, oldStrategy, strategy));
			}
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseStrategy basicGetStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(BaseStrategy newStrategy) {
		BaseStrategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.CONFIGURATION__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDseproblems()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS:
				return ((InternalEList<?>)getDseproblems()).basicRemove(otherEnd, msgs);
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
			case DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS:
				return getDseproblems();
			case DseexecutionmodelPackage.CONFIGURATION__MAX_NUMBER_OF_THREADS:
				return getMaxNumberOfThreads();
			case DseexecutionmodelPackage.CONFIGURATION__NAME:
				return getName();
			case DseexecutionmodelPackage.CONFIGURATION__STRATEGY:
				if (resolve) return getStrategy();
				return basicGetStrategy();
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
			case DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS:
				getDseproblems().clear();
				getDseproblems().addAll((Collection<? extends DseProblem>)newValue);
				return;
			case DseexecutionmodelPackage.CONFIGURATION__MAX_NUMBER_OF_THREADS:
				setMaxNumberOfThreads((Integer)newValue);
				return;
			case DseexecutionmodelPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case DseexecutionmodelPackage.CONFIGURATION__STRATEGY:
				setStrategy((BaseStrategy)newValue);
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
			case DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS:
				getDseproblems().clear();
				return;
			case DseexecutionmodelPackage.CONFIGURATION__MAX_NUMBER_OF_THREADS:
				setMaxNumberOfThreads(MAX_NUMBER_OF_THREADS_EDEFAULT);
				return;
			case DseexecutionmodelPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DseexecutionmodelPackage.CONFIGURATION__STRATEGY:
				setStrategy((BaseStrategy)null);
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
			case DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS:
				return dseproblems != null && !dseproblems.isEmpty();
			case DseexecutionmodelPackage.CONFIGURATION__MAX_NUMBER_OF_THREADS:
				return maxNumberOfThreads != MAX_NUMBER_OF_THREADS_EDEFAULT;
			case DseexecutionmodelPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DseexecutionmodelPackage.CONFIGURATION__STRATEGY:
				return strategy != null;
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
		result.append(" (maxNumberOfThreads: ");
		result.append(maxNumberOfThreads);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
