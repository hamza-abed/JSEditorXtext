/**
 */
package org.xtext.example.mydsl.javaScriptEditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.javaScriptEditor.ProgramStart#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getProgramStart()
 * @model
 * @generated
 */
public interface ProgramStart extends AbstractElement
{
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
   * @see org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage#getProgramStart_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // ProgramStart
