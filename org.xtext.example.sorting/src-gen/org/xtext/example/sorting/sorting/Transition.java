/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.sorting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sorting.sorting.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Transition#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Transition#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sorting.sorting.SortingPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Instance)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getTransition_Source()
   * @model
   * @generated
   */
  Instance getSource();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Transition#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Instance value);

  /**
   * Returns the value of the '<em><b>Source Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Port</em>' reference.
   * @see #setSourcePort(Port)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getTransition_SourcePort()
   * @model
   * @generated
   */
  Port getSourcePort();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Transition#getSourcePort <em>Source Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Port</em>' reference.
   * @see #getSourcePort()
   * @generated
   */
  void setSourcePort(Port value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Instance)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getTransition_Target()
   * @model
   * @generated
   */
  Instance getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Instance value);

  /**
   * Returns the value of the '<em><b>Target Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Port</em>' reference.
   * @see #setTargetPort(Port)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getTransition_TargetPort()
   * @model
   * @generated
   */
  Port getTargetPort();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Transition#getTargetPort <em>Target Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Port</em>' reference.
   * @see #getTargetPort()
   * @generated
   */
  void setTargetPort(Port value);

} // Transition
