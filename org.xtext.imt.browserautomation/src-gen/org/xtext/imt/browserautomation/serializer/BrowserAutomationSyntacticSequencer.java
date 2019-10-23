/*
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.imt.browserautomation.services.BrowserAutomationGrammarAccess;

@SuppressWarnings("all")
public class BrowserAutomationSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BrowserAutomationGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BrowserAutomationGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBOOLRule())
			return getBOOLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPEN_BROWSERRule())
			return getOPEN_BROWSERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * BOOL:
	 * 	'TRUE'|'FALSE'
	 * ;
	 */
	protected String getBOOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "TRUE";
	}
	
	/**
	 * OPEN_BROWSER :
	 * 	'openBrowser'
	 * ;
	 */
	protected String getOPEN_BROWSERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "openBrowser";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}