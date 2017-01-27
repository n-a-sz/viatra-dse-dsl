/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolutionary Strategy Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getPopulationSize <em>Population Size</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getCrossOvers <em>Cross Overs</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getMutations <em>Mutations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getEvolutionaryStrategyBuilder()
 * @model
 * @generated
 */
public interface EvolutionaryStrategyBuilder extends BaseStrategy {
	/**
	 * Returns the value of the '<em><b>Population Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Size</em>' attribute.
	 * @see #setPopulationSize(int)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getEvolutionaryStrategyBuilder_PopulationSize()
	 * @model default="0"
	 * @generated
	 */
	int getPopulationSize();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getPopulationSize <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Size</em>' attribute.
	 * @see #getPopulationSize()
	 * @generated
	 */
	void setPopulationSize(int value);

	/**
	 * Returns the value of the '<em><b>Cross Overs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Overs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Overs</em>' attribute list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getEvolutionaryStrategyBuilder_CrossOvers()
	 * @model
	 * @generated
	 */
	EList<String> getCrossOvers();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType
	 * @see #setType(EvolutionStrategyType)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getEvolutionaryStrategyBuilder_Type()
	 * @model
	 * @generated
	 */
	EvolutionStrategyType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType
	 * @see #getType()
	 * @generated
	 */
	void setType(EvolutionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getEvolutionaryStrategyBuilder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mutations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.dse.dsl.model.IMutationRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutations</em>' reference list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getEvolutionaryStrategyBuilder_Mutations()
	 * @model
	 * @generated
	 */
	EList<IMutationRate> getMutations();

} // EvolutionaryStrategyBuilder
