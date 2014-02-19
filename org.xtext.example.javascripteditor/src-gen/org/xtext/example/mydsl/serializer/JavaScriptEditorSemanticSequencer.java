package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.javaScriptEditor.Domainmodel;
import org.xtext.example.mydsl.javaScriptEditor.FunctionDeclaration;
import org.xtext.example.mydsl.javaScriptEditor.JavaScriptEditorPackage;
import org.xtext.example.mydsl.javaScriptEditor.ProgramStart;
import org.xtext.example.mydsl.javaScriptEditor.Type;
import org.xtext.example.mydsl.services.JavaScriptEditorGrammarAccess;

@SuppressWarnings("all")
public class JavaScriptEditorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JavaScriptEditorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JavaScriptEditorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JavaScriptEditorPackage.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case JavaScriptEditorPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionDeclarationRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case JavaScriptEditorPackage.PROGRAM_START:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getProgramStartRule()) {
					sequence_ProgramStart(context, (ProgramStart) semanticObject); 
					return; 
				}
				else break;
			case JavaScriptEditorPackage.TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_Domainmodel(EObject context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName arguments=ID? argument+=ID* elements+=AbstractElement* instructiuons+=Instructions*)
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_ProgramStart(EObject context, ProgramStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID element=ID?)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
