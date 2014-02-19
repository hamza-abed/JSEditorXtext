/**
 */
package org.xtext.example.mydsl.javaScriptEditor;

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
 * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorFactory
 * @model kind="package"
 * @generated
 */
public interface JavaScriptEditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "javaScriptEditor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/JavaScriptEditor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "javaScriptEditor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JavaScriptEditorPackage eINSTANCE = org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.DomainmodelImpl
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.AbstractElementImpl
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.ProgramStartImpl <em>Program Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.ProgramStartImpl
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getProgramStart()
   * @generated
   */
  int PROGRAM_START = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_START__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Program Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_START_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ARGUMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ARGUMENT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Instructiuons</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__INSTRUCTIUONS = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.TypeImpl
   * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ELEMENT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.javaScriptEditor.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.javaScriptEditor.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.javaScriptEditor.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.javaScriptEditor.ProgramStart <em>Program Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program Start</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.ProgramStart
   * @generated
   */
  EClass getProgramStart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.javaScriptEditor.ProgramStart#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.ProgramStart#getElements()
   * @see #getProgramStart()
   * @generated
   */
  EReference getProgramStart_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getName()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arguments</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArguments()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Arguments();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Argument</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArgument()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Argument();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getElements()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Elements();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getInstructiuons <em>Instructiuons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Instructiuons</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getInstructiuons()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Instructiuons();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.javaScriptEditor.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.javaScriptEditor.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.javaScriptEditor.Type#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see org.xtext.example.mydsl.javaScriptEditor.Type#getElement()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Element();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JavaScriptEditorFactory getJavaScriptEditorFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.DomainmodelImpl
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.AbstractElementImpl
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.ProgramStartImpl <em>Program Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.ProgramStartImpl
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getProgramStart()
     * @generated
     */
    EClass PROGRAM_START = eINSTANCE.getProgramStart();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM_START__ELEMENTS = eINSTANCE.getProgramStart_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunctionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__ARGUMENTS = eINSTANCE.getFunctionDeclaration_Arguments();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__ARGUMENT = eINSTANCE.getFunctionDeclaration_Argument();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__ELEMENTS = eINSTANCE.getFunctionDeclaration_Elements();

    /**
     * The meta object literal for the '<em><b>Instructiuons</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__INSTRUCTIUONS = eINSTANCE.getFunctionDeclaration_Instructiuons();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.javaScriptEditor.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.TypeImpl
     * @see org.xtext.example.mydsl.javaScriptEditor.impl.JavaScriptEditorPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__ELEMENT = eINSTANCE.getType_Element();

  }

} //JavaScriptEditorPackage
