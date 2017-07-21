/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.sorting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.sorting.sorting.SortingFactory
 * @model kind="package"
 * @generated
 */
public interface SortingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sorting";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/sorting/Sorting";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sorting";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SortingPackage eINSTANCE = org.xtext.example.sorting.sorting.impl.SortingPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.sorting.sorting.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.sorting.sorting.impl.TypeImpl
   * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getType()
   * @generated
   */
  int TYPE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.sorting.sorting.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.sorting.sorting.impl.SourceImpl
   * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getSource()
   * @generated
   */
  int SOURCE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__METHOD = 2;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.sorting.sorting.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.sorting.sorting.impl.FilterImpl
   * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__NAME = 0;

  /**
   * The feature id for the '<em><b>In Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__IN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Out Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__OUT_TYPE = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__METHOD = 3;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.sorting.sorting.impl.SinkImpl <em>Sink</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.sorting.sorting.impl.SinkImpl
   * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getSink()
   * @generated
   */
  int SINK = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK__NAME = 0;

  /**
   * The feature id for the '<em><b>In Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK__IN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK__METHOD = 2;

  /**
   * The number of structural features of the '<em>Sink</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.sorting.sorting.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.sorting.sorting.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.sorting.sorting.Type#getType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.sorting.sorting.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see org.xtext.example.sorting.sorting.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Source#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.sorting.sorting.Source#getName()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.sorting.sorting.Source#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.sorting.sorting.Source#getType()
   * @see #getSource()
   * @generated
   */
  EReference getSource_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Source#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.xtext.example.sorting.sorting.Source#getMethod()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.example.sorting.sorting.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see org.xtext.example.sorting.sorting.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Filter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.sorting.sorting.Filter#getName()
   * @see #getFilter()
   * @generated
   */
  EAttribute getFilter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.sorting.sorting.Filter#getInType <em>In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In Type</em>'.
   * @see org.xtext.example.sorting.sorting.Filter#getInType()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_InType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.sorting.sorting.Filter#getOutType <em>Out Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out Type</em>'.
   * @see org.xtext.example.sorting.sorting.Filter#getOutType()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_OutType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Filter#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.xtext.example.sorting.sorting.Filter#getMethod()
   * @see #getFilter()
   * @generated
   */
  EAttribute getFilter_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.example.sorting.sorting.Sink <em>Sink</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sink</em>'.
   * @see org.xtext.example.sorting.sorting.Sink
   * @generated
   */
  EClass getSink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Sink#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.sorting.sorting.Sink#getName()
   * @see #getSink()
   * @generated
   */
  EAttribute getSink_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.sorting.sorting.Sink#getInType <em>In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In Type</em>'.
   * @see org.xtext.example.sorting.sorting.Sink#getInType()
   * @see #getSink()
   * @generated
   */
  EReference getSink_InType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.sorting.sorting.Sink#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.xtext.example.sorting.sorting.Sink#getMethod()
   * @see #getSink()
   * @generated
   */
  EAttribute getSink_Method();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SortingFactory getSortingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.sorting.sorting.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.sorting.sorting.impl.TypeImpl
     * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.sorting.sorting.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.sorting.sorting.impl.SourceImpl
     * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE__TYPE = eINSTANCE.getSource_Type();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__METHOD = eINSTANCE.getSource_Method();

    /**
     * The meta object literal for the '{@link org.xtext.example.sorting.sorting.impl.FilterImpl <em>Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.sorting.sorting.impl.FilterImpl
     * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER__NAME = eINSTANCE.getFilter_Name();

    /**
     * The meta object literal for the '<em><b>In Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER__IN_TYPE = eINSTANCE.getFilter_InType();

    /**
     * The meta object literal for the '<em><b>Out Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER__OUT_TYPE = eINSTANCE.getFilter_OutType();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER__METHOD = eINSTANCE.getFilter_Method();

    /**
     * The meta object literal for the '{@link org.xtext.example.sorting.sorting.impl.SinkImpl <em>Sink</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.sorting.sorting.impl.SinkImpl
     * @see org.xtext.example.sorting.sorting.impl.SortingPackageImpl#getSink()
     * @generated
     */
    EClass SINK = eINSTANCE.getSink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINK__NAME = eINSTANCE.getSink_Name();

    /**
     * The meta object literal for the '<em><b>In Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINK__IN_TYPE = eINSTANCE.getSink_InType();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINK__METHOD = eINSTANCE.getSink_Method();

  }

} //SortingPackage