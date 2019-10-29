/**
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage;
import org.xtext.imt.browserautomation.browserAutomation.CLICK_ON;
import org.xtext.imt.browserautomation.browserAutomation.Clickable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLICK ON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.browserautomation.browserAutomation.impl.CLICK_ONImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLICK_ONImpl extends InstructionImpl implements CLICK_ON
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Clickable element;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CLICK_ONImpl()
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
    return BrowserAutomationPackage.Literals.CLICK_ON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clickable getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(Clickable newElement, NotificationChain msgs)
  {
    Clickable oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.CLICK_ON__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Clickable newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.CLICK_ON__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.CLICK_ON__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.CLICK_ON__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.CLICK_ON__ELEMENT:
        return basicSetElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BrowserAutomationPackage.CLICK_ON__ELEMENT:
        return getElement();
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
      case BrowserAutomationPackage.CLICK_ON__ELEMENT:
        setElement((Clickable)newValue);
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
      case BrowserAutomationPackage.CLICK_ON__ELEMENT:
        setElement((Clickable)null);
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
      case BrowserAutomationPackage.CLICK_ON__ELEMENT:
        return element != null;
    }
    return super.eIsSet(featureID);
  }

} //CLICK_ONImpl