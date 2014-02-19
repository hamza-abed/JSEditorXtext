/**
 */
package org.xtext.example.mydsl.javaScriptEditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.javaScriptEditor.AbstractElement;
import org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration;
import org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.impl.FunctionDeclarationImpl#getInstructiuons <em>Instructiuons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends AbstractElementImpl implements FunctionDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getArguments() <em>Arguments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected static final String ARGUMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected String arguments = ARGUMENTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected EList<String> argument;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

  /**
   * The cached value of the '{@link #getInstructiuons() <em>Instructiuons</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructiuons()
   * @generated
   * @ordered
   */
  protected EList<String> instructiuons;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDeclarationImpl()
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
    return JavaScriptEditorPackage.Literals.FUNCTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaScriptEditorPackage.FUNCTION_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(String newArguments)
  {
    String oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENTS, oldArguments, arguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgument()
  {
    if (argument == null)
    {
      argument = new EDataTypeEList<String>(String.class, this, JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENT);
    }
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, JavaScriptEditorPackage.FUNCTION_DECLARATION__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInstructiuons()
  {
    if (instructiuons == null)
    {
      instructiuons = new EDataTypeEList<String>(String.class, this, JavaScriptEditorPackage.FUNCTION_DECLARATION__INSTRUCTIUONS);
    }
    return instructiuons;
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
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__NAME:
        return getName();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENTS:
        return getArguments();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENT:
        return getArgument();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ELEMENTS:
        return getElements();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__INSTRUCTIUONS:
        return getInstructiuons();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENTS:
        setArguments((String)newValue);
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENT:
        getArgument().clear();
        getArgument().addAll((Collection<? extends String>)newValue);
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__INSTRUCTIUONS:
        getInstructiuons().clear();
        getInstructiuons().addAll((Collection<? extends String>)newValue);
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
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENTS:
        setArguments(ARGUMENTS_EDEFAULT);
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENT:
        getArgument().clear();
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ELEMENTS:
        getElements().clear();
        return;
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__INSTRUCTIUONS:
        getInstructiuons().clear();
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
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENTS:
        return ARGUMENTS_EDEFAULT == null ? arguments != null : !ARGUMENTS_EDEFAULT.equals(arguments);
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ARGUMENT:
        return argument != null && !argument.isEmpty();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case JavaScriptEditorPackage.FUNCTION_DECLARATION__INSTRUCTIUONS:
        return instructiuons != null && !instructiuons.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", arguments: ");
    result.append(arguments);
    result.append(", argument: ");
    result.append(argument);
    result.append(", instructiuons: ");
    result.append(instructiuons);
    result.append(')');
    return result.toString();
  }

} //FunctionDeclarationImpl
