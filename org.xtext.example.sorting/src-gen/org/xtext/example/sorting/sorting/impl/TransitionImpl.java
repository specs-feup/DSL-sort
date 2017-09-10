/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.sorting.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.sorting.sorting.Instance;
import org.xtext.example.sorting.sorting.Port;
import org.xtext.example.sorting.sorting.SortingPackage;
import org.xtext.example.sorting.sorting.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sorting.sorting.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.impl.TransitionImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.impl.TransitionImpl#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Instance source;

  /**
   * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePort()
   * @generated
   * @ordered
   */
  protected Port sourcePort;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Instance target;

  /**
   * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetPort()
   * @generated
   * @ordered
   */
  protected Port targetPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SortingPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Instance)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SortingPackage.TRANSITION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Instance newSource)
  {
    Instance oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SortingPackage.TRANSITION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getSourcePort()
  {
    if (sourcePort != null && sourcePort.eIsProxy())
    {
      InternalEObject oldSourcePort = (InternalEObject)sourcePort;
      sourcePort = (Port)eResolveProxy(oldSourcePort);
      if (sourcePort != oldSourcePort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SortingPackage.TRANSITION__SOURCE_PORT, oldSourcePort, sourcePort));
      }
    }
    return sourcePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetSourcePort()
  {
    return sourcePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcePort(Port newSourcePort)
  {
    Port oldSourcePort = sourcePort;
    sourcePort = newSourcePort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SortingPackage.TRANSITION__SOURCE_PORT, oldSourcePort, sourcePort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Instance)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SortingPackage.TRANSITION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Instance newTarget)
  {
    Instance oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SortingPackage.TRANSITION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getTargetPort()
  {
    if (targetPort != null && targetPort.eIsProxy())
    {
      InternalEObject oldTargetPort = (InternalEObject)targetPort;
      targetPort = (Port)eResolveProxy(oldTargetPort);
      if (targetPort != oldTargetPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SortingPackage.TRANSITION__TARGET_PORT, oldTargetPort, targetPort));
      }
    }
    return targetPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetTargetPort()
  {
    return targetPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetPort(Port newTargetPort)
  {
    Port oldTargetPort = targetPort;
    targetPort = newTargetPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SortingPackage.TRANSITION__TARGET_PORT, oldTargetPort, targetPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SortingPackage.TRANSITION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case SortingPackage.TRANSITION__SOURCE_PORT:
        if (resolve) return getSourcePort();
        return basicGetSourcePort();
      case SortingPackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case SortingPackage.TRANSITION__TARGET_PORT:
        if (resolve) return getTargetPort();
        return basicGetTargetPort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SortingPackage.TRANSITION__SOURCE:
        setSource((Instance)newValue);
        return;
      case SortingPackage.TRANSITION__SOURCE_PORT:
        setSourcePort((Port)newValue);
        return;
      case SortingPackage.TRANSITION__TARGET:
        setTarget((Instance)newValue);
        return;
      case SortingPackage.TRANSITION__TARGET_PORT:
        setTargetPort((Port)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SortingPackage.TRANSITION__SOURCE:
        setSource((Instance)null);
        return;
      case SortingPackage.TRANSITION__SOURCE_PORT:
        setSourcePort((Port)null);
        return;
      case SortingPackage.TRANSITION__TARGET:
        setTarget((Instance)null);
        return;
      case SortingPackage.TRANSITION__TARGET_PORT:
        setTargetPort((Port)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SortingPackage.TRANSITION__SOURCE:
        return source != null;
      case SortingPackage.TRANSITION__SOURCE_PORT:
        return sourcePort != null;
      case SortingPackage.TRANSITION__TARGET:
        return target != null;
      case SortingPackage.TRANSITION__TARGET_PORT:
        return targetPort != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl
