/**
 */
package org.xtext.example.mydsl.javaScriptEditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.javaScriptEditor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaScriptEditorFactoryImpl extends EFactoryImpl implements JavaScriptEditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavaScriptEditorFactory init()
  {
    try
    {
      JavaScriptEditorFactory theJavaScriptEditorFactory = (JavaScriptEditorFactory)EPackage.Registry.INSTANCE.getEFactory(JavaScriptEditorPackage.eNS_URI);
      if (theJavaScriptEditorFactory != null)
      {
        return theJavaScriptEditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JavaScriptEditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaScriptEditorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JavaScriptEditorPackage.DOMAINMODEL: return createDomainmodel();
      case JavaScriptEditorPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case JavaScriptEditorPackage.PROGRAM_START: return createProgramStart();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case JavaScriptEditorPackage.TYPE: return createType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProgramStart createProgramStart()
  {
    ProgramStartImpl programStart = new ProgramStartImpl();
    return programStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaScriptEditorPackage getJavaScriptEditorPackage()
  {
    return (JavaScriptEditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JavaScriptEditorPackage getPackage()
  {
    return JavaScriptEditorPackage.eINSTANCE;
  }

} //JavaScriptEditorFactoryImpl
