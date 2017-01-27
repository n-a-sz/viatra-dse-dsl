/**
 */
package org.eclipse.viatra.dse.dsl.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType;
import org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder;
import org.eclipse.viatra.dse.dsl.model.IMutationRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evolutionary Strategy Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl#getPopulationSize <em>Population Size</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl#getCrossOvers <em>Cross Overs</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.EvolutionaryStrategyBuilderImpl#getMutations <em>Mutations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvolutionaryStrategyBuilderImpl extends BaseStrategyImpl implements EvolutionaryStrategyBuilder {
	/**
	 * The default value of the '{@link #getPopulationSize() <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulationSize() <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSize()
	 * @generated
	 * @ordered
	 */
	protected int populationSize = POPULATION_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrossOvers() <em>Cross Overs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossOvers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> crossOvers;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EvolutionStrategyType TYPE_EDEFAULT = EvolutionStrategyType.NSGA2;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EvolutionStrategyType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getMutations() <em>Mutations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutations()
	 * @generated
	 * @ordered
	 */
	protected EList<IMutationRate> mutations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvolutionaryStrategyBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.EVOLUTIONARY_STRATEGY_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulationSize() {
		return populationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationSize(int newPopulationSize) {
		int oldPopulationSize = populationSize;
		populationSize = newPopulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE, oldPopulationSize, populationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCrossOvers() {
		if (crossOvers == null) {
			crossOvers = new EDataTypeUniqueEList<String>(String.class, this, DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS);
		}
		return crossOvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolutionStrategyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EvolutionStrategyType newType) {
		EvolutionStrategyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IMutationRate> getMutations() {
		if (mutations == null) {
			mutations = new EObjectResolvingEList<IMutationRate>(IMutationRate.class, this, DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS);
		}
		return mutations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE:
				return getPopulationSize();
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS:
				return getCrossOvers();
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__TYPE:
				return getType();
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__NAME:
				return getName();
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS:
				return getMutations();
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
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE:
				setPopulationSize((Integer)newValue);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS:
				getCrossOvers().clear();
				getCrossOvers().addAll((Collection<? extends String>)newValue);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__TYPE:
				setType((EvolutionStrategyType)newValue);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__NAME:
				setName((String)newValue);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS:
				getMutations().clear();
				getMutations().addAll((Collection<? extends IMutationRate>)newValue);
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
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE:
				setPopulationSize(POPULATION_SIZE_EDEFAULT);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS:
				getCrossOvers().clear();
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS:
				getMutations().clear();
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
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__POPULATION_SIZE:
				return populationSize != POPULATION_SIZE_EDEFAULT;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__CROSS_OVERS:
				return crossOvers != null && !crossOvers.isEmpty();
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__TYPE:
				return type != TYPE_EDEFAULT;
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER__MUTATIONS:
				return mutations != null && !mutations.isEmpty();
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
		result.append(" (populationSize: ");
		result.append(populationSize);
		result.append(", crossOvers: ");
		result.append(crossOvers);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EvolutionaryStrategyBuilderImpl
