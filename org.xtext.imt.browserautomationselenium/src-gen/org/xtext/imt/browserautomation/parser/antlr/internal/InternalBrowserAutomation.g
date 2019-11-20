/*
 * generated by Xtext 2.15.0
 */
grammar InternalBrowserAutomation;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.imt.browserautomation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.imt.browserautomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.imt.browserautomation.services.BrowserAutomationGrammarAccess;

}

@parser::members {

 	private BrowserAutomationGrammarAccess grammarAccess;

    public InternalBrowserAutomationParser(TokenStream input, BrowserAutomationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Test";
   	}

   	@Override
   	protected BrowserAutomationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	iv_ruleTest=ruleTest
	{ $current=$iv_ruleTest.current; }
	EOF;

// Rule Test
ruleTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestAccess().getTestAction_0(),
					$current);
			}
		)
		otherlv_1='Test'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getTestKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTestAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_3_0());
				}
				lv_instructions_3_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_3_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getAFFECTATIONParserRuleCall_0());
		}
		this_AFFECTATION_0=ruleAFFECTATION
		{
			$current = $this_AFFECTATION_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getOPEN_BROWSERParserRuleCall_1());
		}
		this_OPEN_BROWSER_1=ruleOPEN_BROWSER
		{
			$current = $this_OPEN_BROWSER_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getGO_TO_URLParserRuleCall_2());
		}
		this_GO_TO_URL_2=ruleGO_TO_URL
		{
			$current = $this_GO_TO_URL_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCLICK_ONParserRuleCall_3());
		}
		this_CLICK_ON_3=ruleCLICK_ON
		{
			$current = $this_CLICK_ON_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getVERIFY_THATParserRuleCall_4());
		}
		this_VERIFY_THAT_4=ruleVERIFY_THAT
		{
			$current = $this_VERIFY_THAT_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getINSERT_ONParserRuleCall_5());
		}
		this_INSERT_ON_5=ruleINSERT_ON
		{
			$current = $this_INSERT_ON_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCHECK_BOXEParserRuleCall_6());
		}
		this_CHECK_BOXE_6=ruleCHECK_BOXE
		{
			$current = $this_CHECK_BOXE_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCHOOSE_COMBOBOXParserRuleCall_7());
		}
		this_CHOOSE_COMBOBOX_7=ruleCHOOSE_COMBOBOX
		{
			$current = $this_CHOOSE_COMBOBOX_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getREAD_ONParserRuleCall_8());
		}
		this_READ_ON_8=ruleREAD_ON
		{
			$current = $this_READ_ON_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAFFECTATION
entryRuleAFFECTATION returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAFFECTATIONRule()); }
	iv_ruleAFFECTATION=ruleAFFECTATION
	{ $current=$iv_ruleAFFECTATION.current; }
	EOF;

// Rule AFFECTATION
ruleAFFECTATION returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getAFFECTATIONAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAFFECTATIONAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAFFECTATIONRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getAFFECTATIONAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAFFECTATIONAccess().getSelectorSELECTORParserRuleCall_3_0());
				}
				lv_selector_3_0=ruleSELECTOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAFFECTATIONRule());
					}
					set(
						$current,
						"selector",
						lv_selector_3_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.SELECTOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSELECTOR
entryRuleSELECTOR returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSELECTORRule()); }
	iv_ruleSELECTOR=ruleSELECTOR
	{ $current=$iv_ruleSELECTOR.current; }
	EOF;

// Rule SELECTOR
ruleSELECTOR returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='find'
		{
			newLeafNode(otherlv_0, grammarAccess.getSELECTORAccess().getFindKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSELECTORAccess().getReadableReadableParserRuleCall_1_0());
				}
				lv_readable_1_0=ruleReadable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSELECTORRule());
					}
					set(
						$current,
						"readable",
						lv_readable_1_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.Readable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSELECTORAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSELECTORAccess().getParamsPARAMSParserRuleCall_3_0());
				}
				lv_params_3_0=rulePARAMS
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSELECTORRule());
					}
					add(
						$current,
						"params",
						lv_params_3_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.PARAMS");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSELECTORAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5='['
		{
			newLeafNode(otherlv_5, grammarAccess.getSELECTORAccess().getLeftSquareBracketKeyword_5());
		}
		(
			(
				lv_number_6_0=RULE_INT
				{
					newLeafNode(lv_number_6_0, grammarAccess.getSELECTORAccess().getNumberINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSELECTORRule());
					}
					setWithLastConsumed(
						$current,
						"number",
						lv_number_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getSELECTORAccess().getRightSquareBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleRefElement
entryRuleRefElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefElementRule()); }
	iv_ruleRefElement=ruleRefElement
	{ $current=$iv_ruleRefElement.current; }
	EOF;

// Rule RefElement
ruleRefElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRefElementRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getRefElementAccess().getRefAFFECTATIONCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleOPEN_BROWSER
entryRuleOPEN_BROWSER returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOPEN_BROWSERRule()); }
	iv_ruleOPEN_BROWSER=ruleOPEN_BROWSER
	{ $current=$iv_ruleOPEN_BROWSER.current; }
	EOF;

