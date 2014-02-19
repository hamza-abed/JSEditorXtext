/**
 */
package org.xtext.example.mydsl.javaScriptEditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getInstructiuons <em>Instructiuons</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getFunctionDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute.
   * @see #setArguments(String)
   * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getFunctionDeclaration_Arguments()
   * @model
   * @generated
   */
  String getArguments();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration#getArguments <em>Arguments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' attribute.
   * @see #getArguments()
   * @generated
   */
  void setArguments(String value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute list.
   * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getFunctionDeclaration_Argument()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgument();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.javaScriptEditor.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getFunctionDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

  /**
   * Returns the value of the '<em><b>Instructiuons</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructiuons</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructiuons</em>' attribute list.
   * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getFunctionDeclaration_Instructiuons()
   * @model unique="false"
   * @generated
   */
  EList<String> getInstructiuons();

} // FunctionDeclaration
