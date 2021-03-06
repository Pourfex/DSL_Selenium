/*
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.imt.browserautomation.parser.antlr.internal.InternalBrowserAutomationParser;
import org.xtext.imt.browserautomation.services.BrowserAutomationGrammarAccess;

public class BrowserAutomationParser extends AbstractAntlrParser {

	@Inject
	private BrowserAutomationGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBrowserAutomationParser createParser(XtextTokenStream stream) {
		return new InternalBrowserAutomationParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Test";
	}

	public BrowserAutomationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BrowserAutomationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
