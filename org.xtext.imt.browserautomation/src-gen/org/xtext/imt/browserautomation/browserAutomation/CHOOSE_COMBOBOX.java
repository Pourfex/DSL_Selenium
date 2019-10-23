/**
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CHOOSE COMBOBOX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage#getCHOOSE_COMBOBOX()
 * @model
 * @generated
 */
public interface CHOOSE_COMBOBOX extends Instruction
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(COMBOBOX)
   * @see org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage#getCHOOSE_COMBOBOX_Element()
   * @model containment="true"
   * @generated
   */
  COMBOBOX getElement();

  /**
   * Sets the value of the '{@link org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(COMBOBOX value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(String)
   * @see org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage#getCHOOSE_COMBOBOX_Data()
   * @model
   * @generated
   */
  String getData();

  /**
   * Sets the value of the '{@link org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
  void setData(String value);

} // CHOOSE_COMBOBOX
