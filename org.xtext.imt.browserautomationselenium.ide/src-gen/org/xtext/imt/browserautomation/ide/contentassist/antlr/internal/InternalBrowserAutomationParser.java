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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'uncheck'", "'check'", "'ALL'", "'Test'", "'end'", "'element'", "'='", "'find'", "'{'", "'}'", "'['", "']'", "'openBrowser'", "'openpage'", "'clickOn'", "'verify'", "'insert'", "'choosecombo'", "'read'", "'combobox'", "'checkbox'", "'searchfield'", "'text'", "'button'", "'link'", "'image'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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


    // $ANTLR start "entryRuleOPEN_BROWSER"
    // InternalBrowserAutomation.g:178:1: entryRuleOPEN_BROWSER : ruleOPEN_BROWSER EOF ;
    public final void entryRuleOPEN_BROWSER() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleOPEN_BROWSER EOF )
            // InternalBrowserAutomation.g:180:1: ruleOPEN_BROWSER EOF
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
    // InternalBrowserAutomation.g:187:1: ruleOPEN_BROWSER : ( ( rule__OPEN_BROWSER__Group__0 ) ) ;
    public final void ruleOPEN_BROWSER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__OPEN_BROWSER__Group__0 ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__OPEN_BROWSER__Group__0 ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__OPEN_BROWSER__Group__0 ) )
            // InternalBrowserAutomation.g:193:3: ( rule__OPEN_BROWSER__Group__0 )
            {
             before(grammarAccess.getOPEN_BROWSERAccess().getGroup()); 
            // InternalBrowserAutomation.g:194:3: ( rule__OPEN_BROWSER__Group__0 )
            // InternalBrowserAutomation.g:194:4: rule__OPEN_BROWSER__Group__0
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
    // InternalBrowserAutomation.g:203:1: entryRuleGO_TO_URL : ruleGO_TO_URL EOF ;
    public final void entryRuleGO_TO_URL() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleGO_TO_URL EOF )
            // InternalBrowserAutomation.g:205:1: ruleGO_TO_URL EOF
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
    // InternalBrowserAutomation.g:212:1: ruleGO_TO_URL : ( ( rule__GO_TO_URL__Group__0 ) ) ;
    public final void ruleGO_TO_URL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__GO_TO_URL__Group__0 ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__GO_TO_URL__Group__0 ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__GO_TO_URL__Group__0 ) )
            // InternalBrowserAutomation.g:218:3: ( rule__GO_TO_URL__Group__0 )
            {
             before(grammarAccess.getGO_TO_URLAccess().getGroup()); 
            // InternalBrowserAutomation.g:219:3: ( rule__GO_TO_URL__Group__0 )
            // InternalBrowserAutomation.g:219:4: rule__GO_TO_URL__Group__0
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
    // InternalBrowserAutomation.g:228:1: entryRuleCLICK_ON : ruleCLICK_ON EOF ;
    public final void entryRuleCLICK_ON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleCLICK_ON EOF )
            // InternalBrowserAutomation.g:230:1: ruleCLICK_ON EOF
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
    // InternalBrowserAutomation.g:237:1: ruleCLICK_ON : ( ( rule__CLICK_ON__Group__0 ) ) ;
    public final void ruleCLICK_ON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__CLICK_ON__Group__0 ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__CLICK_ON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__CLICK_ON__Group__0 ) )
            // InternalBrowserAutomation.g:243:3: ( rule__CLICK_ON__Group__0 )
            {
             before(grammarAccess.getCLICK_ONAccess().getGroup()); 
            // InternalBrowserAutomation.g:244:3: ( rule__CLICK_ON__Group__0 )
            // InternalBrowserAutomation.g:244:4: rule__CLICK_ON__Group__0
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
    // InternalBrowserAutomation.g:253:1: entryRuleVERIFY_THAT : ruleVERIFY_THAT EOF ;
    public final void entryRuleVERIFY_THAT() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleVERIFY_THAT EOF )
            // InternalBrowserAutomation.g:255:1: ruleVERIFY_THAT EOF
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
    // InternalBrowserAutomation.g:262:1: ruleVERIFY_THAT : ( ( rule__VERIFY_THAT__Group__0 ) ) ;
    public final void ruleVERIFY_THAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__VERIFY_THAT__Group__0 ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__VERIFY_THAT__Group__0 ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__VERIFY_THAT__Group__0 ) )
            // InternalBrowserAutomation.g:268:3: ( rule__VERIFY_THAT__Group__0 )
            {
             before(grammarAccess.getVERIFY_THATAccess().getGroup()); 
            // InternalBrowserAutomation.g:269:3: ( rule__VERIFY_THAT__Group__0 )
            // InternalBrowserAutomation.g:269:4: rule__VERIFY_THAT__Group__0
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
    // InternalBrowserAutomation.g:278:1: entryRuleINSERT_ON : ruleINSERT_ON EOF ;
    public final void entryRuleINSERT_ON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleINSERT_ON EOF )
            // InternalBrowserAutomation.g:280:1: ruleINSERT_ON EOF
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
    // InternalBrowserAutomation.g:287:1: ruleINSERT_ON : ( ( rule__INSERT_ON__Group__0 ) ) ;
    public final void ruleINSERT_ON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__INSERT_ON__Group__0 ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__INSERT_ON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__INSERT_ON__Group__0 ) )
            // InternalBrowserAutomation.g:293:3: ( rule__INSERT_ON__Group__0 )
            {
             before(grammarAccess.getINSERT_ONAccess().getGroup()); 
            // InternalBrowserAutomation.g:294:3: ( rule__INSERT_ON__Group__0 )
            // InternalBrowserAutomation.g:294:4: rule__INSERT_ON__Group__0
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
    // InternalBrowserAutomation.g:303:1: entryRuleCHECK_BOXE : ruleCHECK_BOXE EOF ;
    public final void entryRuleCHECK_BOXE() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleCHECK_BOXE EOF )
            // InternalBrowserAutomation.g:305:1: ruleCHECK_BOXE EOF
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
    // InternalBrowserAutomation.g:312:1: ruleCHECK_BOXE : ( ( rule__CHECK_BOXE__Group__0 ) ) ;
    public final void ruleCHECK_BOXE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__CHECK_BOXE__Group__0 ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__CHECK_BOXE__Group__0 ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__CHECK_BOXE__Group__0 ) )
            // InternalBrowserAutomation.g:318:3: ( rule__CHECK_BOXE__Group__0 )
            {
             before(grammarAccess.getCHECK_BOXEAccess().getGroup()); 
            // InternalBrowserAutomation.g:319:3: ( rule__CHECK_BOXE__Group__0 )
            // InternalBrowserAutomation.g:319:4: rule__CHECK_BOXE__Group__0
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
    // InternalBrowserAutomation.g:328:1: entryRuleCHOOSE_COMBOBOX : ruleCHOOSE_COMBOBOX EOF ;
    public final void entryRuleCHOOSE_COMBOBOX() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleCHOOSE_COMBOBOX EOF )
            // InternalBrowserAutomation.g:330:1: ruleCHOOSE_COMBOBOX EOF
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
    // InternalBrowserAutomation.g:337:1: ruleCHOOSE_COMBOBOX : ( ( rule__CHOOSE_COMBOBOX__Group__0 ) ) ;
    public final void ruleCHOOSE_COMBOBOX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__CHOOSE_COMBOBOX__Group__0 ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__CHOOSE_COMBOBOX__Group__0 ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__CHOOSE_COMBOBOX__Group__0 ) )
            // InternalBrowserAutomation.g:343:3: ( rule__CHOOSE_COMBOBOX__Group__0 )
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getGroup()); 
            // InternalBrowserAutomation.g:344:3: ( rule__CHOOSE_COMBOBOX__Group__0 )
            // InternalBrowserAutomation.g:344:4: rule__CHOOSE_COMBOBOX__Group__0
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
    // InternalBrowserAutomation.g:353:1: entryRuleREAD_ON : ruleREAD_ON EOF ;
    public final void entryRuleREAD_ON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:354:1: ( ruleREAD_ON EOF )
            // InternalBrowserAutomation.g:355:1: ruleREAD_ON EOF
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
    // InternalBrowserAutomation.g:362:1: ruleREAD_ON : ( ( rule__READ_ON__Group__0 ) ) ;
    public final void ruleREAD_ON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:2: ( ( ( rule__READ_ON__Group__0 ) ) )
            // InternalBrowserAutomation.g:367:2: ( ( rule__READ_ON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:367:2: ( ( rule__READ_ON__Group__0 ) )
            // InternalBrowserAutomation.g:368:3: ( rule__READ_ON__Group__0 )
            {
             before(grammarAccess.getREAD_ONAccess().getGroup()); 
            // InternalBrowserAutomation.g:369:3: ( rule__READ_ON__Group__0 )
            // InternalBrowserAutomation.g:369:4: rule__READ_ON__Group__0
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
    // InternalBrowserAutomation.g:378:1: entryRuleReadable : ruleReadable EOF ;
    public final void entryRuleReadable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:379:1: ( ruleReadable EOF )
            // InternalBrowserAutomation.g:380:1: ruleReadable EOF
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
    // InternalBrowserAutomation.g:387:1: ruleReadable : ( ( rule__Readable__Alternatives ) ) ;
    public final void ruleReadable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:2: ( ( ( rule__Readable__Alternatives ) ) )
            // InternalBrowserAutomation.g:392:2: ( ( rule__Readable__Alternatives ) )
            {
            // InternalBrowserAutomation.g:392:2: ( ( rule__Readable__Alternatives ) )
            // InternalBrowserAutomation.g:393:3: ( rule__Readable__Alternatives )
            {
             before(grammarAccess.getReadableAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:394:3: ( rule__Readable__Alternatives )
            // InternalBrowserAutomation.g:394:4: rule__Readable__Alternatives
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
    // InternalBrowserAutomation.g:403:1: entryRuleInsertable : ruleInsertable EOF ;
    public final void entryRuleInsertable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:404:1: ( ruleInsertable EOF )
            // InternalBrowserAutomation.g:405:1: ruleInsertable EOF
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
    // InternalBrowserAutomation.g:412:1: ruleInsertable : ( ruleSEARCH_FIELD ) ;
    public final void ruleInsertable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:416:2: ( ( ruleSEARCH_FIELD ) )
            // InternalBrowserAutomation.g:417:2: ( ruleSEARCH_FIELD )
            {
            // InternalBrowserAutomation.g:417:2: ( ruleSEARCH_FIELD )
            // InternalBrowserAutomation.g:418:3: ruleSEARCH_FIELD
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
    // InternalBrowserAutomation.g:428:1: entryRuleVerifiable : ruleVerifiable EOF ;
    public final void entryRuleVerifiable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:429:1: ( ruleVerifiable EOF )
            // InternalBrowserAutomation.g:430:1: ruleVerifiable EOF
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
    // InternalBrowserAutomation.g:437:1: ruleVerifiable : ( ( rule__Verifiable__Alternatives ) ) ;
    public final void ruleVerifiable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:441:2: ( ( ( rule__Verifiable__Alternatives ) ) )
            // InternalBrowserAutomation.g:442:2: ( ( rule__Verifiable__Alternatives ) )
            {
            // InternalBrowserAutomation.g:442:2: ( ( rule__Verifiable__Alternatives ) )
            // InternalBrowserAutomation.g:443:3: ( rule__Verifiable__Alternatives )
            {
             before(grammarAccess.getVerifiableAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:444:3: ( rule__Verifiable__Alternatives )
            // InternalBrowserAutomation.g:444:4: rule__Verifiable__Alternatives
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
    // InternalBrowserAutomation.g:453:1: entryRuleClickable : ruleClickable EOF ;
    public final void entryRuleClickable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:454:1: ( ruleClickable EOF )
            // InternalBrowserAutomation.g:455:1: ruleClickable EOF
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
    // InternalBrowserAutomation.g:462:1: ruleClickable : ( ( rule__Clickable__Alternatives ) ) ;
    public final void ruleClickable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:466:2: ( ( ( rule__Clickable__Alternatives ) ) )
            // InternalBrowserAutomation.g:467:2: ( ( rule__Clickable__Alternatives ) )
            {
            // InternalBrowserAutomation.g:467:2: ( ( rule__Clickable__Alternatives ) )
            // InternalBrowserAutomation.g:468:3: ( rule__Clickable__Alternatives )
            {
             before(grammarAccess.getClickableAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:469:3: ( rule__Clickable__Alternatives )
            // InternalBrowserAutomation.g:469:4: rule__Clickable__Alternatives
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
    // InternalBrowserAutomation.g:478:1: entryRuleCOMBOBOX : ruleCOMBOBOX EOF ;
    public final void entryRuleCOMBOBOX() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:479:1: ( ruleCOMBOBOX EOF )
            // InternalBrowserAutomation.g:480:1: ruleCOMBOBOX EOF
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
    // InternalBrowserAutomation.g:487:1: ruleCOMBOBOX : ( ( rule__COMBOBOX__Group__0 ) ) ;
    public final void ruleCOMBOBOX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:491:2: ( ( ( rule__COMBOBOX__Group__0 ) ) )
            // InternalBrowserAutomation.g:492:2: ( ( rule__COMBOBOX__Group__0 ) )
            {
            // InternalBrowserAutomation.g:492:2: ( ( rule__COMBOBOX__Group__0 ) )
            // InternalBrowserAutomation.g:493:3: ( rule__COMBOBOX__Group__0 )
            {
             before(grammarAccess.getCOMBOBOXAccess().getGroup()); 
            // InternalBrowserAutomation.g:494:3: ( rule__COMBOBOX__Group__0 )
            // InternalBrowserAutomation.g:494:4: rule__COMBOBOX__Group__0
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
    // InternalBrowserAutomation.g:503:1: entryRuleCHECKBOX : ruleCHECKBOX EOF ;
    public final void entryRuleCHECKBOX() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:504:1: ( ruleCHECKBOX EOF )
            // InternalBrowserAutomation.g:505:1: ruleCHECKBOX EOF
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
    // InternalBrowserAutomation.g:512:1: ruleCHECKBOX : ( ( rule__CHECKBOX__Group__0 ) ) ;
    public final void ruleCHECKBOX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:516:2: ( ( ( rule__CHECKBOX__Group__0 ) ) )
            // InternalBrowserAutomation.g:517:2: ( ( rule__CHECKBOX__Group__0 ) )
            {
            // InternalBrowserAutomation.g:517:2: ( ( rule__CHECKBOX__Group__0 ) )
            // InternalBrowserAutomation.g:518:3: ( rule__CHECKBOX__Group__0 )
            {
             before(grammarAccess.getCHECKBOXAccess().getGroup()); 
            // InternalBrowserAutomation.g:519:3: ( rule__CHECKBOX__Group__0 )
            // InternalBrowserAutomation.g:519:4: rule__CHECKBOX__Group__0
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
    // InternalBrowserAutomation.g:528:1: entryRuleSEARCH_FIELD : ruleSEARCH_FIELD EOF ;
    public final void entryRuleSEARCH_FIELD() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:529:1: ( ruleSEARCH_FIELD EOF )
            // InternalBrowserAutomation.g:530:1: ruleSEARCH_FIELD EOF
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
    // InternalBrowserAutomation.g:537:1: ruleSEARCH_FIELD : ( ( rule__SEARCH_FIELD__Group__0 ) ) ;
    public final void ruleSEARCH_FIELD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:541:2: ( ( ( rule__SEARCH_FIELD__Group__0 ) ) )
            // InternalBrowserAutomation.g:542:2: ( ( rule__SEARCH_FIELD__Group__0 ) )
            {
            // InternalBrowserAutomation.g:542:2: ( ( rule__SEARCH_FIELD__Group__0 ) )
            // InternalBrowserAutomation.g:543:3: ( rule__SEARCH_FIELD__Group__0 )
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getGroup()); 
            // InternalBrowserAutomation.g:544:3: ( rule__SEARCH_FIELD__Group__0 )
            // InternalBrowserAutomation.g:544:4: rule__SEARCH_FIELD__Group__0
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
    // InternalBrowserAutomation.g:553:1: entryRuleTEXT : ruleTEXT EOF ;
    public final void entryRuleTEXT() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:554:1: ( ruleTEXT EOF )
            // InternalBrowserAutomation.g:555:1: ruleTEXT EOF
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
    // InternalBrowserAutomation.g:562:1: ruleTEXT : ( ( rule__TEXT__Group__0 ) ) ;
    public final void ruleTEXT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:566:2: ( ( ( rule__TEXT__Group__0 ) ) )
            // InternalBrowserAutomation.g:567:2: ( ( rule__TEXT__Group__0 ) )
            {
            // InternalBrowserAutomation.g:567:2: ( ( rule__TEXT__Group__0 ) )
            // InternalBrowserAutomation.g:568:3: ( rule__TEXT__Group__0 )
            {
             before(grammarAccess.getTEXTAccess().getGroup()); 
            // InternalBrowserAutomation.g:569:3: ( rule__TEXT__Group__0 )
            // InternalBrowserAutomation.g:569:4: rule__TEXT__Group__0
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
    // InternalBrowserAutomation.g:578:1: entryRuleBUTTON : ruleBUTTON EOF ;
    public final void entryRuleBUTTON() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:579:1: ( ruleBUTTON EOF )
            // InternalBrowserAutomation.g:580:1: ruleBUTTON EOF
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
    // InternalBrowserAutomation.g:587:1: ruleBUTTON : ( ( rule__BUTTON__Group__0 ) ) ;
    public final void ruleBUTTON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:591:2: ( ( ( rule__BUTTON__Group__0 ) ) )
            // InternalBrowserAutomation.g:592:2: ( ( rule__BUTTON__Group__0 ) )
            {
            // InternalBrowserAutomation.g:592:2: ( ( rule__BUTTON__Group__0 ) )
            // InternalBrowserAutomation.g:593:3: ( rule__BUTTON__Group__0 )
            {
             before(grammarAccess.getBUTTONAccess().getGroup()); 
            // InternalBrowserAutomation.g:594:3: ( rule__BUTTON__Group__0 )
            // InternalBrowserAutomation.g:594:4: rule__BUTTON__Group__0
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
    // InternalBrowserAutomation.g:603:1: entryRuleLINK : ruleLINK EOF ;
    public final void entryRuleLINK() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:604:1: ( ruleLINK EOF )
            // InternalBrowserAutomation.g:605:1: ruleLINK EOF
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
    // InternalBrowserAutomation.g:612:1: ruleLINK : ( ( rule__LINK__Group__0 ) ) ;
    public final void ruleLINK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:616:2: ( ( ( rule__LINK__Group__0 ) ) )
            // InternalBrowserAutomation.g:617:2: ( ( rule__LINK__Group__0 ) )
            {
            // InternalBrowserAutomation.g:617:2: ( ( rule__LINK__Group__0 ) )
            // InternalBrowserAutomation.g:618:3: ( rule__LINK__Group__0 )
            {
             before(grammarAccess.getLINKAccess().getGroup()); 
            // InternalBrowserAutomation.g:619:3: ( rule__LINK__Group__0 )
            // InternalBrowserAutomation.g:619:4: rule__LINK__Group__0
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
    // InternalBrowserAutomation.g:628:1: entryRuleIMAGE : ruleIMAGE EOF ;
    public final void entryRuleIMAGE() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:629:1: ( ruleIMAGE EOF )
            // InternalBrowserAutomation.g:630:1: ruleIMAGE EOF
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
    // InternalBrowserAutomation.g:637:1: ruleIMAGE : ( ( rule__IMAGE__Group__0 ) ) ;
    public final void ruleIMAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:641:2: ( ( ( rule__IMAGE__Group__0 ) ) )
            // InternalBrowserAutomation.g:642:2: ( ( rule__IMAGE__Group__0 ) )
            {
            // InternalBrowserAutomation.g:642:2: ( ( rule__IMAGE__Group__0 ) )
            // InternalBrowserAutomation.g:643:3: ( rule__IMAGE__Group__0 )
            {
             before(grammarAccess.getIMAGEAccess().getGroup()); 
            // InternalBrowserAutomation.g:644:3: ( rule__IMAGE__Group__0 )
            // InternalBrowserAutomation.g:644:4: rule__IMAGE__Group__0
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
    // InternalBrowserAutomation.g:653:1: entryRulePARAMS : rulePARAMS EOF ;
    public final void entryRulePARAMS() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:654:1: ( rulePARAMS EOF )
            // InternalBrowserAutomation.g:655:1: rulePARAMS EOF
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
    // InternalBrowserAutomation.g:662:1: rulePARAMS : ( ( rule__PARAMS__Group__0 ) ) ;
    public final void rulePARAMS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:666:2: ( ( ( rule__PARAMS__Group__0 ) ) )
            // InternalBrowserAutomation.g:667:2: ( ( rule__PARAMS__Group__0 ) )
            {
            // InternalBrowserAutomation.g:667:2: ( ( rule__PARAMS__Group__0 ) )
            // InternalBrowserAutomation.g:668:3: ( rule__PARAMS__Group__0 )
            {
             before(grammarAccess.getPARAMSAccess().getGroup()); 
            // InternalBrowserAutomation.g:669:3: ( rule__PARAMS__Group__0 )
            // InternalBrowserAutomation.g:669:4: rule__PARAMS__Group__0
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
    // InternalBrowserAutomation.g:677:1: rule__Instruction__Alternatives : ( ( ruleAFFECTATION ) | ( ruleOPEN_BROWSER ) | ( ruleGO_TO_URL ) | ( ruleCLICK_ON ) | ( ruleVERIFY_THAT ) | ( ruleINSERT_ON ) | ( ruleCHECK_BOXE ) | ( ruleCHOOSE_COMBOBOX ) | ( ruleREAD_ON ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:681:1: ( ( ruleAFFECTATION ) | ( ruleOPEN_BROWSER ) | ( ruleGO_TO_URL ) | ( ruleCLICK_ON ) | ( ruleVERIFY_THAT ) | ( ruleINSERT_ON ) | ( ruleCHECK_BOXE ) | ( ruleCHOOSE_COMBOBOX ) | ( ruleREAD_ON ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 27:
                {
                alt1=6;
                }
                break;
            case 11:
            case 12:
                {
                alt1=7;
                }
                break;
            case 28:
                {
                alt1=8;
                }
                break;
            case 29:
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
                    // InternalBrowserAutomation.g:682:2: ( ruleAFFECTATION )
                    {
                    // InternalBrowserAutomation.g:682:2: ( ruleAFFECTATION )
                    // InternalBrowserAutomation.g:683:3: ruleAFFECTATION
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
                    // InternalBrowserAutomation.g:688:2: ( ruleOPEN_BROWSER )
                    {
                    // InternalBrowserAutomation.g:688:2: ( ruleOPEN_BROWSER )
                    // InternalBrowserAutomation.g:689:3: ruleOPEN_BROWSER
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
                    // InternalBrowserAutomation.g:694:2: ( ruleGO_TO_URL )
                    {
                    // InternalBrowserAutomation.g:694:2: ( ruleGO_TO_URL )
                    // InternalBrowserAutomation.g:695:3: ruleGO_TO_URL
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
                    // InternalBrowserAutomation.g:700:2: ( ruleCLICK_ON )
                    {
                    // InternalBrowserAutomation.g:700:2: ( ruleCLICK_ON )
                    // InternalBrowserAutomation.g:701:3: ruleCLICK_ON
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
                    // InternalBrowserAutomation.g:706:2: ( ruleVERIFY_THAT )
                    {
                    // InternalBrowserAutomation.g:706:2: ( ruleVERIFY_THAT )
                    // InternalBrowserAutomation.g:707:3: ruleVERIFY_THAT
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
                    // InternalBrowserAutomation.g:712:2: ( ruleINSERT_ON )
                    {
                    // InternalBrowserAutomation.g:712:2: ( ruleINSERT_ON )
                    // InternalBrowserAutomation.g:713:3: ruleINSERT_ON
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
                    // InternalBrowserAutomation.g:718:2: ( ruleCHECK_BOXE )
                    {
                    // InternalBrowserAutomation.g:718:2: ( ruleCHECK_BOXE )
                    // InternalBrowserAutomation.g:719:3: ruleCHECK_BOXE
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
                    // InternalBrowserAutomation.g:724:2: ( ruleCHOOSE_COMBOBOX )
                    {
                    // InternalBrowserAutomation.g:724:2: ( ruleCHOOSE_COMBOBOX )
                    // InternalBrowserAutomation.g:725:3: ruleCHOOSE_COMBOBOX
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
                    // InternalBrowserAutomation.g:730:2: ( ruleREAD_ON )
                    {
                    // InternalBrowserAutomation.g:730:2: ( ruleREAD_ON )
                    // InternalBrowserAutomation.g:731:3: ruleREAD_ON
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


    // $ANTLR start "rule__INSERT_ON__DataAlternatives_2_0"
    // InternalBrowserAutomation.g:740:1: rule__INSERT_ON__DataAlternatives_2_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__INSERT_ON__DataAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:744:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:745:2: ( RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:745:2: ( RULE_STRING )
                    // InternalBrowserAutomation.g:746:3: RULE_STRING
                    {
                     before(grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:751:2: ( RULE_ID )
                    {
                    // InternalBrowserAutomation.g:751:2: ( RULE_ID )
                    // InternalBrowserAutomation.g:752:3: RULE_ID
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
    // InternalBrowserAutomation.g:761:1: rule__CHECK_BOXE__Alternatives_0 : ( ( 'uncheck' ) | ( 'check' ) );
    public final void rule__CHECK_BOXE__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:765:1: ( ( 'uncheck' ) | ( 'check' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:766:2: ( 'uncheck' )
                    {
                    // InternalBrowserAutomation.g:766:2: ( 'uncheck' )
                    // InternalBrowserAutomation.g:767:3: 'uncheck'
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:772:2: ( 'check' )
                    {
                    // InternalBrowserAutomation.g:772:2: ( 'check' )
                    // InternalBrowserAutomation.g:773:3: 'check'
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:782:1: rule__CHECK_BOXE__Alternatives_1 : ( ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* ) | ( 'ALL' ) );
    public final void rule__CHECK_BOXE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:786:1: ( ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* ) | ( 'ALL' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=15 && LA5_0<=16)||(LA5_0>=23 && LA5_0<=29)||LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:787:2: ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* )
                    {
                    // InternalBrowserAutomation.g:787:2: ( ( rule__CHECK_BOXE__ElementAssignment_1_0 )* )
                    // InternalBrowserAutomation.g:788:3: ( rule__CHECK_BOXE__ElementAssignment_1_0 )*
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getElementAssignment_1_0()); 
                    // InternalBrowserAutomation.g:789:3: ( rule__CHECK_BOXE__ElementAssignment_1_0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==31) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBrowserAutomation.g:789:4: rule__CHECK_BOXE__ElementAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__CHECK_BOXE__ElementAssignment_1_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getCHECK_BOXEAccess().getElementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:793:2: ( 'ALL' )
                    {
                    // InternalBrowserAutomation.g:793:2: ( 'ALL' )
                    // InternalBrowserAutomation.g:794:3: 'ALL'
                    {
                     before(grammarAccess.getCHECK_BOXEAccess().getALLKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:803:1: rule__Readable__Alternatives : ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) );
    public final void rule__Readable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:807:1: ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomation.g:808:2: ( ruleTEXT )
                    {
                    // InternalBrowserAutomation.g:808:2: ( ruleTEXT )
                    // InternalBrowserAutomation.g:809:3: ruleTEXT
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
                    // InternalBrowserAutomation.g:814:2: ( ruleBUTTON )
                    {
                    // InternalBrowserAutomation.g:814:2: ( ruleBUTTON )
                    // InternalBrowserAutomation.g:815:3: ruleBUTTON
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
                    // InternalBrowserAutomation.g:820:2: ( ruleLINK )
                    {
                    // InternalBrowserAutomation.g:820:2: ( ruleLINK )
                    // InternalBrowserAutomation.g:821:3: ruleLINK
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
    // InternalBrowserAutomation.g:830:1: rule__Verifiable__Alternatives : ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleRefElement ) );
    public final void rule__Verifiable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:834:1: ( ( ruleTEXT ) | ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleRefElement ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:835:2: ( ruleTEXT )
                    {
                    // InternalBrowserAutomation.g:835:2: ( ruleTEXT )
                    // InternalBrowserAutomation.g:836:3: ruleTEXT
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
                    // InternalBrowserAutomation.g:841:2: ( ruleBUTTON )
                    {
                    // InternalBrowserAutomation.g:841:2: ( ruleBUTTON )
                    // InternalBrowserAutomation.g:842:3: ruleBUTTON
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
                    // InternalBrowserAutomation.g:847:2: ( ruleLINK )
                    {
                    // InternalBrowserAutomation.g:847:2: ( ruleLINK )
                    // InternalBrowserAutomation.g:848:3: ruleLINK
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
                    // InternalBrowserAutomation.g:853:2: ( ruleIMAGE )
                    {
                    // InternalBrowserAutomation.g:853:2: ( ruleIMAGE )
                    // InternalBrowserAutomation.g:854:3: ruleIMAGE
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
                    // InternalBrowserAutomation.g:859:2: ( ruleRefElement )
                    {
                    // InternalBrowserAutomation.g:859:2: ( ruleRefElement )
                    // InternalBrowserAutomation.g:860:3: ruleRefElement
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
    // InternalBrowserAutomation.g:869:1: rule__Clickable__Alternatives : ( ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleCOMBOBOX ) | ( ruleRefElement ) );
    public final void rule__Clickable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:873:1: ( ( ruleBUTTON ) | ( ruleLINK ) | ( ruleIMAGE ) | ( ruleCOMBOBOX ) | ( ruleRefElement ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 30:
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
                    // InternalBrowserAutomation.g:874:2: ( ruleBUTTON )
                    {
                    // InternalBrowserAutomation.g:874:2: ( ruleBUTTON )
                    // InternalBrowserAutomation.g:875:3: ruleBUTTON
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
                    // InternalBrowserAutomation.g:880:2: ( ruleLINK )
                    {
                    // InternalBrowserAutomation.g:880:2: ( ruleLINK )
                    // InternalBrowserAutomation.g:881:3: ruleLINK
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
                    // InternalBrowserAutomation.g:886:2: ( ruleIMAGE )
                    {
                    // InternalBrowserAutomation.g:886:2: ( ruleIMAGE )
                    // InternalBrowserAutomation.g:887:3: ruleIMAGE
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
                    // InternalBrowserAutomation.g:892:2: ( ruleCOMBOBOX )
                    {
                    // InternalBrowserAutomation.g:892:2: ( ruleCOMBOBOX )
                    // InternalBrowserAutomation.g:893:3: ruleCOMBOBOX
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
                    // InternalBrowserAutomation.g:898:2: ( ruleRefElement )
                    {
                    // InternalBrowserAutomation.g:898:2: ( ruleRefElement )
                    // InternalBrowserAutomation.g:899:3: ruleRefElement
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
    // InternalBrowserAutomation.g:908:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:912:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserAutomation.g:913:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalBrowserAutomation.g:920:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:924:1: ( ( () ) )
            // InternalBrowserAutomation.g:925:1: ( () )
            {
            // InternalBrowserAutomation.g:925:1: ( () )
            // InternalBrowserAutomation.g:926:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalBrowserAutomation.g:927:2: ()
            // InternalBrowserAutomation.g:927:3: 
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
    // InternalBrowserAutomation.g:935:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:939:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserAutomation.g:940:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalBrowserAutomation.g:947:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:951:1: ( ( 'Test' ) )
            // InternalBrowserAutomation.g:952:1: ( 'Test' )
            {
            // InternalBrowserAutomation.g:952:1: ( 'Test' )
            // InternalBrowserAutomation.g:953:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:962:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:966:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalBrowserAutomation.g:967:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalBrowserAutomation.g:974:1: rule__Test__Group__2__Impl : ( ( rule__Test__NameAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:978:1: ( ( ( rule__Test__NameAssignment_2 ) ) )
            // InternalBrowserAutomation.g:979:1: ( ( rule__Test__NameAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:979:1: ( ( rule__Test__NameAssignment_2 ) )
            // InternalBrowserAutomation.g:980:2: ( rule__Test__NameAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_2()); 
            // InternalBrowserAutomation.g:981:2: ( rule__Test__NameAssignment_2 )
            // InternalBrowserAutomation.g:981:3: rule__Test__NameAssignment_2
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
    // InternalBrowserAutomation.g:989:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:993:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalBrowserAutomation.g:994:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalBrowserAutomation.g:1001:1: rule__Test__Group__3__Impl : ( ( rule__Test__InstructionsAssignment_3 )* ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1005:1: ( ( ( rule__Test__InstructionsAssignment_3 )* ) )
            // InternalBrowserAutomation.g:1006:1: ( ( rule__Test__InstructionsAssignment_3 )* )
            {
            // InternalBrowserAutomation.g:1006:1: ( ( rule__Test__InstructionsAssignment_3 )* )
            // InternalBrowserAutomation.g:1007:2: ( rule__Test__InstructionsAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getInstructionsAssignment_3()); 
            // InternalBrowserAutomation.g:1008:2: ( rule__Test__InstructionsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)||LA9_0==16||(LA9_0>=23 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBrowserAutomation.g:1008:3: rule__Test__InstructionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Test__InstructionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getInstructionsAssignment_3()); 

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
    // InternalBrowserAutomation.g:1016:1: rule__Test__Group__4 : rule__Test__Group__4__Impl ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1020:1: ( rule__Test__Group__4__Impl )
            // InternalBrowserAutomation.g:1021:2: rule__Test__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__4__Impl();

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
    // InternalBrowserAutomation.g:1027:1: rule__Test__Group__4__Impl : ( 'end' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1031:1: ( ( 'end' ) )
            // InternalBrowserAutomation.g:1032:1: ( 'end' )
            {
            // InternalBrowserAutomation.g:1032:1: ( 'end' )
            // InternalBrowserAutomation.g:1033:2: 'end'
            {
             before(grammarAccess.getTestAccess().getEndKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEndKeyword_4()); 

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


    // $ANTLR start "rule__AFFECTATION__Group__0"
    // InternalBrowserAutomation.g:1043:1: rule__AFFECTATION__Group__0 : rule__AFFECTATION__Group__0__Impl rule__AFFECTATION__Group__1 ;
    public final void rule__AFFECTATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1047:1: ( rule__AFFECTATION__Group__0__Impl rule__AFFECTATION__Group__1 )
            // InternalBrowserAutomation.g:1048:2: rule__AFFECTATION__Group__0__Impl rule__AFFECTATION__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBrowserAutomation.g:1055:1: rule__AFFECTATION__Group__0__Impl : ( 'element' ) ;
    public final void rule__AFFECTATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1059:1: ( ( 'element' ) )
            // InternalBrowserAutomation.g:1060:1: ( 'element' )
            {
            // InternalBrowserAutomation.g:1060:1: ( 'element' )
            // InternalBrowserAutomation.g:1061:2: 'element'
            {
             before(grammarAccess.getAFFECTATIONAccess().getElementKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1070:1: rule__AFFECTATION__Group__1 : rule__AFFECTATION__Group__1__Impl rule__AFFECTATION__Group__2 ;
    public final void rule__AFFECTATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1074:1: ( rule__AFFECTATION__Group__1__Impl rule__AFFECTATION__Group__2 )
            // InternalBrowserAutomation.g:1075:2: rule__AFFECTATION__Group__1__Impl rule__AFFECTATION__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBrowserAutomation.g:1082:1: rule__AFFECTATION__Group__1__Impl : ( ( rule__AFFECTATION__NameAssignment_1 ) ) ;
    public final void rule__AFFECTATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1086:1: ( ( ( rule__AFFECTATION__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1087:1: ( ( rule__AFFECTATION__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1087:1: ( ( rule__AFFECTATION__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:1088:2: ( rule__AFFECTATION__NameAssignment_1 )
            {
             before(grammarAccess.getAFFECTATIONAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:1089:2: ( rule__AFFECTATION__NameAssignment_1 )
            // InternalBrowserAutomation.g:1089:3: rule__AFFECTATION__NameAssignment_1
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
    // InternalBrowserAutomation.g:1097:1: rule__AFFECTATION__Group__2 : rule__AFFECTATION__Group__2__Impl rule__AFFECTATION__Group__3 ;
    public final void rule__AFFECTATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1101:1: ( rule__AFFECTATION__Group__2__Impl rule__AFFECTATION__Group__3 )
            // InternalBrowserAutomation.g:1102:2: rule__AFFECTATION__Group__2__Impl rule__AFFECTATION__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBrowserAutomation.g:1109:1: rule__AFFECTATION__Group__2__Impl : ( '=' ) ;
    public final void rule__AFFECTATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1113:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:1114:1: ( '=' )
            {
            // InternalBrowserAutomation.g:1114:1: ( '=' )
            // InternalBrowserAutomation.g:1115:2: '='
            {
             before(grammarAccess.getAFFECTATIONAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1124:1: rule__AFFECTATION__Group__3 : rule__AFFECTATION__Group__3__Impl ;
    public final void rule__AFFECTATION__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1128:1: ( rule__AFFECTATION__Group__3__Impl )
            // InternalBrowserAutomation.g:1129:2: rule__AFFECTATION__Group__3__Impl
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
    // InternalBrowserAutomation.g:1135:1: rule__AFFECTATION__Group__3__Impl : ( ( rule__AFFECTATION__SelectorAssignment_3 ) ) ;
    public final void rule__AFFECTATION__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1139:1: ( ( ( rule__AFFECTATION__SelectorAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1140:1: ( ( rule__AFFECTATION__SelectorAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1140:1: ( ( rule__AFFECTATION__SelectorAssignment_3 ) )
            // InternalBrowserAutomation.g:1141:2: ( rule__AFFECTATION__SelectorAssignment_3 )
            {
             before(grammarAccess.getAFFECTATIONAccess().getSelectorAssignment_3()); 
            // InternalBrowserAutomation.g:1142:2: ( rule__AFFECTATION__SelectorAssignment_3 )
            // InternalBrowserAutomation.g:1142:3: rule__AFFECTATION__SelectorAssignment_3
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
    // InternalBrowserAutomation.g:1151:1: rule__SELECTOR__Group__0 : rule__SELECTOR__Group__0__Impl rule__SELECTOR__Group__1 ;
    public final void rule__SELECTOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1155:1: ( rule__SELECTOR__Group__0__Impl rule__SELECTOR__Group__1 )
            // InternalBrowserAutomation.g:1156:2: rule__SELECTOR__Group__0__Impl rule__SELECTOR__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBrowserAutomation.g:1163:1: rule__SELECTOR__Group__0__Impl : ( 'find' ) ;
    public final void rule__SELECTOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1167:1: ( ( 'find' ) )
            // InternalBrowserAutomation.g:1168:1: ( 'find' )
            {
            // InternalBrowserAutomation.g:1168:1: ( 'find' )
            // InternalBrowserAutomation.g:1169:2: 'find'
            {
             before(grammarAccess.getSELECTORAccess().getFindKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1178:1: rule__SELECTOR__Group__1 : rule__SELECTOR__Group__1__Impl rule__SELECTOR__Group__2 ;
    public final void rule__SELECTOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1182:1: ( rule__SELECTOR__Group__1__Impl rule__SELECTOR__Group__2 )
            // InternalBrowserAutomation.g:1183:2: rule__SELECTOR__Group__1__Impl rule__SELECTOR__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBrowserAutomation.g:1190:1: rule__SELECTOR__Group__1__Impl : ( ( rule__SELECTOR__ReadableAssignment_1 ) ) ;
    public final void rule__SELECTOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1194:1: ( ( ( rule__SELECTOR__ReadableAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1195:1: ( ( rule__SELECTOR__ReadableAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1195:1: ( ( rule__SELECTOR__ReadableAssignment_1 ) )
            // InternalBrowserAutomation.g:1196:2: ( rule__SELECTOR__ReadableAssignment_1 )
            {
             before(grammarAccess.getSELECTORAccess().getReadableAssignment_1()); 
            // InternalBrowserAutomation.g:1197:2: ( rule__SELECTOR__ReadableAssignment_1 )
            // InternalBrowserAutomation.g:1197:3: rule__SELECTOR__ReadableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SELECTOR__ReadableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSELECTORAccess().getReadableAssignment_1()); 

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
    // InternalBrowserAutomation.g:1205:1: rule__SELECTOR__Group__2 : rule__SELECTOR__Group__2__Impl rule__SELECTOR__Group__3 ;
    public final void rule__SELECTOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1209:1: ( rule__SELECTOR__Group__2__Impl rule__SELECTOR__Group__3 )
            // InternalBrowserAutomation.g:1210:2: rule__SELECTOR__Group__2__Impl rule__SELECTOR__Group__3
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
    // InternalBrowserAutomation.g:1217:1: rule__SELECTOR__Group__2__Impl : ( '{' ) ;
    public final void rule__SELECTOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1221:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:1222:1: ( '{' )
            {
            // InternalBrowserAutomation.g:1222:1: ( '{' )
            // InternalBrowserAutomation.g:1223:2: '{'
            {
             before(grammarAccess.getSELECTORAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1232:1: rule__SELECTOR__Group__3 : rule__SELECTOR__Group__3__Impl rule__SELECTOR__Group__4 ;
    public final void rule__SELECTOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1236:1: ( rule__SELECTOR__Group__3__Impl rule__SELECTOR__Group__4 )
            // InternalBrowserAutomation.g:1237:2: rule__SELECTOR__Group__3__Impl rule__SELECTOR__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalBrowserAutomation.g:1244:1: rule__SELECTOR__Group__3__Impl : ( ( rule__SELECTOR__ParamsAssignment_3 ) ) ;
    public final void rule__SELECTOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1248:1: ( ( ( rule__SELECTOR__ParamsAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1249:1: ( ( rule__SELECTOR__ParamsAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1249:1: ( ( rule__SELECTOR__ParamsAssignment_3 ) )
            // InternalBrowserAutomation.g:1250:2: ( rule__SELECTOR__ParamsAssignment_3 )
            {
             before(grammarAccess.getSELECTORAccess().getParamsAssignment_3()); 
            // InternalBrowserAutomation.g:1251:2: ( rule__SELECTOR__ParamsAssignment_3 )
            // InternalBrowserAutomation.g:1251:3: rule__SELECTOR__ParamsAssignment_3
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
    // InternalBrowserAutomation.g:1259:1: rule__SELECTOR__Group__4 : rule__SELECTOR__Group__4__Impl rule__SELECTOR__Group__5 ;
    public final void rule__SELECTOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1263:1: ( rule__SELECTOR__Group__4__Impl rule__SELECTOR__Group__5 )
            // InternalBrowserAutomation.g:1264:2: rule__SELECTOR__Group__4__Impl rule__SELECTOR__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalBrowserAutomation.g:1271:1: rule__SELECTOR__Group__4__Impl : ( '}' ) ;
    public final void rule__SELECTOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1275:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:1276:1: ( '}' )
            {
            // InternalBrowserAutomation.g:1276:1: ( '}' )
            // InternalBrowserAutomation.g:1277:2: '}'
            {
             before(grammarAccess.getSELECTORAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1286:1: rule__SELECTOR__Group__5 : rule__SELECTOR__Group__5__Impl rule__SELECTOR__Group__6 ;
    public final void rule__SELECTOR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1290:1: ( rule__SELECTOR__Group__5__Impl rule__SELECTOR__Group__6 )
            // InternalBrowserAutomation.g:1291:2: rule__SELECTOR__Group__5__Impl rule__SELECTOR__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserAutomation.g:1298:1: rule__SELECTOR__Group__5__Impl : ( '[' ) ;
    public final void rule__SELECTOR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1302:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:1303:1: ( '[' )
            {
            // InternalBrowserAutomation.g:1303:1: ( '[' )
            // InternalBrowserAutomation.g:1304:2: '['
            {
             before(grammarAccess.getSELECTORAccess().getLeftSquareBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1313:1: rule__SELECTOR__Group__6 : rule__SELECTOR__Group__6__Impl rule__SELECTOR__Group__7 ;
    public final void rule__SELECTOR__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1317:1: ( rule__SELECTOR__Group__6__Impl rule__SELECTOR__Group__7 )
            // InternalBrowserAutomation.g:1318:2: rule__SELECTOR__Group__6__Impl rule__SELECTOR__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalBrowserAutomation.g:1325:1: rule__SELECTOR__Group__6__Impl : ( ( rule__SELECTOR__NumberAssignment_6 ) ) ;
    public final void rule__SELECTOR__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1329:1: ( ( ( rule__SELECTOR__NumberAssignment_6 ) ) )
            // InternalBrowserAutomation.g:1330:1: ( ( rule__SELECTOR__NumberAssignment_6 ) )
            {
            // InternalBrowserAutomation.g:1330:1: ( ( rule__SELECTOR__NumberAssignment_6 ) )
            // InternalBrowserAutomation.g:1331:2: ( rule__SELECTOR__NumberAssignment_6 )
            {
             before(grammarAccess.getSELECTORAccess().getNumberAssignment_6()); 
            // InternalBrowserAutomation.g:1332:2: ( rule__SELECTOR__NumberAssignment_6 )
            // InternalBrowserAutomation.g:1332:3: rule__SELECTOR__NumberAssignment_6
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
    // InternalBrowserAutomation.g:1340:1: rule__SELECTOR__Group__7 : rule__SELECTOR__Group__7__Impl ;
    public final void rule__SELECTOR__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1344:1: ( rule__SELECTOR__Group__7__Impl )
            // InternalBrowserAutomation.g:1345:2: rule__SELECTOR__Group__7__Impl
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
    // InternalBrowserAutomation.g:1351:1: rule__SELECTOR__Group__7__Impl : ( ']' ) ;
    public final void rule__SELECTOR__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1355:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:1356:1: ( ']' )
            {
            // InternalBrowserAutomation.g:1356:1: ( ']' )
            // InternalBrowserAutomation.g:1357:2: ']'
            {
             before(grammarAccess.getSELECTORAccess().getRightSquareBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1367:1: rule__OPEN_BROWSER__Group__0 : rule__OPEN_BROWSER__Group__0__Impl rule__OPEN_BROWSER__Group__1 ;
    public final void rule__OPEN_BROWSER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1371:1: ( rule__OPEN_BROWSER__Group__0__Impl rule__OPEN_BROWSER__Group__1 )
            // InternalBrowserAutomation.g:1372:2: rule__OPEN_BROWSER__Group__0__Impl rule__OPEN_BROWSER__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:1379:1: rule__OPEN_BROWSER__Group__0__Impl : ( () ) ;
    public final void rule__OPEN_BROWSER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1383:1: ( ( () ) )
            // InternalBrowserAutomation.g:1384:1: ( () )
            {
            // InternalBrowserAutomation.g:1384:1: ( () )
            // InternalBrowserAutomation.g:1385:2: ()
            {
             before(grammarAccess.getOPEN_BROWSERAccess().getOPEN_BROWSERAction_0()); 
            // InternalBrowserAutomation.g:1386:2: ()
            // InternalBrowserAutomation.g:1386:3: 
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
    // InternalBrowserAutomation.g:1394:1: rule__OPEN_BROWSER__Group__1 : rule__OPEN_BROWSER__Group__1__Impl ;
    public final void rule__OPEN_BROWSER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1398:1: ( rule__OPEN_BROWSER__Group__1__Impl )
            // InternalBrowserAutomation.g:1399:2: rule__OPEN_BROWSER__Group__1__Impl
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
    // InternalBrowserAutomation.g:1405:1: rule__OPEN_BROWSER__Group__1__Impl : ( 'openBrowser' ) ;
    public final void rule__OPEN_BROWSER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1409:1: ( ( 'openBrowser' ) )
            // InternalBrowserAutomation.g:1410:1: ( 'openBrowser' )
            {
            // InternalBrowserAutomation.g:1410:1: ( 'openBrowser' )
            // InternalBrowserAutomation.g:1411:2: 'openBrowser'
            {
             before(grammarAccess.getOPEN_BROWSERAccess().getOpenBrowserKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1421:1: rule__GO_TO_URL__Group__0 : rule__GO_TO_URL__Group__0__Impl rule__GO_TO_URL__Group__1 ;
    public final void rule__GO_TO_URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1425:1: ( rule__GO_TO_URL__Group__0__Impl rule__GO_TO_URL__Group__1 )
            // InternalBrowserAutomation.g:1426:2: rule__GO_TO_URL__Group__0__Impl rule__GO_TO_URL__Group__1
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
    // InternalBrowserAutomation.g:1433:1: rule__GO_TO_URL__Group__0__Impl : ( 'openpage' ) ;
    public final void rule__GO_TO_URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1437:1: ( ( 'openpage' ) )
            // InternalBrowserAutomation.g:1438:1: ( 'openpage' )
            {
            // InternalBrowserAutomation.g:1438:1: ( 'openpage' )
            // InternalBrowserAutomation.g:1439:2: 'openpage'
            {
             before(grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1448:1: rule__GO_TO_URL__Group__1 : rule__GO_TO_URL__Group__1__Impl ;
    public final void rule__GO_TO_URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1452:1: ( rule__GO_TO_URL__Group__1__Impl )
            // InternalBrowserAutomation.g:1453:2: rule__GO_TO_URL__Group__1__Impl
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
    // InternalBrowserAutomation.g:1459:1: rule__GO_TO_URL__Group__1__Impl : ( ( rule__GO_TO_URL__UrlAssignment_1 ) ) ;
    public final void rule__GO_TO_URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1463:1: ( ( ( rule__GO_TO_URL__UrlAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1464:1: ( ( rule__GO_TO_URL__UrlAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1464:1: ( ( rule__GO_TO_URL__UrlAssignment_1 ) )
            // InternalBrowserAutomation.g:1465:2: ( rule__GO_TO_URL__UrlAssignment_1 )
            {
             before(grammarAccess.getGO_TO_URLAccess().getUrlAssignment_1()); 
            // InternalBrowserAutomation.g:1466:2: ( rule__GO_TO_URL__UrlAssignment_1 )
            // InternalBrowserAutomation.g:1466:3: rule__GO_TO_URL__UrlAssignment_1
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
    // InternalBrowserAutomation.g:1475:1: rule__CLICK_ON__Group__0 : rule__CLICK_ON__Group__0__Impl rule__CLICK_ON__Group__1 ;
    public final void rule__CLICK_ON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1479:1: ( rule__CLICK_ON__Group__0__Impl rule__CLICK_ON__Group__1 )
            // InternalBrowserAutomation.g:1480:2: rule__CLICK_ON__Group__0__Impl rule__CLICK_ON__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1487:1: rule__CLICK_ON__Group__0__Impl : ( 'clickOn' ) ;
    public final void rule__CLICK_ON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1491:1: ( ( 'clickOn' ) )
            // InternalBrowserAutomation.g:1492:1: ( 'clickOn' )
            {
            // InternalBrowserAutomation.g:1492:1: ( 'clickOn' )
            // InternalBrowserAutomation.g:1493:2: 'clickOn'
            {
             before(grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1502:1: rule__CLICK_ON__Group__1 : rule__CLICK_ON__Group__1__Impl ;
    public final void rule__CLICK_ON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1506:1: ( rule__CLICK_ON__Group__1__Impl )
            // InternalBrowserAutomation.g:1507:2: rule__CLICK_ON__Group__1__Impl
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
    // InternalBrowserAutomation.g:1513:1: rule__CLICK_ON__Group__1__Impl : ( ( rule__CLICK_ON__ElementAssignment_1 ) ) ;
    public final void rule__CLICK_ON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1517:1: ( ( ( rule__CLICK_ON__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1518:1: ( ( rule__CLICK_ON__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1518:1: ( ( rule__CLICK_ON__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1519:2: ( rule__CLICK_ON__ElementAssignment_1 )
            {
             before(grammarAccess.getCLICK_ONAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1520:2: ( rule__CLICK_ON__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1520:3: rule__CLICK_ON__ElementAssignment_1
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
    // InternalBrowserAutomation.g:1529:1: rule__VERIFY_THAT__Group__0 : rule__VERIFY_THAT__Group__0__Impl rule__VERIFY_THAT__Group__1 ;
    public final void rule__VERIFY_THAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1533:1: ( rule__VERIFY_THAT__Group__0__Impl rule__VERIFY_THAT__Group__1 )
            // InternalBrowserAutomation.g:1534:2: rule__VERIFY_THAT__Group__0__Impl rule__VERIFY_THAT__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1541:1: rule__VERIFY_THAT__Group__0__Impl : ( 'verify' ) ;
    public final void rule__VERIFY_THAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1545:1: ( ( 'verify' ) )
            // InternalBrowserAutomation.g:1546:1: ( 'verify' )
            {
            // InternalBrowserAutomation.g:1546:1: ( 'verify' )
            // InternalBrowserAutomation.g:1547:2: 'verify'
            {
             before(grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1556:1: rule__VERIFY_THAT__Group__1 : rule__VERIFY_THAT__Group__1__Impl ;
    public final void rule__VERIFY_THAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1560:1: ( rule__VERIFY_THAT__Group__1__Impl )
            // InternalBrowserAutomation.g:1561:2: rule__VERIFY_THAT__Group__1__Impl
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
    // InternalBrowserAutomation.g:1567:1: rule__VERIFY_THAT__Group__1__Impl : ( ( rule__VERIFY_THAT__ElementAssignment_1 ) ) ;
    public final void rule__VERIFY_THAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1571:1: ( ( ( rule__VERIFY_THAT__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1572:1: ( ( rule__VERIFY_THAT__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1572:1: ( ( rule__VERIFY_THAT__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1573:2: ( rule__VERIFY_THAT__ElementAssignment_1 )
            {
             before(grammarAccess.getVERIFY_THATAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1574:2: ( rule__VERIFY_THAT__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1574:3: rule__VERIFY_THAT__ElementAssignment_1
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
    // InternalBrowserAutomation.g:1583:1: rule__INSERT_ON__Group__0 : rule__INSERT_ON__Group__0__Impl rule__INSERT_ON__Group__1 ;
    public final void rule__INSERT_ON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1587:1: ( rule__INSERT_ON__Group__0__Impl rule__INSERT_ON__Group__1 )
            // InternalBrowserAutomation.g:1588:2: rule__INSERT_ON__Group__0__Impl rule__INSERT_ON__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1595:1: rule__INSERT_ON__Group__0__Impl : ( 'insert' ) ;
    public final void rule__INSERT_ON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1599:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1600:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1600:1: ( 'insert' )
            // InternalBrowserAutomation.g:1601:2: 'insert'
            {
             before(grammarAccess.getINSERT_ONAccess().getInsertKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1610:1: rule__INSERT_ON__Group__1 : rule__INSERT_ON__Group__1__Impl rule__INSERT_ON__Group__2 ;
    public final void rule__INSERT_ON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1614:1: ( rule__INSERT_ON__Group__1__Impl rule__INSERT_ON__Group__2 )
            // InternalBrowserAutomation.g:1615:2: rule__INSERT_ON__Group__1__Impl rule__INSERT_ON__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1622:1: rule__INSERT_ON__Group__1__Impl : ( ( rule__INSERT_ON__ElementAssignment_1 ) ) ;
    public final void rule__INSERT_ON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1626:1: ( ( ( rule__INSERT_ON__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1627:1: ( ( rule__INSERT_ON__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1627:1: ( ( rule__INSERT_ON__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1628:2: ( rule__INSERT_ON__ElementAssignment_1 )
            {
             before(grammarAccess.getINSERT_ONAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1629:2: ( rule__INSERT_ON__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1629:3: rule__INSERT_ON__ElementAssignment_1
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
    // InternalBrowserAutomation.g:1637:1: rule__INSERT_ON__Group__2 : rule__INSERT_ON__Group__2__Impl ;
    public final void rule__INSERT_ON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1641:1: ( rule__INSERT_ON__Group__2__Impl )
            // InternalBrowserAutomation.g:1642:2: rule__INSERT_ON__Group__2__Impl
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
    // InternalBrowserAutomation.g:1648:1: rule__INSERT_ON__Group__2__Impl : ( ( rule__INSERT_ON__DataAssignment_2 ) ) ;
    public final void rule__INSERT_ON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1652:1: ( ( ( rule__INSERT_ON__DataAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1653:1: ( ( rule__INSERT_ON__DataAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1653:1: ( ( rule__INSERT_ON__DataAssignment_2 ) )
            // InternalBrowserAutomation.g:1654:2: ( rule__INSERT_ON__DataAssignment_2 )
            {
             before(grammarAccess.getINSERT_ONAccess().getDataAssignment_2()); 
            // InternalBrowserAutomation.g:1655:2: ( rule__INSERT_ON__DataAssignment_2 )
            // InternalBrowserAutomation.g:1655:3: rule__INSERT_ON__DataAssignment_2
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
    // InternalBrowserAutomation.g:1664:1: rule__CHECK_BOXE__Group__0 : rule__CHECK_BOXE__Group__0__Impl rule__CHECK_BOXE__Group__1 ;
    public final void rule__CHECK_BOXE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1668:1: ( rule__CHECK_BOXE__Group__0__Impl rule__CHECK_BOXE__Group__1 )
            // InternalBrowserAutomation.g:1669:2: rule__CHECK_BOXE__Group__0__Impl rule__CHECK_BOXE__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBrowserAutomation.g:1676:1: rule__CHECK_BOXE__Group__0__Impl : ( ( rule__CHECK_BOXE__Alternatives_0 ) ) ;
    public final void rule__CHECK_BOXE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1680:1: ( ( ( rule__CHECK_BOXE__Alternatives_0 ) ) )
            // InternalBrowserAutomation.g:1681:1: ( ( rule__CHECK_BOXE__Alternatives_0 ) )
            {
            // InternalBrowserAutomation.g:1681:1: ( ( rule__CHECK_BOXE__Alternatives_0 ) )
            // InternalBrowserAutomation.g:1682:2: ( rule__CHECK_BOXE__Alternatives_0 )
            {
             before(grammarAccess.getCHECK_BOXEAccess().getAlternatives_0()); 
            // InternalBrowserAutomation.g:1683:2: ( rule__CHECK_BOXE__Alternatives_0 )
            // InternalBrowserAutomation.g:1683:3: rule__CHECK_BOXE__Alternatives_0
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
    // InternalBrowserAutomation.g:1691:1: rule__CHECK_BOXE__Group__1 : rule__CHECK_BOXE__Group__1__Impl ;
    public final void rule__CHECK_BOXE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1695:1: ( rule__CHECK_BOXE__Group__1__Impl )
            // InternalBrowserAutomation.g:1696:2: rule__CHECK_BOXE__Group__1__Impl
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
    // InternalBrowserAutomation.g:1702:1: rule__CHECK_BOXE__Group__1__Impl : ( ( rule__CHECK_BOXE__Alternatives_1 ) ) ;
    public final void rule__CHECK_BOXE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1706:1: ( ( ( rule__CHECK_BOXE__Alternatives_1 ) ) )
            // InternalBrowserAutomation.g:1707:1: ( ( rule__CHECK_BOXE__Alternatives_1 ) )
            {
            // InternalBrowserAutomation.g:1707:1: ( ( rule__CHECK_BOXE__Alternatives_1 ) )
            // InternalBrowserAutomation.g:1708:2: ( rule__CHECK_BOXE__Alternatives_1 )
            {
             before(grammarAccess.getCHECK_BOXEAccess().getAlternatives_1()); 
            // InternalBrowserAutomation.g:1709:2: ( rule__CHECK_BOXE__Alternatives_1 )
            // InternalBrowserAutomation.g:1709:3: rule__CHECK_BOXE__Alternatives_1
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
    // InternalBrowserAutomation.g:1718:1: rule__CHOOSE_COMBOBOX__Group__0 : rule__CHOOSE_COMBOBOX__Group__0__Impl rule__CHOOSE_COMBOBOX__Group__1 ;
    public final void rule__CHOOSE_COMBOBOX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1722:1: ( rule__CHOOSE_COMBOBOX__Group__0__Impl rule__CHOOSE_COMBOBOX__Group__1 )
            // InternalBrowserAutomation.g:1723:2: rule__CHOOSE_COMBOBOX__Group__0__Impl rule__CHOOSE_COMBOBOX__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBrowserAutomation.g:1730:1: rule__CHOOSE_COMBOBOX__Group__0__Impl : ( 'choosecombo' ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1734:1: ( ( 'choosecombo' ) )
            // InternalBrowserAutomation.g:1735:1: ( 'choosecombo' )
            {
            // InternalBrowserAutomation.g:1735:1: ( 'choosecombo' )
            // InternalBrowserAutomation.g:1736:2: 'choosecombo'
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1745:1: rule__CHOOSE_COMBOBOX__Group__1 : rule__CHOOSE_COMBOBOX__Group__1__Impl rule__CHOOSE_COMBOBOX__Group__2 ;
    public final void rule__CHOOSE_COMBOBOX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1749:1: ( rule__CHOOSE_COMBOBOX__Group__1__Impl rule__CHOOSE_COMBOBOX__Group__2 )
            // InternalBrowserAutomation.g:1750:2: rule__CHOOSE_COMBOBOX__Group__1__Impl rule__CHOOSE_COMBOBOX__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBrowserAutomation.g:1757:1: rule__CHOOSE_COMBOBOX__Group__1__Impl : ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1761:1: ( ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1762:1: ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1762:1: ( ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1763:2: ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 )
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1764:2: ( rule__CHOOSE_COMBOBOX__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1764:3: rule__CHOOSE_COMBOBOX__ElementAssignment_1
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
    // InternalBrowserAutomation.g:1772:1: rule__CHOOSE_COMBOBOX__Group__2 : rule__CHOOSE_COMBOBOX__Group__2__Impl rule__CHOOSE_COMBOBOX__Group__3 ;
    public final void rule__CHOOSE_COMBOBOX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1776:1: ( rule__CHOOSE_COMBOBOX__Group__2__Impl rule__CHOOSE_COMBOBOX__Group__3 )
            // InternalBrowserAutomation.g:1777:2: rule__CHOOSE_COMBOBOX__Group__2__Impl rule__CHOOSE_COMBOBOX__Group__3
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
    // InternalBrowserAutomation.g:1784:1: rule__CHOOSE_COMBOBOX__Group__2__Impl : ( '{' ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1788:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:1789:1: ( '{' )
            {
            // InternalBrowserAutomation.g:1789:1: ( '{' )
            // InternalBrowserAutomation.g:1790:2: '{'
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1799:1: rule__CHOOSE_COMBOBOX__Group__3 : rule__CHOOSE_COMBOBOX__Group__3__Impl rule__CHOOSE_COMBOBOX__Group__4 ;
    public final void rule__CHOOSE_COMBOBOX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1803:1: ( rule__CHOOSE_COMBOBOX__Group__3__Impl rule__CHOOSE_COMBOBOX__Group__4 )
            // InternalBrowserAutomation.g:1804:2: rule__CHOOSE_COMBOBOX__Group__3__Impl rule__CHOOSE_COMBOBOX__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalBrowserAutomation.g:1811:1: rule__CHOOSE_COMBOBOX__Group__3__Impl : ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1815:1: ( ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1816:1: ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1816:1: ( ( rule__CHOOSE_COMBOBOX__DataAssignment_3 ) )
            // InternalBrowserAutomation.g:1817:2: ( rule__CHOOSE_COMBOBOX__DataAssignment_3 )
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getDataAssignment_3()); 
            // InternalBrowserAutomation.g:1818:2: ( rule__CHOOSE_COMBOBOX__DataAssignment_3 )
            // InternalBrowserAutomation.g:1818:3: rule__CHOOSE_COMBOBOX__DataAssignment_3
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
    // InternalBrowserAutomation.g:1826:1: rule__CHOOSE_COMBOBOX__Group__4 : rule__CHOOSE_COMBOBOX__Group__4__Impl ;
    public final void rule__CHOOSE_COMBOBOX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1830:1: ( rule__CHOOSE_COMBOBOX__Group__4__Impl )
            // InternalBrowserAutomation.g:1831:2: rule__CHOOSE_COMBOBOX__Group__4__Impl
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
    // InternalBrowserAutomation.g:1837:1: rule__CHOOSE_COMBOBOX__Group__4__Impl : ( '}' ) ;
    public final void rule__CHOOSE_COMBOBOX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1841:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:1842:1: ( '}' )
            {
            // InternalBrowserAutomation.g:1842:1: ( '}' )
            // InternalBrowserAutomation.g:1843:2: '}'
            {
             before(grammarAccess.getCHOOSE_COMBOBOXAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1853:1: rule__READ_ON__Group__0 : rule__READ_ON__Group__0__Impl rule__READ_ON__Group__1 ;
    public final void rule__READ_ON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1857:1: ( rule__READ_ON__Group__0__Impl rule__READ_ON__Group__1 )
            // InternalBrowserAutomation.g:1858:2: rule__READ_ON__Group__0__Impl rule__READ_ON__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBrowserAutomation.g:1865:1: rule__READ_ON__Group__0__Impl : ( 'read' ) ;
    public final void rule__READ_ON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1869:1: ( ( 'read' ) )
            // InternalBrowserAutomation.g:1870:1: ( 'read' )
            {
            // InternalBrowserAutomation.g:1870:1: ( 'read' )
            // InternalBrowserAutomation.g:1871:2: 'read'
            {
             before(grammarAccess.getREAD_ONAccess().getReadKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1880:1: rule__READ_ON__Group__1 : rule__READ_ON__Group__1__Impl ;
    public final void rule__READ_ON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1884:1: ( rule__READ_ON__Group__1__Impl )
            // InternalBrowserAutomation.g:1885:2: rule__READ_ON__Group__1__Impl
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
    // InternalBrowserAutomation.g:1891:1: rule__READ_ON__Group__1__Impl : ( ( rule__READ_ON__ElementAssignment_1 ) ) ;
    public final void rule__READ_ON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1895:1: ( ( ( rule__READ_ON__ElementAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1896:1: ( ( rule__READ_ON__ElementAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1896:1: ( ( rule__READ_ON__ElementAssignment_1 ) )
            // InternalBrowserAutomation.g:1897:2: ( rule__READ_ON__ElementAssignment_1 )
            {
             before(grammarAccess.getREAD_ONAccess().getElementAssignment_1()); 
            // InternalBrowserAutomation.g:1898:2: ( rule__READ_ON__ElementAssignment_1 )
            // InternalBrowserAutomation.g:1898:3: rule__READ_ON__ElementAssignment_1
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
    // InternalBrowserAutomation.g:1907:1: rule__COMBOBOX__Group__0 : rule__COMBOBOX__Group__0__Impl rule__COMBOBOX__Group__1 ;
    public final void rule__COMBOBOX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1911:1: ( rule__COMBOBOX__Group__0__Impl rule__COMBOBOX__Group__1 )
            // InternalBrowserAutomation.g:1912:2: rule__COMBOBOX__Group__0__Impl rule__COMBOBOX__Group__1
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
    // InternalBrowserAutomation.g:1919:1: rule__COMBOBOX__Group__0__Impl : ( 'combobox' ) ;
    public final void rule__COMBOBOX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1923:1: ( ( 'combobox' ) )
            // InternalBrowserAutomation.g:1924:1: ( 'combobox' )
            {
            // InternalBrowserAutomation.g:1924:1: ( 'combobox' )
            // InternalBrowserAutomation.g:1925:2: 'combobox'
            {
             before(grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1934:1: rule__COMBOBOX__Group__1 : rule__COMBOBOX__Group__1__Impl ;
    public final void rule__COMBOBOX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1938:1: ( rule__COMBOBOX__Group__1__Impl )
            // InternalBrowserAutomation.g:1939:2: rule__COMBOBOX__Group__1__Impl
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
    // InternalBrowserAutomation.g:1945:1: rule__COMBOBOX__Group__1__Impl : ( ( rule__COMBOBOX__NameAssignment_1 ) ) ;
    public final void rule__COMBOBOX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1949:1: ( ( ( rule__COMBOBOX__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1950:1: ( ( rule__COMBOBOX__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1950:1: ( ( rule__COMBOBOX__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:1951:2: ( rule__COMBOBOX__NameAssignment_1 )
            {
             before(grammarAccess.getCOMBOBOXAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:1952:2: ( rule__COMBOBOX__NameAssignment_1 )
            // InternalBrowserAutomation.g:1952:3: rule__COMBOBOX__NameAssignment_1
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
    // InternalBrowserAutomation.g:1961:1: rule__CHECKBOX__Group__0 : rule__CHECKBOX__Group__0__Impl rule__CHECKBOX__Group__1 ;
    public final void rule__CHECKBOX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1965:1: ( rule__CHECKBOX__Group__0__Impl rule__CHECKBOX__Group__1 )
            // InternalBrowserAutomation.g:1966:2: rule__CHECKBOX__Group__0__Impl rule__CHECKBOX__Group__1
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
    // InternalBrowserAutomation.g:1973:1: rule__CHECKBOX__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__CHECKBOX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1977:1: ( ( 'checkbox' ) )
            // InternalBrowserAutomation.g:1978:1: ( 'checkbox' )
            {
            // InternalBrowserAutomation.g:1978:1: ( 'checkbox' )
            // InternalBrowserAutomation.g:1979:2: 'checkbox'
            {
             before(grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1988:1: rule__CHECKBOX__Group__1 : rule__CHECKBOX__Group__1__Impl ;
    public final void rule__CHECKBOX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1992:1: ( rule__CHECKBOX__Group__1__Impl )
            // InternalBrowserAutomation.g:1993:2: rule__CHECKBOX__Group__1__Impl
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
    // InternalBrowserAutomation.g:1999:1: rule__CHECKBOX__Group__1__Impl : ( ( rule__CHECKBOX__NameAssignment_1 ) ) ;
    public final void rule__CHECKBOX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2003:1: ( ( ( rule__CHECKBOX__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2004:1: ( ( rule__CHECKBOX__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2004:1: ( ( rule__CHECKBOX__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2005:2: ( rule__CHECKBOX__NameAssignment_1 )
            {
             before(grammarAccess.getCHECKBOXAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2006:2: ( rule__CHECKBOX__NameAssignment_1 )
            // InternalBrowserAutomation.g:2006:3: rule__CHECKBOX__NameAssignment_1
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
    // InternalBrowserAutomation.g:2015:1: rule__SEARCH_FIELD__Group__0 : rule__SEARCH_FIELD__Group__0__Impl rule__SEARCH_FIELD__Group__1 ;
    public final void rule__SEARCH_FIELD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2019:1: ( rule__SEARCH_FIELD__Group__0__Impl rule__SEARCH_FIELD__Group__1 )
            // InternalBrowserAutomation.g:2020:2: rule__SEARCH_FIELD__Group__0__Impl rule__SEARCH_FIELD__Group__1
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
    // InternalBrowserAutomation.g:2027:1: rule__SEARCH_FIELD__Group__0__Impl : ( 'searchfield' ) ;
    public final void rule__SEARCH_FIELD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2031:1: ( ( 'searchfield' ) )
            // InternalBrowserAutomation.g:2032:1: ( 'searchfield' )
            {
            // InternalBrowserAutomation.g:2032:1: ( 'searchfield' )
            // InternalBrowserAutomation.g:2033:2: 'searchfield'
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2042:1: rule__SEARCH_FIELD__Group__1 : rule__SEARCH_FIELD__Group__1__Impl ;
    public final void rule__SEARCH_FIELD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2046:1: ( rule__SEARCH_FIELD__Group__1__Impl )
            // InternalBrowserAutomation.g:2047:2: rule__SEARCH_FIELD__Group__1__Impl
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
    // InternalBrowserAutomation.g:2053:1: rule__SEARCH_FIELD__Group__1__Impl : ( ( rule__SEARCH_FIELD__NameAssignment_1 ) ) ;
    public final void rule__SEARCH_FIELD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2057:1: ( ( ( rule__SEARCH_FIELD__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2058:1: ( ( rule__SEARCH_FIELD__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2058:1: ( ( rule__SEARCH_FIELD__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2059:2: ( rule__SEARCH_FIELD__NameAssignment_1 )
            {
             before(grammarAccess.getSEARCH_FIELDAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2060:2: ( rule__SEARCH_FIELD__NameAssignment_1 )
            // InternalBrowserAutomation.g:2060:3: rule__SEARCH_FIELD__NameAssignment_1
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
    // InternalBrowserAutomation.g:2069:1: rule__TEXT__Group__0 : rule__TEXT__Group__0__Impl rule__TEXT__Group__1 ;
    public final void rule__TEXT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2073:1: ( rule__TEXT__Group__0__Impl rule__TEXT__Group__1 )
            // InternalBrowserAutomation.g:2074:2: rule__TEXT__Group__0__Impl rule__TEXT__Group__1
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
    // InternalBrowserAutomation.g:2081:1: rule__TEXT__Group__0__Impl : ( 'text' ) ;
    public final void rule__TEXT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2085:1: ( ( 'text' ) )
            // InternalBrowserAutomation.g:2086:1: ( 'text' )
            {
            // InternalBrowserAutomation.g:2086:1: ( 'text' )
            // InternalBrowserAutomation.g:2087:2: 'text'
            {
             before(grammarAccess.getTEXTAccess().getTextKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2096:1: rule__TEXT__Group__1 : rule__TEXT__Group__1__Impl ;
    public final void rule__TEXT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2100:1: ( rule__TEXT__Group__1__Impl )
            // InternalBrowserAutomation.g:2101:2: rule__TEXT__Group__1__Impl
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
    // InternalBrowserAutomation.g:2107:1: rule__TEXT__Group__1__Impl : ( ( rule__TEXT__NameAssignment_1 ) ) ;
    public final void rule__TEXT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2111:1: ( ( ( rule__TEXT__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2112:1: ( ( rule__TEXT__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2112:1: ( ( rule__TEXT__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2113:2: ( rule__TEXT__NameAssignment_1 )
            {
             before(grammarAccess.getTEXTAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2114:2: ( rule__TEXT__NameAssignment_1 )
            // InternalBrowserAutomation.g:2114:3: rule__TEXT__NameAssignment_1
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
    // InternalBrowserAutomation.g:2123:1: rule__BUTTON__Group__0 : rule__BUTTON__Group__0__Impl rule__BUTTON__Group__1 ;
    public final void rule__BUTTON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2127:1: ( rule__BUTTON__Group__0__Impl rule__BUTTON__Group__1 )
            // InternalBrowserAutomation.g:2128:2: rule__BUTTON__Group__0__Impl rule__BUTTON__Group__1
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
    // InternalBrowserAutomation.g:2135:1: rule__BUTTON__Group__0__Impl : ( 'button' ) ;
    public final void rule__BUTTON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2139:1: ( ( 'button' ) )
            // InternalBrowserAutomation.g:2140:1: ( 'button' )
            {
            // InternalBrowserAutomation.g:2140:1: ( 'button' )
            // InternalBrowserAutomation.g:2141:2: 'button'
            {
             before(grammarAccess.getBUTTONAccess().getButtonKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2150:1: rule__BUTTON__Group__1 : rule__BUTTON__Group__1__Impl ;
    public final void rule__BUTTON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2154:1: ( rule__BUTTON__Group__1__Impl )
            // InternalBrowserAutomation.g:2155:2: rule__BUTTON__Group__1__Impl
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
    // InternalBrowserAutomation.g:2161:1: rule__BUTTON__Group__1__Impl : ( ( rule__BUTTON__NameAssignment_1 ) ) ;
    public final void rule__BUTTON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2165:1: ( ( ( rule__BUTTON__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2166:1: ( ( rule__BUTTON__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2166:1: ( ( rule__BUTTON__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2167:2: ( rule__BUTTON__NameAssignment_1 )
            {
             before(grammarAccess.getBUTTONAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2168:2: ( rule__BUTTON__NameAssignment_1 )
            // InternalBrowserAutomation.g:2168:3: rule__BUTTON__NameAssignment_1
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
    // InternalBrowserAutomation.g:2177:1: rule__LINK__Group__0 : rule__LINK__Group__0__Impl rule__LINK__Group__1 ;
    public final void rule__LINK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2181:1: ( rule__LINK__Group__0__Impl rule__LINK__Group__1 )
            // InternalBrowserAutomation.g:2182:2: rule__LINK__Group__0__Impl rule__LINK__Group__1
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
    // InternalBrowserAutomation.g:2189:1: rule__LINK__Group__0__Impl : ( 'link' ) ;
    public final void rule__LINK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2193:1: ( ( 'link' ) )
            // InternalBrowserAutomation.g:2194:1: ( 'link' )
            {
            // InternalBrowserAutomation.g:2194:1: ( 'link' )
            // InternalBrowserAutomation.g:2195:2: 'link'
            {
             before(grammarAccess.getLINKAccess().getLinkKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2204:1: rule__LINK__Group__1 : rule__LINK__Group__1__Impl ;
    public final void rule__LINK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2208:1: ( rule__LINK__Group__1__Impl )
            // InternalBrowserAutomation.g:2209:2: rule__LINK__Group__1__Impl
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
    // InternalBrowserAutomation.g:2215:1: rule__LINK__Group__1__Impl : ( ( rule__LINK__UrlAssignment_1 ) ) ;
    public final void rule__LINK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2219:1: ( ( ( rule__LINK__UrlAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2220:1: ( ( rule__LINK__UrlAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2220:1: ( ( rule__LINK__UrlAssignment_1 ) )
            // InternalBrowserAutomation.g:2221:2: ( rule__LINK__UrlAssignment_1 )
            {
             before(grammarAccess.getLINKAccess().getUrlAssignment_1()); 
            // InternalBrowserAutomation.g:2222:2: ( rule__LINK__UrlAssignment_1 )
            // InternalBrowserAutomation.g:2222:3: rule__LINK__UrlAssignment_1
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
    // InternalBrowserAutomation.g:2231:1: rule__IMAGE__Group__0 : rule__IMAGE__Group__0__Impl rule__IMAGE__Group__1 ;
    public final void rule__IMAGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2235:1: ( rule__IMAGE__Group__0__Impl rule__IMAGE__Group__1 )
            // InternalBrowserAutomation.g:2236:2: rule__IMAGE__Group__0__Impl rule__IMAGE__Group__1
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
    // InternalBrowserAutomation.g:2243:1: rule__IMAGE__Group__0__Impl : ( 'image' ) ;
    public final void rule__IMAGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2247:1: ( ( 'image' ) )
            // InternalBrowserAutomation.g:2248:1: ( 'image' )
            {
            // InternalBrowserAutomation.g:2248:1: ( 'image' )
            // InternalBrowserAutomation.g:2249:2: 'image'
            {
             before(grammarAccess.getIMAGEAccess().getImageKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2258:1: rule__IMAGE__Group__1 : rule__IMAGE__Group__1__Impl rule__IMAGE__Group__2 ;
    public final void rule__IMAGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2262:1: ( rule__IMAGE__Group__1__Impl rule__IMAGE__Group__2 )
            // InternalBrowserAutomation.g:2263:2: rule__IMAGE__Group__1__Impl rule__IMAGE__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBrowserAutomation.g:2270:1: rule__IMAGE__Group__1__Impl : ( ( rule__IMAGE__NameAssignment_1 ) ) ;
    public final void rule__IMAGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2274:1: ( ( ( rule__IMAGE__NameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2275:1: ( ( rule__IMAGE__NameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2275:1: ( ( rule__IMAGE__NameAssignment_1 ) )
            // InternalBrowserAutomation.g:2276:2: ( rule__IMAGE__NameAssignment_1 )
            {
             before(grammarAccess.getIMAGEAccess().getNameAssignment_1()); 
            // InternalBrowserAutomation.g:2277:2: ( rule__IMAGE__NameAssignment_1 )
            // InternalBrowserAutomation.g:2277:3: rule__IMAGE__NameAssignment_1
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
    // InternalBrowserAutomation.g:2285:1: rule__IMAGE__Group__2 : rule__IMAGE__Group__2__Impl ;
    public final void rule__IMAGE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2289:1: ( rule__IMAGE__Group__2__Impl )
            // InternalBrowserAutomation.g:2290:2: rule__IMAGE__Group__2__Impl
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
    // InternalBrowserAutomation.g:2296:1: rule__IMAGE__Group__2__Impl : ( ( rule__IMAGE__Group_2__0 )* ) ;
    public final void rule__IMAGE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2300:1: ( ( ( rule__IMAGE__Group_2__0 )* ) )
            // InternalBrowserAutomation.g:2301:1: ( ( rule__IMAGE__Group_2__0 )* )
            {
            // InternalBrowserAutomation.g:2301:1: ( ( rule__IMAGE__Group_2__0 )* )
            // InternalBrowserAutomation.g:2302:2: ( rule__IMAGE__Group_2__0 )*
            {
             before(grammarAccess.getIMAGEAccess().getGroup_2()); 
            // InternalBrowserAutomation.g:2303:2: ( rule__IMAGE__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBrowserAutomation.g:2303:3: rule__IMAGE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__IMAGE__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBrowserAutomation.g:2312:1: rule__IMAGE__Group_2__0 : rule__IMAGE__Group_2__0__Impl rule__IMAGE__Group_2__1 ;
    public final void rule__IMAGE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2316:1: ( rule__IMAGE__Group_2__0__Impl rule__IMAGE__Group_2__1 )
            // InternalBrowserAutomation.g:2317:2: rule__IMAGE__Group_2__0__Impl rule__IMAGE__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBrowserAutomation.g:2324:1: rule__IMAGE__Group_2__0__Impl : ( '{' ) ;
    public final void rule__IMAGE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2328:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:2329:1: ( '{' )
            {
            // InternalBrowserAutomation.g:2329:1: ( '{' )
            // InternalBrowserAutomation.g:2330:2: '{'
            {
             before(grammarAccess.getIMAGEAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2339:1: rule__IMAGE__Group_2__1 : rule__IMAGE__Group_2__1__Impl rule__IMAGE__Group_2__2 ;
    public final void rule__IMAGE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2343:1: ( rule__IMAGE__Group_2__1__Impl rule__IMAGE__Group_2__2 )
            // InternalBrowserAutomation.g:2344:2: rule__IMAGE__Group_2__1__Impl rule__IMAGE__Group_2__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBrowserAutomation.g:2351:1: rule__IMAGE__Group_2__1__Impl : ( ( rule__IMAGE__ParamsAssignment_2_1 )* ) ;
    public final void rule__IMAGE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2355:1: ( ( ( rule__IMAGE__ParamsAssignment_2_1 )* ) )
            // InternalBrowserAutomation.g:2356:1: ( ( rule__IMAGE__ParamsAssignment_2_1 )* )
            {
            // InternalBrowserAutomation.g:2356:1: ( ( rule__IMAGE__ParamsAssignment_2_1 )* )
            // InternalBrowserAutomation.g:2357:2: ( rule__IMAGE__ParamsAssignment_2_1 )*
            {
             before(grammarAccess.getIMAGEAccess().getParamsAssignment_2_1()); 
            // InternalBrowserAutomation.g:2358:2: ( rule__IMAGE__ParamsAssignment_2_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBrowserAutomation.g:2358:3: rule__IMAGE__ParamsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__IMAGE__ParamsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBrowserAutomation.g:2366:1: rule__IMAGE__Group_2__2 : rule__IMAGE__Group_2__2__Impl ;
    public final void rule__IMAGE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2370:1: ( rule__IMAGE__Group_2__2__Impl )
            // InternalBrowserAutomation.g:2371:2: rule__IMAGE__Group_2__2__Impl
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
    // InternalBrowserAutomation.g:2377:1: rule__IMAGE__Group_2__2__Impl : ( '}' ) ;
    public final void rule__IMAGE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2381:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:2382:1: ( '}' )
            {
            // InternalBrowserAutomation.g:2382:1: ( '}' )
            // InternalBrowserAutomation.g:2383:2: '}'
            {
             before(grammarAccess.getIMAGEAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2393:1: rule__PARAMS__Group__0 : rule__PARAMS__Group__0__Impl rule__PARAMS__Group__1 ;
    public final void rule__PARAMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2397:1: ( rule__PARAMS__Group__0__Impl rule__PARAMS__Group__1 )
            // InternalBrowserAutomation.g:2398:2: rule__PARAMS__Group__0__Impl rule__PARAMS__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBrowserAutomation.g:2405:1: rule__PARAMS__Group__0__Impl : ( ( rule__PARAMS__KeyAssignment_0 ) ) ;
    public final void rule__PARAMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2409:1: ( ( ( rule__PARAMS__KeyAssignment_0 ) ) )
            // InternalBrowserAutomation.g:2410:1: ( ( rule__PARAMS__KeyAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:2410:1: ( ( rule__PARAMS__KeyAssignment_0 ) )
            // InternalBrowserAutomation.g:2411:2: ( rule__PARAMS__KeyAssignment_0 )
            {
             before(grammarAccess.getPARAMSAccess().getKeyAssignment_0()); 
            // InternalBrowserAutomation.g:2412:2: ( rule__PARAMS__KeyAssignment_0 )
            // InternalBrowserAutomation.g:2412:3: rule__PARAMS__KeyAssignment_0
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
    // InternalBrowserAutomation.g:2420:1: rule__PARAMS__Group__1 : rule__PARAMS__Group__1__Impl rule__PARAMS__Group__2 ;
    public final void rule__PARAMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2424:1: ( rule__PARAMS__Group__1__Impl rule__PARAMS__Group__2 )
            // InternalBrowserAutomation.g:2425:2: rule__PARAMS__Group__1__Impl rule__PARAMS__Group__2
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
    // InternalBrowserAutomation.g:2432:1: rule__PARAMS__Group__1__Impl : ( '=' ) ;
    public final void rule__PARAMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2436:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:2437:1: ( '=' )
            {
            // InternalBrowserAutomation.g:2437:1: ( '=' )
            // InternalBrowserAutomation.g:2438:2: '='
            {
             before(grammarAccess.getPARAMSAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2447:1: rule__PARAMS__Group__2 : rule__PARAMS__Group__2__Impl ;
    public final void rule__PARAMS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2451:1: ( rule__PARAMS__Group__2__Impl )
            // InternalBrowserAutomation.g:2452:2: rule__PARAMS__Group__2__Impl
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
    // InternalBrowserAutomation.g:2458:1: rule__PARAMS__Group__2__Impl : ( ( rule__PARAMS__ValueAssignment_2 ) ) ;
    public final void rule__PARAMS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2462:1: ( ( ( rule__PARAMS__ValueAssignment_2 ) ) )
            // InternalBrowserAutomation.g:2463:1: ( ( rule__PARAMS__ValueAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:2463:1: ( ( rule__PARAMS__ValueAssignment_2 ) )
            // InternalBrowserAutomation.g:2464:2: ( rule__PARAMS__ValueAssignment_2 )
            {
             before(grammarAccess.getPARAMSAccess().getValueAssignment_2()); 
            // InternalBrowserAutomation.g:2465:2: ( rule__PARAMS__ValueAssignment_2 )
            // InternalBrowserAutomation.g:2465:3: rule__PARAMS__ValueAssignment_2
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
    // InternalBrowserAutomation.g:2474:1: rule__Test__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Test__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2478:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2479:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2479:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2480:3: RULE_STRING
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


    // $ANTLR start "rule__Test__InstructionsAssignment_3"
    // InternalBrowserAutomation.g:2489:1: rule__Test__InstructionsAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Test__InstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2493:1: ( ( ruleInstruction ) )
            // InternalBrowserAutomation.g:2494:2: ( ruleInstruction )
            {
            // InternalBrowserAutomation.g:2494:2: ( ruleInstruction )
            // InternalBrowserAutomation.g:2495:3: ruleInstruction
            {
             before(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Test__InstructionsAssignment_3"


    // $ANTLR start "rule__AFFECTATION__NameAssignment_1"
    // InternalBrowserAutomation.g:2504:1: rule__AFFECTATION__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AFFECTATION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2508:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2509:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2509:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2510:3: RULE_ID
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
    // InternalBrowserAutomation.g:2519:1: rule__AFFECTATION__SelectorAssignment_3 : ( ruleSELECTOR ) ;
    public final void rule__AFFECTATION__SelectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2523:1: ( ( ruleSELECTOR ) )
            // InternalBrowserAutomation.g:2524:2: ( ruleSELECTOR )
            {
            // InternalBrowserAutomation.g:2524:2: ( ruleSELECTOR )
            // InternalBrowserAutomation.g:2525:3: ruleSELECTOR
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


    // $ANTLR start "rule__SELECTOR__ReadableAssignment_1"
    // InternalBrowserAutomation.g:2534:1: rule__SELECTOR__ReadableAssignment_1 : ( ruleReadable ) ;
    public final void rule__SELECTOR__ReadableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2538:1: ( ( ruleReadable ) )
            // InternalBrowserAutomation.g:2539:2: ( ruleReadable )
            {
            // InternalBrowserAutomation.g:2539:2: ( ruleReadable )
            // InternalBrowserAutomation.g:2540:3: ruleReadable
            {
             before(grammarAccess.getSELECTORAccess().getReadableReadableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReadable();

            state._fsp--;

             after(grammarAccess.getSELECTORAccess().getReadableReadableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SELECTOR__ReadableAssignment_1"


    // $ANTLR start "rule__SELECTOR__ParamsAssignment_3"
    // InternalBrowserAutomation.g:2549:1: rule__SELECTOR__ParamsAssignment_3 : ( rulePARAMS ) ;
    public final void rule__SELECTOR__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2553:1: ( ( rulePARAMS ) )
            // InternalBrowserAutomation.g:2554:2: ( rulePARAMS )
            {
            // InternalBrowserAutomation.g:2554:2: ( rulePARAMS )
            // InternalBrowserAutomation.g:2555:3: rulePARAMS
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
    // InternalBrowserAutomation.g:2564:1: rule__SELECTOR__NumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__SELECTOR__NumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2568:1: ( ( RULE_INT ) )
            // InternalBrowserAutomation.g:2569:2: ( RULE_INT )
            {
            // InternalBrowserAutomation.g:2569:2: ( RULE_INT )
            // InternalBrowserAutomation.g:2570:3: RULE_INT
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
    // InternalBrowserAutomation.g:2579:1: rule__RefElement__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefElement__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2583:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:2584:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:2584:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2585:3: ( RULE_ID )
            {
             before(grammarAccess.getRefElementAccess().getRefAFFECTATIONCrossReference_0()); 
            // InternalBrowserAutomation.g:2586:3: ( RULE_ID )
            // InternalBrowserAutomation.g:2587:4: RULE_ID
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
    // InternalBrowserAutomation.g:2598:1: rule__GO_TO_URL__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GO_TO_URL__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2602:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2603:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2603:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2604:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2613:1: rule__CLICK_ON__ElementAssignment_1 : ( ruleClickable ) ;
    public final void rule__CLICK_ON__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2617:1: ( ( ruleClickable ) )
            // InternalBrowserAutomation.g:2618:2: ( ruleClickable )
            {
            // InternalBrowserAutomation.g:2618:2: ( ruleClickable )
            // InternalBrowserAutomation.g:2619:3: ruleClickable
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
    // InternalBrowserAutomation.g:2628:1: rule__VERIFY_THAT__ElementAssignment_1 : ( ruleVerifiable ) ;
    public final void rule__VERIFY_THAT__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2632:1: ( ( ruleVerifiable ) )
            // InternalBrowserAutomation.g:2633:2: ( ruleVerifiable )
            {
            // InternalBrowserAutomation.g:2633:2: ( ruleVerifiable )
            // InternalBrowserAutomation.g:2634:3: ruleVerifiable
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
    // InternalBrowserAutomation.g:2643:1: rule__INSERT_ON__ElementAssignment_1 : ( ruleInsertable ) ;
    public final void rule__INSERT_ON__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2647:1: ( ( ruleInsertable ) )
            // InternalBrowserAutomation.g:2648:2: ( ruleInsertable )
            {
            // InternalBrowserAutomation.g:2648:2: ( ruleInsertable )
            // InternalBrowserAutomation.g:2649:3: ruleInsertable
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
    // InternalBrowserAutomation.g:2658:1: rule__INSERT_ON__DataAssignment_2 : ( ( rule__INSERT_ON__DataAlternatives_2_0 ) ) ;
    public final void rule__INSERT_ON__DataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2662:1: ( ( ( rule__INSERT_ON__DataAlternatives_2_0 ) ) )
            // InternalBrowserAutomation.g:2663:2: ( ( rule__INSERT_ON__DataAlternatives_2_0 ) )
            {
            // InternalBrowserAutomation.g:2663:2: ( ( rule__INSERT_ON__DataAlternatives_2_0 ) )
            // InternalBrowserAutomation.g:2664:3: ( rule__INSERT_ON__DataAlternatives_2_0 )
            {
             before(grammarAccess.getINSERT_ONAccess().getDataAlternatives_2_0()); 
            // InternalBrowserAutomation.g:2665:3: ( rule__INSERT_ON__DataAlternatives_2_0 )
            // InternalBrowserAutomation.g:2665:4: rule__INSERT_ON__DataAlternatives_2_0
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
    // InternalBrowserAutomation.g:2673:1: rule__CHECK_BOXE__ElementAssignment_1_0 : ( ruleCHECKBOX ) ;
    public final void rule__CHECK_BOXE__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2677:1: ( ( ruleCHECKBOX ) )
            // InternalBrowserAutomation.g:2678:2: ( ruleCHECKBOX )
            {
            // InternalBrowserAutomation.g:2678:2: ( ruleCHECKBOX )
            // InternalBrowserAutomation.g:2679:3: ruleCHECKBOX
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
    // InternalBrowserAutomation.g:2688:1: rule__CHOOSE_COMBOBOX__ElementAssignment_1 : ( ruleCOMBOBOX ) ;
    public final void rule__CHOOSE_COMBOBOX__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2692:1: ( ( ruleCOMBOBOX ) )
            // InternalBrowserAutomation.g:2693:2: ( ruleCOMBOBOX )
            {
            // InternalBrowserAutomation.g:2693:2: ( ruleCOMBOBOX )
            // InternalBrowserAutomation.g:2694:3: ruleCOMBOBOX
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
    // InternalBrowserAutomation.g:2703:1: rule__CHOOSE_COMBOBOX__DataAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CHOOSE_COMBOBOX__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2707:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2708:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2708:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2709:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2718:1: rule__READ_ON__ElementAssignment_1 : ( ruleReadable ) ;
    public final void rule__READ_ON__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2722:1: ( ( ruleReadable ) )
            // InternalBrowserAutomation.g:2723:2: ( ruleReadable )
            {
            // InternalBrowserAutomation.g:2723:2: ( ruleReadable )
            // InternalBrowserAutomation.g:2724:3: ruleReadable
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
    // InternalBrowserAutomation.g:2733:1: rule__COMBOBOX__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__COMBOBOX__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2737:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2738:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2738:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2739:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2748:1: rule__CHECKBOX__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CHECKBOX__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2752:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2753:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2753:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2754:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2763:1: rule__SEARCH_FIELD__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SEARCH_FIELD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2767:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2768:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2768:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2769:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2778:1: rule__TEXT__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TEXT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2782:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2783:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2783:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2784:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2793:1: rule__BUTTON__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BUTTON__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2797:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2798:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2798:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2799:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2808:1: rule__LINK__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LINK__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2812:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2813:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2813:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2814:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2823:1: rule__IMAGE__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IMAGE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2827:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2828:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2828:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2829:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2838:1: rule__IMAGE__ParamsAssignment_2_1 : ( rulePARAMS ) ;
    public final void rule__IMAGE__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2842:1: ( ( rulePARAMS ) )
            // InternalBrowserAutomation.g:2843:2: ( rulePARAMS )
            {
            // InternalBrowserAutomation.g:2843:2: ( rulePARAMS )
            // InternalBrowserAutomation.g:2844:3: rulePARAMS
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
    // InternalBrowserAutomation.g:2853:1: rule__PARAMS__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__PARAMS__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2857:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2858:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2858:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2859:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2868:1: rule__PARAMS__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PARAMS__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2872:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2873:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2873:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2874:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000003F819800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003F811802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001E40000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});

}