// Rule OPEN_BROWSER
ruleOPEN_BROWSER returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOPEN_BROWSERAccess().getOPEN_BROWSERAction_0(),
					$current);
			}
		)
		otherlv_1='openBrowser'
		{
			newLeafNode(otherlv_1, grammarAccess.getOPEN_BROWSERAccess().getOpenBrowserKeyword_1());
		}
	)
;

// Entry rule entryRuleGO_TO_URL
entryRuleGO_TO_URL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGO_TO_URLRule()); }
	iv_ruleGO_TO_URL=ruleGO_TO_URL
	{ $current=$iv_ruleGO_TO_URL.current; }
	EOF;

// Rule GO_TO_URL
ruleGO_TO_URL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='openpage'
		{
			newLeafNode(otherlv_0, grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0());
		}
		(
			(
				lv_url_1_0=RULE_STRING
				{
					newLeafNode(lv_url_1_0, grammarAccess.getGO_TO_URLAccess().getUrlSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGO_TO_URLRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleCLICK_ON
entryRuleCLICK_ON returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCLICK_ONRule()); }
	iv_ruleCLICK_ON=ruleCLICK_ON
	{ $current=$iv_ruleCLICK_ON.current; }
	EOF;

// Rule CLICK_ON
ruleCLICK_ON returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='clickOn'
		{
			newLeafNode(otherlv_0, grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCLICK_ONAccess().getElementClickableParserRuleCall_1_0());
				}
				lv_element_1_0=ruleClickable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCLICK_ONRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.Clickable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVERIFY_THAT
entryRuleVERIFY_THAT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVERIFY_THATRule()); }
	iv_ruleVERIFY_THAT=ruleVERIFY_THAT
	{ $current=$iv_ruleVERIFY_THAT.current; }
	EOF;

// Rule VERIFY_THAT
ruleVERIFY_THAT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='verify'
		{
			newLeafNode(otherlv_0, grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVERIFY_THATAccess().getElementVerifiableParserRuleCall_1_0());
				}
				lv_element_1_0=ruleVerifiable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVERIFY_THATRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.Verifiable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleINSERT_ON
entryRuleINSERT_ON returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getINSERT_ONRule()); }
	iv_ruleINSERT_ON=ruleINSERT_ON
	{ $current=$iv_ruleINSERT_ON.current; }
	EOF;

// Rule INSERT_ON
ruleINSERT_ON returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='insert'
		{
			newLeafNode(otherlv_0, grammarAccess.getINSERT_ONAccess().getInsertKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getINSERT_ONAccess().getElementInsertableParserRuleCall_1_0());
				}
				lv_element_1_0=ruleInsertable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getINSERT_ONRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.Insertable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					lv_data_2_1=RULE_STRING
					{
						newLeafNode(lv_data_2_1, grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getINSERT_ONRule());
						}
						setWithLastConsumed(
							$current,
							"data",
							lv_data_2_1,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
					    |
					lv_data_2_2=RULE_ID
					{
						newLeafNode(lv_data_2_2, grammarAccess.getINSERT_ONAccess().getDataIDTerminalRuleCall_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getINSERT_ONRule());
						}
						setWithLastConsumed(
							$current,
							"data",
							lv_data_2_2,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCHECK_BOXE
entryRuleCHECK_BOXE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCHECK_BOXERule()); }
	iv_ruleCHECK_BOXE=ruleCHECK_BOXE
	{ $current=$iv_ruleCHECK_BOXE.current; }
	EOF;

