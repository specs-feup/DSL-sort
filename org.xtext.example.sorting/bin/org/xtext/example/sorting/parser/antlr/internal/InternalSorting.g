/*
 * generated by Xtext 2.12.0
 */
grammar InternalSorting;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.sorting.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.sorting.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.sorting.services.SortingGrammarAccess;

}

@parser::members {

 	private SortingGrammarAccess grammarAccess;

    public InternalSortingParser(TokenStream input, SortingGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Config";
   	}

   	@Override
   	protected SortingGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleConfig
entryRuleConfig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigRule()); }
	iv_ruleConfig=ruleConfig
	{ $current=$iv_ruleConfig.current; }
	EOF;

// Rule Config
ruleConfig returns [EObject current=null]
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
					grammarAccess.getConfigAccess().getConfigAction_0(),
					$current);
			}
		)
		otherlv_1='config'
		{
			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='params'
			{
				newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getParamsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigAccess().getParamsParamParserRuleCall_4_2_0());
					}
					lv_params_6_0=ruleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigRule());
						}
						add(
							$current,
							"params",
							lv_params_6_0,
							"org.xtext.example.sorting.Sorting.Param");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
		(
			otherlv_8='imports'
			{
				newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getImportsKeyword_5_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigAccess().getImportsImportParserRuleCall_5_2_0());
					}
					lv_imports_10_0=ruleImport
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigRule());
						}
						add(
							$current,
							"imports",
							lv_imports_10_0,
							"org.xtext.example.sorting.Sorting.Import");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_5_3());
			}
		)?
		otherlv_12='components'
		{
			newLeafNode(otherlv_12, grammarAccess.getConfigAccess().getComponentsKeyword_6());
		}
		otherlv_13='{'
		{
			newLeafNode(otherlv_13, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_8_0());
				}
				lv_components_14_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigRule());
					}
					add(
						$current,
						"components",
						lv_components_14_0,
						"org.xtext.example.sorting.Sorting.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_16='instances'
		{
			newLeafNode(otherlv_16, grammarAccess.getConfigAccess().getInstancesKeyword_10());
		}
		otherlv_17='{'
		{
			newLeafNode(otherlv_17, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigAccess().getInstancesInstanceParserRuleCall_12_0());
				}
				lv_instances_18_0=ruleInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigRule());
					}
					add(
						$current,
						"instances",
						lv_instances_18_0,
						"org.xtext.example.sorting.Sorting.Instance");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_19='}'
		{
			newLeafNode(otherlv_19, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_20='transitions'
		{
			newLeafNode(otherlv_20, grammarAccess.getConfigAccess().getTransitionsKeyword_14());
		}
		otherlv_21='{'
		{
			newLeafNode(otherlv_21, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_16_0());
				}
				lv_transitions_22_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_22_0,
						"org.xtext.example.sorting.Sorting.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_17());
		}
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_18());
		}
	)
;

// Entry rule entryRuleParam
entryRuleParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamRule()); }
	iv_ruleParam=ruleParam
	{ $current=$iv_ruleParam.current; }
	EOF;

// Rule Param
ruleParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='param'
		{
			newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParamAccess().getValueAnythingParserRuleCall_2_0());
				}
				lv_value_2_0=ruleAnything
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParamRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.sorting.Sorting.Anything");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getParamAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleAnything
entryRuleAnything returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAnythingRule()); }
	iv_ruleAnything=ruleAnything
	{ $current=$iv_ruleAnything.current.getText(); }
	EOF;

// Rule Anything
ruleAnything returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getAnythingAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getAnythingAccess().getINTTerminalRuleCall_1());
		}
		    |
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getAnythingAccess().getSTRINGTerminalRuleCall_2());
		}
		    |
		this_WS_3=RULE_WS
		{
			$current.merge(this_WS_3);
		}
		{
			newLeafNode(this_WS_3, grammarAccess.getAnythingAccess().getWSTerminalRuleCall_3());
		}
		    |
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getLeftParenthesisKeyword_4());
		}
		    |
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getRightParenthesisKeyword_5());
		}
		    |
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getCommaKeyword_6());
		}
		    |
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getFullStopKeyword_7());
		}
		    |
		kw='!'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getExclamationMarkKeyword_8());
		}
		    |
		kw='?'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getQuestionMarkKeyword_9());
		}
		    |
		kw='['
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getLeftSquareBracketKeyword_10());
		}
		    |
		kw=']'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getRightSquareBracketKeyword_11());
		}
		    |
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getPlusSignKeyword_12());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getHyphenMinusKeyword_13());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getSolidusKeyword_14());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getAsteriskKeyword_15());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getLessThanSignKeyword_16());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getGreaterThanSignKeyword_17());
		}
		    |
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getColonKeyword_18());
		}
		    |
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getEqualsSignKeyword_19());
		}
		    |
		kw='%'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAnythingAccess().getPercentSignKeyword_20());
		}
	)+
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getNameAnythingParserRuleCall_1_0());
				}
				lv_name_1_0=ruleAnything
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.sorting.Sorting.Anything");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='port'
		{
			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPortAccess().getTypeAnythingParserRuleCall_3_0());
				}
				lv_type_3_0=ruleAnything
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.example.sorting.Sorting.Anything");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentAccess().getSourceParserRuleCall_0());
		}
		this_Source_0=ruleSource
		{
			$current = $this_Source_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getSinkParserRuleCall_1());
		}
		this_Sink_1=ruleSink
		{
			$current = $this_Sink_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getFilterParserRuleCall_2());
		}
		this_Filter_2=ruleFilter
		{
			$current = $this_Filter_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSource
entryRuleSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSourceRule()); }
	iv_ruleSource=ruleSource
	{ $current=$iv_ruleSource.current; }
	EOF;

