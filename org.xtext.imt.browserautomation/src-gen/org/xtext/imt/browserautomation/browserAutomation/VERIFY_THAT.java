/**
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VERIFY THAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.browserautomation.browserAutomation.VERIFY_THAT#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage#getVERIFY_THAT()
 * @model
 * @generated
 */
public interface VERIFY_THAT extends Instruction
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
   * @see #setElement(Verifiable)
   * @see org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage#getVERIFY_THAT_Element()
   * @model containment="true"
   * @generated
   */
  Verifiable getElement();

  /**
   * Sets the value of the '{@link org.xtext.imt.browserautomation.browserAutomation.VERIFY_THAT#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Verifiable value);

} // VERIFY_THAT
