/**
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.browserAutomation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationFactory;
import org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage;
import org.xtext.imt.browserautomation.browserAutomation.Clickable;
import org.xtext.imt.browserautomation.browserAutomation.Element;
import org.xtext.imt.browserautomation.browserAutomation.Insertable;
import org.xtext.imt.browserautomation.browserAutomation.Instruction;
import org.xtext.imt.browserautomation.browserAutomation.RefElement;
import org.xtext.imt.browserautomation.browserAutomation.Test;
import org.xtext.imt.browserautomation.browserAutomation.Verifiable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserAutomationPackageImpl extends EPackageImpl implements BrowserAutomationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass affectationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass opeN_BROWSEREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gO_TO_URLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clicK_ONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifY_THATEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inserT_ONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checK_BOXEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choosE_COMBOBOXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reaD_ONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifiableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clickableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comboboxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkboxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searcH_FIELDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramsEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.imt.browserautomation.browserAutomation.BrowserAutomationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BrowserAutomationPackageImpl()
  {
    super(eNS_URI, BrowserAutomationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link BrowserAutomationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BrowserAutomationPackage init()
  {
    if (isInited) return (BrowserAutomationPackage)EPackage.Registry.INSTANCE.getEPackage(BrowserAutomationPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredBrowserAutomationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    BrowserAutomationPackageImpl theBrowserAutomationPackage = registeredBrowserAutomationPackage instanceof BrowserAutomationPackageImpl ? (BrowserAutomationPackageImpl)registeredBrowserAutomationPackage : new BrowserAutomationPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theBrowserAutomationPackage.createPackageContents();

    // Initialize created meta-data
    theBrowserAutomationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBrowserAutomationPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BrowserAutomationPackage.eNS_URI, theBrowserAutomationPackage);
    return theBrowserAutomationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTest()
  {
    return testEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTest_Name()
  {
    return (EAttribute)testEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_Instructions()
  {
    return (EReference)testEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAFFECTATION()
  {
    return affectationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAFFECTATION_Name()
  {
    return (EAttribute)affectationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAFFECTATION_Selector()
  {
    return (EReference)affectationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSELECTOR()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSELECTOR_Readable()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSELECTOR_Params()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSELECTOR_Number()
  {
    return (EAttribute)selectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefElement()
  {
    return refElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefElement_Ref()
  {
    return (EReference)refElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Id()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOPEN_BROWSER()
  {
    return opeN_BROWSEREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGO_TO_URL()
  {
    return gO_TO_URLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGO_TO_URL_Url()
  {
    return (EAttribute)gO_TO_URLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLICK_ON()
  {
    return clicK_ONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLICK_ON_Element()
  {
    return (EReference)clicK_ONEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVERIFY_THAT()
  {
    return verifY_THATEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVERIFY_THAT_Element()
  {
    return (EReference)verifY_THATEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINSERT_ON()
  {
    return inserT_ONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getINSERT_ON_Element()
  {
    return (EReference)inserT_ONEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getINSERT_ON_Data()
  {
    return (EAttribute)inserT_ONEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHECK_BOXE()
  {
    return checK_BOXEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCHECK_BOXE_Element()
  {
    return (EReference)checK_BOXEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHOOSE_COMBOBOX()
  {
    return choosE_COMBOBOXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCHOOSE_COMBOBOX_Element()
  {
    return (EReference)choosE_COMBOBOXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCHOOSE_COMBOBOX_Data()
  {
    return (EAttribute)choosE_COMBOBOXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREAD_ON()
  {
    return reaD_ONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getREAD_ON_Element()
  {
    return (EReference)reaD_ONEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadable()
  {
    return readableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertable()
  {
    return insertableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerifiable()
  {
    return verifiableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClickable()
  {
    return clickableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCOMBOBOX()
  {
    return comboboxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCOMBOBOX_Name()
  {
    return (EAttribute)comboboxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHECKBOX()
  {
    return checkboxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCHECKBOX_Name()
  {
    return (EAttribute)checkboxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSEARCH_FIELD()
  {
    return searcH_FIELDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSEARCH_FIELD_Name()
  {
    return (EAttribute)searcH_FIELDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTEXT()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTEXT_Name()
  {
    return (EAttribute)textEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBUTTON()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBUTTON_Name()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLINK()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLINK_Url()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIMAGE()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIMAGE_Name()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIMAGE_Params()
  {
    return (EReference)imageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPARAMS()
  {
    return paramsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPARAMS_Key()
  {
    return (EAttribute)paramsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPARAMS_Value()
  {
    return (EAttribute)paramsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserAutomationFactory getBrowserAutomationFactory()
  {
    return (BrowserAutomationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    testEClass = createEClass(TEST);
    createEAttribute(testEClass, TEST__NAME);
    createEReference(testEClass, TEST__INSTRUCTIONS);

    instructionEClass = createEClass(INSTRUCTION);

    affectationEClass = createEClass(AFFECTATION);
    createEAttribute(affectationEClass, AFFECTATION__NAME);
    createEReference(affectationEClass, AFFECTATION__SELECTOR);

    selectorEClass = createEClass(SELECTOR);
    createEReference(selectorEClass, SELECTOR__READABLE);
    createEReference(selectorEClass, SELECTOR__PARAMS);
    createEAttribute(selectorEClass, SELECTOR__NUMBER);

    refElementEClass = createEClass(REF_ELEMENT);
    createEReference(refElementEClass, REF_ELEMENT__REF);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__ID);

    opeN_BROWSEREClass = createEClass(OPEN_BROWSER);

    gO_TO_URLEClass = createEClass(GO_TO_URL);
    createEAttribute(gO_TO_URLEClass, GO_TO_URL__URL);

    clicK_ONEClass = createEClass(CLICK_ON);
    createEReference(clicK_ONEClass, CLICK_ON__ELEMENT);

    verifY_THATEClass = createEClass(VERIFY_THAT);
    createEReference(verifY_THATEClass, VERIFY_THAT__ELEMENT);

    inserT_ONEClass = createEClass(INSERT_ON);
    createEReference(inserT_ONEClass, INSERT_ON__ELEMENT);
    createEAttribute(inserT_ONEClass, INSERT_ON__DATA);

    checK_BOXEEClass = createEClass(CHECK_BOXE);
    createEReference(checK_BOXEEClass, CHECK_BOXE__ELEMENT);

    choosE_COMBOBOXEClass = createEClass(CHOOSE_COMBOBOX);
    createEReference(choosE_COMBOBOXEClass, CHOOSE_COMBOBOX__ELEMENT);
    createEAttribute(choosE_COMBOBOXEClass, CHOOSE_COMBOBOX__DATA);

    reaD_ONEClass = createEClass(READ_ON);
    createEReference(reaD_ONEClass, READ_ON__ELEMENT);

    readableEClass = createEClass(READABLE);

    insertableEClass = createEClass(INSERTABLE);

    verifiableEClass = createEClass(VERIFIABLE);

    clickableEClass = createEClass(CLICKABLE);

    comboboxEClass = createEClass(COMBOBOX);
    createEAttribute(comboboxEClass, COMBOBOX__NAME);

    checkboxEClass = createEClass(CHECKBOX);
    createEAttribute(checkboxEClass, CHECKBOX__NAME);

    searcH_FIELDEClass = createEClass(SEARCH_FIELD);
    createEAttribute(searcH_FIELDEClass, SEARCH_FIELD__NAME);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__NAME);

    buttonEClass = createEClass(BUTTON);
    createEAttribute(buttonEClass, BUTTON__NAME);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__URL);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__NAME);
    createEReference(imageEClass, IMAGE__PARAMS);

    paramsEClass = createEClass(PARAMS);
    createEAttribute(paramsEClass, PARAMS__KEY);
    createEAttribute(paramsEClass, PARAMS__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    affectationEClass.getESuperTypes().add(this.getInstruction());
    refElementEClass.getESuperTypes().add(this.getVerifiable());
    refElementEClass.getESuperTypes().add(this.getClickable());
    opeN_BROWSEREClass.getESuperTypes().add(this.getInstruction());
    gO_TO_URLEClass.getESuperTypes().add(this.getInstruction());
    clicK_ONEClass.getESuperTypes().add(this.getInstruction());
    verifY_THATEClass.getESuperTypes().add(this.getInstruction());
    inserT_ONEClass.getESuperTypes().add(this.getInstruction());
    checK_BOXEEClass.getESuperTypes().add(this.getInstruction());
    choosE_COMBOBOXEClass.getESuperTypes().add(this.getInstruction());
    reaD_ONEClass.getESuperTypes().add(this.getInstruction());
    comboboxEClass.getESuperTypes().add(this.getClickable());
    searcH_FIELDEClass.getESuperTypes().add(this.getInsertable());
    searcH_FIELDEClass.getESuperTypes().add(this.getClickable());
    textEClass.getESuperTypes().add(this.getReadable());
    textEClass.getESuperTypes().add(this.getVerifiable());
    buttonEClass.getESuperTypes().add(this.getReadable());
    buttonEClass.getESuperTypes().add(this.getVerifiable());
    buttonEClass.getESuperTypes().add(this.getClickable());
    linkEClass.getESuperTypes().add(this.getReadable());
    linkEClass.getESuperTypes().add(this.getVerifiable());
    linkEClass.getESuperTypes().add(this.getClickable());
    imageEClass.getESuperTypes().add(this.getVerifiable());
    imageEClass.getESuperTypes().add(this.getClickable());

    // Initialize classes and features; add operations and parameters
    initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(affectationEClass, org.xtext.imt.browserautomation.browserAutomation.AFFECTATION.class, "AFFECTATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAFFECTATION_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.AFFECTATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAFFECTATION_Selector(), this.getSELECTOR(), null, "selector", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.AFFECTATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, org.xtext.imt.browserautomation.browserAutomation.SELECTOR.class, "SELECTOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSELECTOR_Readable(), this.getReadable(), null, "readable", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.SELECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSELECTOR_Params(), this.getPARAMS(), null, "params", null, 0, -1, org.xtext.imt.browserautomation.browserAutomation.SELECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSELECTOR_Number(), ecorePackage.getEInt(), "number", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.SELECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refElementEClass, RefElement.class, "RefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefElement_Ref(), this.getAFFECTATION(), null, "ref", null, 0, 1, RefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Id(), ecorePackage.getEString(), "Id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(opeN_BROWSEREClass, org.xtext.imt.browserautomation.browserAutomation.OPEN_BROWSER.class, "OPEN_BROWSER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gO_TO_URLEClass, org.xtext.imt.browserautomation.browserAutomation.GO_TO_URL.class, "GO_TO_URL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGO_TO_URL_Url(), ecorePackage.getEString(), "url", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.GO_TO_URL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clicK_ONEClass, org.xtext.imt.browserautomation.browserAutomation.CLICK_ON.class, "CLICK_ON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCLICK_ON_Element(), this.getClickable(), null, "element", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.CLICK_ON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verifY_THATEClass, org.xtext.imt.browserautomation.browserAutomation.VERIFY_THAT.class, "VERIFY_THAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVERIFY_THAT_Element(), this.getVerifiable(), null, "element", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.VERIFY_THAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inserT_ONEClass, org.xtext.imt.browserautomation.browserAutomation.INSERT_ON.class, "INSERT_ON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getINSERT_ON_Element(), this.getInsertable(), null, "element", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.INSERT_ON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getINSERT_ON_Data(), ecorePackage.getEString(), "data", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.INSERT_ON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checK_BOXEEClass, org.xtext.imt.browserautomation.browserAutomation.CHECK_BOXE.class, "CHECK_BOXE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCHECK_BOXE_Element(), this.getCHECKBOX(), null, "element", null, 0, -1, org.xtext.imt.browserautomation.browserAutomation.CHECK_BOXE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choosE_COMBOBOXEClass, org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX.class, "CHOOSE_COMBOBOX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCHOOSE_COMBOBOX_Element(), this.getCOMBOBOX(), null, "element", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCHOOSE_COMBOBOX_Data(), ecorePackage.getEString(), "data", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.CHOOSE_COMBOBOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reaD_ONEClass, org.xtext.imt.browserautomation.browserAutomation.READ_ON.class, "READ_ON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getREAD_ON_Element(), this.getReadable(), null, "element", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.READ_ON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readableEClass, org.xtext.imt.browserautomation.browserAutomation.Readable.class, "Readable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(insertableEClass, Insertable.class, "Insertable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(verifiableEClass, Verifiable.class, "Verifiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clickableEClass, Clickable.class, "Clickable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comboboxEClass, org.xtext.imt.browserautomation.browserAutomation.COMBOBOX.class, "COMBOBOX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCOMBOBOX_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.COMBOBOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkboxEClass, org.xtext.imt.browserautomation.browserAutomation.CHECKBOX.class, "CHECKBOX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCHECKBOX_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.CHECKBOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searcH_FIELDEClass, org.xtext.imt.browserautomation.browserAutomation.SEARCH_FIELD.class, "SEARCH_FIELD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSEARCH_FIELD_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.SEARCH_FIELD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textEClass, org.xtext.imt.browserautomation.browserAutomation.TEXT.class, "TEXT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTEXT_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.TEXT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, org.xtext.imt.browserautomation.browserAutomation.BUTTON.class, "BUTTON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBUTTON_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.BUTTON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, org.xtext.imt.browserautomation.browserAutomation.LINK.class, "LINK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLINK_Url(), ecorePackage.getEString(), "url", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.LINK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, org.xtext.imt.browserautomation.browserAutomation.IMAGE.class, "IMAGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIMAGE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.IMAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIMAGE_Params(), this.getPARAMS(), null, "params", null, 0, -1, org.xtext.imt.browserautomation.browserAutomation.IMAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramsEClass, org.xtext.imt.browserautomation.browserAutomation.PARAMS.class, "PARAMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPARAMS_Key(), ecorePackage.getEString(), "key", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.PARAMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPARAMS_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.xtext.imt.browserautomation.browserAutomation.PARAMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BrowserAutomationPackageImpl