// Rule Source
ruleSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='source'
		{
			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getSourceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='in:'
			{
				newLeafNode(otherlv_3, grammarAccess.getSourceAccess().getInKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSourceAccess().getInPortsPortParserRuleCall_3_1_0());
					}
					lv_inPorts_4_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSourceRule());
						}
						add(
							$current,
							"inPorts",
							lv_inPorts_4_0,
							"org.xtext.example.sorting.Sorting.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_5='out:'
		{
			newLeafNode(otherlv_5, grammarAccess.getSourceAccess().getOutKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSourceAccess().getOutPortsPortParserRuleCall_5_0());
				}
				lv_outPorts_6_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSourceRule());
					}
					add(
						$current,
						"outPorts",
						lv_outPorts_6_0,
						"org.xtext.example.sorting.Sorting.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='method:'
		{
			newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getMethodKeyword_6());
		}
		(
			(
				lv_code_8_0=RULE_CODE
				{
					newLeafNode(lv_code_8_0, grammarAccess.getSourceAccess().getCodeCODETerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_8_0,
						"org.xtext.example.sorting.Sorting.CODE");
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFilter
entryRuleFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterRule()); }
	iv_ruleFilter=ruleFilter
	{ $current=$iv_ruleFilter.current; }
	EOF;

// Rule Filter
ruleFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFilterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='in:'
		{
			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getInKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterAccess().getInPortsPortParserRuleCall_4_0());
				}
				lv_inPorts_4_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterRule());
					}
					add(
						$current,
						"inPorts",
						lv_inPorts_4_0,
						"org.xtext.example.sorting.Sorting.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='out:'
		{
			newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getOutKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterAccess().getOutPortsPortParserRuleCall_6_0());
				}
				lv_outPorts_6_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterRule());
					}
					add(
						$current,
						"outPorts",
						lv_outPorts_6_0,
						"org.xtext.example.sorting.Sorting.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='method:'
		{
			newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getMethodKeyword_7());
		}
		(
			(
				lv_code_8_0=RULE_CODE
				{
					newLeafNode(lv_code_8_0, grammarAccess.getFilterAccess().getCodeCODETerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFilterRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_8_0,
						"org.xtext.example.sorting.Sorting.CODE");
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleSink
entryRuleSink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSinkRule()); }
	iv_ruleSink=ruleSink
	{ $current=$iv_ruleSink.current; }
	EOF;

// Rule Sink
ruleSink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sink'
		{
			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSinkAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSinkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='in:'
		{
			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getInKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSinkAccess().getInPortsPortParserRuleCall_4_0());
				}
				lv_inPorts_4_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSinkRule());
					}
					add(
						$current,
						"inPorts",
						lv_inPorts_4_0,
						"org.xtext.example.sorting.Sorting.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_5='out:'
			{
				newLeafNode(otherlv_5, grammarAccess.getSinkAccess().getOutKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSinkAccess().getOutPortsPortParserRuleCall_5_1_0());
					}
					lv_outPorts_6_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSinkRule());
						}
						add(
							$current,
							"outPorts",
							lv_outPorts_6_0,
							"org.xtext.example.sorting.Sorting.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_7='method:'
		{
			newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getMethodKeyword_6());
		}
		(
			(
				lv_code_8_0=RULE_CODE
				{
					newLeafNode(lv_code_8_0, grammarAccess.getSinkAccess().getCodeCODETerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSinkRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_8_0,
						"org.xtext.example.sorting.Sorting.CODE");
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleInstance
entryRuleInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceRule()); }
	iv_ruleInstance=ruleInstance
	{ $current=$iv_ruleInstance.current; }
	EOF;

// Rule Instance
ruleInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_code_2_0=RULE_CODE
				{
					newLeafNode(lv_code_2_0, grammarAccess.getInstanceAccess().getCodeCODETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_2_0,
						"org.xtext.example.sorting.Sorting.CODE");
				}
			)
		)?
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getSourceInstanceCrossReference_1_0());
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getCommaKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSourcePortPortCrossReference_3_0());
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_4());
		}
		otherlv_5='->'
		{
			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
		}
		otherlv_6='['
		{
			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetInstanceCrossReference_7_0());
				}
			)
		)
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getCommaKeyword_8());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_9=RULE_ID
				{
					newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetPortPortCrossReference_9_0());
				}
			)
		)
		otherlv_10=']'
		{
			newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_10());
		}
	)
;

RULE_CODE : '/#' ( options {greedy=false;} : . )*'#/';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
