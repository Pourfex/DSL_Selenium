package org.xtext.imt.browserautomation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.imt.browserautomation.services.BrowserAutomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TRUE'", "'FALSE'", "'uncheck'", "'check'", "'ALL'", "'Test'", "'('", "'result='", "')'", "'end'", "'element'", "'='", "'find'", "'{'", "'}'", "'['", "']'", "'openBrowser'", "'openpage'", "'clickOn'", "'verify'", "'insert'", "'choosecombo'", "'read'", "'combobox'", "'checkbox'", "'searchfield'", "'text'", "'button'", "'link'", "'image'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBrowserAutomationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserAutomationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserAutomationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowserAutomation.g"; }


    	private BrowserAutomationGrammarAccess grammarAccess;

    	public void setGrammarAccess(BrowserAutomationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTest"
    // InternalBrowserAutomation.g:53:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:54:1: ( ruleTest EOF )
            // InternalBrowserAutomation.g:55:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserAutomation.g:62:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:66:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalBrowserAutomation.g:67:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalBrowserAutomation.g:67:2: ( ( rule__Test__Group__0 ) )
            // InternalBrowserAutomation.g:68:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalBrowserAutomation.g:69:3: ( rule__Test__Group__0 )
            // InternalBrowserAutomation.g:69:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleInstruction"
    // InternalBrowserAutomation.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:79:1: ( ruleInstruction EOF )
            // InternalBrowserAutomation.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBrowserAutomation.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalBrowserAutomation.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalBrowserAutomation.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalBrowserAutomation.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:94:3: ( rule__Instruction__Alternatives )
            // InternalBrowserAutomation.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAFFECTATION"
    // InternalBrowserAutomation.g:103:1: entryRuleAFFECTATION : ruleAFFECTATION EOF ;
    public final void entryRuleAFFECTATION() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:104:1: ( ruleAFFECTATION EOF )
            // InternalBrowserAutomation.g:105:1: ruleAFFECTATION EOF
            {
             before(grammarAccess.getAFFECTATIONRule()); 
            pushFollow(FOLLOW_1);
            ruleAFFECTATION();

            state._fsp--;

             after(grammarAccess.getAFFECTATIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAFFECTATION"


    // $ANTLR start "ruleAFFECTATION"
    // InternalBrowserAutomation.g:112:1: ruleAFFECTATION : ( ( rule__AFFECTATION__Group__0 ) ) ;
    public final void ruleAFFECTATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:116:2: ( ( ( rule__AFFECTATION__Group__0 ) ) )
            // InternalBrowserAutomation.g:117:2: ( ( rule__AFFECTATION__Group__0 ) )
            {
            // InternalBrowserAutomation.g:117:2: ( ( rule__AFFECTATION__Group__0 ) )
            // InternalBrowserAutomation.g:118:3: ( rule__AFFECTATION__Group__0 )
            {
             before(grammarAccess.getAFFECTATIONAccess().getGroup()); 
            // InternalBrowserAutomation.g:119:3: ( rule__AFFECTATION__Group__0 )
            // InternalBrowserAutomation.g:119:4: rule__AFFECTATION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AFFECTATION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAFFECTATIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAFFECTATION"


    // $ANTLR start "entryRuleSELECTOR"
    // InternalBrowserAutomation.g:128:1: entryRuleSELECTOR : ruleSELECTOR EOF ;
    public final void entryRuleSELECTOR() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:129:1: ( ruleSELECTOR EOF )
            // InternalBrowserAutomation.g:130:1: ruleSELECTOR EOF
            {
             before(grammarAccess.getSELECTORRule()); 
            pushFollow(FOLLOW_1);
            ruleSELECTOR();

            state._fsp--;

             after(grammarAccess.getSELECTORRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSELECTOR"


    // $ANTLR start "ruleSELECTOR"
    // InternalBrowserAutomation.g:137:1: ruleSELECTOR : ( ( rule__SELECTOR__Group__0 ) ) ;
    public final void ruleSELECTOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:141:2: ( ( ( rule__SELECTOR__Group__0 ) ) )
            // InternalBrowserAutomation.g:142:2: ( ( rule__SELECTOR__Group__0 ) )
            {
            // InternalBrowserAutomation.g:142:2: ( ( rule__SELECTOR__Group__0 ) )
            // InternalBrowserAutomation.g:143:3: ( rule__SELECTOR__Group__0 )
            {
             before(grammarAccess.getSELECTORAccess().getGroup()); 
            // InternalBrowserAutomation.g:144:3: ( rule__SELECTOR__Group__0 )
            // InternalBrowserAutomation.g:144:4: rule__SELECTOR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSELECTORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSELECTOR"


    // $ANTLR start "entryRuleRefElement"
    // InternalBrowserAutomation.g:153:1: entryRuleRefElement : ruleRefElement EOF ;
    public final void entryRuleRefElement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:154:1: ( ruleRefElement EOF )
            // InternalBrowserAutomation.g:155:1: ruleRefElement EOF
            {
             before(grammarAccess.getRefElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRefElement();

            state._fsp--;

             after(grammarAccess.getRefElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefElement"


    // $ANTLR start "ruleRefElement"
    // InternalBrowserAutomation.g:162:1: ruleRefElement : ( ( rule__RefElement__RefAssignment ) ) ;
    public final void ruleRefElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:166:2: ( ( ( rule__RefElement__RefAssignment ) ) )
            // InternalBrowserAutomation.g:167:2: ( ( rule__RefElement__RefAssignment ) )
            {
            // InternalBrowserAutomation.g:167:2: ( ( rule__RefElement__RefAssignment ) )
            // InternalBrowserAutomation.g:168:3: ( rule__RefElement__RefAssignment )
            {
             before(grammarAccess.getRefElementAccess().getRefAssignment()); 
            // InternalBrowserAutomation.g:169:3: ( rule__RefElement__RefAssignment )
            // InternalBrowserAutomation.g:169:4: rule__RefElement__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RefElement__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefElementAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefElement"


    // $ANTLR start "entryRuleBOOL"
    // InternalBrowserAutomation.g:178:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleBOOL EOF )
            // InternalBrowserAutomation.g:180:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalBrowserAutomation.g:187:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__BOOL__Alternatives ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__BOOL__Alternatives ) )
            // InternalBrowserAutomation.g:193:3: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:194:3: ( rule__BOOL__Alternatives )
            // InternalBrowserAutomation.g:194:4: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleOPEN_BROWSER"
    // InternalBrowserAutomation.g:203:1: entryRuleOPEN_BROWSER : ruleOPEN_BROWSER EOF ;
    public final void entryRuleOPEN_BROWSER() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleOPEN_BROWSER EOF )
            // InternalBrowserAutomation.g:205:1: ruleOPEN_BROWSER EOF
            {
             before(grammarAccess.getOPEN_BROWSERRule()); 
            pushFollow(FOLLOW_1);
            ruleOPEN_BROWSER();

            state._fsp--;

             after(grammarAccess.getOPEN_BROWSERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOPEN_BROWSER"


    // $ANTLR start "ruleOPEN_BROWSER"
    // InternalBrowserAutomation.g:212:1: ruleOPEN_BROWSER : ( ( rule__OPEN_BROWSER__Group__0 ) ) ;
    public final void ruleOPEN_BROWSER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__OPEN_BROWSER__Group__0 ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__OPEN_BROWSER__Group__0 ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__OPEN_BROWSER__Group__0 ) )
            // InternalBrowserAutomation.g:218:3: ( rule__OPEN_BROWSER__Group__0 )
            {
             before(grammarAccess.getOPEN_BROWSERAccess().getGroup()); 
            // InternalBrowserAutomation.g:219:3: ( rule__OPEN_BROWSER__Group__0 )
            // InternalBrowserAutomation.g:219:4: rule__OPEN_BROWSER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OPEN_BROWSER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOPEN_BROWSERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPEN_BROWSER"


    // $ANTLR start "entryRuleGO_TO_URL"
    // InternalBrowserAutomation.g:228:1: entryRuleGO_TO_URL : ruleGO_TO_URL EOF ;
    public final void entryRuleGO_TO_URL() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleGO_TO_URL EOF )
            // InternalBrowserAutomation.g:230:1: ruleGO_TO_URL EOF
            {
             before(grammarAccess.getGO_TO_URLRule()); 
            pushFollow(FOLLOW_1);
            ruleGO_TO_URL();

            state._fsp--;

             after(grammarAccess.getGO_TO_URLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGO_TO_URL"


    // $ANTLR start "ruleGO_TO_URL"
    // InternalBrowserAutomation.g:237:1: ruleGO_TO_URL : ( ( rule__GO_TO_URL__Group__0 ) ) ;
    public final void ruleGO_TO_URL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__GO_TO_URL__Group__0 ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__GO_TO_URL__Group__0 ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__GO_TO_URL__Group__0 ) )
            // InternalBrowserAutomation.g:243:3: ( rule__GO_TO_URL__Group__0 )
            {
             before(grammarAccess.getGO_TO_URLAccess().getGroup()); 
            // InternalBrowserAutomation.g:244:3: ( rule__GO_TO_URL__Group__0 )
            // InternalBrowserAutomation.g:244:4: rule__GO_TO_URL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GO_TO_URL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGO_TO_URLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGO_TO_URL"


    // $ANTLR start "entryRuleCLICK_ON"
    // InternalBrowserAutomation.g:253:1: entryRuleCLICK_ON : ruleCLICK_ON EOF ;
    public final void entryRuleCLICK_ON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleCLICK_ON EOF )
            // InternalBrowserAutomation.g:255:1: ruleCLICK_ON EOF
            {
             before(grammarAccess.getCLICK_ONRule()); 
            pushFollow(FOLLOW_1);
            ruleCLICK_ON();

            state._fsp--;

             after(grammarAccess.getCLICK_ONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCLICK_ON"


    // $ANTLR start "ruleCLICK_ON"
    // InternalBrowserAutomation.g:262:1: ruleCLICK_ON : ( ( rule__CLICK_ON__Group__0 ) ) ;
    public final void ruleCLICK_ON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__CLICK_ON__Group__0 ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__CLICK_ON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__CLICK_ON__Group__0 ) )
            // InternalBrowserAutomation.g:268:3: ( rule__CLICK_ON__Group__0 )
            {
             before(grammarAccess.getCLICK_ONAccess().getGroup()); 
            // InternalBrowserAutomation.g:269:3: ( rule__CLICK_ON__Group__0 )
            // InternalBrowserAutomation.g:269:4: rule__CLICK_ON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CLICK_ON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCLICK_ONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCLICK_ON"


    // $ANTLR start "entryRuleVERIFY_THAT"
    // InternalBrowserAutomation.g:278:1: entryRuleVERIFY_THAT : ruleVERIFY_THAT EOF ;
    public final void entryRuleVERIFY_THAT() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleVERIFY_THAT EOF )
            // InternalBrowserAutomation.g:280:1: ruleVERIFY_THAT EOF
            {
             before(grammarAccess.getVERIFY_THATRule()); 
            pushFollow(FOLLOW_1);
            ruleVERIFY_THAT();

            state._fsp--;

             after(grammarAccess.getVERIFY_THATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVERIFY_THAT"


    // $ANTLR start "ruleVERIFY_THAT"
    // InternalBrowserAutomation.g:287:1: ruleVERIFY_THAT : ( ( rule__VERIFY_THAT__Group__0 ) ) ;
    public final void ruleVERIFY_THAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__VERIFY_THAT__Group__0 ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__VERIFY_THAT__Group__0 ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__VERIFY_THAT__Group__0 ) )
            // InternalBrowserAutomation.g:293:3: ( rule__VERIFY_THAT__Group__0 )
            {
             before(grammarAccess.getVERIFY_THATAccess().getGroup()); 
            // InternalBrowserAutomation.g:294:3: ( rule__VERIFY_THAT__Group__0 )
            // InternalBrowserAutomation.g:294:4: rule__VERIFY_THAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_THAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_THATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVERIFY_THAT"


    // $ANTLR start "entryRuleINSERT_ON"
    // InternalBrowserAutomation.g:303:1: entryRuleINSERT_ON : ruleINSERT_ON EOF ;
    public final void entryRuleINSERT_ON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleINSERT_ON EOF )
            // InternalBrowserAutomation.g:305:1: ruleINSERT_ON EOF
            {
             before(grammarAccess.getINSERT_ONRule()); 
            pushFollow(FOLLOW_1);
            ruleINSERT_ON();

            state._fsp--;

             after(grammarAccess.getINSERT_ONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINSERT_ON"


    // $ANTLR start "ruleINSERT_ON"
    // InternalBrowserAutomation.g:312:1: ruleINSERT_ON : ( ( rule__INSERT_ON__Group__0 ) ) ;
    public final void ruleINSERT_ON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__INSERT_ON__Group__0 ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__INSERT_ON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__INSERT_ON__Group__0 ) )
            // InternalBrowserAutomation.g:318:3: ( rule__INSERT_ON__Group__0 )
            {
             before(grammarAccess.getINSERT_ONAccess().getGroup()); 
            // InternalBrowserAutomation.g:319:3: ( rule__INSERT_ON__Group__0 )
            // InternalBrowserAutomation.g:319:4: rule__INSERT_ON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INSERT_ON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINSERT_ONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINSERT_ON"


    // $ANTLR start "entryRuleCHECK_BOXE"
    // InternalBrowserAutomation.g:328:1: entryRuleCHECK_BOXE : ruleCHECK_BOXE EOF ;
    public final void entryRuleCHECK_BOXE() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleCHECK_BOXE EOF )
            // InternalBrowserAutomation.g:330:1: ruleCHECK_BOXE EOF
            {
             before(grammarAccess.getCHECK_BOXERule()); 
            pushFollow(FOLLOW_1);
            ruleCHECK_BOXE();

            state._fsp--;

             after(grammarAccess.getCHECK_BOXERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCHECK_BOXE"


    // $ANTLR start "ruleCHECK_BOXE"
    // InternalBrowserAutomation.g:337:1: ruleCHECK_BOXE : ( ( rule__CHECK_BOXE__Group__0 ) ) ;
    public final void ruleCHECK_BOXE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__CHECK_BOXE__Group__0 ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__CHECK_BOXE__Group__0 ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__CHECK_BOXE__Group__0 ) )
            // InternalBrowserAutomation.g:343:3: ( rule__CHECK_BOXE__Group__0 )
            {
             before(grammarAccess.getCHECK_BOXEAccess().getGroup()); 
            // InternalBrowserAutomation.g:344:3: ( rule__CHECK_BOXE__Group__0 )
            // InternalBrowserAutomation.g:344:4: rule__CHECK_BOXE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CHECK_BOXE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCHECK_BOXEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCHECK_BOXE"


    // $ANTLR start "entryRuleCHOOSE_COMBOBOX"
    // InternalBrowserAutomation.g:353:1: entryRuleCHOOSE_COMBOBOX : ruleCHOOSE_COMBOBOX EOF ;
    public final void entryRuleCHOOSE_COMBOBOX() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:354:1: ( ruleCHOOSE_COMBOBOX EOF )
            // InternalBrowserAutomation.g:355:1: ruleCHOOSE_COMBOBOX EOF
            {
             before(grammarAccess.getCHOOSE_COMBOBOXRule()); 
            pushFollow(FOLLOW_1);
            ruleCHOOSE_COMBOBOX();

            state._fsp--;

             after(grammarAccess.getCHOOSE_COMBOBOXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCHOOSE_COMBOBOX"


    // $ANTLR start "ruleCHOOSE_COMBOBOX"
    // InternalBrowserAutomation.g:362:1: ruleCHOOSE_COMBOBOX : ( ( rule__CHOOSE_COMBOBOX__Group__0 ) ) ;
    public final void ruleCHOOSE_COMBOBOX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:2: ( ( ( rule__CHOOSE_COMBOBOX__Group__0 ) ) )
            // InternalBrowserAutomation.g:367:2: ( ( rule__CHOOSE_COMBOBOX__Group__0 ) )
            {
            // InternalBrowserAutomation.g:367:2: ( ( rule__CHOOSE_COMBOBOX__Group__0 ) )
            // InternalBrowserAutomation.g:368:3: ( rule__CHOOSE_COMBOBOX__Group__0 )
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getGroup()); 
            // InternalBrowserAutomation.g:369:3: ( rule__CHOOSE_COMBOBOX__Group__0 )
            // InternalBrowserAutomation.g:369:4: rule__CHOOSE_COMBOBOX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCHOOSE_COMBOBOX"


    // $ANTLR start "entryRuleREAD_ON"
    // InternalBrowserAutomation.g:378:1: entryRuleREAD_ON : ruleREAD_ON EOF ;
    public final void entryRuleREAD_ON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:379:1: ( ruleREAD_ON EOF )
            // InternalBrowserAutomation.g:380:1: ruleREAD_ON EOF
            {
             before(grammarAccess.getREAD_ONRule()); 
            pushFollow(FOLLOW_1);
            ruleREAD_ON();

            state._fsp--;

             after(grammarAccess.getREAD_ONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREAD_ON"


    // $ANTLR start "ruleREAD_ON"
    // InternalBrowserAutomation.g:387:1: ruleREAD_ON : ( ( rule__READ_ON__Group__0 ) ) ;
    public final void ruleREAD_ON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:2: ( ( ( rule__READ_ON__Group__0 ) ) )
            // InternalBrowserAutomation.g:392:2: ( ( rule__READ_ON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:392:2: ( ( rule__READ_ON__Group__0 ) )
            // InternalBrowserAutomation.g:393:3: ( rule__READ_ON__Group__0 )
            {
             before(grammarAccess.getREAD_ONAccess().getGroup()); 
            // InternalBrowserAutomation.g:394:3: ( rule__READ_ON__Group__0 )
            // InternalBrowserAutomation.g:394:4: rule__READ_ON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__READ_ON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREAD_ONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREAD_ON"


    // $ANTLR start "entryRuleReadable"
    // InternalBrowserAutomation.g:403:1: entryRuleReadable : ruleReadable EOF ;
    public final void entryRuleReadable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:404:1: ( ruleReadable EOF )
            // InternalBrowserAutomation.g:405:1: ruleReadable EOF
            {
             before(grammarAccess.getReadableRule()); 
            pushFollow(FOLLOW_1);
            ruleReadable();

            state._fsp--;

             after(grammarAccess.getReadableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadable"


    // $ANTLR start "ruleReadable"
    // InternalBrowserAutomation.g:412:1: ruleReadable : ( ( rule__Readable__Alternatives ) ) ;
    public final void ruleReadable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:416:2: ( ( ( rule__Readable__Alternatives ) ) )
            // InternalBrowserAutomation.g:417:2: ( ( rule__Readable__Alternatives ) )
            {
            // InternalBrowserAutomation.g:417:2: ( ( rule__Readable__Alternatives ) )
            // InternalBrowserAutomation.g:418:3: ( rule__Readable__Alternatives )
            {
             before(grammarAccess.getReadableAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:419:3: ( rule__Readable__Alternatives )
            // InternalBrowserAutomation.g:419:4: rule__Readable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Readable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReadableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadable"


    // $ANTLR start "entryRuleInsertable"
    // InternalBrowserAutomation.g:428:1: entryRuleInsertable : ruleInsertable EOF ;
    public final void entryRuleInsertable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:429:1: ( ruleInsertable EOF )
            // InternalBrowserAutomation.g:430:1: ruleInsertable EOF
            {
             before(grammarAccess.getInsertableRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertable();

            state._fsp--;

             after(grammarAccess.getInsertableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsertable"


    // $ANTLR start "ruleInsertable"
    // InternalBrowserAutomation.g:437:1: ruleInsertable : ( ruleSEARCH_FIELD ) ;
    public final void ruleInsertable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:441:2: ( ( ruleSEARCH_FIELD ) )
            // InternalBrowserAutomation.g:442:2: ( ruleSEARCH_FIELD )
            {
            // InternalBrowserAutomation.g:442:2: ( ruleSEARCH_FIELD )
            // InternalBrowserAutomation.g:443:3: ruleSEARCH_FIELD
            {
             before(grammarAccess.getInsertableAccess().getSEARCH_FIELDParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSEARCH_FIELD();

            state._fsp--;

             after(grammarAccess.getInsertableAccess().getSEARCH_FIELDParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertable"


    // $ANTLR start "entryRuleVerifiable"
    // InternalBrowserAutomation.g:453:1: entryRuleVerifiable : ruleVerifiable EOF ;
    public final void entryRuleVerifiable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:454:1: ( ruleVerifiable EOF )
            // InternalBrowserAutomation.g:455:1: ruleVerifiable EOF
            {
             before(grammarAccess.getVerifiableRule()); 
            pushFollow(FOLLOW_1);
            ruleVerifiable();

            state._fsp--;

             after(grammarAccess.getVerifiableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerifiable"


    // $ANTLR start "ruleVerifiable"
    // InternalBrowserAutomation.g:462:1: ruleVerifiable : ( ( rule__Verifiable__Alternatives ) ) ;
    public final void ruleVerifiable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:466:2: ( ( ( rule__Verifiable__Alternatives ) ) )
            // InternalBrowserAutomation.g:467:2: ( ( rule__Verifiable__Alternatives ) )
            {
            // InternalBrowserAutomation.g:467:2: ( ( rule__Verifiable__Alternatives ) )
            // InternalBrowserAutomation.g:468:3: ( rule__Verifiable__Alternatives )
            {
             before(grammarAccess.getVerifiableAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:469:3: ( rule__Verifiable__Alternatives )
            // InternalBrowserAutomation.g:469:4: rule__Verifiable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Verifiable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerifiableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerifiable"


    // $ANTLR start "entryRuleClickable"
    // InternalBrowserAutomation.g:478:1: entryRuleClickable : ruleClickable EOF ;
    public final void entryRuleClickable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:479:1: ( ruleClickable EOF )
            // InternalBrowserAutomation.g:480:1: ruleClickable EOF
            {
             before(grammarAccess.getClickableRule()); 
            pushFollow(FOLLOW_1);
            ruleClickable();

            state._fsp--;

             after(grammarAccess.getClickableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClickable"


    // $ANTLR start "ruleClickable"
    // InternalBrowserAutomation.g:487:1: ruleClickable : ( ( rule__Clickable__Alternatives ) ) ;
    public final void ruleClickable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:491:2: ( ( ( rule__Clickable__Alternatives ) ) )
            // InternalBrowserAutomation.g:492:2: ( ( rule__Clickable__Alternatives ) )
            {
            // InternalBrowserAutomation.g:492:2: ( ( rule__Clickable__Alternatives ) )
            // InternalBrowserAutomation.g:493:3: ( rule__Clickable__Alternatives )
            {
             before(grammarAccess.getClickableAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:494:3: ( rule__Clickable__Alternatives )
            // InternalBrowserAutomation.g:494:4: rule__Clickable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Clickable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClickableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickable"


    // $ANTLR start "entryRuleCOMBOBOX"
    // InternalBrowserAutomation.g:503:1: entryRuleCOMBOBOX : ruleCOMBOBOX EOF ;
    public final void entryRuleCOMBOBOX() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:504:1: ( ruleCOMBOBOX EOF )
            // InternalBrowserAutomation.g:505:1: ruleCOMBOBOX EOF
            {
             before(grammarAccess.getCOMBOBOXRule()); 
            pushFollow(FOLLOW_1);
            ruleCOMBOBOX();

            state._fsp--;

             after(grammarAccess.getCOMBOBOXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOMBOBOX"


    // $ANTLR start "ruleCOMBOBOX"
    // InternalBrowserAutomation.g:512:1: ruleCOMBOBOX : ( ( rule__COMBOBOX__Group__0 ) ) ;
    public final void ruleCOMBOBOX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:516:2: ( ( ( rule__COMBOBOX__Group__0 ) ) )
            // InternalBrowserAutomation.g:517:2: ( ( rule__COMBOBOX__Group__0 ) )
            {
            // InternalBrowserAutomation.g:517:2: ( ( rule__COMBOBOX__Group__0 ) )
            // InternalBrowserAutomation.g:518:3: ( rule__COMBOBOX__Group__0 )
            {
             before(grammarAccess.getCOMBOBOXAccess().getGroup()); 
            // InternalBrowserAutomation.g:519:3: ( rule__COMBOBOX__Group__0 )
            // InternalBrowserAutomation.g:519:4: rule__COMBOBOX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__COMBOBOX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOMBOBOXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMBOBOX"


    // $ANTLR start "entryRuleCHECKBOX"
    // InternalBrowserAutomation.g:528:1: entryRuleCHECKBOX : ruleCHECKBOX EOF ;
    public final void entryRuleCHECKBOX() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:529:1: ( ruleCHECKBOX EOF )
            // InternalBrowserAutomation.g:530:1: ruleCHECKBOX EOF
            {
             before(grammarAccess.getCHECKBOXRule()); 
            pushFollow(FOLLOW_1);
            ruleCHECKBOX();

            state._fsp--;

             after(grammarAccess.getCHECKBOXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCHECKBOX"


    // $ANTLR start "ruleCHECKBOX"
    // InternalBrowserAutomation.g:537:1: ruleCHECKBOX : ( ( rule__CHECKBOX__Group__0 ) ) ;
    public final void ruleCHECKBOX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:541:2: ( ( ( rule__CHECKBOX__Group__0 ) ) )
            // InternalBrowserAutomation.g:542:2: ( ( rule__CHECKBOX__Group__0 ) )
            {
            // InternalBrowserAutomation.g:542:2: ( ( rule__CHECKBOX__Group__0 ) )
            // InternalBrowserAutomation.g:543:3: ( rule__CHECKBOX__Group__0 )
            {
             before(grammarAccess.getCHECKBOXAccess().getGroup()); 
            // InternalBrowserAutomation.g:544:3: ( rule__CHECKBOX__Group__0 )
            // InternalBrowserAutomation.g:544:4: rule__CHECKBOX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CHECKBOX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCHECKBOXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCHECKBOX"


    // $ANTLR start "entryRuleSEARCH_FIELD"
    // InternalBrowserAutomation.g:553:1: entryRuleSEARCH_FIELD : ruleSEARCH_FIELD EOF ;
    public final void entryRuleSEARCH_FIELD() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:554:1: ( ruleSEARCH_FIELD EOF )
            // InternalBrowserAutomation.g:555:1: ruleSEARCH_FIELD EOF
            {
             before(grammarAccess.getSEARCH_FIELDRule()); 
            pushFollow(FOLLOW_1);
            ruleSEARCH_FIELD();

            state._fsp--;

             after(grammarAccess.getSEARCH_FIELDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSEARCH_FIELD"


    // $ANTLR start "ruleSEARCH_FIELD"
    // InternalBrowserAutomation.g:562:1: ruleSEARCH_FIELD : ( ( rule__SEARCH_FIELD__Group__0 ) ) ;
    public final void ruleSEARCH_FIELD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:566:2: ( ( ( rule__SEARCH_FIELD__Group__0 ) ) )
            // InternalBrowserAutomation.g:567:2: ( ( rule__SEARCH_FIELD__Group__0 ) )
            {
            // InternalBrowserAutomation.g:567:2: ( ( rule__SEARCH_FIELD__Group__0 ) )
            // InternalBrowserAutomation.g:568:3: ( rule__SEARCH_FIELD__Group__0 )
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getGroup()); 
            // InternalBrowserAutomation.g:569:3: ( rule__SEARCH_FIELD__Group__0 )
            // InternalBrowserAutomation.g:569:4: rule__SEARCH_FIELD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SEARCH_FIELD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSEARCH_FIELDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEARCH_FIELD"


    // $ANTLR start "entryRuleTEXT"
    // InternalBrowserAutomation.g:578:1: entryRuleTEXT : ruleTEXT EOF ;
    public final void entryRuleTEXT() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:579:1: ( ruleTEXT EOF )
            // InternalBrowserAutomation.g:580:1: ruleTEXT EOF
            {
             before(grammarAccess.getTEXTRule()); 
            pushFollow(FOLLOW_1);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTEXTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // InternalBrowserAutomation.g:587:1: ruleTEXT : ( ( rule__TEXT__Group__0 ) ) ;
    public final void ruleTEXT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:591:2: ( ( ( rule__TEXT__Group__0 ) ) )
            // InternalBrowserAutomation.g:592:2: ( ( rule__TEXT__Group__0 ) )
            {
            // InternalBrowserAutomation.g:592:2: ( ( rule__TEXT__Group__0 ) )
            // InternalBrowserAutomation.g:593:3: ( rule__TEXT__Group__0 )
            {
             before(grammarAccess.getTEXTAccess().getGroup()); 
            // InternalBrowserAutomation.g:594:3: ( rule__TEXT__Group__0 )
            // InternalBrowserAutomation.g:594:4: rule__TEXT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TEXT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTEXTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTEXT"


    // $ANTLR start "entryRuleBUTTON"
    // InternalBrowserAutomation.g:603:1: entryRuleBUTTON : ruleBUTTON EOF ;
    public final void entryRuleBUTTON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:604:1: ( ruleBUTTON EOF )
            // InternalBrowserAutomation.g:605:1: ruleBUTTON EOF
            {
             before(grammarAccess.getBUTTONRule()); 
            pushFollow(FOLLOW_1);
            ruleBUTTON();

            state._fsp--;

             after(grammarAccess.getBUTTONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBUTTON"


    // $ANTLR start "ruleBUTTON"
    // InternalBrowserAutomation.g:612:1: ruleBUTTON : ( ( rule__BUTTON__Group__0 ) ) ;
    public final void ruleBUTTON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:616:2: ( ( ( rule__BUTTON__Group__0 ) ) )
            // InternalBrowserAutomation.g:617:2: ( ( rule__BUTTON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:617:2: ( ( rule__BUTTON__Group__0 ) )
            // InternalBrowserAutomation.g:618:3: ( rule__BUTTON__Group__0 )
            {
             before(grammarAccess.getBUTTONAccess().getGroup()); 
            // InternalBrowserAutomation.g:619:3: ( rule__BUTTON__Group__0 )
            // InternalBrowserAutomation.g:619:4: rule__BUTTON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BUTTON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBUTTONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBUTTON"


    // $ANTLR start "entryRuleLINK"
    // InternalBrowserAutomation.g:628:1: entryRuleLINK : ruleLINK EOF ;
    public final void entryRuleLINK() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:629:1: ( ruleLINK EOF )
            // InternalBrowserAutomation.g:630:1: ruleLINK EOF
            {
             before(grammarAccess.getLINKRule()); 
            pushFollow(FOLLOW_1);
            ruleLINK();

            state._fsp--;

             after(grammarAccess.getLINKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLINK"


    // $ANTLR start "ruleLINK"
    // InternalBrowserAutomation.g:637:1: ruleLINK : ( ( rule__LINK__Group__0 ) ) ;
    public final void ruleLINK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:641:2: ( ( ( rule__LINK__Group__0 ) ) )
            // InternalBrowserAutomation.g:642:2: ( ( rule__LINK__Group__0 ) )
            {
            // InternalBrowserAutomation.g:642:2: ( ( rule__LINK__Group__0 ) )
            // InternalBrowserAutomation.g:643:3: ( rule__LINK__Group__0 )
            {
             before(grammarAccess.getLINKAccess().getGroup()); 
            // InternalBrowserAutomation.g:644:3: ( rule__LINK__Group__0 )
            // InternalBrowserAutomation.g:644:4: rule__LINK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LINK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLINKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLINK"


    // $ANTLR start "entryRuleIMAGE"
    // InternalBrowserAutomation.g:653:1: entryRuleIMAGE : ruleIMAGE EOF ;
    public final void entryRuleIMAGE() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:654:1: ( ruleIMAGE EOF )
            // InternalBrowserAutomation.g:655:1: ruleIMAGE EOF
            {
             before(grammarAccess.getIMAGERule()); 
            pushFollow(FOLLOW_1);
            ruleIMAGE();

            state._fsp--;

             after(grammarAccess.getIMAGERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIMAGE"


    // $ANTLR start "ruleIMAGE"
    // InternalBrowserAutomation.g:662:1: ruleIMAGE : ( ( rule__IMAGE__Group__0 ) ) ;
    public final void ruleIMAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:666:2: ( ( ( rule__IMAGE__Group__0 ) ) )
            // InternalBrowserAutomation.g:667:2: ( ( rule__IMAGE__Group__0 ) )
            {
            // InternalBrowserAutomation.g:667:2: ( ( rule__IMAGE__Group__0 ) )
            // InternalBrowserAutomation.g:668:3: ( rule__IMAGE__Group__0 )
            {
             before(grammarAccess.getIMAGEAccess().getGroup()); 
            // InternalBrowserAutomation.g:669:3: ( rule__IMAGE__Group__0 )
            // InternalBrowserAutomation.g:669:4: rule__IMAGE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIMAGEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIMAGE"


    // $ANTLR start "entryRulePARAMS"
    // InternalBrowserAutomation.g:678:1: entryRulePARAMS : rulePARAMS EOF ;
    public final void entryRulePARAMS() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:679:1: ( rulePARAMS EOF )
            // InternalBrowserAutomation.g:680:1: rulePARAMS EOF
            {
             before(grammarAccess.getPARAMSRule()); 
            pushFollow(FOLLOW_1);
            rulePARAMS();

            state._fsp--;

             after(grammarAccess.getPARAMSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePARAMS"


    // $ANTLR start "rulePARAMS"
    // InternalBrowserAutomation.g:687:1: rulePARAMS : ( ( rule__PARAMS__Group__0 ) ) ;
    public final void rulePARAMS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:691:2: ( ( ( rule__PARAMS__Group__0 ) ) )
            // InternalBrowserAutomation.g:692:2: ( ( rule__PARAMS__Group__0 ) )
            {
            // InternalBrowserAutomation.g:692:2: ( ( rule__PARAMS__Group__0 ) )
            // InternalBrowserAutomation.g:693:3: ( rule__PARAMS__Group__0 )
            {
             before(grammarAccess.getPARAMSAccess().getGroup()); 
            // InternalBrowserAutomation.g:694:3: ( rule__PARAMS__Group__0 )
            // InternalBrowserAutomation.g:694:4: rule__PARAMS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PARAMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPARAMSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePARAMS"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalBrowserAutomation.g:702:1: rule__Instruction__Alternatives : ( ( ruleAFFECTATION ) | ( ruleOPEN_BROWSER ) | ( ruleGO_TO_URL ) | ( ruleCLICK_ON ) | ( ruleVERIFY_THAT ) | ( ruleINSERT_ON ) | ( ruleCHECK_BOXE ) | ( ruleCHOOSE_COMBOBOX ) | ( ruleREAD_ON ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:706:1: ( ( ruleAFFECTATION ) | ( ruleOPEN_BROWSER ) | ( ruleGO_TO_URL ) | ( ruleCLICK_ON ) | ( ruleVERIFY_THAT ) | ( ruleINSERT_ON ) | ( ruleCHECK_BOXE ) | ( ruleCHOOSE_COMBOBOX ) | ( ruleREAD_ON ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            case 13:
            case 14:
                {
                alt1=7;
                }
                break;
            case 33:
                {
                alt1=8;
                }
                break;
            case 34:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBrowserAutomation.g:707:2: ( ruleAFFECTATION )
                    {
                    // InternalBrowserAutomation.g:707:2: ( ruleAFFECTATION )
                    // InternalBrowserAutomation.g:708:3: ruleAFFECTATION
                    {
                     before(grammarAccess.getInstructionAccess().getAFFECTATIONParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAFFECTATION();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAFFECTATIONParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:713:2: ( ruleOPEN_BROWSER )
                    {
                    // InternalBrowserAutomation.g:713:2: ( ruleOPEN_BROWSER )
                    // InternalBrowserAutomation.g:714:3: ruleOPEN_BROWSER
                    {
                     before(grammarAccess.getInstructionAccess().getOPEN_BROWSERParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOPEN_BROWSER();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getOPEN_BROWSERParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:719:2: ( ruleGO_TO_URL )
                    {
                    // InternalBrowserAutomation.g:719:2: ( ruleGO_TO_URL )
                    // InternalBrowserAutomation.g:720:3: ruleGO_TO_URL
                    {
                     before(grammarAccess.getInstructionAccess().getGO_TO_URLParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGO_TO_URL();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGO_TO_URLParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:725:2: ( ruleCLICK_ON )
                    {
                    // InternalBrowserAutomation.g:725:2: ( ruleCLICK_ON )
                    // InternalBrowserAutomation.g:726:3: ruleCLICK_ON
                    {
                     before(grammarAccess.getInstructionAccess().getCLICK_ONParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCLICK_ON();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCLICK_ONParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:731:2: ( ruleVERIFY_THAT )
                    {
                    // InternalBrowserAutomation.g:731:2: ( ruleVERIFY_THAT )
                    // InternalBrowserAutomation.g:732:3: ruleVERIFY_THAT
                    {
                     before(grammarAccess.getInstructionAccess().getVERIFY_THATParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVERIFY_THAT();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVERIFY_THATParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:737:2: ( ruleINSERT_ON )
                    {
                    // InternalBrowserAutomation.g:737:2: ( ruleINSERT_ON )
                    // InternalBrowserAutomation.g:738:3: ruleINSERT_ON
                    {
                     before(grammarAccess.getInstructionAccess().getINSERT_ONParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleINSERT_ON();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getINSERT_ONParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:743:2: ( ruleCHECK_BOXE )
                    {
                    // InternalBrowserAutomation.g:743:2: ( ruleCHECK_BOXE )
                    // InternalBrowserAutomation.g:744:3: ruleCHECK_BOXE
                    {
                     before(grammarAccess.getInstructionAccess().getCHECK_BOXEParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCHECK_BOXE();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCHECK_BOXEParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:749:2: ( ruleCHOOSE_COMBOBOX )
                    {
                    // InternalBrowserAutomation.g:749:2: ( ruleCHOOSE_COMBOBOX )
                    // InternalBrowserAutomation.g:750:3: ruleCHOOSE_COMBOBOX
                    {
                     before(grammarAccess.getInstructionAccess().getCHOOSE_COMBOBOXParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleCHOOSE_COMBOBOX();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCHOOSE_COMBOBOXParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBrowserAutomation.g:755:2: ( ruleREAD_ON )
                    {
                    // InternalBrowserAutomation.g:755:2: ( ruleREAD_ON )
                    // InternalBrowserAutomation.g:756:3: ruleREAD_ON
                    {
                     before(grammarAccess.getInstructionAccess().getREAD_ONParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleREAD_ON();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getREAD_ONParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // InternalBrowserAutomation.g:765:1: rule__BOOL__Alternatives : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:769:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:770:2: ( 'TRUE' )
                    {
                    // InternalBrowserAutomation.g:770:2: ( 'TRUE' )
                    // InternalBrowserAutomation.g:771:3: 'TRUE'
                    {
                     before(grammarAccess.getBOOLAccess().getTRUEKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getTRUEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:776:2: ( 'FALSE' )
                    {
                    // InternalBrowserAutomation.g:776:2: ( 'FALSE' )
                    // InternalBrowserAutomation.g:777:3: 'FALSE'
                    {
                     before(grammarAccess.getBOOLAccess().getFALSEKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__INSERT_ON__DataAlternatives_2_0"
    // InternalBrowserAutomation.g:786:1: rule__INSERT_ON__DataAlternatives_2_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__INSERT_ON__DataAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:790:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:791:2: ( RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:791:2: ( RULE_STRING )
                    // InternalBrowserAutomation.g:792:3: RULE_STRING
                    {
                     before(grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:797:2: ( RULE_ID )
                    {
                    // InternalBrowserAutomation.g:797:2: ( RULE_ID )
                    // InternalBrowserAutomation.g:798:3: RULE_ID
                    {
                     before(grammarAccess.getINSERT_ONAccess().getDataIDTerminalRuleCall_2_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getINSERT_ONAccess().getDataIDTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__DataAlternatives_2_0"


    // $ANTLR start "rule__CHECK_BOXE__Alternatives_0"
    // InternalBrowserAutomation.g:807:1: rule__CHECK_BOXE__Alternatives_0 : ( ( 'uncheck' ) | ( 'check' ) );
    public final void rule__CHECK_BOXE__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:811:1: ( ( 'uncheck' ) | ( 'check' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:812:2: ( 'uncheck' )
                    {
                    // InternalBrowserAutomation.g:812:2: ( 'uncheck' )
                    // InternalBrowserAutomation.g:813:3: 'uncheck'
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:818:2: ( 'check' )
                    {
                    // InternalBrowserAutomation.g:818:2: ( 'check' )
                    // InternalBrowserAutomation.g:819:3: 'check'
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__Alternatives_0"


    // $ANTLR start "rule__CHECK_BOXE__Alternatives_1"
    // InternalBrowserAutomation.g:828:1: rule__CHECK_BOXE__Alternatives_1 : ( ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* ) | ( 'ALL' ) );
    public final void rule__CHECK_BOXE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:832:1: ( ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* ) | ( 'ALL' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EOF||(LA6_0>=13 && LA6_0<=14)||(LA6_0>=20 && LA6_0<=21)||(LA6_0>=28 && LA6_0<=34)||LA6_0==36) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomation.g:833:2: ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* )
                    {
                    // InternalBrowserAutomation.g:833:2: ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* )
                    // InternalBrowserAutomation.g:834:3: ( rule__CHECK_BOXE__ElementAssignment_1_0 )*
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getElementAssignment_1_0()); 
                    // InternalBrowserAutomation.g:835:3: ( rule__CHECK_BOXE__ElementAssignment_1_0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==36) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBrowserAutomation.g:835:4: rule__CHECK_BOXE__ElementAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__CHECK_BOXE__ElementAssignment_1_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getCHECK_BOXEAccess().getElementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:839:2: ( 'ALL' )
                    {
                    // InternalBrowserAutomation.g:839:2: ( 'ALL' )
                    // InternalBrowserAutomation.g:840:3: 'ALL'
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getALLKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCHECK_BOXEAccess().getALLKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__Alternatives_1"


    // $ANTLR start "rule__Readable__Alternatives"
    // InternalBrowserAutomation.g:849:1: rule__Readable__Alternatives : ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) );
    public final void rule__Readable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:853:1: ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case 40:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:854:2: ( ruleTEXT )
                    {
                    // InternalBrowserAutomation.g:854:2: ( ruleTEXT )
                    // InternalBrowserAutomation.g:855:3: ruleTEXT
                    {
                     before(grammarAccess.getReadableAccess().getTEXTParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTEXT();

                    state._fsp--;

                     after(grammarAccess.getReadableAccess().getTEXTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:860:2: ( ruleBUTTON )
                    {
                    // InternalBrowserAutomation.g:860:2: ( ruleBUTTON )
                    // InternalBrowserAutomation.g:861:3: ruleBUTTON
                    {
                     before(grammarAccess.getReadableAccess().getBUTTONParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBUTTON();

                    state._fsp--;

                     after(grammarAccess.getReadableAccess().getBUTTONParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:866:2: ( ruleLINK )
                    {
                    // InternalBrowserAutomation.g:866:2: ( ruleLINK )
                    // InternalBrowserAutomation.g:867:3: ruleLINK
                    {
                     before(grammarAccess.getReadableAccess().getLINKParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLINK();

                    state._fsp--;

                     after(grammarAccess.getReadableAccess().getLINKParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Readable__Alternatives"


    // $ANTLR start "rule__Verifiable__Alternatives"
    // InternalBrowserAutomation.g:876:1: rule__Verifiable__Alternatives : ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleRefElement ) );
    public final void rule__Verifiable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:880:1: ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleRefElement ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:881:2: ( ruleTEXT )
                    {
                    // InternalBrowserAutomation.g:881:2: ( ruleTEXT )
                    // InternalBrowserAutomation.g:882:3: ruleTEXT
                    {
                     before(grammarAccess.getVerifiableAccess().getTEXTParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTEXT();

                    state._fsp--;

                     after(grammarAccess.getVerifiableAccess().getTEXTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:887:2: ( ruleBUTTON )
                    {
                    // InternalBrowserAutomation.g:887:2: ( ruleBUTTON )
                    // InternalBrowserAutomation.g:888:3: ruleBUTTON
                    {
                     before(grammarAccess.getVerifiableAccess().getBUTTONParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBUTTON();

                    state._fsp--;

                     after(grammarAccess.getVerifiableAccess().getBUTTONParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:893:2: ( ruleLINK )
                    {
                    // InternalBrowserAutomation.g:893:2: ( ruleLINK )
                    // InternalBrowserAutomation.g:894:3: ruleLINK
                    {
                     before(grammarAccess.getVerifiableAccess().getLINKParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLINK();

                    state._fsp--;

                     after(grammarAccess.getVerifiableAccess().getLINKParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:899:2: ( ruleIMAGE )
                    {
                    // InternalBrowserAutomation.g:899:2: ( ruleIMAGE )
                    // InternalBrowserAutomation.g:900:3: ruleIMAGE
                    {
                     before(grammarAccess.getVerifiableAccess().getIMAGEParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIMAGE();

                    state._fsp--;

                     after(grammarAccess.getVerifiableAccess().getIMAGEParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:905:2: ( ruleRefElement )
                    {
                    // InternalBrowserAutomation.g:905:2: ( ruleRefElement )
                    // InternalBrowserAutomation.g:906:3: ruleRefElement
                    {
                     before(grammarAccess.getVerifiableAccess().getRefElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRefElement();

                    state._fsp--;

                     after(grammarAccess.getVerifiableAccess().getRefElementParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verifiable__Alternatives"


    // $ANTLR start "rule__Clickable__Alternatives"
    // InternalBrowserAutomation.g:915:1: rule__Clickable__Alternatives : ( ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleCOMBOBOX ) | ( ruleRefElement ) );
    public final void rule__Clickable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:919:1: ( ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleCOMBOBOX ) | ( ruleRefElement ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBrowserAutomation.g:920:2: ( ruleBUTTON )
                    {
                    // InternalBrowserAutomation.g:920:2: ( ruleBUTTON )
                    // InternalBrowserAutomation.g:921:3: ruleBUTTON
                    {
                     before(grammarAccess.getClickableAccess().getBUTTONParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBUTTON();

                    state._fsp--;

                     after(grammarAccess.getClickableAccess().getBUTTONParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:926:2: ( ruleLINK )
                    {
                    // InternalBrowserAutomation.g:926:2: ( ruleLINK )
                    // InternalBrowserAutomation.g:927:3: ruleLINK
                    {
                     before(grammarAccess.getClickableAccess().getLINKParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLINK();

                    state._fsp--;

                     after(grammarAccess.getClickableAccess().getLINKParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:932:2: ( ruleIMAGE )
                    {
                    // InternalBrowserAutomation.g:932:2: ( ruleIMAGE )
                    // InternalBrowserAutomation.g:933:3: ruleIMAGE
                    {
                     before(grammarAccess.getClickableAccess().getIMAGEParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIMAGE();

                    state._fsp--;

                     after(grammarAccess.getClickableAccess().getIMAGEParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:938:2: ( ruleCOMBOBOX )
                    {
                    // InternalBrowserAutomation.g:938:2: ( ruleCOMBOBOX )
                    // InternalBrowserAutomation.g:939:3: ruleCOMBOBOX
                    {
                     before(grammarAccess.getClickableAccess().getCOMBOBOXParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCOMBOBOX();

                    state._fsp--;

                     after(grammarAccess.getClickableAccess().getCOMBOBOXParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:944:2: ( ruleRefElement )
                    {
                    // InternalBrowserAutomation.g:944:2: ( ruleRefElement )
                    // InternalBrowserAutomation.g:945:3: ruleRefElement
                    {
                     before(grammarAccess.getClickableAccess().getRefElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRefElement();

                    state._fsp--;

                     after(grammarAccess.getClickableAccess().getRefElementParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clickable__Alternatives"


    // $ANTLR start "rule__Test__Group__0"
    // InternalBrowserAutomation.g:954:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:958:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserAutomation.g:959:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalBrowserAutomation.g:966:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:970:1: ( ( () ) )
            // InternalBrowserAutomation.g:971:1: ( () )
            {
            // InternalBrowserAutomation.g:971:1: ( () )
            // InternalBrowserAutomation.g:972:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalBrowserAutomation.g:973:2: ()
            // InternalBrowserAutomation.g:973:3: 
            {
            }

             after(grammarAccess.getTestAccess().getTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalBrowserAutomation.g:981:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:985:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserAutomation.g:986:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalBrowserAutomation.g:993:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:997:1: ( ( 'Test' ) )
            // InternalBrowserAutomation.g:998:1: ( 'Test' )
            {
            // InternalBrowserAutomation.g:998:1: ( 'Test' )
            // InternalBrowserAutomation.g:999:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalBrowserAutomation.g:1008:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1012:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalBrowserAutomation.g:1013:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalBrowserAutomation.g:1020:1: rule__Test__Group__2__Impl : ( ( rule__Test__NameAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1024:1: ( ( ( rule__Test__NameAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1025:1: ( ( rule__Test__NameAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1025:1: ( ( rule__Test__NameAssignment_2 ) )
            // InternalBrowserAutomation.g:1026:2: ( rule__Test__NameAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_2()); 
            // InternalBrowserAutomation.g:1027:2: ( rule__Test__NameAssignment_2 )
            // InternalBrowserAutomation.g:1027:3: rule__Test__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalBrowserAutomation.g:1035:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1039:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalBrowserAutomation.g:1040:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalBrowserAutomation.g:1047:1: rule__Test__Group__3__Impl : ( '(' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1051:1: ( ( '(' ) )
            // InternalBrowserAutomation.g:1052:1: ( '(' )
            {
            // InternalBrowserAutomation.g:1052:1: ( '(' )
            // InternalBrowserAutomation.g:1053:2: '('
            {
             before(grammarAccess.getTestAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalBrowserAutomation.g:1062:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1066:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalBrowserAutomation.g:1067:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalBrowserAutomation.g:1074:1: rule__Test__Group__4__Impl : ( 'result=' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1078:1: ( ( 'result=' ) )
            // InternalBrowserAutomation.g:1079:1: ( 'result=' )
            {
            // InternalBrowserAutomation.g:1079:1: ( 'result=' )
            // InternalBrowserAutomation.g:1080:2: 'result='
            {
             before(grammarAccess.getTestAccess().getResultKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getResultKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalBrowserAutomation.g:1089:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1093:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalBrowserAutomation.g:1094:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalBrowserAutomation.g:1101:1: rule__Test__Group__5__Impl : ( ( rule__Test__ResultAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1105:1: ( ( ( rule__Test__ResultAssignment_5 ) ) )
            // InternalBrowserAutomation.g:1106:1: ( ( rule__Test__ResultAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:1106:1: ( ( rule__Test__ResultAssignment_5 ) )
            // InternalBrowserAutomation.g:1107:2: ( rule__Test__ResultAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getResultAssignment_5()); 
            // InternalBrowserAutomation.g:1108:2: ( rule__Test__ResultAssignment_5 )
            // InternalBrowserAutomation.g:1108:3: rule__Test__ResultAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Test__ResultAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getResultAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalBrowserAutomation.g:1116:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1120:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalBrowserAutomation.g:1121:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalBrowserAutomation.g:1128:1: rule__Test__Group__6__Impl : ( ')' ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1132:1: ( ( ')' ) )
            // InternalBrowserAutomation.g:1133:1: ( ')' )
            {
            // InternalBrowserAutomation.g:1133:1: ( ')' )
            // InternalBrowserAutomation.g:1134:2: ')'
            {
             before(grammarAccess.getTestAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalBrowserAutomation.g:1143:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1147:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalBrowserAutomation.g:1148:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalBrowserAutomation.g:1155:1: rule__Test__Group__7__Impl : ( ( rule__Test__InstructionsAssignment_7 )* ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1159:1: ( ( ( rule__Test__InstructionsAssignment_7 )* ) )
            // InternalBrowserAutomation.g:1160:1: ( ( rule__Test__InstructionsAssignment_7 )* )
            {
            // InternalBrowserAutomation.g:1160:1: ( ( rule__Test__InstructionsAssignment_7 )* )
            // InternalBrowserAutomation.g:1161:2: ( rule__Test__InstructionsAssignment_7 )*
            {
             before(grammarAccess.getTestAccess().getInstructionsAssignment_7()); 
            // InternalBrowserAutomation.g:1162:2: ( rule__Test__InstructionsAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)||LA10_0==21||(LA10_0>=28 && LA10_0<=34)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBrowserAutomation.g:1162:3: rule__Test__InstructionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Test__InstructionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getInstructionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalBrowserAutomation.g:1170:1: rule__Test__Group__8 : rule__Test__Group__8__Impl ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1174:1: ( rule__Test__Group__8__Impl )
            // InternalBrowserAutomation.g:1175:2: rule__Test__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalBrowserAutomation.g:1181:1: rule__Test__Group__8__Impl : ( 'end' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1185:1: ( ( 'end' ) )
            // InternalBrowserAutomation.g:1186:1: ( 'end' )
            {
            // InternalBrowserAutomation.g:1186:1: ( 'end' )
            // InternalBrowserAutomation.g:1187:2: 'end'
            {
             before(grammarAccess.getTestAccess().getEndKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEndKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__AFFECTATION__Group__0"
    // InternalBrowserAutomation.g:1197:1: rule__AFFECTATION__Group__0 : rule__AFFECTATION__Group__0__Impl rule__AFFECTATION__Group__1 ;
    public final void rule__AFFECTATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1201:1: ( rule__AFFECTATION__Group__0__Impl rule__AFFECTATION__Group__1 )
            // InternalBrowserAutomation.g:1202:2: rule__AFFECTATION__Group__0__Impl rule__AFFECTATION__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AFFECTATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AFFECTATION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__0"


    // $ANTLR start "rule__AFFECTATION__Group__0__Impl"
    // InternalBrowserAutomation.g:1209:1: rule__AFFECTATION__Group__0__Impl : ( 'element' ) ;
    public final void rule__AFFECTATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1213:1: ( ( 'element' ) )
            // InternalBrowserAutomation.g:1214:1: ( 'element' )
            {
            // InternalBrowserAutomation.g:1214:1: ( 'element' )
            // InternalBrowserAutomation.g:1215:2: 'element'
            {
             before(grammarAccess.getAFFECTATIONAccess().getElementKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAFFECTATIONAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__0__Impl"


    // $ANTLR start "rule__AFFECTATION__Group__1"
    // InternalBrowserAutomation.g:1224:1: rule__AFFECTATION__Group__1 : rule__AFFECTATION__Group__1__Impl rule__AFFECTATION__Group__2 ;
    public final void rule__AFFECTATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1228:1: ( rule__AFFECTATION__Group__1__Impl rule__AFFECTATION__Group__2 )
            // InternalBrowserAutomation.g:1229:2: rule__AFFECTATION__Group__1__Impl rule__AFFECTATION__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AFFECTATION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AFFECTATION__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__1"


    // $ANTLR start "rule__AFFECTATION__Group__1__Impl"
    // InternalBrowserAutomation.g:1236:1: rule__AFFECTATION__Group__1__Impl : ( ( rule__AFFECTATION__NameAssignment_1 ) ) ;
    public final void rule__AFFECTATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1240:1: ( ( ( rule__AFFECTATION__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1241:1: ( ( rule__AFFECTATION__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1241:1: ( ( rule__AFFECTATION__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:1242:2: ( rule__AFFECTATION__NameAssignment_1 )
            {
             before(grammarAccess.getAFFECTATIONAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:1243:2: ( rule__AFFECTATION__NameAssignment_1 )
            // InternalBrowserAutomation.g:1243:3: rule__AFFECTATION__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AFFECTATION__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAFFECTATIONAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__1__Impl"


    // $ANTLR start "rule__AFFECTATION__Group__2"
    // InternalBrowserAutomation.g:1251:1: rule__AFFECTATION__Group__2 : rule__AFFECTATION__Group__2__Impl rule__AFFECTATION__Group__3 ;
    public final void rule__AFFECTATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1255:1: ( rule__AFFECTATION__Group__2__Impl rule__AFFECTATION__Group__3 )
            // InternalBrowserAutomation.g:1256:2: rule__AFFECTATION__Group__2__Impl rule__AFFECTATION__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AFFECTATION__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AFFECTATION__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__2"


    // $ANTLR start "rule__AFFECTATION__Group__2__Impl"
    // InternalBrowserAutomation.g:1263:1: rule__AFFECTATION__Group__2__Impl : ( '=' ) ;
    public final void rule__AFFECTATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1267:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:1268:1: ( '=' )
            {
            // InternalBrowserAutomation.g:1268:1: ( '=' )
            // InternalBrowserAutomation.g:1269:2: '='
            {
             before(grammarAccess.getAFFECTATIONAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAFFECTATIONAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__2__Impl"


    // $ANTLR start "rule__AFFECTATION__Group__3"
    // InternalBrowserAutomation.g:1278:1: rule__AFFECTATION__Group__3 : rule__AFFECTATION__Group__3__Impl ;
    public final void rule__AFFECTATION__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1282:1: ( rule__AFFECTATION__Group__3__Impl )
            // InternalBrowserAutomation.g:1283:2: rule__AFFECTATION__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AFFECTATION__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__3"


    // $ANTLR start "rule__AFFECTATION__Group__3__Impl"
    // InternalBrowserAutomation.g:1289:1: rule__AFFECTATION__Group__3__Impl : ( ( rule__AFFECTATION__SelectorAssignment_3 ) ) ;
    public final void rule__AFFECTATION__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1293:1: ( ( ( rule__AFFECTATION__SelectorAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1294:1: ( ( rule__AFFECTATION__SelectorAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1294:1: ( ( rule__AFFECTATION__SelectorAssignment_3 ) )
            // InternalBrowserAutomation.g:1295:2: ( rule__AFFECTATION__SelectorAssignment_3 )
            {
             before(grammarAccess.getAFFECTATIONAccess().getSelectorAssignment_3()); 
            // InternalBrowserAutomation.g:1296:2: ( rule__AFFECTATION__SelectorAssignment_3 )
            // InternalBrowserAutomation.g:1296:3: rule__AFFECTATION__SelectorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AFFECTATION__SelectorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAFFECTATIONAccess().getSelectorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__Group__3__Impl"


    // $ANTLR start "rule__SELECTOR__Group__0"
    // InternalBrowserAutomation.g:1305:1: rule__SELECTOR__Group__0 : rule__SELECTOR__Group__0__Impl rule__SELECTOR__Group__1 ;
    public final void rule__SELECTOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1309:1: ( rule__SELECTOR__Group__0__Impl rule__SELECTOR__Group__1 )
            // InternalBrowserAutomation.g:1310:2: rule__SELECTOR__Group__0__Impl rule__SELECTOR__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SELECTOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__0"


    // $ANTLR start "rule__SELECTOR__Group__0__Impl"
    // InternalBrowserAutomation.g:1317:1: rule__SELECTOR__Group__0__Impl : ( 'find' ) ;
    public final void rule__SELECTOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1321:1: ( ( 'find' ) )
            // InternalBrowserAutomation.g:1322:1: ( 'find' )
            {
            // InternalBrowserAutomation.g:1322:1: ( 'find' )
            // InternalBrowserAutomation.g:1323:2: 'find'
            {
             before(grammarAccess.getSELECTORAccess().getFindKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSELECTORAccess().getFindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__0__Impl"


    // $ANTLR start "rule__SELECTOR__Group__1"
    // InternalBrowserAutomation.g:1332:1: rule__SELECTOR__Group__1 : rule__SELECTOR__Group__1__Impl rule__SELECTOR__Group__2 ;
    public final void rule__SELECTOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1336:1: ( rule__SELECTOR__Group__1__Impl rule__SELECTOR__Group__2 )
            // InternalBrowserAutomation.g:1337:2: rule__SELECTOR__Group__1__Impl rule__SELECTOR__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SELECTOR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__1"


    // $ANTLR start "rule__SELECTOR__Group__1__Impl"
    // InternalBrowserAutomation.g:1344:1: rule__SELECTOR__Group__1__Impl : ( ruleReadable ) ;
    public final void rule__SELECTOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1348:1: ( ( ruleReadable ) )
            // InternalBrowserAutomation.g:1349:1: ( ruleReadable )
            {
            // InternalBrowserAutomation.g:1349:1: ( ruleReadable )
            // InternalBrowserAutomation.g:1350:2: ruleReadable
            {
             before(grammarAccess.getSELECTORAccess().getReadableParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleReadable();

            state._fsp--;

             after(grammarAccess.getSELECTORAccess().getReadableParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__1__Impl"


    // $ANTLR start "rule__SELECTOR__Group__2"
    // InternalBrowserAutomation.g:1359:1: rule__SELECTOR__Group__2 : rule__SELECTOR__Group__2__Impl rule__SELECTOR__Group__3 ;
    public final void rule__SELECTOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1363:1: ( rule__SELECTOR__Group__2__Impl rule__SELECTOR__Group__3 )
            // InternalBrowserAutomation.g:1364:2: rule__SELECTOR__Group__2__Impl rule__SELECTOR__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SELECTOR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__2"


    // $ANTLR start "rule__SELECTOR__Group__2__Impl"
    // InternalBrowserAutomation.g:1371:1: rule__SELECTOR__Group__2__Impl : ( '{' ) ;
    public final void rule__SELECTOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1375:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:1376:1: ( '{' )
            {
            // InternalBrowserAutomation.g:1376:1: ( '{' )
            // InternalBrowserAutomation.g:1377:2: '{'
            {
             before(grammarAccess.getSELECTORAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSELECTORAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__2__Impl"


    // $ANTLR start "rule__SELECTOR__Group__3"
    // InternalBrowserAutomation.g:1386:1: rule__SELECTOR__Group__3 : rule__SELECTOR__Group__3__Impl rule__SELECTOR__Group__4 ;
    public final void rule__SELECTOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1390:1: ( rule__SELECTOR__Group__3__Impl rule__SELECTOR__Group__4 )
            // InternalBrowserAutomation.g:1391:2: rule__SELECTOR__Group__3__Impl rule__SELECTOR__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__SELECTOR__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__3"


    // $ANTLR start "rule__SELECTOR__Group__3__Impl"
    // InternalBrowserAutomation.g:1398:1: rule__SELECTOR__Group__3__Impl : ( ( rule__SELECTOR__ParamsAssignment_3 ) ) ;
    public final void rule__SELECTOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1402:1: ( ( ( rule__SELECTOR__ParamsAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1403:1: ( ( rule__SELECTOR__ParamsAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1403:1: ( ( rule__SELECTOR__ParamsAssignment_3 ) )
            // InternalBrowserAutomation.g:1404:2: ( rule__SELECTOR__ParamsAssignment_3 )
            {
             before(grammarAccess.getSELECTORAccess().getParamsAssignment_3()); 
            // InternalBrowserAutomation.g:1405:2: ( rule__SELECTOR__ParamsAssignment_3 )
            // InternalBrowserAutomation.g:1405:3: rule__SELECTOR__ParamsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SELECTOR__ParamsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSELECTORAccess().getParamsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__3__Impl"


    // $ANTLR start "rule__SELECTOR__Group__4"
    // InternalBrowserAutomation.g:1413:1: rule__SELECTOR__Group__4 : rule__SELECTOR__Group__4__Impl rule__SELECTOR__Group__5 ;
    public final void rule__SELECTOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1417:1: ( rule__SELECTOR__Group__4__Impl rule__SELECTOR__Group__5 )
            // InternalBrowserAutomation.g:1418:2: rule__SELECTOR__Group__4__Impl rule__SELECTOR__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__SELECTOR__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__4"


    // $ANTLR start "rule__SELECTOR__Group__4__Impl"
    // InternalBrowserAutomation.g:1425:1: rule__SELECTOR__Group__4__Impl : ( '}' ) ;
    public final void rule__SELECTOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1429:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:1430:1: ( '}' )
            {
            // InternalBrowserAutomation.g:1430:1: ( '}' )
            // InternalBrowserAutomation.g:1431:2: '}'
            {
             before(grammarAccess.getSELECTORAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSELECTORAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__4__Impl"


    // $ANTLR start "rule__SELECTOR__Group__5"
    // InternalBrowserAutomation.g:1440:1: rule__SELECTOR__Group__5 : rule__SELECTOR__Group__5__Impl rule__SELECTOR__Group__6 ;
    public final void rule__SELECTOR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1444:1: ( rule__SELECTOR__Group__5__Impl rule__SELECTOR__Group__6 )
            // InternalBrowserAutomation.g:1445:2: rule__SELECTOR__Group__5__Impl rule__SELECTOR__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__SELECTOR__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__5"


    // $ANTLR start "rule__SELECTOR__Group__5__Impl"
    // InternalBrowserAutomation.g:1452:1: rule__SELECTOR__Group__5__Impl : ( '[' ) ;
    public final void rule__SELECTOR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1456:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:1457:1: ( '[' )
            {
            // InternalBrowserAutomation.g:1457:1: ( '[' )
            // InternalBrowserAutomation.g:1458:2: '['
            {
             before(grammarAccess.getSELECTORAccess().getLeftSquareBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSELECTORAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__5__Impl"


    // $ANTLR start "rule__SELECTOR__Group__6"
    // InternalBrowserAutomation.g:1467:1: rule__SELECTOR__Group__6 : rule__SELECTOR__Group__6__Impl rule__SELECTOR__Group__7 ;
    public final void rule__SELECTOR__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1471:1: ( rule__SELECTOR__Group__6__Impl rule__SELECTOR__Group__7 )
            // InternalBrowserAutomation.g:1472:2: rule__SELECTOR__Group__6__Impl rule__SELECTOR__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__SELECTOR__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__6"


    // $ANTLR start "rule__SELECTOR__Group__6__Impl"
    // InternalBrowserAutomation.g:1479:1: rule__SELECTOR__Group__6__Impl : ( ( rule__SELECTOR__NumberAssignment_6 ) ) ;
    public final void rule__SELECTOR__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1483:1: ( ( ( rule__SELECTOR__NumberAssignment_6 ) ) )
            // InternalBrowserAutomation.g:1484:1: ( ( rule__SELECTOR__NumberAssignment_6 ) )
            {
            // InternalBrowserAutomation.g:1484:1: ( ( rule__SELECTOR__NumberAssignment_6 ) )
            // InternalBrowserAutomation.g:1485:2: ( rule__SELECTOR__NumberAssignment_6 )
            {
             before(grammarAccess.getSELECTORAccess().getNumberAssignment_6()); 
            // InternalBrowserAutomation.g:1486:2: ( rule__SELECTOR__NumberAssignment_6 )
            // InternalBrowserAutomation.g:1486:3: rule__SELECTOR__NumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SELECTOR__NumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSELECTORAccess().getNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__6__Impl"


    // $ANTLR start "rule__SELECTOR__Group__7"
    // InternalBrowserAutomation.g:1494:1: rule__SELECTOR__Group__7 : rule__SELECTOR__Group__7__Impl ;
    public final void rule__SELECTOR__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1498:1: ( rule__SELECTOR__Group__7__Impl )
            // InternalBrowserAutomation.g:1499:2: rule__SELECTOR__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SELECTOR__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__7"


    // $ANTLR start "rule__SELECTOR__Group__7__Impl"
    // InternalBrowserAutomation.g:1505:1: rule__SELECTOR__Group__7__Impl : ( ']' ) ;
    public final void rule__SELECTOR__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1509:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:1510:1: ( ']' )
            {
            // InternalBrowserAutomation.g:1510:1: ( ']' )
            // InternalBrowserAutomation.g:1511:2: ']'
            {
             before(grammarAccess.getSELECTORAccess().getRightSquareBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSELECTORAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__Group__7__Impl"


    // $ANTLR start "rule__OPEN_BROWSER__Group__0"
    // InternalBrowserAutomation.g:1521:1: rule__OPEN_BROWSER__Group__0 : rule__OPEN_BROWSER__Group__0__Impl rule__OPEN_BROWSER__Group__1 ;
    public final void rule__OPEN_BROWSER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1525:1: ( rule__OPEN_BROWSER__Group__0__Impl rule__OPEN_BROWSER__Group__1 )
            // InternalBrowserAutomation.g:1526:2: rule__OPEN_BROWSER__Group__0__Impl rule__OPEN_BROWSER__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OPEN_BROWSER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OPEN_BROWSER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN_BROWSER__Group__0"


    // $ANTLR start "rule__OPEN_BROWSER__Group__0__Impl"
    // InternalBrowserAutomation.g:1533:1: rule__OPEN_BROWSER__Group__0__Impl : ( () ) ;
    public final void rule__OPEN_BROWSER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1537:1: ( ( () ) )
            // InternalBrowserAutomation.g:1538:1: ( () )
            {
            // InternalBrowserAutomation.g:1538:1: ( () )
            // InternalBrowserAutomation.g:1539:2: ()
            {
             before(grammarAccess.getOPEN_BROWSERAccess().getOPEN_BROWSERAction_0()); 
            // InternalBrowserAutomation.g:1540:2: ()
            // InternalBrowserAutomation.g:1540:3: 
            {
            }

             after(grammarAccess.getOPEN_BROWSERAccess().getOPEN_BROWSERAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN_BROWSER__Group__0__Impl"


    // $ANTLR start "rule__OPEN_BROWSER__Group__1"
    // InternalBrowserAutomation.g:1548:1: rule__OPEN_BROWSER__Group__1 : rule__OPEN_BROWSER__Group__1__Impl ;
    public final void rule__OPEN_BROWSER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1552:1: ( rule__OPEN_BROWSER__Group__1__Impl )
            // InternalBrowserAutomation.g:1553:2: rule__OPEN_BROWSER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OPEN_BROWSER__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN_BROWSER__Group__1"


    // $ANTLR start "rule__OPEN_BROWSER__Group__1__Impl"
    // InternalBrowserAutomation.g:1559:1: rule__OPEN_BROWSER__Group__1__Impl : ( 'openBrowser' ) ;
    public final void rule__OPEN_BROWSER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1563:1: ( ( 'openBrowser' ) )
            // InternalBrowserAutomation.g:1564:1: ( 'openBrowser' )
            {
            // InternalBrowserAutomation.g:1564:1: ( 'openBrowser' )
            // InternalBrowserAutomation.g:1565:2: 'openBrowser'
            {
             before(grammarAccess.getOPEN_BROWSERAccess().getOpenBrowserKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOPEN_BROWSERAccess().getOpenBrowserKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN_BROWSER__Group__1__Impl"


    // $ANTLR start "rule__GO_TO_URL__Group__0"
    // InternalBrowserAutomation.g:1575:1: rule__GO_TO_URL__Group__0 : rule__GO_TO_URL__Group__0__Impl rule__GO_TO_URL__Group__1 ;
    public final void rule__GO_TO_URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1579:1: ( rule__GO_TO_URL__Group__0__Impl rule__GO_TO_URL__Group__1 )
            // InternalBrowserAutomation.g:1580:2: rule__GO_TO_URL__Group__0__Impl rule__GO_TO_URL__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GO_TO_URL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GO_TO_URL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GO_TO_URL__Group__0"


    // $ANTLR start "rule__GO_TO_URL__Group__0__Impl"
    // InternalBrowserAutomation.g:1587:1: rule__GO_TO_URL__Group__0__Impl : ( 'openpage' ) ;
    public final void rule__GO_TO_URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1591:1: ( ( 'openpage' ) )
            // InternalBrowserAutomation.g:1592:1: ( 'openpage' )
            {
            // InternalBrowserAutomation.g:1592:1: ( 'openpage' )
            // InternalBrowserAutomation.g:1593:2: 'openpage'
            {
             before(grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GO_TO_URL__Group__0__Impl"


    // $ANTLR start "rule__GO_TO_URL__Group__1"
    // InternalBrowserAutomation.g:1602:1: rule__GO_TO_URL__Group__1 : rule__GO_TO_URL__Group__1__Impl ;
    public final void rule__GO_TO_URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1606:1: ( rule__GO_TO_URL__Group__1__Impl )
            // InternalBrowserAutomation.g:1607:2: rule__GO_TO_URL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GO_TO_URL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GO_TO_URL__Group__1"


    // $ANTLR start "rule__GO_TO_URL__Group__1__Impl"
    // InternalBrowserAutomation.g:1613:1: rule__GO_TO_URL__Group__1__Impl : ( ( rule__GO_TO_URL__UrlAssignment_1 ) ) ;
    public final void rule__GO_TO_URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1617:1: ( ( ( rule__GO_TO_URL__UrlAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1618:1: ( ( rule__GO_TO_URL__UrlAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1618:1: ( ( rule__GO_TO_URL__UrlAssignment_1 ) )
            // InternalBrowserAutomation.g:1619:2: ( rule__GO_TO_URL__UrlAssignment_1 )
            {
             before(grammarAccess.getGO_TO_URLAccess().getUrlAssignment_1()); 
            // InternalBrowserAutomation.g:1620:2: ( rule__GO_TO_URL__UrlAssignment_1 )
            // InternalBrowserAutomation.g:1620:3: rule__GO_TO_URL__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GO_TO_URL__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGO_TO_URLAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GO_TO_URL__Group__1__Impl"


    // $ANTLR start "rule__CLICK_ON__Group__0"
    // InternalBrowserAutomation.g:1629:1: rule__CLICK_ON__Group__0 : rule__CLICK_ON__Group__0__Impl rule__CLICK_ON__Group__1 ;
    public final void rule__CLICK_ON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1633:1: ( rule__CLICK_ON__Group__0__Impl rule__CLICK_ON__Group__1 )
            // InternalBrowserAutomation.g:1634:2: rule__CLICK_ON__Group__0__Impl rule__CLICK_ON__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CLICK_ON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLICK_ON__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK_ON__Group__0"


    // $ANTLR start "rule__CLICK_ON__Group__0__Impl"
    // InternalBrowserAutomation.g:1641:1: rule__CLICK_ON__Group__0__Impl : ( 'clickOn' ) ;
    public final void rule__CLICK_ON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1645:1: ( ( 'clickOn' ) )
            // InternalBrowserAutomation.g:1646:1: ( 'clickOn' )
            {
            // InternalBrowserAutomation.g:1646:1: ( 'clickOn' )
            // InternalBrowserAutomation.g:1647:2: 'clickOn'
            {
             before(grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK_ON__Group__0__Impl"


    // $ANTLR start "rule__CLICK_ON__Group__1"
    // InternalBrowserAutomation.g:1656:1: rule__CLICK_ON__Group__1 : rule__CLICK_ON__Group__1__Impl ;
    public final void rule__CLICK_ON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1660:1: ( rule__CLICK_ON__Group__1__Impl )
            // InternalBrowserAutomation.g:1661:2: rule__CLICK_ON__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CLICK_ON__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK_ON__Group__1"


    // $ANTLR start "rule__CLICK_ON__Group__1__Impl"
    // InternalBrowserAutomation.g:1667:1: rule__CLICK_ON__Group__1__Impl : ( ( rule__CLICK_ON__ElementAssignment_1 ) ) ;
    public final void rule__CLICK_ON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1671:1: ( ( ( rule__CLICK_ON__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1672:1: ( ( rule__CLICK_ON__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1672:1: ( ( rule__CLICK_ON__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1673:2: ( rule__CLICK_ON__ElementAssignment_1 )
            {
             before(grammarAccess.getCLICK_ONAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1674:2: ( rule__CLICK_ON__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1674:3: rule__CLICK_ON__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CLICK_ON__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCLICK_ONAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK_ON__Group__1__Impl"


    // $ANTLR start "rule__VERIFY_THAT__Group__0"
    // InternalBrowserAutomation.g:1683:1: rule__VERIFY_THAT__Group__0 : rule__VERIFY_THAT__Group__0__Impl rule__VERIFY_THAT__Group__1 ;
    public final void rule__VERIFY_THAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1687:1: ( rule__VERIFY_THAT__Group__0__Impl rule__VERIFY_THAT__Group__1 )
            // InternalBrowserAutomation.g:1688:2: rule__VERIFY_THAT__Group__0__Impl rule__VERIFY_THAT__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VERIFY_THAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_THAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY_THAT__Group__0"


    // $ANTLR start "rule__VERIFY_THAT__Group__0__Impl"
    // InternalBrowserAutomation.g:1695:1: rule__VERIFY_THAT__Group__0__Impl : ( 'verify' ) ;
    public final void rule__VERIFY_THAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1699:1: ( ( 'verify' ) )
            // InternalBrowserAutomation.g:1700:1: ( 'verify' )
            {
            // InternalBrowserAutomation.g:1700:1: ( 'verify' )
            // InternalBrowserAutomation.g:1701:2: 'verify'
            {
             before(grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY_THAT__Group__0__Impl"


    // $ANTLR start "rule__VERIFY_THAT__Group__1"
    // InternalBrowserAutomation.g:1710:1: rule__VERIFY_THAT__Group__1 : rule__VERIFY_THAT__Group__1__Impl ;
    public final void rule__VERIFY_THAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1714:1: ( rule__VERIFY_THAT__Group__1__Impl )
            // InternalBrowserAutomation.g:1715:2: rule__VERIFY_THAT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_THAT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY_THAT__Group__1"


    // $ANTLR start "rule__VERIFY_THAT__Group__1__Impl"
    // InternalBrowserAutomation.g:1721:1: rule__VERIFY_THAT__Group__1__Impl : ( ( rule__VERIFY_THAT__ElementAssignment_1 ) ) ;
    public final void rule__VERIFY_THAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1725:1: ( ( ( rule__VERIFY_THAT__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1726:1: ( ( rule__VERIFY_THAT__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1726:1: ( ( rule__VERIFY_THAT__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1727:2: ( rule__VERIFY_THAT__ElementAssignment_1 )
            {
             before(grammarAccess.getVERIFY_THATAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1728:2: ( rule__VERIFY_THAT__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1728:3: rule__VERIFY_THAT__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_THAT__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_THATAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY_THAT__Group__1__Impl"


    // $ANTLR start "rule__INSERT_ON__Group__0"
    // InternalBrowserAutomation.g:1737:1: rule__INSERT_ON__Group__0 : rule__INSERT_ON__Group__0__Impl rule__INSERT_ON__Group__1 ;
    public final void rule__INSERT_ON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1741:1: ( rule__INSERT_ON__Group__0__Impl rule__INSERT_ON__Group__1 )
            // InternalBrowserAutomation.g:1742:2: rule__INSERT_ON__Group__0__Impl rule__INSERT_ON__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__INSERT_ON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT_ON__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__Group__0"


    // $ANTLR start "rule__INSERT_ON__Group__0__Impl"
    // InternalBrowserAutomation.g:1749:1: rule__INSERT_ON__Group__0__Impl : ( 'insert' ) ;
    public final void rule__INSERT_ON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1753:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1754:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1754:1: ( 'insert' )
            // InternalBrowserAutomation.g:1755:2: 'insert'
            {
             before(grammarAccess.getINSERT_ONAccess().getInsertKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getINSERT_ONAccess().getInsertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__Group__0__Impl"


    // $ANTLR start "rule__INSERT_ON__Group__1"
    // InternalBrowserAutomation.g:1764:1: rule__INSERT_ON__Group__1 : rule__INSERT_ON__Group__1__Impl rule__INSERT_ON__Group__2 ;
    public final void rule__INSERT_ON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1768:1: ( rule__INSERT_ON__Group__1__Impl rule__INSERT_ON__Group__2 )
            // InternalBrowserAutomation.g:1769:2: rule__INSERT_ON__Group__1__Impl rule__INSERT_ON__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__INSERT_ON__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT_ON__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__Group__1"


    // $ANTLR start "rule__INSERT_ON__Group__1__Impl"
    // InternalBrowserAutomation.g:1776:1: rule__INSERT_ON__Group__1__Impl : ( ( rule__INSERT_ON__ElementAssignment_1 ) ) ;
    public final void rule__INSERT_ON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1780:1: ( ( ( rule__INSERT_ON__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1781:1: ( ( rule__INSERT_ON__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1781:1: ( ( rule__INSERT_ON__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1782:2: ( rule__INSERT_ON__ElementAssignment_1 )
            {
             before(grammarAccess.getINSERT_ONAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1783:2: ( rule__INSERT_ON__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1783:3: rule__INSERT_ON__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__INSERT_ON__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getINSERT_ONAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__Group__1__Impl"


    // $ANTLR start "rule__INSERT_ON__Group__2"
    // InternalBrowserAutomation.g:1791:1: rule__INSERT_ON__Group__2 : rule__INSERT_ON__Group__2__Impl ;
    public final void rule__INSERT_ON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1795:1: ( rule__INSERT_ON__Group__2__Impl )
            // InternalBrowserAutomation.g:1796:2: rule__INSERT_ON__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSERT_ON__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__Group__2"


    // $ANTLR start "rule__INSERT_ON__Group__2__Impl"
    // InternalBrowserAutomation.g:1802:1: rule__INSERT_ON__Group__2__Impl : ( ( rule__INSERT_ON__DataAssignment_2 ) ) ;
    public final void rule__INSERT_ON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1806:1: ( ( ( rule__INSERT_ON__DataAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1807:1: ( ( rule__INSERT_ON__DataAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1807:1: ( ( rule__INSERT_ON__DataAssignment_2 ) )
            // InternalBrowserAutomation.g:1808:2: ( rule__INSERT_ON__DataAssignment_2 )
            {
             before(grammarAccess.getINSERT_ONAccess().getDataAssignment_2()); 
            // InternalBrowserAutomation.g:1809:2: ( rule__INSERT_ON__DataAssignment_2 )
            // InternalBrowserAutomation.g:1809:3: rule__INSERT_ON__DataAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__INSERT_ON__DataAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getINSERT_ONAccess().getDataAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__Group__2__Impl"


    // $ANTLR start "rule__CHECK_BOXE__Group__0"
    // InternalBrowserAutomation.g:1818:1: rule__CHECK_BOXE__Group__0 : rule__CHECK_BOXE__Group__0__Impl rule__CHECK_BOXE__Group__1 ;
    public final void rule__CHECK_BOXE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1822:1: ( rule__CHECK_BOXE__Group__0__Impl rule__CHECK_BOXE__Group__1 )
            // InternalBrowserAutomation.g:1823:2: rule__CHECK_BOXE__Group__0__Impl rule__CHECK_BOXE__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__CHECK_BOXE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHECK_BOXE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__Group__0"


    // $ANTLR start "rule__CHECK_BOXE__Group__0__Impl"
    // InternalBrowserAutomation.g:1830:1: rule__CHECK_BOXE__Group__0__Impl : ( ( rule__CHECK_BOXE__Alternatives_0 ) ) ;
    public final void rule__CHECK_BOXE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1834:1: ( ( ( rule__CHECK_BOXE__Alternatives_0 ) ) )
            // InternalBrowserAutomation.g:1835:1: ( ( rule__CHECK_BOXE__Alternatives_0 ) )
            {
            // InternalBrowserAutomation.g:1835:1: ( ( rule__CHECK_BOXE__Alternatives_0 ) )
            // InternalBrowserAutomation.g:1836:2: ( rule__CHECK_BOXE__Alternatives_0 )
            {
             before(grammarAccess.getCHECK_BOXEAccess().getAlternatives_0()); 
            // InternalBrowserAutomation.g:1837:2: ( rule__CHECK_BOXE__Alternatives_0 )
            // InternalBrowserAutomation.g:1837:3: rule__CHECK_BOXE__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CHECK_BOXE__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCHECK_BOXEAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__Group__0__Impl"


    // $ANTLR start "rule__CHECK_BOXE__Group__1"
    // InternalBrowserAutomation.g:1845:1: rule__CHECK_BOXE__Group__1 : rule__CHECK_BOXE__Group__1__Impl ;
    public final void rule__CHECK_BOXE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1849:1: ( rule__CHECK_BOXE__Group__1__Impl )
            // InternalBrowserAutomation.g:1850:2: rule__CHECK_BOXE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CHECK_BOXE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__Group__1"


    // $ANTLR start "rule__CHECK_BOXE__Group__1__Impl"
    // InternalBrowserAutomation.g:1856:1: rule__CHECK_BOXE__Group__1__Impl : ( ( rule__CHECK_BOXE__Alternatives_1 ) ) ;
    public final void rule__CHECK_BOXE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1860:1: ( ( ( rule__CHECK_BOXE__Alternatives_1 ) ) )
            // InternalBrowserAutomation.g:1861:1: ( ( rule__CHECK_BOXE__Alternatives_1 ) )
            {
            // InternalBrowserAutomation.g:1861:1: ( ( rule__CHECK_BOXE__Alternatives_1 ) )
            // InternalBrowserAutomation.g:1862:2: ( rule__CHECK_BOXE__Alternatives_1 )
            {
             before(grammarAccess.getCHECK_BOXEAccess().getAlternatives_1()); 
            // InternalBrowserAutomation.g:1863:2: ( rule__CHECK_BOXE__Alternatives_1 )
            // InternalBrowserAutomation.g:1863:3: rule__CHECK_BOXE__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__CHECK_BOXE__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCHECK_BOXEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__Group__1__Impl"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__0"
    // InternalBrowserAutomation.g:1872:1: rule__CHOOSE_COMBOBOX__Group__0 : rule__CHOOSE_COMBOBOX__Group__0__Impl rule__CHOOSE_COMBOBOX__Group__1 ;
    public final void rule__CHOOSE_COMBOBOX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1876:1: ( rule__CHOOSE_COMBOBOX__Group__0__Impl rule__CHOOSE_COMBOBOX__Group__1 )
            // InternalBrowserAutomation.g:1877:2: rule__CHOOSE_COMBOBOX__Group__0__Impl rule__CHOOSE_COMBOBOX__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__CHOOSE_COMBOBOX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__0"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__0__Impl"
    // InternalBrowserAutomation.g:1884:1: rule__CHOOSE_COMBOBOX__Group__0__Impl : ( 'choosecombo' ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1888:1: ( ( 'choosecombo' ) )
            // InternalBrowserAutomation.g:1889:1: ( 'choosecombo' )
            {
            // InternalBrowserAutomation.g:1889:1: ( 'choosecombo' )
            // InternalBrowserAutomation.g:1890:2: 'choosecombo'
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__0__Impl"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__1"
    // InternalBrowserAutomation.g:1899:1: rule__CHOOSE_COMBOBOX__Group__1 : rule__CHOOSE_COMBOBOX__Group__1__Impl rule__CHOOSE_COMBOBOX__Group__2 ;
    public final void rule__CHOOSE_COMBOBOX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1903:1: ( rule__CHOOSE_COMBOBOX__Group__1__Impl rule__CHOOSE_COMBOBOX__Group__2 )
            // InternalBrowserAutomation.g:1904:2: rule__CHOOSE_COMBOBOX__Group__1__Impl rule__CHOOSE_COMBOBOX__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CHOOSE_COMBOBOX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__1"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__1__Impl"
    // InternalBrowserAutomation.g:1911:1: rule__CHOOSE_COMBOBOX__Group__1__Impl : ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1915:1: ( ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1916:1: ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1916:1: ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1917:2: ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 )
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1918:2: ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1918:3: rule__CHOOSE_COMBOBOX__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__1__Impl"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__2"
    // InternalBrowserAutomation.g:1926:1: rule__CHOOSE_COMBOBOX__Group__2 : rule__CHOOSE_COMBOBOX__Group__2__Impl rule__CHOOSE_COMBOBOX__Group__3 ;
    public final void rule__CHOOSE_COMBOBOX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1930:1: ( rule__CHOOSE_COMBOBOX__Group__2__Impl rule__CHOOSE_COMBOBOX__Group__3 )
            // InternalBrowserAutomation.g:1931:2: rule__CHOOSE_COMBOBOX__Group__2__Impl rule__CHOOSE_COMBOBOX__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CHOOSE_COMBOBOX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__2"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__2__Impl"
    // InternalBrowserAutomation.g:1938:1: rule__CHOOSE_COMBOBOX__Group__2__Impl : ( '{' ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1942:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:1943:1: ( '{' )
            {
            // InternalBrowserAutomation.g:1943:1: ( '{' )
            // InternalBrowserAutomation.g:1944:2: '{'
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__2__Impl"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__3"
    // InternalBrowserAutomation.g:1953:1: rule__CHOOSE_COMBOBOX__Group__3 : rule__CHOOSE_COMBOBOX__Group__3__Impl rule__CHOOSE_COMBOBOX__Group__4 ;
    public final void rule__CHOOSE_COMBOBOX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1957:1: ( rule__CHOOSE_COMBOBOX__Group__3__Impl rule__CHOOSE_COMBOBOX__Group__4 )
            // InternalBrowserAutomation.g:1958:2: rule__CHOOSE_COMBOBOX__Group__3__Impl rule__CHOOSE_COMBOBOX__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CHOOSE_COMBOBOX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__3"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__3__Impl"
    // InternalBrowserAutomation.g:1965:1: rule__CHOOSE_COMBOBOX__Group__3__Impl : ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1969:1: ( ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1970:1: ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1970:1: ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) )
            // InternalBrowserAutomation.g:1971:2: ( rule__CHOOSE_COMBOBOX__DataAssignment_3 )
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getDataAssignment_3()); 
            // InternalBrowserAutomation.g:1972:2: ( rule__CHOOSE_COMBOBOX__DataAssignment_3 )
            // InternalBrowserAutomation.g:1972:3: rule__CHOOSE_COMBOBOX__DataAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__DataAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getDataAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__3__Impl"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__4"
    // InternalBrowserAutomation.g:1980:1: rule__CHOOSE_COMBOBOX__Group__4 : rule__CHOOSE_COMBOBOX__Group__4__Impl ;
    public final void rule__CHOOSE_COMBOBOX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1984:1: ( rule__CHOOSE_COMBOBOX__Group__4__Impl )
            // InternalBrowserAutomation.g:1985:2: rule__CHOOSE_COMBOBOX__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CHOOSE_COMBOBOX__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__4"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__Group__4__Impl"
    // InternalBrowserAutomation.g:1991:1: rule__CHOOSE_COMBOBOX__Group__4__Impl : ( '}' ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1995:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:1996:1: ( '}' )
            {
            // InternalBrowserAutomation.g:1996:1: ( '}' )
            // InternalBrowserAutomation.g:1997:2: '}'
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__Group__4__Impl"


    // $ANTLR start "rule__READ_ON__Group__0"
    // InternalBrowserAutomation.g:2007:1: rule__READ_ON__Group__0 : rule__READ_ON__Group__0__Impl rule__READ_ON__Group__1 ;
    public final void rule__READ_ON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2011:1: ( rule__READ_ON__Group__0__Impl rule__READ_ON__Group__1 )
            // InternalBrowserAutomation.g:2012:2: rule__READ_ON__Group__0__Impl rule__READ_ON__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__READ_ON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__READ_ON__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ_ON__Group__0"


    // $ANTLR start "rule__READ_ON__Group__0__Impl"
    // InternalBrowserAutomation.g:2019:1: rule__READ_ON__Group__0__Impl : ( 'read' ) ;
    public final void rule__READ_ON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2023:1: ( ( 'read' ) )
            // InternalBrowserAutomation.g:2024:1: ( 'read' )
            {
            // InternalBrowserAutomation.g:2024:1: ( 'read' )
            // InternalBrowserAutomation.g:2025:2: 'read'
            {
             before(grammarAccess.getREAD_ONAccess().getReadKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getREAD_ONAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ_ON__Group__0__Impl"


    // $ANTLR start "rule__READ_ON__Group__1"
    // InternalBrowserAutomation.g:2034:1: rule__READ_ON__Group__1 : rule__READ_ON__Group__1__Impl ;
    public final void rule__READ_ON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2038:1: ( rule__READ_ON__Group__1__Impl )
            // InternalBrowserAutomation.g:2039:2: rule__READ_ON__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__READ_ON__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ_ON__Group__1"


    // $ANTLR start "rule__READ_ON__Group__1__Impl"
    // InternalBrowserAutomation.g:2045:1: rule__READ_ON__Group__1__Impl : ( ( rule__READ_ON__ElementAssignment_1 ) ) ;
    public final void rule__READ_ON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2049:1: ( ( ( rule__READ_ON__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2050:1: ( ( rule__READ_ON__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2050:1: ( ( rule__READ_ON__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:2051:2: ( rule__READ_ON__ElementAssignment_1 )
            {
             before(grammarAccess.getREAD_ONAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:2052:2: ( rule__READ_ON__ElementAssignment_1 )
            // InternalBrowserAutomation.g:2052:3: rule__READ_ON__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__READ_ON__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getREAD_ONAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ_ON__Group__1__Impl"


    // $ANTLR start "rule__COMBOBOX__Group__0"
    // InternalBrowserAutomation.g:2061:1: rule__COMBOBOX__Group__0 : rule__COMBOBOX__Group__0__Impl rule__COMBOBOX__Group__1 ;
    public final void rule__COMBOBOX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2065:1: ( rule__COMBOBOX__Group__0__Impl rule__COMBOBOX__Group__1 )
            // InternalBrowserAutomation.g:2066:2: rule__COMBOBOX__Group__0__Impl rule__COMBOBOX__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__COMBOBOX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMBOBOX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMBOBOX__Group__0"


    // $ANTLR start "rule__COMBOBOX__Group__0__Impl"
    // InternalBrowserAutomation.g:2073:1: rule__COMBOBOX__Group__0__Impl : ( 'combobox' ) ;
    public final void rule__COMBOBOX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2077:1: ( ( 'combobox' ) )
            // InternalBrowserAutomation.g:2078:1: ( 'combobox' )
            {
            // InternalBrowserAutomation.g:2078:1: ( 'combobox' )
            // InternalBrowserAutomation.g:2079:2: 'combobox'
            {
             before(grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMBOBOX__Group__0__Impl"


    // $ANTLR start "rule__COMBOBOX__Group__1"
    // InternalBrowserAutomation.g:2088:1: rule__COMBOBOX__Group__1 : rule__COMBOBOX__Group__1__Impl ;
    public final void rule__COMBOBOX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2092:1: ( rule__COMBOBOX__Group__1__Impl )
            // InternalBrowserAutomation.g:2093:2: rule__COMBOBOX__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COMBOBOX__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMBOBOX__Group__1"


    // $ANTLR start "rule__COMBOBOX__Group__1__Impl"
    // InternalBrowserAutomation.g:2099:1: rule__COMBOBOX__Group__1__Impl : ( ( rule__COMBOBOX__NameAssignment_1 ) ) ;
    public final void rule__COMBOBOX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2103:1: ( ( ( rule__COMBOBOX__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2104:1: ( ( rule__COMBOBOX__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2104:1: ( ( rule__COMBOBOX__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2105:2: ( rule__COMBOBOX__NameAssignment_1 )
            {
             before(grammarAccess.getCOMBOBOXAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2106:2: ( rule__COMBOBOX__NameAssignment_1 )
            // InternalBrowserAutomation.g:2106:3: rule__COMBOBOX__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__COMBOBOX__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCOMBOBOXAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMBOBOX__Group__1__Impl"


    // $ANTLR start "rule__CHECKBOX__Group__0"
    // InternalBrowserAutomation.g:2115:1: rule__CHECKBOX__Group__0 : rule__CHECKBOX__Group__0__Impl rule__CHECKBOX__Group__1 ;
    public final void rule__CHECKBOX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2119:1: ( rule__CHECKBOX__Group__0__Impl rule__CHECKBOX__Group__1 )
            // InternalBrowserAutomation.g:2120:2: rule__CHECKBOX__Group__0__Impl rule__CHECKBOX__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CHECKBOX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHECKBOX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECKBOX__Group__0"


    // $ANTLR start "rule__CHECKBOX__Group__0__Impl"
    // InternalBrowserAutomation.g:2127:1: rule__CHECKBOX__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__CHECKBOX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2131:1: ( ( 'checkbox' ) )
            // InternalBrowserAutomation.g:2132:1: ( 'checkbox' )
            {
            // InternalBrowserAutomation.g:2132:1: ( 'checkbox' )
            // InternalBrowserAutomation.g:2133:2: 'checkbox'
            {
             before(grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECKBOX__Group__0__Impl"


    // $ANTLR start "rule__CHECKBOX__Group__1"
    // InternalBrowserAutomation.g:2142:1: rule__CHECKBOX__Group__1 : rule__CHECKBOX__Group__1__Impl ;
    public final void rule__CHECKBOX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2146:1: ( rule__CHECKBOX__Group__1__Impl )
            // InternalBrowserAutomation.g:2147:2: rule__CHECKBOX__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CHECKBOX__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECKBOX__Group__1"


    // $ANTLR start "rule__CHECKBOX__Group__1__Impl"
    // InternalBrowserAutomation.g:2153:1: rule__CHECKBOX__Group__1__Impl : ( ( rule__CHECKBOX__NameAssignment_1 ) ) ;
    public final void rule__CHECKBOX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2157:1: ( ( ( rule__CHECKBOX__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2158:1: ( ( rule__CHECKBOX__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2158:1: ( ( rule__CHECKBOX__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2159:2: ( rule__CHECKBOX__NameAssignment_1 )
            {
             before(grammarAccess.getCHECKBOXAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2160:2: ( rule__CHECKBOX__NameAssignment_1 )
            // InternalBrowserAutomation.g:2160:3: rule__CHECKBOX__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CHECKBOX__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCHECKBOXAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECKBOX__Group__1__Impl"


    // $ANTLR start "rule__SEARCH_FIELD__Group__0"
    // InternalBrowserAutomation.g:2169:1: rule__SEARCH_FIELD__Group__0 : rule__SEARCH_FIELD__Group__0__Impl rule__SEARCH_FIELD__Group__1 ;
    public final void rule__SEARCH_FIELD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2173:1: ( rule__SEARCH_FIELD__Group__0__Impl rule__SEARCH_FIELD__Group__1 )
            // InternalBrowserAutomation.g:2174:2: rule__SEARCH_FIELD__Group__0__Impl rule__SEARCH_FIELD__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SEARCH_FIELD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEARCH_FIELD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEARCH_FIELD__Group__0"


    // $ANTLR start "rule__SEARCH_FIELD__Group__0__Impl"
    // InternalBrowserAutomation.g:2181:1: rule__SEARCH_FIELD__Group__0__Impl : ( 'searchfield' ) ;
    public final void rule__SEARCH_FIELD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2185:1: ( ( 'searchfield' ) )
            // InternalBrowserAutomation.g:2186:1: ( 'searchfield' )
            {
            // InternalBrowserAutomation.g:2186:1: ( 'searchfield' )
            // InternalBrowserAutomation.g:2187:2: 'searchfield'
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEARCH_FIELD__Group__0__Impl"


    // $ANTLR start "rule__SEARCH_FIELD__Group__1"
    // InternalBrowserAutomation.g:2196:1: rule__SEARCH_FIELD__Group__1 : rule__SEARCH_FIELD__Group__1__Impl ;
    public final void rule__SEARCH_FIELD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2200:1: ( rule__SEARCH_FIELD__Group__1__Impl )
            // InternalBrowserAutomation.g:2201:2: rule__SEARCH_FIELD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEARCH_FIELD__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEARCH_FIELD__Group__1"


    // $ANTLR start "rule__SEARCH_FIELD__Group__1__Impl"
    // InternalBrowserAutomation.g:2207:1: rule__SEARCH_FIELD__Group__1__Impl : ( ( rule__SEARCH_FIELD__NameAssignment_1 ) ) ;
    public final void rule__SEARCH_FIELD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2211:1: ( ( ( rule__SEARCH_FIELD__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2212:1: ( ( rule__SEARCH_FIELD__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2212:1: ( ( rule__SEARCH_FIELD__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2213:2: ( rule__SEARCH_FIELD__NameAssignment_1 )
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2214:2: ( rule__SEARCH_FIELD__NameAssignment_1 )
            // InternalBrowserAutomation.g:2214:3: rule__SEARCH_FIELD__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SEARCH_FIELD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSEARCH_FIELDAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEARCH_FIELD__Group__1__Impl"


    // $ANTLR start "rule__TEXT__Group__0"
    // InternalBrowserAutomation.g:2223:1: rule__TEXT__Group__0 : rule__TEXT__Group__0__Impl rule__TEXT__Group__1 ;
    public final void rule__TEXT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2227:1: ( rule__TEXT__Group__0__Impl rule__TEXT__Group__1 )
            // InternalBrowserAutomation.g:2228:2: rule__TEXT__Group__0__Impl rule__TEXT__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TEXT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEXT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT__Group__0"


    // $ANTLR start "rule__TEXT__Group__0__Impl"
    // InternalBrowserAutomation.g:2235:1: rule__TEXT__Group__0__Impl : ( 'text' ) ;
    public final void rule__TEXT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2239:1: ( ( 'text' ) )
            // InternalBrowserAutomation.g:2240:1: ( 'text' )
            {
            // InternalBrowserAutomation.g:2240:1: ( 'text' )
            // InternalBrowserAutomation.g:2241:2: 'text'
            {
             before(grammarAccess.getTEXTAccess().getTextKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTEXTAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT__Group__0__Impl"


    // $ANTLR start "rule__TEXT__Group__1"
    // InternalBrowserAutomation.g:2250:1: rule__TEXT__Group__1 : rule__TEXT__Group__1__Impl ;
    public final void rule__TEXT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2254:1: ( rule__TEXT__Group__1__Impl )
            // InternalBrowserAutomation.g:2255:2: rule__TEXT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TEXT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT__Group__1"


    // $ANTLR start "rule__TEXT__Group__1__Impl"
    // InternalBrowserAutomation.g:2261:1: rule__TEXT__Group__1__Impl : ( ( rule__TEXT__NameAssignment_1 ) ) ;
    public final void rule__TEXT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2265:1: ( ( ( rule__TEXT__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2266:1: ( ( rule__TEXT__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2266:1: ( ( rule__TEXT__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2267:2: ( rule__TEXT__NameAssignment_1 )
            {
             before(grammarAccess.getTEXTAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2268:2: ( rule__TEXT__NameAssignment_1 )
            // InternalBrowserAutomation.g:2268:3: rule__TEXT__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TEXT__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTEXTAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT__Group__1__Impl"


    // $ANTLR start "rule__BUTTON__Group__0"
    // InternalBrowserAutomation.g:2277:1: rule__BUTTON__Group__0 : rule__BUTTON__Group__0__Impl rule__BUTTON__Group__1 ;
    public final void rule__BUTTON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2281:1: ( rule__BUTTON__Group__0__Impl rule__BUTTON__Group__1 )
            // InternalBrowserAutomation.g:2282:2: rule__BUTTON__Group__0__Impl rule__BUTTON__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BUTTON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BUTTON__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUTTON__Group__0"


    // $ANTLR start "rule__BUTTON__Group__0__Impl"
    // InternalBrowserAutomation.g:2289:1: rule__BUTTON__Group__0__Impl : ( 'button' ) ;
    public final void rule__BUTTON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2293:1: ( ( 'button' ) )
            // InternalBrowserAutomation.g:2294:1: ( 'button' )
            {
            // InternalBrowserAutomation.g:2294:1: ( 'button' )
            // InternalBrowserAutomation.g:2295:2: 'button'
            {
             before(grammarAccess.getBUTTONAccess().getButtonKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBUTTONAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUTTON__Group__0__Impl"


    // $ANTLR start "rule__BUTTON__Group__1"
    // InternalBrowserAutomation.g:2304:1: rule__BUTTON__Group__1 : rule__BUTTON__Group__1__Impl ;
    public final void rule__BUTTON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2308:1: ( rule__BUTTON__Group__1__Impl )
            // InternalBrowserAutomation.g:2309:2: rule__BUTTON__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BUTTON__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUTTON__Group__1"


    // $ANTLR start "rule__BUTTON__Group__1__Impl"
    // InternalBrowserAutomation.g:2315:1: rule__BUTTON__Group__1__Impl : ( ( rule__BUTTON__NameAssignment_1 ) ) ;
    public final void rule__BUTTON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2319:1: ( ( ( rule__BUTTON__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2320:1: ( ( rule__BUTTON__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2320:1: ( ( rule__BUTTON__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2321:2: ( rule__BUTTON__NameAssignment_1 )
            {
             before(grammarAccess.getBUTTONAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2322:2: ( rule__BUTTON__NameAssignment_1 )
            // InternalBrowserAutomation.g:2322:3: rule__BUTTON__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BUTTON__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBUTTONAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUTTON__Group__1__Impl"


    // $ANTLR start "rule__LINK__Group__0"
    // InternalBrowserAutomation.g:2331:1: rule__LINK__Group__0 : rule__LINK__Group__0__Impl rule__LINK__Group__1 ;
    public final void rule__LINK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2335:1: ( rule__LINK__Group__0__Impl rule__LINK__Group__1 )
            // InternalBrowserAutomation.g:2336:2: rule__LINK__Group__0__Impl rule__LINK__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LINK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LINK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LINK__Group__0"


    // $ANTLR start "rule__LINK__Group__0__Impl"
    // InternalBrowserAutomation.g:2343:1: rule__LINK__Group__0__Impl : ( 'link' ) ;
    public final void rule__LINK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2347:1: ( ( 'link' ) )
            // InternalBrowserAutomation.g:2348:1: ( 'link' )
            {
            // InternalBrowserAutomation.g:2348:1: ( 'link' )
            // InternalBrowserAutomation.g:2349:2: 'link'
            {
             before(grammarAccess.getLINKAccess().getLinkKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLINKAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LINK__Group__0__Impl"


    // $ANTLR start "rule__LINK__Group__1"
    // InternalBrowserAutomation.g:2358:1: rule__LINK__Group__1 : rule__LINK__Group__1__Impl ;
    public final void rule__LINK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2362:1: ( rule__LINK__Group__1__Impl )
            // InternalBrowserAutomation.g:2363:2: rule__LINK__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LINK__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LINK__Group__1"


    // $ANTLR start "rule__LINK__Group__1__Impl"
    // InternalBrowserAutomation.g:2369:1: rule__LINK__Group__1__Impl : ( ( rule__LINK__UrlAssignment_1 ) ) ;
    public final void rule__LINK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2373:1: ( ( ( rule__LINK__UrlAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2374:1: ( ( rule__LINK__UrlAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2374:1: ( ( rule__LINK__UrlAssignment_1 ) )
            // InternalBrowserAutomation.g:2375:2: ( rule__LINK__UrlAssignment_1 )
            {
             before(grammarAccess.getLINKAccess().getUrlAssignment_1()); 
            // InternalBrowserAutomation.g:2376:2: ( rule__LINK__UrlAssignment_1 )
            // InternalBrowserAutomation.g:2376:3: rule__LINK__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LINK__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLINKAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LINK__Group__1__Impl"


    // $ANTLR start "rule__IMAGE__Group__0"
    // InternalBrowserAutomation.g:2385:1: rule__IMAGE__Group__0 : rule__IMAGE__Group__0__Impl rule__IMAGE__Group__1 ;
    public final void rule__IMAGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2389:1: ( rule__IMAGE__Group__0__Impl rule__IMAGE__Group__1 )
            // InternalBrowserAutomation.g:2390:2: rule__IMAGE__Group__0__Impl rule__IMAGE__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__IMAGE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group__0"


    // $ANTLR start "rule__IMAGE__Group__0__Impl"
    // InternalBrowserAutomation.g:2397:1: rule__IMAGE__Group__0__Impl : ( 'image' ) ;
    public final void rule__IMAGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2401:1: ( ( 'image' ) )
            // InternalBrowserAutomation.g:2402:1: ( 'image' )
            {
            // InternalBrowserAutomation.g:2402:1: ( 'image' )
            // InternalBrowserAutomation.g:2403:2: 'image'
            {
             before(grammarAccess.getIMAGEAccess().getImageKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIMAGEAccess().getImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group__0__Impl"


    // $ANTLR start "rule__IMAGE__Group__1"
    // InternalBrowserAutomation.g:2412:1: rule__IMAGE__Group__1 : rule__IMAGE__Group__1__Impl rule__IMAGE__Group__2 ;
    public final void rule__IMAGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2416:1: ( rule__IMAGE__Group__1__Impl rule__IMAGE__Group__2 )
            // InternalBrowserAutomation.g:2417:2: rule__IMAGE__Group__1__Impl rule__IMAGE__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__IMAGE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group__1"


    // $ANTLR start "rule__IMAGE__Group__1__Impl"
    // InternalBrowserAutomation.g:2424:1: rule__IMAGE__Group__1__Impl : ( ( rule__IMAGE__NameAssignment_1 ) ) ;
    public final void rule__IMAGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2428:1: ( ( ( rule__IMAGE__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2429:1: ( ( rule__IMAGE__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2429:1: ( ( rule__IMAGE__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2430:2: ( rule__IMAGE__NameAssignment_1 )
            {
             before(grammarAccess.getIMAGEAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2431:2: ( rule__IMAGE__NameAssignment_1 )
            // InternalBrowserAutomation.g:2431:3: rule__IMAGE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIMAGEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group__1__Impl"


    // $ANTLR start "rule__IMAGE__Group__2"
    // InternalBrowserAutomation.g:2439:1: rule__IMAGE__Group__2 : rule__IMAGE__Group__2__Impl ;
    public final void rule__IMAGE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2443:1: ( rule__IMAGE__Group__2__Impl )
            // InternalBrowserAutomation.g:2444:2: rule__IMAGE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group__2"


    // $ANTLR start "rule__IMAGE__Group__2__Impl"
    // InternalBrowserAutomation.g:2450:1: rule__IMAGE__Group__2__Impl : ( ( rule__IMAGE__Group_2__0 )* ) ;
    public final void rule__IMAGE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2454:1: ( ( ( rule__IMAGE__Group_2__0 )* ) )
            // InternalBrowserAutomation.g:2455:1: ( ( rule__IMAGE__Group_2__0 )* )
            {
            // InternalBrowserAutomation.g:2455:1: ( ( rule__IMAGE__Group_2__0 )* )
            // InternalBrowserAutomation.g:2456:2: ( rule__IMAGE__Group_2__0 )*
            {
             before(grammarAccess.getIMAGEAccess().getGroup_2()); 
            // InternalBrowserAutomation.g:2457:2: ( rule__IMAGE__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBrowserAutomation.g:2457:3: rule__IMAGE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__IMAGE__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIMAGEAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group__2__Impl"


    // $ANTLR start "rule__IMAGE__Group_2__0"
    // InternalBrowserAutomation.g:2466:1: rule__IMAGE__Group_2__0 : rule__IMAGE__Group_2__0__Impl rule__IMAGE__Group_2__1 ;
    public final void rule__IMAGE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2470:1: ( rule__IMAGE__Group_2__0__Impl rule__IMAGE__Group_2__1 )
            // InternalBrowserAutomation.g:2471:2: rule__IMAGE__Group_2__0__Impl rule__IMAGE__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__IMAGE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group_2__0"


    // $ANTLR start "rule__IMAGE__Group_2__0__Impl"
    // InternalBrowserAutomation.g:2478:1: rule__IMAGE__Group_2__0__Impl : ( '{' ) ;
    public final void rule__IMAGE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2482:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:2483:1: ( '{' )
            {
            // InternalBrowserAutomation.g:2483:1: ( '{' )
            // InternalBrowserAutomation.g:2484:2: '{'
            {
             before(grammarAccess.getIMAGEAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIMAGEAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group_2__0__Impl"


    // $ANTLR start "rule__IMAGE__Group_2__1"
    // InternalBrowserAutomation.g:2493:1: rule__IMAGE__Group_2__1 : rule__IMAGE__Group_2__1__Impl rule__IMAGE__Group_2__2 ;
    public final void rule__IMAGE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2497:1: ( rule__IMAGE__Group_2__1__Impl rule__IMAGE__Group_2__2 )
            // InternalBrowserAutomation.g:2498:2: rule__IMAGE__Group_2__1__Impl rule__IMAGE__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__IMAGE__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group_2__1"


    // $ANTLR start "rule__IMAGE__Group_2__1__Impl"
    // InternalBrowserAutomation.g:2505:1: rule__IMAGE__Group_2__1__Impl : ( ( rule__IMAGE__ParamsAssignment_2_1 )* ) ;
    public final void rule__IMAGE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2509:1: ( ( ( rule__IMAGE__ParamsAssignment_2_1 )* ) )
            // InternalBrowserAutomation.g:2510:1: ( ( rule__IMAGE__ParamsAssignment_2_1 )* )
            {
            // InternalBrowserAutomation.g:2510:1: ( ( rule__IMAGE__ParamsAssignment_2_1 )* )
            // InternalBrowserAutomation.g:2511:2: ( rule__IMAGE__ParamsAssignment_2_1 )*
            {
             before(grammarAccess.getIMAGEAccess().getParamsAssignment_2_1()); 
            // InternalBrowserAutomation.g:2512:2: ( rule__IMAGE__ParamsAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBrowserAutomation.g:2512:3: rule__IMAGE__ParamsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__IMAGE__ParamsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIMAGEAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group_2__1__Impl"


    // $ANTLR start "rule__IMAGE__Group_2__2"
    // InternalBrowserAutomation.g:2520:1: rule__IMAGE__Group_2__2 : rule__IMAGE__Group_2__2__Impl ;
    public final void rule__IMAGE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2524:1: ( rule__IMAGE__Group_2__2__Impl )
            // InternalBrowserAutomation.g:2525:2: rule__IMAGE__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group_2__2"


    // $ANTLR start "rule__IMAGE__Group_2__2__Impl"
    // InternalBrowserAutomation.g:2531:1: rule__IMAGE__Group_2__2__Impl : ( '}' ) ;
    public final void rule__IMAGE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2535:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:2536:1: ( '}' )
            {
            // InternalBrowserAutomation.g:2536:1: ( '}' )
            // InternalBrowserAutomation.g:2537:2: '}'
            {
             before(grammarAccess.getIMAGEAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIMAGEAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__Group_2__2__Impl"


    // $ANTLR start "rule__PARAMS__Group__0"
    // InternalBrowserAutomation.g:2547:1: rule__PARAMS__Group__0 : rule__PARAMS__Group__0__Impl rule__PARAMS__Group__1 ;
    public final void rule__PARAMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2551:1: ( rule__PARAMS__Group__0__Impl rule__PARAMS__Group__1 )
            // InternalBrowserAutomation.g:2552:2: rule__PARAMS__Group__0__Impl rule__PARAMS__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PARAMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PARAMS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__Group__0"


    // $ANTLR start "rule__PARAMS__Group__0__Impl"
    // InternalBrowserAutomation.g:2559:1: rule__PARAMS__Group__0__Impl : ( ( rule__PARAMS__KeyAssignment_0 ) ) ;
    public final void rule__PARAMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2563:1: ( ( ( rule__PARAMS__KeyAssignment_0 ) ) )
            // InternalBrowserAutomation.g:2564:1: ( ( rule__PARAMS__KeyAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:2564:1: ( ( rule__PARAMS__KeyAssignment_0 ) )
            // InternalBrowserAutomation.g:2565:2: ( rule__PARAMS__KeyAssignment_0 )
            {
             before(grammarAccess.getPARAMSAccess().getKeyAssignment_0()); 
            // InternalBrowserAutomation.g:2566:2: ( rule__PARAMS__KeyAssignment_0 )
            // InternalBrowserAutomation.g:2566:3: rule__PARAMS__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PARAMS__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPARAMSAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__Group__0__Impl"


    // $ANTLR start "rule__PARAMS__Group__1"
    // InternalBrowserAutomation.g:2574:1: rule__PARAMS__Group__1 : rule__PARAMS__Group__1__Impl rule__PARAMS__Group__2 ;
    public final void rule__PARAMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2578:1: ( rule__PARAMS__Group__1__Impl rule__PARAMS__Group__2 )
            // InternalBrowserAutomation.g:2579:2: rule__PARAMS__Group__1__Impl rule__PARAMS__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PARAMS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PARAMS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__Group__1"


    // $ANTLR start "rule__PARAMS__Group__1__Impl"
    // InternalBrowserAutomation.g:2586:1: rule__PARAMS__Group__1__Impl : ( '=' ) ;
    public final void rule__PARAMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2590:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:2591:1: ( '=' )
            {
            // InternalBrowserAutomation.g:2591:1: ( '=' )
            // InternalBrowserAutomation.g:2592:2: '='
            {
             before(grammarAccess.getPARAMSAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPARAMSAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__Group__1__Impl"


    // $ANTLR start "rule__PARAMS__Group__2"
    // InternalBrowserAutomation.g:2601:1: rule__PARAMS__Group__2 : rule__PARAMS__Group__2__Impl ;
    public final void rule__PARAMS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2605:1: ( rule__PARAMS__Group__2__Impl )
            // InternalBrowserAutomation.g:2606:2: rule__PARAMS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PARAMS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__Group__2"


    // $ANTLR start "rule__PARAMS__Group__2__Impl"
    // InternalBrowserAutomation.g:2612:1: rule__PARAMS__Group__2__Impl : ( ( rule__PARAMS__ValueAssignment_2 ) ) ;
    public final void rule__PARAMS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2616:1: ( ( ( rule__PARAMS__ValueAssignment_2 ) ) )
            // InternalBrowserAutomation.g:2617:1: ( ( rule__PARAMS__ValueAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:2617:1: ( ( rule__PARAMS__ValueAssignment_2 ) )
            // InternalBrowserAutomation.g:2618:2: ( rule__PARAMS__ValueAssignment_2 )
            {
             before(grammarAccess.getPARAMSAccess().getValueAssignment_2()); 
            // InternalBrowserAutomation.g:2619:2: ( rule__PARAMS__ValueAssignment_2 )
            // InternalBrowserAutomation.g:2619:3: rule__PARAMS__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PARAMS__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPARAMSAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__Group__2__Impl"


    // $ANTLR start "rule__Test__NameAssignment_2"
    // InternalBrowserAutomation.g:2628:1: rule__Test__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Test__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2632:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2633:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2633:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2634:3: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NameAssignment_2"


    // $ANTLR start "rule__Test__ResultAssignment_5"
    // InternalBrowserAutomation.g:2643:1: rule__Test__ResultAssignment_5 : ( ruleBOOL ) ;
    public final void rule__Test__ResultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2647:1: ( ( ruleBOOL ) )
            // InternalBrowserAutomation.g:2648:2: ( ruleBOOL )
            {
            // InternalBrowserAutomation.g:2648:2: ( ruleBOOL )
            // InternalBrowserAutomation.g:2649:3: ruleBOOL
            {
             before(grammarAccess.getTestAccess().getResultBOOLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getTestAccess().getResultBOOLParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ResultAssignment_5"


    // $ANTLR start "rule__Test__InstructionsAssignment_7"
    // InternalBrowserAutomation.g:2658:1: rule__Test__InstructionsAssignment_7 : ( ruleInstruction ) ;
    public final void rule__Test__InstructionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2662:1: ( ( ruleInstruction ) )
            // InternalBrowserAutomation.g:2663:2: ( ruleInstruction )
            {
            // InternalBrowserAutomation.g:2663:2: ( ruleInstruction )
            // InternalBrowserAutomation.g:2664:3: ruleInstruction
            {
             before(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__InstructionsAssignment_7"


    // $ANTLR start "rule__AFFECTATION__NameAssignment_1"
    // InternalBrowserAutomation.g:2673:1: rule__AFFECTATION__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AFFECTATION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2677:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2678:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2678:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2679:3: RULE_ID
            {
             before(grammarAccess.getAFFECTATIONAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAFFECTATIONAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__NameAssignment_1"


    // $ANTLR start "rule__AFFECTATION__SelectorAssignment_3"
    // InternalBrowserAutomation.g:2688:1: rule__AFFECTATION__SelectorAssignment_3 : ( ruleSELECTOR ) ;
    public final void rule__AFFECTATION__SelectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2692:1: ( ( ruleSELECTOR ) )
            // InternalBrowserAutomation.g:2693:2: ( ruleSELECTOR )
            {
            // InternalBrowserAutomation.g:2693:2: ( ruleSELECTOR )
            // InternalBrowserAutomation.g:2694:3: ruleSELECTOR
            {
             before(grammarAccess.getAFFECTATIONAccess().getSelectorSELECTORParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSELECTOR();

            state._fsp--;

             after(grammarAccess.getAFFECTATIONAccess().getSelectorSELECTORParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AFFECTATION__SelectorAssignment_3"


    // $ANTLR start "rule__SELECTOR__ParamsAssignment_3"
    // InternalBrowserAutomation.g:2703:1: rule__SELECTOR__ParamsAssignment_3 : ( rulePARAMS ) ;
    public final void rule__SELECTOR__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2707:1: ( ( rulePARAMS ) )
            // InternalBrowserAutomation.g:2708:2: ( rulePARAMS )
            {
            // InternalBrowserAutomation.g:2708:2: ( rulePARAMS )
            // InternalBrowserAutomation.g:2709:3: rulePARAMS
            {
             before(grammarAccess.getSELECTORAccess().getParamsPARAMSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePARAMS();

            state._fsp--;

             after(grammarAccess.getSELECTORAccess().getParamsPARAMSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__ParamsAssignment_3"


    // $ANTLR start "rule__SELECTOR__NumberAssignment_6"
    // InternalBrowserAutomation.g:2718:1: rule__SELECTOR__NumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__SELECTOR__NumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2722:1: ( ( RULE_INT ) )
            // InternalBrowserAutomation.g:2723:2: ( RULE_INT )
            {
            // InternalBrowserAutomation.g:2723:2: ( RULE_INT )
            // InternalBrowserAutomation.g:2724:3: RULE_INT
            {
             before(grammarAccess.getSELECTORAccess().getNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSELECTORAccess().getNumberINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECTOR__NumberAssignment_6"


    // $ANTLR start "rule__RefElement__RefAssignment"
    // InternalBrowserAutomation.g:2733:1: rule__RefElement__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefElement__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2737:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:2738:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:2738:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2739:3: ( RULE_ID )
            {
             before(grammarAccess.getRefElementAccess().getRefAFFECTATIONCrossReference_0()); 
            // InternalBrowserAutomation.g:2740:3: ( RULE_ID )
            // InternalBrowserAutomation.g:2741:4: RULE_ID
            {
             before(grammarAccess.getRefElementAccess().getRefAFFECTATIONIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefElementAccess().getRefAFFECTATIONIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRefElementAccess().getRefAFFECTATIONCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefElement__RefAssignment"


    // $ANTLR start "rule__GO_TO_URL__UrlAssignment_1"
    // InternalBrowserAutomation.g:2752:1: rule__GO_TO_URL__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GO_TO_URL__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2756:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2757:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2757:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2758:3: RULE_STRING
            {
             before(grammarAccess.getGO_TO_URLAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGO_TO_URLAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GO_TO_URL__UrlAssignment_1"


    // $ANTLR start "rule__CLICK_ON__ElementAssignment_1"
    // InternalBrowserAutomation.g:2767:1: rule__CLICK_ON__ElementAssignment_1 : ( ruleClickable ) ;
    public final void rule__CLICK_ON__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2771:1: ( ( ruleClickable ) )
            // InternalBrowserAutomation.g:2772:2: ( ruleClickable )
            {
            // InternalBrowserAutomation.g:2772:2: ( ruleClickable )
            // InternalBrowserAutomation.g:2773:3: ruleClickable
            {
             before(grammarAccess.getCLICK_ONAccess().getElementClickableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClickable();

            state._fsp--;

             after(grammarAccess.getCLICK_ONAccess().getElementClickableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK_ON__ElementAssignment_1"


    // $ANTLR start "rule__VERIFY_THAT__ElementAssignment_1"
    // InternalBrowserAutomation.g:2782:1: rule__VERIFY_THAT__ElementAssignment_1 : ( ruleVerifiable ) ;
    public final void rule__VERIFY_THAT__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2786:1: ( ( ruleVerifiable ) )
            // InternalBrowserAutomation.g:2787:2: ( ruleVerifiable )
            {
            // InternalBrowserAutomation.g:2787:2: ( ruleVerifiable )
            // InternalBrowserAutomation.g:2788:3: ruleVerifiable
            {
             before(grammarAccess.getVERIFY_THATAccess().getElementVerifiableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVerifiable();

            state._fsp--;

             after(grammarAccess.getVERIFY_THATAccess().getElementVerifiableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY_THAT__ElementAssignment_1"


    // $ANTLR start "rule__INSERT_ON__ElementAssignment_1"
    // InternalBrowserAutomation.g:2797:1: rule__INSERT_ON__ElementAssignment_1 : ( ruleInsertable ) ;
    public final void rule__INSERT_ON__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2801:1: ( ( ruleInsertable ) )
            // InternalBrowserAutomation.g:2802:2: ( ruleInsertable )
            {
            // InternalBrowserAutomation.g:2802:2: ( ruleInsertable )
            // InternalBrowserAutomation.g:2803:3: ruleInsertable
            {
             before(grammarAccess.getINSERT_ONAccess().getElementInsertableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInsertable();

            state._fsp--;

             after(grammarAccess.getINSERT_ONAccess().getElementInsertableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__ElementAssignment_1"


    // $ANTLR start "rule__INSERT_ON__DataAssignment_2"
    // InternalBrowserAutomation.g:2812:1: rule__INSERT_ON__DataAssignment_2 : ( ( rule__INSERT_ON__DataAlternatives_2_0 ) ) ;
    public final void rule__INSERT_ON__DataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2816:1: ( ( ( rule__INSERT_ON__DataAlternatives_2_0 ) ) )
            // InternalBrowserAutomation.g:2817:2: ( ( rule__INSERT_ON__DataAlternatives_2_0 ) )
            {
            // InternalBrowserAutomation.g:2817:2: ( ( rule__INSERT_ON__DataAlternatives_2_0 ) )
            // InternalBrowserAutomation.g:2818:3: ( rule__INSERT_ON__DataAlternatives_2_0 )
            {
             before(grammarAccess.getINSERT_ONAccess().getDataAlternatives_2_0()); 
            // InternalBrowserAutomation.g:2819:3: ( rule__INSERT_ON__DataAlternatives_2_0 )
            // InternalBrowserAutomation.g:2819:4: rule__INSERT_ON__DataAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__INSERT_ON__DataAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getINSERT_ONAccess().getDataAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT_ON__DataAssignment_2"


    // $ANTLR start "rule__CHECK_BOXE__ElementAssignment_1_0"
    // InternalBrowserAutomation.g:2827:1: rule__CHECK_BOXE__ElementAssignment_1_0 : ( ruleCHECKBOX ) ;
    public final void rule__CHECK_BOXE__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2831:1: ( ( ruleCHECKBOX ) )
            // InternalBrowserAutomation.g:2832:2: ( ruleCHECKBOX )
            {
            // InternalBrowserAutomation.g:2832:2: ( ruleCHECKBOX )
            // InternalBrowserAutomation.g:2833:3: ruleCHECKBOX
            {
             before(grammarAccess.getCHECK_BOXEAccess().getElementCHECKBOXParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCHECKBOX();

            state._fsp--;

             after(grammarAccess.getCHECK_BOXEAccess().getElementCHECKBOXParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK_BOXE__ElementAssignment_1_0"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__ElementAssignment_1"
    // InternalBrowserAutomation.g:2842:1: rule__CHOOSE_COMBOBOX__ElementAssignment_1 : ( ruleCOMBOBOX ) ;
    public final void rule__CHOOSE_COMBOBOX__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2846:1: ( ( ruleCOMBOBOX ) )
            // InternalBrowserAutomation.g:2847:2: ( ruleCOMBOBOX )
            {
            // InternalBrowserAutomation.g:2847:2: ( ruleCOMBOBOX )
            // InternalBrowserAutomation.g:2848:3: ruleCOMBOBOX
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementCOMBOBOXParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMBOBOX();

            state._fsp--;

             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementCOMBOBOXParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__ElementAssignment_1"


    // $ANTLR start "rule__CHOOSE_COMBOBOX__DataAssignment_3"
    // InternalBrowserAutomation.g:2857:1: rule__CHOOSE_COMBOBOX__DataAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CHOOSE_COMBOBOX__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2861:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2862:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2862:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2863:3: RULE_STRING
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getDataSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCHOOSE_COMBOBOXAccess().getDataSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHOOSE_COMBOBOX__DataAssignment_3"


    // $ANTLR start "rule__READ_ON__ElementAssignment_1"
    // InternalBrowserAutomation.g:2872:1: rule__READ_ON__ElementAssignment_1 : ( ruleReadable ) ;
    public final void rule__READ_ON__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2876:1: ( ( ruleReadable ) )
            // InternalBrowserAutomation.g:2877:2: ( ruleReadable )
            {
            // InternalBrowserAutomation.g:2877:2: ( ruleReadable )
            // InternalBrowserAutomation.g:2878:3: ruleReadable
            {
             before(grammarAccess.getREAD_ONAccess().getElementReadableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReadable();

            state._fsp--;

             after(grammarAccess.getREAD_ONAccess().getElementReadableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ_ON__ElementAssignment_1"


    // $ANTLR start "rule__COMBOBOX__NameAssignment_1"
    // InternalBrowserAutomation.g:2887:1: rule__COMBOBOX__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__COMBOBOX__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2891:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2892:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2892:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2893:3: RULE_STRING
            {
             before(grammarAccess.getCOMBOBOXAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCOMBOBOXAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMBOBOX__NameAssignment_1"


    // $ANTLR start "rule__CHECKBOX__NameAssignment_1"
    // InternalBrowserAutomation.g:2902:1: rule__CHECKBOX__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CHECKBOX__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2906:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2907:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2907:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2908:3: RULE_STRING
            {
             before(grammarAccess.getCHECKBOXAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCHECKBOXAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECKBOX__NameAssignment_1"


    // $ANTLR start "rule__SEARCH_FIELD__NameAssignment_1"
    // InternalBrowserAutomation.g:2917:1: rule__SEARCH_FIELD__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SEARCH_FIELD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2921:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2922:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2922:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2923:3: RULE_STRING
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSEARCH_FIELDAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEARCH_FIELD__NameAssignment_1"


    // $ANTLR start "rule__TEXT__NameAssignment_1"
    // InternalBrowserAutomation.g:2932:1: rule__TEXT__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TEXT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2936:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2937:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2937:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2938:3: RULE_STRING
            {
             before(grammarAccess.getTEXTAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTEXTAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT__NameAssignment_1"


    // $ANTLR start "rule__BUTTON__NameAssignment_1"
    // InternalBrowserAutomation.g:2947:1: rule__BUTTON__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BUTTON__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2951:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2952:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2952:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2953:3: RULE_STRING
            {
             before(grammarAccess.getBUTTONAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBUTTONAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUTTON__NameAssignment_1"


    // $ANTLR start "rule__LINK__UrlAssignment_1"
    // InternalBrowserAutomation.g:2962:1: rule__LINK__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LINK__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2966:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2967:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2967:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2968:3: RULE_STRING
            {
             before(grammarAccess.getLINKAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLINKAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LINK__UrlAssignment_1"


    // $ANTLR start "rule__IMAGE__NameAssignment_1"
    // InternalBrowserAutomation.g:2977:1: rule__IMAGE__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IMAGE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2981:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2982:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2982:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2983:3: RULE_STRING
            {
             before(grammarAccess.getIMAGEAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIMAGEAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__NameAssignment_1"


    // $ANTLR start "rule__IMAGE__ParamsAssignment_2_1"
    // InternalBrowserAutomation.g:2992:1: rule__IMAGE__ParamsAssignment_2_1 : ( rulePARAMS ) ;
    public final void rule__IMAGE__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2996:1: ( ( rulePARAMS ) )
            // InternalBrowserAutomation.g:2997:2: ( rulePARAMS )
            {
            // InternalBrowserAutomation.g:2997:2: ( rulePARAMS )
            // InternalBrowserAutomation.g:2998:3: rulePARAMS
            {
             before(grammarAccess.getIMAGEAccess().getParamsPARAMSParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePARAMS();

            state._fsp--;

             after(grammarAccess.getIMAGEAccess().getParamsPARAMSParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE__ParamsAssignment_2_1"


    // $ANTLR start "rule__PARAMS__KeyAssignment_0"
    // InternalBrowserAutomation.g:3007:1: rule__PARAMS__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__PARAMS__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:3011:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:3012:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:3012:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:3013:3: RULE_STRING
            {
             before(grammarAccess.getPARAMSAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPARAMSAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__KeyAssignment_0"


    // $ANTLR start "rule__PARAMS__ValueAssignment_2"
    // InternalBrowserAutomation.g:3022:1: rule__PARAMS__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PARAMS__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:3026:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:3027:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:3027:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:3028:3: RULE_STRING
            {
             before(grammarAccess.getPARAMSAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPARAMSAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMS__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000007F0306000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000007F0206002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003C800000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000012L});

}