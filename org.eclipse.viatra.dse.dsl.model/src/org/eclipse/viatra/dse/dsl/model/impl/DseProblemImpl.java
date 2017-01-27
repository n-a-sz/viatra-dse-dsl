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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.dse.dsl.model.BaseObjective;
import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.Constraint;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.InitialModel;
import org.eclipse.viatra.dse.dsl.model.MetaModel;
import org.eclipse.viatra.dse.dsl.model.SolutionStore;
import org.eclipse.viatra.dse.dsl.model.StateCoder;
import org.eclipse.viatra.dse.dsl.model.TransformationRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dse Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getInitialmodel <em>Initialmodel</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getTransformationrules <em>Transformationrules</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getStatecoder <em>Statecoder</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getSolutionstore <em>Solutionstore</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.impl.DseProblemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DseProblemImpl extends DseImportImpl implements DseProblem {
	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected Configuration configurations;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getInitialmodel() <em>Initialmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialmodel()
	 * @generated
	 * @ordered
	 */
	protected InitialModel initialmodel;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected MetaModel metamodel;

	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseObjective> objectives;

	/**
	 * The cached value of the '{@link #getTransformationrules() <em>Transformationrules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationrules()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationRule> transformationrules;

	/**
	 * The cached value of the '{@link #getStatecoder() <em>Statecoder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatecoder()
	 * @generated
	 * @ordered
	 */
	protected StateCoder statecoder;

	/**
	 * The cached value of the '{@link #getSolutionstore() <em>Solutionstore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionstore()
	 * @generated
	 * @ordered
	 */
	protected SolutionStore solutionstore;

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
	protected DseProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseexecutionmodelPackage.Literals.DSE_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfigurations() {
		if (configurations != null && configurations.eIsProxy()) {
			InternalEObject oldConfigurations = (InternalEObject)configurations;
			configurations = (Configuration)eResolveProxy(oldConfigurations);
			if (configurations != oldConfigurations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS, oldConfigurations, configurations));
			}
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfigurations() {
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurations(Configuration newConfigurations, NotificationChain msgs) {
		Configuration oldConfigurations = configurations;
		configurations = newConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS, oldConfigurations, newConfigurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurations(Configuration newConfigurations) {
		if (newConfigurations != configurations) {
			NotificationChain msgs = null;
			if (configurations != null)
				msgs = ((InternalEObject)configurations).eInverseRemove(this, DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS, Configuration.class, msgs);
			if (newConfigurations != null)
				msgs = ((InternalEObject)newConfigurations).eInverseAdd(this, DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS, Configuration.class, msgs);
			msgs = basicSetConfigurations(newConfigurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS, newConfigurations, newConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectResolvingEList<Constraint>(Constraint.class, this, DseexecutionmodelPackage.DSE_PROBLEM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialModel getInitialmodel() {
		if (initialmodel != null && initialmodel.eIsProxy()) {
			InternalEObject oldInitialmodel = (InternalEObject)initialmodel;
			initialmodel = (InitialModel)eResolveProxy(oldInitialmodel);
			if (initialmodel != oldInitialmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DseexecutionmodelPackage.DSE_PROBLEM__INITIALMODEL, oldInitialmodel, initialmodel));
			}
		}
		return initialmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialModel basicGetInitialmodel() {
		return initialmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialmodel(InitialModel newInitialmodel) {
		InitialModel oldInitialmodel = initialmodel;
		initialmodel = newInitialmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__INITIALMODEL, oldInitialmodel, initialmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (MetaModel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DseexecutionmodelPackage.DSE_PROBLEM__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(MetaModel newMetamodel) {
		MetaModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseObjective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectResolvingEList<BaseObjective>(BaseObjective.class, this, DseexecutionmodelPackage.DSE_PROBLEM__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationRule> getTransformationrules() {
		if (transformationrules == null) {
			transformationrules = new EObjectResolvingEList<TransformationRule>(TransformationRule.class, this, DseexecutionmodelPackage.DSE_PROBLEM__TRANSFORMATIONRULES);
		}
		return transformationrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateCoder getStatecoder() {
		if (statecoder != null && statecoder.eIsProxy()) {
			InternalEObject oldStatecoder = (InternalEObject)statecoder;
			statecoder = (StateCoder)eResolveProxy(oldStatecoder);
			if (statecoder != oldStatecoder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DseexecutionmodelPackage.DSE_PROBLEM__STATECODER, oldStatecoder, statecoder));
			}
		}
		return statecoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateCoder basicGetStatecoder() {
		return statecoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatecoder(StateCoder newStatecoder) {
		StateCoder oldStatecoder = statecoder;
		statecoder = newStatecoder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__STATECODER, oldStatecoder, statecoder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionStore getSolutionstore() {
		if (solutionstore != null && solutionstore.eIsProxy()) {
			InternalEObject oldSolutionstore = (InternalEObject)solutionstore;
			solutionstore = (SolutionStore)eResolveProxy(oldSolutionstore);
			if (solutionstore != oldSolutionstore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DseexecutionmodelPackage.DSE_PROBLEM__SOLUTIONSTORE, oldSolutionstore, solutionstore));
			}
		}
		return solutionstore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionStore basicGetSolutionstore() {
		return solutionstore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionstore(SolutionStore newSolutionstore) {
		SolutionStore oldSolutionstore = solutionstore;
		solutionstore = newSolutionstore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__SOLUTIONSTORE, oldSolutionstore, solutionstore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseexecutionmodelPackage.DSE_PROBLEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS:
				if (configurations != null)
					msgs = ((InternalEObject)configurations).eInverseRemove(this, DseexecutionmodelPackage.CONFIGURATION__DSEPROBLEMS, Configuration.class, msgs);
				return basicSetConfigurations((Configuration)otherEnd, msgs);
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
			case DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS:
				return basicSetConfigurations(null, msgs);
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
			case DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS:
				if (resolve) return getConfigurations();
				return basicGetConfigurations();
			case DseexecutionmodelPackage.DSE_PROBLEM__CONSTRAINTS:
				return getConstraints();
			case DseexecutionmodelPackage.DSE_PROBLEM__INITIALMODEL:
				if (resolve) return getInitialmodel();
				return basicGetInitialmodel();
			case DseexecutionmodelPackage.DSE_PROBLEM__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case DseexecutionmodelPackage.DSE_PROBLEM__OBJECTIVES:
				return getObjectives();
			case DseexecutionmodelPackage.DSE_PROBLEM__TRANSFORMATIONRULES:
				return getTransformationrules();
			case DseexecutionmodelPackage.DSE_PROBLEM__STATECODER:
				if (resolve) return getStatecoder();
				return basicGetStatecoder();
			case DseexecutionmodelPackage.DSE_PROBLEM__SOLUTIONSTORE:
				if (resolve) return getSolutionstore();
				return basicGetSolutionstore();
			case DseexecutionmodelPackage.DSE_PROBLEM__NAME:
				return getName();
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
			case DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS:
				setConfigurations((Configuration)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__INITIALMODEL:
				setInitialmodel((InitialModel)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__METAMODEL:
				setMetamodel((MetaModel)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends BaseObjective>)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__TRANSFORMATIONRULES:
				getTransformationrules().clear();
				getTransformationrules().addAll((Collection<? extends TransformationRule>)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__STATECODER:
				setStatecoder((StateCoder)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__SOLUTIONSTORE:
				setSolutionstore((SolutionStore)newValue);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__NAME:
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
			case DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS:
				setConfigurations((Configuration)null);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__CONSTRAINTS:
				getConstraints().clear();
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__INITIALMODEL:
				setInitialmodel((InitialModel)null);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__METAMODEL:
				setMetamodel((MetaModel)null);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__OBJECTIVES:
				getObjectives().clear();
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__TRANSFORMATIONRULES:
				getTransformationrules().clear();
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__STATECODER:
				setStatecoder((StateCoder)null);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__SOLUTIONSTORE:
				setSolutionstore((SolutionStore)null);
				return;
			case DseexecutionmodelPackage.DSE_PROBLEM__NAME:
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
			case DseexecutionmodelPackage.DSE_PROBLEM__CONFIGURATIONS:
				return configurations != null;
			case DseexecutionmodelPackage.DSE_PROBLEM__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case DseexecutionmodelPackage.DSE_PROBLEM__INITIALMODEL:
				return initialmodel != null;
			case DseexecutionmodelPackage.DSE_PROBLEM__METAMODEL:
				return metamodel != null;
			case DseexecutionmodelPackage.DSE_PROBLEM__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
			case DseexecutionmodelPackage.DSE_PROBLEM__TRANSFORMATIONRULES:
				return transformationrules != null && !transformationrules.isEmpty();
			case DseexecutionmodelPackage.DSE_PROBLEM__STATECODER:
				return statecoder != null;
			case DseexecutionmodelPackage.DSE_PROBLEM__SOLUTIONSTORE:
				return solutionstore != null;
			case DseexecutionmodelPackage.DSE_PROBLEM__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DseProblemImpl
