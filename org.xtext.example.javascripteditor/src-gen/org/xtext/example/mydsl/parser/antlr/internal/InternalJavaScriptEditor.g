/*
* generated by Xtext
*/
grammar InternalJavaScriptEditor;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.JavaScriptEditorGrammarAccess;

}

@parser::members {

 	private JavaScriptEditorGrammarAccess grammarAccess;
 	
    public InternalJavaScriptEditorParser(TokenStream input, JavaScriptEditorGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Domainmodel";	
   	}
   	
   	@Override
   	protected JavaScriptEditorGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDomainmodel
entryRuleDomainmodel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainmodelRule()); }
	 iv_ruleDomainmodel=ruleDomainmodel 
	 { $current=$iv_ruleDomainmodel.current; } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainmodelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	 iv_ruleAbstractElement=ruleAbstractElement 
	 { $current=$iv_ruleAbstractElement.current; } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getFunctionDeclarationParserRuleCall_0()); 
    }
    this_FunctionDeclaration_0=ruleFunctionDeclaration
    { 
        $current = $this_FunctionDeclaration_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
    }
    this_Type_1=ruleType
    { 
        $current = $this_Type_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getProgramStartParserRuleCall_2()); 
    }
    this_ProgramStart_2=ruleProgramStart
    { 
        $current = $this_ProgramStart_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleProgramStart
entryRuleProgramStart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramStartRule()); }
	 iv_ruleProgramStart=ruleProgramStart 
	 { $current=$iv_ruleProgramStart.current; } 
	 EOF 
;

// Rule ProgramStart
ruleProgramStart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<script>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProgramStartAccess().getScriptKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramStartAccess().getElementsAbstractElementParserRuleCall_1_0()); 
	    }
		lv_elements_1_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramStartRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_1_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='</script>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getProgramStartAccess().getScriptKeyword_2());
    }
)
;





// Entry rule entryRuleFunctionDeclaration
entryRuleFunctionDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionDeclarationRule()); }
	 iv_ruleFunctionDeclaration=ruleFunctionDeclaration 
	 { $current=$iv_ruleFunctionDeclaration.current; } 
	 EOF 
;

// Rule FunctionDeclaration
ruleFunctionDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='function' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2());
    }
(
(
		lv_arguments_3_0=RULE_ID
		{
			newLeafNode(lv_arguments_3_0, grammarAccess.getFunctionDeclarationAccess().getArgumentsIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"arguments",
        		lv_arguments_3_0, 
        		"ID");
	    }

)
)?(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_0());
    }
(
(
		lv_argument_5_0=RULE_ID
		{
			newLeafNode(lv_argument_5_0, grammarAccess.getFunctionDeclarationAccess().getArgumentIDTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionDeclarationRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"argument",
        		lv_argument_5_0, 
        		"ID");
	    }

)
))*	otherlv_6='){' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getElementsAbstractElementParserRuleCall_6_0()); 
	    }
		lv_elements_7_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_7_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getInstructiuonsInstructionsParserRuleCall_7_0()); 
	    }
		lv_instructiuons_8_0=ruleInstructions		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		add(
       			$current, 
       			"instructiuons",
        		lv_instructiuons_8_0, 
        		"Instructions");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='var' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getVarKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_0());
    }
(
(
		lv_element_3_0=RULE_ID
		{
			newLeafNode(lv_element_3_0, grammarAccess.getTypeAccess().getElementIDTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"element",
        		lv_element_3_0, 
        		"ID");
	    }

)
))?	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleInstructions
entryRuleInstructions returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getInstructionsRule()); } 
	 iv_ruleInstructions=ruleInstructions 
	 { $current=$iv_ruleInstructions.current.getText(); }  
	 EOF 
;

// Rule Instructions
ruleInstructions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getInstructionsAccess().getIDTerminalRuleCall_0()); 
    }

	kw=';' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInstructionsAccess().getSemicolonKeyword_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

