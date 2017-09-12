/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pipesgraph.pipesGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pipesgraph.pipesGraph.Instance#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.pipesgraph.pipesGraph.Instance#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.pipesgraph.pipesGraph.Instance#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.pipesgraph.pipesGraph.PipesGraphPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(Component)
   * @see org.xtext.pipesgraph.pipesGraph.PipesGraphPackage#getInstance_Component()
   * @model
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.xtext.pipesgraph.pipesGraph.Instance#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

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
   * @see org.xtext.pipesgraph.pipesGraph.PipesGraphPackage#getInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.pipesgraph.pipesGraph.Instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see org.xtext.pipesgraph.pipesGraph.PipesGraphPackage#getInstance_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link org.xtext.pipesgraph.pipesGraph.Instance#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // Instance