// Rule CHECK_BOXE
ruleCHECK_BOXE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='uncheck'
			{
				newLeafNode(otherlv_0, grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0());
			}
			    |
			otherlv_1='check'
			{
				newLeafNode(otherlv_1, grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0_1());
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCHECK_BOXEAccess().getElementCHECKBOXParserRuleCall_1_0_0());
					}
					lv_element_2_0=ruleCHECKBOX
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCHECK_BOXERule());
						}
						add(
							$current,
							"element",
							lv_element_2_0,
							"org.xtext.imt.browserautomation.BrowserAutomation.CHECKBOX");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			    |
			otherlv_3='ALL'
			{
				newLeafNode(otherlv_3, grammarAccess.getCHECK_BOXEAccess().getALLKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleCHOOSE_COMBOBOX
entryRuleCHOOSE_COMBOBOX returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCHOOSE_COMBOBOXRule()); }
	iv_ruleCHOOSE_COMBOBOX=ruleCHOOSE_COMBOBOX
	{ $current=$iv_ruleCHOOSE_COMBOBOX.current; }
	EOF;

// Rule CHOOSE_COMBOBOX
ruleCHOOSE_COMBOBOX returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='choosecombo'
		{
			newLeafNode(otherlv_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementCOMBOBOXParserRuleCall_1_0());
				}
				lv_element_1_0=ruleCOMBOBOX
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCHOOSE_COMBOBOXRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.COMBOBOX");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				lv_data_3_0=RULE_STRING
				{
					newLeafNode(lv_data_3_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getDataSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCHOOSE_COMBOBOXRule());
					}
					setWithLastConsumed(
						$current,
						"data",
						lv_data_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getCHOOSE_COMBOBOXAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleREAD_ON
entryRuleREAD_ON returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getREAD_ONRule()); }
	iv_ruleREAD_ON=ruleREAD_ON
	{ $current=$iv_ruleREAD_ON.current; }
	EOF;

// Rule READ_ON
ruleREAD_ON returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='read'
		{
			newLeafNode(otherlv_0, grammarAccess.getREAD_ONAccess().getReadKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getREAD_ONAccess().getElementReadableParserRuleCall_1_0());
				}
				lv_element_1_0=ruleReadable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getREAD_ONRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"org.xtext.imt.browserautomation.BrowserAutomation.Readable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleReadable
entryRuleReadable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReadableRule()); }
	iv_ruleReadable=ruleReadable
	{ $current=$iv_ruleReadable.current; }
	EOF;

// Rule Readable
ruleReadable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getReadableAccess().getTEXTParserRuleCall_0());
		}
		this_TEXT_0=ruleTEXT
		{
			$current = $this_TEXT_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getReadableAccess().getBUTTONParserRuleCall_1());
		}
		this_BUTTON_1=ruleBUTTON
		{
			$current = $this_BUTTON_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getReadableAccess().getLINKParserRuleCall_2());
		}
		this_LINK_2=ruleLINK
		{
			$current = $this_LINK_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInsertable
entryRuleInsertable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsertableRule()); }
	iv_ruleInsertable=ruleInsertable
	{ $current=$iv_ruleInsertable.current; }
	EOF;

// Rule Insertable
ruleInsertable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getInsertableAccess().getSEARCH_FIELDParserRuleCall());
	}
	this_SEARCH_FIELD_0=ruleSEARCH_FIELD
	{
		$current = $this_SEARCH_FIELD_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVerifiable
entryRuleVerifiable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerifiableRule()); }
	iv_ruleVerifiable=ruleVerifiable
	{ $current=$iv_ruleVerifiable.current; }
	EOF;

// Rule Verifiable
ruleVerifiable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVerifiableAccess().getTEXTParserRuleCall_0());
		}
		this_TEXT_0=ruleTEXT
		{
			$current = $this_TEXT_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVerifiableAccess().getBUTTONParserRuleCall_1());
		}
		this_BUTTON_1=ruleBUTTON
		{
			$current = $this_BUTTON_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVerifiableAccess().getLINKParserRuleCall_2());
		}
		this_LINK_2=ruleLINK
		{
			$current = $this_LINK_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVerifiableAccess().getIMAGEParserRuleCall_3());
		}
		this_IMAGE_3=ruleIMAGE
		{
			$current = $this_IMAGE_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVerifiableAccess().getRefElementParserRuleCall_4());
		}
		this_RefElement_4=ruleRefElement
		{
			$current = $this_RefElement_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClickable
entryRuleClickable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClickableRule()); }
	iv_ruleClickable=ruleClickable
	{ $current=$iv_ruleClickable.current; }
	EOF;

