/**
 */
package org.eclipse.viatra.dse.dsl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dse Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.dse.dsl.model.DseImport#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseImport()
 * @model
 * @generated
 */
public interface DseImport extends Type {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage#getDseImport_Imports()
	 * @model transient="true"
	 * @generated
	 */
	EList<String> getImports();

} // DseImport