// Rule Clickable
ruleClickable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getClickableAccess().getBUTTONParserRuleCall_0());
		}
		this_BUTTON_0=ruleBUTTON
		{
			$current = $this_BUTTON_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getClickableAccess().getLINKParserRuleCall_1());
		}
		this_LINK_1=ruleLINK
		{
			$current = $this_LINK_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getClickableAccess().getIMAGEParserRuleCall_2());
		}
		this_IMAGE_2=ruleIMAGE
		{
			$current = $this_IMAGE_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getClickableAccess().getCOMBOBOXParserRuleCall_3());
		}
		this_COMBOBOX_3=ruleCOMBOBOX
		{
			$current = $this_COMBOBOX_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getClickableAccess().getSEARCH_FIELDParserRuleCall_4());
		}
		this_SEARCH_FIELD_4=ruleSEARCH_FIELD
		{
			$current = $this_SEARCH_FIELD_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getClickableAccess().getRefElementParserRuleCall_5());
		}
		this_RefElement_5=ruleRefElement
		{
			$current = $this_RefElement_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCOMBOBOX
entryRuleCOMBOBOX returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCOMBOBOXRule()); }
	iv_ruleCOMBOBOX=ruleCOMBOBOX
	{ $current=$iv_ruleCOMBOBOX.current; }
	EOF;

// Rule COMBOBOX
ruleCOMBOBOX returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='combobox'
		{
			newLeafNode(otherlv_0, grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCOMBOBOXAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCOMBOBOXRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleCHECKBOX
entryRuleCHECKBOX returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCHECKBOXRule()); }
	iv_ruleCHECKBOX=ruleCHECKBOX
	{ $current=$iv_ruleCHECKBOX.current; }
	EOF;

// Rule CHECKBOX
ruleCHECKBOX returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='checkbox'
		{
			newLeafNode(otherlv_0, grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCHECKBOXAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCHECKBOXRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleSEARCH_FIELD
entryRuleSEARCH_FIELD returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSEARCH_FIELDRule()); }
	iv_ruleSEARCH_FIELD=ruleSEARCH_FIELD
	{ $current=$iv_ruleSEARCH_FIELD.current; }
	EOF;

// Rule SEARCH_FIELD
ruleSEARCH_FIELD returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='searchfield'
		{
			newLeafNode(otherlv_0, grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSEARCH_FIELDAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSEARCH_FIELDRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTEXT
entryRuleTEXT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTEXTRule()); }
	iv_ruleTEXT=ruleTEXT
	{ $current=$iv_ruleTEXT.current; }
	EOF;

// Rule TEXT
ruleTEXT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='text'
		{
			newLeafNode(otherlv_0, grammarAccess.getTEXTAccess().getTextKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTEXTAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTEXTRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleBUTTON
entryRuleBUTTON returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBUTTONRule()); }
	iv_ruleBUTTON=ruleBUTTON
	{ $current=$iv_ruleBUTTON.current; }
	EOF;

// Rule BUTTON
ruleBUTTON returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='button'
		{
			newLeafNode(otherlv_0, grammarAccess.getBUTTONAccess().getButtonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBUTTONAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBUTTONRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleLINK
entryRuleLINK returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLINKRule()); }
	iv_ruleLINK=ruleLINK
	{ $current=$iv_ruleLINK.current; }
	EOF;

// Rule LINK
ruleLINK returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='link'
		{
			newLeafNode(otherlv_0, grammarAccess.getLINKAccess().getLinkKeyword_0());
		}
		(
			(
				lv_url_1_0=RULE_STRING
				{
					newLeafNode(lv_url_1_0, grammarAccess.getLINKAccess().getUrlSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLINKRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleIMAGE
entryRuleIMAGE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIMAGERule()); }
	iv_ruleIMAGE=ruleIMAGE
	{ $current=$iv_ruleIMAGE.current; }
	EOF;

// Rule IMAGE
ruleIMAGE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='image'
		{
			newLeafNode(otherlv_0, grammarAccess.getIMAGEAccess().getImageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIMAGEAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIMAGERule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getIMAGEAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIMAGEAccess().getParamsPARAMSParserRuleCall_2_1_0());
					}
					lv_params_3_0=rulePARAMS
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIMAGERule());
						}
						add(
							$current,
							"params",
							lv_params_3_0,
							"org.xtext.imt.browserautomation.BrowserAutomation.PARAMS");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getIMAGEAccess().getRightCurlyBracketKeyword_2_2());
			}
		)*
	)
;

// Entry rule entryRulePARAMS
entryRulePARAMS returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPARAMSRule()); }
	iv_rulePARAMS=rulePARAMS
	{ $current=$iv_rulePARAMS.current; }
	EOF;

// Rule PARAMS
rulePARAMS returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_STRING
				{
					newLeafNode(lv_key_0_0, grammarAccess.getPARAMSAccess().getKeySTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPARAMSRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getPARAMSAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getPARAMSAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPARAMSRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
